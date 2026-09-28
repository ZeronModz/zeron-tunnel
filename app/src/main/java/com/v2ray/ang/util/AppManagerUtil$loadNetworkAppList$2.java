package com.v2ray.ang.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import com.trilead.ssh2.sftp.AttribFlags;
import com.v2ray.ang.dto.AppInfo;
import defpackage.mk1;
import defpackage.u7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/v2ray/ang/dto/AppInfo;", "Lkotlin/collections/ArrayList;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.v2ray.ang.util.AppManagerUtil$loadNetworkAppList$2", f = "AppManagerUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class AppManagerUtil$loadNetworkAppList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ArrayList<AppInfo>>, Object> {
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppManagerUtil$loadNetworkAppList$2(Context context, Continuation<? super AppManagerUtil$loadNetworkAppList$2> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new AppManagerUtil$loadNetworkAppList$2(this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ArrayList<AppInfo>> continuation) {
        return ((AppManagerUtil$loadNetworkAppList$2) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d.b(obj);
        PackageManager packageManager = this.$context.getPackageManager();
        List<PackageInfo> installedPackages = packageManager.getInstalledPackages(AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE);
        installedPackages.getClass();
        ArrayList arrayList = new ArrayList();
        for (PackageInfo packageInfo : installedPackages) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                String string = applicationInfo.loadLabel(packageManager).toString();
                Drawable drawableLoadIcon = applicationInfo.loadIcon(packageManager);
                if (drawableLoadIcon != null) {
                    boolean z = (applicationInfo.flags & 1) > 0;
                    String str = packageInfo.packageName;
                    str.getClass();
                    arrayList.add(new AppInfo(string, str, drawableLoadIcon, z, 0));
                }
            }
        }
        return arrayList;
    }
}
