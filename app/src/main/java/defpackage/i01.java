package defpackage;

import androidx.room.QueryInterceptorDatabase;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ QueryInterceptorDatabase b;
    public final /* synthetic */ String c;

    public /* synthetic */ i01(QueryInterceptorDatabase queryInterceptorDatabase, String str, int i) {
        this.a = i;
        this.b = queryInterceptorDatabase;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        QueryInterceptorDatabase queryInterceptorDatabase = this.b;
        switch (i) {
            case 0:
                queryInterceptorDatabase.c.onQuery(str, EmptyList.INSTANCE);
                break;
            default:
                queryInterceptorDatabase.c.onQuery(str, EmptyList.INSTANCE);
                break;
        }
    }
}
