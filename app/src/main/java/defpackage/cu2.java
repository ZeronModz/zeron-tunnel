package defpackage;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzfx;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzbqs;
import com.google.android.gms.internal.ads.zzerp;
import com.google.android.gms.internal.ads.zzfjj;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class cu2 {
    public final zzga a;
    public final zzbqs b;
    public final zzerp c;
    public final zzm d;
    public final Bundle e;
    public final zzr f;
    public final String g;
    public final ArrayList h;
    public final ArrayList i;
    public final zzbkh j;
    public final zzx k;
    public final int l;
    public final AdManagerAdViewOptions m;
    public final PublisherAdViewOptions n;
    public final zzco o;
    public final zh2 p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final Bundle t;
    public final AtomicLong u;
    public final boolean v;
    public final zzcs w;

    public /* synthetic */ cu2(zzfjj zzfjjVar) {
        this.f = zzfjjVar.b;
        this.g = zzfjjVar.c;
        this.w = zzfjjVar.w;
        zzm zzmVar = zzfjjVar.a;
        this.e = zzmVar.zzB;
        int i = zzmVar.zza;
        long j = zzmVar.zzb;
        Bundle bundle = zzmVar.zzc;
        int i2 = zzmVar.zzd;
        List list = zzmVar.zze;
        boolean z = zzmVar.zzf;
        int i3 = zzmVar.zzg;
        boolean z2 = true;
        if (!zzmVar.zzh && !zzfjjVar.e) {
            z2 = false;
        }
        boolean z3 = z2;
        zzm zzmVar2 = zzfjjVar.a;
        String str = zzmVar2.zzi;
        zzfx zzfxVar = zzmVar2.zzj;
        Location location = zzmVar2.zzk;
        String str2 = zzmVar2.zzl;
        Bundle bundle2 = zzmVar2.zzm;
        Bundle bundle3 = zzmVar2.zzn;
        List list2 = zzmVar2.zzo;
        String str3 = zzmVar2.zzp;
        String str4 = zzmVar2.zzq;
        boolean z4 = zzmVar2.zzr;
        zzc zzcVar = zzmVar2.zzs;
        int i4 = zzmVar2.zzt;
        String str5 = zzmVar2.zzu;
        List list3 = zzmVar2.zzv;
        int iZza = zzs.zza(zzmVar2.zzw);
        zzm zzmVar3 = zzfjjVar.a;
        zzm zzmVar4 = new zzm(i, j, bundle, i2, list, z, i3, z3, str, zzfxVar, location, str2, bundle2, bundle3, list2, str3, str4, z4, zzcVar, i4, str5, list3, iZza, zzmVar3.zzx, zzmVar3.zzy, zzmVar3.zzz, zzmVar3.zzA);
        this.d = zzmVar4;
        zzga zzgaVar = zzfjjVar.d;
        zzbkh zzbkhVar = null;
        if (zzgaVar == null) {
            zzbkh zzbkhVar2 = zzfjjVar.h;
            zzgaVar = zzbkhVar2 != null ? zzbkhVar2.f : null;
        }
        this.a = zzgaVar;
        ArrayList arrayList = zzfjjVar.f;
        this.h = arrayList;
        this.i = zzfjjVar.g;
        if (arrayList != null && (zzbkhVar = zzfjjVar.h) == null) {
            zzbkhVar = new zzbkh(new NativeAdOptions.Builder().build());
        }
        this.j = zzbkhVar;
        this.k = zzfjjVar.i;
        this.l = zzfjjVar.m;
        this.m = zzfjjVar.j;
        this.n = zzfjjVar.k;
        this.o = zzfjjVar.l;
        this.b = zzfjjVar.n;
        this.p = new zh2(zzfjjVar.o);
        this.q = zzfjjVar.p;
        this.r = zzfjjVar.q;
        this.c = zzfjjVar.r;
        this.s = zzfjjVar.s;
        this.t = zzfjjVar.t;
        this.u = zzmVar4.zzA != 0 ? new AtomicLong(zzmVar4.zzA) : zzfjjVar.u;
        this.v = zzfjjVar.v;
    }
}
