package defpackage;

import android.util.Size;
import androidx.camera.core.impl.Timebase;
import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bd extends qm1 {
    public String a;
    public Integer b;
    public Timebase c;
    public Size d;
    public Integer e;
    public dd f;
    public Integer g;
    public Integer h;
    public Integer i;

    public final cd a() {
        String strConcat = this.a == null ? " mimeType" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (this.c == null) {
            strConcat = strConcat.concat(" inputTimebase");
        }
        if (this.d == null) {
            strConcat = strConcat.concat(" resolution");
        }
        if (this.f == null) {
            strConcat = strConcat.concat(" dataSpace");
        }
        if (this.g == null) {
            strConcat = strConcat.concat(" frameRate");
        }
        if (this.i == null) {
            strConcat = strConcat.concat(" bitrate");
        }
        if (strConcat.isEmpty()) {
            return new cd(this.a, this.b.intValue(), this.c, this.d, this.e.intValue(), this.f, this.g.intValue(), this.h.intValue(), this.i.intValue());
        }
        u7.p("Missing required properties:".concat(strConcat));
        return null;
    }
}
