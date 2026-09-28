package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.MethodOrBuilder;
import androidx.datastore.preferences.protobuf.Syntax;
import androidx.datastore.preferences.protobuf.p2;
import androidx.datastore.preferences.protobuf.w2;
import androidx.datastore.preferences.protobuf.y1;
import java.util.DesugarCollections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gq0 extends y1 implements MethodOrBuilder {
    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final String getName() {
        return ((p2) this.b).getName();
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final ByteString getNameBytes() {
        return ((p2) this.b).getNameBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final w2 getOptions(int i) {
        return ((p2) this.b).getOptions(i);
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final int getOptionsCount() {
        return ((p2) this.b).getOptionsCount();
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final List getOptionsList() {
        return DesugarCollections.unmodifiableList(((p2) this.b).getOptionsList());
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final boolean getRequestStreaming() {
        return ((p2) this.b).getRequestStreaming();
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final String getRequestTypeUrl() {
        return ((p2) this.b).getRequestTypeUrl();
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final ByteString getRequestTypeUrlBytes() {
        return ((p2) this.b).getRequestTypeUrlBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final boolean getResponseStreaming() {
        return ((p2) this.b).getResponseStreaming();
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final String getResponseTypeUrl() {
        return ((p2) this.b).getResponseTypeUrl();
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final ByteString getResponseTypeUrlBytes() {
        return ((p2) this.b).getResponseTypeUrlBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final Syntax getSyntax() {
        return ((p2) this.b).getSyntax();
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public final int getSyntaxValue() {
        return ((p2) this.b).getSyntaxValue();
    }
}
