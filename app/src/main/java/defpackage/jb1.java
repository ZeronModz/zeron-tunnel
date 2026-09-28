package defpackage;

import androidx.datastore.preferences.protobuf.StructOrBuilder;
import androidx.datastore.preferences.protobuf.g3;
import androidx.datastore.preferences.protobuf.n3;
import androidx.datastore.preferences.protobuf.y1;
import java.util.DesugarCollections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class jb1 extends y1 implements StructOrBuilder {
    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public final boolean containsFields(String str) {
        str.getClass();
        return ((g3) this.b).getFieldsMap().containsKey(str);
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public final Map getFields() {
        return getFieldsMap();
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public final int getFieldsCount() {
        return ((g3) this.b).getFieldsMap().size();
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public final Map getFieldsMap() {
        return DesugarCollections.unmodifiableMap(((g3) this.b).getFieldsMap());
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public final n3 getFieldsOrDefault(String str, n3 n3Var) {
        str.getClass();
        Map fieldsMap = ((g3) this.b).getFieldsMap();
        return fieldsMap.containsKey(str) ? (n3) fieldsMap.get(str) : n3Var;
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public final n3 getFieldsOrThrow(String str) {
        str.getClass();
        Map fieldsMap = ((g3) this.b).getFieldsMap();
        if (fieldsMap.containsKey(str)) {
            return (n3) fieldsMap.get(str);
        }
        s31.c();
        return null;
    }
}
