package io.ktor.http.parsing;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/http/parsing/OrGrammar;", "Lio/ktor/http/parsing/Grammar;", "Lio/ktor/http/parsing/ComplexGrammar;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "sourceGrammars", "<init>", "(Ljava/util/List;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OrGrammar extends Grammar implements ComplexGrammar {
    public final ArrayList a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrGrammar(List<? extends Grammar> list) {
        super(null);
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof OrGrammar) {
                c.i(arrayList, ((ComplexGrammar) obj).getGrammars());
            } else {
                arrayList.add(obj);
            }
        }
        this.a = arrayList;
    }

    @Override // io.ktor.http.parsing.ComplexGrammar
    public final List getGrammars() {
        return this.a;
    }
}
