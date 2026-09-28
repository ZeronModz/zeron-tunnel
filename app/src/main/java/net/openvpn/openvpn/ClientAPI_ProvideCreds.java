package net.openvpn.openvpn;

import defpackage.s31;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ClientAPI_ProvideCreds {
    private boolean cachePassword;
    private boolean replacePasswordWithSessionID;
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ClientAPI_ProvideCreds() {
        this(ovpncliJNI.new_ClientAPI_ProvideCreds(), true);
    }

    public static long getCPtr(ClientAPI_ProvideCreds clientAPI_ProvideCreds) {
        if (clientAPI_ProvideCreds == null) {
            return 0L;
        }
        return clientAPI_ProvideCreds.swigCPtr;
    }

    public static long swigRelease(ClientAPI_ProvideCreds clientAPI_ProvideCreds) {
        if (clientAPI_ProvideCreds != null) {
            if (clientAPI_ProvideCreds.swigCMemOwn) {
                long j = clientAPI_ProvideCreds.swigCPtr;
                clientAPI_ProvideCreds.swigCMemOwn = false;
                clientAPI_ProvideCreds.delete();
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
                    ovpncliJNI.delete_ClientAPI_ProvideCreds(j);
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

    public boolean getCachePassword() {
        return this.cachePassword;
    }

    public String getDynamicChallengeCookie() {
        return ovpncliJNI.ClientAPI_ProvideCreds_dynamicChallengeCookie_get(this.swigCPtr, this);
    }

    public String getHttp_proxy_pass() {
        return ovpncliJNI.ClientAPI_ProvideCreds_http_proxy_pass_get(this.swigCPtr, this);
    }

    public String getHttp_proxy_user() {
        return ovpncliJNI.ClientAPI_ProvideCreds_http_proxy_user_get(this.swigCPtr, this);
    }

    public String getPassword() {
        return ovpncliJNI.ClientAPI_ProvideCreds_password_get(this.swigCPtr, this);
    }

    public boolean getReplacePasswordWithSessionID() {
        return this.replacePasswordWithSessionID;
    }

    public String getResponse() {
        return ovpncliJNI.ClientAPI_ProvideCreds_response_get(this.swigCPtr, this);
    }

    public String getUsername() {
        return ovpncliJNI.ClientAPI_ProvideCreds_username_get(this.swigCPtr, this);
    }

    public void setCachePassword(boolean z) {
        this.cachePassword = z;
    }

    public void setDynamicChallengeCookie(String str) {
        ovpncliJNI.ClientAPI_ProvideCreds_dynamicChallengeCookie_set(this.swigCPtr, this, str);
    }

    public void setHttp_proxy_pass(String str) {
        ovpncliJNI.ClientAPI_ProvideCreds_http_proxy_pass_set(this.swigCPtr, this, str);
    }

    public void setHttp_proxy_user(String str) {
        ovpncliJNI.ClientAPI_ProvideCreds_http_proxy_user_set(this.swigCPtr, this, str);
    }

    public void setPassword(String str) {
        ovpncliJNI.ClientAPI_ProvideCreds_password_set(this.swigCPtr, this, str);
    }

    public void setReplacePasswordWithSessionID(boolean z) {
        this.replacePasswordWithSessionID = z;
    }

    public void setResponse(String str) {
        ovpncliJNI.ClientAPI_ProvideCreds_response_set(this.swigCPtr, this, str);
    }

    public void setUsername(String str) {
        ovpncliJNI.ClientAPI_ProvideCreds_username_set(this.swigCPtr, this, str);
    }

    public ClientAPI_ProvideCreds(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
