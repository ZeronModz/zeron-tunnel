package defpackage;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.h;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ok0 {
    public static final LinkOption[] a = {LinkOption.NOFOLLOW_LINKS};
    public static final LinkOption[] b = new LinkOption[0];
    public static final EmptySet c = EmptySet.INSTANCE;
    public static final Set d = h.b(FileVisitOption.FOLLOW_LINKS);
}
