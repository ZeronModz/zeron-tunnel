package com;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ul1;
import defpackage.z3;
import defpackage.zq0;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlin.collections.c;
import kotlin.jvm.internal.a;
import kotlin.text.Regex;
import kotlin.text.g;
import libv2ray.Libv2ray;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/AiH;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AiH {
    public final Context a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Collection] */
    public AiH(Context context) throws JSONException {
        int i;
        ?? arrayList;
        Signature[] apkContentsSigners;
        File[] fileArrListFiles;
        context.getClass();
        this.a = context;
        String packageName = context.getPackageName();
        Libv2ray.po(packageName);
        int i2 = 0;
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            applicationInfo.getClass();
            String string = packageManager.getApplicationLabel(applicationInfo).toString();
            Lazy lazy = zq0.a;
            string.getClass();
            zq0.u().i("OOOa", string);
            Libv2ray.ao(string);
            Libv2ray.sp(applicationInfo.sourceDir);
        } catch (PackageManager.NameNotFoundException unused) {
            packageName.getClass();
            String str = (String) c.y(g.O(packageName, new String[]{"."}, 6));
            Libv2ray.ao(str == null ? "Unknown App" : str);
        }
        Regex regex = ul1.a;
        try {
            fileArrListFiles = new File(this.a.getApplicationInfo().nativeLibraryDir).listFiles();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (fileArrListFiles != null) {
            i = 0;
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    String name = file.getName();
                    name.getClass();
                    if (g.u(name, ".so", false)) {
                        i++;
                    }
                }
            }
        } else {
            i = 0;
        }
        Regex regex2 = ul1.a;
        int iA = ul1.a(this.a);
        try {
            File[] fileArrListFiles2 = new File(this.a.getApplicationInfo().nativeLibraryDir).listFiles();
            if (fileArrListFiles2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (File file2 : fileArrListFiles2) {
                    if (file2.isFile()) {
                        String name2 = file2.getName();
                        name2.getClass();
                        if (g.u(name2, ".so", false)) {
                            arrayList2.add(file2);
                        }
                    }
                }
                arrayList = new ArrayList(c.l(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((File) it.next()).getName());
                }
            } else {
                arrayList = EmptyList.INSTANCE;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            arrayList = EmptyList.INSTANCE;
        }
        Regex regex3 = ul1.a;
        int iA2 = ul1.a(this.a);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("1", i);
        jSONObject.put("2", iA);
        int i3 = 1;
        jSONObject.put("3", i != iA);
        jSONObject.put("4", new JSONArray((Collection) arrayList));
        jSONObject.put("5", iA2);
        jSONObject.toString();
        Libv2ray.sp(Libv2ray.encrypt(jSONObject.toString()));
        Context context2 = this.a;
        try {
            PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 134217728);
            if (Build.VERSION.SDK_INT >= 28) {
                SigningInfo signingInfo = packageInfo.signingInfo;
                signingInfo.getClass();
                apkContentsSigners = signingInfo.getApkContentsSigners();
            } else {
                apkContentsSigners = packageInfo.signatures;
            }
            if (apkContentsSigners != null) {
                Iterator itA = a.a(apkContentsSigners);
                while (itA.hasNext()) {
                    Signature signature = (Signature) itA.next();
                    CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                    byte[] byteArray = signature.toByteArray();
                    byteArray.getClass();
                    Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(byteArray));
                    certificateGenerateCertificate.getClass();
                    X509Certificate x509Certificate = (X509Certificate) certificateGenerateCertificate;
                    byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(x509Certificate.getEncoded());
                    bArrDigest.getClass();
                    b.r(bArrDigest, ":", new z3(i2), 30);
                    byte[] bArrDigest2 = MessageDigest.getInstance("SHA-256").digest(x509Certificate.getEncoded());
                    bArrDigest2.getClass();
                    String strR = b.r(bArrDigest2, ":", new z3(i3), 30);
                    byte[] bArrDigest3 = MessageDigest.getInstance("MD5").digest(x509Certificate.getEncoded());
                    bArrDigest3.getClass();
                    b.r(bArrDigest3, ":", new z3(2), 30);
                    Libv2ray.so(strR);
                }
            }
        } catch (Exception unused2) {
        }
    }
}
