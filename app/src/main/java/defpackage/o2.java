package defpackage;

import android.os.AsyncTask;
import com.google.android.gms.ads.internal.zzs;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 extends AsyncTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r14) {
        /*
            r13 = this;
            int r0 = r13.a
            java.lang.Object r13 = r13.b
            switch(r0) {
                case 0: goto L10;
                default: goto L7;
            }
        L7:
            java.lang.Void[] r14 = (java.lang.Void[]) r14
            com.google.android.gms.ads.internal.zzs r13 = (com.google.android.gms.ads.internal.zzs) r13
            java.lang.String r13 = r13.zzN()
            return r13
        L10:
            java.lang.String r0 = "historical-record"
            java.lang.String r1 = "historical-records"
            p2 r13 = (defpackage.p2) r13
            r2 = 0
            r3 = r14[r2]
            java.util.List r3 = (java.util.List) r3
            r4 = 1
            r14 = r14[r4]
            java.lang.String r14 = (java.lang.String) r14
            r5 = 0
            android.content.Context r6 = r13.d     // Catch: java.io.FileNotFoundException -> L9c
            java.io.FileOutputStream r14 = r6.openFileOutput(r14, r2)     // Catch: java.io.FileNotFoundException -> L9c
            org.xmlpull.v1.XmlSerializer r6 = android.util.Xml.newSerializer()
            r6.setOutput(r14, r5)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f java.lang.IllegalStateException -> L86 java.lang.IllegalArgumentException -> L8d
            java.lang.String r7 = "UTF-8"
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f java.lang.IllegalStateException -> L86 java.lang.IllegalArgumentException -> L8d
            r6.startDocument(r7, r8)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f java.lang.IllegalStateException -> L86 java.lang.IllegalArgumentException -> L8d
            r6.startTag(r5, r1)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f java.lang.IllegalStateException -> L86 java.lang.IllegalArgumentException -> L8d
            int r7 = r3.size()     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f java.lang.IllegalStateException -> L86 java.lang.IllegalArgumentException -> L8d
            r8 = r2
        L3d:
            if (r8 >= r7) goto L71
            java.lang.Object r9 = r3.remove(r2)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f java.lang.IllegalStateException -> L86 java.lang.IllegalArgumentException -> L8d
            androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord r9 = (androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord) r9     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f java.lang.IllegalStateException -> L86 java.lang.IllegalArgumentException -> L8d
            r6.startTag(r5, r0)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f java.lang.IllegalStateException -> L86 java.lang.IllegalArgumentException -> L8d
            java.lang.String r10 = "activity"
            android.content.ComponentName r11 = r9.a     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f java.lang.IllegalStateException -> L86 java.lang.IllegalArgumentException -> L8d
            java.lang.String r11 = r11.flattenToString()     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f java.lang.IllegalStateException -> L86 java.lang.IllegalArgumentException -> L8d
            r6.attribute(r5, r10, r11)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f java.lang.IllegalStateException -> L86 java.lang.IllegalArgumentException -> L8d
            java.lang.String r10 = "time"
            long r11 = r9.b     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f java.lang.IllegalStateException -> L86 java.lang.IllegalArgumentException -> L8d
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f java.lang.IllegalStateException -> L86 java.lang.IllegalArgumentException -> L8d
            r6.attribute(r5, r10, r11)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f java.lang.IllegalStateException -> L86 java.lang.IllegalArgumentException -> L8d
            java.lang.String r10 = "weight"
            float r9 = r9.c     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f java.lang.IllegalStateException -> L86 java.lang.IllegalArgumentException -> L8d
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f java.lang.IllegalStateException -> L86 java.lang.IllegalArgumentException -> L8d
            r6.attribute(r5, r10, r9)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f java.lang.IllegalStateException -> L86 java.lang.IllegalArgumentException -> L8d
            r6.endTag(r5, r0)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f java.lang.IllegalStateException -> L86 java.lang.IllegalArgumentException -> L8d
            int r8 = r8 + 1
            goto L3d
        L6f:
            r0 = move-exception
            goto L94
        L71:
            r6.endTag(r5, r1)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f java.lang.IllegalStateException -> L86 java.lang.IllegalArgumentException -> L8d
            r6.endDocument()     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L7f java.lang.IllegalStateException -> L86 java.lang.IllegalArgumentException -> L8d
            r13.f = r4
            if (r14 == 0) goto L9e
        L7b:
            r14.close()     // Catch: java.io.IOException -> L9e
            goto L9e
        L7f:
            java.lang.Object r0 = defpackage.p2.i     // Catch: java.lang.Throwable -> L6f
            r13.f = r4
            if (r14 == 0) goto L9e
            goto L7b
        L86:
            java.lang.Object r0 = defpackage.p2.i     // Catch: java.lang.Throwable -> L6f
            r13.f = r4
            if (r14 == 0) goto L9e
            goto L7b
        L8d:
            java.lang.Object r0 = defpackage.p2.i     // Catch: java.lang.Throwable -> L6f
            r13.f = r4
            if (r14 == 0) goto L9e
            goto L7b
        L94:
            r13.f = r4
            if (r14 == 0) goto L9b
            r14.close()     // Catch: java.io.IOException -> L9b
        L9b:
            throw r0
        L9c:
            java.lang.Object r13 = defpackage.p2.i
        L9e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o2.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        switch (this.a) {
            case 1:
                zzs zzsVar = (zzs) this.b;
                String str = (String) obj;
                if (zzsVar.zzW() != null && str != null) {
                    zzsVar.zzW().loadUrl(str);
                    break;
                }
                break;
            default:
                super.onPostExecute(obj);
                break;
        }
    }
}
