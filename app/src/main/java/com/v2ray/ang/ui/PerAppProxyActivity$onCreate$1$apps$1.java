package com.v2ray.ang.ui;

import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.dto.AppInfo;
import defpackage.mk1;
import defpackage.u7;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcom/v2ray/ang/dto/AppInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.v2ray.ang.ui.PerAppProxyActivity$onCreate$1$apps$1", f = "PerAppProxyActivity.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
public final class PerAppProxyActivity$onCreate$1$apps$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends AppInfo>>, Object> {
    final /* synthetic */ Set<String> $blacklist;
    int label;
    final /* synthetic */ PerAppProxyActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerAppProxyActivity$onCreate$1$apps$1(PerAppProxyActivity perAppProxyActivity, Set<String> set, Continuation<? super PerAppProxyActivity$onCreate$1$apps$1> continuation) {
        super(2, continuation);
        this.this$0 = perAppProxyActivity;
        this.$blacklist = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$1(AppInfo appInfo, AppInfo appInfo2) {
        if (appInfo.isSelected() > appInfo2.isSelected()) {
            return -1;
        }
        return appInfo.isSelected() == appInfo2.isSelected() ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$2(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new PerAppProxyActivity$onCreate$1$apps$1(this.this$0, this.$blacklist, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<AppInfo>> continuation) {
        return ((PerAppProxyActivity$onCreate$1$apps$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.d.b(obj);
            PerAppProxyActivity perAppProxyActivity = this.this$0;
            this.label = 1;
            obj = com.v2ray.ang.util.a.a(perAppProxyActivity, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.d.b(obj);
        }
        ArrayList<AppInfo> arrayList = (ArrayList) obj;
        Set<String> set = this.$blacklist;
        if (set == null) {
            final Collator collator = Collator.getInstance();
            collator.getClass();
            return kotlin.collections.c.N(arrayList, new Comparator() { // from class: com.v2ray.ang.ui.PerAppProxyActivity$onCreate$1$apps$1$invokeSuspend$$inlined$compareBy$1
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return collator.compare(((AppInfo) obj2).getAppName(), ((AppInfo) obj3).getAppName());
                }
            });
        }
        for (AppInfo appInfo : arrayList) {
            appInfo.setSelected(set.contains(appInfo.getPackageName()) ? 1 : 0);
        }
        final e eVar = new e();
        return kotlin.collections.c.N(arrayList, new Comparator() { // from class: com.v2ray.ang.ui.f
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return PerAppProxyActivity$onCreate$1$apps$1.invokeSuspend$lambda$2(eVar, obj2, obj3);
            }
        });
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends AppInfo>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<AppInfo>>) continuation);
    }
}
