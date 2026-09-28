package defpackage;

import android.net.NetworkRequest;
import android.os.StatFs;
import androidx.savedstate.internal.SavedStateRegistryImpl;
import coil3.disk.DiskCache;
import coil3.disk.RealDiskCache;
import coil3.fetch.Fetcher;
import coil3.graphics.Decoder;
import coil3.util.DecoderServiceLoaderTarget;
import coil3.util.FetcherServiceLoaderTarget;
import com.google.gson.Gson;
import com.tencent.mmkv.MMKV;
import com.trilead.ssh2.sftp.ErrorCodes;
import com.v2ray.ang.service.ProcessService;
import com.v2ray.ang.service.V2RayTestService;
import com.v2ray.ang.service.V2RayVpnService;
import io.ktor.client.engine.okhttp.OkHttpEngine;
import io.ktor.client.plugins.cache.storage.UnlimitedCacheStorage;
import io.ktor.util.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ServiceLoader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Pair;
import kotlin.collections.c;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.sequences.b;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import okhttp3.OkHttpClient;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yq0 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ yq0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KClass kClassType;
        long jA;
        int i = this.a;
        int i2 = 0;
        mk1 mk1Var = mk1.a;
        switch (i) {
            case 0:
                return MMKV.n("MAIN");
            case 1:
                return MMKV.n("PROFILE_FULL_CONFIG");
            case 2:
                return MMKV.n("SERVER_RAW");
            case 3:
                return MMKV.n("SERVER_AFF");
            case 4:
                return MMKV.n("SUB");
            case 5:
                return MMKV.n("ASSET");
            case 6:
                return MMKV.n("SETTING");
            case 7:
                return MMKV.n("JSONCONFIGMM1");
            case 8:
                return new Gson();
            case 9:
                OkHttpEngine.Companion companion = OkHttpEngine.k;
                return new OkHttpClient(new OkHttpClient.Builder());
            case 10:
                return mk1Var;
            case 11:
                return new ProcessService();
            case 12:
                List listN = c.N((List) r61.a.getValue(), new Comparator() { // from class: coil3.RealImageLoaderKt$addServiceLoaderComponents$lambda$3$$inlined$sortedByDescending$1
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return kotlin.comparisons.a.a(Integer.valueOf(((FetcherServiceLoaderTarget) obj2).priority()), Integer.valueOf(((FetcherServiceLoaderTarget) obj).priority()));
                    }
                });
                ArrayList arrayList = new ArrayList();
                int size = listN.size();
                while (i2 < size) {
                    FetcherServiceLoaderTarget fetcherServiceLoaderTarget = (FetcherServiceLoaderTarget) listN.get(i2);
                    fetcherServiceLoaderTarget.getClass();
                    Fetcher.Factory factory = fetcherServiceLoaderTarget.factory();
                    Pair pair = null;
                    if (factory != null && (kClassType = fetcherServiceLoaderTarget.type()) != null) {
                        pair = new Pair(factory, kClassType);
                    }
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                    i2++;
                }
                return arrayList;
            case 13:
                List listN2 = c.N((List) r61.b.getValue(), new Comparator() { // from class: coil3.RealImageLoaderKt$addServiceLoaderComponents$lambda$6$$inlined$sortedByDescending$1
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return kotlin.comparisons.a.a(Integer.valueOf(((DecoderServiceLoaderTarget) obj2).priority()), Integer.valueOf(((DecoderServiceLoaderTarget) obj).priority()));
                    }
                });
                ArrayList arrayList2 = new ArrayList();
                int size2 = listN2.size();
                while (i2 < size2) {
                    Decoder.Factory factory2 = ((DecoderServiceLoaderTarget) listN2.get(i2)).factory();
                    if (factory2 != null) {
                        arrayList2.add(factory2);
                    }
                    i2++;
                }
                return arrayList2;
            case 14:
                int i3 = SavedStateRegistryImpl.i;
                return mk1Var;
            case 15:
                return xg0.v(b.f(b.a(ServiceLoader.load(FetcherServiceLoaderTarget.class, FetcherServiceLoaderTarget.class.getClassLoader()).iterator())));
            case 16:
                return xg0.v(b.f(b.a(ServiceLoader.load(DecoderServiceLoaderTarget.class, DecoderServiceLoaderTarget.class.getClassLoader()).iterator())));
            case 17:
                return a.d();
            case 18:
                return a.d();
            case 19:
                int i4 = UnlimitedCacheStorage.d;
                return new iq();
            case 20:
                int i5 = UnlimitedCacheStorage.d;
                return new iq();
            case 21:
                return new iq();
            case 22:
                return new iq();
            case 23:
                DiskCache.Builder builder = new DiskCache.Builder();
                Path pathE = FileSystem.b.e("coil3_disk_cache");
                double d = builder.b;
                if (d > 0.0d) {
                    try {
                        File file = pathE.toFile();
                        file.mkdir();
                        StatFs statFs = new StatFs(file.getAbsolutePath());
                        jA = kotlin.ranges.a.a((long) (d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), builder.c, builder.d);
                    } catch (Exception unused) {
                        jA = builder.c;
                    }
                    break;
                } else {
                    jA = 0;
                }
                return new RealDiskCache(jA, pathE, builder.a, builder.e);
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                int i6 = V2RayTestService.b;
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
                executorServiceNewFixedThreadPool.getClass();
                return zr.a(new ExecutorCoroutineDispatcherImpl(executorServiceNewFixedThreadPool));
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                int i7 = V2RayVpnService.h;
                return new NetworkRequest.Builder().addCapability(12).addCapability(13).build();
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                return "{\"version\":\"1.1\",\"method\":\"GET\",\"headers\":{\"User-Agent\":[\"Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.6478.122 Mobile Safari/537.36\"],\"Accept-Encoding\":[\"gzip, deflate\"],\"Connection\":[\"keep-alive\"],\"Pragma\":\"no-cache\"}}";
            default:
                return androidx.lifecycle.viewmodel.a.c;
        }
    }
}
