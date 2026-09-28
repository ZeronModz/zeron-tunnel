package net.openvpn.openvpn;

import defpackage.s31;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ClientAPI_ExternalPKIBase {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ClientAPI_ExternalPKIBase(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(ClientAPI_ExternalPKIBase clientAPI_ExternalPKIBase) {
        if (clientAPI_ExternalPKIBase == null) {
            return 0L;
        }
        return clientAPI_ExternalPKIBase.swigCPtr;
    }

    public static long swigRelease(ClientAPI_ExternalPKIBase clientAPI_ExternalPKIBase) {
        if (clientAPI_ExternalPKIBase != null) {
            if (clientAPI_ExternalPKIBase.swigCMemOwn) {
                long j = clientAPI_ExternalPKIBase.swigCPtr;
                clientAPI_ExternalPKIBase.swigCMemOwn = false;
                clientAPI_ExternalPKIBase.delete();
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
                    ovpncliJNI.delete_ClientAPI_ExternalPKIBase(j);
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

    public boolean sign(String str, String str2, SWIGTYPE_p_std__string sWIGTYPE_p_std__string, String str3, String str4, String str5) {
        return ovpncliJNI.ClientAPI_ExternalPKIBase_sign(this.swigCPtr, this, str, str2, SWIGTYPE_p_std__string.getCPtr(sWIGTYPE_p_std__string), str3, str4, str5);
    }
}
