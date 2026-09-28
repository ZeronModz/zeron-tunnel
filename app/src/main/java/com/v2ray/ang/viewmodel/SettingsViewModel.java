package com.v2ray.ang.viewmodel;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.lifecycle.AndroidViewModel;
import androidx.preference.PreferenceManager;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\tJ!\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/v2ray/ang/viewmodel/SettingsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lmk1;", "startListenPreferenceChange", "()V", "onCleared", "Landroid/content/SharedPreferences;", "sharedPreferences", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "key", "onSharedPreferenceChanged", "(Landroid/content/SharedPreferences;Ljava/lang/String;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SettingsViewModel extends AndroidViewModel implements SharedPreferences.OnSharedPreferenceChangeListener {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel(Application application) {
        super(application);
        application.getClass();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        Application application = getApplication();
        application.getSharedPreferences(PreferenceManager.a(application), 0).unregisterOnSharedPreferenceChangeListener(this);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b3  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSharedPreferenceChanged(android.content.SharedPreferences r3, java.lang.String r4) {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.viewmodel.SettingsViewModel.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }

    public final void startListenPreferenceChange() {
        Application application = getApplication();
        application.getSharedPreferences(PreferenceManager.a(application), 0).registerOnSharedPreferenceChangeListener(this);
    }
}
