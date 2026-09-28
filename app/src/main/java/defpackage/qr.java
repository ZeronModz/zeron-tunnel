package defpackage;

import java.util.Map;
import java.util.Set;
import kotlin.collections.b;
import kotlin.collections.d;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.Sequence;
import kotlin.sequences.TransformingSequence;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qr {
    public static final Set a = b.y(new String[]{"max-age", "expires", "domain", "path", "secure", "httponly", "$x-enc"});
    public static final Regex b = new Regex("(^|;)\\s*([^;=\\{\\}\\s]+)\\s*(=\\s*(\"[^\"]*\"|[^;]*))?");
    public static final Set c = b.y(new Character[]{';', ',', '\"'});

    public static final Map a(String str, final boolean z) {
        Sequence sequenceFindAll$default = Regex.findAll$default(b, str, 0, 2, null);
        z3 z3Var = new z3(8);
        sequenceFindAll$default.getClass();
        return d.j(new TransformingSequence(new FilteringSequence(new TransformingSequence(sequenceFindAll$default, z3Var), true, new Function1() { // from class: or
            /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r2) {
                /*
                    r1 = this;
                    kotlin.Pair r2 = (kotlin.Pair) r2
                    r2.getClass()
                    boolean r1 = r1
                    if (r1 == 0) goto L18
                    java.lang.Object r1 = r2.getFirst()
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.String r2 = "$"
                    r0 = 0
                    boolean r1 = kotlin.text.g.R(r1, r2, r0)
                    if (r1 != 0) goto L19
                L18:
                    r0 = 1
                L19:
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.or.invoke(java.lang.Object):java.lang.Object");
            }
        }), new z3(9)));
    }
}
