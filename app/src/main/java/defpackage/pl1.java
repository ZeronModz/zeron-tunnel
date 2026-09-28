package defpackage;

import androidx.emoji2.text.flatbuffer.Utf8Old;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pl1 implements Supplier {
    @Override // java.util.function.Supplier
    public final Object get() {
        int i = Utf8Old.b;
        ed1 ed1Var = new ed1(4);
        Charset charset = StandardCharsets.UTF_8;
        charset.newEncoder();
        charset.newDecoder();
        return ed1Var;
    }
}
