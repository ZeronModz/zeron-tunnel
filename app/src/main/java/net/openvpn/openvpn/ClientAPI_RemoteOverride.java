package net.openvpn.openvpn;

import defpackage.s31;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ClientAPI_RemoteOverride {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ClientAPI_RemoteOverride() {
        this(ovpncliJNI.new_ClientAPI_RemoteOverride(), true);
    }

    public static long getCPtr(ClientAPI_RemoteOverride clientAPI_RemoteOverride) {
        if (clientAPI_RemoteOverride == null) {
            return 0L;
        }
        return clientAPI_RemoteOverride.swigCPtr;
    }

    public static long swigRelease(ClientAPI_RemoteOverride clientAPI_RemoteOverride) {
        if (clientAPI_RemoteOverride != null) {
            if (clientAPI_RemoteOverride.swigCMemOwn) {
                long j = clientAPI_RemoteOverride.swigCPtr;
                clientAPI_RemoteOverride.swigCMemOwn = false;
                clientAPI_RemoteOverride.delete();
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
                    ovpncliJNI.delete_ClientAPI_RemoteOverride(j);
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

    public String getError() {
        return ovpncliJNI.ClientAPI_RemoteOverride_error_get(this.swigCPtr, this);
    }

    public String getHost() {
        return ovpncliJNI.ClientAPI_RemoteOverride_host_get(this.swigCPtr, this);
    }

    public String getIp() {
        return ovpncliJNI.ClientAPI_RemoteOverride_ip_get(this.swigCPtr, this);
    }

    public String getPort() {
        return ovpncliJNI.ClientAPI_RemoteOverride_port_get(this.swigCPtr, this);
    }

    public String getProto() {
        return ovpncliJNI.ClientAPI_RemoteOverride_proto_get(this.swigCPtr, this);
    }

    public void setError(String str) {
        ovpncliJNI.ClientAPI_RemoteOverride_error_set(this.swigCPtr, this, str);
    }

    public void setHost(String str) {
        ovpncliJNI.ClientAPI_RemoteOverride_host_set(this.swigCPtr, this, str);
    }

    public void setIp(String str) {
        ovpncliJNI.ClientAPI_RemoteOverride_ip_set(this.swigCPtr, this, str);
    }

    public void setPort(String str) {
        ovpncliJNI.ClientAPI_RemoteOverride_port_set(this.swigCPtr, this, str);
    }

    public void setProto(String str) {
        ovpncliJNI.ClientAPI_RemoteOverride_proto_set(this.swigCPtr, this, str);
    }

    public ClientAPI_RemoteOverride(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
