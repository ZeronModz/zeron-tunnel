package com.v2ray.ang.handler;

import android.os.Build;
import com.v2ray.ang.dto.CheckUpdateResult;
import com.v2ray.ang.dto.GitHubRelease;
import defpackage.aj0;
import defpackage.i60;
import defpackage.mk1;
import defpackage.qf3;
import defpackage.u7;
import defpackage.ul1;
import defpackage.zq0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlin.text.g;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/v2ray/ang/dto/CheckUpdateResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.v2ray.ang.handler.UpdateCheckerManager$checkForUpdate$2", f = "UpdateCheckerManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class UpdateCheckerManager$checkForUpdate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CheckUpdateResult>, Object> {
    final /* synthetic */ boolean $includePreRelease;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateCheckerManager$checkForUpdate$2(boolean z, Continuation<? super UpdateCheckerManager$checkForUpdate$2> continuation) {
        super(2, continuation);
        this.$includePreRelease = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new UpdateCheckerManager$checkForUpdate$2(this.$includePreRelease, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CheckUpdateResult> continuation) {
        return ((UpdateCheckerManager$checkForUpdate$2) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        GitHubRelease gitHubRelease;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object obj2 = null;
        if (this.label != 0) {
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d.b(obj);
        try {
            String strD = this.$includePreRelease ? "https://api.github.com/repos/2dust/v2rayNG/releases" : qf3.d("https://api.github.com/repos/2dust/v2rayNG/releases", "latest");
            String strB = i60.b(0, strD);
            if (strB == null || strB.length() == 0) {
                Regex regex = ul1.a;
                Lazy lazy = zq0.a;
                strB = i60.b(ul1.y(Integer.parseInt("10808"), zq0.z().d("pref_socks_port")), strD);
                if (strB == null) {
                    throw new IllegalStateException("Failed to get response");
                }
            }
            if (this.$includePreRelease) {
                Object[] objArr = (Object[]) aj0.a(GitHubRelease[].class, strB);
                objArr.getClass();
                if (objArr.length != 0) {
                    obj2 = objArr[0];
                }
                gitHubRelease = (GitHubRelease) obj2;
                if (gitHubRelease == null) {
                    throw new IllegalStateException("No pre-release found");
                }
            } else {
                gitHubRelease = (GitHubRelease) aj0.a(GitHubRelease.class, strB);
            }
            String strI = g.I(gitHubRelease.getTagName(), "v");
            if (a.b(strI) <= 0) {
                return new CheckUpdateResult(false, null, null, null, null, false, 62, null);
            }
            String str = Build.SUPPORTED_ABIS[0];
            str.getClass();
            return new CheckUpdateResult(true, strI, gitHubRelease.getBody(), a.c(gitHubRelease, str), null, gitHubRelease.getPrerelease(), 16, null);
        } catch (Exception e) {
            e.getMessage();
            return new CheckUpdateResult(false, null, null, null, e.getMessage(), false, 46, null);
        }
    }
}
