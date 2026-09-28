package defpackage;

import com.google.zxing.datamatrix.encoder.a;
import com.google.zxing.datamatrix.encoder.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ee1 extends a {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ee1(int i) {
        super(2);
        this.b = i;
    }

    @Override // com.google.zxing.datamatrix.encoder.a
    public final int a(char c, StringBuilder sb) {
        switch (this.b) {
            case 0:
                if (c == ' ') {
                    sb.append((char) 3);
                } else if (c >= '0' && c <= '9') {
                    sb.append((char) (c - ','));
                } else {
                    if (c < 'a' || c > 'z') {
                        if (c < ' ') {
                            sb.append((char) 0);
                            sb.append(c);
                            return 2;
                        }
                        if (c <= '/') {
                            sb.append((char) 1);
                            sb.append((char) (c - '!'));
                            return 2;
                        }
                        if (c <= '@') {
                            sb.append((char) 1);
                            sb.append((char) (c - '+'));
                            return 2;
                        }
                        if (c >= '[' && c <= '_') {
                            sb.append((char) 1);
                            sb.append((char) (c - 'E'));
                            return 2;
                        }
                        if (c == '`') {
                            sb.append((char) 2);
                            sb.append((char) 0);
                            return 2;
                        }
                        if (c <= 'Z') {
                            sb.append((char) 2);
                            sb.append((char) (c - '@'));
                            return 2;
                        }
                        if (c > 127) {
                            sb.append("\u0001\u001e");
                            return 2 + a((char) (c - 128), sb);
                        }
                        sb.append((char) 2);
                        sb.append((char) (c - '`'));
                        return 2;
                    }
                    sb.append((char) (c - 'S'));
                }
                return 1;
            default:
                if (c == '\r') {
                    sb.append((char) 0);
                } else if (c == ' ') {
                    sb.append((char) 3);
                } else if (c == '*') {
                    sb.append((char) 1);
                } else if (c == '>') {
                    sb.append((char) 2);
                } else if (c >= '0' && c <= '9') {
                    sb.append((char) (c - ','));
                } else {
                    if (c < 'A' || c > 'Z') {
                        b.f(c);
                        throw null;
                    }
                    sb.append((char) (c - '3'));
                }
                return 1;
        }
    }

    @Override // com.google.zxing.datamatrix.encoder.a
    public void c(d20 d20Var, StringBuilder sb) {
        switch (this.b) {
            case 1:
                StringBuilder sb2 = d20Var.e;
                d20Var.c(sb2.length());
                int length = d20Var.h.b - sb2.length();
                d20Var.f -= sb.length();
                String str = d20Var.a;
                if ((str.length() - d20Var.i) - d20Var.f > 1 || length > 1 || (str.length() - d20Var.i) - d20Var.f != length) {
                    d20Var.d((char) 254);
                }
                if (d20Var.g < 0) {
                    d20Var.g = 0;
                }
                break;
            default:
                super.c(d20Var, sb);
                break;
        }
    }

    @Override // com.google.zxing.datamatrix.encoder.a, com.google.zxing.datamatrix.encoder.Encoder
    public void encode(d20 d20Var) {
        switch (this.b) {
            case 1:
                StringBuilder sb = new StringBuilder();
                while (true) {
                    if (d20Var.b()) {
                        char cA = d20Var.a();
                        d20Var.f++;
                        a(cA, sb);
                        if (sb.length() % 3 == 0) {
                            a.d(d20Var, sb);
                            if (b.n(d20Var.f, 3, d20Var.a) != 3) {
                                d20Var.g = 0;
                            }
                        }
                    }
                }
                c(d20Var, sb);
                break;
            default:
                super.encode(d20Var);
                break;
        }
    }

    @Override // com.google.zxing.datamatrix.encoder.a, com.google.zxing.datamatrix.encoder.Encoder
    public final int getEncodingMode() {
        switch (this.b) {
            case 0:
                return 2;
            default:
                return 3;
        }
    }
}
