package defpackage;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class n41 extends SupportSQLiteOpenHelper.Callback {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n41(int i, int i2) {
        super(i2);
        this.b = i;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void e(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        int i = this.b;
        if (i < 1) {
            frameworkSQLiteDatabase.setVersion(i);
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void c(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void f(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i, int i2) {
    }
}
