package defpackage;

import android.content.Context;
import coil3.ComponentRegistry;
import coil3.EventListener;
import coil3.Extras;
import coil3.ImageLoader;
import coil3.RealImageLoader;
import coil3.SingletonImageLoader$Factory;
import coil3.f;
import coil3.request.ImageRequest;
import coil3.util.Logger;
import kotlin.Lazy;
import kotlin.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k81 implements SingletonImageLoader$Factory {
    @Override // coil3.SingletonImageLoader$Factory
    public final ImageLoader newImageLoader(Context context) {
        ImageLoader.Builder builder = new ImageLoader.Builder(context);
        Extras.Key key = f.b;
        mk1 mk1Var = mk1.a;
        Extras.Builder builder2 = builder.h;
        builder2.b(key, mk1Var);
        Extras extrasA = builder2.a();
        ImageRequest.Defaults defaults = builder.b;
        ImageRequest.Defaults defaults2 = new ImageRequest.Defaults(defaults.a, defaults.b, defaults.c, defaults.d, defaults.e, defaults.f, defaults.g, defaults.h, defaults.i, defaults.j, defaults.k, defaults.l, defaults.m, extrasA);
        Lazy lazyB = builder.c;
        if (lazyB == null) {
            lazyB = c.b(new l8(builder, 7));
        }
        Lazy lazy = lazyB;
        Lazy lazyB2 = builder.d;
        if (lazyB2 == null) {
            lazyB2 = c.b(new o0(18));
        }
        Lazy lazy2 = lazyB2;
        EventListener.Factory factory = builder.e;
        if (factory == null) {
            factory = EventListener.Factory.NONE;
        }
        EventListener.Factory factory2 = factory;
        ComponentRegistry componentRegistry = builder.f;
        if (componentRegistry == null) {
            componentRegistry = new ComponentRegistry();
        }
        Logger logger = builder.g;
        return new RealImageLoader(new RealImageLoader.Options(builder.a, defaults2, lazy, lazy2, factory2, componentRegistry, logger));
    }
}
