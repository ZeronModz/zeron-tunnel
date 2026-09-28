package net.openvpn.openvpn;

import defpackage.ry;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class DnsOptions_ServersMap extends AbstractMap<Integer, DnsServer> {
    public transient long a;
    public transient boolean b;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public final class Iterator {
        public transient long a;
        public transient boolean b = true;

        public Iterator(long j) {
            this.a = j;
        }

        public final DnsServer a() {
            return new DnsServer(ovpncliJNI.DnsOptions_ServersMap_Iterator_getValue(this.a, this));
        }

        public final void finalize() {
            synchronized (this) {
                try {
                    long j = this.a;
                    if (j != 0) {
                        if (this.b) {
                            this.b = false;
                            ovpncliJNI.delete_DnsOptions_ServersMap_Iterator(j);
                        }
                        this.a = 0L;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public DnsOptions_ServersMap(DnsOptions_ServersMap dnsOptions_ServersMap) {
        this(ovpncliJNI.new_DnsOptions_ServersMap__SWIG_1(dnsOptions_ServersMap == null ? 0L : dnsOptions_ServersMap.a, dnsOptions_ServersMap), true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        ovpncliJNI.DnsOptions_ServersMap_clear(this.a, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return ovpncliJNI.DnsOptions_ServersMap_containsImpl(this.a, this, ((Integer) obj).intValue());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        HashSet hashSet = new HashSet();
        Iterator iterator = new Iterator(ovpncliJNI.DnsOptions_ServersMap_begin(this.a, this));
        Iterator iterator2 = new Iterator(ovpncliJNI.DnsOptions_ServersMap_end(this.a, this));
        while (true) {
            Iterator iterator3 = iterator;
            if (!ovpncliJNI.DnsOptions_ServersMap_Iterator_isNot(iterator3.a, iterator3, iterator2.a, iterator2)) {
                return hashSet;
            }
            ry ryVar = new ry(this);
            ryVar.a = iterator3;
            hashSet.add(ryVar);
            iterator = new Iterator(ovpncliJNI.DnsOptions_ServersMap_Iterator_getNextUnchecked(iterator3.a, iterator3));
        }
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        ovpncliJNI.delete_DnsOptions_ServersMap(j);
                    }
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof Integer)) {
            return null;
        }
        Iterator iterator = new Iterator(ovpncliJNI.DnsOptions_ServersMap_find(this.a, this, ((Integer) obj).intValue()));
        Iterator iterator2 = new Iterator(ovpncliJNI.DnsOptions_ServersMap_end(this.a, this));
        if (ovpncliJNI.DnsOptions_ServersMap_Iterator_isNot(iterator.a, iterator, iterator2.a, iterator2)) {
            return iterator.a();
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return ovpncliJNI.DnsOptions_ServersMap_isEmpty(this.a, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        DnsServer dnsServer;
        long j;
        Integer num = (Integer) obj;
        DnsServer dnsServer2 = (DnsServer) obj2;
        Iterator iterator = new Iterator(ovpncliJNI.DnsOptions_ServersMap_find(this.a, this, num.intValue()));
        Iterator iterator2 = new Iterator(ovpncliJNI.DnsOptions_ServersMap_end(this.a, this));
        if (ovpncliJNI.DnsOptions_ServersMap_Iterator_isNot(iterator.a, iterator, iterator2.a, iterator2)) {
            DnsServer dnsServerA = iterator.a();
            long j2 = 0;
            long j3 = iterator.a;
            if (dnsServer2 != null) {
                j2 = dnsServer2.a;
            }
            ovpncliJNI.DnsOptions_ServersMap_Iterator_setValue(j3, iterator, j2, dnsServer2);
            return dnsServerA;
        }
        int iIntValue = num.intValue();
        long j4 = this.a;
        if (dnsServer2 == null) {
            dnsServer = dnsServer2;
            j = 0;
        } else {
            dnsServer = dnsServer2;
            j = dnsServer2.a;
        }
        ovpncliJNI.DnsOptions_ServersMap_putUnchecked(j4, this, iIntValue, j, dnsServer);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof Integer)) {
            return null;
        }
        Iterator iterator = new Iterator(ovpncliJNI.DnsOptions_ServersMap_find(this.a, this, ((Integer) obj).intValue()));
        Iterator iterator2 = new Iterator(ovpncliJNI.DnsOptions_ServersMap_end(this.a, this));
        if (!ovpncliJNI.DnsOptions_ServersMap_Iterator_isNot(iterator.a, iterator, iterator2.a, iterator2)) {
            return null;
        }
        DnsServer dnsServerA = iterator.a();
        ovpncliJNI.DnsOptions_ServersMap_removeUnchecked(this.a, this, iterator.a, iterator);
        return dnsServerA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return ovpncliJNI.DnsOptions_ServersMap_sizeImpl(this.a, this);
    }

    public DnsOptions_ServersMap(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public DnsOptions_ServersMap() {
        this(ovpncliJNI.new_DnsOptions_ServersMap__SWIG_0(), true);
    }
}
