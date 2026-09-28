package defpackage;

import android.util.Size;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ua extends ii {
    public final String a;
    public final Class b;
    public final v61 c;
    public final UseCaseConfig d;
    public final Size e;
    public final StreamSpec f;
    public final List g;

    public ua(String str, Class cls, v61 v61Var, UseCaseConfig useCaseConfig, Size size, StreamSpec streamSpec, ArrayList arrayList) {
        this.a = str;
        this.b = cls;
        if (v61Var == null) {
            io0.e("Null sessionConfig");
            throw null;
        }
        this.c = v61Var;
        if (useCaseConfig == null) {
            io0.e("Null useCaseConfig");
            throw null;
        }
        this.d = useCaseConfig;
        this.e = size;
        this.f = streamSpec;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ii)) {
            return false;
        }
        ua uaVar = (ua) ((ii) obj);
        if (!this.a.equals(uaVar.a) || !this.b.equals(uaVar.b) || !this.c.equals(uaVar.c) || !this.d.equals(uaVar.d)) {
            return false;
        }
        Size size = uaVar.e;
        Size size2 = this.e;
        if (size2 == null) {
            if (size != null) {
                return false;
            }
        } else if (!size2.equals(size)) {
            return false;
        }
        StreamSpec streamSpec = uaVar.f;
        StreamSpec streamSpec2 = this.f;
        if (streamSpec2 == null) {
            if (streamSpec != null) {
                return false;
            }
        } else if (!streamSpec2.equals(streamSpec)) {
            return false;
        }
        List list = uaVar.g;
        List list2 = this.g;
        return list2 == null ? list == null : list2.equals(list);
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        Size size = this.e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        StreamSpec streamSpec = this.f;
        int iHashCode3 = (iHashCode2 ^ (streamSpec == null ? 0 : streamSpec.hashCode())) * 1000003;
        List list = this.g;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "UseCaseInfo{useCaseId=" + this.a + ", useCaseType=" + this.b + ", sessionConfig=" + this.c + ", useCaseConfig=" + this.d + ", surfaceResolution=" + this.e + ", streamSpec=" + this.f + ", captureTypes=" + this.g + "}";
    }
}
