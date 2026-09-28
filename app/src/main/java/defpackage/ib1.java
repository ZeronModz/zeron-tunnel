package defpackage;

import kotlin.collections.CharIterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ib1 extends CharIterator {
    public int a;
    public final /* synthetic */ CharSequence b;

    public ib1(CharSequence charSequence) {
        this.b = charSequence;
    }

    @Override // kotlin.collections.CharIterator
    public final char a() {
        int i = this.a;
        this.a = i + 1;
        return this.b.charAt(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.length();
    }
}
