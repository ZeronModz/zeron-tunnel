package com.v2ray.ang.plugin;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.AngApplication;
import defpackage.yg0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/v2ray/ang/plugin/PluginList;", "Ljava/util/ArrayList;", "Lcom/v2ray/ang/plugin/Plugin;", "Lkotlin/collections/ArrayList;", "<init>", "()V", "lookup", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "getLookup", "()Ljava/util/Map;", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PluginList extends ArrayList<Plugin> {
    private final Map<String, Plugin> lookup;

    public PluginList() {
        AngApplication.c.getClass();
        AngApplication angApplication = AngApplication.d;
        if (angApplication == null) {
            yg0.N("application");
            throw null;
        }
        List<ResolveInfo> listQueryIntentContentProviders = angApplication.getPackageManager().queryIntentContentProviders(new Intent("io.nekohasekai.sagernet.plugin.ACTION_NATIVE_PLUGIN"), 128);
        listQueryIntentContentProviders.getClass();
        ArrayList<ResolveInfo> arrayList = new ArrayList();
        for (Object obj : listQueryIntentContentProviders) {
            if (((ResolveInfo) obj).providerInfo.exported) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c.l(arrayList, 10));
        for (ResolveInfo resolveInfo : arrayList) {
            resolveInfo.getClass();
            arrayList2.add(new NativePlugin(resolveInfo));
        }
        addAll(arrayList2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Plugin plugin : c.R(this)) {
            lookup$lambda$2$check(plugin, this, (Plugin) linkedHashMap.put(plugin.a(), plugin));
        }
        this.lookup = linkedHashMap;
    }

    private static final void lookup$lambda$2$check(Plugin plugin, PluginList pluginList, Plugin plugin2) {
        if (plugin2 == null || plugin2.equals(plugin)) {
            return;
        }
        pluginList.remove((Object) plugin2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Plugin) {
            return contains((Plugin) obj);
        }
        return false;
    }

    public final Map<String, Plugin> getLookup() {
        return this.lookup;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Plugin) {
            return indexOf((Plugin) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Plugin) {
            return lastIndexOf((Plugin) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Plugin) {
            return remove((Plugin) obj);
        }
        return false;
    }

    public /* bridge */ Plugin removeAt(int i) {
        return remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public /* bridge */ boolean contains(Plugin plugin) {
        return super.contains((Object) plugin);
    }

    public /* bridge */ int indexOf(Plugin plugin) {
        return super.indexOf((Object) plugin);
    }

    public /* bridge */ int lastIndexOf(Plugin plugin) {
        return super.lastIndexOf((Object) plugin);
    }

    public /* bridge */ boolean remove(Plugin plugin) {
        return super.remove((Object) plugin);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ Plugin remove(int i) {
        return removeAt(i);
    }
}
