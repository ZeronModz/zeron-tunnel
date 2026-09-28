package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.google.firebase.a;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class uq {
    public int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;

    public uq(Context context, ConstraintLayout constraintLayout, int i) {
        String str;
        this.a = -1;
        this.b = -1;
        this.d = new SparseArray();
        this.e = new SparseArray();
        this.c = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            sq sqVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                e(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                sq sqVar2 = new sq(context, xml);
                                ((SparseArray) this.d).put(sqVar2.a, sqVar2);
                                sqVar = sqVar2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                tq tqVar = new tq(context, xml);
                                if (sqVar != null) {
                                    sqVar.b.add(tqVar);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public static String c(a aVar) {
        aVar.a();
        s60 s60Var = aVar.c;
        String str = s60Var.e;
        if (str != null) {
            return str;
        }
        aVar.a();
        String str2 = s60Var.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public synchronized String a() {
        try {
            if (((String) this.d) == null) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.d;
    }

    public synchronized String b() {
        try {
            if (((String) this.e) == null) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0045 A[Catch: all -> 0x0043, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:13:0x0020, B:15:0x0026, B:17:0x0038, B:19:0x003e, B:24:0x0045, B:26:0x0058, B:28:0x005e, B:31:0x0063, B:33:0x0069, B:34:0x006d), top: B:42:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.b     // Catch: java.lang.Throwable -> L43
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            monitor-exit(r5)
            goto L71
        La:
            java.lang.Object r0 = r5.c     // Catch: java.lang.Throwable -> L43
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L43
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r4 = "com.google.android.gms"
            int r3 = r0.checkPermission(r3, r4)     // Catch: java.lang.Throwable -> L43
            r4 = -1
            if (r3 != r4) goto L20
            monitor-exit(r5)
            r0 = r2
            goto L71
        L20:
            boolean r3 = defpackage.j03.n()     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L45
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L43
            java.util.List r3 = r0.queryIntentServices(r3, r2)     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L45
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L43
            if (r3 <= 0) goto L45
            r5.b = r1     // Catch: java.lang.Throwable -> L43
            monitor-exit(r5)
            r0 = r1
            goto L71
        L43:
            r0 = move-exception
            goto L75
        L45:
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L43
            java.util.List r0 = r0.queryBroadcastReceivers(r3, r2)     // Catch: java.lang.Throwable -> L43
            r3 = 2
            if (r0 == 0) goto L63
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L43
            if (r0 <= 0) goto L63
            r5.b = r3     // Catch: java.lang.Throwable -> L43
            monitor-exit(r5)
            r0 = r3
            goto L71
        L63:
            boolean r0 = defpackage.j03.n()     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L6d
            r5.b = r3     // Catch: java.lang.Throwable -> L43
            r0 = r3
            goto L70
        L6d:
            r5.b = r1     // Catch: java.lang.Throwable -> L43
            r0 = r1
        L70:
            monitor-exit(r5)
        L71:
            if (r0 == 0) goto L74
            return r1
        L74:
            return r2
        L75:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L43
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uq.d():boolean");
    }

    public void e(Context context, XmlResourceParser xmlResourceParser) {
        ConstraintSet constraintSet = new ConstraintSet();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                constraintSet.l(context, xmlResourceParser);
                ((SparseArray) this.e).put(identifier, constraintSet);
                return;
            }
        }
    }

    public synchronized void f() {
        PackageInfo packageInfo;
        try {
            packageInfo = ((Context) this.c).getPackageManager().getPackageInfo(((Context) this.c).getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.d = Integer.toString(packageInfo.versionCode);
            this.e = packageInfo.versionName;
        }
    }

    public uq(Context context) {
        this.b = 0;
        this.c = context;
    }
}
