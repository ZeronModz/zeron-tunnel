package defpackage;

import androidx.room.QueryInterceptorDatabase;
import androidx.room.QueryInterceptorProgram;
import androidx.sqlite.db.SupportSQLiteQuery;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ QueryInterceptorDatabase b;
    public final /* synthetic */ SupportSQLiteQuery c;
    public final /* synthetic */ QueryInterceptorProgram d;

    public /* synthetic */ j01(QueryInterceptorDatabase queryInterceptorDatabase, SupportSQLiteQuery supportSQLiteQuery, QueryInterceptorProgram queryInterceptorProgram, int i) {
        this.a = i;
        this.b = queryInterceptorDatabase;
        this.c = supportSQLiteQuery;
        this.d = queryInterceptorProgram;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        QueryInterceptorProgram queryInterceptorProgram = this.d;
        SupportSQLiteQuery supportSQLiteQuery = this.c;
        QueryInterceptorDatabase queryInterceptorDatabase = this.b;
        switch (i) {
            case 0:
                queryInterceptorDatabase.c.onQuery(supportSQLiteQuery.getA(), queryInterceptorProgram.a);
                break;
            default:
                queryInterceptorDatabase.c.onQuery(supportSQLiteQuery.getA(), queryInterceptorProgram.a);
                break;
        }
    }
}
