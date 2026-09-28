package defpackage;

import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.zzbl;
import com.google.android.gms.internal.ads.zzatb;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class n32 extends zzatb {
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ Map d;
    public final /* synthetic */ zzl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n32(zzbl zzblVar, int i, String str, s32 s32Var, i31 i31Var, byte[] bArr, Map map, zzl zzlVar) {
        super(i, str, s32Var, i31Var);
        this.c = bArr;
        this.d = map;
        this.e = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatb, com.google.android.gms.internal.ads.zzary
    /* JADX INFO: renamed from: a */
    public final void zzs(String str) {
        this.e.zze(str);
        super.zzs(str);
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final Map zzm() {
        Map map = this.d;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final byte[] zzn() {
        byte[] bArr = this.c;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }
}
