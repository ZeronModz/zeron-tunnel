package org.spongycastle.util.io.pem;

import defpackage.p60;
import defpackage.vh;
import java.io.BufferedReaderRetargetInterface;
import java.io.DesugarBufferedReader;
import java.util.stream.Stream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import org.spongycastle.util.encoders.Base64;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PemReader extends BufferedReader implements BufferedReaderRetargetInterface {
    private static final String BEGIN = "-----BEGIN ";
    private static final String END = "-----END ";

    public PemReader(Reader reader) {
        super(reader);
    }

    private PemObject loadObject(String str) throws IOException {
        String line;
        String strL = vh.l(END, str);
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        while (true) {
            line = readLine();
            if (line == null) {
                break;
            }
            if (line.indexOf(":") >= 0) {
                int iIndexOf = line.indexOf(58);
                arrayList.add(new PemHeader(line.substring(0, iIndexOf), line.substring(iIndexOf + 1).trim()));
            } else {
                if (line.indexOf(strL) != -1) {
                    break;
                }
                sb.append(line.trim());
            }
        }
        if (line != null) {
            return new PemObject(str, arrayList, Base64.decode(sb.toString()));
        }
        p60.f(strL.concat(" not found"));
        return null;
    }

    @Override // java.io.BufferedReader, java.io.BufferedReaderRetargetInterface
    public /* synthetic */ Stream lines() {
        return DesugarBufferedReader.lines(this);
    }

    public PemObject readPemObject() throws IOException {
        String line = readLine();
        while (line != null && !line.startsWith(BEGIN)) {
            line = readLine();
        }
        if (line == null) {
            return null;
        }
        String strSubstring = line.substring(11);
        int iIndexOf = strSubstring.indexOf(45);
        String strSubstring2 = strSubstring.substring(0, iIndexOf);
        if (iIndexOf > 0) {
            return loadObject(strSubstring2);
        }
        return null;
    }
}
