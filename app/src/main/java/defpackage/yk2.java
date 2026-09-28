package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzboh;
import com.google.android.gms.internal.ads.zzboy;
import com.google.android.gms.internal.ads.zzdsy;
import com.google.android.gms.internal.ads.zzdti;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzeiu;
import com.google.android.gms.internal.ads.zzejf;
import com.google.android.gms.internal.ads.zzfjo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class yk2 {
    public final zza b;
    public final Context c;
    public final zzdxz d;
    public final Executor e;
    public final zzazh f;
    public final VersionInfoParcel g;
    public final zzeiu i;
    public final mv2 j;
    public final zzejf k;
    public final zzfjo l;
    public j33 m;
    public final zzdsy a = new zzdsy();
    public final zzboy h = new zzboy();

    public yk2(zzdti zzdtiVar) {
        this.c = zzdtiVar.b;
        this.e = zzdtiVar.e;
        this.f = zzdtiVar.f;
        this.g = zzdtiVar.g;
        this.b = zzdtiVar.a;
        this.i = zzdtiVar.d;
        this.j = zzdtiVar.h;
        this.d = zzdtiVar.c;
        this.k = zzdtiVar.i;
        this.l = zzdtiVar.j;
    }

    public final synchronized ListenableFuture a(String str, JSONObject jSONObject) {
        j33 j33Var = this.m;
        if (j33Var == null) {
            return u33.b;
        }
        return z.Z(j33Var, new ty1(this, str, jSONObject), this.e);
    }

    public final synchronized void b(String str, zzboh zzbohVar) {
        j33 j33Var = this.m;
        if (j33Var == null) {
            return;
        }
        wk2 wk2Var = new wk2(this, str, zzbohVar, 0);
        j33Var.addListener(new s33(0, j33Var, wk2Var), this.e);
    }

    public final synchronized void c(String str, zzboh zzbohVar) {
        j33 j33Var = this.m;
        if (j33Var == null) {
            return;
        }
        wk2 wk2Var = new wk2(this, str, zzbohVar, 1);
        j33Var.addListener(new s33(0, j33Var, wk2Var), this.e);
    }

    public final synchronized void d(Map map) {
        j33 j33Var = this.m;
        if (j33Var == null) {
            return;
        }
        uh2 uh2Var = new uh2(this, map);
        j33Var.addListener(new s33(0, j33Var, uh2Var), this.e);
    }
}
