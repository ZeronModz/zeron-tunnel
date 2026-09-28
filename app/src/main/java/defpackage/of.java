package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import dev.zeron.tunnel.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.sidesheet.a;
import com.trilead.ssh2.sftp.AttribFlags;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class of extends AccessibilityDelegateCompat {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ of(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // androidx.core.view.AccessibilityDelegateCompat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        /*
            r2 = this;
            int r0 = r2.d
            java.lang.Object r1 = r2.e
            switch(r0) {
                case 2: goto L47;
                case 7: goto Lb;
                default: goto L7;
            }
        L7:
            super.c(r3, r4)
            return
        Lb:
            androidx.viewpager.widget.ViewPager r1 = (androidx.viewpager.widget.ViewPager) r1
            super.c(r3, r4)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r2 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r2 = r2.getName()
            r4.setClassName(r2)
            androidx.viewpager.widget.PagerAdapter r2 = r1.e
            if (r2 == 0) goto L25
            int r2 = r2.c()
            r3 = 1
            if (r2 <= r3) goto L25
            goto L26
        L25:
            r3 = 0
        L26:
            r4.setScrollable(r3)
            int r2 = r4.getEventType()
            r3 = 4096(0x1000, float:5.74E-42)
            if (r2 != r3) goto L46
            androidx.viewpager.widget.PagerAdapter r2 = r1.e
            if (r2 == 0) goto L46
            int r2 = r2.c()
            r4.setItemCount(r2)
            int r2 = r1.f
            r4.setFromIndex(r2)
            int r2 = r1.f
            r4.setToIndex(r2)
        L46:
            return
        L47:
            super.c(r3, r4)
            com.google.android.material.internal.CheckableImageButton r1 = (com.google.android.material.internal.CheckableImageButton) r1
            boolean r2 = r1.d
            r4.setChecked(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of.c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int i;
        int i2 = this.d;
        z = false;
        boolean z = false;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (i2) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (((BottomSheetDialog) obj).j) {
                    accessibilityNodeInfoCompat.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                } else {
                    accessibilityNodeInfo.setDismissable(false);
                }
                break;
            case 1:
            default:
                super.d(view, accessibilityNodeInfoCompat);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfoCompat.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.e);
                accessibilityNodeInfo2.setChecked(checkableImageButton.d);
                break;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i3 = MaterialButtonToggleGroup.k;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < materialButtonToggleGroup.getChildCount(); i5++) {
                        if (materialButtonToggleGroup.getChildAt(i5) == view) {
                            i = i4;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.c(i5)) {
                                i4++;
                            }
                        }
                    }
                    i = -1;
                } else {
                    i = -1;
                }
                accessibilityNodeInfoCompat.o(y1.b(0, 1, i, false, ((MaterialButton) view).o, 1));
                break;
            case 4:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
                MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                accessibilityNodeInfoCompat.r(materialCalendar.l0.getVisibility() == 0 ? materialCalendar.j().getString(R.string.mtrl_picker_toggle_to_year_selection) : materialCalendar.j().getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            case 5:
                AccessibilityNodeInfo accessibilityNodeInfo3 = accessibilityNodeInfoCompat.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).x);
                break;
            case 6:
                AccessibilityNodeInfo accessibilityNodeInfo4 = accessibilityNodeInfoCompat.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                if (((a) obj).i) {
                    accessibilityNodeInfoCompat.a(1048576);
                    accessibilityNodeInfo4.setDismissable(true);
                } else {
                    accessibilityNodeInfo4.setDismissable(false);
                }
                break;
            case 7:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
                accessibilityNodeInfoCompat.l(ViewPager.class.getName());
                ViewPager viewPager = (ViewPager) obj;
                PagerAdapter pagerAdapter = viewPager.e;
                if (pagerAdapter != null && pagerAdapter.c() > 1) {
                    z = true;
                }
                accessibilityNodeInfoCompat.u(z);
                if (viewPager.canScrollHorizontally(1)) {
                    accessibilityNodeInfoCompat.a(AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE);
                }
                if (viewPager.canScrollHorizontally(-1)) {
                    accessibilityNodeInfoCompat.a(AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT);
                }
                break;
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void e(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                super.e(view, accessibilityEvent);
                if (accessibilityEvent.getEventType() == 1) {
                    BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) this.e;
                    int i = BottomSheetDragHandleView.m;
                    bottomSheetDragHandleView.a();
                }
                break;
            default:
                super.e(view, accessibilityEvent);
                break;
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public boolean g(View view, int i, Bundle bundle) {
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                if (i == 1048576) {
                    BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) obj;
                    if (bottomSheetDialog.j) {
                        bottomSheetDialog.cancel();
                    }
                }
                break;
            case 6:
                if (i == 1048576) {
                    a aVar = (a) obj;
                    if (aVar.i) {
                        aVar.cancel();
                    }
                }
                break;
            case 7:
                ViewPager viewPager = (ViewPager) obj;
                if (!super.g(view, i, bundle)) {
                    if (i == 4096) {
                        if (viewPager.canScrollHorizontally(1)) {
                            viewPager.setCurrentItem(viewPager.f + 1);
                        }
                    } else if (i == 8192 && viewPager.canScrollHorizontally(-1)) {
                        viewPager.setCurrentItem(viewPager.f - 1);
                    }
                    break;
                }
                break;
        }
        return super.g(view, i, bundle);
    }
}
