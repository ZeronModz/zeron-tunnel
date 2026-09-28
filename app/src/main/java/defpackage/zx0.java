package defpackage;

import androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.Parser;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.y1;
import androidx.datastore.preferences.protobuf.y2;
import java.util.DesugarCollections;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class zx0 extends GeneratedMessageLite implements PreferencesProto$PreferenceMapOrBuilder {
    private static final zx0 DEFAULT_INSTANCE;
    private static volatile Parser<zx0> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private MapFieldLite<String, dy0> preferences_ = MapFieldLite.emptyMapField();

    static {
        zx0 zx0Var = new zx0();
        DEFAULT_INSTANCE = zx0Var;
        GeneratedMessageLite.n(zx0.class, zx0Var);
    }

    public static xx0 q() {
        zx0 zx0Var = DEFAULT_INSTANCE;
        zx0Var.getClass();
        return (xx0) ((y1) zx0Var.f(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER, null));
    }

    public static zx0 r(InputStream inputStream) {
        GeneratedMessageLite generatedMessageLiteM = GeneratedMessageLite.m(DEFAULT_INSTANCE, s.g(inputStream), b50.b());
        if (GeneratedMessageLite.i(generatedMessageLiteM, true)) {
            return (zx0) generatedMessageLiteM;
        }
        throw new UninitializedMessageException(generatedMessageLiteM).asInvalidProtocolBufferException().setUnfinishedMessage(generatedMessageLiteM);
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final boolean containsPreferences(String str) {
        str.getClass();
        return this.preferences_.containsKey(str);
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object f(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
        Parser defaultInstanceBasedParser;
        switch (wx0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new zx0();
            case 2:
                return new xx0(DEFAULT_INSTANCE);
            case 3:
                return new y2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", yx0.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<zx0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (zx0.class) {
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

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final Map getPreferences() {
        return DesugarCollections.unmodifiableMap(this.preferences_);
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final int getPreferencesCount() {
        return this.preferences_.size();
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final Map getPreferencesMap() {
        return DesugarCollections.unmodifiableMap(this.preferences_);
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final dy0 getPreferencesOrDefault(String str, dy0 dy0Var) {
        str.getClass();
        MapFieldLite<String, dy0> mapFieldLite = this.preferences_;
        return mapFieldLite.containsKey(str) ? mapFieldLite.get(str) : dy0Var;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final dy0 getPreferencesOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, dy0> mapFieldLite = this.preferences_;
        if (mapFieldLite.containsKey(str)) {
            return mapFieldLite.get(str);
        }
        s31.c();
        return null;
    }

    public final MapFieldLite p() {
        if (!this.preferences_.isMutable()) {
            this.preferences_ = this.preferences_.mutableCopy();
        }
        return this.preferences_;
    }
}
