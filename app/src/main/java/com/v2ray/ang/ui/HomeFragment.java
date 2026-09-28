package com.v2ray.ang.ui;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog$Builder;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dev.zeron.tunnel.R;
import com.github.mikephil.charting.charts.LineChart;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sandok.tunnel.core.ConfigParser;
import com.sandok.tunnel.core.Connection;
import com.sandok.tunnel.core.VpnProfile;
import com.sandok.tunnel.service.InjectorService;
import com.sandok.tunnel.service.OpenVPNService;
import com.sandok.tunnel.utils.ConfigUtil;
import com.sandok.tunnel.utils.StatisticsGraphData;
import com.trilead.ssh2.sftp.AttribFlags;
import com.v2ray.ang.AngApplication;
import com.v2ray.ang.Hometab;
import com.v2ray.ang.adapter.NetworkAdapter;
import com.v2ray.ang.adapter.ServerAdapter;
import com.v2ray.ang.helper.Protocol;
import com.v2ray.ang.service.CountdownService;
import com.v2ray.ang.ui.HomeFragment;
import com.v2ray.ang.util.CircleProgressBar;
import com.v2ray.ang.util.ConfigUpdate;
import com.v2ray.ang.util.GoogleMobileAdsConsentManager;
import com.v2ray.ang.util.NetworkMonitor;
import com.v2ray.ang.viewmodel.ConfigData;
import com.v2ray.ang.viewmodel.ConfigViewModel;
import com.v2ray.ang.viewmodel.MainViewModel;
import com.v2ray.ang.viewmodel.NetworkList;
import com.v2ray.ang.viewmodel.ServerList;
import com.vpn.sandok.ultrasshservice.LaunchVpn;
import com.vpn.sandok.ultrasshservice.SocksHttpService;
import com.vpn.sandok.ultrasshservice.config.Settings;
import com.vpn.sandok.ultrasshservice.config.SettingsConstants;
import com.vpn.sandok.ultrasshservice.logger.ConnectionStatus;
import com.vpn.sandok.ultrasshservice.logger.LogItem;
import com.vpn.sandok.ultrasshservice.logger.SkStatus;
import com.vpn.sandok.ultrasshservice.tunnel.TunnelManagerHelper;
import com.vpn.sandok.ultrasshservice.tunnel.vpn.TunnelVpnService;
import com.vpn.sandok.ultrasshservice.util.securepreferences.SecurePreferences;
import defpackage.ad0;
import defpackage.bn0;
import defpackage.e4;
import defpackage.ec1;
import defpackage.g90;
import defpackage.hz;
import defpackage.j60;
import defpackage.jd0;
import defpackage.k;
import defpackage.kd0;
import defpackage.ld0;
import defpackage.lv;
import defpackage.mk1;
import defpackage.nd0;
import defpackage.od0;
import defpackage.oy;
import defpackage.qf3;
import defpackage.r6;
import defpackage.tc0;
import defpackage.u7;
import defpackage.ul1;
import defpackage.vh;
import defpackage.xc0;
import defpackage.xm;
import defpackage.xu;
import defpackage.yc0;
import defpackage.yg0;
import defpackage.zq0;
import defpackage.zr;
import java.util.Objects;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.c;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.random.Random;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.ContextScope;
import libv2ray.CoreController;
import libv2ray.Libv2ray;
import me.ibrahimsn.lib.SmoothBottomBar;
import net.openvpn.openvpn.ClientAPI_ConnectionInfo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0003\u000b\f\rB\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/v2ray/ang/ui/HomeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/sandok/tunnel/service/InjectorService$InjectorListener;", "Lcom/sandok/tunnel/service/OpenVPNService$EventReceiver;", "Lcom/v2ray/ang/adapter/ServerAdapter$ServerItemClickListener;", "Lcom/v2ray/ang/adapter/NetworkAdapter$NetworkItemClickListener;", "Lcom/v2ray/ang/util/ConfigUpdate$UpdateAvailable;", "Lcom/vpn/sandok/ultrasshservice/logger/SkStatus$StateListener;", "Lcom/vpn/sandok/ultrasshservice/logger/SkStatus$LogListener;", "<init>", "()V", "Companion", "OVPNConfig", "EpkiPost", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HomeFragment extends Fragment implements InjectorService.InjectorListener, OpenVPNService.EventReceiver, ServerAdapter.ServerItemClickListener, NetworkAdapter.NetworkItemClickListener, ConfigUpdate.UpdateAvailable, SkStatus.StateListener, SkStatus.LogListener {
    public static final /* synthetic */ int f2 = 0;
    public String A0;
    public LineChart A1;
    public String B0;
    public WeakReference B1;
    public String C0;
    public ContextScope C1;
    public String D0;
    public TextView D1;
    public String E0;
    public ImageView E1;
    public final Gson F0;
    public InterstitialAd F1;
    public List G0;
    public ConfigUpdate G1;
    public List H0;
    public boolean H1;
    public androidx.appcompat.app.g I0;
    public String I1;
    public TextView J0;
    public TextView J1;
    public TextView K0;
    public LinearLayout K1;
    public TextView L0;
    public SmoothBottomBar L1;
    public TextView M0;
    public ImageView M1;
    public TextView N0;
    public ImageView N1;
    public ImageView O0;
    public final ContextScope O1;
    public MaterialButton P0;
    public boolean P1;
    public final g90 Q0;
    public boolean Q1;
    public RelativeLayout R0;
    public int R1;
    public RelativeLayout S0;
    public boolean S1;
    public boolean T0;
    public final jd0 T1;
    public ConfigUtil U0;
    public int U1;
    public int V0;
    public final int V1;
    public final r6 W0;
    public boolean W1;
    public TextView X0;
    public List X1;
    public String Y;
    public TextView Y0;
    public OpenVPNService Y1;
    public String Z;
    public TextView Z0;
    public long Z1;
    public String a0;
    public TextView a1;
    public int a2;
    public String b0;
    public TextView b1;
    public final j60 b2;
    public boolean c0;
    public CardView c1;
    public final Handler c2;
    public String d0;
    public Job d1;
    public InjectorService d2;
    public String e0;
    public final ViewModelLazy e1;
    public final kd0 e2;
    public String f0;
    public final ViewModelLazy f1;
    public String g0;
    public NetworkMonitor g1;
    public boolean h0;
    public SwitchMaterial h1;
    public String i0;
    public final g90 i1;
    public String j0;
    public AdView j1;
    public String k0;
    public FrameLayout k1;
    public boolean l0;
    public GoogleMobileAdsConsentManager l1;
    public String m0;
    public final AtomicBoolean m1;
    public String n0;
    public final AtomicBoolean n1;
    public String o0;
    public RewardedAd o1;
    public boolean p0;
    public boolean p1;
    public String q0;
    public boolean q1;
    public String r0;
    public boolean r1;
    public String s0;
    public Job s1;
    public String t0;
    public long t1;
    public String u0;
    public MaterialButton u1;
    public String v0;
    public ProgressBar v1;
    public String w0;
    public int w1;
    public boolean x0;
    public long x1;
    public String y0;
    public long y1;
    public String z0;
    public CircleProgressBar z1;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/v2ray/ang/ui/HomeFragment$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "INTERSTITIAL_COOLDOWN_MS", "J", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "MAX_BANNER_RETRY_COUNT", "I", "BANNER_RETRY_BASE_DELAY_MS", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bd\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/v2ray/ang/ui/HomeFragment$EpkiPost;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "str", "Lmk1;", "post_dispatch", "(Ljava/lang/String;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface EpkiPost {
        void post_dispatch(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/v2ray/ang/ui/HomeFragment$OVPNConfig;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, SettingsConstants.TUNNELTYPE_KEY, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "host", "sni", "proxy", "proxyPort", "payload", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OVPNConfig {
        public final int a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public OVPNConfig(int i, String str, String str2, String str3, String str4, String str5) {
            ec1.T(str, str2, str3, str4, str5);
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OVPNConfig)) {
                return false;
            }
            OVPNConfig oVPNConfig = (OVPNConfig) obj;
            return this.a == oVPNConfig.a && this.b.equals(oVPNConfig.b) && this.c.equals(oVPNConfig.c) && this.d.equals(oVPNConfig.d) && this.e.equals(oVPNConfig.e) && this.f.equals(oVPNConfig.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + vh.c(vh.c(vh.c(vh.c(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OVPNConfig(tunnelType=");
            sb.append(this.a);
            sb.append(", host=");
            sb.append(this.b);
            sb.append(", sni=");
            hz.H(sb, this.c, ", proxy=", this.d, ", proxyPort=");
            return hz.x(sb, this.e, ", payload=", this.f, ")");
        }
    }

    /* JADX INFO: renamed from: com.v2ray.ang.ui.HomeFragment$newLog$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.v2ray.ang.ui.HomeFragment$newLog$1", f = "HomeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return HomeFragment.this.new AnonymousClass1(continuation);
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
            kotlin.d.b(obj);
            HomeFragment homeFragment = HomeFragment.this;
            int i = HomeFragment.f2;
            homeFragment.A0("Fail");
            return mk1.a;
        }
    }

    /* JADX INFO: renamed from: com.v2ray.ang.ui.HomeFragment$newLog$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.v2ray.ang.ui.HomeFragment$newLog$2", f = "HomeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return HomeFragment.this.new AnonymousClass2(continuation);
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
            HomeFragment homeFragment = HomeFragment.this;
            int i = HomeFragment.f2;
            homeFragment.A0("Fail");
            return mk1.a;
        }
    }

    /* JADX INFO: renamed from: com.v2ray.ang.ui.HomeFragment$updateState$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.v2ray.ang.ui.HomeFragment$updateState$1", f = "HomeFragment.kt", i = {}, l = {5021}, m = "invokeSuspend", n = {}, s = {})
    final class C00221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        final /* synthetic */ String $msg;
        int label;

        /* JADX INFO: renamed from: com.v2ray.ang.ui.HomeFragment$updateState$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
        @DebugMetadata(c = "com.v2ray.ang.ui.HomeFragment$updateState$1$1", f = "HomeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C00061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
            final /* synthetic */ String $msg;
            int label;
            final /* synthetic */ HomeFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00061(HomeFragment homeFragment, String str, Continuation<? super C00061> continuation) {
                super(2, continuation);
                this.this$0 = homeFragment;
                this.$msg = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
                return new C00061(this.this$0, this.$msg, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
                return ((C00061) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Job job;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    u7.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.d.b(obj);
                HomeFragment homeFragment = this.this$0;
                String str = this.$msg;
                int i = HomeFragment.f2;
                homeFragment.A0(str);
                if (kotlin.text.g.o(this.$msg, "Stopping SSH", false) && (job = this.this$0.d1) != null) {
                    job.cancel((CancellationException) null);
                }
                return mk1.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00221(String str, Continuation<? super C00221> continuation) {
            super(2, continuation);
            this.$msg = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return HomeFragment.this.new C00221(this.$msg, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
            return ((C00221) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.d.b(obj);
                lv lvVar = oy.a;
                MainCoroutineDispatcher mainCoroutineDispatcher = bn0.a;
                C00061 c00061 = new C00061(HomeFragment.this, this.$msg, null);
                this.label = 1;
                if (kotlinx.coroutines.c.e(mainCoroutineDispatcher, c00061, this) == coroutineSingletons) {
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

    static {
        new Companion(null);
    }

    public HomeFragment() {
        super(R.layout.fragment_home);
        final int i = 1;
        this.h0 = true;
        this.l0 = true;
        this.x0 = true;
        this.F0 = new Gson();
        final int i2 = 0;
        this.Q0 = (g90) registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback(this) { // from class: uc0
            public final /* synthetic */ HomeFragment b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) throws Exception {
                String strB;
                int i3 = i2;
                HomeFragment homeFragment = this.b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i3) {
                    case 0:
                        int i4 = HomeFragment.f2;
                        activityResult.getClass();
                        if (activityResult.a == -1) {
                            homeFragment.F0();
                            return;
                        }
                        return;
                    default:
                        int i5 = HomeFragment.f2;
                        activityResult.getClass();
                        if (activityResult.a != -1) {
                            SwitchMaterial switchMaterial = homeFragment.h1;
                            if (switchMaterial != null) {
                                switchMaterial.setChecked(false);
                                return;
                            }
                            return;
                        }
                        Intent intent = activityResult.b;
                        Uri data = intent != null ? intent.getData() : null;
                        if (data != null) {
                            Context contextM = homeFragment.M();
                            Gson gson = homeFragment.F0;
                            InputStream inputStreamOpenInputStream = contextM.getContentResolver().openInputStream(data);
                            if (inputStreamOpenInputStream != null) {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenInputStream, xm.a), AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT);
                                try {
                                    strB = d.b(bufferedReader);
                                    bufferedReader.close();
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        if3.c(bufferedReader, th);
                                        throw th2;
                                    }
                                }
                            } else {
                                strB = null;
                            }
                            if (strB != null) {
                                try {
                                    if (!Libv2ray.parseConfig(strB)) {
                                        Hometab.n.getClass();
                                        String strA = Hometab.Companion.a(strB);
                                        new JSONObject(strA);
                                        gson.getClass();
                                        Object objC = gson.c(strA, new TypeToken(NetworkList.class));
                                        objC.getClass();
                                        List listZ = c.z((NetworkList) objC);
                                        homeFragment.H0 = listZ;
                                        Lazy lazy = zq0.a;
                                        zq0.I(((NetworkList) c.r(listZ)).getName());
                                        List list = homeFragment.H0;
                                        if (list == null) {
                                            yg0.N("networkList");
                                            throw null;
                                        }
                                        zq0.H(((NetworkList) c.r(list)).getTunnelType());
                                        homeFragment.z0();
                                        zq0.u().i("ConfigFile", strB);
                                        homeFragment.C0();
                                        return;
                                    }
                                    String strGc = Libv2ray.gc();
                                    Hometab.Companion companion = Hometab.n;
                                    strGc.getClass();
                                    companion.getClass();
                                    String strA2 = Hometab.Companion.a(strGc);
                                    new JSONObject(strA2);
                                    gson.getClass();
                                    Object objC2 = gson.c(strA2, new TypeToken(NetworkList.class));
                                    objC2.getClass();
                                    List listZ2 = c.z((NetworkList) objC2);
                                    homeFragment.H0 = listZ2;
                                    Lazy lazy2 = zq0.a;
                                    zq0.I(((NetworkList) c.r(listZ2)).getName());
                                    List list2 = homeFragment.H0;
                                    if (list2 == null) {
                                        yg0.N("networkList");
                                        throw null;
                                    }
                                    zq0.H(((NetworkList) c.r(list2)).getTunnelType());
                                    homeFragment.z0();
                                    zq0.u().i("ConfigFile", strGc);
                                    homeFragment.C0();
                                    return;
                                } catch (Exception unused) {
                                    SwitchMaterial switchMaterial2 = homeFragment.h1;
                                    if (switchMaterial2 != null) {
                                        switchMaterial2.setChecked(false);
                                    }
                                    qf3.N(homeFragment.M(), "Invalid File");
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.W0 = new r6(this, 2);
        this.e1 = new ViewModelLazy(Reflection.a(ConfigViewModel.class), new Function0<ViewModelStore>() { // from class: com.v2ray.ang.ui.HomeFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.L().getViewModelStore();
                viewModelStore.getClass();
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.v2ray.ang.ui.HomeFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return this.L().getDefaultViewModelProviderFactory();
            }
        });
        this.f1 = new ViewModelLazy(Reflection.a(MainViewModel.class), new Function0<ViewModelStore>() { // from class: com.v2ray.ang.ui.HomeFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.L().getViewModelStore();
                viewModelStore.getClass();
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.v2ray.ang.ui.HomeFragment$special$$inlined$activityViewModels$default$4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return this.L().getDefaultViewModelProviderFactory();
            }
        });
        this.i1 = (g90) registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback(this) { // from class: uc0
            public final /* synthetic */ HomeFragment b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) throws Exception {
                String strB;
                int i3 = i;
                HomeFragment homeFragment = this.b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i3) {
                    case 0:
                        int i4 = HomeFragment.f2;
                        activityResult.getClass();
                        if (activityResult.a == -1) {
                            homeFragment.F0();
                            return;
                        }
                        return;
                    default:
                        int i5 = HomeFragment.f2;
                        activityResult.getClass();
                        if (activityResult.a != -1) {
                            SwitchMaterial switchMaterial = homeFragment.h1;
                            if (switchMaterial != null) {
                                switchMaterial.setChecked(false);
                                return;
                            }
                            return;
                        }
                        Intent intent = activityResult.b;
                        Uri data = intent != null ? intent.getData() : null;
                        if (data != null) {
                            Context contextM = homeFragment.M();
                            Gson gson = homeFragment.F0;
                            InputStream inputStreamOpenInputStream = contextM.getContentResolver().openInputStream(data);
                            if (inputStreamOpenInputStream != null) {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenInputStream, xm.a), AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT);
                                try {
                                    strB = d.b(bufferedReader);
                                    bufferedReader.close();
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        if3.c(bufferedReader, th);
                                        throw th2;
                                    }
                                }
                            } else {
                                strB = null;
                            }
                            if (strB != null) {
                                try {
                                    if (!Libv2ray.parseConfig(strB)) {
                                        Hometab.n.getClass();
                                        String strA = Hometab.Companion.a(strB);
                                        new JSONObject(strA);
                                        gson.getClass();
                                        Object objC = gson.c(strA, new TypeToken(NetworkList.class));
                                        objC.getClass();
                                        List listZ = c.z((NetworkList) objC);
                                        homeFragment.H0 = listZ;
                                        Lazy lazy = zq0.a;
                                        zq0.I(((NetworkList) c.r(listZ)).getName());
                                        List list = homeFragment.H0;
                                        if (list == null) {
                                            yg0.N("networkList");
                                            throw null;
                                        }
                                        zq0.H(((NetworkList) c.r(list)).getTunnelType());
                                        homeFragment.z0();
                                        zq0.u().i("ConfigFile", strB);
                                        homeFragment.C0();
                                        return;
                                    }
                                    String strGc = Libv2ray.gc();
                                    Hometab.Companion companion = Hometab.n;
                                    strGc.getClass();
                                    companion.getClass();
                                    String strA2 = Hometab.Companion.a(strGc);
                                    new JSONObject(strA2);
                                    gson.getClass();
                                    Object objC2 = gson.c(strA2, new TypeToken(NetworkList.class));
                                    objC2.getClass();
                                    List listZ2 = c.z((NetworkList) objC2);
                                    homeFragment.H0 = listZ2;
                                    Lazy lazy2 = zq0.a;
                                    zq0.I(((NetworkList) c.r(listZ2)).getName());
                                    List list2 = homeFragment.H0;
                                    if (list2 == null) {
                                        yg0.N("networkList");
                                        throw null;
                                    }
                                    zq0.H(((NetworkList) c.r(list2)).getTunnelType());
                                    homeFragment.z0();
                                    zq0.u().i("ConfigFile", strGc);
                                    homeFragment.C0();
                                    return;
                                } catch (Exception unused) {
                                    SwitchMaterial switchMaterial2 = homeFragment.h1;
                                    if (switchMaterial2 != null) {
                                        switchMaterial2.setChecked(false);
                                    }
                                    qf3.N(homeFragment.M(), "Invalid File");
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.m1 = new AtomicBoolean(false);
        this.n1 = new AtomicBoolean(false);
        this.w1 = 2;
        lv lvVar = oy.a;
        MainCoroutineDispatcher mainCoroutineDispatcher = bn0.a;
        JobImpl jobImplA = kotlinx.coroutines.g.a();
        mainCoroutineDispatcher.getClass();
        this.C1 = zr.a(kotlin.coroutines.b.d(jobImplA, mainCoroutineDispatcher));
        this.O1 = zr.a(kotlin.coroutines.b.d(mainCoroutineDispatcher.e(), (JobSupport) kotlinx.coroutines.a.c()).plus(new HomeFragment$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key)));
        this.T1 = new jd0(this);
        this.V1 = 3;
        this.X1 = EmptyList.INSTANCE;
        this.a2 = -1;
        this.b2 = new j60(this, 4);
        this.c2 = new Handler(Looper.getMainLooper());
        this.e2 = new kd0(this);
    }

    public static void D0(HomeFragment homeFragment, FragmentActivity fragmentActivity, boolean z) {
        Lazy lazy = zq0.a;
        if (qf3.C(zq0.u().e("CurrentVoucher", null))) {
            return;
        }
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date());
        JSONArray jSONArray = new JSONArray(zq0.s());
        if (homeFragment.W()) {
            InterstitialAd interstitialAd = homeFragment.F1;
            if (interstitialAd == null) {
                homeFragment.l0(fragmentActivity);
                return;
            }
            interstitialAd.setFullScreenContentCallback(new od0(homeFragment, fragmentActivity, z, jSONArray, str));
            InterstitialAd interstitialAd2 = homeFragment.F1;
            if (interstitialAd2 != null) {
                interstitialAd2.show(fragmentActivity);
            }
        }
    }

    public static String d0() throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        StringBuilder sb = new StringBuilder(18);
        for (int i = 0; i < 18; i++) {
            sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(Random.INSTANCE.nextInt(52)));
        }
        Regex regex = ul1.a;
        String string = sb.toString();
        Charset charset = xm.a;
        byte[] bytes = "12345678901234567890123456789012".getBytes(charset);
        bytes.getClass();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        cipher.init(1, secretKeySpec, new GCMParameterSpec(128, bArr));
        byte[] bytes2 = string.getBytes(charset);
        bytes2.getClass();
        byte[] bArrDoFinal = cipher.doFinal(bytes2);
        bArrDoFinal.getClass();
        int length = bArrDoFinal.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12 + length);
        System.arraycopy(bArrDoFinal, 0, bArrCopyOf, 12, length);
        String strEncodeToString = Base64.encodeToString(bArrCopyOf, 2);
        strEncodeToString.getClass();
        return strEncodeToString;
    }

    public static ArrayList g0(Context context) {
        Object systemService = context.getSystemService("activity");
        systemService.getClass();
        ArrayList arrayList = new ArrayList();
        for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE)) {
            if (yg0.a(runningServiceInfo.service.getPackageName(), context.getPackageName())) {
                String className = runningServiceInfo.service.getClassName();
                className.getClass();
                arrayList.add(className);
            }
        }
        return arrayList;
    }

    public static String s0(long j) {
        float f = j;
        return f >= 1.0E12f ? String.format("%.2f %s", Arrays.copyOf(new Object[]{Float.valueOf(f / 1.0995116E12f), "TB"}, 2)) : f >= 1.0E9f ? String.format("%.2f %s", Arrays.copyOf(new Object[]{Float.valueOf(f / 1.0737418E9f), "GB"}, 2)) : f >= 1000000.0f ? String.format("%.2f %s", Arrays.copyOf(new Object[]{Float.valueOf(f / 1048576.0f), "MB"}, 2)) : f >= 1000.0f ? String.format("%.2f %s", Arrays.copyOf(new Object[]{Float.valueOf(f / 1024.0f), "KB"}, 2)) : String.format("%.0f KB", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
    }

    public static String t0(int i) {
        return String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 3600), Integer.valueOf((i / 60) % 60), Integer.valueOf(i % 60)}, 3));
    }

    public static String v0(String str, String str2) {
        Hometab.Companion companion = Hometab.n;
        if (str == null) {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        companion.getClass();
        String strA = Hometab.Companion.a(str);
        if (!strA.equals("[host]")) {
            return strA;
        }
        if (str2 == null) {
            str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return Hometab.Companion.a(str2);
    }

    public static String w0(long j) {
        long j2 = j / 86400000;
        long j3 = j / 3600000;
        long j4 = j / 60000;
        return String.format("%02d:%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j3 - TimeUnit.DAYS.toHours(j2)), Long.valueOf(j4 - TimeUnit.HOURS.toMinutes(j3)), Long.valueOf((j / 1000) - TimeUnit.MINUTES.toSeconds(j4))}, 4));
    }

    public final void A0(String str) throws JSONException {
        if (!o() || this.F == null) {
            return;
        }
        str.getClass();
        if (kotlin.text.g.o(str, "Profile not found", false)) {
            kotlinx.coroutines.c.d(m.a(this), null, null, new HomeFragment$setStatusVIew$1(this, null), 3);
            return;
        }
        if (kotlin.text.g.o(str, "Fail", false)) {
            r0();
            return;
        }
        if (kotlin.text.g.o(str, "Reconnecting", false)) {
            TextView textView = this.J0;
            if (textView != null) {
                textView.setText(str);
            }
            CircleProgressBar circleProgressBar = this.z1;
            if (circleProgressBar != null) {
                circleProgressBar.setProgressWithAnimation(50.0f);
                return;
            }
            return;
        }
        if (kotlin.text.g.o(str, "Success", false)) {
            TextView textView2 = this.J0;
            if (textView2 != null) {
                textView2.setText("Connected");
            }
            I0();
            FragmentActivity fragmentActivityL = L();
            if (SystemClock.elapsedRealtime() - this.t1 >= 180000 && W()) {
                D0(this, fragmentActivityL, false);
            }
            CircleProgressBar circleProgressBar2 = this.z1;
            if (circleProgressBar2 != null) {
                circleProgressBar2.setProgressWithAnimation(100.0f);
            }
            Job job = this.d1;
            if (job != null) {
                job.cancel((CancellationException) null);
            }
            b0(false);
            G0();
            return;
        }
        if (kotlin.text.g.o(str, "Connected", false)) {
            CircleProgressBar circleProgressBar3 = this.z1;
            if (circleProgressBar3 != null) {
                circleProgressBar3.setProgressWithAnimation(100.0f);
            }
            TextView textView3 = this.J0;
            if (textView3 != null) {
                textView3.setText("Connected");
            }
            I0();
            Job job2 = this.d1;
            if (job2 != null) {
                job2.cancel((CancellationException) null);
            }
            FragmentActivity fragmentActivityL2 = L();
            if (SystemClock.elapsedRealtime() - this.t1 >= 180000 && W()) {
                D0(this, fragmentActivityL2, false);
            }
            b0(false);
            G0();
            return;
        }
        if (kotlin.text.g.o(str, "Checking", false)) {
            TextView textView4 = this.J0;
            if (textView4 != null) {
                textView4.setText(str);
            }
            Job job3 = this.d1;
            if (job3 != null) {
                job3.cancel((CancellationException) null);
            }
            CircleProgressBar circleProgressBar4 = this.z1;
            if (circleProgressBar4 != null) {
                circleProgressBar4.setProgressWithAnimation(95.0f);
                return;
            }
            return;
        }
        if (kotlin.text.g.o(str, "Connecting", false)) {
            TextView textView5 = this.J0;
            if (textView5 != null) {
                textView5.setText(str);
            }
            CircleProgressBar circleProgressBar5 = this.z1;
            if (circleProgressBar5 != null) {
                circleProgressBar5.setProgressWithAnimation(95.0f);
            }
            Job job4 = this.d1;
            if (job4 != null) {
                job4.cancel((CancellationException) null);
            }
            if (yg0.a(this.t0, "SSH") || yg0.a(this.t0, "DNSTT") || yg0.a(this.t0, "UDP Hysteria")) {
                this.d1 = kotlinx.coroutines.c.d(m.a(this), null, null, new HomeFragment$setStatusVIew$2(this, null), 3);
            }
            if (yg0.a(this.f0, "V2ray")) {
                Job job5 = this.d1;
                if (job5 != null) {
                    job5.cancel((CancellationException) null);
                }
                this.d1 = kotlinx.coroutines.c.d(m.a(this), null, null, new HomeFragment$setStatusVIew$3(this, null), 3);
                return;
            }
            return;
        }
        if (kotlin.text.g.o(str, "Waiting", false)) {
            TextView textView6 = this.J0;
            if (textView6 != null) {
                textView6.setText(str);
            }
            CircleProgressBar circleProgressBar6 = this.z1;
            if (circleProgressBar6 != null) {
                circleProgressBar6.setProgressWithAnimation(80.0f);
            }
            TextView textView7 = this.J0;
            if (textView7 != null) {
                textView7.setText(str);
            }
            Job job6 = this.d1;
            if (job6 != null) {
                job6.cancel((CancellationException) null);
            }
            this.d1 = kotlinx.coroutines.c.d(m.a(this), null, null, new HomeFragment$setStatusVIew$4(this, null), 3);
            return;
        }
        if (kotlin.text.g.o(str, "Unknown Open", false)) {
            TextView textView8 = this.J0;
            if (textView8 != null) {
                textView8.setText(str);
            }
            CircleProgressBar circleProgressBar7 = this.z1;
            if (circleProgressBar7 != null) {
                circleProgressBar7.setProgressWithAnimation(80.0f);
            }
            Job job7 = this.d1;
            if (job7 != null) {
                job7.cancel((CancellationException) null);
            }
            this.d1 = kotlinx.coroutines.c.d(m.a(this), null, null, new HomeFragment$setStatusVIew$5(this, null), 3);
            return;
        }
        if (kotlin.text.g.o(str, "Authentication failed", false)) {
            TextView textView9 = this.J0;
            if (textView9 != null) {
                textView9.setText(str);
            }
            CircleProgressBar circleProgressBar8 = this.z1;
            if (circleProgressBar8 != null) {
                circleProgressBar8.setProgressWithAnimation(50.0f);
            }
            Job job8 = this.d1;
            if (job8 != null) {
                job8.cancel((CancellationException) null);
            }
            this.d1 = kotlinx.coroutines.c.d(m.a(this), null, null, new HomeFragment$setStatusVIew$6(this, null), 3);
            return;
        }
        if (kotlin.text.g.o(str, "Starting", false)) {
            TextView textView10 = this.J0;
            if (textView10 != null) {
                textView10.setText(str);
            }
            CircleProgressBar circleProgressBar9 = this.z1;
            if (circleProgressBar9 != null) {
                circleProgressBar9.setProgressWithAnimation(70.0f);
            }
            TextView textView11 = this.J0;
            if (textView11 != null) {
                textView11.setText(str);
            }
            Job job9 = this.d1;
            if (job9 != null) {
                job9.cancel((CancellationException) null);
                return;
            }
            return;
        }
        if (kotlin.text.g.o(str, "Disconnected", false)) {
            CircleProgressBar circleProgressBar10 = this.z1;
            if (circleProgressBar10 != null) {
                circleProgressBar10.setProgressWithAnimation(0.0f);
            }
            TextView textView12 = this.J0;
            if (textView12 != null) {
                textView12.setText(str);
                return;
            }
            return;
        }
        boolean zO = kotlin.text.g.o(str, "Authenticating", false);
        TextView textView13 = this.J0;
        if (!zO) {
            if (textView13 != null) {
                textView13.setText(str);
                return;
            }
            return;
        }
        if (textView13 != null) {
            textView13.setText(str);
        }
        CircleProgressBar circleProgressBar11 = this.z1;
        if (circleProgressBar11 != null) {
            circleProgressBar11.setProgressWithAnimation(95.0f);
        }
        Job job10 = this.d1;
        if (job10 != null) {
            job10.cancel((CancellationException) null);
        }
    }

    public final void B0() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("COUNTDOWN_UPDATE");
        intentFilter.addAction("COUNTDOWN_FINISH");
        int i = Build.VERSION.SDK_INT;
        r6 r6Var = this.W0;
        if (i >= 33) {
            M().registerReceiver(r6Var, intentFilter, 2);
        } else {
            M().registerReceiver(r6Var, intentFilter);
        }
        Lazy lazy = zq0.a;
        String strW0 = w0(zq0.B());
        TextView textView = this.b1;
        if (textView != null) {
            textView.setText(strW0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C0() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.ui.HomeFragment.C0():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void D() throws JSONException {
        this.D = true;
        if (this.h1 == null) {
            return;
        }
        if (this.Y1 == null && kotlin.text.g.o(g0(M()).toString(), "OpenVPNService", false)) {
            Z();
        }
        C0();
        Handler handler = this.c2;
        j60 j60Var = this.b2;
        handler.removeCallbacks(j60Var);
        handler.postDelayed(j60Var, 1000L);
        if (W()) {
            l0(M());
        }
        if (this.x1 - this.y1 >= 180000) {
            Application application = L().getApplication();
            application.getClass();
            ((AngApplication) application).a(L(), new ld0());
            this.y1 = this.x1;
        }
        ConfigUpdate configUpdate = this.G1;
        if (configUpdate != null) {
            configUpdate.a();
        }
    }

    public final void E0(int i) throws JSONException {
        if (yg0.a(f0().isRunning().d(), Boolean.TRUE) || SkStatus.isTunnelActive()) {
            String.valueOf(SkStatus.isTunnelActive());
        } else if (i != R.string.disconnected) {
            A0(j().getString(i));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void F() {
        this.D = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x032d, code lost:
    
        if (r3.equals("UDP Hysteria") == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0336, code lost:
    
        if (r3.equals("Slow DNS") == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0339, code lost:
    
        H0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x033c, code lost:
    
        return;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F0() throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.ui.HomeFragment.F0():void");
    }

    public final void G0() {
        zr.b(this.C1, null);
        lv lvVar = oy.a;
        MainCoroutineDispatcher mainCoroutineDispatcher = bn0.a;
        JobImpl jobImplA = kotlinx.coroutines.g.a();
        mainCoroutineDispatcher.getClass();
        ContextScope contextScopeA = zr.a(kotlin.coroutines.b.d(jobImplA, mainCoroutineDispatcher));
        this.C1 = contextScopeA;
        kotlinx.coroutines.c.d(contextScopeA, null, null, new HomeFragment$startPinging$1(this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void H(View view, Bundle bundle) {
        FragmentActivity fragmentActivityD;
        CardView cardView;
        view.getClass();
        ConfigUtil configUtil = ConfigUtil.getInstance(M());
        configUtil.getClass();
        this.U0 = configUtil;
        int i = 1;
        M().bindService(new Intent(M(), (Class<?>) InjectorService.class), this.e2, 1);
        Z();
        if (y0()) {
            this.c1 = (CardView) view.findViewById(R.id.cardTimer);
            this.b1 = (TextView) view.findViewById(R.id.timerTextView);
            this.a1 = (TextView) view.findViewById(R.id.config_version);
            this.X0 = (TextView) view.findViewById(R.id.duration);
            this.Y0 = (TextView) view.findViewById(R.id.bytes_in);
            this.Z0 = (TextView) view.findViewById(R.id.bytes_out);
            this.J0 = (TextView) view.findViewById(R.id.Status);
            this.P0 = (MaterialButton) view.findViewById(R.id.btnconnect);
            this.K0 = (TextView) view.findViewById(R.id.tvServerProtocol);
            this.N0 = (TextView) view.findViewById(R.id.tvNetworkName);
            this.M0 = (TextView) view.findViewById(R.id.tvServerName);
            this.L0 = (TextView) view.findViewById(R.id.tvNetworkInfo);
            this.O0 = (ImageView) view.findViewById(R.id.imgServer);
            this.h1 = (SwitchMaterial) view.findViewById(R.id.swUseConfig);
            this.k1 = (FrameLayout) view.findViewById(R.id.framAdview);
            this.u1 = (MaterialButton) view.findViewById(R.id.btnAddtime);
            this.v1 = (ProgressBar) view.findViewById(R.id.PBLoader);
            this.z1 = (CircleProgressBar) view.findViewById(R.id.custom_progressBar);
            this.A1 = (LineChart) view.findViewById(R.id.lineChart);
            this.D1 = (TextView) view.findViewById(R.id.tvPing);
            this.E1 = (ImageView) view.findViewById(R.id.globe);
            this.R0 = (RelativeLayout) view.findViewById(R.id.relaServer);
            this.S0 = (RelativeLayout) view.findViewById(R.id.relaNetwork);
            this.J1 = (TextView) view.findViewById(R.id.timeleft);
            this.K1 = (LinearLayout) view.findViewById(R.id.linearExpiry);
            this.L1 = (SmoothBottomBar) view.findViewById(R.id.bottomBar);
            this.M1 = (ImageView) view.findViewById(R.id.mainSpeedBoost);
            this.N1 = (ImageView) view.findViewById(R.id.mainActiveBoost);
            ImageView imageView = this.M1;
            int i2 = 4;
            if (imageView != null) {
                imageView.setOnClickListener(new yc0(this, i2));
            }
            RelativeLayout relativeLayout = this.R0;
            if (relativeLayout != null) {
                relativeLayout.setOnClickListener(new yc0(this, 5));
            }
            RelativeLayout relativeLayout2 = this.S0;
            if (relativeLayout2 != null) {
                relativeLayout2.setOnClickListener(new yc0(this, 6));
            }
            MaterialButton materialButton = this.u1;
            if (materialButton != null) {
                materialButton.setOnClickListener(new yc0(this, 7));
            }
            TextView textView = this.a1;
            if (textView != null) {
                ConfigData configValue = e0().getConfigValue();
                textView.setText(configValue != null ? configValue.getVersion() : null);
            }
            SwitchMaterial switchMaterial = this.h1;
            if (switchMaterial != null) {
                Lazy lazy = zq0.a;
                switchMaterial.setChecked(zq0.t());
            }
            SwitchMaterial switchMaterial2 = this.h1;
            int i3 = 2;
            if (switchMaterial2 != null) {
                switchMaterial2.setOnCheckedChangeListener(new e4(this, i3));
            }
            MaterialButton materialButton2 = this.P0;
            if (materialButton2 != null) {
                materialButton2.setOnClickListener(new a(this, i));
            }
            ConfigData configValue2 = e0().getConfigValue();
            configValue2.getClass();
            if (!configValue2.isTimerOn() && (cardView = this.c1) != null) {
                cardView.setVisibility(8);
            }
            ConfigData configValue3 = e0().getConfigValue();
            configValue3.getClass();
            Integer timetoadd = configValue3.getTimetoadd();
            int iIntValue = timetoadd != null ? timetoadd.intValue() : 2;
            this.w1 = iIntValue;
            MaterialButton materialButton3 = this.u1;
            if (materialButton3 != null) {
                materialButton3.setText("Add " + iIntValue + " Hrs");
            }
            B0();
            this.x1 = System.currentTimeMillis();
            if (!this.P1) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("COUNTDOWN_UPDATE");
                intentFilter.addAction("COUNTDOWN_FINISH");
                int i4 = Build.VERSION.SDK_INT;
                r6 r6Var = this.W0;
                if (i4 >= 33) {
                    M().registerReceiver(r6Var, intentFilter, 2);
                } else {
                    M().registerReceiver(r6Var, intentFilter);
                }
                this.P1 = true;
                Lazy lazy2 = zq0.a;
                String strW0 = w0(zq0.B());
                TextView textView2 = this.b1;
                if (textView2 != null) {
                    textView2.setText(strW0);
                }
            }
            kotlinx.coroutines.c.d(this.O1, null, null, new HomeFragment$loadAllData$1(this, null), 3);
            Context contextF = f();
            int i5 = 0;
            if (contextF != null && (fragmentActivityD = d()) != null) {
                GoogleMobileAdsConsentManager googleMobileAdsConsentManagerA = GoogleMobileAdsConsentManager.b.a(contextF);
                this.l1 = googleMobileAdsConsentManagerA;
                googleMobileAdsConsentManagerA.a(fragmentActivityD, new ad0(this));
                GoogleMobileAdsConsentManager googleMobileAdsConsentManager = this.l1;
                if (googleMobileAdsConsentManager == null) {
                    yg0.N("googleMobileAdsConsentManager");
                    throw null;
                }
                if (googleMobileAdsConsentManager.a.canRequestAds()) {
                    this.m1.set(true);
                    AtomicBoolean atomicBoolean = this.n1;
                    if (!atomicBoolean.getAndSet(true)) {
                        Context contextF2 = f();
                        if (contextF2 == null) {
                            atomicBoolean.set(false);
                        } else {
                            MobileAds.initialize(contextF2, new xc0());
                        }
                    }
                    o0();
                    l0(contextF);
                    k0();
                }
            }
            kotlinx.coroutines.c.d(m.a(this), null, null, new HomeFragment$onViewCreated$1(this, null), 3);
            this.G1 = new ConfigUpdate(this);
            SmoothBottomBar smoothBottomBar = this.L1;
            if (smoothBottomBar != null) {
                smoothBottomBar.setOnItemSelected(new tc0(this, i5));
            }
            SmoothBottomBar smoothBottomBar2 = this.L1;
            if (smoothBottomBar2 != null) {
                smoothBottomBar2.setOnItemReselected(new tc0(this, i2));
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void H0() throws Exception {
        int i;
        SkStatus.addStateListener(this);
        SkStatus.addLogListener(this);
        Settings.setDefaultConfig(M());
        Settings settings = new Settings(M());
        SecurePreferences prefsPrivate = settings.getPrefsPrivate();
        prefsPrivate.getClass();
        SharedPreferences.Editor editorEdit = prefsPrivate.edit();
        String str = this.f0;
        if (str != null) {
            i = 2;
            switch (str.hashCode()) {
                case -2079249622:
                    i = !str.equals("Direct TCP") ? 0 : 1;
                    break;
                case -2035437790:
                    if (!str.equals("Direct + Payload")) {
                        i = 0;
                    }
                    break;
                case -1474320059:
                    i = !str.equals("SSL + Payload") ? 0 : 4;
                    break;
                case -1020724598:
                    if (!str.equals("Slow DNS")) {
                        i = 0;
                    } else {
                        String str2 = this.t0;
                        if (str2 != null && !kotlin.text.g.o(str2, "DNSTT", false)) {
                            qf3.L(M(), "Please Select Slowdns Server");
                            x0();
                            return;
                        }
                        i = 6;
                    }
                    break;
                case -46999946:
                    if (!str.equals("UDP Hysteria")) {
                        i = 0;
                    } else {
                        String str3 = this.t0;
                        if (str3 != null && !kotlin.text.g.o(str3, "UDP Hysteria", false)) {
                            qf3.L(M(), "Please Select UDP Server");
                            x0();
                            return;
                        }
                        i = 7;
                    }
                    break;
                case 352194816:
                    if (!str.equals("SlipStream")) {
                        i = 0;
                    } else {
                        String str4 = this.t0;
                        if (str4 != null && !kotlin.text.g.o(str4, "UDP Hysteria", false)) {
                            qf3.L(M(), "Please Select UDP Server");
                            x0();
                            return;
                        }
                        i = 8;
                    }
                    break;
                case 866577597:
                    i = !str.equals("SSL Direct") ? 0 : 3;
                    break;
                case 1842769329:
                    if (!str.equals("Http/Ws Proxy")) {
                        i = 0;
                    }
                    break;
                case 1842829548:
                    i = !str.equals("SSL + Payload + WS") ? 0 : 5;
                    break;
                default:
                    i = 0;
                    break;
            }
        } else {
            i = 0;
        }
        Hometab.Companion companion = Hometab.n;
        String str5 = this.r0;
        if (str5 == null) {
            str5 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        companion.getClass();
        List listO = kotlin.text.g.O(Hometab.Companion.a(str5), new String[]{";"}, 6);
        java.util.Random random = new java.util.Random();
        String str6 = (String) listO.get(random.nextInt(listO.size()));
        String str7 = this.b0;
        if (str7 == null) {
            str7 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        List listO2 = kotlin.text.g.O(Hometab.Companion.a(str7), new String[]{";"}, 6);
        this.b0 = (String) listO2.get(random.nextInt(listO2.size()));
        String str8 = this.d0;
        if (str8 == null) {
            str8 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        List listO3 = kotlin.text.g.O(Hometab.Companion.a(str8), new String[]{";"}, 6);
        String str9 = (String) listO3.get(random.nextInt(listO3.size()));
        editorEdit.putInt(SettingsConstants.TUNNELTYPE_KEY, i);
        switch (i) {
            case 1:
                ConfigUtil configUtil = this.U0;
                if (configUtil == null) {
                    yg0.N("configUtil");
                    throw null;
                }
                configUtil.setSSHHost(str6);
                editorEdit.putBoolean(SettingsConstants.PROXY_USAR_DEFAULT_PAYLOAD, true);
                editorEdit.putString(SettingsConstants.SERVIDOR_PORTA_KEY, this.v0);
                break;
                break;
            case 2:
                editorEdit.putBoolean(SettingsConstants.PROXY_USAR_DEFAULT_PAYLOAD, false);
                ConfigUtil configUtil2 = this.U0;
                if (configUtil2 == null) {
                    yg0.N("configUtil");
                    throw null;
                }
                configUtil2.setSSHHost(str6);
                editorEdit.putString(SettingsConstants.SERVIDOR_PORTA_KEY, this.v0);
                editorEdit.putString(SettingsConstants.PROXY_PORTA_KEY, this.a0);
                editorEdit.putString(SettingsConstants.PROXY_IP_KEY, str9);
                ConfigUtil configUtil3 = this.U0;
                if (configUtil3 == null) {
                    yg0.N("configUtil");
                    throw null;
                }
                String str10 = this.Z;
                if (str10 == null) {
                    str10 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                configUtil3.setPayload(kotlin.text.g.M(kotlin.text.g.M(Hometab.Companion.a(str10), "[host]", str6), "[rlb]", str6));
                if (this.c0) {
                    editorEdit.putString(SettingsConstants.PROXY_IP_KEY, str6);
                }
                break;
                break;
            case 3:
                editorEdit.putInt(SettingsConstants.TUNNELTYPE_KEY, 3);
                String str11 = this.b0;
                if (str11 == null) {
                    str11 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                editorEdit.putString(SettingsConstants.CUSTOM_SNI, Hometab.Companion.a(str11));
                ConfigUtil configUtil4 = this.U0;
                if (configUtil4 == null) {
                    yg0.N("configUtil");
                    throw null;
                }
                configUtil4.setSSHHost(str6);
                editorEdit.putString(SettingsConstants.SERVIDOR_PORTA_KEY, this.w0);
                editorEdit.putBoolean(SettingsConstants.PROXY_USAR_DEFAULT_PAYLOAD, true);
                break;
                break;
            case 4:
                editorEdit.putBoolean(SettingsConstants.PROXY_USAR_DEFAULT_PAYLOAD, false);
                ConfigUtil configUtil5 = this.U0;
                if (configUtil5 == null) {
                    yg0.N("configUtil");
                    throw null;
                }
                configUtil5.setSSHHost(str9);
                editorEdit.putString(SettingsConstants.SERVIDOR_PORTA_KEY, this.w0);
                ConfigUtil configUtil6 = this.U0;
                if (configUtil6 == null) {
                    yg0.N("configUtil");
                    throw null;
                }
                String str12 = this.Z;
                if (str12 == null) {
                    str12 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                configUtil6.setPayload(kotlin.text.g.M(kotlin.text.g.M(Hometab.Companion.a(str12), "[host]", str6), "[rlb]", str6));
                String str13 = this.b0;
                if (str13 == null) {
                    str13 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                editorEdit.putString(SettingsConstants.CUSTOM_SNI, kotlin.text.g.M(kotlin.text.g.M(kotlin.text.g.M(Hometab.Companion.a(str13), "[host]", str6), "[rlb]", str6), "[cf]", str6));
                break;
                break;
            case 5:
                editorEdit.putBoolean(SettingsConstants.PROXY_USAR_DEFAULT_PAYLOAD, false);
                ConfigUtil configUtil7 = this.U0;
                if (configUtil7 == null) {
                    yg0.N("configUtil");
                    throw null;
                }
                String str14 = this.Z;
                if (str14 == null) {
                    str14 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                configUtil7.setPayload(kotlin.text.g.M(kotlin.text.g.M(Hometab.Companion.a(str14), "[host]", str6), "[rlb]", str6));
                editorEdit.putString(SettingsConstants.SERVIDOR_PORTA_KEY, this.w0);
                String str15 = this.b0;
                if (str15 == null) {
                    str15 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                editorEdit.putString(SettingsConstants.CUSTOM_SNI, kotlin.text.g.M(kotlin.text.g.M(kotlin.text.g.M(Hometab.Companion.a(str15), "[host]", str6), "[rlb]", str6), "[cf]", str6));
                editorEdit.putString(SettingsConstants.PROXY_IP_KEY, str9);
                ConfigUtil configUtil8 = this.U0;
                if (configUtil8 == null) {
                    yg0.N("configUtil");
                    throw null;
                }
                configUtil8.setSSHHost(str9);
                editorEdit.putString(SettingsConstants.PROXY_PORTA_KEY, this.a0);
                break;
                break;
            case 6:
                editorEdit.putBoolean(SettingsConstants.PROXY_USAR_DEFAULT_PAYLOAD, true);
                boolean zA = yg0.a(this.g0, "8.8.8.8");
                String strA = this.g0;
                if (!zA) {
                    if (strA == null) {
                        strA = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    strA = Hometab.Companion.a(strA);
                }
                editorEdit.putString(SettingsConstants.DNS_KEY, strA);
                String str16 = this.D0;
                if (str16 == null) {
                    str16 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                editorEdit.putString(SettingsConstants.CHAVE_KEY, Hometab.Companion.a(str16));
                ConfigUtil configUtil9 = this.U0;
                if (configUtil9 == null) {
                    yg0.N("configUtil");
                    throw null;
                }
                configUtil9.setSSHHost("127.0.0.1");
                editorEdit.putString(SettingsConstants.SERVIDOR_PORTA_KEY, "2222");
                String str17 = this.C0;
                if (str17 == null) {
                    str17 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                editorEdit.putString(SettingsConstants.NAMESERVER_KEY, Hometab.Companion.a(str17));
                break;
                break;
            case 7:
                settings.setVpnDnsResolver("0.0.0.0");
                ConfigUtil configUtil10 = this.U0;
                if (configUtil10 == null) {
                    yg0.N("configUtil");
                    throw null;
                }
                configUtil10.setSSHHost(str6);
                editorEdit.putString(SettingsConstants.DNSRESOLVER_KEY, "0.0.0.0");
                Lazy lazy = zq0.a;
                zq0.u().d("Proto");
                String str18 = this.A0;
                if (str18 == null) {
                    str18 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                zq0.u().i("OBFS", Hometab.Companion.a(str18));
                String str19 = this.B0;
                if (str19 == null) {
                    str19 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                zq0.u().i("UDP_USER", Hometab.Companion.a(str19));
                break;
                break;
        }
        if (this.x0) {
            ConfigData configValue = e0().getConfigValue();
            configValue.getClass();
            this.y0 = configValue.getDefOVPNUser();
            this.z0 = d0();
            Lazy lazy2 = zq0.a;
            ConfigData configValue2 = e0().getConfigValue();
            zq0.u().i("OBFS", String.valueOf(configValue2 != null ? configValue2.getHysteriaOBFS() : null));
            String str20 = this.z0;
            String str21 = this.y0;
            zq0.u().i("UDP_USER", str20 + ":" + Hometab.Companion.a(str21 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str21));
        } else {
            String str22 = this.y0;
            if (str22 == null) {
                str22 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            this.y0 = Hometab.Companion.a(str22);
            String str23 = this.z0;
            this.z0 = Hometab.Companion.a(str23 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str23);
        }
        editorEdit.putString(SettingsConstants.USUARIO_KEY, this.y0);
        editorEdit.putString(SettingsConstants.SENHA_KEY, this.z0);
        editorEdit.apply();
        if (SkStatus.isTunnelActive()) {
            TunnelManagerHelper.stopSocksHttp(M());
            K0();
        } else if (this.T0) {
            Intent intent = new Intent(L(), (Class<?>) LaunchVpn.class);
            intent.setAction("android.intent.action.MAIN");
            U(intent);
        }
    }

    public final void I0() {
        if (!o() || e0().getConfigValue() == null) {
            return;
        }
        ConfigData configValue = e0().getConfigValue();
        configValue.getClass();
        if (configValue.isTimerOn()) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplA = m.a(l());
            lv lvVar = oy.a;
            kotlinx.coroutines.c.d(lifecycleCoroutineScopeImplA, bn0.a, null, new HomeFragment$startTimer$1(this, null), 2);
        }
    }

    public final void J0() {
        b0(true);
        this.T0 = false;
        zr.b(this.C1, null);
        CoreController coreController = com.v2ray.ang.service.b.a;
        com.v2ray.ang.service.b.g(L());
        if (SocksHttpService.isRunning) {
            TunnelManagerHelper.stopSocksHttp(L());
            SkStatus.updateStateString(SkStatus.SSH_DESCONECTADO, "Stopped");
        }
        if (SkStatus.isTunnelActive()) {
            TunnelManagerHelper.stopSocksHttp(L());
            SkStatus.updateStateString(SkStatus.SSH_DESCONECTADO, "Stopped");
        }
        StatisticsGraphData.getStatisticData().getDataTransferStats().stop();
        if (kotlin.text.g.o(g0(M()).toString(), "TunnelVpnService", false)) {
            Intent intent = new Intent(L(), (Class<?>) TunnelVpnService.class);
            intent.setAction("STOP");
            L().startService(intent);
        }
        InjectorService injectorService = this.d2;
        if (injectorService != null && InjectorService.isRunning) {
            injectorService.stopInjector();
        }
        L().stopService(new Intent(L(), (Class<?>) InjectorService.class));
        L0(true);
        a0();
        if (this.d2 != null) {
            M().unbindService(this.e2);
            this.d2 = null;
        }
        K0();
        Job job = this.d1;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        A0("Disconnected");
    }

    public final void K0() {
        Context contextF = f();
        if (contextF != null) {
            M().stopService(new Intent(contextF, (Class<?>) CountdownService.class));
        }
    }

    public final void L0(boolean z) {
        Context contextM = M();
        Intent intentPutExtra = new Intent(M(), (Class<?>) OpenVPNService.class).setAction(OpenVPNService.ACTION_DISCONNECT).putExtra("net.openvpn.openvpn.STOP", z);
        intentPutExtra.getClass();
        contextM.startService(intentPutExtra);
    }

    public final void M0() {
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(M(), R.style.BottomSheetTheme);
        View viewInflate = g().inflate(R.layout.update_dialog, (ViewGroup) null);
        bottomSheetDialog.setContentView(viewInflate);
        Button button = (Button) viewInflate.findViewById(R.id.btnCleardata);
        Button button2 = (Button) viewInflate.findViewById(R.id.btnOnlineUpdate);
        final int i = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: wc0
            public final /* synthetic */ HomeFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                BottomSheetDialog bottomSheetDialog2 = bottomSheetDialog;
                HomeFragment homeFragment = this.b;
                switch (i2) {
                    case 0:
                        int i3 = HomeFragment.f2;
                        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(homeFragment.M());
                        AlertController.AlertParams alertParams = materialAlertDialogBuilder.a;
                        alertParams.c = R.mipmap.ic_launcher_round;
                        alertParams.e = "Clear Setting/data";
                        alertParams.g = "Are you sure you want to reset all the data?";
                        materialAlertDialogBuilder.h("Yes", new zc0(homeFragment, 2));
                        materialAlertDialogBuilder.g("No", null);
                        materialAlertDialogBuilder.f();
                        bottomSheetDialog2.dismiss();
                        break;
                    default:
                        int i4 = HomeFragment.f2;
                        qf3.L(homeFragment.M(), "Checking Updates");
                        bottomSheetDialog2.dismiss();
                        break;
                }
            }
        });
        final int i2 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: wc0
            public final /* synthetic */ HomeFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                BottomSheetDialog bottomSheetDialog2 = bottomSheetDialog;
                HomeFragment homeFragment = this.b;
                switch (i22) {
                    case 0:
                        int i3 = HomeFragment.f2;
                        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(homeFragment.M());
                        AlertController.AlertParams alertParams = materialAlertDialogBuilder.a;
                        alertParams.c = R.mipmap.ic_launcher_round;
                        alertParams.e = "Clear Setting/data";
                        alertParams.g = "Are you sure you want to reset all the data?";
                        materialAlertDialogBuilder.h("Yes", new zc0(homeFragment, 2));
                        materialAlertDialogBuilder.g("No", null);
                        materialAlertDialogBuilder.f();
                        bottomSheetDialog2.dismiss();
                        break;
                    default:
                        int i4 = HomeFragment.f2;
                        qf3.L(homeFragment.M(), "Checking Updates");
                        bottomSheetDialog2.dismiss();
                        break;
                }
            }
        });
        bottomSheetDialog.show();
    }

    public final boolean W() {
        GoogleMobileAdsConsentManager googleMobileAdsConsentManager;
        return this.m1.get() && (googleMobileAdsConsentManager = this.l1) != null && googleMobileAdsConsentManager.a.canRequestAds();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.ui.HomeFragment.X():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03c5 A[FALL_THROUGH] */
    /* JADX WARN: Type inference failed for: r12v16, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v18, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v20, types: [T, java.lang.Object, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.ui.HomeFragment.Y():void");
    }

    public final void Z() {
        if (this.W1) {
            return;
        }
        M().bindService(new Intent(M(), (Class<?>) OpenVPNService.class).setAction(OpenVPNService.ACTION_BIND), this.T1, 65);
        this.W1 = true;
    }

    public final void a0() {
        OpenVPNService openVPNService = this.Y1;
        if (openVPNService == null || !this.W1) {
            return;
        }
        if (this.S1) {
            openVPNService.client_detach(this);
            this.S1 = false;
        }
        try {
            M().unbindService(this.T1);
        } catch (IllegalArgumentException unused) {
        }
        this.Y1 = null;
        this.W1 = false;
    }

    public final void b0(boolean z) {
        NetworkMonitor networkMonitor = this.g1;
        if (z) {
            if (networkMonitor != null) {
                networkMonitor.h.cancel((CancellationException) null);
            }
            this.g1 = null;
            MaterialButton materialButton = this.P0;
            if (materialButton != null) {
                materialButton.setText("Start");
            }
            RelativeLayout relativeLayout = this.S0;
            if (relativeLayout != null) {
                relativeLayout.setEnabled(true);
            }
            RelativeLayout relativeLayout2 = this.R0;
            if (relativeLayout2 != null) {
                relativeLayout2.setEnabled(true);
            }
            SwitchMaterial switchMaterial = this.h1;
            if (switchMaterial != null) {
                switchMaterial.setEnabled(true);
            }
            CircleProgressBar circleProgressBar = this.z1;
            if (circleProgressBar != null) {
                circleProgressBar.setProgressWithAnimation(0.0f);
                return;
            }
            return;
        }
        if (networkMonitor == null) {
            Context contextF = f();
            if (contextF == null) {
                return;
            }
            networkMonitor = new NetworkMonitor(contextF, this.A1);
            this.g1 = networkMonitor;
        }
        NetworkMonitor.a(networkMonitor);
        MaterialButton materialButton2 = this.P0;
        if (materialButton2 != null) {
            materialButton2.setText("Stop");
        }
        RelativeLayout relativeLayout3 = this.S0;
        if (relativeLayout3 != null) {
            relativeLayout3.setEnabled(false);
        }
        RelativeLayout relativeLayout4 = this.R0;
        if (relativeLayout4 != null) {
            relativeLayout4.setEnabled(false);
        }
        SwitchMaterial switchMaterial2 = this.h1;
        if (switchMaterial2 != null) {
            switchMaterial2.setEnabled(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList c0(java.util.List r9, java.lang.String r10, java.util.List r11) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.ui.HomeFragment.c0(java.util.List, java.lang.String, java.util.List):java.util.ArrayList");
    }

    public final ConfigViewModel e0() {
        return (ConfigViewModel) this.e1.getValue();
    }

    @Override // com.sandok.tunnel.service.OpenVPNService.EventReceiver
    public final void event(OpenVPNService.EventMsg eventMsg) throws JSONException {
        eventMsg.getClass();
        h0();
        u0(eventMsg);
    }

    public final MainViewModel f0() {
        return (MainViewModel) this.f1.getValue();
    }

    @Override // com.sandok.tunnel.service.OpenVPNService.EventReceiver
    public final PendingIntent get_configure_intent(int i) {
        return PendingIntent.getActivity(M(), i, L().getIntent(), Build.VERSION.SDK_INT >= 31 ? 301989888 : 268435456);
    }

    public final boolean h0() {
        OpenVPNService openVPNService = this.Y1;
        if (openVPNService != null) {
            return openVPNService.is_active();
        }
        return false;
    }

    public final void i0(String str) {
        if (str == null) {
            ConfigData configValue = e0().getConfigValue();
            str = configValue != null ? configValue.getTelegram() : null;
        }
        if (str == null || kotlin.text.g.B(str)) {
            qf3.N(M(), "No Telegram link configured");
            return;
        }
        if (kotlin.text.g.R(str, "@", false)) {
            str = kotlin.text.g.I(str, "@");
        } else if (kotlin.text.g.R(str, "http://", false) || kotlin.text.g.R(str, "https://", false)) {
            str = kotlin.text.g.W(kotlin.text.g.V(str, "/"), "?");
        }
        String string = kotlin.text.g.c0(str).toString();
        if (kotlin.text.g.B(string)) {
            qf3.N(M(), "Invalid Telegram username");
            return;
        }
        try {
            U(new Intent("android.intent.action.VIEW", Uri.parse("tg://resolve?domain=".concat(string))));
        } catch (ActivityNotFoundException unused) {
            U(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/".concat(string))));
        }
    }

    public final void j0() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(M(), R.style.BottomSheetTheme);
        View viewInflate = g().inflate(R.layout.joinus_dialog, (ViewGroup) null);
        bottomSheetDialog.setContentView(viewInflate);
        bottomSheetDialog.show();
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.imgTele);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.imgWhatsApp);
        ImageView imageView3 = (ImageView) viewInflate.findViewById(R.id.imgFacebook);
        imageView.setOnClickListener(new yc0(this, 0));
        imageView2.setOnClickListener(new yc0(this, 1));
        imageView3.setOnClickListener(new yc0(this, 2));
    }

    public final void k0() {
        LifecycleOwner lifecycleOwner;
        if (!W() || this.Q1 || this.r1 || (lifecycleOwner = (LifecycleOwner) this.Q.d()) == null) {
            return;
        }
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplA = m.a(lifecycleOwner);
        lv lvVar = oy.a;
        kotlinx.coroutines.c.d(lifecycleCoroutineScopeImplA, bn0.a, null, new HomeFragment$loadBannerAds$1(this, null), 2);
    }

    public final void l0(Context context) {
        if (W() && !this.q1 && this.F1 == null) {
            this.q1 = true;
            AdRequest adRequestBuild = new AdRequest.Builder().build();
            adRequestBuild.getClass();
            InterstitialAd.load(context, "ca-app-pub-7120795588295806/7170980403", adRequestBuild, new InterstitialAdLoadCallback() { // from class: com.v2ray.ang.ui.HomeFragment$loadInterstitial$1
                @Override // com.google.android.gms.ads.AdLoadCallback
                public final void onAdFailedToLoad(LoadAdError loadAdError) {
                    loadAdError.getClass();
                    HomeFragment homeFragment = this.a;
                    homeFragment.q1 = false;
                    homeFragment.F1 = null;
                    loadAdError.getCode();
                    loadAdError.getDomain();
                    loadAdError.getMessage();
                }

                @Override // com.google.android.gms.ads.AdLoadCallback
                public final void onAdLoaded(InterstitialAd interstitialAd) {
                    InterstitialAd interstitialAd2 = interstitialAd;
                    interstitialAd2.getClass();
                    HomeFragment homeFragment = this.a;
                    homeFragment.q1 = false;
                    homeFragment.F1 = interstitialAd2;
                }
            });
        }
    }

    public final void m0() {
        Object next;
        List list = this.H0;
        if (list == null) {
            yg0.N("networkList");
            throw null;
        }
        list.size();
        Lazy lazy = zq0.a;
        String strC = zq0.C();
        if (strC == null || strC.length() == 0) {
            List list2 = this.H0;
            if (list2 == null) {
                yg0.N("networkList");
                throw null;
            }
            if (!list2.isEmpty()) {
                List list3 = this.H0;
                if (list3 == null) {
                    yg0.N("networkList");
                    throw null;
                }
                strC = ((NetworkList) kotlin.collections.c.r(list3)).getName();
                zq0.I(strC);
            }
        }
        List list4 = this.H0;
        if (list4 == null) {
            yg0.N("networkList");
            throw null;
        }
        Iterator it = list4.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (yg0.a(((NetworkList) next).getName(), strC)) {
                    break;
                }
            }
        }
        NetworkList networkList = (NetworkList) next;
        if (networkList == null) {
            List list5 = this.H0;
            if (list5 == null) {
                yg0.N("networkList");
                throw null;
            }
            networkList = (NetworkList) kotlin.collections.c.r(list5);
            Lazy lazy2 = zq0.a;
            zq0.I(networkList.getName());
        }
        this.Y = networkList.getName();
        networkList.getInfo();
        this.Z = networkList.getPayload();
        this.a0 = networkList.getProxyPort();
        this.b0 = networkList.getSNI();
        this.c0 = networkList.getDefaultProxy();
        this.d0 = networkList.getCustomProxy();
        this.e0 = networkList.getV2rayConfig();
        this.f0 = networkList.getTunnelType();
        this.g0 = networkList.getBugDNS();
        this.h0 = networkList.getSafeURI();
        this.i0 = networkList.getV2rayAddress();
        this.j0 = networkList.getV2rayPort();
        this.k0 = networkList.getV2rayHost();
        this.l0 = networkList.getV2ray_is_SNI();
        this.m0 = networkList.getV2raySNI();
        networkList.getV2rayServerNeed();
        this.n0 = networkList.getV2rayNetwork();
        this.o0 = networkList.getRoute();
        networkList.getIcon();
        this.p0 = networkList.getVinJect();
        this.H1 = networkList.getV2rayinSecure();
        Lazy lazy3 = zq0.a;
        String str = this.f0;
        if (str == null) {
            str = "Http/Ws Proxy";
        }
        zq0.H(str);
    }

    public final void n0() {
        String strReplace;
        Connection[] connectionArr;
        String defaultOVPNCert;
        String strReplace2;
        try {
            File[] fileArrListFiles = L().getFilesDir().listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    String absolutePath = file.getAbsolutePath();
                    absolutePath.getClass();
                    String lowerCase = absolutePath.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (kotlin.text.g.u(lowerCase, ".ovpn", false)) {
                        file.delete();
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        List<ServerList> list = this.G0;
        if (list == null) {
            yg0.N("serverList");
            throw null;
        }
        for (ServerList serverList : list) {
            if (kotlin.text.g.o(serverList.getServerProtocol(), "OVPN", false)) {
                String string = kotlin.text.g.d0(serverList.getName()).toString();
                String openVPNTCPPort = serverList.getOpenVPNTCPPort();
                if (!kotlin.text.g.w(serverList.getServerProtocol(), "Random", true) && openVPNTCPPort != null && openVPNTCPPort.length() != 0) {
                    if (serverList.getDefault_cert()) {
                        ConfigData configValue = e0().getConfigValue();
                        strReplace = (configValue == null || (defaultOVPNCert = configValue.getDefaultOVPNCert()) == null || (strReplace2 = new Regex("(?m)^\\s*proto\\s+tcp4-client\\s*$").replace(defaultOVPNCert, "proto tcp-client")) == null) ? null : new Regex("(?m)^\\s*proto\\s+udp4\\s*$").replace(strReplace2, "proto udp");
                    } else {
                        Hometab.Companion companion = Hometab.n;
                        String customCertificate = serverList.getCustomCertificate();
                        companion.getClass();
                        strReplace = new Regex("(?m)^\\s*proto\\s+udp4\\s*$").replace(new Regex("(?m)^\\s*proto\\s+tcp4-client\\s*$").replace(Hometab.Companion.a(customCertificate), "proto tcp-client"), "proto udp");
                    }
                    if (strReplace != null && !kotlin.text.g.B(strReplace)) {
                        StringReader stringReader = new StringReader(strReplace);
                        ConfigParser configParser = new ConfigParser();
                        try {
                            configParser.parseConfig(stringReader);
                            VpnProfile vpnProfileConvertProfile = configParser.convertProfile();
                            if (vpnProfileConvertProfile != null && (connectionArr = vpnProfileConvertProfile.mConnections) != null && connectionArr.length != 0) {
                                Connection connection = connectionArr[0];
                                connection.mServerName = "1.1.1.1";
                                connection.mServerPort = openVPNTCPPort;
                                connection.mUseCustomConfig = true;
                                String str = URLEncoder.encode(string) + ".ovpn";
                                String configFile = vpnProfileConvertProfile.getConfigFile(L(), true);
                                FileOutputStream fileOutputStream = new FileOutputStream(new File(L().getFilesDir(), str));
                                configFile.getClass();
                                byte[] bytes = configFile.getBytes(xm.a);
                                bytes.getClass();
                                fileOutputStream.write(bytes);
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                OpenVPNService openVPNService = this.Y1;
                                if (openVPNService != null) {
                                    openVPNService.refresh_profile_list();
                                }
                            }
                        } catch (Exception e2) {
                            e2.getMessage();
                        }
                    }
                }
            }
        }
    }

    @Override // com.vpn.sandok.ultrasshservice.logger.SkStatus.LogListener
    public final void newLog(LogItem logItem) {
        logItem.getClass();
        if (logItem.getMessage() != null) {
            String message = logItem.getMessage();
            message.getClass();
            if (kotlin.text.g.o(message, "Failed to authenticate", false)) {
                kotlinx.coroutines.c.d(m.a(this), null, null, new AnonymousClass1(null), 3);
            }
            String message2 = logItem.getMessage();
            message2.getClass();
            if (kotlin.text.g.o(message2, "Invalid UDP Server", false)) {
                kotlinx.coroutines.c.d(m.a(this), null, null, new AnonymousClass2(null), 3);
            }
        }
        logItem.getLogtime();
        logItem.getMessage();
        Objects.toString(logItem.getLogLevel());
    }

    public final void o0() {
        Context contextF;
        if (!W() || this.p1 || (contextF = f()) == null) {
            return;
        }
        MaterialButton materialButton = this.u1;
        if (materialButton != null) {
            materialButton.setVisibility(8);
        }
        ProgressBar progressBar = this.v1;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        if (this.o1 == null) {
            this.p1 = true;
            AdRequest adRequestBuild = new AdRequest.Builder().build();
            adRequestBuild.getClass();
            RewardedAd.load(contextF, "ca-app-pub-7120795588295806/2108418468", adRequestBuild, new RewardedAdLoadCallback() { // from class: com.v2ray.ang.ui.HomeFragment$loadRewardedAd$1
                @Override // com.google.android.gms.ads.AdLoadCallback
                public final void onAdFailedToLoad(LoadAdError loadAdError) {
                    loadAdError.getClass();
                    HomeFragment homeFragment = this.a;
                    homeFragment.o1 = null;
                    homeFragment.p1 = false;
                    MaterialButton materialButton2 = homeFragment.u1;
                    if (materialButton2 != null) {
                        materialButton2.setVisibility(0);
                    }
                    ProgressBar progressBar2 = homeFragment.v1;
                    if (progressBar2 != null) {
                        progressBar2.setVisibility(8);
                    }
                    loadAdError.getCode();
                    loadAdError.getDomain();
                    loadAdError.getMessage();
                }

                @Override // com.google.android.gms.ads.AdLoadCallback
                public final void onAdLoaded(RewardedAd rewardedAd) {
                    RewardedAd rewardedAd2 = rewardedAd;
                    rewardedAd2.getClass();
                    HomeFragment homeFragment = this.a;
                    homeFragment.o1 = rewardedAd2;
                    homeFragment.p1 = false;
                    MaterialButton materialButton2 = homeFragment.u1;
                    if (materialButton2 != null) {
                        materialButton2.setVisibility(0);
                    }
                    ProgressBar progressBar2 = homeFragment.v1;
                    if (progressBar2 != null) {
                        progressBar2.setVisibility(8);
                    }
                }
            });
        }
    }

    @Override // com.v2ray.ang.adapter.NetworkAdapter.NetworkItemClickListener
    public final void onNetworkClick(int i, String str) {
        str.getClass();
        androidx.appcompat.app.g gVar = this.I0;
        if (gVar != null) {
            gVar.dismiss();
        }
        Lazy lazy = zq0.a;
        zq0.H(str);
        m0();
        z0();
    }

    @Override // com.v2ray.ang.adapter.ServerAdapter.ServerItemClickListener
    public final void onServerClick(int i) throws JSONException {
        androidx.appcompat.app.g gVar = this.I0;
        if (gVar != null) {
            gVar.dismiss();
        }
        C0();
        p0();
    }

    @Override // com.v2ray.ang.util.ConfigUpdate.UpdateAvailable
    public final void onUpdateAvailable() {
        Toast.makeText(M(), "Config Updated", 0).show();
        y0();
        z0();
        ConfigData configValue = e0().getConfigValue();
        configValue.getClass();
        boolean zIsTimerOn = configValue.isTimerOn();
        CardView cardView = this.c1;
        if (zIsTimerOn) {
            if (cardView != null) {
                cardView.setVisibility(0);
            }
        } else if (cardView != null) {
            cardView.setVisibility(8);
        }
        TextView textView = this.a1;
        if (textView != null) {
            Lazy lazy = zq0.a;
            String strD = zq0.u().d("CurrentConfigVersion");
            if (strD == null) {
                strD = "1.01";
            }
            textView.setText(strD);
        }
    }

    public final void p0() {
        List listZ;
        Lazy lazy = zq0.a;
        String strD = zq0.u().d("Proto");
        List list = this.G0;
        if (list == null) {
            yg0.N("serverList");
            throw null;
        }
        list.size();
        String strD2 = zq0.D();
        if (strD2 == null || strD2.length() == 0) {
            List list2 = this.G0;
            if (list2 == null) {
                yg0.N("serverList");
                throw null;
            }
            if (!list2.isEmpty()) {
                zq0.J("Auto Select Server");
                strD2 = "Auto Select Server";
            }
        }
        String strC = zq0.C();
        Protocol.a.getClass();
        Protocol.Companion.a(strD);
        List list3 = this.G0;
        if (list3 == null) {
            yg0.N("serverList");
            throw null;
        }
        List list4 = this.H0;
        if (list4 == null) {
            yg0.N("networkList");
            throw null;
        }
        ArrayList arrayListC0 = c0(list3, strC, list4);
        if (yg0.a(strD2, "Auto Select Server")) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListC0) {
                if (!kotlin.text.g.o(((ServerList) obj).getName(), "Auto Select Server", true)) {
                    arrayList.add(obj);
                }
            }
            listZ = !arrayList.isEmpty() ? kotlin.collections.c.z(kotlin.collections.c.F(arrayList, Random.INSTANCE)) : EmptyList.INSTANCE;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayListC0) {
                if (yg0.a(((ServerList) obj2).getName(), strD2)) {
                    arrayList2.add(obj2);
                }
            }
            listZ = arrayList2;
        }
        this.X1 = listZ;
        Objects.toString(listZ);
        ServerList serverList = (ServerList) kotlin.collections.c.s(this.X1);
        if (serverList != null) {
            this.q0 = kotlin.text.g.c0(serverList.getName()).toString();
            serverList.getFlag();
            this.r0 = serverList.getServerIPHost();
            this.s0 = serverList.getServerType();
            this.t0 = serverList.getServerProtocol();
            this.u0 = serverList.getOpenVPNTCPPort();
            serverList.getOpenVPNUdpPort();
            this.v0 = serverList.getSSH_Port();
            this.w0 = serverList.getSSLPort();
            this.x0 = serverList.getIsdefUser();
            this.y0 = serverList.getOVPNUser();
            this.z0 = serverList.getOVPNPass();
            this.A0 = serverList.getUDP_obfs();
            this.B0 = serverList.getUDP_user();
            serverList.getDefault_cert();
            serverList.getCustomCertificate();
            this.C0 = serverList.getSlowDNSHost();
            this.D0 = serverList.getSlowDNSKey();
            serverList.getV2rayUUID();
            serverList.getV2rayPath();
            this.E0 = serverList.getTrojanPass();
            serverList.getV2rayProtocol();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0018 A[PHI: r1
      0x0018: PHI (r1v1 int) = 
      (r1v0 int)
      (r1v0 int)
      (r1v0 int)
      (r1v0 int)
      (r1v0 int)
      (r1v15 int)
      (r1v0 int)
      (r1v16 int)
      (r1v0 int)
      (r1v17 int)
      (r1v0 int)
      (r1v18 int)
     binds: [B:3:0x0004, B:5:0x000a, B:28:0x0046, B:25:0x0041, B:21:0x0036, B:23:0x0039, B:17:0x002b, B:19:0x002e, B:13:0x0020, B:15:0x0023, B:8:0x0014, B:10:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.v2ray.ang.ui.HomeFragment.OVPNConfig q0() {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.ui.HomeFragment.q0():com.v2ray.ang.ui.HomeFragment$OVPNConfig");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r0() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.ui.HomeFragment.r0():void");
    }

    @Override // com.sandok.tunnel.service.InjectorService.InjectorListener
    public final void startOpenVPN() {
        OpenVPNService.ProfileList profileList;
        OpenVPNService.Profile profile;
        FragmentActivity fragmentActivityD;
        OpenVPNService openVPNService = this.Y1;
        if (openVPNService == null || (profileList = openVPNService.get_profile_list()) == null) {
            profileList = null;
        }
        if (profileList == null || (profile = profileList.get_profile_by_name(this.q0)) == null) {
            profile = null;
        }
        d dVar = new d(this);
        if (!o() || d() == null || (fragmentActivityD = d()) == null) {
            return;
        }
        new Handler(fragmentActivityD.getMainLooper());
        if (profile == null || !profile.need_external_pki_alias()) {
            dVar.post_dispatch(null);
            return;
        }
        dVar.post_dispatch("DISABLE_CLIENT_CERT");
        if (o()) {
            fragmentActivityD.isFinishing();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void t(Context context) {
        context.getClass();
        super.t(context);
        this.B1 = new WeakReference(context);
    }

    public final void u0(OpenVPNService.EventMsg eventMsg) throws JSONException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = eventMsg.res_id;
        if (i == this.a2 && jCurrentTimeMillis - this.Z1 < 200) {
            j().getString(i).getClass();
            return;
        }
        this.Z1 = jCurrentTimeMillis;
        this.a2 = i;
        eventMsg.is_reflected(this);
        int i2 = eventMsg.res_id;
        if (i2 == R.string.auth_failed) {
            J0();
            qf3.L(M(), "Invalid Account");
        } else if (i2 == R.string.connected) {
            I0();
        } else if (i2 == R.string.info_msg) {
            String str = eventMsg.info;
            str.getClass();
            if (kotlin.text.g.R(str, "OPEN_URL:", false)) {
                String str2 = eventMsg.info;
                str2.getClass();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2.substring(9)));
                intent.putExtra("com.android.browser.application_id", M().getPackageName());
                if (intent.resolveActivity(M().getPackageManager()) != null) {
                    U(intent);
                }
            }
        }
        if (eventMsg.priority >= 1) {
            if (eventMsg.res_id == R.string.connected) {
                ClientAPI_ConnectionInfo clientAPI_ConnectionInfo = eventMsg.conn_info;
                if (clientAPI_ConnectionInfo != null) {
                    clientAPI_ConnectionInfo.toString();
                }
                E0(eventMsg.res_id);
                return;
            }
            String str3 = eventMsg.info;
            str3.getClass();
            int length = str3.length();
            int i3 = eventMsg.res_id;
            if (length <= 0) {
                E0(i3);
                return;
            }
            String string = j().getString(i3);
            string.getClass();
            String.format("%s : %s", Arrays.copyOf(new Object[]{string, eventMsg.info}, 2));
            String string2 = j().getString(eventMsg.res_id);
            string2.getClass();
            if (kotlin.text.g.o(string2, "Server certificate verification failed", false)) {
                qf3.L(M(), "Invalid Certificate");
            }
            String string3 = j().getString(eventMsg.res_id);
            string3.getClass();
            A0(string3);
        }
    }

    @Override // com.vpn.sandok.ultrasshservice.logger.SkStatus.StateListener
    public final void updateState(String str, String str2, int i, ConnectionStatus connectionStatus, Intent intent) {
        str.getClass();
        str2.getClass();
        connectionStatus.getClass();
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplA = m.a(this);
        lv lvVar = oy.a;
        kotlinx.coroutines.c.d(lifecycleCoroutineScopeImplA, bn0.a, null, new C00221(str2, null), 2);
        connectionStatus.toString();
    }

    @Override // androidx.fragment.app.Fragment
    public final void x() {
        this.D = true;
    }

    public final void x0() {
        Window window;
        View viewInflate = g().inflate(R.layout.server_list, (ViewGroup) null);
        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(M(), R.style.FullScreenDialog);
        materialAlertDialogBuilder.a.r = viewInflate;
        androidx.appcompat.app.g gVarA = materialAlertDialogBuilder.a();
        this.I0 = gVarA;
        gVarA.show();
        androidx.appcompat.app.g gVar = this.I0;
        if (gVar != null && (window = gVar.getWindow()) != null) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        SearchView searchView = (SearchView) viewInflate.findViewById(R.id.svServer);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rvNetwork);
        EditText editText = (EditText) searchView.findViewById(R.id.search_src_text);
        editText.setTextColor(M().getColor(R.color.colorAccent));
        editText.setHintTextColor(M().getColor(R.color.colorAccent));
        List list = this.G0;
        if (list == null) {
            yg0.N("serverList");
            throw null;
        }
        ArrayList arrayList = new ArrayList(list);
        final ServerAdapter serverAdapter = new ServerAdapter(M(), L(), new ArrayList(), this);
        recyclerView.setLayoutManager(new LinearLayoutManager(M()));
        recyclerView.setAdapter(serverAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        Protocol.Companion companion = Protocol.a;
        Lazy lazy = zq0.a;
        String strD = zq0.u().d("Proto");
        companion.getClass();
        Protocol.Companion.a(strD);
        String strC = zq0.C();
        List list2 = this.H0;
        if (list2 == null) {
            yg0.N("networkList");
            throw null;
        }
        ArrayList arrayListC0 = c0(arrayList, strC, list2);
        serverAdapter.h.b(arrayListC0);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new nd0(this, arrayListC0, serverAdapter));
        androidx.appcompat.app.g gVar2 = this.I0;
        if (gVar2 != null) {
            gVar2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: vc0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    int i = HomeFragment.f2;
                    serverAdapter.i.clear();
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void y() {
        this.D = true;
        zr.b(this.O1, null);
        this.J0 = null;
        this.K0 = null;
        this.L0 = null;
        this.M0 = null;
        this.N0 = null;
        this.O0 = null;
        this.P0 = null;
        this.R0 = null;
        this.S0 = null;
        this.X0 = null;
        this.Y0 = null;
        this.Z0 = null;
        this.a1 = null;
        this.b1 = null;
        this.c1 = null;
        this.h1 = null;
        this.u1 = null;
        this.v1 = null;
        this.z1 = null;
        this.A1 = null;
        androidx.appcompat.app.g gVar = this.I0;
        if (gVar != null) {
            gVar.dismiss();
        }
        this.I0 = null;
        this.o1 = null;
        this.F1 = null;
        Job job = this.s1;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        this.s1 = null;
        AdView adView = this.j1;
        if (adView != null) {
            adView.destroy();
        }
        this.j1 = null;
        FrameLayout frameLayout = this.k1;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.k1 = null;
        this.Q1 = false;
        this.r1 = false;
        Job job2 = this.d1;
        if (job2 != null) {
            job2.cancel((CancellationException) null);
        }
        this.d1 = null;
        NetworkMonitor networkMonitor = this.g1;
        if (networkMonitor != null) {
            networkMonitor.h.cancel((CancellationException) null);
        }
        this.g1 = null;
        if (this.P1) {
            try {
                M().unregisterReceiver(this.W0);
                this.P1 = false;
            } catch (IllegalArgumentException unused) {
            }
        }
        a0();
        if (this.d2 != null) {
            M().unbindService(this.e2);
            this.d2 = null;
        }
        WeakReference weakReference = this.B1;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.B1 = null;
        zr.b(this.C1, null);
        ConfigUpdate configUpdate = this.G1;
        if (configUpdate != null) {
            zr.b(configUpdate.c, null);
        }
    }

    public final boolean y0() {
        ConfigData configData;
        String message;
        List listZ;
        List listZ2;
        ConfigData configData2;
        Gson gson = this.F0;
        try {
            Lazy lazy = zq0.a;
            String strD = zq0.u().d("KidConfigMM1");
            if (strD == null || strD.length() == 0) {
                InputStream inputStreamOpen = M().getAssets().open("configfile.json");
                inputStreamOpen.getClass();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, xm.a), AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT);
                try {
                    String strB = kotlin.io.d.b(bufferedReader);
                    bufferedReader.close();
                    Hometab.n.getClass();
                    String strA = Hometab.Companion.a(strB);
                    gson.getClass();
                    configData2 = (ConfigData) gson.c(strA, new TypeToken(ConfigData.class));
                } finally {
                }
            } else {
                Hometab.n.getClass();
                String strA2 = Hometab.Companion.a(strD);
                gson.getClass();
                configData2 = (ConfigData) gson.c(strA2, new TypeToken(ConfigData.class));
            }
            configData = configData2;
        } catch (Exception e) {
            e.printStackTrace();
            configData = null;
        }
        e0().setConfig(configData);
        int i = 1;
        if (configData == null || configData.getServers().isEmpty()) {
            Libv2ray.ao(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            try {
                message = Libv2ray.do_("App mod/Moding Tool detected");
            } catch (Throwable th) {
                message = th.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(M());
            AlertController.AlertParams alertParams = alertDialog$Builder.a;
            alertParams.e = "Security check failed";
            alertParams.g = message;
            alertParams.l = false;
            alertDialog$Builder.e("Exit", new k(i));
            alertDialog$Builder.f();
            EmptyList emptyList = EmptyList.INSTANCE;
            this.H0 = emptyList;
            this.G0 = emptyList;
            return false;
        }
        List<NetworkList> networks = configData.getNetworks();
        Lazy lazy2 = zq0.a;
        if (zq0.t()) {
            String strD2 = zq0.u().d("ConfigFile");
            if (strD2 != null) {
                Hometab.n.getClass();
                String strA3 = Hometab.Companion.a(strD2);
                gson.getClass();
                networks = kotlin.collections.c.z((NetworkList) gson.c(strA3, new TypeToken(NetworkList.class)));
            }
        } else {
            String strD3 = zq0.u().d("OwnTweak");
            String str = qf3.C(strD3) ? strD3 : null;
            if (str != null) {
                try {
                    Type type = new TypeToken<List<? extends NetworkList>>() { // from class: com.v2ray.ang.ui.HomeFragment$parseNetworkList$listType$1
                    }.b;
                    gson.getClass();
                    Object objC = gson.c(str, new TypeToken(type));
                    objC.getClass();
                    listZ = (List) objC;
                } catch (Exception e2) {
                    e2.getMessage();
                    try {
                        gson.getClass();
                        listZ = kotlin.collections.c.z((NetworkList) gson.c(str, new TypeToken(NetworkList.class)));
                    } catch (Exception e3) {
                        e3.getMessage();
                        listZ = EmptyList.INSTANCE;
                    }
                }
                networks = kotlin.collections.c.C(networks, listZ);
            }
        }
        this.H0 = networks;
        ServerList serverList = new ServerList("Auto Select Server", "AA", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Random", "Random", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, true, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, true, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, null, null, null, null, null, 8126464, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(serverList);
        arrayList.addAll(configData.getServers());
        Lazy lazy3 = zq0.a;
        String strD4 = zq0.u().d("OwnServer");
        String str2 = qf3.C(strD4) ? strD4 : null;
        if (str2 != null) {
            try {
                Type type2 = new TypeToken<List<? extends ServerList>>() { // from class: com.v2ray.ang.ui.HomeFragment$parseServerList$listType$1
                }.b;
                gson.getClass();
                Object objC2 = gson.c(str2, new TypeToken(type2));
                objC2.getClass();
                listZ2 = (List) objC2;
            } catch (Exception e4) {
                e4.getMessage();
                try {
                    gson.getClass();
                    listZ2 = kotlin.collections.c.z((ServerList) gson.c(str2, new TypeToken(ServerList.class)));
                } catch (Exception e5) {
                    e5.getMessage();
                    listZ2 = EmptyList.INSTANCE;
                }
            }
            arrayList.addAll(0, listZ2);
        }
        this.G0 = arrayList;
        List list = this.H0;
        if (list != null) {
            return list.size() != 0;
        }
        yg0.N("networkList");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e A[PHI: r0
      0x003e: PHI (r0v9 java.lang.String) = (r0v5 java.lang.String), (r0v8 java.lang.String), (r0v12 java.lang.String) binds: [B:33:0x0081, B:28:0x0072, B:11:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z0() {
        /*
            r5 = this;
            kotlin.Lazy r0 = defpackage.zq0.a
            java.lang.String r0 = defpackage.zq0.C()
            com.v2ray.ang.helper.Protocol$Companion r1 = com.v2ray.ang.helper.Protocol.a
            com.tencent.mmkv.MMKV r2 = defpackage.zq0.u()
            java.lang.String r3 = "Proto"
            java.lang.String r2 = r2.d(r3)
            r1.getClass()
            com.v2ray.ang.helper.Protocol r1 = com.v2ray.ang.helper.Protocol.Companion.a(r2)
            java.util.List r2 = r5.G0
            r3 = 0
            if (r2 == 0) goto L97
            java.util.List r4 = r5.H0
            if (r4 == 0) goto L91
            java.util.ArrayList r0 = r5.c0(r2, r0, r4)
            com.v2ray.ang.helper.e r2 = com.v2ray.ang.helper.e.b
            boolean r2 = defpackage.yg0.a(r1, r2)
            java.lang.String r3 = "Auto Select Server"
            if (r2 == 0) goto L40
            java.lang.Object r0 = kotlin.collections.c.s(r0)
            com.v2ray.ang.viewmodel.ServerList r0 = (com.v2ray.ang.viewmodel.ServerList) r0
            if (r0 == 0) goto L84
            java.lang.String r0 = r0.getName()
            if (r0 == 0) goto L84
        L3e:
            r3 = r0
            goto L84
        L40:
            com.v2ray.ang.helper.a r2 = com.v2ray.ang.helper.a.b
            boolean r2 = defpackage.yg0.a(r1, r2)
            if (r2 != 0) goto L75
            com.v2ray.ang.helper.b r2 = com.v2ray.ang.helper.b.b
            boolean r2 = defpackage.yg0.a(r1, r2)
            if (r2 == 0) goto L51
            goto L75
        L51:
            com.v2ray.ang.helper.d r2 = com.v2ray.ang.helper.d.b
            boolean r2 = defpackage.yg0.a(r1, r2)
            if (r2 != 0) goto L66
            com.v2ray.ang.helper.c r2 = com.v2ray.ang.helper.c.b
            boolean r1 = defpackage.yg0.a(r1, r2)
            if (r1 == 0) goto L62
            goto L66
        L62:
            defpackage.p60.b()
            return
        L66:
            java.lang.Object r0 = kotlin.collections.c.s(r0)
            com.v2ray.ang.viewmodel.ServerList r0 = (com.v2ray.ang.viewmodel.ServerList) r0
            if (r0 == 0) goto L84
            java.lang.String r0 = r0.getName()
            if (r0 == 0) goto L84
            goto L3e
        L75:
            java.lang.Object r0 = kotlin.collections.c.s(r0)
            com.v2ray.ang.viewmodel.ServerList r0 = (com.v2ray.ang.viewmodel.ServerList) r0
            if (r0 == 0) goto L84
            java.lang.String r0 = r0.getName()
            if (r0 == 0) goto L84
            goto L3e
        L84:
            defpackage.zq0.J(r3)
            r5.C0()
            r5.m0()
            r5.p0()
            return
        L91:
            java.lang.String r5 = "networkList"
            defpackage.yg0.N(r5)
            throw r3
        L97:
            java.lang.String r5 = "serverList"
            defpackage.yg0.N(r5)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.ui.HomeFragment.z0():void");
    }

    @Override // com.vpn.sandok.ultrasshservice.logger.SkStatus.LogListener
    public final void onClear() {
    }

    @Override // com.sandok.tunnel.service.OpenVPNService.EventReceiver
    public final void log(OpenVPNService.LogMsg logMsg) {
    }
}
