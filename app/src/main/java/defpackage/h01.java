package defpackage;

import androidx.room.QueryInterceptorDatabase;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ QueryInterceptorDatabase b;

    public /* synthetic */ h01(QueryInterceptorDatabase queryInterceptorDatabase, int i) {
        this.a = i;
        this.b = queryInterceptorDatabase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        QueryInterceptorDatabase queryInterceptorDatabase = this.b;
        switch (i) {
            case 0:
                queryInterceptorDatabase.c.onQuery("END TRANSACTION", EmptyList.INSTANCE);
                break;
            case 1:
                queryInterceptorDatabase.c.onQuery("BEGIN DEFERRED TRANSACTION", EmptyList.INSTANCE);
                break;
            case 2:
                queryInterceptorDatabase.c.onQuery("BEGIN EXCLUSIVE TRANSACTION", EmptyList.INSTANCE);
                break;
            case 3:
                queryInterceptorDatabase.c.onQuery("TRANSACTION SUCCESSFUL", EmptyList.INSTANCE);
                break;
            case 4:
                queryInterceptorDatabase.c.onQuery("BEGIN DEFERRED TRANSACTION", EmptyList.INSTANCE);
                break;
            default:
                queryInterceptorDatabase.c.onQuery("BEGIN EXCLUSIVE TRANSACTION", EmptyList.INSTANCE);
                break;
        }
    }
}
