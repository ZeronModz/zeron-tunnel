package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a03 extends hx2 {
    public static final String[] e = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    public final pz2 c;
    public boolean d;

    public a03(r rVar) {
        super(rVar);
        this.c = new pz2(this, this.a.a);
    }

    @Override // defpackage.hx2
    public final boolean d() {
        return false;
    }

    public final void e() {
        int iDelete;
        r rVar = this.a;
        a();
        try {
            SQLiteDatabase sQLiteDatabaseG = g();
            if (sQLiteDatabaseG == null || (iDelete = sQLiteDatabaseG.delete("messages", null, null)) <= 0) {
                return;
            }
            m mVar = rVar.f;
            r.h(mVar);
            mVar.n.b(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e2) {
            m mVar2 = rVar.f;
            r.h(mVar2);
            mVar2.f.b(e2, "Error resetting local analytics data. error");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[PHI: r5
      0x006e: PHI (r5v4 int) = (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:32:0x007f, B:28:0x006c, B:25:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() {
        /*
            r11 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r11.a()
            boolean r1 = r11.d
            r2 = 0
            if (r1 == 0) goto Lc
            goto L97
        Lc:
            com.google.android.gms.measurement.internal.r r1 = r11.a
            android.content.Context r3 = r1.a
            java.lang.String r4 = "google_app_measurement_local.db"
            java.io.File r3 = r3.getDatabasePath(r4)
            boolean r3 = r3.exists()
            if (r3 == 0) goto L97
            r3 = 5
            r4 = r2
            r5 = r3
        L1f:
            if (r4 >= r3) goto L8b
            r6 = 0
            r7 = 1
            android.database.sqlite.SQLiteDatabase r6 = r11.g()     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteException -> L4b android.database.sqlite.SQLiteDatabaseLockedException -> L66 android.database.sqlite.SQLiteFullException -> L72
            if (r6 != 0) goto L2c
            r11.d = r7     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteException -> L4b android.database.sqlite.SQLiteDatabaseLockedException -> L66 android.database.sqlite.SQLiteFullException -> L72
            goto L97
        L2c:
            r6.beginTransaction()     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteException -> L4b android.database.sqlite.SQLiteDatabaseLockedException -> L66 android.database.sqlite.SQLiteFullException -> L72
            java.lang.String r8 = "messages"
            java.lang.String r9 = "type == ?"
            r10 = 3
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteException -> L4b android.database.sqlite.SQLiteDatabaseLockedException -> L66 android.database.sqlite.SQLiteFullException -> L72
            java.lang.String[] r10 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteException -> L4b android.database.sqlite.SQLiteDatabaseLockedException -> L66 android.database.sqlite.SQLiteFullException -> L72
            r6.delete(r8, r9, r10)     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteException -> L4b android.database.sqlite.SQLiteDatabaseLockedException -> L66 android.database.sqlite.SQLiteFullException -> L72
            r6.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteException -> L4b android.database.sqlite.SQLiteDatabaseLockedException -> L66 android.database.sqlite.SQLiteFullException -> L72
            r6.endTransaction()     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteException -> L4b android.database.sqlite.SQLiteDatabaseLockedException -> L66 android.database.sqlite.SQLiteFullException -> L72
            r6.close()
            return r7
        L49:
            r11 = move-exception
            goto L85
        L4b:
            r8 = move-exception
            if (r6 == 0) goto L57
            boolean r9 = r6.inTransaction()     // Catch: java.lang.Throwable -> L49
            if (r9 == 0) goto L57
            r6.endTransaction()     // Catch: java.lang.Throwable -> L49
        L57:
            com.google.android.gms.measurement.internal.m r9 = r1.f     // Catch: java.lang.Throwable -> L49
            com.google.android.gms.measurement.internal.r.h(r9)     // Catch: java.lang.Throwable -> L49
            p13 r9 = r9.f     // Catch: java.lang.Throwable -> L49
            r9.b(r8, r0)     // Catch: java.lang.Throwable -> L49
            r11.d = r7     // Catch: java.lang.Throwable -> L49
            if (r6 == 0) goto L82
            goto L6e
        L66:
            long r7 = (long) r5     // Catch: java.lang.Throwable -> L49
            android.os.SystemClock.sleep(r7)     // Catch: java.lang.Throwable -> L49
            int r5 = r5 + 20
            if (r6 == 0) goto L82
        L6e:
            r6.close()
            goto L82
        L72:
            r8 = move-exception
            com.google.android.gms.measurement.internal.m r9 = r1.f     // Catch: java.lang.Throwable -> L49
            com.google.android.gms.measurement.internal.r.h(r9)     // Catch: java.lang.Throwable -> L49
            p13 r9 = r9.f     // Catch: java.lang.Throwable -> L49
            r9.b(r8, r0)     // Catch: java.lang.Throwable -> L49
            r11.d = r7     // Catch: java.lang.Throwable -> L49
            if (r6 == 0) goto L82
            goto L6e
        L82:
            int r4 = r4 + 1
            goto L1f
        L85:
            if (r6 == 0) goto L8a
            r6.close()
        L8a:
            throw r11
        L8b:
            com.google.android.gms.measurement.internal.m r11 = r1.f
            com.google.android.gms.measurement.internal.r.h(r11)
            p13 r11 = r11.i
            java.lang.String r0 = "Error deleting app launch break from local database in reasonable time"
            r11.a(r0)
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a03.f():boolean");
    }

    public final SQLiteDatabase g() {
        if (this.d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.d = true;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x016e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac A[Catch: SQLiteException -> 0x0091, SQLiteDatabaseLockedException -> 0x0098, SQLiteFullException -> 0x009c, all -> 0x0152, TRY_ENTER, TryCatch #9 {all -> 0x0152, blocks: (B:30:0x0086, B:32:0x008c, B:43:0x00ac, B:45:0x00cd, B:47:0x00d4, B:49:0x00dc, B:59:0x00f6, B:73:0x011e, B:75:0x0124, B:76:0x0127, B:93:0x0159, B:83:0x0142), top: B:109:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011e A[Catch: all -> 0x0152, TRY_ENTER, TryCatch #9 {all -> 0x0152, blocks: (B:30:0x0086, B:32:0x008c, B:43:0x00ac, B:45:0x00cd, B:47:0x00d4, B:49:0x00dc, B:59:0x00f6, B:73:0x011e, B:75:0x0124, B:76:0x0127, B:93:0x0159, B:83:0x0142), top: B:109:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014e A[PHI: r8 r10 r17
      0x014e: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x013a, B:96:0x016b, B:87:0x014c] A[DONT_GENERATE, DONT_INLINE]
      0x014e: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
      (r10v5 android.database.sqlite.SQLiteDatabase)
      (r10v6 android.database.sqlite.SQLiteDatabase)
      (r10v8 android.database.sqlite.SQLiteDatabase)
     binds: [B:79:0x013a, B:96:0x016b, B:87:0x014c] A[DONT_GENERATE, DONT_INLINE]
      0x014e: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x013a, B:96:0x016b, B:87:0x014c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r19, byte[] r20) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a03.h(int, byte[]):boolean");
    }
}
