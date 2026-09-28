package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l51 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SealedClassSerializer b;

    public /* synthetic */ l51(SealedClassSerializer sealedClassSerializer, int i) {
        this.a = i;
        this.b = sealedClassSerializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        mk1 mk1Var = mk1.a;
        SealedClassSerializer sealedClassSerializer = this.b;
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder = (ClassSerialDescriptorBuilder) obj;
        switch (i) {
            case 0:
                classSerialDescriptorBuilder.getClass();
                ClassSerialDescriptorBuilder.a(classSerialDescriptorBuilder, "type", bb1.b);
                ClassSerialDescriptorBuilder.a(classSerialDescriptorBuilder, "value", qj1.h("kotlinx.serialization.Sealed<" + sealedClassSerializer.a.getSimpleName() + '>', d61.a, new SerialDescriptor[0], new l51(sealedClassSerializer, 1)));
                List list = sealedClassSerializer.b;
                list.getClass();
                classSerialDescriptorBuilder.b = list;
                break;
            default:
                classSerialDescriptorBuilder.getClass();
                for (Map.Entry entry : sealedClassSerializer.e.entrySet()) {
                    ClassSerialDescriptorBuilder.a(classSerialDescriptorBuilder, (String) entry.getKey(), ((KSerializer) entry.getValue()).getB());
                }
                break;
        }
        return mk1Var;
    }
}
