package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo;
import androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 extends DataSetObservable {
    public static final Object i = new Object();
    public static final HashMap j = new HashMap();
    public final Object a = new Object();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final Context d;
    public final String e;
    public boolean f;
    public boolean g;
    public boolean h;

    public p2(Context context, String str) {
        new jx2();
        this.f = true;
        this.g = false;
        this.h = true;
        this.d = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(".xml")) {
            this.e = str;
        } else {
            this.e = str.concat(".xml");
        }
    }

    public static p2 d(Context context, String str) {
        p2 p2Var;
        synchronized (i) {
            try {
                HashMap map = j;
                p2Var = (p2) map.get(str);
                if (p2Var == null) {
                    p2Var = new p2(context, str);
                    map.put(str, p2Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return p2Var;
    }

    public final void a(ActivityChooserModel$HistoricalRecord activityChooserModel$HistoricalRecord) {
        ArrayList arrayList = this.c;
        if (arrayList.add(activityChooserModel$HistoricalRecord)) {
            this.h = true;
            h();
            if (!this.g) {
                u7.p("No preceding call to #readHistoricalData");
                return;
            }
            if (this.h) {
                this.h = false;
                String str = this.e;
                if (!TextUtils.isEmpty(str)) {
                    new o2(this, 0).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(arrayList), str);
                }
            }
            notifyChanged();
        }
    }

    public final void b() {
        synchronized (this.a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() throws java.io.IOException {
        /*
            r9 = this;
            boolean r0 = r9.f
            r1 = 0
            if (r0 == 0) goto La2
            boolean r0 = r9.h
            if (r0 == 0) goto La2
            java.lang.String r0 = r9.e
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto La2
            r9.f = r1
            r2 = 1
            r9.g = r2
            android.content.Context r3 = r9.d     // Catch: java.lang.Throwable -> La1
            java.io.FileInputStream r0 = r3.openFileInput(r0)     // Catch: java.lang.Throwable -> La1
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
            java.lang.String r4 = "UTF-8"
            r3.setInput(r0, r4)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
        L25:
            if (r1 == r2) goto L31
            r4 = 2
            if (r1 == r4) goto L31
            int r1 = r3.next()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
            goto L25
        L2f:
            r9 = move-exception
            goto L95
        L31:
            java.lang.String r1 = "historical-records"
            java.lang.String r4 = r3.getName()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
            if (r1 == 0) goto L8d
            java.util.ArrayList r1 = r9.c     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
            r1.clear()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
        L42:
            int r4 = r3.next()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
            if (r4 != r2) goto L4e
            if (r0 == 0) goto La1
        L4a:
            r0.close()
            goto La1
        L4e:
            r5 = 3
            if (r4 == r5) goto L42
            r5 = 4
            if (r4 != r5) goto L55
            goto L42
        L55:
            java.lang.String r4 = r3.getName()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
            java.lang.String r5 = "historical-record"
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
            if (r4 == 0) goto L85
            java.lang.String r4 = "activity"
            r5 = 0
            java.lang.String r4 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
            java.lang.String r6 = "time"
            java.lang.String r6 = r3.getAttributeValue(r5, r6)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
            java.lang.String r8 = "weight"
            java.lang.String r5 = r3.getAttributeValue(r5, r8)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
            androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord r8 = new androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
            r8.<init>(r4, r6, r5)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
            r1.add(r8)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
            goto L42
        L85:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
            java.lang.String r3 = "Share records file not well-formed."
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
            throw r1     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
        L8d:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
            java.lang.String r3 = "Share records file does not start with historical-records tag."
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
            throw r1     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L9b org.xmlpull.v1.XmlPullParserException -> L9e
        L95:
            if (r0 == 0) goto L9a
            r0.close()     // Catch: java.io.IOException -> L9a
        L9a:
            throw r9
        L9b:
            if (r0 == 0) goto La1
            goto L4a
        L9e:
            if (r0 == 0) goto La1
            goto L4a
        La1:
            r1 = r2
        La2:
            r9.h()
            if (r1 == 0) goto Laa
            r9.notifyChanged()
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p2.c():void");
    }

    public final ResolveInfo e(int i2) {
        ResolveInfo resolveInfo;
        synchronized (this.a) {
            c();
            resolveInfo = ((ActivityChooserModel$ActivityResolveInfo) this.b.get(i2)).a;
        }
        return resolveInfo;
    }

    public final int f() {
        int size;
        synchronized (this.a) {
            c();
            size = this.b.size();
        }
        return size;
    }

    public final ResolveInfo g() {
        synchronized (this.a) {
            try {
                c();
                if (this.b.isEmpty()) {
                    return null;
                }
                return ((ActivityChooserModel$ActivityResolveInfo) this.b.get(0)).a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        ArrayList arrayList = this.c;
        int size = arrayList.size() - 50;
        if (size <= 0) {
            return;
        }
        this.h = true;
        for (int i2 = 0; i2 < size; i2++) {
        }
    }
}
