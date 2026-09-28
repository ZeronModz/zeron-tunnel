package net.openvpn.openvpn;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class DnsOptions_AddressList extends AbstractList<DnsAddress> implements RandomAccess {
    public transient long a;
    public transient boolean b;

    public DnsOptions_AddressList(Iterable<DnsAddress> iterable) {
        this();
        Iterator<DnsAddress> it = iterable.iterator();
        while (it.hasNext()) {
            DnsAddress next = it.next();
            ((AbstractList) this).modCount++;
            DnsOptions_AddressList dnsOptions_AddressList = this;
            ovpncliJNI.DnsOptions_AddressList_doAdd__SWIG_0(this.a, dnsOptions_AddressList, next == null ? 0L : next.a, next);
            this = dnsOptions_AddressList;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        DnsAddress dnsAddress = (DnsAddress) obj;
        ((AbstractList) this).modCount++;
        ovpncliJNI.DnsOptions_AddressList_doAdd__SWIG_1(this.a, this, i, dnsAddress == null ? 0L : dnsAddress.a, dnsAddress);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        ovpncliJNI.DnsOptions_AddressList_clear(this.a, this);
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        ovpncliJNI.delete_DnsOptions_AddressList(j);
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
        return new DnsAddress(ovpncliJNI.DnsOptions_AddressList_doGet(this.a, this, i), false);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return ovpncliJNI.DnsOptions_AddressList_isEmpty(this.a, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        return new DnsAddress(ovpncliJNI.DnsOptions_AddressList_doRemove(this.a, this, i), true);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        ovpncliJNI.DnsOptions_AddressList_doRemoveRange(this.a, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        DnsAddress dnsAddress = (DnsAddress) obj;
        return new DnsAddress(ovpncliJNI.DnsOptions_AddressList_doSet(this.a, this, i, dnsAddress == null ? 0L : dnsAddress.a, dnsAddress), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ovpncliJNI.DnsOptions_AddressList_doSize(this.a, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        DnsAddress dnsAddress = (DnsAddress) obj;
        ((AbstractList) this).modCount++;
        ovpncliJNI.DnsOptions_AddressList_doAdd__SWIG_0(this.a, this, dnsAddress == null ? 0L : dnsAddress.a, dnsAddress);
        return true;
    }

    public DnsOptions_AddressList(int i, DnsAddress dnsAddress) {
        this(ovpncliJNI.new_DnsOptions_AddressList__SWIG_2(i, dnsAddress == null ? 0L : dnsAddress.a, dnsAddress), true);
    }

    public DnsOptions_AddressList(DnsOptions_AddressList dnsOptions_AddressList) {
        this(ovpncliJNI.new_DnsOptions_AddressList__SWIG_1(dnsOptions_AddressList == null ? 0L : dnsOptions_AddressList.a, dnsOptions_AddressList), true);
    }

    public DnsOptions_AddressList(DnsAddress[] dnsAddressArr) {
        this();
        ovpncliJNI.DnsOptions_AddressList_doReserve(this.a, this, dnsAddressArr.length);
        int length = dnsAddressArr.length;
        int i = 0;
        while (i < length) {
            DnsAddress dnsAddress = dnsAddressArr[i];
            ((AbstractList) this).modCount++;
            DnsOptions_AddressList dnsOptions_AddressList = this;
            ovpncliJNI.DnsOptions_AddressList_doAdd__SWIG_0(this.a, dnsOptions_AddressList, dnsAddress == null ? 0L : dnsAddress.a, dnsAddress);
            i++;
            this = dnsOptions_AddressList;
        }
    }

    public DnsOptions_AddressList(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public DnsOptions_AddressList() {
        this(ovpncliJNI.new_DnsOptions_AddressList__SWIG_0(), true);
    }
}
