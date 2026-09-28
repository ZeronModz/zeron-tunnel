package net.openvpn.openvpn;

import defpackage.s31;
import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ClientAPI_LLVector extends AbstractList<Long> implements RandomAccess {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ClientAPI_LLVector(Iterable<Long> iterable) {
        this();
        for (Long l : iterable) {
            l.longValue();
            add(l);
        }
    }

    private void doAdd(int i, long j) {
        ovpncliJNI.ClientAPI_LLVector_doAdd__SWIG_1(this.swigCPtr, this, i, j);
    }

    private int doCapacity() {
        return ovpncliJNI.ClientAPI_LLVector_doCapacity(this.swigCPtr, this);
    }

    private long doGet(int i) {
        return ovpncliJNI.ClientAPI_LLVector_doGet(this.swigCPtr, this, i);
    }

    private long doRemove(int i) {
        return ovpncliJNI.ClientAPI_LLVector_doRemove(this.swigCPtr, this, i);
    }

    private void doRemoveRange(int i, int i2) {
        ovpncliJNI.ClientAPI_LLVector_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private void doReserve(int i) {
        ovpncliJNI.ClientAPI_LLVector_doReserve(this.swigCPtr, this, i);
    }

    private long doSet(int i, long j) {
        return ovpncliJNI.ClientAPI_LLVector_doSet(this.swigCPtr, this, i, j);
    }

    private int doSize() {
        return ovpncliJNI.ClientAPI_LLVector_doSize(this.swigCPtr, this);
    }

    public static long getCPtr(ClientAPI_LLVector clientAPI_LLVector) {
        if (clientAPI_LLVector == null) {
            return 0L;
        }
        return clientAPI_LLVector.swigCPtr;
    }

    public static long swigRelease(ClientAPI_LLVector clientAPI_LLVector) {
        if (clientAPI_LLVector != null) {
            if (clientAPI_LLVector.swigCMemOwn) {
                long j = clientAPI_LLVector.swigCPtr;
                clientAPI_LLVector.swigCMemOwn = false;
                clientAPI_LLVector.delete();
                return j;
            }
            s31.f("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Long l) {
        ((AbstractList) this).modCount++;
        doAdd(l.longValue());
        return true;
    }

    public int capacity() {
        return doCapacity();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ovpncliJNI.ClientAPI_LLVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_LLVector(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int i) {
        return Long.valueOf(doGet(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return ovpncliJNI.ClientAPI_LLVector_isEmpty(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public Long remove(int i) {
        ((AbstractList) this).modCount++;
        return Long.valueOf(doRemove(i));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public void reserve(int i) {
        doReserve(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public Long set(int i, Long l) {
        return Long.valueOf(doSet(i, l.longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    private void doAdd(long j) {
        ovpncliJNI.ClientAPI_LLVector_doAdd__SWIG_0(this.swigCPtr, this, j);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Long l) {
        ((AbstractList) this).modCount++;
        doAdd(i, l.longValue());
    }

    public ClientAPI_LLVector(long[] jArr) {
        this();
        reserve(jArr.length);
        for (long j : jArr) {
            add(Long.valueOf(j));
        }
    }

    public ClientAPI_LLVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public ClientAPI_LLVector() {
        this(ovpncliJNI.new_ClientAPI_LLVector__SWIG_0(), true);
    }

    public ClientAPI_LLVector(ClientAPI_LLVector clientAPI_LLVector) {
        this(ovpncliJNI.new_ClientAPI_LLVector__SWIG_1(getCPtr(clientAPI_LLVector), clientAPI_LLVector), true);
    }

    public ClientAPI_LLVector(int i, long j) {
        this(ovpncliJNI.new_ClientAPI_LLVector__SWIG_2(i, j), true);
    }
}
