package coil3;

import coil3.ComponentRegistry;
import coil3.fetch.Fetcher;
import coil3.graphics.Decoder;
import coil3.map.Mapper;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.sp;
import defpackage.tp;
import defpackage.up;
import defpackage.xg0;
import defpackage.xu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ClassReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcoil3/ComponentRegistry;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "Builder", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ComponentRegistry {
    public final List a;
    public final List b;
    public final List c;
    public List d;
    public List e;
    public final Lazy f;
    public final Lazy g;

    public ComponentRegistry(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        final int i = 0;
        this.f = kotlin.c.b(new Function0(this) { // from class: rp
            public final /* synthetic */ ComponentRegistry b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                ComponentRegistry componentRegistry = this.b;
                switch (i2) {
                    case 0:
                        List list6 = componentRegistry.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i3 < size) {
                            c.i(arrayList, (List) ((Function0) list6.get(i3)).invoke());
                            i3++;
                        }
                        componentRegistry.d = EmptyList.INSTANCE;
                        return arrayList;
                    default:
                        List list7 = componentRegistry.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i3 < size2) {
                            c.i(arrayList2, (List) ((Function0) list7.get(i3)).invoke());
                            i3++;
                        }
                        componentRegistry.e = EmptyList.INSTANCE;
                        return arrayList2;
                }
            }
        });
        final int i2 = 1;
        this.g = kotlin.c.b(new Function0(this) { // from class: rp
            public final /* synthetic */ ComponentRegistry b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                ComponentRegistry componentRegistry = this.b;
                switch (i22) {
                    case 0:
                        List list6 = componentRegistry.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i3 < size) {
                            c.i(arrayList, (List) ((Function0) list6.get(i3)).invoke());
                            i3++;
                        }
                        componentRegistry.d = EmptyList.INSTANCE;
                        return arrayList;
                    default:
                        List list7 = componentRegistry.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i3 < size2) {
                            c.i(arrayList2, (List) ((Function0) list7.get(i3)).invoke());
                            i3++;
                        }
                        componentRegistry.e = EmptyList.INSTANCE;
                        return arrayList2;
                }
            }
        });
    }

    public /* synthetic */ ComponentRegistry(List list, List list2, List list3, List list4, List list5, xu xuVar) {
        this(list, list2, list3, list4, list5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ComponentRegistry() {
        EmptyList emptyList = EmptyList.INSTANCE;
        this(emptyList, emptyList, emptyList, emptyList, emptyList);
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcoil3/ComponentRegistry$Builder;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "Lcoil3/ComponentRegistry;", "registry", "(Lcoil3/ComponentRegistry;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public final ArrayList a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;
        public final ArrayList e;

        public Builder(ComponentRegistry componentRegistry) {
            int i;
            this.a = kotlin.collections.c.S(componentRegistry.a);
            this.b = kotlin.collections.c.S(componentRegistry.b);
            this.c = kotlin.collections.c.S(componentRegistry.c);
            List list = (List) componentRegistry.f.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                } else {
                    arrayList.add(new sp((Pair) it.next(), i));
                }
            }
            this.d = arrayList;
            List list2 = (List) componentRegistry.g.getValue();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new tp((Decoder.Factory) it2.next(), i));
            }
            this.e = arrayList2;
        }

        public final void a(Fetcher.Factory factory, ClassReference classReference) {
            this.d.add(new up(0, factory, classReference));
        }

        public final void b(Mapper mapper, ClassReference classReference) {
            this.b.add(new Pair(mapper, classReference));
        }

        public final ComponentRegistry c() {
            return new ComponentRegistry(xg0.v(this.a), xg0.v(this.b), xg0.v(this.c), xg0.v(this.d), xg0.v(this.e), null);
        }

        public Builder() {
            this.a = new ArrayList();
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = new ArrayList();
        }
    }
}
