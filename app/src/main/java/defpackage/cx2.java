package defpackage;

import androidx.datastore.core.Serializer;
import com.google.android.gms.internal.ads.j5;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class cx2 implements Serializer {
    public static final cx2 a = new cx2();
    public static final j5 b;

    static {
        j5 j5VarY = j5.y();
        j5VarY.getClass();
        b = j5VarY;
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object getDefaultValue() {
        return b;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, Continuation continuation) {
        try {
            return j5.x(inputStream);
        } catch (Exception unused) {
            return b;
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) throws IOException {
        ((j5) obj).zzaO(outputStream);
        return mk1.a;
    }
}
