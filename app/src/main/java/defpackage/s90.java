package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentHostCallback;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o;
import androidx.fragment.app.strictmode.FragmentStrictMode$Flag;
import androidx.fragment.app.strictmode.FragmentStrictMode$Policy;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class s90 implements LayoutInflater.Factory2 {
    public final FragmentManager a;

    public s90(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        o oVarF;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        FragmentManager fragmentManager = this.a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, fragmentManager);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k11.a);
            int i = 0;
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = Fragment.class.isAssignableFrom(FragmentFactory.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment fragmentB = resourceId != -1 ? fragmentManager.B(resourceId) : null;
                    if (fragmentB == null && string != null) {
                        fragmentB = fragmentManager.C(string);
                    }
                    if (fragmentB == null && id != -1) {
                        fragmentB = fragmentManager.B(id);
                    }
                    if (fragmentB == null) {
                        fragmentB = fragmentManager.F().a(context.getClassLoader(), attributeValue);
                        fragmentB.n = true;
                        fragmentB.w = resourceId != 0 ? resourceId : id;
                        fragmentB.x = id;
                        fragmentB.y = string;
                        fragmentB.o = true;
                        fragmentB.s = fragmentManager;
                        FragmentHostCallback fragmentHostCallback = fragmentManager.v;
                        fragmentB.t = fragmentHostCallback;
                        fragmentB.B(fragmentHostCallback.b, attributeSet, fragmentB.b);
                        oVarF = fragmentManager.a(fragmentB);
                        if (FragmentManager.H(2)) {
                            fragmentB.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else {
                        if (fragmentB.o) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        fragmentB.o = true;
                        fragmentB.s = fragmentManager;
                        FragmentHostCallback fragmentHostCallback2 = fragmentManager.v;
                        fragmentB.t = fragmentHostCallback2;
                        fragmentB.B(fragmentHostCallback2.b, attributeSet, fragmentB.b);
                        oVarF = fragmentManager.f(fragmentB);
                        if (FragmentManager.H(2)) {
                            fragmentB.toString();
                            Integer.toHexString(resourceId);
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    FragmentStrictMode$Policy fragmentStrictMode$Policy = pa0.a;
                    FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragmentB, viewGroup);
                    pa0.c(fragmentTagUsageViolation);
                    FragmentStrictMode$Policy fragmentStrictMode$PolicyA = pa0.a(fragmentB);
                    if (fragmentStrictMode$PolicyA.a.contains(FragmentStrictMode$Flag.DETECT_FRAGMENT_TAG_USAGE) && pa0.f(fragmentStrictMode$PolicyA, fragmentB.getClass(), FragmentTagUsageViolation.class)) {
                        pa0.b(fragmentStrictMode$PolicyA, fragmentTagUsageViolation);
                    }
                    fragmentB.E = viewGroup;
                    oVarF.k();
                    oVarF.j();
                    View view2 = fragmentB.F;
                    if (view2 == null) {
                        u7.p(vh.m("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragmentB.F.getTag() == null) {
                        fragmentB.F.setTag(string);
                    }
                    fragmentB.F.addOnAttachStateChangeListener(new r90(i, this, oVarF));
                    return fragmentB.F;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
