package net.openvpn.openvpn;

import defpackage.s31;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ClientAPI_AppCustomControlMessageEvent {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ClientAPI_AppCustomControlMessageEvent() {
        this(ovpncliJNI.new_ClientAPI_AppCustomControlMessageEvent(), true);
    }

    public static long getCPtr(ClientAPI_AppCustomControlMessageEvent clientAPI_AppCustomControlMessageEvent) {
        if (clientAPI_AppCustomControlMessageEvent == null) {
            return 0L;
        }
        return clientAPI_AppCustomControlMessageEvent.swigCPtr;
    }

    public static long swigRelease(ClientAPI_AppCustomControlMessageEvent clientAPI_AppCustomControlMessageEvent) {
        if (clientAPI_AppCustomControlMessageEvent != null) {
            if (clientAPI_AppCustomControlMessageEvent.swigCMemOwn) {
                long j = clientAPI_AppCustomControlMessageEvent.swigCPtr;
                clientAPI_AppCustomControlMessageEvent.swigCMemOwn = false;
                clientAPI_AppCustomControlMessageEvent.delete();
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
                    ovpncliJNI.delete_ClientAPI_AppCustomControlMessageEvent(j);
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

    public String getPayload() {
        return ovpncliJNI.ClientAPI_AppCustomControlMessageEvent_payload_get(this.swigCPtr, this);
    }

    public String getProtocol() {
        return ovpncliJNI.ClientAPI_AppCustomControlMessageEvent_protocol_get(this.swigCPtr, this);
    }

    public void setPayload(String str) {
        ovpncliJNI.ClientAPI_AppCustomControlMessageEvent_payload_set(this.swigCPtr, this, str);
    }

    public void setProtocol(String str) {
        ovpncliJNI.ClientAPI_AppCustomControlMessageEvent_protocol_set(this.swigCPtr, this, str);
    }

    public ClientAPI_AppCustomControlMessageEvent(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
