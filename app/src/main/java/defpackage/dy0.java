package defpackage;

import androidx.datastore.preferences.PreferencesProto$Value$ValueCase;
import androidx.datastore.preferences.PreferencesProto$ValueOrBuilder;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Parser;
import androidx.datastore.preferences.protobuf.y1;
import androidx.datastore.preferences.protobuf.y2;
import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dy0 extends GeneratedMessageLite implements PreferencesProto$ValueOrBuilder {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final dy0 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile Parser<dy0> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        dy0 dy0Var = new dy0();
        DEFAULT_INSTANCE = dy0Var;
        GeneratedMessageLite.n(dy0.class, dy0Var);
    }

    public static dy0 p() {
        return DEFAULT_INSTANCE;
    }

    public static cy0 q() {
        dy0 dy0Var = DEFAULT_INSTANCE;
        dy0Var.getClass();
        return (cy0) ((y1) dy0Var.f(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER, null));
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object f(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
        Parser defaultInstanceBasedParser;
        switch (wx0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new dy0();
            case 2:
                return new cy0(DEFAULT_INSTANCE);
            case 3:
                return new y2(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", by0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<dy0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (dy0.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            default:
                p60.p();
            case 7:
                return null;
        }
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final boolean getBoolean() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final ByteString getBytes() {
        return this.valueCase_ == 8 ? (ByteString) this.value_ : ByteString.EMPTY;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final double getDouble() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final float getFloat() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final int getInteger() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final long getLong() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final String getString() {
        return this.valueCase_ == 5 ? (String) this.value_ : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final ByteString getStringBytes() {
        return ByteString.copyFromUtf8(this.valueCase_ == 5 ? (String) this.value_ : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final by0 getStringSet() {
        return this.valueCase_ == 6 ? (by0) this.value_ : by0.q();
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final PreferencesProto$Value$ValueCase getValueCase() {
        return PreferencesProto$Value$ValueCase.forNumber(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final boolean hasBoolean() {
        return this.valueCase_ == 1;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final boolean hasBytes() {
        return this.valueCase_ == 8;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final boolean hasDouble() {
        return this.valueCase_ == 7;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final boolean hasFloat() {
        return this.valueCase_ == 2;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final boolean hasInteger() {
        return this.valueCase_ == 3;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final boolean hasLong() {
        return this.valueCase_ == 4;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final boolean hasString() {
        return this.valueCase_ == 5;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final boolean hasStringSet() {
        return this.valueCase_ == 6;
    }

    public final void r(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    public final void s(ByteString byteString) {
        byteString.getClass();
        this.valueCase_ = 8;
        this.value_ = byteString;
    }

    public final void t(double d) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d);
    }

    public final void u(float f) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f);
    }

    public final void v(int i) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i);
    }

    public final void w(long j) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j);
    }

    public final void x(String str) {
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final void y(by0 by0Var) {
        this.value_ = by0Var;
        this.valueCase_ = 6;
    }
}
