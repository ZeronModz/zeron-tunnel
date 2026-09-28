package defpackage;

import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.StringJsonLexer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ji0 {
    public static final InlineClassDescriptor a = n8.a("kotlinx.serialization.json.JsonUnquotedLiteral", bb1.a);

    public static final JsonPrimitive a(Number number) {
        return new JsonLiteral(number, false, null, 4, null);
    }

    public static final JsonPrimitive b(String str) {
        return str == null ? a.INSTANCE : new JsonLiteral(str, true, null, 4, null);
    }

    public static final int c(JsonPrimitive jsonPrimitive) {
        try {
            long j = new StringJsonLexer(jsonPrimitive.getC()).j();
            if (-2147483648L <= j && j <= 2147483647L) {
                return (int) j;
            }
            throw new NumberFormatException(jsonPrimitive.getC() + " is not an Int");
        } catch (JsonDecodingException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final JsonPrimitive d(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        io0.f("Element ", Reflection.a(jsonElement.getClass()), " is not a JsonPrimitive");
        return null;
    }
}
