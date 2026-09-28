package defpackage;

import com.google.android.gms.ads.nonagon.signalgeneration.zzau;
import com.google.android.gms.internal.ads.zzbka;
import com.google.android.gms.internal.ads.zzboh;
import com.google.android.gms.internal.ads.zzbsm;
import com.google.android.gms.internal.ads.zzdrp;
import com.google.android.gms.internal.ads.zzgqt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ly1 implements zzgqt {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ly1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqt
    public final /* synthetic */ Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return ((zzau) obj3).zzt((List) obj2, (String) obj);
            case 1:
                zzbsm zzbsmVar = (zzbsm) obj;
                zzbsmVar.zzn((String) obj3, (zzboh) obj2);
                return zzbsmVar;
            default:
                zzdrp zzdrpVar = (zzdrp) obj3;
                JSONObject jSONObject = (JSONObject) obj2;
                List list = (List) obj;
                if (list == null || list.isEmpty()) {
                    return null;
                }
                String strOptString = jSONObject.optString("text");
                Integer numC = zzdrp.c("bg_color", jSONObject);
                Integer numC2 = zzdrp.c("text_color", jSONObject);
                int iOptInt = jSONObject.optInt("text_size", -1);
                boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
                int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
                return new zzbka(strOptString, list, numC, numC2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, zzdrpVar.h.e, zOptBoolean);
        }
    }
}
