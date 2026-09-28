package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class pz2 extends zzby {
    public final /* synthetic */ a03 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz2(a03 a03Var, Context context) {
        super(context, "google_app_measurement_local.db", null, 1);
        this.a = a03Var;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            a03 a03Var = this.a;
            r rVar = a03Var.a;
            m mVar = rVar.f;
            r.h(mVar);
            mVar.f.a("Opening the local database failed, dropping and recreating it");
            if (!rVar.a.getDatabasePath("google_app_measurement_local.db").delete()) {
                m mVar2 = rVar.f;
                r.h(mVar2);
                mVar2.f.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                m mVar3 = a03Var.a.f;
                r.h(mVar3);
                mVar3.f.b(e2, "Failed to open local database. Events will bypass local storage");
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        m mVar = this.a.a.f;
        r.h(mVar);
        qj1.L(mVar, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        m mVar = this.a.a.f;
        r.h(mVar);
        qj1.G(mVar, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", a03.e);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
