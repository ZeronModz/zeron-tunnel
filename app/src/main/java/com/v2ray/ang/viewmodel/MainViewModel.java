package com.v2ray.ang.viewmodel;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.AngApplication;
import com.v2ray.ang.dto.ProfileItem;
import com.v2ray.ang.dto.ServerAffiliationInfo;
import com.v2ray.ang.dto.ServersCache;
import com.v2ray.ang.dto.SubscriptionItem;
import com.v2ray.ang.service.V2RayTestService;
import com.v2ray.ang.viewmodel.MainViewModel;
import defpackage.ay2;
import defpackage.hv;
import defpackage.k5;
import defpackage.l71;
import defpackage.lv;
import defpackage.m91;
import defpackage.mk1;
import defpackage.o0;
import defpackage.oy;
import defpackage.rn1;
import defpackage.u7;
import defpackage.ul1;
import defpackage.yg0;
import defpackage.zq0;
import defpackage.zr;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.c;
import kotlin.comparisons.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.b;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;
import kotlin.text.g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n*\u0001W\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\bJ\r\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\bJ\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\bJ\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\bJ\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u000eJ1\u0010!\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010 \u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010 0\u001f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000f¢\u0006\u0004\b%\u0010\u0016J\r\u0010&\u001a\u00020\u000f¢\u0006\u0004\b&\u0010\u0016J\r\u0010'\u001a\u00020\u000f¢\u0006\u0004\b'\u0010\u0016J\r\u0010(\u001a\u00020\u0006¢\u0006\u0004\b(\u0010\bJ\u0015\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u000b¢\u0006\u0004\b.\u0010\u000eJ\r\u0010/\u001a\u00020\u0006¢\u0006\u0004\b/\u0010\bJ\r\u00100\u001a\u00020\u0006¢\u0006\u0004\b0\u0010\bR\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\"\u00103\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u0010\u000eR\"\u00108\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00104\u001a\u0004\b9\u00106\"\u0004\b:\u0010\u000eR\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020;0 8\u0006¢\u0006\f\n\u0004\b<\u00102\u001a\u0004\b=\u0010>R!\u0010C\u001a\b\u0012\u0004\u0012\u00020@0?8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR!\u0010F\u001a\b\u0012\u0004\u0012\u00020@0?8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u0010B\u001a\u0004\bF\u0010DR!\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000f0?8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010B\u001a\u0004\bH\u0010DR!\u0010L\u001a\b\u0012\u0004\u0012\u00020\u000b0?8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010B\u001a\u0004\bK\u0010DR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010B\u001a\u0004\bO\u0010PR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020R0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001d\u0010U\u001a\b\u0012\u0004\u0012\u00020\u000b0?8\u0006¢\u0006\f\n\u0004\bU\u0010T\u001a\u0004\bV\u0010DR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020R0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010TR\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020R0[8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020R0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010TR\u001d\u0010a\u001a\b\u0012\u0004\u0012\u00020R0[8\u0006¢\u0006\f\n\u0004\ba\u0010]\u001a\u0004\bb\u0010_R\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020R0[8F¢\u0006\u0006\u001a\u0004\bc\u0010_¨\u0006e"}, d2 = {"Lcom/v2ray/ang/viewmodel/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lmk1;", "startListenBroadcast", "()V", "onCleared", "reloadServerList", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "guid", "removeServer", "(Ljava/lang/String;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "fromPosition", "toPosition", "swapServer", "(II)V", "updateCache", "updateConfigViaSubAll", "()I", "exportAllServer", "testAllTcping", "testAllRealPing", "testCurrentServerRealPing", "id", "subscriptionIdChanged", "Landroid/content/Context;", "context", "Lkotlin/Pair;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "getSubscriptions", "(Landroid/content/Context;)Lkotlin/Pair;", "getPosition", "(Ljava/lang/String;)I", "removeDuplicateServer", "removeAllServer", "removeInvalidServer", "sortByTestResults", "Landroid/content/res/AssetManager;", "assets", "initAssets", "(Landroid/content/res/AssetManager;)V", "keyword", "filterConfig", "loadStartTime", "updateBytes", "serverList", "Ljava/util/List;", "subscriptionId", "Ljava/lang/String;", "getSubscriptionId", "()Ljava/lang/String;", "setSubscriptionId", "keywordFilter", "getKeywordFilter", "setKeywordFilter", "Lcom/v2ray/ang/dto/ServersCache;", "serversCache", "getServersCache", "()Ljava/util/List;", "Landroidx/lifecycle/MutableLiveData;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "isRunning$delegate", "Lkotlin/Lazy;", "isRunning", "()Landroidx/lifecycle/MutableLiveData;", "isSuccess$delegate", "isSuccess", "updateListAction$delegate", "getUpdateListAction", "updateListAction", "updateTestResultAction$delegate", "getUpdateTestResultAction", "updateTestResultAction", "Lkotlinx/coroutines/CoroutineScope;", "tcpingTestScope$delegate", "getTcpingTestScope", "()Lkotlinx/coroutines/CoroutineScope;", "tcpingTestScope", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "_startTime", "Landroidx/lifecycle/MutableLiveData;", "logAction", "getLogAction", "com/v2ray/ang/viewmodel/MainViewModel$mMsgReceiver$1", "mMsgReceiver", "Lcom/v2ray/ang/viewmodel/MainViewModel$mMsgReceiver$1;", "_downloaded", "Landroidx/lifecycle/LiveData;", "downloaded", "Landroidx/lifecycle/LiveData;", "getDownloaded", "()Landroidx/lifecycle/LiveData;", "_uploaded", "uploaded", "getUploaded", "getStartTime", "startTime", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MainViewModel extends AndroidViewModel {
    private final MutableLiveData<Long> _downloaded;
    private final MutableLiveData<Long> _startTime;
    private final MutableLiveData<Long> _uploaded;
    private final LiveData<Long> downloaded;

    /* JADX INFO: renamed from: isRunning$delegate, reason: from kotlin metadata */
    private final Lazy isRunning;

    /* JADX INFO: renamed from: isSuccess$delegate, reason: from kotlin metadata */
    private final Lazy isSuccess;
    private String keywordFilter;
    private final MutableLiveData<String> logAction;
    private final MainViewModel$mMsgReceiver$1 mMsgReceiver;
    private List<String> serverList;
    private final List<ServersCache> serversCache;
    private String subscriptionId;

    /* JADX INFO: renamed from: tcpingTestScope$delegate, reason: from kotlin metadata */
    private final Lazy tcpingTestScope;

    /* JADX INFO: renamed from: updateListAction$delegate, reason: from kotlin metadata */
    private final Lazy updateListAction;

    /* JADX INFO: renamed from: updateTestResultAction$delegate, reason: from kotlin metadata */
    private final Lazy updateTestResultAction;
    private final LiveData<Long> uploaded;

    /* JADX INFO: renamed from: com.v2ray.ang.viewmodel.MainViewModel$initAssets$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.v2ray.ang.viewmodel.MainViewModel$initAssets$1", f = "MainViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        final /* synthetic */ AssetManager $assets;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AssetManager assetManager, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$assets = assetManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return MainViewModel.this.new AnonymousClass1(this.$assets, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d.b(obj);
            l71.f(MainViewModel.this.getApplication(), this.$assets);
            return mk1.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\"\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"com/v2ray/ang/viewmodel/MainViewModel$sortByTestResults$ServerDelay", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "guid", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "testDelayMillis", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;J)V", "getGuid", "()Ljava/lang/String;", "setGuid", "(Ljava/lang/String;)V", "getTestDelayMillis", "()J", "setTestDelayMillis", "(J)V", "component1", "component2", "copy", "(Ljava/lang/String;J)Lcom/v2ray/ang/viewmodel/MainViewModel$sortByTestResults$ServerDelay;", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ServerDelay {
        private String guid;
        private long testDelayMillis;

        public ServerDelay(String str, long j) {
            str.getClass();
            this.guid = str;
            this.testDelayMillis = j;
        }

        public static /* synthetic */ ServerDelay copy$default(ServerDelay serverDelay, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = serverDelay.guid;
            }
            if ((i & 2) != 0) {
                j = serverDelay.testDelayMillis;
            }
            return serverDelay.copy(str, j);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGuid() {
            return this.guid;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTestDelayMillis() {
            return this.testDelayMillis;
        }

        public final ServerDelay copy(String guid, long testDelayMillis) {
            guid.getClass();
            return new ServerDelay(guid, testDelayMillis);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServerDelay)) {
                return false;
            }
            ServerDelay serverDelay = (ServerDelay) other;
            return yg0.a(this.guid, serverDelay.guid) && this.testDelayMillis == serverDelay.testDelayMillis;
        }

        public final String getGuid() {
            return this.guid;
        }

        public final long getTestDelayMillis() {
            return this.testDelayMillis;
        }

        public int hashCode() {
            int iHashCode = this.guid.hashCode() * 31;
            long j = this.testDelayMillis;
            return iHashCode + ((int) (j ^ (j >>> 32)));
        }

        public final void setGuid(String str) {
            str.getClass();
            this.guid = str;
        }

        public final void setTestDelayMillis(long j) {
            this.testDelayMillis = j;
        }

        public String toString() {
            return "ServerDelay(guid=" + this.guid + ", testDelayMillis=" + this.testDelayMillis + ")";
        }
    }

    /* JADX INFO: renamed from: com.v2ray.ang.viewmodel.MainViewModel$testAllRealPing$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.v2ray.ang.viewmodel.MainViewModel$testAllRealPing$2", f = "MainViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        final /* synthetic */ List<ServersCache> $serversCopy;
        int label;
        final /* synthetic */ MainViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(List<ServersCache> list, MainViewModel mainViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$serversCopy = list;
            this.this$0 = mainViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$serversCopy, this.this$0, continuation);
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
            d.b(obj);
            for (ServersCache serversCache : this.$serversCopy) {
                Application application = this.this$0.getApplication();
                String guid = serversCache.getGuid();
                application.getClass();
                guid.getClass();
                try {
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(application, (Class<?>) V2RayTestService.class));
                    intent.putExtra("key", 7);
                    intent.putExtra("content", (Serializable) guid);
                    application.startService(intent);
                } catch (Exception unused) {
                }
            }
            return mk1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v19, types: [com.v2ray.ang.viewmodel.MainViewModel$mMsgReceiver$1] */
    public MainViewModel(Application application) {
        super(application);
        application.getClass();
        Lazy lazy = zq0.a;
        this.serverList = zq0.f();
        String strE = zq0.z().e("cache_subscription_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        this.subscriptionId = strE == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : strE;
        this.keywordFilter = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.serversCache = new ArrayList();
        this.isRunning = c.b(new o0(24));
        this.isSuccess = c.b(new o0(25));
        this.updateListAction = c.b(new o0(26));
        this.updateTestResultAction = c.b(new o0(27));
        this.tcpingTestScope = c.b(new o0(28));
        this._startTime = new MutableLiveData<>();
        this.logAction = new MutableLiveData<>();
        this.mMsgReceiver = new BroadcastReceiver() { // from class: com.v2ray.ang.viewmodel.MainViewModel$mMsgReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context ctx, Intent intent) {
                Object serializableExtra;
                if (intent != null) {
                    intent.getStringExtra("content");
                }
                Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("key", 0)) : null;
                if (numValueOf != null && numValueOf.intValue() == 11) {
                    this.this$0.getLogAction().k("V2ray Running");
                    this.this$0.isRunning().k(Boolean.TRUE);
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 12) {
                    this.this$0.getLogAction().k("V2ray Not Running");
                    MutableLiveData<Boolean> mutableLiveDataIsRunning = this.this$0.isRunning();
                    Boolean bool = Boolean.FALSE;
                    mutableLiveDataIsRunning.k(bool);
                    this.this$0.isSuccess().k(bool);
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 31) {
                    this.this$0.getLogAction().k("V2ray Start Success");
                    this.this$0.isRunning().k(Boolean.TRUE);
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 32) {
                    this.this$0.getLogAction().k("V2ray failed to start");
                    MutableLiveData<Boolean> mutableLiveDataIsRunning2 = this.this$0.isRunning();
                    Boolean bool2 = Boolean.FALSE;
                    mutableLiveDataIsRunning2.k(bool2);
                    this.this$0.isSuccess().k(bool2);
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 41) {
                    this.this$0.getLogAction().k("V2ray Stop Success");
                    MutableLiveData<Boolean> mutableLiveDataIsRunning3 = this.this$0.isRunning();
                    Boolean bool3 = Boolean.FALSE;
                    mutableLiveDataIsRunning3.k(bool3);
                    this.this$0.isSuccess().k(bool3);
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 61) {
                    this.this$0.getLogAction().k("V2ray Checking Server");
                    Object objD = this.this$0.isRunning().d();
                    Boolean bool4 = Boolean.TRUE;
                    if (yg0.a(objD, bool4)) {
                        this.this$0.getUpdateTestResultAction().k(intent.getStringExtra("content"));
                        String stringExtra = intent.getStringExtra("content");
                        if (stringExtra != null) {
                            MainViewModel mainViewModel = this.this$0;
                            if (g.o(stringExtra, "Success", false)) {
                                mainViewModel.isSuccess().k(bool4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 71) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializableExtra = intent.getSerializableExtra("content", Pair.class);
                    } else {
                        Object serializableExtra2 = intent.getSerializableExtra("content");
                        serializableExtra = (Pair) (serializableExtra2 instanceof Pair ? serializableExtra2 : null);
                    }
                    Pair pair = (Pair) serializableExtra;
                    if (pair == null) {
                        return;
                    }
                    Lazy lazy2 = zq0.a;
                    zq0.o(((Number) pair.getSecond()).longValue(), (String) pair.getFirst());
                    this.this$0.getUpdateListAction().k(Integer.valueOf(this.this$0.getPosition((String) pair.getFirst())));
                }
            }
        };
        MutableLiveData<Long> mutableLiveData = new MutableLiveData<>();
        this._downloaded = mutableLiveData;
        this.downloaded = mutableLiveData;
        MutableLiveData<Long> mutableLiveData2 = new MutableLiveData<>();
        this._uploaded = mutableLiveData2;
        this.uploaded = mutableLiveData2;
    }

    private final CoroutineScope getTcpingTestScope() {
        return (CoroutineScope) this.tcpingTestScope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData isRunning_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData isSuccess_delegate$lambda$1() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope tcpingTestScope_delegate$lambda$4() {
        lv lvVar = oy.a;
        return zr.a(hv.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData updateListAction_delegate$lambda$2() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData updateTestResultAction_delegate$lambda$3() {
        return new MutableLiveData();
    }

    public final int exportAllServer() {
        List<String> listR;
        if (this.subscriptionId.length() == 0 && this.keywordFilter.length() == 0) {
            listR = this.serverList;
        } else {
            List<ServersCache> list = this.serversCache;
            ArrayList arrayList = new ArrayList(kotlin.collections.c.l(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ServersCache) it.next()).getGuid());
            }
            listR = kotlin.collections.c.R(arrayList);
        }
        Application application = getApplication();
        application.getClass();
        listR.getClass();
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it2 = listR.iterator();
            while (it2.hasNext()) {
                String strT = ay2.t(it2.next());
                if (!TextUtils.isEmpty(strT)) {
                    sb.append(strT);
                    sb.append('\n');
                }
            }
            if (sb.length() > 0) {
                Regex regex = ul1.a;
                ul1.A(application, sb.toString());
            }
            return b.f(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(sb)).size();
        } catch (Exception unused) {
            return -1;
        }
    }

    public final void filterConfig(String keyword) {
        keyword.getClass();
        if (keyword.equals(this.keywordFilter)) {
            return;
        }
        this.keywordFilter = keyword;
        Lazy lazy = zq0.a;
        zq0.z().i("cache_keyword_filter", keyword);
        reloadServerList();
    }

    public final LiveData<Long> getDownloaded() {
        return this.downloaded;
    }

    public final String getKeywordFilter() {
        return this.keywordFilter;
    }

    public final MutableLiveData<String> getLogAction() {
        return this.logAction;
    }

    public final int getPosition(String guid) {
        guid.getClass();
        int i = 0;
        for (Object obj : this.serversCache) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.c.O();
                throw null;
            }
            if (yg0.a(((ServersCache) obj).getGuid(), guid)) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    public final List<ServersCache> getServersCache() {
        return this.serversCache;
    }

    public final LiveData<Long> getStartTime() {
        return this._startTime;
    }

    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    public final Pair<List<String>, List<String>> getSubscriptions(Context context) {
        context.getClass();
        Lazy lazy = zq0.a;
        ArrayList arrayListI = zq0.i();
        if (this.subscriptionId.length() > 0) {
            ArrayList arrayList = new ArrayList(kotlin.collections.c.l(arrayListI, 10));
            Iterator it = arrayListI.iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((Pair) it.next()).getFirst());
            }
            if (!arrayList.contains(this.subscriptionId)) {
                subscriptionIdChanged(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            }
        }
        if (arrayListI.isEmpty()) {
            return new Pair<>(null, null);
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.c.l(arrayListI, 10));
        Iterator it2 = arrayListI.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) ((Pair) it2.next()).getFirst());
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList3.add(0, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        ArrayList arrayList4 = new ArrayList(kotlin.collections.c.l(arrayListI, 10));
        Iterator it3 = arrayListI.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((SubscriptionItem) ((Pair) it3.next()).getSecond()).getRemarks());
        }
        ArrayList arrayList5 = new ArrayList(arrayList4);
        String string = context.getString(R.string.filter_config_all);
        string.getClass();
        arrayList5.add(0, string);
        return new Pair<>(arrayList3, arrayList5);
    }

    public final MutableLiveData<Integer> getUpdateListAction() {
        return (MutableLiveData) this.updateListAction.getValue();
    }

    public final MutableLiveData<String> getUpdateTestResultAction() {
        return (MutableLiveData) this.updateTestResultAction.getValue();
    }

    public final LiveData<Long> getUploaded() {
        return this.uploaded;
    }

    public final void initAssets(AssetManager assets) {
        assets.getClass();
        kotlinx.coroutines.c.d(rn1.a(this), oy.a, null, new AnonymousClass1(assets, null), 2);
    }

    public final MutableLiveData<Boolean> isRunning() {
        return (MutableLiveData) this.isRunning.getValue();
    }

    public final MutableLiveData<Boolean> isSuccess() {
        return (MutableLiveData) this.isSuccess.getValue();
    }

    public final void loadStartTime() {
        MutableLiveData<Long> mutableLiveData = this._startTime;
        Lazy lazy = zq0.a;
        mutableLiveData.k(Long.valueOf(zq0.u().c(0L, "v2rayTime")));
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        ((AngApplication) getApplication()).unregisterReceiver(this.mMsgReceiver);
        Job job = (Job) getTcpingTestScope().getB().get(Job.Key);
        if (job != null) {
            kotlinx.coroutines.g.c(job);
        }
        m91.a.a();
    }

    public final void reloadServerList() {
        Lazy lazy = zq0.a;
        this.serverList = zq0.f();
        updateCache();
        getUpdateListAction().k(-1);
    }

    public final int removeAllServer() {
        if (this.subscriptionId.length() != 0 || this.keywordFilter.length() != 0) {
            for (ServersCache serversCache : kotlin.collections.c.R(this.serversCache)) {
                Lazy lazy = zq0.a;
                zq0.F(serversCache.getGuid());
            }
            return kotlin.collections.c.R(this.serversCache).size();
        }
        Lazy lazy2 = zq0.a;
        String[] strArrA = zq0.w().a();
        int length = strArrA != null ? strArrA.length : 0;
        zq0.v().clearAll();
        zq0.w().clearAll();
        zq0.y().clearAll();
        return length;
    }

    public final int removeDuplicateServer() {
        ArrayList arrayList = new ArrayList();
        for (ServersCache serversCache : this.serversCache) {
            Lazy lazy = zq0.a;
            ProfileItem profileItemE = zq0.e(serversCache.getGuid());
            if (profileItemE != null) {
                arrayList.add(new Pair(serversCache.getGuid(), profileItemE));
            }
        }
        ArrayList<String> arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.c.O();
                throw null;
            }
            ProfileItem profileItem = (ProfileItem) ((Pair) obj).getSecond();
            int i3 = 0;
            for (Object obj2 : arrayList) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    kotlin.collections.c.O();
                    throw null;
                }
                Pair pair = (Pair) obj2;
                if (i3 > i && profileItem.equals((ProfileItem) pair.getSecond()) && !arrayList2.contains(pair.getFirst())) {
                    arrayList2.add(pair.getFirst());
                }
                i3 = i4;
            }
            i = i2;
        }
        for (String str : arrayList2) {
            Lazy lazy2 = zq0.a;
            zq0.F(str);
        }
        return arrayList2.size();
    }

    public final int removeInvalidServer() {
        if (this.subscriptionId.length() == 0 && this.keywordFilter.length() == 0) {
            Lazy lazy = zq0.a;
            return zq0.E(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
        int iE = 0;
        for (ServersCache serversCache : kotlin.collections.c.R(this.serversCache)) {
            Lazy lazy2 = zq0.a;
            iE += zq0.E(serversCache.getGuid());
        }
        return iE;
    }

    public final void removeServer(String guid) {
        guid.getClass();
        this.serverList.remove(guid);
        Lazy lazy = zq0.a;
        zq0.F(guid);
        int position = getPosition(guid);
        if (position >= 0) {
            this.serversCache.remove(position);
        }
    }

    public final void setKeywordFilter(String str) {
        str.getClass();
        this.keywordFilter = str;
    }

    public final void setSubscriptionId(String str) {
        str.getClass();
        this.subscriptionId = str;
    }

    public final void sortByTestResults() {
        ArrayList<ServerDelay> arrayList = new ArrayList();
        Lazy lazy = zq0.a;
        ArrayList<String> arrayListF = zq0.f();
        for (String str : arrayListF) {
            Lazy lazy2 = zq0.a;
            ServerAffiliationInfo serverAffiliationInfoD = zq0.d(str);
            long testDelayMillis = serverAffiliationInfoD != null ? serverAffiliationInfoD.getTestDelayMillis() : 0L;
            if (testDelayMillis <= 0) {
                testDelayMillis = 999999;
            }
            arrayList.add(new ServerDelay(str, testDelayMillis));
        }
        if (arrayList.size() > 1) {
            Comparator comparator = new Comparator() { // from class: com.v2ray.ang.viewmodel.MainViewModel$sortByTestResults$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return a.a(Long.valueOf(((MainViewModel.ServerDelay) t).getTestDelayMillis()), Long.valueOf(((MainViewModel.ServerDelay) t2).getTestDelayMillis()));
                }
            };
            if (arrayList.size() > 1) {
                Collections.sort(arrayList, comparator);
            }
        }
        for (ServerDelay serverDelay : arrayList) {
            arrayListF.remove(serverDelay.getGuid());
            arrayListF.add(serverDelay.getGuid());
        }
        Lazy lazy3 = zq0.a;
        zq0.m(arrayListF);
    }

    public final void startListenBroadcast() {
        isRunning().k(Boolean.FALSE);
        IntentFilter intentFilter = new IntentFilter("com.v2ray.ang.action.activity");
        Application application = getApplication();
        MainViewModel$mMsgReceiver$1 mainViewModel$mMsgReceiver$1 = this.mMsgReceiver;
        Regex regex = ul1.a;
        k5.B(application, mainViewModel$mMsgReceiver$1, intentFilter, Build.VERSION.SDK_INT >= 33 ? 2 : 4);
        Application application2 = getApplication();
        application2.getClass();
        try {
            Intent intent = new Intent();
            intent.setAction("com.v2ray.ang.action.service");
            intent.setPackage("dev.zeron.tunnel");
            intent.putExtra("key", 1);
            intent.putExtra("content", (Serializable) RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            application2.sendBroadcast(intent);
        } catch (Exception unused) {
        }
    }

    public final void subscriptionIdChanged(String id) {
        id.getClass();
        if (yg0.a(this.subscriptionId, id)) {
            return;
        }
        this.subscriptionId = id;
        Lazy lazy = zq0.a;
        zq0.z().i("cache_subscription_id", id);
        reloadServerList();
    }

    public final void swapServer(int fromPosition, int toPosition) {
        int length = this.subscriptionId.length();
        List<String> list = this.serverList;
        if (length == 0) {
            Collections.swap(list, fromPosition, toPosition);
        } else {
            Collections.swap(this.serverList, list.indexOf(this.serversCache.get(fromPosition).getGuid()), this.serverList.indexOf(this.serversCache.get(toPosition).getGuid()));
        }
        Collections.swap(this.serversCache, fromPosition, toPosition);
        Lazy lazy = zq0.a;
        zq0.m(this.serverList);
    }

    public final void testAllRealPing() {
        Application application = getApplication();
        application.getClass();
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(application, (Class<?>) V2RayTestService.class));
            intent.putExtra("key", 72);
            intent.putExtra("content", (Serializable) RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            application.startService(intent);
        } catch (Exception unused) {
        }
        Lazy lazy = zq0.a;
        List<ServersCache> list = this.serversCache;
        ArrayList arrayList = new ArrayList(kotlin.collections.c.l(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ServersCache) it.next()).getGuid());
        }
        zq0.a(kotlin.collections.c.R(arrayList));
        getUpdateListAction().k(-1);
        kotlinx.coroutines.c.d(rn1.a(this), oy.a, null, new AnonymousClass2(kotlin.collections.c.R(this.serversCache), this, null), 2);
    }

    public final void testAllTcping() {
        MainViewModel mainViewModel;
        Job job = (Job) getTcpingTestScope().getB().get(Job.Key);
        if (job != null) {
            kotlinx.coroutines.g.c(job);
        }
        m91.a.a();
        Lazy lazy = zq0.a;
        List<ServersCache> list = this.serversCache;
        ArrayList arrayList = new ArrayList(kotlin.collections.c.l(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ServersCache) it.next()).getGuid());
        }
        zq0.a(kotlin.collections.c.R(arrayList));
        for (ServersCache serversCache : kotlin.collections.c.R(this.serversCache)) {
            ProfileItem profile = serversCache.getProfile();
            String server = profile.getServer();
            String serverPort = profile.getServerPort();
            if (server == null || serverPort == null) {
                mainViewModel = this;
            } else {
                mainViewModel = this;
                kotlinx.coroutines.c.d(this.getTcpingTestScope(), null, null, new MainViewModel$testAllTcping$2$1(server, serverPort, serversCache, mainViewModel, null), 3);
            }
            this = mainViewModel;
        }
    }

    public final void testCurrentServerRealPing() {
        Application application = getApplication();
        application.getClass();
        try {
            Intent intent = new Intent();
            intent.setAction("com.v2ray.ang.action.service");
            intent.setPackage("dev.zeron.tunnel");
            intent.putExtra("key", 6);
            intent.putExtra("content", (Serializable) RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            application.sendBroadcast(intent);
        } catch (Exception unused) {
        }
    }

    public final void updateBytes() {
        MutableLiveData<Long> mutableLiveData = this._downloaded;
        Lazy lazy = zq0.a;
        mutableLiveData.i(Long.valueOf(zq0.u().c(0L, "BytesIn")));
        this._uploaded.i(Long.valueOf(zq0.u().c(0L, "BytesOut")));
    }

    public final synchronized void updateCache() {
        try {
            this.serversCache.clear();
            for (String str : this.serverList) {
                Lazy lazy = zq0.a;
                ProfileItem profileItemE = zq0.e(str);
                if (profileItemE != null && (this.subscriptionId.length() <= 0 || yg0.a(this.subscriptionId, profileItemE.getSubscriptionId()))) {
                    if (this.keywordFilter.length() != 0) {
                        String remarks = profileItemE.getRemarks();
                        Locale locale = Locale.ROOT;
                        String lowerCase = remarks.toLowerCase(locale);
                        lowerCase.getClass();
                        String lowerCase2 = this.keywordFilter.toLowerCase(locale);
                        lowerCase2.getClass();
                        if (g.o(lowerCase, lowerCase2, false)) {
                        }
                    }
                    this.serversCache.add(new ServersCache(str, profileItemE));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int updateConfigViaSubAll() {
        if (this.subscriptionId.length() == 0) {
            try {
                Lazy lazy = zq0.a;
                Iterator it = zq0.i().iterator();
                int iX = 0;
                while (it.hasNext()) {
                    iX += ay2.x((Pair) it.next());
                }
                return iX;
            } catch (Exception unused) {
            }
        } else {
            Lazy lazy2 = zq0.a;
            SubscriptionItem subscriptionItemH = zq0.h(this.subscriptionId);
            if (subscriptionItemH != null) {
                return ay2.x(new Pair(this.subscriptionId, subscriptionItemH));
            }
        }
        return 0;
    }
}
