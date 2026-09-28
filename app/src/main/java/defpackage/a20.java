package defpackage;

import java.util.Iterator;
import kotlin.sequences.DropTakeSequence;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a20 implements Sequence, DropTakeSequence {
    public static final a20 a = new a20();

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence drop(int i) {
        return a;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return y10.a;
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence take(int i) {
        return a;
    }
}
