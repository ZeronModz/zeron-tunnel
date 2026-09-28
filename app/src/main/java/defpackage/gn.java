package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.h;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.internal.CheckableGroup;
import com.google.android.material.internal.a;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class gn implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener a;
    public final /* synthetic */ ChipGroup b;

    public gn(ChipGroup chipGroup) {
        this.b = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                WeakHashMap weakHashMap = h.a;
                view2.setId(View.generateViewId());
            }
            CheckableGroup checkableGroup = chipGroup.h;
            Chip chip = (Chip) view2;
            checkableGroup.a.put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                checkableGroup.a(chip);
            }
            chip.setInternalOnCheckedChangeListener(new a(checkableGroup));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            CheckableGroup checkableGroup = chipGroup.h;
            Chip chip = (Chip) view2;
            checkableGroup.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            checkableGroup.a.remove(Integer.valueOf(chip.getId()));
            checkableGroup.b.remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
