package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hk b;
    public final /* synthetic */ String c;

    public /* synthetic */ gk(hk hkVar, String str, int i) {
        this.a = i;
        this.b = hkVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        hk hkVar = this.b;
        switch (i) {
            case 0:
                hkVar.b.onCameraAvailable(str);
                break;
            default:
                hkVar.b.onCameraUnavailable(str);
                break;
        }
    }
}
