package libv2ray;

import go.Seq;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Libv2ray {

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static final class proxyCoreCallbackHandler implements Seq.Proxy, CoreCallbackHandler {
        private final int refnum;

        public proxyCoreCallbackHandler(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        @Override // go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // libv2ray.CoreCallbackHandler
        public native long onEmitStatus(long j, String str);

        @Override // libv2ray.CoreCallbackHandler
        public native long shutdown();

        @Override // libv2ray.CoreCallbackHandler
        public native long startup();
    }

    static {
        Seq.touch();
        _init();
    }

    private Libv2ray() {
    }

    private static native void _init();

    public static native void ao(String str);

    public static native String checkVersionX();

    public static native boolean cu(String str);

    public static native String do_(String str) throws Exception;

    public static native String encrypt(String str) throws Exception;

    public static native String eo(String str) throws Exception;

    public static native String gc() throws Exception;

    public static native String getVerNotes(String str) throws Exception;

    public static native String gfc() throws Exception;

    public static native String gv(String str) throws Exception;

    public static native void initCoreEnv(String str, String str2);

    public static native long measureOutboundDelay(String str, String str2) throws Exception;

    public static native CoreController newCoreController(CoreCallbackHandler coreCallbackHandler);

    public static native boolean parseConfig(String str);

    public static native void po(String str);

    public static native void so(String str);

    public static native void sp(String str);

    public static native String update();

    public static void touch() {
    }
}
