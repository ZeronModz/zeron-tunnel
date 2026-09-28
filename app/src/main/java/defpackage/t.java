package defpackage;

import android.content.Context;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.migrations.SharedPreferencesMigration;
import coil3.disk.DiskLruCache;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.firebase.datastorage.JavaDataStorage;
import com.google.firebase.sessions.SessionData;
import com.google.firebase.sessions.SessionDataSerializer;
import com.google.firebase.sessions.Time;
import com.trilead.ssh2.sftp.ErrorCodes;
import com.v2ray.ang.Hometab;
import com.v2ray.ang.ui.HomeFragment;
import com.v2ray.ang.viewmodel.NetworkList;
import io.github.g00fy2.quickie.QRScannerActivity;
import io.ktor.client.HttpClient;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.engine.okhttp.OkHttpEngine;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.HeaderValueParam;
import io.ktor.http.auth.HeaderValueEncoding;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.http.auth.a;
import io.ktor.util.Attributes;
import io.ktor.utils.io.ByteChannel;
import java.lang.annotation.Annotation;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.collections.EmptyList;
import kotlin.collections.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import kotlin.text.f;
import kotlin.text.g;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobSupport;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TripleSerializer;
import kotlinx.serialization.json.JsonElement;
import okhttp3.ResponseBody;
import org.slf4j.Logger;

 
 
public final   class t implements Function1 {
    public final   int a;
    public final   Object b;

    public   t(HttpAuthHeader.Parameterized parameterized, HeaderValueEncoding headerValueEncoding) {
        this.a = 8;
        this.b = headerValueEncoding;
    }

     
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SerialDescriptor descriptor;
        int i = this.a;
        List<Annotation> d = null;
        mk1 mk1Var = mk1.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return obj == ((u) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                ByteChannel byteChannel = (ByteChannel) obj2;
                Throwable th = (Throwable) obj;
                if (th != null && !byteChannel.isClosedForWrite()) {
                    byteChannel.cancel(th);
                }
                return mk1Var;
            case 2:
                StringBuilder sb = (StringBuilder) obj2;
                Byte b = (Byte) obj;
                byte bByteValue = b.byteValue();
                if (bByteValue == 32) {
                    sb.append("%20");
                } else if (eo.a.contains(b) || eo.c.contains(b)) {
                    sb.append((char) bByteValue);
                } else {
                    sb.append(eo.g(bByteValue));
                }
                return mk1Var;
            case 3:
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder = (ClassSerialDescriptorBuilder) obj;
                classSerialDescriptorBuilder.getClass();
                KSerializer kSerializer = ((ContextualSerializer) obj2).b;
                if (kSerializer != null && (descriptor = kSerializer.getB()) != null) {
                    d = descriptor.getD();
                }
                if (d == null) {
                    d = EmptyList.INSTANCE;
                }
                d.getClass();
                classSerialDescriptorBuilder.b = d;
                return mk1Var;
            case 4:
                ((DiskLruCache) obj2).n = true;
                return mk1Var;
            case 5:
                ((CorruptionException) obj).getClass();
                return new SessionData(((SessionDataSerializer) obj2).a.a(null), (Time) null, (Map) null, 6, (xu) null);
            case 6:
                NetworkList networkList = (NetworkList) obj;
                int i2 = HomeFragment.f2;
                networkList.getClass();
                return Boolean.valueOf(g.o(networkList.getName(), (String) obj2, false));
            case 7:
                Hometab hometab = (Hometab) obj2;
                v7 v7Var = (v7) obj;
                Hometab.Companion companion = Hometab.n;
                if (v7Var.a == 2 && v7Var.a(AppUpdateOptions.c(1).a()) != null) {
                    AppUpdateManager appUpdateManager = hometab.k;
                    if (appUpdateManager == null) {
                        yg0.N("appUpdateManager");
                        throw null;
                    }
                    appUpdateManager.startUpdateFlowForResult(v7Var, 1, hometab, hometab.j);
                    AppUpdateManager appUpdateManager2 = hometab.k;
                    if (appUpdateManager2 == null) {
                        yg0.N("appUpdateManager");
                        throw null;
                    }
                    appUpdateManager2.registerListener(hometab.m);
                }
                return mk1Var;
            case 8:
                HeaderValueParam headerValueParam = (HeaderValueParam) obj;
                int i3 = HttpAuthHeader.Parameterized.d;
                headerValueParam.getClass();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(headerValueParam.a);
                sb2.append('=');
                String strB = headerValueParam.b;
                int i4 = a.a[((HeaderValueEncoding) obj2).ordinal()];
                if (i4 == 1) {
                    Set set = pc0.a;
                    strB.getClass();
                    if (pc0.a(strB)) {
                        strB = pc0.b(strB);
                    }
                } else if (i4 == 2) {
                    strB = pc0.b(strB);
                } else {
                    if (i4 != 3) {
                        p60.b();
                        return null;
                    }
                    strB = eo.e(strB, false);
                }
                sb2.append(strB);
                return sb2.toString();
            case 9:
                HttpClient httpClient = (HttpClient) obj2;
                if (((Throwable) obj) != null) {
                    zr.b(httpClient.a, null);
                } else {
                    int i5 = HttpClient.m;
                }
                return mk1Var;
            case 10:
                HttpClientPlugin httpClientPlugin = (HttpClientPlugin) obj2;
                HttpClient httpClient2 = (HttpClient) obj;
                httpClient2.getClass();
                Attributes attributes = (Attributes) httpClient2.i.computeIfAbsent(ie0.a, new o0(14));
                Object obj3 = httpClient2.k.b.get(httpClientPlugin.getC());
                obj3.getClass();
                Object objPrepare = httpClientPlugin.prepare((Function1) obj3);
                httpClientPlugin.install(objPrepare, httpClient2);
                attributes.put(httpClientPlugin.getC(), objPrepare);
                return mk1Var;
            case 11:
                ((HttpClientEngine) obj2).close();
                return mk1Var;
            case 12:
                Job job = (CompletableJob) obj2;
                Throwable th2 = (Throwable) obj;
                Logger logger = me0.a;
                if (th2 != null) {
                    logger.trace("Cancelling request because engine Job failed with error: " + th2);
                    ((JobSupport) job).cancel(j03.a("Engine failed", th2));
                } else {
                    logger.trace("Cancelling request because engine Job completed");
                    ((JobImpl) job).complete();
                }
                return mk1Var;
            case 13:
                ((DisposableHandle) obj2).dispose();
                return mk1Var;
            case 14:
                Throwable th3 = (Throwable) obj;
                Job job2 = ((HttpRequestBuilder) obj2).e;
                job2.getClass();
                CompletableJob completableJob = (CompletableJob) job2;
                if (th3 == null) {
                    completableJob.complete();
                } else {
                    completableJob.completeExceptionally(th3);
                }
                return mk1Var;
            case 15:
                Context context = (Context) obj;
                KProperty[] kPropertyArr = JavaDataStorage.d;
                context.getClass();
                String str = ((JavaDataStorage) obj2).a;
                LinkedHashSet linkedHashSet = androidx.datastore.preferences.a.a;
                linkedHashSet.getClass();
                return c.z(new SharedPreferencesMigration(context, str, null, androidx.datastore.preferences.a.b(linkedHashSet), androidx.datastore.preferences.a.a(), 4, null));
            case 16:
                return ((f) obj2).get(((Integer) obj).intValue());
            case 17:
                obj.getClass();
                ((Function1) obj2).invoke(obj);
                return mk1Var;
            case 18:
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder2 = (ClassSerialDescriptorBuilder) obj;
                classSerialDescriptorBuilder2.getClass();
                List list = ((ObjectSerializer) obj2).b;
                list.getClass();
                classSerialDescriptorBuilder2.b = list;
                return mk1Var;
            case 19:
                ResponseBody responseBody = (ResponseBody) obj2;
                OkHttpEngine.Companion companion2 = OkHttpEngine.k;
                if (responseBody != null) {
                    responseBody.close();
                }
                return mk1Var;
            case 20:
                ((JobImpl) obj2).cancel((CancellationException) null);
                return mk1Var;
            case 21:
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = (PluginGeneratedSerialDescriptor) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return pluginGeneratedSerialDescriptor.e[iIntValue] + ": " + pluginGeneratedSerialDescriptor.getElementDescriptor(iIntValue).getA();
            case 22:
                PolymorphicSerializer polymorphicSerializer = (PolymorphicSerializer) obj2;
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder3 = (ClassSerialDescriptorBuilder) obj;
                classSerialDescriptorBuilder3.getClass();
                ClassSerialDescriptorBuilder.a(classSerialDescriptorBuilder3, "type", bb1.b);
                ClassSerialDescriptorBuilder.a(classSerialDescriptorBuilder3, "value", qj1.i("kotlinx.serialization.Polymorphic<" + polymorphicSerializer.a.getSimpleName() + '>', d61.a, new SerialDescriptor[0]));
                List list2 = polymorphicSerializer.b;
                list2.getClass();
                classSerialDescriptorBuilder3.b = list2;
                return mk1Var;
            case 23:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i6 = QRScannerActivity.j;
                ((ak0) obj2).c.q.enableTorch(zBooleanValue);
                return mk1Var;
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY  :
                SerialDescriptorImpl serialDescriptorImpl = (SerialDescriptorImpl) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                return serialDescriptorImpl.f[iIntValue2] + ": " + serialDescriptorImpl.g[iIntValue2].getA();
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT  :
                JsonElement r13 = (JsonElement) obj;
                r13.getClass();
                ((Ref$ObjectRef) obj2).element = r13;
                return mk1Var;
            default:
                TripleSerializer tripleSerializer = (TripleSerializer) obj2;
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder4 = (ClassSerialDescriptorBuilder) obj;
                classSerialDescriptorBuilder4.getClass();
                ClassSerialDescriptorBuilder.a(classSerialDescriptorBuilder4, "first", tripleSerializer.a.getB());
                ClassSerialDescriptorBuilder.a(classSerialDescriptorBuilder4, "second", tripleSerializer.b.getB());
                ClassSerialDescriptorBuilder.a(classSerialDescriptorBuilder4, "third", tripleSerializer.c.getB());
                return mk1Var;
        }
    }

    public   t(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
