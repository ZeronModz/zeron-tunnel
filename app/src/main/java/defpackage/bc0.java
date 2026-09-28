package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class bc0 extends TypeAdapter {
    public final /* synthetic */ int a;

    public /* synthetic */ bc0(int i) {
        this.a = i;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        switch (this.a) {
            case 0:
                if (jsonReader.w() != JsonToken.NULL) {
                    return Double.valueOf(jsonReader.n());
                }
                jsonReader.s();
                return null;
            case 1:
                if (jsonReader.w() != JsonToken.NULL) {
                    return Float.valueOf((float) jsonReader.n());
                }
                jsonReader.s();
                return null;
            default:
                jsonReader.D();
                return null;
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    Gson.a(dDoubleValue);
                    jsonWriter.n(dDoubleValue);
                } else {
                    jsonWriter.i();
                }
                break;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    Gson.a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    jsonWriter.q(numberValueOf);
                } else {
                    jsonWriter.i();
                }
                break;
            default:
                jsonWriter.i();
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
