package defpackage;

import com.google.common.collect.y;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class s0 extends AbstractCollection {
    public final /* synthetic */ int a;
    public final /* synthetic */ y b;

    public /* synthetic */ s0(y yVar, int i) {
        this.a = i;
        this.b = yVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.a;
        y yVar = this.b;
        switch (i) {
            case 0:
                yVar.clear();
                break;
            default:
                yVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.a;
        y yVar = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return yVar.containsEntry(entry.getKey(), entry.getValue());
            default:
                return yVar.containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        y yVar = this.b;
        switch (i) {
            case 0:
                return yVar.entryIterator();
            default:
                return yVar.valueIterator();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.b.remove(entry.getKey(), entry.getValue());
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.a;
        y yVar = this.b;
        switch (i) {
        }
        return yVar.size();
    }
}
