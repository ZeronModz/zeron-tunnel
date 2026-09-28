package com.v2ray.ang.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.m;
import dev.zeron.tunnel.R;
import com.v2ray.ang.AngApplication;
import com.v2ray.ang.dto.AppInfo;
import defpackage.hv;
import defpackage.l8;
import defpackage.lv;
import defpackage.lw0;
import defpackage.mk1;
import defpackage.mn;
import defpackage.n2;
import defpackage.oy;
import defpackage.qf3;
import defpackage.u7;
import defpackage.ul1;
import defpackage.zq0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/ui/PerAppProxyActivity;", "Lcom/v2ray/ang/ui/BaseActivity;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PerAppProxyActivity extends BaseActivity {
    public static final /* synthetic */ int f = 0;
    public final Lazy c = kotlin.c.b(new l8(this, 11));
    public PerAppProxyAdapter d;
    public List e;

    /* JADX INFO: renamed from: com.v2ray.ang.ui.PerAppProxyActivity$onCreate$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.v2ray.ang.ui.PerAppProxyActivity$onCreate$1", f = "PerAppProxyActivity.kt", i = {0}, l = {49}, m = "invokeSuspend", n = {"blacklist"}, s = {"L$0"})
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return PerAppProxyActivity.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Set set;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.d.b(obj);
                    PerAppProxyActivity perAppProxyActivity = PerAppProxyActivity.this;
                    int i2 = PerAppProxyActivity.f;
                    perAppProxyActivity.h().c.d();
                    Lazy lazy = zq0.a;
                    Set setF = zq0.z().f("pref_per_app_proxy_set", null);
                    lv lvVar = oy.a;
                    hv hvVar = hv.c;
                    PerAppProxyActivity$onCreate$1$apps$1 perAppProxyActivity$onCreate$1$apps$1 = new PerAppProxyActivity$onCreate$1$apps$1(PerAppProxyActivity.this, setF, null);
                    this.L$0 = setF;
                    this.label = 1;
                    Object objE = kotlinx.coroutines.c.e(hvVar, perAppProxyActivity$onCreate$1$apps$1, this);
                    if (objE == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    set = setF;
                    obj = objE;
                } else {
                    if (i != 1) {
                        u7.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    set = (Set) this.L$0;
                    kotlin.d.b(obj);
                }
                List list = (List) obj;
                PerAppProxyActivity perAppProxyActivity2 = PerAppProxyActivity.this;
                perAppProxyActivity2.e = list;
                perAppProxyActivity2.d = new PerAppProxyAdapter(PerAppProxyActivity.this, list, set);
                PerAppProxyActivity.this.h().d.setAdapter(PerAppProxyActivity.this.d);
                PerAppProxyActivity.this.h().c.b();
            } catch (Exception unused) {
                PerAppProxyActivity perAppProxyActivity3 = PerAppProxyActivity.this;
                int i3 = PerAppProxyActivity.f;
                perAppProxyActivity3.h().c.b();
            }
            return mk1.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean i(java.lang.String r1, java.lang.String r2, boolean r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L15
            java.lang.String r3 = "com.google.android.webview"
            boolean r3 = defpackage.yg0.a(r2, r3)
            if (r3 == 0) goto Lc
            goto L1e
        Lc:
            java.lang.String r3 = "com.google"
            boolean r3 = kotlin.text.g.R(r2, r3, r0)
            if (r3 == 0) goto L15
            goto L1c
        L15:
            r3 = 6
            int r1 = kotlin.text.g.z(r1, r2, r0, r0, r3)
            if (r1 < 0) goto L1e
        L1c:
            r1 = 1
            return r1
        L1e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.ui.PerAppProxyActivity.i(java.lang.String, java.lang.String, boolean):boolean");
    }

    public final n2 h() {
        return (n2) this.c.getValue();
    }

    public final void j(String str, boolean z) {
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        try {
            if (TextUtils.isEmpty(str)) {
                Regex regex = ul1.a;
                Context applicationContext = getApplicationContext();
                str = ul1.z(applicationContext instanceof AngApplication ? (AngApplication) applicationContext : null, "proxy_packagename.txt");
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            PerAppProxyAdapter perAppProxyAdapter = this.d;
            if (perAppProxyAdapter != null && (hashSet3 = perAppProxyAdapter.e) != null) {
                hashSet3.clear();
            }
            boolean zIsChecked = h().e.isChecked();
            PerAppProxyAdapter perAppProxyAdapter2 = this.d;
            if (zIsChecked) {
                if (perAppProxyAdapter2 != null) {
                    Iterator it = perAppProxyAdapter2.d.iterator();
                    while (it.hasNext()) {
                        String packageName = ((AppInfo) it.next()).getPackageName();
                        if (!i(str, packageName, z)) {
                            PerAppProxyAdapter perAppProxyAdapter3 = this.d;
                            if (perAppProxyAdapter3 != null && (hashSet2 = perAppProxyAdapter3.e) != null) {
                                hashSet2.add(packageName);
                            }
                            System.out.println((Object) packageName);
                        }
                    }
                    perAppProxyAdapter2.f();
                    return;
                }
                return;
            }
            if (perAppProxyAdapter2 != null) {
                Iterator it2 = perAppProxyAdapter2.d.iterator();
                while (it2.hasNext()) {
                    String packageName2 = ((AppInfo) it2.next()).getPackageName();
                    if (i(str, packageName2, z)) {
                        PerAppProxyAdapter perAppProxyAdapter4 = this.d;
                        if (perAppProxyAdapter4 != null && (hashSet = perAppProxyAdapter4.e) != null) {
                            hashSet.add(packageName2);
                        }
                        System.out.println((Object) packageName2);
                    }
                }
                perAppProxyAdapter2.f();
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.v2ray.ang.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(h().a);
        setTitle(getString(R.string.per_app_proxy_settings));
        BaseActivity.g(this, h().d, this);
        kotlinx.coroutines.c.d(m.a(this), null, null, new AnonymousClass1(null), 3);
        h().f.setOnCheckedChangeListener(new defpackage.m(1));
        SwitchCompat switchCompat = h().f;
        Lazy lazy = zq0.a;
        switchCompat.setChecked(zq0.z().b("pref_per_app_proxy", false));
        h().e.setOnCheckedChangeListener(new defpackage.m(2));
        h().e.setChecked(zq0.z().b("pref_bypass_apps", false));
        h().b.setOnClickListener(new mn(this, 6));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.menu_bypass_list, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.search_view);
        if (menuItemFindItem != null) {
            View actionView = menuItemFindItem.getActionView();
            actionView.getClass();
            ((SearchView) actionView).setOnQueryTextListener(new lw0(this));
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.v2ray.ang.ui.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        HashSet<String> hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        menuItem.getClass();
        switch (menuItem.getItemId()) {
            case R.id.export_proxy_app /* 2131296609 */:
                String strValueOf = String.valueOf(h().e.isChecked());
                PerAppProxyAdapter perAppProxyAdapter = this.d;
                if (perAppProxyAdapter != null && (hashSet = perAppProxyAdapter.e) != null) {
                    for (String str : hashSet) {
                        strValueOf = ((Object) strValueOf) + System.getProperty("line.separator") + str;
                    }
                }
                Regex regex = ul1.a;
                Context applicationContext = getApplicationContext();
                applicationContext.getClass();
                ul1.A(applicationContext, strValueOf);
                qf3.O(this);
                return true;
            case R.id.import_proxy_app /* 2131296695 */:
                Regex regex2 = ul1.a;
                Context applicationContext2 = getApplicationContext();
                applicationContext2.getClass();
                String strG = ul1.g(applicationContext2);
                if (TextUtils.isEmpty(strG)) {
                    return true;
                }
                j(strG, false);
                qf3.O(this);
                return true;
            case R.id.select_all /* 2131297009 */:
                PerAppProxyAdapter perAppProxyAdapter2 = this.d;
                if (perAppProxyAdapter2 == null) {
                    return false;
                }
                List list = perAppProxyAdapter2.d;
                ArrayList arrayList = new ArrayList(kotlin.collections.c.l(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AppInfo) it.next()).getPackageName());
                }
                if (perAppProxyAdapter2.e.containsAll(arrayList)) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        String packageName = ((AppInfo) it2.next()).getPackageName();
                        PerAppProxyAdapter perAppProxyAdapter3 = this.d;
                        if (perAppProxyAdapter3 != null && (hashSet3 = perAppProxyAdapter3.e) != null) {
                            hashSet3.remove(packageName);
                        }
                    }
                } else {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        String packageName2 = ((AppInfo) it3.next()).getPackageName();
                        PerAppProxyAdapter perAppProxyAdapter4 = this.d;
                        if (perAppProxyAdapter4 != null && (hashSet2 = perAppProxyAdapter4.e) != null) {
                            hashSet2.add(packageName2);
                        }
                    }
                }
                perAppProxyAdapter2.f();
                return true;
            case R.id.select_proxy_app /* 2131297012 */:
                qf3.K(this, R.string.msg_downloading_content);
                h().c.d();
                LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplA = m.a(this);
                lv lvVar = oy.a;
                kotlinx.coroutines.c.d(lifecycleCoroutineScopeImplA, hv.c, null, new PerAppProxyActivity$selectProxyApp$1("https://raw.githubusercontent.com/2dust/androidpackagenamelist/master/proxy.txt", this, null), 2);
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        PerAppProxyAdapter perAppProxyAdapter = this.d;
        if (perAppProxyAdapter != null) {
            Lazy lazy = zq0.a;
            HashSet hashSet = perAppProxyAdapter.e;
            hashSet.getClass();
            zq0.z().j("pref_per_app_proxy_set", hashSet);
        }
    }
}
