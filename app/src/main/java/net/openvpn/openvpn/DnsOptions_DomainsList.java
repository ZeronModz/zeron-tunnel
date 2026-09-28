package net.openvpn.openvpn;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class DnsOptions_DomainsList extends AbstractList<DnsDomain> implements RandomAccess {
    public transient long a;
    public transient boolean b;

    public DnsOptions_DomainsList(Iterable<DnsDomain> iterable) {
        this();
        Iterator<DnsDomain> it = iterable.iterator();
        while (it.hasNext()) {
            DnsDomain next = it.next();
            ((AbstractList) this).modCount++;
            DnsOptions_DomainsList dnsOptions_DomainsList = this;
            ovpncliJNI.DnsOptions_DomainsList_doAdd__SWIG_0(this.a, dnsOptions_DomainsList, next == null ? 0L : next.a, next);
            this = dnsOptions_DomainsList;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        DnsDomain dnsDomain = (DnsDomain) obj;
        ((AbstractList) this).modCount++;
        ovpncliJNI.DnsOptions_DomainsList_doAdd__SWIG_1(this.a, this, i, dnsDomain == null ? 0L : dnsDomain.a, dnsDomain);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        ovpncliJNI.DnsOptions_DomainsList_clear(this.a, this);
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        ovpncliJNI.delete_DnsOptions_DomainsList(j);
                    }
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return new DnsDomain(ovpncliJNI.DnsOptions_DomainsList_doGet(this.a, this, i), false);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return ovpncliJNI.DnsOptions_DomainsList_isEmpty(this.a, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        return new DnsDomain(ovpncliJNI.DnsOptions_DomainsList_doRemove(this.a, this, i), true);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        ovpncliJNI.DnsOptions_DomainsList_doRemoveRange(this.a, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        DnsDomain dnsDomain = (DnsDomain) obj;
        return new DnsDomain(ovpncliJNI.DnsOptions_DomainsList_doSet(this.a, this, i, dnsDomain == null ? 0L : dnsDomain.a, dnsDomain), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ovpncliJNI.DnsOptions_DomainsList_doSize(this.a, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        DnsDomain dnsDomain = (DnsDomain) obj;
        ((AbstractList) this).modCount++;
        ovpncliJNI.DnsOptions_DomainsList_doAdd__SWIG_0(this.a, this, dnsDomain == null ? 0L : dnsDomain.a, dnsDomain);
        return true;
    }

    public DnsOptions_DomainsList(int i, DnsDomain dnsDomain) {
        this(ovpncliJNI.new_DnsOptions_DomainsList__SWIG_2(i, dnsDomain == null ? 0L : dnsDomain.a, dnsDomain), true);
    }

    public DnsOptions_DomainsList(DnsOptions_DomainsList dnsOptions_DomainsList) {
        this(ovpncliJNI.new_DnsOptions_DomainsList__SWIG_1(dnsOptions_DomainsList == null ? 0L : dnsOptions_DomainsList.a, dnsOptions_DomainsList), true);
    }

    public DnsOptions_DomainsList(DnsDomain[] dnsDomainArr) {
        this();
        ovpncliJNI.DnsOptions_DomainsList_doReserve(this.a, this, dnsDomainArr.length);
        int length = dnsDomainArr.length;
        int i = 0;
        while (i < length) {
            DnsDomain dnsDomain = dnsDomainArr[i];
            ((AbstractList) this).modCount++;
            DnsOptions_DomainsList dnsOptions_DomainsList = this;
            ovpncliJNI.DnsOptions_DomainsList_doAdd__SWIG_0(this.a, dnsOptions_DomainsList, dnsDomain == null ? 0L : dnsDomain.a, dnsDomain);
            i++;
            this = dnsOptions_DomainsList;
        }
    }

    public DnsOptions_DomainsList(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public DnsOptions_DomainsList() {
        this(ovpncliJNI.new_DnsOptions_DomainsList__SWIG_0(), true);
    }
}
