package defpackage;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ft1 {
    public static final ds1 a;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        Api.ClientKey clientKey2 = new Api.ClientKey();
        ds1 ds1Var = new ds1();
        a = ds1Var;
        ps1 ps1Var = new ps1();
        new Scope("profile");
        new Scope("email");
        new Api("SignIn.API", ds1Var, clientKey);
        new Api("SignIn.INTERNAL_API", ps1Var, clientKey2);
    }
}
