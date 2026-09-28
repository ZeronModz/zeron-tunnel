package net.openvpn.openvpn;

import defpackage.s31;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ClientAPI_ExternalPKIRequestBase {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ClientAPI_ExternalPKIRequestBase() {
        this(ovpncliJNI.new_ClientAPI_ExternalPKIRequestBase(), true);
    }

    public static long getCPtr(ClientAPI_ExternalPKIRequestBase clientAPI_ExternalPKIRequestBase) {
        if (clientAPI_ExternalPKIRequestBase == null) {
            return 0L;
        }
        return clientAPI_ExternalPKIRequestBase.swigCPtr;
    }

    public static long swigRelease(ClientAPI_ExternalPKIRequestBase clientAPI_ExternalPKIRequestBase) {
        if (clientAPI_ExternalPKIRequestBase != null) {
            if (clientAPI_ExternalPKIRequestBase.swigCMemOwn) {
                long j = clientAPI_ExternalPKIRequestBase.swigCPtr;
                clientAPI_ExternalPKIRequestBase.swigCMemOwn = false;
                clientAPI_ExternalPKIRequestBase.delete();
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
                    ovpncliJNI.delete_ClientAPI_ExternalPKIRequestBase(j);
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

    public String getAlias() {
        return ovpncliJNI.ClientAPI_ExternalPKIRequestBase_alias_get(this.swigCPtr, this);
    }

    public boolean getError() {
        return ovpncliJNI.ClientAPI_ExternalPKIRequestBase_error_get(this.swigCPtr, this);
    }

    public String getErrorText() {
        return ovpncliJNI.ClientAPI_ExternalPKIRequestBase_errorText_get(this.swigCPtr, this);
    }

    public boolean getInvalidAlias() {
        return ovpncliJNI.ClientAPI_ExternalPKIRequestBase_invalidAlias_get(this.swigCPtr, this);
    }

    public void setAlias(String str) {
        ovpncliJNI.ClientAPI_ExternalPKIRequestBase_alias_set(this.swigCPtr, this, str);
    }

    public void setError(boolean z) {
        ovpncliJNI.ClientAPI_ExternalPKIRequestBase_error_set(this.swigCPtr, this, z);
    }

    public void setErrorText(String str) {
        ovpncliJNI.ClientAPI_ExternalPKIRequestBase_errorText_set(this.swigCPtr, this, str);
    }

    public void setInvalidAlias(boolean z) {
        ovpncliJNI.ClientAPI_ExternalPKIRequestBase_invalidAlias_set(this.swigCPtr, this, z);
    }

    public ClientAPI_ExternalPKIRequestBase(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
