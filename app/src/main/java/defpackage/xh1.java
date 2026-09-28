package defpackage;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class xh1 extends TypeAdapter {
    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        int iO;
        if (jsonReader.w() == JsonToken.NULL) {
            jsonReader.s();
            return null;
        }
        jsonReader.b();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (jsonReader.w() != JsonToken.END_OBJECT) {
            String strQ = jsonReader.q();
            iO = jsonReader.o();
            strQ.getClass();
            switch (strQ) {
                case "dayOfMonth":
                    i3 = iO;
                    break;
                case "minute":
                    i5 = iO;
                    break;
                case "second":
                    i6 = iO;
                    break;
                case "year":
                    i = iO;
                    break;
                case "month":
                    i2 = iO;
                    break;
                case "hourOfDay":
                    i4 = iO;
                    break;
            }
        }
        jsonReader.f();
        return new GregorianCalendar(i, i2, i3, i4, i5, i6);
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
        if (((Calendar) obj) == null) {
            jsonWriter.i();
            return;
        }
        jsonWriter.c();
        jsonWriter.g("year");
        jsonWriter.o(r4.get(1));
        jsonWriter.g("month");
        jsonWriter.o(r4.get(2));
        jsonWriter.g("dayOfMonth");
        jsonWriter.o(r4.get(5));
        jsonWriter.g("hourOfDay");
        jsonWriter.o(r4.get(11));
        jsonWriter.g("minute");
        jsonWriter.o(r4.get(12));
        jsonWriter.g("second");
        jsonWriter.o(r4.get(13));
        jsonWriter.f();
    }
}
