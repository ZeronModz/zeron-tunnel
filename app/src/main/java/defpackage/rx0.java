package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class rx0 {
    public final int a;
    public final int b;
    public final String c;

    public rx0(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.E;
        this.b = preference.F;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rx0)) {
            return false;
        }
        rx0 rx0Var = (rx0) obj;
        return this.a == rx0Var.a && this.b == rx0Var.b && TextUtils.equals(this.c, rx0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((527 + this.a) * 31) + this.b) * 31);
    }
}
