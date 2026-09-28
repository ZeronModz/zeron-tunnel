package defpackage;

import android.os.Bundle;
import androidx.savedstate.serialization.SavedStateDecoder;
import androidx.savedstate.serialization.SavedStateEncoder;
import com.google.android.gms.ads.RequestConfiguration;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class v41 implements KSerializer {
    public static final v41 a = new v41();
    public static final SerialDescriptorImpl b = qj1.g("androidx.savedstate.SavedState", new SerialDescriptor[0]);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        if (!(decoder instanceof SavedStateDecoder)) {
            zu0.e(sb2.c(b.a, decoder));
            return null;
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
        boolean zA = yg0.a(savedStateDecoder.c, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        Bundle bundle = savedStateDecoder.a;
        if (zA) {
            return bundle;
        }
        bundle.getClass();
        return xg0.k(savedStateDecoder.c, bundle);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor getD() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        Bundle bundle = (Bundle) obj;
        encoder.getClass();
        bundle.getClass();
        if (!(encoder instanceof SavedStateEncoder)) {
            zu0.e(sb2.f(b.a, encoder));
            return;
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
        boolean zA = yg0.a(savedStateEncoder.c, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        Bundle bundle2 = savedStateEncoder.a;
        if (zA) {
            bundle2.getClass();
            bundle2.putAll(bundle);
        } else {
            bundle2.getClass();
            String str = savedStateEncoder.c;
            str.getClass();
            bundle2.putBundle(str, bundle);
        }
    }
}
