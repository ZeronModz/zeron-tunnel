package defpackage;

import java.util.Set;
import kotlin.collections.b;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class pc0 {
    public static final Set a = b.y(new Character[]{'(', ')', '<', '>', '@', ',', ';', ':', '\\', '\"', '/', '[', ']', '?', '=', '{', '}', ' ', '\t', '\n', '\r'});

    public static final boolean a(String str) {
        if (str.length() != 0) {
            if (str.length() >= 2) {
                if (str.length() == 0) {
                    s31.k("Char sequence is empty.");
                    return false;
                }
                if (str.charAt(0) == '\"' && g.C(str) == '\"') {
                    int i = 1;
                    do {
                        int iY = g.y(str, '\"', i, 4);
                        if (iY == str.length() - 1) {
                            break;
                        }
                        int i2 = 0;
                        for (int i3 = iY - 1; str.charAt(i3) == '\\'; i3--) {
                            i2++;
                        }
                        if (i2 % 2 != 0) {
                            i = iY + 1;
                        }
                    } while (i < str.length());
                    return false;
                }
            }
            int length = str.length();
            for (int i4 = 0; i4 < length; i4++) {
                if (!a.contains(Character.valueOf(str.charAt(i4)))) {
                }
            }
            return false;
        }
        return true;
    }

    public static final String b(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\"') {
                sb.append("\\\"");
            } else if (cCharAt != '\\') {
                sb.append(cCharAt);
            } else {
                sb.append("\\\\");
            }
        }
        sb.append("\"");
        return sb.toString();
    }
}
