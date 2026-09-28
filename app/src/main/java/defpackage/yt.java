package defpackage;

import com.google.firebase.components.Qualified;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class yt {
    public final Qualified a;
    public final boolean b;

    public yt(Qualified qualified, boolean z) {
        this.a = qualified;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yt) {
            yt ytVar = (yt) obj;
            if (ytVar.a.equals(this.a) && ytVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }
}
