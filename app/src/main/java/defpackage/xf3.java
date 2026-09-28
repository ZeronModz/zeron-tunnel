package defpackage;

import com.google.android.gms.internal.measurement.zzkg;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class xf3 {
    public static final Object g = new Object();
    public static volatile lf3 h;
    public static final AtomicInteger i;
    public final zzkg a;
    public final String b;
    public final Object c;
    public volatile int d = -1;
    public volatile Object e;
    public final /* synthetic */ int f;

    static {
        new AtomicReference();
        i = new AtomicInteger();
    }

    public /* synthetic */ xf3(zzkg zzkgVar, String str, Object obj, int i2) {
        this.f = i2;
        if (zzkgVar.a == null) {
            u7.r("Must pass a valid SharedPreferences file name or ContentProvider URI");
            throw null;
        }
        this.a = zzkgVar;
        this.b = str;
        this.c = obj;
    }

    public final Object a(Object obj) {
        int i2 = this.f;
        String str = this.b;
        switch (i2) {
            case 0:
                if (obj instanceof Long) {
                    return (Long) obj;
                }
                if (obj instanceof String) {
                    try {
                        return Long.valueOf(Long.parseLong((String) obj));
                    } catch (NumberFormatException unused) {
                    }
                }
                new StringBuilder(str.length() + 25 + obj.toString().length());
                return null;
            case 1:
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (hf3.b.matcher(str2).matches()) {
                        return Boolean.TRUE;
                    }
                    if (hf3.c.matcher(str2).matches()) {
                        return Boolean.FALSE;
                    }
                }
                new StringBuilder(str.length() + 28 + obj.toString().length());
                return null;
            case 2:
                if (obj instanceof Double) {
                    return (Double) obj;
                }
                if (obj instanceof Float) {
                    return Double.valueOf(((Float) obj).doubleValue());
                }
                if (obj instanceof String) {
                    try {
                        return Double.valueOf(Double.parseDouble((String) obj));
                    } catch (NumberFormatException unused2) {
                    }
                }
                new StringBuilder(str.length() + 27 + obj.toString().length());
                return null;
            default:
                if (obj instanceof String) {
                    return (String) obj;
                }
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[PHI: r2
      0x005a: PHI (r2v1 com.google.common.base.Optional) = 
      (r2v0 com.google.common.base.Optional)
      (r2v0 com.google.common.base.Optional)
      (r2v4 com.google.common.base.Optional)
      (r2v4 com.google.common.base.Optional)
     binds: [B:8:0x0016, B:10:0x001a, B:12:0x0026, B:18:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001c, B:13:0x0028, B:15:0x0036, B:19:0x004a, B:26:0x0060, B:28:0x006b, B:30:0x0073, B:33:0x0083, B:35:0x008b, B:47:0x00b0, B:50:0x00b8, B:51:0x00bb, B:52:0x00bf, B:39:0x0094, B:41:0x0098, B:43:0x00a6, B:45:0x00ac, B:53:0x00c4, B:54:0x00c6, B:16:0x0043, B:55:0x00c7), top: B:61:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001c, B:13:0x0028, B:15:0x0036, B:19:0x004a, B:26:0x0060, B:28:0x006b, B:30:0x0073, B:33:0x0083, B:35:0x008b, B:47:0x00b0, B:50:0x00b8, B:51:0x00bb, B:52:0x00bf, B:39:0x0094, B:41:0x0098, B:43:0x00a6, B:45:0x00ac, B:53:0x00c4, B:54:0x00c6, B:16:0x0043, B:55:0x00c7), top: B:61:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf3.b():java.lang.Object");
    }
}
