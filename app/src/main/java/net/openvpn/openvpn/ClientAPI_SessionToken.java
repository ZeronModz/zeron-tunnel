package net.openvpn.openvpn;

import defpackage.s31;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ClientAPI_SessionToken {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ClientAPI_SessionToken() {
        this(ovpncliJNI.new_ClientAPI_SessionToken(), true);
    }

    public static long getCPtr(ClientAPI_SessionToken clientAPI_SessionToken) {
        if (clientAPI_SessionToken == null) {
            return 0L;
        }
        return clientAPI_SessionToken.swigCPtr;
    }

    public static long swigRelease(ClientAPI_SessionToken clientAPI_SessionToken) {
        if (clientAPI_SessionToken != null) {
            if (clientAPI_SessionToken.swigCMemOwn) {
                long j = clientAPI_SessionToken.swigCPtr;
                clientAPI_SessionToken.swigCMemOwn = false;
                clientAPI_SessionToken.delete();
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
                    ovpncliJNI.delete_ClientAPI_SessionToken(j);
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

    public String getSession_id() {
        return ovpncliJNI.ClientAPI_SessionToken_session_id_get(this.swigCPtr, this);
    }

    public String getUsername() {
        return ovpncliJNI.ClientAPI_SessionToken_username_get(this.swigCPtr, this);
    }

    public void setSession_id(String str) {
        ovpncliJNI.ClientAPI_SessionToken_session_id_set(this.swigCPtr, this, str);
    }

    public void setUsername(String str) {
        ovpncliJNI.ClientAPI_SessionToken_username_set(this.swigCPtr, this, str);
    }

    public ClientAPI_SessionToken(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
