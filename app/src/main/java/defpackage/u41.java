package defpackage;

import android.os.IBinder;
import android.os.Parcelable;
import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import java.io.Serializable;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.ArrayClassDesc;
import kotlinx.serialization.internal.ArrayListClassDesc;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.ReferenceArraySerializer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u41 {
    public static final SerialDescriptor a = new PolymorphicSerializer(Reflection.a(CharSequence.class)).getB();
    public static final SerialDescriptor b = new PolymorphicSerializer(Reflection.a(Parcelable.class)).getB();
    public static final SerialDescriptor c = new PolymorphicSerializer(Reflection.a(Serializable.class)).getB();
    public static final SerialDescriptor d = new PolymorphicSerializer(Reflection.a(IBinder.class)).getB();
    public static final ArrayClassDesc e;
    public static final ArrayClassDesc f;
    public static final ArrayListClassDesc g;
    public static final ArrayListClassDesc h;
    public static final ArrayClassDesc i;
    public static final ArrayClassDesc j;
    public static final ArrayListClassDesc k;
    public static final ArrayListClassDesc l;
    public static final SerialDescriptor m;
    public static final SerialDescriptor n;
    public static final SerialDescriptor o;

    static {
        jv jvVar = jv.b;
        ClassReference classReferenceA = Reflection.a(Parcelable.class);
        jvVar.getClass();
        e = new ReferenceArraySerializer(classReferenceA, jvVar).c;
        f = new ReferenceArraySerializer(Reflection.a(Parcelable.class), new PolymorphicSerializer(Reflection.a(Parcelable.class))).c;
        g = new ArrayListSerializer(jvVar).b;
        h = new ArrayListSerializer(new PolymorphicSerializer(Reflection.a(Parcelable.class))).b;
        vm vmVar = vm.a;
        i = new ReferenceArraySerializer(Reflection.a(CharSequence.class), vmVar).c;
        j = new ReferenceArraySerializer(Reflection.a(CharSequence.class), new PolymorphicSerializer(Reflection.a(CharSequence.class))).c;
        k = new ArrayListSerializer(vmVar).b;
        l = new ArrayListSerializer(new PolymorphicSerializer(Reflection.a(CharSequence.class))).b;
        m = new SparseArraySerializer(jvVar).b;
        n = new SparseArraySerializer(new PolymorphicSerializer(Reflection.a(Parcelable.class))).b;
        o = new SparseArraySerializer(eg.a(new PolymorphicSerializer(Reflection.a(Parcelable.class)))).b;
    }
}
