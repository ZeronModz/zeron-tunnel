package defpackage;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.proto.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class qz0 implements ValueEncoderContext {
    public boolean a = false;
    public boolean b = false;
    public t50 c;
    public final c d;

    public qz0(c cVar) {
        this.d = cVar;
    }

    public final void a() {
        if (this.a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(String str) {
        a();
        this.d.e(this.c, str, this.b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(float f) {
        a();
        this.d.b(this.c, f, this.b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(double d) {
        a();
        this.d.a(this.c, d, this.b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(int i) {
        a();
        this.d.c(this.c, i, this.b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(long j) {
        a();
        this.d.d(this.c, j, this.b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(boolean z) {
        a();
        this.d.c(this.c, z ? 1 : 0, this.b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(byte[] bArr) {
        a();
        this.d.e(this.c, bArr, this.b);
        return this;
    }
}
