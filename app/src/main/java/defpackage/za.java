package defpackage;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.CreationContext;
import com.google.android.datatransport.runtime.time.Clock;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class za extends CreationContext {
    public final Context a;
    public final Clock b;
    public final Clock c;
    public final String d;

    public za(Context context, Clock clock, Clock clock2, String str) {
        if (context == null) {
            io0.e("Null applicationContext");
            throw null;
        }
        this.a = context;
        if (clock == null) {
            io0.e("Null wallClock");
            throw null;
        }
        this.b = clock;
        if (clock2 == null) {
            io0.e("Null monotonicClock");
            throw null;
        }
        this.c = clock2;
        if (str != null) {
            this.d = str;
        } else {
            io0.e("Null backendName");
            throw null;
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public final Context a() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public final String b() {
        return this.d;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public final Clock c() {
        return this.c;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public final Clock d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreationContext)) {
            return false;
        }
        CreationContext creationContext = (CreationContext) obj;
        return this.a.equals(creationContext.a()) && this.b.equals(creationContext.d()) && this.c.equals(creationContext.c()) && this.d.equals(creationContext.b());
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return vh.s(sb, this.d, "}");
    }
}
