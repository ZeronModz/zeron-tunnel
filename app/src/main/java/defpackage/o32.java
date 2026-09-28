package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.b;
import com.google.android.gms.internal.ads.zzdca;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzgru;
import com.google.android.gms.internal.ads.zzguf;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o32 implements zzgru, zzdhc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ o32(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #5 {all -> 0x005c, blocks: (B:22:0x004f, B:36:0x006c, B:39:0x0077, B:40:0x0081, B:42:0x0087, B:44:0x0097, B:46:0x00ae, B:51:0x00bc, B:53:0x00c0, B:55:0x00d0, B:57:0x00e7, B:60:0x00f0, B:72:0x0147, B:79:0x0157, B:81:0x0164, B:83:0x0172, B:84:0x017b, B:86:0x0189, B:88:0x018d, B:89:0x0190, B:91:0x0194, B:93:0x01b4, B:95:0x01c0, B:96:0x01c3, B:97:0x01c4, B:63:0x0101, B:65:0x010f, B:67:0x0117, B:69:0x0137, B:70:0x013a, B:74:0x014b, B:75:0x014e, B:25:0x0055, B:31:0x0062, B:68:0x011b), top: B:116:0x004f, outer: #2, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f0 A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #5 {all -> 0x005c, blocks: (B:22:0x004f, B:36:0x006c, B:39:0x0077, B:40:0x0081, B:42:0x0087, B:44:0x0097, B:46:0x00ae, B:51:0x00bc, B:53:0x00c0, B:55:0x00d0, B:57:0x00e7, B:60:0x00f0, B:72:0x0147, B:79:0x0157, B:81:0x0164, B:83:0x0172, B:84:0x017b, B:86:0x0189, B:88:0x018d, B:89:0x0190, B:91:0x0194, B:93:0x01b4, B:95:0x01c0, B:96:0x01c3, B:97:0x01c4, B:63:0x0101, B:65:0x010f, B:67:0x0117, B:69:0x0137, B:70:0x013a, B:74:0x014b, B:75:0x014e, B:25:0x0055, B:31:0x0062, B:68:0x011b), top: B:116:0x004f, outer: #2, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0151 A[Catch: all -> 0x0018, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0018, blocks: (B:7:0x0012, B:9:0x0016, B:13:0x001b, B:15:0x0020, B:16:0x0022, B:18:0x0034, B:19:0x0038, B:20:0x003a, B:47:0x00b2, B:48:0x00b6, B:49:0x00b9, B:58:0x00eb, B:77:0x0151, B:98:0x01c6, B:99:0x01cd, B:101:0x01cf, B:102:0x01d6, B:22:0x004f, B:36:0x006c, B:39:0x0077, B:40:0x0081, B:42:0x0087, B:44:0x0097, B:46:0x00ae, B:51:0x00bc, B:53:0x00c0, B:55:0x00d0, B:57:0x00e7, B:60:0x00f0, B:72:0x0147, B:79:0x0157, B:81:0x0164, B:83:0x0172, B:84:0x017b, B:86:0x0189, B:88:0x018d, B:89:0x0190, B:91:0x0194, B:93:0x01b4, B:95:0x01c0, B:96:0x01c3, B:97:0x01c4, B:63:0x0101, B:65:0x010f, B:67:0x0117, B:69:0x0137, B:70:0x013a, B:74:0x014b, B:75:0x014e, B:25:0x0055, B:31:0x0062), top: B:111:0x0012, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0157 A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #5 {all -> 0x005c, blocks: (B:22:0x004f, B:36:0x006c, B:39:0x0077, B:40:0x0081, B:42:0x0087, B:44:0x0097, B:46:0x00ae, B:51:0x00bc, B:53:0x00c0, B:55:0x00d0, B:57:0x00e7, B:60:0x00f0, B:72:0x0147, B:79:0x0157, B:81:0x0164, B:83:0x0172, B:84:0x017b, B:86:0x0189, B:88:0x018d, B:89:0x0190, B:91:0x0194, B:93:0x01b4, B:95:0x01c0, B:96:0x01c3, B:97:0x01c4, B:63:0x0101, B:65:0x010f, B:67:0x0117, B:69:0x0137, B:70:0x013a, B:74:0x014b, B:75:0x014e, B:25:0x0055, B:31:0x0062, B:68:0x011b), top: B:116:0x004f, outer: #2, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a() {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o32.a():java.lang.Object");
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    /* JADX INFO: renamed from: zza */
    public Object mo10zza() {
        b bVar;
        switch (this.a) {
            case 0:
                return a();
            default:
                Context context = this.b;
                zzguf zzgufVar = b.n;
                synchronized (b.class) {
                    bVar = b.t;
                    if (bVar == null) {
                        Context applicationContext = context == null ? null : context.getApplicationContext();
                        HashMap map = new HashMap(8);
                        map.put(0, 1000000L);
                        map.put(2, -9223372036854775807L);
                        map.put(3, -9223372036854775807L);
                        map.put(4, -9223372036854775807L);
                        map.put(5, -9223372036854775807L);
                        map.put(10, -9223372036854775807L);
                        map.put(9, -9223372036854775807L);
                        map.put(7, -9223372036854775807L);
                        b bVar2 = new b(applicationContext, map);
                        b.t = bVar2;
                        bVar = bVar2;
                    }
                }
                return bVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhc
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo3zza(Object obj) {
        ((zzdca) obj).zzb(this.b);
    }
}
