package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import androidx.savedstate.serialization.SavedStateDecoder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class se0 implements KSerializer {
    public static final SerialDescriptorImpl a = qj1.g("android.os.IBinder", new SerialDescriptor[0]);

    public static IBinder a(Decoder decoder) {
        decoder.getClass();
        if (!(decoder instanceof SavedStateDecoder)) {
            zu0.e(sb2.c(a.a, decoder));
            return null;
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
        Bundle bundle = savedStateDecoder.a;
        bundle.getClass();
        String str = savedStateDecoder.c;
        str.getClass();
        IBinder binder = bundle.getBinder(str);
        if (binder != null) {
            return binder;
        }
        yg0.E(str);
        throw null;
    }
}
