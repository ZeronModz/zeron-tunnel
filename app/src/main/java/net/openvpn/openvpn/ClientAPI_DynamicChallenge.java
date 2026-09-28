package net.openvpn.openvpn;

import defpackage.s31;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ClientAPI_DynamicChallenge {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ClientAPI_DynamicChallenge() {
        this(ovpncliJNI.new_ClientAPI_DynamicChallenge(), true);
    }

    public static long getCPtr(ClientAPI_DynamicChallenge clientAPI_DynamicChallenge) {
        if (clientAPI_DynamicChallenge == null) {
            return 0L;
        }
        return clientAPI_DynamicChallenge.swigCPtr;
    }

    public static long swigRelease(ClientAPI_DynamicChallenge clientAPI_DynamicChallenge) {
        if (clientAPI_DynamicChallenge != null) {
            if (clientAPI_DynamicChallenge.swigCMemOwn) {
                long j = clientAPI_DynamicChallenge.swigCPtr;
                clientAPI_DynamicChallenge.swigCMemOwn = false;
                clientAPI_DynamicChallenge.delete();
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
                    ovpncliJNI.delete_ClientAPI_DynamicChallenge(j);
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

    public String getChallenge() {
        return ovpncliJNI.ClientAPI_DynamicChallenge_challenge_get(this.swigCPtr, this);
    }

    public boolean getEcho() {
        return ovpncliJNI.ClientAPI_DynamicChallenge_echo_get(this.swigCPtr, this);
    }

    public boolean getResponseRequired() {
        return ovpncliJNI.ClientAPI_DynamicChallenge_responseRequired_get(this.swigCPtr, this);
    }

    public String getStateID() {
        return ovpncliJNI.ClientAPI_DynamicChallenge_stateID_get(this.swigCPtr, this);
    }

    public void setChallenge(String str) {
        ovpncliJNI.ClientAPI_DynamicChallenge_challenge_set(this.swigCPtr, this, str);
    }

    public void setEcho(boolean z) {
        ovpncliJNI.ClientAPI_DynamicChallenge_echo_set(this.swigCPtr, this, z);
    }

    public void setResponseRequired(boolean z) {
        ovpncliJNI.ClientAPI_DynamicChallenge_responseRequired_set(this.swigCPtr, this, z);
    }

    public void setStateID(String str) {
        ovpncliJNI.ClientAPI_DynamicChallenge_stateID_set(this.swigCPtr, this, str);
    }

    public ClientAPI_DynamicChallenge(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
