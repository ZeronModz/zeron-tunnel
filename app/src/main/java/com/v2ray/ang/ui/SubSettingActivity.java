package com.v2ray.ang.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dev.zeron.tunnel.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.v2ray.ang.helper.SimpleItemTouchHelperCallback;
import com.v2ray.ang.ui.SubSettingActivity;
import com.v2ray.ang.ui.SubSettingRecyclerAdapter;
import defpackage.ay2;
import defpackage.bn0;
import defpackage.hv;
import defpackage.j3;
import defpackage.lv;
import defpackage.mk1;
import defpackage.oy;
import defpackage.qf3;
import defpackage.u7;
import defpackage.zq0;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.conscrypt.HpkeSuite;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/ui/SubSettingActivity;", "Lcom/v2ray/ang/ui/BaseActivity;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubSettingActivity extends BaseActivity {
    public static final /* synthetic */ int f = 0;
    public final Lazy c;
    public List d = EmptyList.INSTANCE;
    public final Lazy e;

    /* JADX INFO: renamed from: com.v2ray.ang.ui.SubSettingActivity$onOptionsItemSelected$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.v2ray.ang.ui.SubSettingActivity$onOptionsItemSelected$1", f = "SubSettingActivity.kt", i = {0, 0}, l = {HpkeSuite.KEM_MLKEM_1024}, m = "invokeSuspend", n = {"$this$launch", "count"}, s = {"L$0", "I$0"})
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        int I$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.v2ray.ang.ui.SubSettingActivity$onOptionsItemSelected$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
        @DebugMetadata(c = "com.v2ray.ang.ui.SubSettingActivity$onOptionsItemSelected$1$1", f = "SubSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C00071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
            final /* synthetic */ int $count;
            int label;
            final /* synthetic */ SubSettingActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00071(int i, SubSettingActivity subSettingActivity, Continuation<? super C00071> continuation) {
                super(2, continuation);
                this.$count = i;
                this.this$0 = subSettingActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
                return new C00071(this.$count, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
                return ((C00071) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    u7.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.d.b(obj);
                int i = this.$count;
                SubSettingActivity subSettingActivity = this.this$0;
                if (i > 0) {
                    qf3.O(subSettingActivity);
                } else {
                    qf3.M(subSettingActivity, R.string.toast_failure);
                }
                SubSettingActivity subSettingActivity2 = this.this$0;
                int i2 = SubSettingActivity.f;
                subSettingActivity2.h().b.b();
                return mk1.a;
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = SubSettingActivity.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i;
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                kotlin.d.b(obj);
                int i3 = 0;
                try {
                    Lazy lazy = zq0.a;
                    Iterator it = zq0.i().iterator();
                    int iX = 0;
                    while (it.hasNext()) {
                        iX += ay2.x((Pair) it.next());
                    }
                    i3 = iX;
                } catch (Exception unused) {
                }
                this.L$0 = coroutineScope;
                this.I$0 = i3;
                this.label = 1;
                if (kotlinx.coroutines.f.b(500L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i = i3;
            } else {
                if (i2 != 1) {
                    u7.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.I$0;
                kotlin.d.b(obj);
            }
            lv lvVar = oy.a;
            kotlinx.coroutines.c.d(coroutineScope, bn0.a, null, new C00071(i, SubSettingActivity.this, null), 2);
            return mk1.a;
        }
    }

    public SubSettingActivity() {
        final int i = 0;
        this.c = kotlin.c.b(new Function0(this) { // from class: sb1
            public final /* synthetic */ SubSettingActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SubSettingActivity subSettingActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = SubSettingActivity.f;
                        View viewInflate = subSettingActivity.getLayoutInflater().inflate(R.layout.activity_sub_setting, (ViewGroup) null, false);
                        int i4 = R.id.pb_waiting;
                        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) l02.n(R.id.pb_waiting, viewInflate);
                        if (linearProgressIndicator != null) {
                            i4 = R.id.recycler_view;
                            RecyclerView recyclerView = (RecyclerView) l02.n(R.id.recycler_view, viewInflate);
                            if (recyclerView != null) {
                                return new j3((RelativeLayout) viewInflate, linearProgressIndicator, recyclerView);
                            }
                        }
                        io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                        return null;
                    default:
                        int i5 = SubSettingActivity.f;
                        return new SubSettingRecyclerAdapter(subSettingActivity);
                }
            }
        });
        final int i2 = 1;
        this.e = kotlin.c.b(new Function0(this) { // from class: sb1
            public final /* synthetic */ SubSettingActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SubSettingActivity subSettingActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = SubSettingActivity.f;
                        View viewInflate = subSettingActivity.getLayoutInflater().inflate(R.layout.activity_sub_setting, (ViewGroup) null, false);
                        int i4 = R.id.pb_waiting;
                        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) l02.n(R.id.pb_waiting, viewInflate);
                        if (linearProgressIndicator != null) {
                            i4 = R.id.recycler_view;
                            RecyclerView recyclerView = (RecyclerView) l02.n(R.id.recycler_view, viewInflate);
                            if (recyclerView != null) {
                                return new j3((RelativeLayout) viewInflate, linearProgressIndicator, recyclerView);
                            }
                        }
                        io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                        return null;
                    default:
                        int i5 = SubSettingActivity.f;
                        return new SubSettingRecyclerAdapter(subSettingActivity);
                }
            }
        });
    }

    public final j3 h() {
        return (j3) this.c.getValue();
    }

    @Override // com.v2ray.ang.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(h().a);
        setTitle(getString(R.string.title_sub_setting));
        h().c.setHasFixedSize(true);
        h().c.setLayoutManager(new LinearLayoutManager(this));
        BaseActivity.g(this, h().c, this);
        RecyclerView recyclerView = h().c;
        Lazy lazy = this.e;
        recyclerView.setAdapter((SubSettingRecyclerAdapter) lazy.getValue());
        new ItemTouchHelper(new SimpleItemTouchHelperCallback((SubSettingRecyclerAdapter) lazy.getValue())).d(h().c);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.action_sub_setting, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.v2ray.ang.ui.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.add_config) {
            startActivity(new Intent(this, (Class<?>) SubEditActivity.class));
            return true;
        }
        if (itemId != R.id.sub_update) {
            return super.onOptionsItemSelected(menuItem);
        }
        h().b.d();
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplA = m.a(this);
        lv lvVar = oy.a;
        kotlinx.coroutines.c.d(lifecycleCoroutineScopeImplA, hv.c, null, new AnonymousClass1(null), 2);
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.d = zq0.i();
        ((SubSettingRecyclerAdapter) this.e.getValue()).f();
    }
}
