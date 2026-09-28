package com.android.volley;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class DefaultRetryPolicy implements RetryPolicy {
    public int a;
    public int b;
    public final int c;
    public final float d;

    public DefaultRetryPolicy(int i, int i2, float f) {
        this.a = i;
        this.c = i2;
        this.d = f;
    }

    @Override // com.android.volley.RetryPolicy
    public final int getCurrentRetryCount() {
        return this.b;
    }

    @Override // com.android.volley.RetryPolicy
    public final int getCurrentTimeout() {
        return this.a;
    }

    @Override // com.android.volley.RetryPolicy
    public final void retry(VolleyError volleyError) throws VolleyError {
        int i = this.b + 1;
        this.b = i;
        int i2 = this.a;
        this.a = i2 + ((int) (i2 * this.d));
        if (i > this.c) {
            throw volleyError;
        }
    }

    public DefaultRetryPolicy() {
        this(2500, 1, 1.0f);
    }
}
