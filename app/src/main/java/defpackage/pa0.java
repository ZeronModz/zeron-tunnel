package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentStrictMode$Flag;
import androidx.fragment.app.strictmode.FragmentStrictMode$Policy;
import androidx.fragment.app.strictmode.Violation;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pa0 {
    public static final FragmentStrictMode$Policy a = FragmentStrictMode$Policy.d;

    public static FragmentStrictMode$Policy a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.o()) {
                fragment.i();
            }
            fragment = fragment.v;
        }
        return a;
    }

    public static void b(FragmentStrictMode$Policy fragmentStrictMode$Policy, Violation violation) {
        Fragment fragment = violation.getFragment();
        String name = fragment.getClass().getName();
        Set set = fragmentStrictMode$Policy.a;
        set.contains(FragmentStrictMode$Flag.PENALTY_LOG);
        if (fragmentStrictMode$Policy.b != null) {
            e(fragment, new f20(13, fragmentStrictMode$Policy, violation));
        }
        if (set.contains(FragmentStrictMode$Flag.PENALTY_DEATH)) {
            e(fragment, new j60(name, violation));
        }
    }

    public static void c(Violation violation) {
        if (FragmentManager.H(3)) {
            violation.getFragment().getClass();
        }
    }

    public static final void d(Fragment fragment, String str) {
        fragment.getClass();
        str.getClass();
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, str);
        c(fragmentReuseViolation);
        FragmentStrictMode$Policy fragmentStrictMode$PolicyA = a(fragment);
        if (fragmentStrictMode$PolicyA.a.contains(FragmentStrictMode$Flag.DETECT_FRAGMENT_REUSE) && f(fragmentStrictMode$PolicyA, fragment.getClass(), FragmentReuseViolation.class)) {
            b(fragmentStrictMode$PolicyA, fragmentReuseViolation);
        }
    }

    public static void e(Fragment fragment, Runnable runnable) {
        if (!fragment.o()) {
            runnable.run();
            return;
        }
        Handler handler = fragment.i().v.c;
        handler.getClass();
        if (yg0.a(handler.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static boolean f(FragmentStrictMode$Policy fragmentStrictMode$Policy, Class cls, Class cls2) {
        Set set = (Set) fragmentStrictMode$Policy.c.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (yg0.a(cls2.getSuperclass(), Violation.class) || !set.contains(cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
