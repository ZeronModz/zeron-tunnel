package kotlinx.io;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class SourcesJvmKt$asInputStream$isClosed$1 extends MutablePropertyReference0Impl {
    public SourcesJvmKt$asInputStream$isClosed$1(Object obj) {
        super(obj, RealSource.class, "closed", "getClosed()Z", 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
    public Object get() {
        return Boolean.valueOf(((RealSource) this.receiver).b);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
    public void set(Object obj) {
        ((RealSource) this.receiver).b = ((Boolean) obj).booleanValue();
    }
}
