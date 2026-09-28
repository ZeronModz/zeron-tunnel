package coil3.request;

import android.graphics.Bitmap;
import coil3.Extras;
import coil3.transition.Transition;
import coil3.util.f;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final Extras.Key a = new Extras.Key(Transition.Factory.NONE);
    public static final Extras.Key b = new Extras.Key(f.b);
    public static final Extras.Key c = new Extras.Key(null);
    public static final Extras.Key d;
    public static final Extras.Key e;
    public static final Extras.Key f;
    public static final Extras.Key g;

    static {
        Boolean bool = Boolean.TRUE;
        d = new Extras.Key(bool);
        e = new Extras.Key(null);
        f = new Extras.Key(bool);
        g = new Extras.Key(Boolean.FALSE);
    }

    public static final Bitmap.Config a(Options options) {
        return (Bitmap.Config) coil3.b.b(options, b);
    }
}
