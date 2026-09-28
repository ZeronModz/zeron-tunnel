package defpackage;

import android.database.sqlite.SQLiteDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class iq0 extends Migration {
    public static final iq0 c = new iq0(12, 13);

    @Override // androidx.room.migration.Migration
    public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase = frameworkSQLiteDatabase.a;
        sQLiteDatabase.execSQL("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        sQLiteDatabase.execSQL("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
