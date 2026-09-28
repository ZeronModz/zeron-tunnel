package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.savedstate.serialization.SavedStateDecoder;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cw0 implements KSerializer {
    public static final SerialDescriptorImpl a = qj1.g("kotlin.Array<android.os.Parcelable>", new SerialDescriptor[0]);

    public static Parcelable[] a(Decoder decoder) {
        decoder.getClass();
        if (!(decoder instanceof SavedStateDecoder)) {
            zu0.e(sb2.c(a.a, decoder));
            return null;
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
        Bundle bundle = savedStateDecoder.a;
        bundle.getClass();
        String str = savedStateDecoder.c;
        ClassReference classReferenceA = Reflection.a(Parcelable.class);
        str.getClass();
        Parcelable[] parcelableArray = Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) v1.g(bundle, str, k02.l(classReferenceA)) : bundle.getParcelableArray(str);
        if (parcelableArray == null) {
            parcelableArray = null;
        }
        if (parcelableArray != null) {
            return parcelableArray;
        }
        yg0.E(str);
        throw null;
    }
}
