package com.trilead.ssh2.packets;

import defpackage.hz;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PacketSignal {
    private static final Map<Integer, String> SIGNALS;
    byte[] payload;
    public int recipientChannelID;
    public String signalName;

    static {
        HashMap map = new HashMap();
        SIGNALS = map;
        map.put(14, "ALRM");
        map.put(1, "HUP");
        map.put(2, "INT");
        map.put(9, "KILL");
        map.put(13, "PIPE");
        map.put(15, "TERM");
        map.put(6, "ABRT");
        map.put(8, "FPE");
        map.put(4, "ILL");
        map.put(3, "QUIT");
        map.put(11, "SEGV");
        map.put(5, "TRAP");
    }

    public PacketSignal(int i, String str) {
        this.recipientChannelID = i;
        this.signalName = str.startsWith("SIG") ? str.substring(3) : str;
    }

    public static String strsignal(int i) {
        return SIGNALS.get(Integer.valueOf(i));
    }

    public byte[] getPayload() {
        byte[] bArr = this.payload;
        if (bArr != null) {
            return bArr;
        }
        TypesWriter typesWriterM = hz.m(98);
        typesWriterM.writeUINT32(this.recipientChannelID);
        typesWriterM.writeString("signal");
        typesWriterM.writeBoolean(false);
        typesWriterM.writeString(this.signalName);
        byte[] bytes = typesWriterM.getBytes();
        this.payload = bytes;
        return bytes;
    }
}
