package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.internal.ads.zzeak;
import com.google.android.gms.internal.ads.zzfki;
import com.google.android.gms.measurement.internal.z;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzjd;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lu1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lu1(zzeak zzeakVar, String str, wm2 wm2Var, zzfki zzfkiVar, ArrayList arrayList) {
        this.a = 3;
        this.c = zzeakVar;
        this.b = str;
        this.d = wm2Var;
        this.e = zzfkiVar;
        this.f = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x029f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lu1.run():void");
    }

    public /* synthetic */ lu1(zzjd zzjdVar, wj3 wj3Var, Bundle bundle, zzge zzgeVar, String str) {
        this.a = 6;
        this.c = zzjdVar;
        this.d = wj3Var;
        this.e = bundle;
        this.f = zzgeVar;
        this.b = str;
    }

    public /* synthetic */ lu1(Object obj, Serializable serializable, Object obj2, String str, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.d = serializable;
        this.e = obj2;
        this.b = str;
        this.f = obj3;
    }

    public /* synthetic */ lu1(Object obj, String str, String str2, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = obj2;
        this.e = obj3;
        this.f = obj;
    }

    public /* synthetic */ lu1(vz2 vz2Var, HashMap map, Context context, View view, Activity activity) {
        this.a = 4;
        this.d = vz2Var;
        this.e = map;
        this.c = context;
        this.b = view;
        this.f = activity;
    }

    public /* synthetic */ lu1(vz2 vz2Var, HashMap map, Context context, View view, String str) {
        this.a = 5;
        this.d = vz2Var;
        this.e = map;
        this.c = context;
        this.f = view;
        this.b = str;
    }

    public lu1(z zVar, AtomicReference atomicReference, String str, String str2, wj3 wj3Var) {
        this.a = 7;
        this.c = atomicReference;
        this.b = str;
        this.d = str2;
        this.e = wj3Var;
        this.f = zVar;
    }
}
