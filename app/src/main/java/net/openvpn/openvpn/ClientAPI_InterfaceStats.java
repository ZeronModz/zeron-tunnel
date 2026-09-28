package net.openvpn.openvpn;

import defpackage.s31;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ClientAPI_InterfaceStats {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ClientAPI_InterfaceStats() {
        this(ovpncliJNI.new_ClientAPI_InterfaceStats(), true);
    }

    public static long getCPtr(ClientAPI_InterfaceStats clientAPI_InterfaceStats) {
        if (clientAPI_InterfaceStats == null) {
            return 0L;
        }
        return clientAPI_InterfaceStats.swigCPtr;
    }

    public static long swigRelease(ClientAPI_InterfaceStats clientAPI_InterfaceStats) {
        if (clientAPI_InterfaceStats != null) {
            if (clientAPI_InterfaceStats.swigCMemOwn) {
                long j = clientAPI_InterfaceStats.swigCPtr;
                clientAPI_InterfaceStats.swigCMemOwn = false;
                clientAPI_InterfaceStats.delete();
                return j;
            }
            s31.f("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_InterfaceStats(j);
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

    public long getBytesIn() {
        return ovpncliJNI.ClientAPI_InterfaceStats_bytesIn_get(this.swigCPtr, this);
    }

    public long getBytesOut() {
        return ovpncliJNI.ClientAPI_InterfaceStats_bytesOut_get(this.swigCPtr, this);
    }

    public long getErrorsIn() {
        return ovpncliJNI.ClientAPI_InterfaceStats_errorsIn_get(this.swigCPtr, this);
    }

    public long getErrorsOut() {
        return ovpncliJNI.ClientAPI_InterfaceStats_errorsOut_get(this.swigCPtr, this);
    }

    public long getPacketsIn() {
        return ovpncliJNI.ClientAPI_InterfaceStats_packetsIn_get(this.swigCPtr, this);
    }

    public long getPacketsOut() {
        return ovpncliJNI.ClientAPI_InterfaceStats_packetsOut_get(this.swigCPtr, this);
    }

    public void setBytesIn(long j) {
        ovpncliJNI.ClientAPI_InterfaceStats_bytesIn_set(this.swigCPtr, this, j);
    }

    public void setBytesOut(long j) {
        ovpncliJNI.ClientAPI_InterfaceStats_bytesOut_set(this.swigCPtr, this, j);
    }

    public void setErrorsIn(long j) {
        ovpncliJNI.ClientAPI_InterfaceStats_errorsIn_set(this.swigCPtr, this, j);
    }

    public void setErrorsOut(long j) {
        ovpncliJNI.ClientAPI_InterfaceStats_errorsOut_set(this.swigCPtr, this, j);
    }

    public void setPacketsIn(long j) {
        ovpncliJNI.ClientAPI_InterfaceStats_packetsIn_set(this.swigCPtr, this, j);
    }

    public void setPacketsOut(long j) {
        ovpncliJNI.ClientAPI_InterfaceStats_packetsOut_set(this.swigCPtr, this, j);
    }

    public ClientAPI_InterfaceStats(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
