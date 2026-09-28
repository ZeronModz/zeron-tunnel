package defpackage;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class s5 {
    public final int a;
    public final Api b;
    public final Api.ApiOptions c;
    public final String d;

    public s5(Api api, Api.ApiOptions apiOptions, String str) {
        this.b = api;
        this.c = apiOptions;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{api, apiOptions, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s5)) {
            return false;
        }
        s5 s5Var = (s5) obj;
        return dn0.p(this.b, s5Var.b) && dn0.p(this.c, s5Var.c) && dn0.p(this.d, s5Var.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
