package defpackage;

import coil3.graphics.Decoder;
import kotlin.collections.c;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tp implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Decoder.Factory b;

    public /* synthetic */ tp(Decoder.Factory factory, int i) {
        this.a = i;
        this.b = factory;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Decoder.Factory factory = this.b;
        switch (i) {
        }
        return c.z(factory);
    }
}
