package defpackage;

import androidx.room.QueryInterceptorStatement;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ QueryInterceptorStatement b;

    public /* synthetic */ k01(QueryInterceptorStatement queryInterceptorStatement, int i) {
        this.a = i;
        this.b = queryInterceptorStatement;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        QueryInterceptorStatement queryInterceptorStatement = this.b;
        switch (i) {
            case 0:
                queryInterceptorStatement.d.onQuery(queryInterceptorStatement.b, queryInterceptorStatement.e);
                break;
            case 1:
                queryInterceptorStatement.d.onQuery(queryInterceptorStatement.b, queryInterceptorStatement.e);
                break;
            case 2:
                queryInterceptorStatement.d.onQuery(queryInterceptorStatement.b, queryInterceptorStatement.e);
                break;
            case 3:
                queryInterceptorStatement.d.onQuery(queryInterceptorStatement.b, queryInterceptorStatement.e);
                break;
            default:
                queryInterceptorStatement.d.onQuery(queryInterceptorStatement.b, queryInterceptorStatement.e);
                break;
        }
    }
}
