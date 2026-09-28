package com.v2ray.ang.plugin;

import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.v2ray.ang.AngApplication;
import com.v2ray.ang.plugin.ResolvedPlugin;
import defpackage.yg0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.c;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/v2ray/ang/plugin/ResolvedPlugin;", "Lcom/v2ray/ang/plugin/Plugin;", "Landroid/content/pm/ResolveInfo;", "resolveInfo", "<init>", "(Landroid/content/pm/ResolveInfo;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ResolvedPlugin extends Plugin {
    public final ResolveInfo a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;

    public ResolvedPlugin(ResolveInfo resolveInfo) {
        resolveInfo.getClass();
        this.a = resolveInfo;
        final int i = 0;
        this.b = c.b(new Function0(this) { // from class: o31
            public final /* synthetic */ ResolvedPlugin b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ResolvedPlugin resolvedPlugin = this.b;
                switch (i2) {
                    case 0:
                        String string = ((ComponentInfo) resolvedPlugin.b()).metaData.getString("io.nekohasekai.sagernet.plugin.id");
                        if (string == null) {
                            string = null;
                        }
                        string.getClass();
                        return string;
                    case 1:
                        String str = ((ComponentInfo) resolvedPlugin.b()).packageName;
                        str.getClass();
                        return Integer.valueOf(ResolvedPlugin.c(str).versionCode);
                    default:
                        String str2 = ((ComponentInfo) resolvedPlugin.b()).packageName;
                        str2.getClass();
                        String str3 = ResolvedPlugin.c(str2).versionName;
                        str3.getClass();
                        return str3;
                }
            }
        });
        final int i2 = 1;
        this.c = c.b(new Function0(this) { // from class: o31
            public final /* synthetic */ ResolvedPlugin b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ResolvedPlugin resolvedPlugin = this.b;
                switch (i22) {
                    case 0:
                        String string = ((ComponentInfo) resolvedPlugin.b()).metaData.getString("io.nekohasekai.sagernet.plugin.id");
                        if (string == null) {
                            string = null;
                        }
                        string.getClass();
                        return string;
                    case 1:
                        String str = ((ComponentInfo) resolvedPlugin.b()).packageName;
                        str.getClass();
                        return Integer.valueOf(ResolvedPlugin.c(str).versionCode);
                    default:
                        String str2 = ((ComponentInfo) resolvedPlugin.b()).packageName;
                        str2.getClass();
                        String str3 = ResolvedPlugin.c(str2).versionName;
                        str3.getClass();
                        return str3;
                }
            }
        });
        final int i3 = 2;
        this.d = c.b(new Function0(this) { // from class: o31
            public final /* synthetic */ ResolvedPlugin b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ResolvedPlugin resolvedPlugin = this.b;
                switch (i22) {
                    case 0:
                        String string = ((ComponentInfo) resolvedPlugin.b()).metaData.getString("io.nekohasekai.sagernet.plugin.id");
                        if (string == null) {
                            string = null;
                        }
                        string.getClass();
                        return string;
                    case 1:
                        String str = ((ComponentInfo) resolvedPlugin.b()).packageName;
                        str.getClass();
                        return Integer.valueOf(ResolvedPlugin.c(str).versionCode);
                    default:
                        String str2 = ((ComponentInfo) resolvedPlugin.b()).packageName;
                        str2.getClass();
                        String str3 = ResolvedPlugin.c(str2).versionName;
                        str3.getClass();
                        return str3;
                }
            }
        });
    }

    public static PackageInfo c(String str) throws PackageManager.NameNotFoundException {
        AngApplication.c.getClass();
        AngApplication angApplication = AngApplication.d;
        if (angApplication == null) {
            yg0.N("application");
            throw null;
        }
        PackageInfo packageInfo = angApplication.getPackageManager().getPackageInfo(str, Build.VERSION.SDK_INT >= 28 ? 134217728 : 64);
        packageInfo.getClass();
        return packageInfo;
    }

    @Override // com.v2ray.ang.plugin.Plugin
    public final String a() {
        return (String) this.b.getValue();
    }

    public abstract ProviderInfo b();
}
