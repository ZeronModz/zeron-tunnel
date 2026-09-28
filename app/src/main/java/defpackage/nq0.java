package defpackage;

import android.database.sqlite.SQLiteDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class nq0 extends Migration {
    public static final nq0 c = new nq0(4, 5);

    @Override // androidx.room.migration.Migration
    public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase = frameworkSQLiteDatabase.a;
        sQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        sQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
