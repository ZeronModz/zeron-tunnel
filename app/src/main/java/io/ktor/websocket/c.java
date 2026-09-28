package io.ktor.websocket;

import defpackage.ay2;
import defpackage.if3;
import io.ktor.websocket.Frame;
import kotlinx.io.Buffer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final CloseReason a(Frame.Close close) {
        byte[] bArr = close.c;
        if (bArr.length < 2) {
            return null;
        }
        Buffer buffer = new Buffer();
        ay2.y(buffer, bArr);
        return new CloseReason(buffer.readShort(), if3.H(buffer, null, 3));
    }
}
