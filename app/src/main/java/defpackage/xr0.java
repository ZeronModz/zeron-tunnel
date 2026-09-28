package defpackage;

import android.content.DialogInterface;
import androidx.preference.MultiSelectListPreferenceDialogFragment;
import androidx.preference.MultiSelectListPreferenceDialogFragmentCompat;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xr0 implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xr0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment = (MultiSelectListPreferenceDialogFragment) obj;
                HashSet hashSet = multiSelectListPreferenceDialogFragment.i;
                boolean z2 = multiSelectListPreferenceDialogFragment.j;
                if (!z) {
                    multiSelectListPreferenceDialogFragment.j = hashSet.remove(multiSelectListPreferenceDialogFragment.l[i].toString()) | z2;
                } else {
                    multiSelectListPreferenceDialogFragment.j = hashSet.add(multiSelectListPreferenceDialogFragment.l[i].toString()) | z2;
                }
                break;
            default:
                MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = (MultiSelectListPreferenceDialogFragmentCompat) obj;
                HashSet hashSet2 = multiSelectListPreferenceDialogFragmentCompat.w0;
                boolean z3 = multiSelectListPreferenceDialogFragmentCompat.x0;
                if (!z) {
                    multiSelectListPreferenceDialogFragmentCompat.x0 = hashSet2.remove(multiSelectListPreferenceDialogFragmentCompat.z0[i].toString()) | z3;
                } else {
                    multiSelectListPreferenceDialogFragmentCompat.x0 = hashSet2.add(multiSelectListPreferenceDialogFragmentCompat.z0[i].toString()) | z3;
                }
                break;
        }
    }
}
