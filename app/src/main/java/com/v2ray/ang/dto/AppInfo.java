package com.v2ray.ang.dto;

import android.graphics.drawable.Drawable;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hz;
import defpackage.vh;
import defpackage.yg0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0012R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/v2ray/ang/dto/AppInfo;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "appName", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "packageName", "appIcon", "Landroid/graphics/drawable/Drawable;", "isSystemApp", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "isSelected", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;ZI)V", "getAppName", "()Ljava/lang/String;", "getPackageName", "getAppIcon", "()Landroid/graphics/drawable/Drawable;", "()Z", "()I", "setSelected", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AppInfo {
    private final Drawable appIcon;
    private final String appName;
    private int isSelected;
    private final boolean isSystemApp;
    private final String packageName;

    public AppInfo(String str, String str2, Drawable drawable, boolean z, int i) {
        str.getClass();
        str2.getClass();
        drawable.getClass();
        this.appName = str;
        this.packageName = str2;
        this.appIcon = drawable;
        this.isSystemApp = z;
        this.isSelected = i;
    }

    public static /* synthetic */ AppInfo copy$default(AppInfo appInfo, String str, String str2, Drawable drawable, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = appInfo.appName;
        }
        if ((i2 & 2) != 0) {
            str2 = appInfo.packageName;
        }
        if ((i2 & 4) != 0) {
            drawable = appInfo.appIcon;
        }
        if ((i2 & 8) != 0) {
            z = appInfo.isSystemApp;
        }
        if ((i2 & 16) != 0) {
            i = appInfo.isSelected;
        }
        int i3 = i;
        Drawable drawable2 = drawable;
        return appInfo.copy(str, str2, drawable2, z, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Drawable getAppIcon() {
        return this.appIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsSystemApp() {
        return this.isSystemApp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getIsSelected() {
        return this.isSelected;
    }

    public final AppInfo copy(String appName, String packageName, Drawable appIcon, boolean isSystemApp, int isSelected) {
        appName.getClass();
        packageName.getClass();
        appIcon.getClass();
        return new AppInfo(appName, packageName, appIcon, isSystemApp, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppInfo)) {
            return false;
        }
        AppInfo appInfo = (AppInfo) other;
        return yg0.a(this.appName, appInfo.appName) && yg0.a(this.packageName, appInfo.packageName) && yg0.a(this.appIcon, appInfo.appIcon) && this.isSystemApp == appInfo.isSystemApp && this.isSelected == appInfo.isSelected;
    }

    public final Drawable getAppIcon() {
        return this.appIcon;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return ((((this.appIcon.hashCode() + vh.c(this.appName.hashCode() * 31, 31, this.packageName)) * 31) + (this.isSystemApp ? 1231 : 1237)) * 31) + this.isSelected;
    }

    public final int isSelected() {
        return this.isSelected;
    }

    public final boolean isSystemApp() {
        return this.isSystemApp;
    }

    public final void setSelected(int i) {
        this.isSelected = i;
    }

    public String toString() {
        String str = this.appName;
        String str2 = this.packageName;
        Drawable drawable = this.appIcon;
        boolean z = this.isSystemApp;
        int i = this.isSelected;
        StringBuilder sbA = hz.A("AppInfo(appName=", str, ", packageName=", str2, ", appIcon=");
        sbA.append(drawable);
        sbA.append(", isSystemApp=");
        sbA.append(z);
        sbA.append(", isSelected=");
        return hz.q(i, ")", sbA);
    }
}
