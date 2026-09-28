package defpackage;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class zm implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoStatePreference b;

    public /* synthetic */ zm(TwoStatePreference twoStatePreference, int i) {
        this.a = i;
        this.b = twoStatePreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        TwoStatePreference twoStatePreference = this.b;
        switch (i) {
            case 0:
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) twoStatePreference;
                if (!checkBoxPreference.a(Boolean.valueOf(z))) {
                    compoundButton.setChecked(!z);
                } else {
                    checkBoxPreference.A(z);
                }
                break;
            case 1:
                SwitchPreference switchPreference = (SwitchPreference) twoStatePreference;
                if (!switchPreference.a(Boolean.valueOf(z))) {
                    compoundButton.setChecked(!z);
                } else {
                    switchPreference.A(z);
                }
                break;
            default:
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) twoStatePreference;
                if (!switchPreferenceCompat.a(Boolean.valueOf(z))) {
                    compoundButton.setChecked(!z);
                } else {
                    switchPreferenceCompat.A(z);
                }
                break;
        }
    }
}
