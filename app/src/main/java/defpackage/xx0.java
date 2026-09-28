package defpackage;

import androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder;
import androidx.datastore.preferences.protobuf.y1;
import java.util.DesugarCollections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xx0 extends y1 implements PreferencesProto$PreferenceMapOrBuilder {
    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final boolean containsPreferences(String str) {
        str.getClass();
        return ((zx0) this.b).getPreferencesMap().containsKey(str);
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final Map getPreferences() {
        return getPreferencesMap();
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final int getPreferencesCount() {
        return ((zx0) this.b).getPreferencesMap().size();
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final Map getPreferencesMap() {
        return DesugarCollections.unmodifiableMap(((zx0) this.b).getPreferencesMap());
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final dy0 getPreferencesOrDefault(String str, dy0 dy0Var) {
        str.getClass();
        Map preferencesMap = ((zx0) this.b).getPreferencesMap();
        return preferencesMap.containsKey(str) ? (dy0) preferencesMap.get(str) : dy0Var;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final dy0 getPreferencesOrThrow(String str) {
        str.getClass();
        Map preferencesMap = ((zx0) this.b).getPreferencesMap();
        if (preferencesMap.containsKey(str)) {
            return (dy0) preferencesMap.get(str);
        }
        s31.c();
        return null;
    }
}
