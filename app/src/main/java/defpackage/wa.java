package defpackage;

import android.util.Size;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.processing.Edge;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class wa {
    public ImmediateSurface b;
    public final Size d;
    public final int e;
    public final int f;
    public final boolean g;
    public final ImageReaderProxyProvider h;
    public final Size i;
    public final int j;
    public final Edge k;
    public final Edge l;
    public CameraCaptureCallback a = new ll();
    public ImmediateSurface c = null;

    public wa(Size size, int i, int i2, boolean z, ImageReaderProxyProvider imageReaderProxyProvider, Size size2, int i3, Edge edge, Edge edge2) {
        if (size == null) {
            io0.e("Null size");
            throw null;
        }
        this.d = size;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.h = imageReaderProxyProvider;
        this.i = size2;
        this.j = i3;
        this.k = edge;
        this.l = edge2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wa)) {
            return false;
        }
        wa waVar = (wa) obj;
        if (!this.d.equals(waVar.d) || this.e != waVar.e || this.f != waVar.f || this.g != waVar.g) {
            return false;
        }
        ImageReaderProxyProvider imageReaderProxyProvider = waVar.h;
        ImageReaderProxyProvider imageReaderProxyProvider2 = this.h;
        if (imageReaderProxyProvider2 == null) {
            if (imageReaderProxyProvider != null) {
                return false;
            }
        } else if (!imageReaderProxyProvider2.equals(imageReaderProxyProvider)) {
            return false;
        }
        Size size = waVar.i;
        Size size2 = this.i;
        if (size2 == null) {
            if (size != null) {
                return false;
            }
        } else if (!size2.equals(size)) {
            return false;
        }
        return this.j == waVar.j && this.k.equals(waVar.k) && this.l.equals(waVar.l);
    }

    public final int hashCode() {
        int iHashCode = (((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003;
        ImageReaderProxyProvider imageReaderProxyProvider = this.h;
        int iHashCode2 = (iHashCode ^ (imageReaderProxyProvider == null ? 0 : imageReaderProxyProvider.hashCode())) * 1000003;
        Size size = this.i;
        return this.l.hashCode() ^ ((((((iHashCode2 ^ (size != null ? size.hashCode() : 0)) * 1000003) ^ this.j) * 1000003) ^ this.k.hashCode()) * 1000003);
    }

    public final String toString() {
        return "In{size=" + this.d + ", inputFormat=" + this.e + ", outputFormat=" + this.f + ", virtualCamera=" + this.g + ", imageReaderProxyProvider=" + this.h + ", postviewSize=" + this.i + ", postviewImageFormat=" + this.j + ", requestEdge=" + this.k + ", errorEdge=" + this.l + "}";
    }
}
