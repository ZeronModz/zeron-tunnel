package defpackage;

import androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder;
import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal$ProtobufList;
import androidx.datastore.preferences.protobuf.Parser;
import androidx.datastore.preferences.protobuf.y1;
import androidx.datastore.preferences.protobuf.y2;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class by0 extends GeneratedMessageLite implements PreferencesProto$StringSetOrBuilder {
    private static final by0 DEFAULT_INSTANCE;
    private static volatile Parser<by0> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private Internal$ProtobufList<String> strings_ = pz0.d;

    static {
        by0 by0Var = new by0();
        DEFAULT_INSTANCE = by0Var;
        GeneratedMessageLite.n(by0.class, by0Var);
    }

    public static by0 q() {
        return DEFAULT_INSTANCE;
    }

    public static ay0 r() {
        by0 by0Var = DEFAULT_INSTANCE;
        by0Var.getClass();
        return (ay0) ((y1) by0Var.f(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER, null));
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object f(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
        Parser defaultInstanceBasedParser;
        switch (wx0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new by0();
            case 2:
                return new ay0(DEFAULT_INSTANCE);
            case 3:
                return new y2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<by0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (by0.class) {
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

    @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
    public final String getStrings(int i) {
        return this.strings_.get(i);
    }

    @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
    public final ByteString getStringsBytes(int i) {
        return ByteString.copyFromUtf8(this.strings_.get(i));
    }

    @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
    public final int getStringsCount() {
        return this.strings_.size();
    }

    @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
    public final List getStringsList() {
        return this.strings_;
    }

    public final void p(Set set) {
        Internal$ProtobufList<String> internal$ProtobufList = this.strings_;
        if (!internal$ProtobufList.isModifiable()) {
            int size = internal$ProtobufList.size();
            this.strings_ = internal$ProtobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
        }
        AbstractMessageLite.Builder.a(set, this.strings_);
    }
}
