package defpackage;

import com.google.gson.Gson;
import com.google.gson.ToNumberStrategy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.slf4j.Marker;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class hu0 implements TypeAdapterFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hu0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (typeToken.a == Number.class) {
                    return (ju0) obj;
                }
                return null;
            case 1:
                if (typeToken.a == Object.class) {
                    return new qu0(gson, (ToNumberStrategy) obj);
                }
                return null;
            default:
                Class cls = typeToken.a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (xh1) obj;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + Marker.ANY_NON_NULL_MARKER + GregorianCalendar.class.getName() + ",adapter=" + ((xh1) this.b) + "]";
            default:
                return super.toString();
        }
    }
}
