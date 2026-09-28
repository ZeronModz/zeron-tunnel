package defpackage;

import com.google.android.gms.internal.ads.zzikg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fl2 implements zzikg {
    public final /* synthetic */ int a;
    public final rh2 b;

    public /* synthetic */ fl2(rh2 rh2Var, int i) {
        this.a = i;
        this.b = rh2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzb() {
        /*
            r3 = this;
            int r0 = r3.a
            r1 = 3
            r2 = 2
            rh2 r3 = r3.b
            switch(r0) {
                case 0: goto L8d;
                case 1: goto L7d;
                case 2: goto L22;
                case 3: goto L18;
                default: goto L9;
            }
        L9:
            ta2 r0 = com.google.android.gms.internal.ads.g3.a
            defpackage.k02.J(r0)
            cu2 r3 = r3.a()
            pr2 r1 = new pr2
            r1.<init>(r2, r0, r3)
            return r1
        L18:
            cu2 r3 = r3.a()
            er2 r0 = new er2
            r0.<init>(r3, r2)
            return r0
        L22:
            cu2 r3 = r3.a()
            com.google.android.gms.ads.internal.client.zzm r3 = r3.d
            l32 r0 = defpackage.p32.j8
            com.google.android.gms.internal.ads.zzbhc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L69
            java.lang.String r0 = r3.zzx
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "request_id"
            if (r1 != 0) goto L54
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L54
            r1.<init>(r0)     // Catch: org.json.JSONException -> L54
            java.lang.String r0 = r1.getString(r2)     // Catch: org.json.JSONException -> L54
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: org.json.JSONException -> L54
            if (r1 != 0) goto L54
            goto L79
        L54:
            com.google.android.gms.ads.internal.client.zzc r3 = r3.zzs
            if (r3 == 0) goto L69
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L69
            java.lang.String r3 = r3.zza     // Catch: org.json.JSONException -> L69
            r0.<init>(r3)     // Catch: org.json.JSONException -> L69
            java.lang.String r0 = r0.getString(r2)     // Catch: org.json.JSONException -> L69
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: org.json.JSONException -> L69
            if (r3 == 0) goto L79
        L69:
            java.util.Random r3 = com.google.android.gms.ads.internal.client.zzbb.zzh()
            int r3 = r3.nextInt()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3 = r3 & r0
            java.lang.String r0 = java.lang.String.valueOf(r3)
        L79:
            defpackage.k02.J(r0)
            return r0
        L7d:
            cu2 r3 = r3.a()
            zh2 r3 = r3.p
            int r3 = r3.b
            if (r3 != r1) goto L8a
            java.lang.String r3 = "rewarded_interstitial"
            goto L8c
        L8a:
            java.lang.String r3 = "rewarded"
        L8c:
            return r3
        L8d:
            cu2 r3 = r3.a()
            zh2 r3 = r3.p
            int r3 = r3.b
            if (r3 != r1) goto L9a
            com.google.android.gms.internal.ads.zzbgj$zza$zza r3 = com.google.android.gms.internal.ads.zzbgj$zza$zza.REWARDED_INTERSTITIAL
            goto L9c
        L9a:
            com.google.android.gms.internal.ads.zzbgj$zza$zza r3 = com.google.android.gms.internal.ads.zzbgj$zza$zza.REWARD_BASED_VIDEO_AD
        L9c:
            defpackage.k02.J(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl2.zzb():java.lang.Object");
    }
}
