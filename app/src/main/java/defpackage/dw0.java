package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.savedstate.serialization.SavedStateDecoder;
import androidx.savedstate.serialization.SavedStateEncoder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dw0 implements KSerializer {
    public static final dw0 a = new dw0();
    public static final SerialDescriptorImpl b = qj1.g("kotlin.collections.List<android.os.Parcelable>", new SerialDescriptor[0]);

    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ArrayList deserialize(Decoder decoder) {
        decoder.getClass();
        if (!(decoder instanceof SavedStateDecoder)) {
            zu0.e(sb2.c(b.a, decoder));
            return null;
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
        Bundle bundle = savedStateDecoder.a;
        bundle.getClass();
        String str = savedStateDecoder.c;
        ClassReference classReferenceA = Reflection.a(Parcelable.class);
        str.getClass();
        ArrayList arrayListH = Build.VERSION.SDK_INT >= 34 ? v1.h(bundle, str, k02.l(classReferenceA)) : bundle.getParcelableArrayList(str);
        if (arrayListH != null) {
            return arrayListH;
        }
        yg0.E(str);
        throw null;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void serialize(Encoder encoder, List list) {
        encoder.getClass();
        list.getClass();
        if (!(encoder instanceof SavedStateEncoder)) {
            zu0.e(sb2.f(b.a, encoder));
            return;
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
        Bundle bundle = savedStateEncoder.a;
        bundle.getClass();
        String str = savedStateEncoder.c;
        str.getClass();
        bundle.putParcelableArrayList(str, cn0.W(list));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor getD() {
        return b;
    }
}
