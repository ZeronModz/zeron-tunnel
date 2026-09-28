package net.openvpn.openvpn;

import defpackage.s31;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ClientAPI_Status {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ClientAPI_Status() {
        this(ovpncliJNI.new_ClientAPI_Status(), true);
    }

    public static long getCPtr(ClientAPI_Status clientAPI_Status) {
        if (clientAPI_Status == null) {
            return 0L;
        }
        return clientAPI_Status.swigCPtr;
    }

    public static long swigRelease(ClientAPI_Status clientAPI_Status) {
        if (clientAPI_Status != null) {
            if (clientAPI_Status.swigCMemOwn) {
                long j = clientAPI_Status.swigCPtr;
                clientAPI_Status.swigCMemOwn = false;
                clientAPI_Status.delete();
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
                    ovpncliJNI.delete_ClientAPI_Status(j);
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

    public boolean getError() {
        return ovpncliJNI.ClientAPI_Status_error_get(this.swigCPtr, this);
    }

    public String getMessage() {
        return ovpncliJNI.ClientAPI_Status_message_get(this.swigCPtr, this);
    }

    public String getStatus() {
        return ovpncliJNI.ClientAPI_Status_status_get(this.swigCPtr, this);
    }

    public void setError(boolean z) {
        ovpncliJNI.ClientAPI_Status_error_set(this.swigCPtr, this, z);
    }

    public void setMessage(String str) {
        ovpncliJNI.ClientAPI_Status_message_set(this.swigCPtr, this, str);
    }

    public void setStatus(String str) {
        ovpncliJNI.ClientAPI_Status_status_set(this.swigCPtr, this, str);
    }

    public ClientAPI_Status(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
