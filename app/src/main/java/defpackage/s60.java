package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.StringResourceValueReader;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s60 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public s60(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        yg0.o("ApplicationId must be set.", !hb1.a(str));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static s60 a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String strA = stringResourceValueReader.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new s60(strA, stringResourceValueReader.a("google_api_key"), stringResourceValueReader.a("firebase_database_url"), stringResourceValueReader.a("ga_trackingId"), stringResourceValueReader.a("gcm_defaultSenderId"), stringResourceValueReader.a("google_storage_bucket"), stringResourceValueReader.a("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s60)) {
            return false;
        }
        s60 s60Var = (s60) obj;
        return dn0.p(this.b, s60Var.b) && dn0.p(this.a, s60Var.a) && dn0.p(this.c, s60Var.c) && dn0.p(this.d, s60Var.d) && dn0.p(this.e, s60Var.e) && dn0.p(this.f, s60Var.f) && dn0.p(this.g, s60Var.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        y6 y6Var = new y6(this);
        y6Var.c(this.b, "applicationId");
        y6Var.c(this.a, "apiKey");
        y6Var.c(this.c, "databaseUrl");
        y6Var.c(this.e, "gcmSenderId");
        y6Var.c(this.f, "storageBucket");
        y6Var.c(this.g, "projectId");
        return y6Var.toString();
    }
}
