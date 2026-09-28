package defpackage;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.app.k;
import androidx.appcompat.app.m;
import androidx.appcompat.graphics.drawable.StateListDrawableCompat;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.view.h;
import androidx.core.widget.AutoScrollHelper;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.drawerlayout.widget.b;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.ListFragment;
import androidx.lifecycle.LiveData;
import androidx.preference.EditTextPreferenceDialogFragmentCompat;
import androidx.preference.PreferenceFragment;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceGroupAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.r;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.common.util.concurrent.ListenableFuture;
import com.trilead.ssh2.sftp.AttribFlags;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class g6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
        Executor mainThreadExecutor;
        a aVar;
        synchronized (((hd1) this.b).g) {
            hd1 hd1Var = (hd1) this.b;
            hd1Var.h = (Intent) hd1Var.g.get(0);
        }
        Intent intent = ((hd1) this.b).h;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = ((hd1) this.b).h.getIntExtra("KEY_START_ID", 0);
            Logger loggerA = Logger.a();
            int i = hd1.l;
            Objects.toString(((hd1) this.b).h);
            loggerA.getClass();
            PowerManager.WakeLock wakeLockA = mp1.a(((hd1) this.b).a, action + " (" + intExtra + ")");
            try {
                try {
                    Logger loggerA2 = Logger.a();
                    wakeLockA.toString();
                    loggerA2.getClass();
                    wakeLockA.acquire();
                    hd1 hd1Var2 = (hd1) this.b;
                    hd1Var2.f.b(hd1Var2.h, intExtra, hd1Var2);
                    Logger loggerA3 = Logger.a();
                    wakeLockA.toString();
                    loggerA3.getClass();
                    wakeLockA.release();
                    mainThreadExecutor = ((hd1) this.b).b.getMainThreadExecutor();
                    aVar = new a((hd1) this.b);
                } catch (Throwable unused) {
                    Logger loggerA4 = Logger.a();
                    int i2 = hd1.l;
                    loggerA4.getClass();
                    Logger loggerA5 = Logger.a();
                    wakeLockA.toString();
                    loggerA5.getClass();
                    wakeLockA.release();
                    mainThreadExecutor = ((hd1) this.b).b.getMainThreadExecutor();
                    aVar = new a((hd1) this.b);
                }
                mainThreadExecutor.execute(aVar);
            } catch (Throwable th) {
                Logger loggerA6 = Logger.a();
                int i3 = hd1.l;
                wakeLockA.toString();
                loggerA6.getClass();
                wakeLockA.release();
                ((hd1) this.b).b.getMainThreadExecutor().execute(new a((hd1) this.b));
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        View viewF;
        int width;
        Object obj;
        switch (this.a) {
            case 0:
                k kVar = (k) this.b;
                if ((kVar.Z & 1) != 0) {
                    kVar.u(0);
                }
                if ((kVar.Z & AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE) != 0) {
                    kVar.u(108);
                }
                kVar.Y = false;
                kVar.Z = 0;
                return;
            case 1:
                AutoScrollHelper autoScrollHelper = (AutoScrollHelper) this.b;
                View view = autoScrollHelper.c;
                ba baVar = autoScrollHelper.a;
                if (autoScrollHelper.o) {
                    if (autoScrollHelper.m) {
                        autoScrollHelper.m = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        baVar.e = jCurrentAnimationTimeMillis;
                        baVar.g = -1L;
                        baVar.f = jCurrentAnimationTimeMillis;
                        baVar.h = 0.5f;
                    }
                    if ((baVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > baVar.g + ((long) baVar.i)) || !autoScrollHelper.g()) {
                        autoScrollHelper.o = false;
                        return;
                    }
                    if (autoScrollHelper.n) {
                        autoScrollHelper.n = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        view.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (baVar.f == 0) {
                        s31.f("Cannot compute scroll delta before calling start()");
                        return;
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = baVar.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - baVar.f;
                    baVar.f = jCurrentAnimationTimeMillis2;
                    autoScrollHelper.f((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * baVar.d));
                    WeakHashMap weakHashMap = h.a;
                    view.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                nf nfVar = (nf) this.b;
                nfVar.c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) nfVar.e;
                mn1 mn1Var = bottomSheetBehavior.M;
                if (mn1Var != null && mn1Var.h()) {
                    nfVar.a(nfVar.b);
                    return;
                } else {
                    if (bottomSheetBehavior.L == 2) {
                        bottomSheetBehavior.G(nfVar.b);
                        return;
                    }
                    return;
                }
            case 3:
                nv nvVar = (nv) this.b;
                nvVar.b.endViewTransition(nvVar.c);
                nvVar.d.a();
                return;
            case 4:
                DialogFragment dialogFragment = (DialogFragment) this.b;
                dialogFragment.b0.onDismiss(dialogFragment.j0);
                return;
            case 5:
                StateListDrawableCompat stateListDrawableCompat = (StateListDrawableCompat) this.b;
                stateListDrawableCompat.a(true);
                stateListDrawableCompat.invalidateSelf();
                return;
            case 6:
                b bVar = (b) this.b;
                DrawerLayout drawerLayout = bVar.d;
                int i = bVar.b.o;
                int i2 = bVar.a;
                boolean z = i2 == 3;
                if (z) {
                    viewF = drawerLayout.f(3);
                    width = (viewF != null ? -viewF.getWidth() : 0) + i;
                } else {
                    viewF = drawerLayout.f(5);
                    width = drawerLayout.getWidth() - i;
                }
                if (viewF != null) {
                    if (((!z || viewF.getLeft() >= width) && (z || viewF.getLeft() <= width)) || drawerLayout.i(viewF) != 0) {
                        return;
                    }
                    DrawerLayout.LayoutParams layoutParams = (DrawerLayout.LayoutParams) viewF.getLayoutParams();
                    bVar.b.t(viewF, width, viewF.getTop());
                    layoutParams.c = true;
                    drawerLayout.invalidate();
                    View viewF2 = drawerLayout.f(i2 == 3 ? 5 : 3);
                    if (viewF2 != null) {
                        drawerLayout.c(viewF2, true);
                    }
                    if (drawerLayout.q) {
                        return;
                    }
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        drawerLayout.getChildAt(i3).dispatchTouchEvent(motionEventObtain2);
                    }
                    motionEventObtain2.recycle();
                    drawerLayout.q = true;
                    return;
                }
                return;
            case 7:
                vz vzVar = (vz) this.b;
                vzVar.l = null;
                vzVar.drawableStateChanged();
                return;
            case 8:
                ((EditTextPreferenceDialogFragmentCompat) this.b).g0();
                return;
            case 9:
                r rVar = (r) this.b;
                ValueAnimator valueAnimator = rVar.z;
                int i4 = rVar.A;
                if (i4 == 1) {
                    valueAnimator.cancel();
                } else if (i4 != 2) {
                    return;
                }
                rVar.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 10:
                ((FragmentManager) this.b).y(true);
                return;
            case 11:
                FragmentStateAdapter fragmentStateAdapter = (FragmentStateAdapter) this.b;
                fragmentStateAdapter.k = false;
                fragmentStateAdapter.x();
                return;
            case 12:
                ((ListenableFuture) this.b).cancel(true);
                return;
            case 13:
                tj1 tj1Var = (tj1) this.b;
                ic0 ic0Var = (ic0) tj1Var.d;
                if (ic0Var.a.getAndSet(null) != null) {
                    ((Handler) tj1Var.b).removeCallbacks(ic0Var);
                    return;
                }
                return;
            case 14:
                ListView listView = ((ListFragment) this.b).b0;
                listView.focusableViewAvailable(listView);
                return;
            case 15:
                zk0 zk0Var = (zk0) this.b;
                zk0Var.b = null;
                zk0Var.a = null;
                return;
            case 16:
                synchronized (((LiveData) this.b).a) {
                    obj = ((LiveData) this.b).f;
                    ((LiveData) this.b).f = LiveData.k;
                    break;
                }
                ((LiveData) this.b).k(obj);
                return;
            case 17:
                ((View) this.b).setNestedScrollingEnabled(true);
                return;
            case 18:
                ((MotionLayout) this.b).v0.a();
                return;
            case 19:
                RecyclerView recyclerView = ((PreferenceFragment) this.b).c;
                recyclerView.focusableViewAvailable(recyclerView);
                return;
            case 20:
                RecyclerView recyclerView2 = ((PreferenceFragmentCompat) this.b).a0;
                recyclerView2.focusableViewAvailable(recyclerView2);
                return;
            case 21:
                ((PreferenceGroupAdapter) this.b).x();
                return;
            case 22:
                RecyclerView recyclerView3 = (RecyclerView) this.b;
                if (!recyclerView3.v || recyclerView3.isLayoutRequested()) {
                    return;
                }
                if (!recyclerView3.t) {
                    recyclerView3.requestLayout();
                    return;
                } else if (recyclerView3.y) {
                    recyclerView3.x = true;
                    return;
                } else {
                    recyclerView3.o();
                    return;
                }
            case 23:
                ((SearchView) this.b).p();
                return;
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                ((StaggeredGridLayoutManager) this.b).D0();
                return;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                a();
                return;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.b).c.g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 27:
                ((Toolbar) this.b).u();
                return;
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                m mVar = (m) this.b;
                Window.Callback callback = mVar.b;
                Menu menuV = mVar.v();
                MenuBuilder menuBuilder = menuV instanceof MenuBuilder ? (MenuBuilder) menuV : null;
                if (menuBuilder != null) {
                    menuBuilder.y();
                }
                try {
                    menuV.clear();
                    if (!callback.onCreatePanelMenu(0, menuV) || !callback.onPreparePanel(0, null, menuV)) {
                        menuV.clear();
                        break;
                    }
                    if (menuBuilder != null) {
                        menuBuilder.x();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (menuBuilder != null) {
                        menuBuilder.x();
                    }
                    throw th;
                }
            default:
                ((mn1) this.b).q(0);
                return;
        }
    }
}
