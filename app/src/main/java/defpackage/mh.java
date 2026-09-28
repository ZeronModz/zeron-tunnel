package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzcka;
import com.google.android.gms.internal.ads.zzckb;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzejf;
import com.google.android.gms.internal.ads.zzfjo;
import com.google.android.gms.internal.ads.zzgyv;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.resources.MaterialAttributes;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class mh implements zzgyv {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public mh(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.d(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()).data, y01.C);
        this.a = lh.a(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        this.g = lh.a(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.b = lh.a(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.c = lh.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListB = so0.b(context, typedArrayObtainStyledAttributes, 7);
        this.d = lh.a(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.e = lh.a(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f = lh.a(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(colorStateListB.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public ListenableFuture zza() throws zzcka {
        zzt.zzd();
        Context context = (Context) this.a;
        jc2 jc2Var = new jc2(0, 0, 0);
        zza zzaVar = (zza) this.d;
        zzbgd zzbgdVar = new zzbgd();
        zzejf zzejfVar = (zzejf) this.e;
        zzfjo zzfjoVar = (zzfjo) this.f;
        zzdxz zzdxzVar = (zzdxz) this.g;
        zzcjl zzcjlVarA = zzckb.a(context, jc2Var, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false, false, (zzazh) this.b, null, (VersionInfoParcel) this.c, null, zzaVar, zzbgdVar, null, null, zzejfVar, zzfjoVar, zzdxzVar);
        w12 w12Var = new w12(zzcjlVarA);
        zzcjlVarA.zzP().zzG(new xb2(w12Var));
        zzcjlVarA.loadUrl((String) this.h);
        return w12Var;
    }

    public /* synthetic */ mh(Context context, zzazh zzazhVar, VersionInfoParcel versionInfoParcel, zza zzaVar, zzejf zzejfVar, zzfjo zzfjoVar, zzdxz zzdxzVar, String str) {
        this.a = context;
        this.b = zzazhVar;
        this.c = versionInfoParcel;
        this.d = zzaVar;
        this.e = zzejfVar;
        this.f = zzfjoVar;
        this.g = zzdxzVar;
        this.h = str;
    }
}
