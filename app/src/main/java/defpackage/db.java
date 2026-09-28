package defpackage;

import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class db extends EventInternal {
    public final String a;
    public final Integer b;
    public final EncodedPayload c;
    public final long d;
    public final long e;
    public final Map f;
    public final Integer g;
    public final String h;
    public final byte[] i;
    public final byte[] j;

    public db(String str, Integer num, EncodedPayload encodedPayload, long j, long j2, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.b = num;
        this.c = encodedPayload;
        this.d = j;
        this.e = j2;
        this.f = map;
        this.g = num2;
        this.h = str2;
        this.i = bArr;
        this.j = bArr2;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final Map b() {
        return this.f;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final Integer c() {
        return this.b;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final EncodedPayload d() {
        return this.c;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventInternal)) {
            return false;
        }
        EventInternal eventInternal = (EventInternal) obj;
        if (!this.a.equals(eventInternal.k())) {
            return false;
        }
        Integer num = this.b;
        if (num == null) {
            if (eventInternal.c() != null) {
                return false;
            }
        } else if (!num.equals(eventInternal.c())) {
            return false;
        }
        if (!this.c.equals(eventInternal.d()) || this.d != eventInternal.e() || this.e != eventInternal.l() || !this.f.equals(eventInternal.b())) {
            return false;
        }
        Integer num2 = this.g;
        if (num2 == null) {
            if (eventInternal.i() != null) {
                return false;
            }
        } else if (!num2.equals(eventInternal.i())) {
            return false;
        }
        String str = this.h;
        if (str == null) {
            if (eventInternal.j() != null) {
                return false;
            }
        } else if (!str.equals(eventInternal.j())) {
            return false;
        }
        boolean z = eventInternal instanceof db;
        if (Arrays.equals(this.i, z ? ((db) eventInternal).i : eventInternal.f())) {
            return Arrays.equals(this.j, z ? ((db) eventInternal).j : eventInternal.g());
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final byte[] f() {
        return this.i;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final byte[] g() {
        return this.j;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        int iHashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.h;
        return Arrays.hashCode(this.j) ^ ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003);
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final Integer i() {
        return this.g;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final String j() {
        return this.h;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final String k() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final long l() {
        return this.e;
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + ", productId=" + this.g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
