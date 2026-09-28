package com.v2ray.ang.ui;

import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog$Builder;
import dev.zeron.tunnel.R;
import com.v2ray.ang.dto.CheckUpdateResult;
import defpackage.mk1;
import defpackage.qf3;
import defpackage.u7;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "com.v2ray.ang.ui.AboutActivity$checkForUpdates$1", f = "AboutActivity.kt", i = {}, l = {228}, m = "invokeSuspend", n = {}, s = {})
final class AboutActivity$checkForUpdates$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ boolean $includePreRelease;
    int label;
    final /* synthetic */ AboutActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AboutActivity$checkForUpdates$1(boolean z, AboutActivity aboutActivity, Continuation<? super AboutActivity$checkForUpdates$1> continuation) {
        super(2, continuation);
        this.$includePreRelease = z;
        this.this$0 = aboutActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new AboutActivity$checkForUpdates$1(this.$includePreRelease, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((AboutActivity$checkForUpdates$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.d.b(obj);
            boolean z = this.$includePreRelease;
            this.label = 1;
            obj = com.v2ray.ang.handler.a.a(z, this);
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
        CheckUpdateResult checkUpdateResult = (CheckUpdateResult) obj;
        boolean hasUpdate = checkUpdateResult.getHasUpdate();
        AboutActivity aboutActivity = this.this$0;
        if (hasUpdate) {
            int i2 = AboutActivity.g;
            aboutActivity.getClass();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(aboutActivity);
            String string = aboutActivity.getString(R.string.update_new_version_found, checkUpdateResult.getLatestVersion());
            AlertController.AlertParams alertParams = alertDialog$Builder.a;
            alertParams.e = string;
            alertParams.g = checkUpdateResult.getReleaseNotes();
            alertDialog$Builder.d(R.string.update_now, new defpackage.j(0, checkUpdateResult, aboutActivity));
            alertDialog$Builder.c(android.R.string.cancel, null);
            alertDialog$Builder.f();
        } else {
            qf3.K(aboutActivity, R.string.update_already_latest_version);
        }
        return mk1.a;
    }
}
