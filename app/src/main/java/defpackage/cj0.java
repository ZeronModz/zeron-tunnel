package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.json.NumberedEnum;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class cj0 implements ObjectEncoderContext, ValueEncoderContext {
    public cj0 a = null;
    public boolean b = true;
    public final JsonWriter c;
    public final Map d;
    public final Map e;
    public final ObjectEncoder f;
    public final boolean g;

    public cj0(cj0 cj0Var) {
        this.c = cj0Var.c;
        this.d = cj0Var.d;
        this.e = cj0Var.e;
        this.f = cj0Var.f;
        this.g = cj0Var.g;
    }

    public final cj0 a(Object obj, String str) throws IOException {
        boolean z = this.g;
        JsonWriter jsonWriter = this.c;
        if (z) {
            if (obj == null) {
                return this;
            }
            c();
            jsonWriter.name(str);
            b(obj, false);
            return this;
        }
        c();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        b(obj, false);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(byte[] bArr) throws IOException {
        c();
        JsonWriter jsonWriter = this.c;
        if (bArr == null) {
            jsonWriter.nullValue();
            return this;
        }
        jsonWriter.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    public final cj0 b(Object obj, boolean z) {
        if (z && (obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number))) {
            throw new EncodingException((obj == null ? null : obj.getClass()) + " cannot be encoded inline");
        }
        JsonWriter jsonWriter = this.c;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        int i = 0;
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                c();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            jsonWriter.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    jsonWriter.value(r6[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    long j = jArr[i];
                    c();
                    jsonWriter.value(j);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    jsonWriter.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    jsonWriter.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    b(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    b(obj2, false);
                }
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Collection) {
            jsonWriter.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                b(it.next(), false);
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    a(entry.getValue(), (String) key);
                } catch (ClassCastException e) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            jsonWriter.endObject();
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.d.get(obj.getClass());
        if (objectEncoder != null) {
            if (!z) {
                jsonWriter.beginObject();
            }
            objectEncoder.encode(obj, this);
            if (!z) {
                jsonWriter.endObject();
                return this;
            }
        } else {
            ValueEncoder valueEncoder = (ValueEncoder) this.e.get(obj.getClass());
            if (valueEncoder != null) {
                valueEncoder.encode(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                if (obj instanceof NumberedEnum) {
                    int number2 = ((NumberedEnum) obj).getNumber();
                    c();
                    jsonWriter.value(number2);
                    return this;
                }
                String strName = ((Enum) obj).name();
                c();
                jsonWriter.value(strName);
                return this;
            }
            if (!z) {
                jsonWriter.beginObject();
            }
            this.f.encode(obj, this);
            if (!z) {
                jsonWriter.endObject();
            }
        }
        return this;
    }

    public final void c() {
        if (!this.b) {
            u7.p("Parent context used since this context was created. Cannot use this context anymore.");
            return;
        }
        cj0 cj0Var = this.a;
        if (cj0Var != null) {
            cj0Var.c();
            this.a.b = false;
            this.a = null;
            this.c.endObject();
        }
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext inline(Object obj) {
        b(obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(String str) throws IOException {
        c();
        this.a = new cj0(this);
        JsonWriter jsonWriter = this.c;
        jsonWriter.name(str);
        jsonWriter.beginObject();
        return this.a;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(t50 t50Var, double d) throws IOException {
        String str = t50Var.a;
        c();
        JsonWriter jsonWriter = this.c;
        jsonWriter.name(str);
        c();
        jsonWriter.value(d);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(t50 t50Var) {
        return nested(t50Var.a);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(t50 t50Var, float f) throws IOException {
        String str = t50Var.a;
        double d = f;
        c();
        JsonWriter jsonWriter = this.c;
        jsonWriter.name(str);
        c();
        jsonWriter.value(d);
        return this;
    }

    public cj0(Writer writer, HashMap map, HashMap map2, gi0 gi0Var, boolean z) {
        this.c = new JsonWriter(writer);
        this.d = map;
        this.e = map2;
        this.f = gi0Var;
        this.g = z;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(t50 t50Var, int i) throws IOException {
        String str = t50Var.a;
        c();
        JsonWriter jsonWriter = this.c;
        jsonWriter.name(str);
        c();
        jsonWriter.value(i);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(t50 t50Var, long j) throws IOException {
        String str = t50Var.a;
        c();
        JsonWriter jsonWriter = this.c;
        jsonWriter.name(str);
        c();
        jsonWriter.value(j);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(t50 t50Var, Object obj) throws IOException {
        a(obj, t50Var.a);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(t50 t50Var, boolean z) throws IOException {
        String str = t50Var.a;
        c();
        JsonWriter jsonWriter = this.c;
        jsonWriter.name(str);
        c();
        jsonWriter.value(z);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, double d) throws IOException {
        c();
        JsonWriter jsonWriter = this.c;
        jsonWriter.name(str);
        c();
        jsonWriter.value(d);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, int i) throws IOException {
        c();
        JsonWriter jsonWriter = this.c;
        jsonWriter.name(str);
        c();
        jsonWriter.value(i);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, long j) throws IOException {
        c();
        JsonWriter jsonWriter = this.c;
        jsonWriter.name(str);
        c();
        jsonWriter.value(j);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, boolean z) throws IOException {
        c();
        JsonWriter jsonWriter = this.c;
        jsonWriter.name(str);
        c();
        jsonWriter.value(z);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(String str) throws IOException {
        c();
        this.c.value(str);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(float f) throws IOException {
        c();
        this.c.value(f);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(double d) throws IOException {
        c();
        this.c.value(d);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(int i) throws IOException {
        c();
        this.c.value(i);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(long j) throws IOException {
        c();
        this.c.value(j);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(boolean z) throws IOException {
        c();
        this.c.value(z);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* bridge */ /* synthetic */ ObjectEncoderContext add(String str, Object obj) throws IOException {
        a(obj, str);
        return this;
    }
}
