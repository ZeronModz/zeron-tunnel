package net.openvpn.openvpn;

import defpackage.s31;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ClientAPI_LogInfo {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ClientAPI_LogInfo() {
        this(ovpncliJNI.new_ClientAPI_LogInfo__SWIG_0(), true);
    }

    public static long getCPtr(ClientAPI_LogInfo clientAPI_LogInfo) {
        if (clientAPI_LogInfo == null) {
            return 0L;
        }
        return clientAPI_LogInfo.swigCPtr;
    }

    public static long swigRelease(ClientAPI_LogInfo clientAPI_LogInfo) {
        if (clientAPI_LogInfo != null) {
            if (clientAPI_LogInfo.swigCMemOwn) {
                long j = clientAPI_LogInfo.swigCPtr;
                clientAPI_LogInfo.swigCMemOwn = false;
                clientAPI_LogInfo.delete();
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
                    ovpncliJNI.delete_ClientAPI_LogInfo(j);
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

    public String getText() {
        return ovpncliJNI.ClientAPI_LogInfo_text_get(this.swigCPtr, this);
    }

    public void setText(String str) {
        ovpncliJNI.ClientAPI_LogInfo_text_set(this.swigCPtr, this, str);
    }

    public ClientAPI_LogInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public ClientAPI_LogInfo(String str) {
        this(ovpncliJNI.new_ClientAPI_LogInfo__SWIG_1(str), true);
    }
}
