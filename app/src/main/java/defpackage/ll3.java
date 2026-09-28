package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.d2;
import com.google.android.gms.internal.ads.w1;
import com.google.android.gms.internal.ads.x1;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbgj$zzq;
import com.google.android.gms.internal.ads.zzeii;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzgzl;
import com.google.android.gms.internal.ads.zzicg;
import com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener;
import java.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class ll3 implements ViewUtils$OnApplyWindowInsetsListener, zzgzl, zzfmu {
    public static final ll3 c = new ll3(true, null, null);
    public final boolean a;
    public final Object b;

    public ll3(uo2 uo2Var, boolean z) {
        this.a = z;
        Objects.requireNonNull(uo2Var);
        this.b = uo2Var;
    }

    public static ll3 b(String str) {
        return new ll3(false, str, null);
    }

    public static ll3 c(String str, Exception exc) {
        return new ll3(false, str, exc);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    @Override // com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View r12, androidx.core.view.WindowInsetsCompat r13, com.google.android.material.internal.ViewUtils$RelativePadding r14) {
        /*
            r11 = this;
            r0 = 519(0x207, float:7.27E-43)
            androidx.core.view.r r1 = r13.a
            og0 r0 = r1.g(r0)
            r1 = 32
            androidx.core.view.r r2 = r13.a
            og0 r1 = r2.g(r1)
            java.lang.Object r2 = r11.b
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            int r3 = r0.b
            int r4 = r0.c
            int r5 = r0.a
            r2.w = r3
            boolean r3 = defpackage.wo1.f(r12)
            int r6 = r12.getPaddingBottom()
            int r7 = r12.getPaddingLeft()
            int r8 = r12.getPaddingRight()
            boolean r9 = r2.o
            if (r9 == 0) goto L39
            int r6 = r13.a()
            r2.v = r6
            int r10 = r14.d
            int r6 = r6 + r10
        L39:
            boolean r10 = r2.p
            if (r10 == 0) goto L45
            if (r3 == 0) goto L42
            int r7 = r14.c
            goto L44
        L42:
            int r7 = r14.a
        L44:
            int r7 = r7 + r5
        L45:
            boolean r10 = r2.q
            if (r10 == 0) goto L52
            if (r3 == 0) goto L4e
            int r14 = r14.a
            goto L50
        L4e:
            int r14 = r14.c
        L50:
            int r8 = r14 + r4
        L52:
            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
            boolean r3 = r2.s
            r10 = 1
            if (r3 == 0) goto L65
            int r3 = r14.leftMargin
            if (r3 == r5) goto L65
            r14.leftMargin = r5
            r3 = r10
            goto L66
        L65:
            r3 = 0
        L66:
            boolean r5 = r2.t
            if (r5 == 0) goto L71
            int r5 = r14.rightMargin
            if (r5 == r4) goto L71
            r14.rightMargin = r4
            r3 = r10
        L71:
            boolean r4 = r2.u
            if (r4 == 0) goto L7e
            int r4 = r14.topMargin
            int r0 = r0.b
            if (r4 == r0) goto L7e
            r14.topMargin = r0
            goto L7f
        L7e:
            r10 = r3
        L7f:
            if (r10 == 0) goto L84
            r12.setLayoutParams(r14)
        L84:
            int r14 = r12.getPaddingTop()
            r12.setPadding(r7, r14, r8, r6)
            boolean r11 = r11.a
            if (r11 == 0) goto L93
            int r12 = r1.d
            r2.m = r12
        L93:
            if (r9 != 0) goto L99
            if (r11 == 0) goto L98
            goto L99
        L98:
            return r13
        L99:
            r2.N()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll3.onApplyWindowInsets(android.view.View, androidx.core.view.WindowInsetsCompat, com.google.android.material.internal.ViewUtils$RelativePadding):androidx.core.view.WindowInsetsCompat");
    }

    @Override // com.google.android.gms.internal.ads.zzfmu
    public Object zza(Object obj) {
        long j;
        zzeii zzeiiVar = (zzeii) this.b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (this.a) {
            zzeiiVar.b.deleteDatabase("OfflineUpload.db");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(w1.J(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (zzicg e) {
                zzo.zzf("Unable to deserialize proto from offline signals database:");
                zzo.zzf(e.getMessage());
            }
        }
        cursorQuery.close();
        Context context = zzeiiVar.b;
        f22 f22VarV = x1.v();
        String packageName = context.getPackageName();
        f22VarV.d();
        ((x1) f22VarV.b).E(packageName);
        String str = Build.MODEL;
        f22VarV.d();
        ((x1) f22VarV.b).F();
        int iG = ay2.G(sQLiteDatabase, 0);
        f22VarV.d();
        ((x1) f22VarV.b).B(iG);
        f22VarV.d();
        ((x1) f22VarV.b).A(arrayList);
        int iG2 = ay2.G(sQLiteDatabase, 1);
        f22VarV.d();
        ((x1) f22VarV.b).C(iG2);
        int iG3 = ay2.G(sQLiteDatabase, 3);
        f22VarV.d();
        ((x1) f22VarV.b).y(iG3);
        long jCurrentTimeMillis = zzt.zzk().currentTimeMillis();
        f22VarV.d();
        ((x1) f22VarV.b).D(jCurrentTimeMillis);
        Cursor cursorO = ay2.O(sQLiteDatabase, 2);
        if (cursorO.getCount() > 0) {
            cursorO.moveToNext();
            j = cursorO.getLong(cursorO.getColumnIndexOrThrow("value"));
        } else {
            j = 0;
        }
        cursorO.close();
        f22VarV.d();
        ((x1) f22VarV.b).x(j);
        x1 x1Var = (x1) f22VarV.e();
        int size = arrayList.size();
        long jZzb = 0;
        for (int i = 0; i < size; i++) {
            w1 w1Var = (w1) arrayList.get(i);
            if (w1Var.zzf() == zzbgj$zzq.ENUM_TRUE && w1Var.zzb() > jZzb) {
                jZzb = w1Var.zzb();
            }
        }
        if (jZzb != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jZzb));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        zzbgd zzbgdVar = zzeiiVar.a;
        synchronized (zzbgdVar) {
            if (zzbgdVar.c) {
                try {
                    g32 g32Var = zzbgdVar.b;
                    g32Var.d();
                    ((y2) g32Var.b).D(x1Var);
                } catch (NullPointerException e2) {
                    zzt.zzh().f("AdMobClearcutLogger.modify", e2);
                }
            }
        }
        VersionInfoParcel versionInfoParcel = zzeiiVar.d;
        l22 l22VarZ = d2.z();
        int i2 = versionInfoParcel.buddyApkVersion;
        l22VarZ.d();
        ((d2) l22VarZ.b).w(i2);
        int i3 = versionInfoParcel.clientJarVersion;
        l22VarZ.d();
        ((d2) l22VarZ.b).x(i3);
        int i4 = true != versionInfoParcel.isClientJar ? 2 : 0;
        l22VarZ.d();
        ((d2) l22VarZ.b).y(i4);
        zzbgdVar.a(new uh2((d2) l22VarZ.e(), 10));
        zzbgdVar.b(10004);
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        ay2.Q(sQLiteDatabase, "failed_requests");
        ay2.Q(sQLiteDatabase, "total_requests");
        ay2.Q(sQLiteDatabase, "completed_requests");
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo5zzb(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll3.mo5zzb(java.lang.Object):void");
    }

    public ll3(boolean z, String str, Exception exc) {
        this.a = z;
        this.b = exc;
    }

    public /* synthetic */ ll3(Object obj, boolean z) {
        this.a = z;
        this.b = obj;
    }

    public ll3() {
        this((Object) null, false);
    }

    public void a() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public void zza(Throwable th) {
        zzo.zzf("Failed to get signals bundle");
    }
}
