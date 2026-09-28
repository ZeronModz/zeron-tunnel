package defpackage;

import com.google.zxing.Dimension;
import com.google.zxing.datamatrix.encoder.SymbolInfo;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d20 {
    public final String a;
    public SymbolShapeHint b;
    public Dimension c;
    public Dimension d;
    public final StringBuilder e;
    public int f;
    public int g;
    public SymbolInfo h;
    public int i;

    public d20(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                u7.r("Message contains characters outside ISO-8859-1 encoding.");
                throw null;
            }
            sb.append(c);
        }
        this.a = sb.toString();
        this.b = SymbolShapeHint.FORCE_NONE;
        this.e = new StringBuilder(str.length());
        this.g = -1;
    }

    public final char a() {
        return this.a.charAt(this.f);
    }

    public final boolean b() {
        return this.f < this.a.length() - this.i;
    }

    public final void c(int i) {
        SymbolInfo symbolInfo = this.h;
        if (symbolInfo == null || i > symbolInfo.b) {
            this.h = SymbolInfo.f(i, this.b, this.c, this.d);
        }
    }

    public final void d(char c) {
        this.e.append(c);
    }
}
