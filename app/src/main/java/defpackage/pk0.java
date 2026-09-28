package defpackage;

import com.google.common.collect.LinkedListMultimap;
import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class pk0 extends AbstractSequentialList {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkedListMultimap b;

    public /* synthetic */ pk0(LinkedListMultimap linkedListMultimap, int i) {
        this.a = i;
        this.b = linkedListMultimap;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.a;
        LinkedListMultimap linkedListMultimap = this.b;
        switch (i2) {
            case 0:
                return new vk0(linkedListMultimap, i);
            default:
                vk0 vk0Var = new vk0(linkedListMultimap, i);
                return new rk0(vk0Var, vk0Var);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i = this.a;
        LinkedListMultimap linkedListMultimap = this.b;
        switch (i) {
        }
        return linkedListMultimap.size;
    }
}
