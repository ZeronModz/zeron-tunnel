package defpackage;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ts0 extends us0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ts0(boolean z, int i) {
        super(z);
        this.m = i;
    }

    @Override // defpackage.us0
    public final Object a(String str, Bundle bundle) {
        switch (this.m) {
            case 0:
                return (String) bundle.get(str);
            case 1:
                return (String[]) bundle.get(str);
            case 2:
                return (Integer) bundle.get(str);
            case 3:
                return (Integer) bundle.get(str);
            case 4:
                return (int[]) bundle.get(str);
            case 5:
                return (Long) bundle.get(str);
            case 6:
                return (long[]) bundle.get(str);
            case 7:
                return (Float) bundle.get(str);
            case 8:
                return (float[]) bundle.get(str);
            case 9:
                return (Boolean) bundle.get(str);
            default:
                return (boolean[]) bundle.get(str);
        }
    }

    @Override // defpackage.us0
    public final String b() {
        switch (this.m) {
            case 0:
                return TypedValues.Custom.S_STRING;
            case 1:
                return "string[]";
            case 2:
                return TypedValues.Custom.S_INT;
            case 3:
                return TypedValues.Custom.S_REFERENCE;
            case 4:
                return "integer[]";
            case 5:
                return "long";
            case 6:
                return "long[]";
            case 7:
                return TypedValues.Custom.S_FLOAT;
            case 8:
                return "float[]";
            case 9:
                return TypedValues.Custom.S_BOOLEAN;
            default:
                return "boolean[]";
        }
    }

    @Override // defpackage.us0
    public final Object c(String str) {
        switch (this.m) {
            case 0:
                return str;
            case 1:
                throw new UnsupportedOperationException("Arrays don't support default values.");
            case 2:
                return str.startsWith("0x") ? Integer.valueOf(Integer.parseInt(str.substring(2), 16)) : Integer.valueOf(Integer.parseInt(str));
            case 3:
                return str.startsWith("0x") ? Integer.valueOf(Integer.parseInt(str.substring(2), 16)) : Integer.valueOf(Integer.parseInt(str));
            case 4:
                throw new UnsupportedOperationException("Arrays don't support default values.");
            case 5:
                if (str.endsWith("L")) {
                    str = str.substring(0, str.length() - 1);
                }
                return str.startsWith("0x") ? Long.valueOf(Long.parseLong(str.substring(2), 16)) : Long.valueOf(Long.parseLong(str));
            case 6:
                throw new UnsupportedOperationException("Arrays don't support default values.");
            case 7:
                return Float.valueOf(Float.parseFloat(str));
            case 8:
                throw new UnsupportedOperationException("Arrays don't support default values.");
            case 9:
                if ("true".equals(str)) {
                    return Boolean.TRUE;
                }
                if ("false".equals(str)) {
                    return Boolean.FALSE;
                }
                u7.r("A boolean NavType only accepts \"true\" or \"false\" values.");
                return null;
            default:
                throw new UnsupportedOperationException("Arrays don't support default values.");
        }
    }

    @Override // defpackage.us0
    public final void d(Bundle bundle, String str, Object obj) {
        switch (this.m) {
            case 0:
                bundle.putString(str, (String) obj);
                break;
            case 1:
                bundle.putStringArray(str, (String[]) obj);
                break;
            case 2:
                bundle.putInt(str, ((Integer) obj).intValue());
                break;
            case 3:
                bundle.putInt(str, ((Integer) obj).intValue());
                break;
            case 4:
                bundle.putIntArray(str, (int[]) obj);
                break;
            case 5:
                bundle.putLong(str, ((Long) obj).longValue());
                break;
            case 6:
                bundle.putLongArray(str, (long[]) obj);
                break;
            case 7:
                bundle.putFloat(str, ((Float) obj).floatValue());
                break;
            case 8:
                bundle.putFloatArray(str, (float[]) obj);
                break;
            case 9:
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                break;
            default:
                bundle.putBooleanArray(str, (boolean[]) obj);
                break;
        }
    }
}
