package me.ibrahimsn.lib;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B@\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lme/ibrahimsn/lib/AccessibleExploreByTouchHelper;", "Landroidx/customview/widget/ExploreByTouchHelper;", "Lme/ibrahimsn/lib/SmoothBottomBar;", "host", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lme/ibrahimsn/lib/BottomBarItem;", "bottomBarItems", "Lkotlin/Function1;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lkotlin/ParameterName;", "name", "id", "Lmk1;", "onClickAction", "<init>", "(Lme/ibrahimsn/lib/SmoothBottomBar;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "lib_release"}, k = 1, mv = {1, 4, 2})
public final class AccessibleExploreByTouchHelper extends ExploreByTouchHelper {
    public final SmoothBottomBar q;
    public final List r;
    public final Function1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibleExploreByTouchHelper(SmoothBottomBar smoothBottomBar, List<BottomBarItem> list, Function1<? super Integer, mk1> function1) {
        super(smoothBottomBar);
        smoothBottomBar.getClass();
        list.getClass();
        function1.getClass();
        this.q = smoothBottomBar;
        this.r = list;
        this.s = function1;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final int n(float f, float f2) {
        return (int) (f / (this.q.getWidth() / this.r.size()));
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final void o(ArrayList arrayList) {
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final boolean s(int i, int i2, Bundle bundle) {
        if (i2 != 16) {
            return false;
        }
        this.s.invoke(Integer.valueOf(i));
        return true;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final void u(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.l(Reflection.a(BottomBarItem.class).getSimpleName());
        List list = this.r;
        accessibilityNodeInfoCompat.p(((BottomBarItem) list.get(i)).b);
        accessibilityNodeInfoCompat.m(true);
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
        accessibilityNodeInfo.setFocusable(true);
        accessibilityNodeInfoCompat.t(true);
        accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.g);
        SmoothBottomBar smoothBottomBar = this.q;
        accessibilityNodeInfo.setSelected(smoothBottomBar.getV() == i);
        Rect rect = new Rect();
        int width = smoothBottomBar.getWidth() / list.size();
        int i2 = i * width;
        rect.left = i2;
        rect.top = 0;
        rect.right = i2 + width;
        rect.bottom = smoothBottomBar.getHeight();
        accessibilityNodeInfoCompat.k(rect);
    }
}
