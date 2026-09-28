package defpackage;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class z11 {
    public String a;
    public float b;
    public float c;
    public float d;

    public static void a(String str, ArrayList arrayList) {
        Object obj;
        float f;
        float f2;
        if (str == null || str.length() == 0) {
            return;
        }
        Object[] objArr = new Object[4];
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != ' ' && cCharAt != '\'') {
                float f3 = Float.NaN;
                if (cCharAt == ',') {
                    if (i < 3) {
                        objArr[i] = sb.toString();
                        sb.setLength(0);
                        i++;
                    }
                    if (i2 == 1 && (obj = objArr[0]) != null) {
                        String string = obj.toString();
                        z11 z11Var = new z11();
                        z11Var.b = Float.NaN;
                        z11Var.c = Float.NaN;
                        z11Var.d = Float.NaN;
                        z11Var.a = string;
                        arrayList.add(z11Var);
                        objArr[0] = null;
                        i = 0;
                    }
                } else if (cCharAt == '[') {
                    i2++;
                } else if (cCharAt != ']') {
                    sb.append(cCharAt);
                } else if (i2 > 0) {
                    i2--;
                    objArr[i] = sb.toString();
                    sb.setLength(0);
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        String string2 = obj2.toString();
                        try {
                            f = Float.parseFloat(objArr[1].toString());
                        } catch (Exception unused) {
                            f = Float.NaN;
                        }
                        try {
                            f2 = Float.parseFloat(objArr[2].toString());
                        } catch (Exception unused2) {
                            f2 = Float.NaN;
                        }
                        try {
                            f3 = Float.parseFloat(objArr[3].toString());
                        } catch (Exception unused3) {
                        }
                        z11 z11Var2 = new z11();
                        z11Var2.a = string2;
                        z11Var2.b = f;
                        z11Var2.c = f2;
                        z11Var2.d = f3;
                        arrayList.add(z11Var2);
                        Arrays.fill(objArr, (Object) null);
                        i = 0;
                    }
                }
            }
        }
    }

    public final String toString() {
        float f = this.d;
        float f2 = this.c;
        float f3 = this.b;
        String str = this.a;
        if (str == null || str.length() == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = (Float.isNaN(f3) && Float.isNaN(f2) && Float.isNaN(f)) ? false : true;
        if (z) {
            sb.append("[");
        }
        sb.append("'");
        sb.append(str);
        sb.append("'");
        if (!Float.isNaN(f)) {
            sb.append(",");
            if (Float.isNaN(f3)) {
                f3 = 0.0f;
            }
            sb.append(f3);
            sb.append(",");
            if (Float.isNaN(f2)) {
                f2 = 0.0f;
            }
            sb.append(f2);
            sb.append(",");
            sb.append(f);
        } else if (!Float.isNaN(f2)) {
            sb.append(",");
            if (Float.isNaN(f3)) {
                f3 = 0.0f;
            }
            sb.append(f3);
            sb.append(",");
            sb.append(f2);
        } else if (!Float.isNaN(f3)) {
            sb.append(",");
            sb.append(f3);
        }
        if (z) {
            sb.append("]");
        }
        sb.append(",");
        return sb.toString();
    }
}
