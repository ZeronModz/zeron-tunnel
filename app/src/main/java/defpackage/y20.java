package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.EnumDescriptor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y20 implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y20(int i, String str, EnumDescriptor enumDescriptor) {
        this.b = i;
        this.c = str;
        this.d = enumDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.d;
        Serializable serializable = this.c;
        switch (i) {
            case 0:
                String str = (String) serializable;
                EnumDescriptor enumDescriptor = (EnumDescriptor) obj;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    serialDescriptorArr[i3] = qj1.i(str + '.' + enumDescriptor.e[i3], ob1.a, new SerialDescriptor[0]);
                }
                return serialDescriptorArr;
            default:
                return ((Regex) serializable).find((CharSequence) obj, i2);
        }
    }

    public /* synthetic */ y20(Regex regex, CharSequence charSequence, int i) {
        this.c = regex;
        this.d = charSequence;
        this.b = i;
    }
}
