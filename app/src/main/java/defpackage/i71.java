package defpackage;

import android.content.Intent;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import com.v2ray.ang.ui.PerAppProxyActivity;
import com.v2ray.ang.ui.SettingsActivity;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i71 implements Preference.OnPreferenceClickListener, Preference.OnPreferenceChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsActivity.SettingsFragment b;

    public /* synthetic */ i71(SettingsActivity.SettingsFragment settingsFragment, int i) {
        this.a = i;
        this.b = settingsFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    @Override // androidx.preference.Preference.OnPreferenceChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onPreferenceChange(androidx.preference.Preference r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i71.onPreferenceChange(androidx.preference.Preference, java.lang.Object):boolean");
    }

    @Override // androidx.preference.Preference.OnPreferenceClickListener
    public boolean onPreferenceClick(Preference preference) {
        preference.getClass();
        SettingsActivity.SettingsFragment settingsFragment = this.b;
        settingsFragment.U(new Intent(settingsFragment.d(), (Class<?>) PerAppProxyActivity.class));
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) settingsFragment.g0.getValue();
        if (checkBoxPreference == null) {
            return false;
        }
        checkBoxPreference.A(true);
        return false;
    }
}
