package defpackage;

import com.google.common.collect.ImmutableList;
import java.nio.file.attribute.FileAttribute;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class yd1 implements FileAttribute {
    public final /* synthetic */ ImmutableList a;

    public yd1(ImmutableList immutableList) {
        this.a = immutableList;
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final String name() {
        return "acl:acl";
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final Object value() {
        return this.a;
    }
}
