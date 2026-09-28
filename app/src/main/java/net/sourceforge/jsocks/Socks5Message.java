package net.sourceforge.jsocks;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hz;
import defpackage.rz0;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class Socks5Message extends rz0 {
    public final int f;
    public byte[] g;

    public Socks5Message(InputStream inputStream, boolean z) throws IOException {
        this.e = null;
        this.g = null;
        this.a = null;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.b = dataInputStream.readUnsignedByte();
        int unsignedByte = dataInputStream.readUnsignedByte();
        this.d = unsignedByte;
        if (z && unsignedByte != 0) {
            throw new SocksException(unsignedByte);
        }
        dataInputStream.readUnsignedByte();
        int unsignedByte2 = dataInputStream.readUnsignedByte();
        this.f = unsignedByte2;
        if (unsignedByte2 == 1) {
            byte[] bArr = new byte[4];
            dataInputStream.readFully(bArr);
            String string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED + (bArr[0] & 255);
            for (int i = 1; i < 4; i++) {
                StringBuilder sbZ = hz.z(string, ".");
                sbZ.append(bArr[i] & 255);
                string = sbZ.toString();
            }
            this.e = string;
        } else if (unsignedByte2 == 3) {
            byte[] bArr2 = new byte[dataInputStream.readUnsignedByte()];
            dataInputStream.readFully(bArr2);
            this.e = new String(bArr2);
        } else {
            if (unsignedByte2 != 4) {
                throw new SocksException(393216);
            }
            dataInputStream.readFully(new byte[16]);
            this.e = null;
        }
        this.c = dataInputStream.readUnsignedShort();
        if (this.f != 3) {
            try {
                this.a = InetAddress.getByName(this.e);
            } catch (UnknownHostException unused) {
            }
        }
    }

    public final void a(OutputStream outputStream) throws IOException {
        Socks5Message socks5Message;
        byte[] bArr = this.g;
        if (bArr == null) {
            if (this.f == 3) {
                socks5Message = new Socks5Message(this.d, this.e, this.c);
            } else {
                InetAddress byName = this.a;
                if (byName == null) {
                    try {
                        byName = InetAddress.getByName(this.e);
                        this.a = byName;
                    } catch (UnknownHostException unused) {
                        throw new SocksException(393216);
                    }
                }
                socks5Message = new Socks5Message(this.d, byName, this.c);
            }
            bArr = socks5Message.g;
            this.g = bArr;
        }
        outputStream.write(bArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Socks5Message:\nVN   ");
        sb.append(this.b);
        sb.append("\nCMD  ");
        sb.append(this.d);
        sb.append("\nATYP ");
        sb.append(this.f);
        sb.append("\nADDR ");
        sb.append(this.e);
        sb.append("\nPORT ");
        return hz.q(this.c, "\n", sb);
    }

    public Socks5Message(InputStream inputStream) throws IOException {
        this(inputStream, true);
    }

    public Socks5Message(int i) {
        super(i, null, 0);
        this.g = new byte[]{5, (byte) i, 0};
    }

    public Socks5Message(int i, InetAddress inetAddress, int i2) {
        byte[] address;
        super(i, inetAddress, i2);
        this.e = inetAddress == null ? "0.0.0.0" : inetAddress.getHostName();
        this.b = 5;
        if (inetAddress == null) {
            address = new byte[]{0, 0, 0, 0};
        } else {
            address = inetAddress.getAddress();
        }
        int i3 = address.length == 4 ? 1 : 4;
        this.f = i3;
        byte[] bArr = new byte[address.length + 6];
        this.g = bArr;
        bArr[0] = 5;
        bArr[1] = (byte) this.d;
        bArr[2] = 0;
        bArr[3] = (byte) i3;
        System.arraycopy(address, 0, bArr, 4, address.length);
        byte[] bArr2 = this.g;
        bArr2[bArr2.length - 2] = (byte) (i2 >> 8);
        bArr2[bArr2.length - 1] = (byte) i2;
    }

    public Socks5Message(int i, String str, int i2) {
        super(i, null, i2);
        this.e = str;
        this.b = 5;
        this.f = 3;
        byte[] bytes = str.getBytes();
        byte[] bArr = new byte[bytes.length + 7];
        this.g = bArr;
        bArr[0] = 5;
        bArr[1] = (byte) this.d;
        bArr[2] = 0;
        bArr[3] = 3;
        bArr[4] = (byte) bytes.length;
        System.arraycopy(bytes, 0, bArr, 5, bytes.length);
        byte[] bArr2 = this.g;
        bArr2[bArr2.length - 2] = (byte) (i2 >> 8);
        bArr2[bArr2.length - 1] = (byte) i2;
    }
}
