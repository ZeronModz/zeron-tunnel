package defpackage;

import android.os.Bundle;
import androidx.savedstate.serialization.SavedStateDecoder;
import androidx.savedstate.serialization.SavedStateEncoder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class vm implements KSerializer {
    public static final vm a = new vm();
    public static final SerialDescriptorImpl b = qj1.g("kotlin.CharSequence", new SerialDescriptor[0]);

    public static CharSequence a(Decoder decoder) {
        decoder.getClass();
        if (!(decoder instanceof SavedStateDecoder)) {
            zu0.e(sb2.c(b.a, decoder));
            return null;
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
        Bundle bundle = savedStateDecoder.a;
        bundle.getClass();
        String str = savedStateDecoder.c;
        str.getClass();
        CharSequence charSequence = bundle.getCharSequence(str);
        if (charSequence != null) {
            return charSequence;
        }
        yg0.E(str);
        throw null;
    }

    public static void b(Encoder encoder, CharSequence charSequence) {
        encoder.getClass();
        charSequence.getClass();
        if (!(encoder instanceof SavedStateEncoder)) {
            zu0.e(sb2.f(b.a, encoder));
            return;
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
        Bundle bundle = savedStateEncoder.a;
        bundle.getClass();
        String str = savedStateEncoder.c;
        str.getClass();
        bundle.putCharSequence(str, charSequence);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return a(decoder);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, (CharSequence) obj);
    }
}
