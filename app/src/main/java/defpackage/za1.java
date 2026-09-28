package defpackage;

import java.util.Objects;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class za1 extends Writer {
    public final /* synthetic */ int a;
    public final StringBuilder b;
    public final CharSequence c;

    public za1(int i, StringBuilder sb) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = new ya1(1);
                this.b = sb;
                break;
            default:
                this.c = new ya1(0);
                this.b = sb;
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        int i = this.a;
        StringBuilder sb = this.b;
        switch (i) {
            case 0:
                sb.append(charSequence);
                break;
            default:
                sb.append(charSequence);
                break;
        }
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        int i = this.a;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        int i3 = this.a;
        StringBuilder sb = this.b;
        CharSequence charSequence = this.c;
        switch (i3) {
            case 0:
                ya1 ya1Var = (ya1) charSequence;
                ya1Var.b = cArr;
                ya1Var.c = null;
                sb.append((CharSequence) ya1Var, i, i2 + i);
                break;
            default:
                ya1 ya1Var2 = (ya1) charSequence;
                ya1Var2.b = cArr;
                ya1Var2.c = null;
                sb.append((CharSequence) ya1Var2, i, i2 + i);
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        switch (this.a) {
            case 0:
                this.b.append(charSequence);
                break;
            default:
                append(charSequence);
                break;
        }
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        int i3 = this.a;
        StringBuilder sb = this.b;
        switch (i3) {
            case 0:
                sb.append(charSequence, i, i2);
                break;
            default:
                sb.append(charSequence, i, i2);
                break;
        }
        return this;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        switch (this.a) {
            case 0:
                this.b.append(charSequence, i, i2);
                break;
            default:
                append(charSequence, i, i2);
                break;
        }
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        int i3 = this.a;
        StringBuilder sb = this.b;
        switch (i3) {
            case 0:
                Objects.requireNonNull(str);
                sb.append((CharSequence) str, i, i2 + i);
                break;
            default:
                Objects.requireNonNull(str);
                sb.append((CharSequence) str, i, i2 + i);
                break;
        }
    }

    @Override // java.io.Writer
    public final void write(int i) {
        int i2 = this.a;
        StringBuilder sb = this.b;
        switch (i2) {
            case 0:
                sb.append((char) i);
                break;
            default:
                sb.append((char) i);
                break;
        }
    }
}
