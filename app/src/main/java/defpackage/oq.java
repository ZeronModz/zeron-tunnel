package defpackage;

import com.google.android.datatransport.Transformer;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.gson.JsonIOException;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.internal.ObjectConstructor;
import java.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oq implements ObjectConstructor, Transformer, ComponentFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ oq(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ Path d(Object obj) {
        return (Path) obj;
    }

    public static /* synthetic */ void e(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new JsonIOException(str + ((Object) obj.toString()));
    }

    public static /* synthetic */ void g(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void k(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void l(Object obj, String str) throws InvalidKeySpecException {
        throw new InvalidKeySpecException(str + obj);
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        eu.c.getClass();
        return CrashlyticsReportJsonTransform.a.encode((CrashlyticsReport) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        switch (this.a) {
            case 4:
                return new LinkedTreeMap();
            case 5:
                return new LinkedHashMap();
            case 6:
                return new TreeMap();
            case 7:
                return new ConcurrentHashMap();
            case 8:
                return new ConcurrentSkipListMap();
            case 9:
                return new ArrayList();
            case 10:
                return new LinkedHashSet();
            case 11:
                return new TreeSet();
            default:
                return new ArrayDeque();
        }
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object create(ComponentContainer componentContainer) {
        Set of = componentContainer.setOf(rb.class);
        rb0 rb0Var = rb0.c;
        if (rb0Var == null) {
            synchronized (rb0.class) {
                try {
                    rb0Var = rb0.c;
                    if (rb0Var == null) {
                        rb0Var = new rb0();
                        rb0.c = rb0Var;
                    }
                } finally {
                }
            }
        }
        return new xv(of, rb0Var);
    }
}
