package com.v2ray.ang.ui;

import dev.zeron.tunnel.R;
import com.v2ray.ang.dto.AssetUrlItem;
import defpackage.bn0;
import defpackage.lv;
import defpackage.mk1;
import defpackage.oy;
import defpackage.qf3;
import defpackage.u7;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "com.v2ray.ang.ui.UserAssetActivity$downloadGeoFiles$1", f = "UserAssetActivity.kt", i = {}, l = {243}, m = "invokeSuspend", n = {}, s = {})
final class UserAssetActivity$downloadGeoFiles$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ Ref$ObjectRef<List<Pair<String, AssetUrlItem>>> $assets;
    final /* synthetic */ int $httpPort;
    final /* synthetic */ Ref$IntRef $resultCount;
    int label;
    final /* synthetic */ UserAssetActivity this$0;

    /* JADX INFO: renamed from: com.v2ray.ang.ui.UserAssetActivity$downloadGeoFiles$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.v2ray.ang.ui.UserAssetActivity$downloadGeoFiles$1$2", f = "UserAssetActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        final /* synthetic */ Ref$IntRef $resultCount;
        int label;
        final /* synthetic */ UserAssetActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Ref$IntRef ref$IntRef, UserAssetActivity userAssetActivity, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$resultCount = ref$IntRef;
            this.this$0 = userAssetActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$resultCount, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.d.b(obj);
            int i = this.$resultCount.element;
            UserAssetActivity userAssetActivity = this.this$0;
            if (i > 0) {
                String string = userAssetActivity.getString(R.string.title_update_config_count, new Integer(i));
                string.getClass();
                qf3.L(userAssetActivity, string);
                this.this$0.m();
            } else {
                String string2 = userAssetActivity.getString(R.string.toast_failure);
                string2.getClass();
                qf3.L(userAssetActivity, string2);
            }
            UserAssetActivity userAssetActivity2 = this.this$0;
            int i2 = UserAssetActivity.j;
            userAssetActivity2.k().c.b();
            return mk1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAssetActivity$downloadGeoFiles$1(Ref$ObjectRef<List<Pair<String, AssetUrlItem>>> ref$ObjectRef, UserAssetActivity userAssetActivity, int i, Ref$IntRef ref$IntRef, Continuation<? super UserAssetActivity$downloadGeoFiles$1> continuation) {
        super(2, continuation);
        this.$assets = ref$ObjectRef;
        this.this$0 = userAssetActivity;
        this.$httpPort = i;
        this.$resultCount = ref$IntRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new UserAssetActivity$downloadGeoFiles$1(this.$assets, this.this$0, this.$httpPort, this.$resultCount, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((UserAssetActivity$downloadGeoFiles$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.d.b(obj);
            List<Pair<String, AssetUrlItem>> list = this.$assets.element;
            UserAssetActivity userAssetActivity = this.this$0;
            int i2 = this.$httpPort;
            Ref$IntRef ref$IntRef = this.$resultCount;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                try {
                    AssetUrlItem assetUrlItem = (AssetUrlItem) pair.getSecond();
                    int i3 = UserAssetActivity.j;
                    boolean zJ = userAssetActivity.j(assetUrlItem, i2);
                    if (!zJ) {
                        zJ = userAssetActivity.j((AssetUrlItem) pair.getSecond(), 0);
                    }
                    if (zJ) {
                        ref$IntRef.element++;
                    }
                } catch (Exception unused) {
                    ((AssetUrlItem) pair.getSecond()).getRemarks();
                }
            }
            lv lvVar = oy.a;
            MainCoroutineDispatcher mainCoroutineDispatcher = bn0.a;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$resultCount, this.this$0, null);
            this.label = 1;
            if (kotlinx.coroutines.c.e(mainCoroutineDispatcher, anonymousClass2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.d.b(obj);
        }
        return mk1.a;
    }
}
