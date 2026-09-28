package libv2ray;

import go.Seq;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SoCheck implements Seq.Proxy {
    private final int refnum;

    static {
        Libv2ray.touch();
    }

    public SoCheck() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SoCheck)) {
            return false;
        }
        SoCheck soCheck = (SoCheck) obj;
        return getInstalled() == soCheck.getInstalled() && getApk() == soCheck.getApk() && getTampered() == soCheck.getTampered() && getDexos() == soCheck.getDexos();
    }

    public final native long getApk();

    public final native long getDexos();

    public final native long getInstalled();

    public final native boolean getTampered();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(getInstalled()), Long.valueOf(getApk()), Boolean.valueOf(getTampered()), Long.valueOf(getDexos())});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setApk(long j);

    public final native void setDexos(long j);

    public final native void setInstalled(long j);

    public final native void setTampered(boolean z);

    public String toString() {
        return "SoCheck{Installed:" + getInstalled() + ",Apk:" + getApk() + ",Tampered:" + getTampered() + ",Dexos:" + getDexos() + ",}";
    }

    public SoCheck(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }
}
