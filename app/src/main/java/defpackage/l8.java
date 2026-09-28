package defpackage;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.CoroutineLiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.viewpager2.widget.ViewPager2;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import dev.zeron.tunnel.R;
import coil3.ImageLoader;
import coil3.memory.MemoryCache;
import coil3.memory.RealWeakMemoryCache;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.sessions.UuidGenerator;
import com.trilead.ssh2.sftp.ErrorCodes;
import com.v2ray.ang.Hometab;
import com.v2ray.ang.adapter.NetworkAdapter;
import com.v2ray.ang.ui.PerAppProxyActivity;
import com.v2ray.ang.ui.ServerStatusVIew;
import com.v2ray.ang.ui.TaskerActivity;
import com.v2ray.ang.ui.UrlSchemeActivity;
import io.github.g00fy2.quickie.QRScannerActivity;
import io.ktor.http.Url;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.g;
import kotlinx.io.Buffer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import okio.FileSystem;
import okio.Path;
import okio.internal.ResourceFileSystem;
import okio.internal.b;
import okio.internal.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [ep0] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IOException {
        int iD;
        Pair pair;
        Pair pair2;
        int i = this.a;
        mk1 mk1Var = mk1.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                ((CoroutineLiveData) obj).m = null;
                break;
            case 4:
                break;
            case 5:
                ((RandomAccessFile) ((Lazy) obj).getValue()).close();
                break;
            case 6:
                Hometab.Companion companion = Hometab.n;
                View viewInflate = ((Hometab) obj).getLayoutInflater().inflate(R.layout.activity_hometab, (ViewGroup) null, false);
                DrawerLayout drawerLayout = (DrawerLayout) viewInflate;
                int i3 = R.id.navigationView;
                NavigationView navigationView = (NavigationView) l02.n(R.id.navigationView, viewInflate);
                if (navigationView != null) {
                    i3 = R.id.tabLayout;
                    TabLayout tabLayout = (TabLayout) l02.n(R.id.tabLayout, viewInflate);
                    if (tabLayout != null) {
                        i3 = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) l02.n(R.id.toolbar, viewInflate);
                        if (materialToolbar != null) {
                            i3 = R.id.viewPager;
                            ViewPager2 viewPager2 = (ViewPager2) l02.n(R.id.viewPager, viewInflate);
                            if (viewPager2 != null) {
                            }
                        }
                    }
                }
                io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
                break;
            case 7:
                MemoryCache.Builder builder = new MemoryCache.Builder();
                final Context context = ((ImageLoader.Builder) obj).a;
                final double d = 0.2d;
                try {
                    Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d > d || d > 1.0d) {
                    u7.r("percent must be in the range [0.0, 1.0].");
                } else {
                    builder.a = new Function0() { // from class: ep0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int largeMemoryClass;
                            Context context2 = context;
                            try {
                                Object systemService2 = context2.getSystemService((Class<Object>) ActivityManager.class);
                                systemService2.getClass();
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                largeMemoryClass = (context2.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                            } catch (Exception unused2) {
                                largeMemoryClass = 256;
                            }
                            return Long.valueOf((long) (d * ((long) largeMemoryClass) * 1048576));
                        }
                    };
                    RealWeakMemoryCache realWeakMemoryCache = new RealWeakMemoryCache();
                    ep0 ep0Var = builder.a;
                    if (ep0Var != null) {
                        long jLongValue = ((Number) ep0Var.invoke()).longValue();
                    } else {
                        u7.p("maxSizeBytesFactory == null");
                    }
                }
                break;
            case 8:
                byte[] bArr = (byte[]) obj;
                Buffer buffer = new Buffer();
                buffer.write(bArr, 0, bArr.length);
                break;
            case 9:
                int i4 = NetworkAdapter.ViewHolder.A;
                break;
            case 10:
                break;
            case 11:
                int i5 = PerAppProxyActivity.f;
                View viewInflate2 = ((PerAppProxyActivity) obj).getLayoutInflater().inflate(R.layout.activity_bypass_list, (ViewGroup) null, false);
                int i6 = R.id.container_bypass_apps;
                if (((LinearLayout) l02.n(R.id.container_bypass_apps, viewInflate2)) != null) {
                    i6 = R.id.container_per_app_proxy;
                    if (((LinearLayout) l02.n(R.id.container_per_app_proxy, viewInflate2)) != null) {
                        i6 = R.id.header_view;
                        if (((LinearLayout) l02.n(R.id.header_view, viewInflate2)) != null) {
                            i6 = R.id.layout_switch_bypass_apps_tips;
                            LinearLayout linearLayout = (LinearLayout) l02.n(R.id.layout_switch_bypass_apps_tips, viewInflate2);
                            if (linearLayout != null) {
                                i6 = R.id.pb_waiting;
                                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) l02.n(R.id.pb_waiting, viewInflate2);
                                if (linearProgressIndicator != null) {
                                    i6 = R.id.recycler_view;
                                    RecyclerView recyclerView = (RecyclerView) l02.n(R.id.recycler_view, viewInflate2);
                                    if (recyclerView != null) {
                                        i6 = R.id.switch_bypass_apps;
                                        SwitchCompat switchCompat = (SwitchCompat) l02.n(R.id.switch_bypass_apps, viewInflate2);
                                        if (switchCompat != null) {
                                            i6 = R.id.switch_per_app_proxy;
                                            SwitchCompat switchCompat2 = (SwitchCompat) l02.n(R.id.switch_per_app_proxy, viewInflate2);
                                            if (switchCompat2 != null) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                io0.e("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i6)));
                break;
            case 12:
                PolymorphicSerializer polymorphicSerializer = (PolymorphicSerializer) obj;
                break;
            case 13:
                String string = ((UuidGenerator) obj).next().toString();
                string.getClass();
                break;
            case 14:
                int i7 = QRScannerActivity.j;
                ((QRScannerActivity) obj).finish();
                break;
            case 15:
                ResourceFileSystem resourceFileSystem = (ResourceFileSystem) obj;
                ClassLoader classLoader = resourceFileSystem.c;
                FileSystem fileSystem = resourceFileSystem.d;
                Enumeration<URL> resources = classLoader.getResources(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                resources.getClass();
                ArrayList<URL> list = Collections.list(resources);
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (URL url : list) {
                    url.getClass();
                    if (yg0.a(url.getProtocol(), "file")) {
                        Path.Companion companion2 = Path.b;
                        File file = new File(url.toURI());
                        companion2.getClass();
                        String string2 = file.toString();
                        string2.getClass();
                        pair2 = new Pair(fileSystem, Path.Companion.a(string2, false));
                    } else {
                        pair2 = null;
                    }
                    if (pair2 != null) {
                        arrayList.add(pair2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                resources2.getClass();
                ArrayList<URL> list2 = Collections.list(resources2);
                list2.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (URL url2 : list2) {
                    url2.getClass();
                    String string3 = url2.toString();
                    string3.getClass();
                    if (g.R(string3, "jar:file:", false) && (iD = g.D(6, string3, "!")) != -1) {
                        Path.Companion companion3 = Path.b;
                        File file2 = new File(URI.create(string3.substring(4, iD)));
                        companion3.getClass();
                        String string4 = file2.toString();
                        string4.getClass();
                        pair = new Pair(c.c(Path.Companion.a(string4, false), fileSystem, new b()), ResourceFileSystem.g);
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                }
                break;
            case 16:
                break;
            case 17:
                SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) obj;
                savedStateRegistryOwner.getLifecycle().a(new Recreator(savedStateRegistryOwner));
                break;
            case 18:
                break;
            case 19:
                SerialDescriptorImpl serialDescriptorImpl = (SerialDescriptorImpl) obj;
                break;
            case 20:
                int i8 = ServerStatusVIew.c;
                View viewInflate3 = ((ServerStatusVIew) obj).getLayoutInflater().inflate(R.layout.activity_server_status_view, (ViewGroup) null, false);
                int i9 = R.id.btn_back;
                ImageView imageView = (ImageView) l02.n(R.id.btn_back, viewInflate3);
                if (imageView != null) {
                    i9 = R.id.imgfilter;
                    ImageView imageView2 = (ImageView) l02.n(R.id.imgfilter, viewInflate3);
                    if (imageView2 != null) {
                        i9 = R.id.rvServerStatus;
                        RecyclerView recyclerView2 = (RecyclerView) l02.n(R.id.rvServerStatus, viewInflate3);
                        if (recyclerView2 != null) {
                        }
                    }
                }
                io0.e("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i9)));
                break;
            case 21:
                break;
            case 22:
                int i10 = TaskerActivity.g;
                View viewInflate4 = ((TaskerActivity) obj).getLayoutInflater().inflate(R.layout.activity_tasker, (ViewGroup) null, false);
                int i11 = R.id.listview;
                if (((ListView) l02.n(R.id.listview, viewInflate4)) != null) {
                    i11 = R.id.switch_start_service;
                    SwitchCompat switchCompat3 = (SwitchCompat) l02.n(R.id.switch_start_service, viewInflate4);
                    if (switchCompat3 != null) {
                    }
                }
                io0.e("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(i11)));
                break;
            case 23:
                List list3 = (List) obj;
                int i12 = Url.s;
                if (!list3.isEmpty()) {
                    if (((CharSequence) kotlin.collections.c.r(list3)).length() == 0 && list3.size() > 1) {
                        i2 = 1;
                    }
                }
                break;
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                int i13 = UrlSchemeActivity.d;
                break;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                int i14 = WorkContinuationImpl.j;
                w20.a((WorkContinuationImpl) obj);
                break;
            default:
                WorkManagerImpl workManagerImpl = (WorkManagerImpl) obj;
                WorkManagerImpl workManagerImpl2 = WorkManagerImpl.n;
                WorkDatabase workDatabase = workManagerImpl.d;
                Context context2 = workManagerImpl.b;
                int i15 = SystemJobScheduler.f;
                if (Build.VERSION.SDK_INT >= 34) {
                    ci0.a(context2).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context2.getSystemService("jobscheduler");
                ArrayList arrayListC = SystemJobScheduler.c(context2, jobScheduler);
                if (arrayListC != null && !arrayListC.isEmpty()) {
                    Iterator it = arrayListC.iterator();
                    while (it.hasNext()) {
                        SystemJobScheduler.a(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                workDatabase.w().resetScheduledState();
                e51.b(workManagerImpl.c, workDatabase, workManagerImpl.f);
                break;
        }
        return mk1Var;
    }
}
