package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.zzhc;
import com.google.android.gms.measurement.internal.zzhd;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzhg;
import com.google.android.gms.measurement.internal.zzjl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f63 extends ff3 {
    public static final Pair z = new Pair(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0L);
    public SharedPreferences c;
    public SharedPreferences d;
    public an e;
    public final zzhe f;
    public final zzhg g;
    public String h;
    public boolean i;
    public long j;
    public final zzhe k;
    public final zzhc l;
    public final zzhg m;
    public final zzhd n;
    public final zzhc o;
    public final zzhe p;
    public final zzhe q;
    public boolean r;
    public final zzhc s;
    public final zzhc t;
    public final zzhe u;
    public final zzhg v;
    public final zzhg w;
    public final zzhe x;
    public final zzhd y;

    public f63(r rVar) {
        super(rVar);
        this.k = new zzhe(this, "session_timeout", 1800000L);
        this.l = new zzhc(this, "start_new_session", true);
        this.p = new zzhe(this, "last_pause_time", 0L);
        this.q = new zzhe(this, "session_id", 0L);
        this.m = new zzhg(this, "non_personalized_ads", null);
        this.n = new zzhd(this, "last_received_uri_timestamps_by_source", null);
        this.o = new zzhc(this, "allow_remote_dynamite", false);
        this.f = new zzhe(this, "first_open_time", 0L);
        new zzhe(this, "app_install_time", 0L);
        this.g = new zzhg(this, "app_instance_id", null);
        this.s = new zzhc(this, "app_backgrounded", false);
        this.t = new zzhc(this, "deep_link_retrieval_complete", false);
        this.u = new zzhe(this, "deep_link_retrieval_attempts", 0L);
        this.v = new zzhg(this, "firebase_feature_rollouts", null);
        this.w = new zzhg(this, "deferred_attribution_cache", null);
        this.x = new zzhe(this, "deferred_attribution_cache_timestamp", 0L);
        this.y = new zzhd(this, "default_event_parameters", null);
    }

    @Override // defpackage.ff3
    public final boolean b() {
        return true;
    }

    public final SharedPreferences e() {
        a();
        c();
        yg0.m(this.c);
        return this.c;
    }

    public final SharedPreferences f() {
        a();
        c();
        SharedPreferences sharedPreferences = this.d;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        r rVar = this.a;
        String strValueOf = String.valueOf(rVar.a.getPackageName());
        m mVar = rVar.f;
        r.h(mVar);
        p13 p13Var = mVar.n;
        String strConcat = strValueOf.concat("_preferences");
        p13Var.b(strConcat, "Default prefs file");
        SharedPreferences sharedPreferences2 = rVar.a.getSharedPreferences(strConcat, 0);
        this.d = sharedPreferences2;
        return sharedPreferences2;
    }

    public final SparseArray g() {
        Bundle bundleA = this.n.a();
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            m mVar = this.a.f;
            r.h(mVar);
            mVar.f.a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final zzjl h() {
        a();
        return zzjl.c(e().getInt("consent_source", 100), e().getString("consent_settings", "G1"));
    }

    public final boolean i(ei3 ei3Var) {
        a();
        String string = e().getString("stored_tcf_param", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        String strA = ei3Var.a();
        if (strA.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = e().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        return true;
    }

    public final void j(boolean z2) {
        a();
        m mVar = this.a.f;
        r.h(mVar);
        mVar.n.b(Boolean.valueOf(z2), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = e().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z2);
        editorEdit.apply();
    }

    public final boolean k(long j) {
        return j - this.k.a() > this.p.a();
    }
}
