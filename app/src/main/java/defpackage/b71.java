package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.b;
import com.google.android.gms.tasks.g;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.FirebaseInstallationId;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.RolloutAssignment;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.b0;
import com.google.firebase.crashlytics.internal.model.c0;
import com.google.firebase.crashlytics.internal.model.h0;
import com.google.firebase.crashlytics.internal.model.o1;
import com.google.firebase.crashlytics.internal.model.p1;
import com.google.firebase.crashlytics.internal.model.q1;
import com.google.firebase.crashlytics.internal.model.s1;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.model.u0;
import com.google.firebase.crashlytics.internal.model.u1;
import com.google.firebase.crashlytics.internal.model.v0;
import com.google.firebase.crashlytics.internal.model.v1;
import com.google.firebase.crashlytics.internal.model.w0;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.d;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy;
import com.trilead.ssh2.sftp.AttribFlags;
import java.util.DesugarCollections;
import java.util.Objects;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b71 {
    public final CrashlyticsReportDataCapture a;
    public final CrashlyticsReportPersistence b;
    public final eu c;
    public final LogFileManager d;
    public final UserMetadata e;
    public final IdManager f;

    public b71(CrashlyticsReportDataCapture crashlyticsReportDataCapture, CrashlyticsReportPersistence crashlyticsReportPersistence, eu euVar, LogFileManager logFileManager, UserMetadata userMetadata, IdManager idManager, CrashlyticsWorkers crashlyticsWorkers) {
        this.a = crashlyticsReportDataCapture;
        this.b = crashlyticsReportPersistence;
        this.c = euVar;
        this.d = logFileManager;
        this.e = userMetadata;
        this.f = idManager;
    }

    public static CrashlyticsReport.Session.Event a(v0 v0Var, LogFileManager logFileManager, UserMetadata userMetadata, Map map) {
        u0 u0VarG = v0Var.g();
        String strC = logFileManager.c();
        if (strC != null) {
            new o1().a = strC;
            u0VarG.e = new p1(strC);
        } else {
            Logger.b.a(2);
        }
        List listE = e(userMetadata.a(map));
        List listE2 = e(userMetadata.b());
        if (!listE.isEmpty() || !listE2.isEmpty()) {
            w0 w0VarH = v0Var.c.h();
            w0VarH.b = listE;
            w0VarH.c = listE2;
            u0VarG.c = w0VarH.a();
        }
        return u0VarG.a();
    }

    public static CrashlyticsReport.Session.Event b(CrashlyticsReport.Session.Event event, UserMetadata userMetadata) {
        List listA = userMetadata.f.a();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listA.size(); i++) {
            RolloutAssignment rolloutAssignment = (RolloutAssignment) listA.get(i);
            rolloutAssignment.getClass();
            q1 q1Var = new q1();
            s1 s1Var = new s1();
            String strE = rolloutAssignment.e();
            if (strE == null) {
                io0.e("Null variantId");
                return null;
            }
            s1Var.b = strE;
            String strC = rolloutAssignment.c();
            if (strC == null) {
                io0.e("Null rolloutId");
                return null;
            }
            s1Var.a = strC;
            q1Var.a = s1Var.a();
            String strA = rolloutAssignment.a();
            if (strA == null) {
                io0.e("Null parameterKey");
                return null;
            }
            q1Var.b = strA;
            String strB = rolloutAssignment.b();
            if (strB == null) {
                io0.e("Null parameterValue");
                return null;
            }
            q1Var.c = strB;
            q1Var.d = rolloutAssignment.d();
            q1Var.e = (byte) (q1Var.e | 1);
            arrayList.add(q1Var.a());
        }
        if (arrayList.isEmpty()) {
            return event;
        }
        u0 u0VarG = event.g();
        new u1().a = arrayList;
        u0VarG.f = new v1(arrayList);
        return u0VarG.a();
    }

    public static String c(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bArr = new byte[AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT];
            } finally {
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        while (true) {
            int i = bufferedInputStream.read(bArr);
            if (i == -1) {
                String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                byteArrayOutputStream.close();
                bufferedInputStream.close();
                return string;
            }
            byteArrayOutputStream.write(bArr, 0, i);
            bufferedInputStream.close();
            throw th;
        }
    }

    public static b71 d(Context context, IdManager idManager, FileStore fileStore, AppData appData, LogFileManager logFileManager, UserMetadata userMetadata, MiddleOutFallbackStrategy middleOutFallbackStrategy, d dVar, OnDemandCounter onDemandCounter, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, CrashlyticsWorkers crashlyticsWorkers) {
        CrashlyticsReportDataCapture crashlyticsReportDataCapture = new CrashlyticsReportDataCapture(context, idManager, appData, middleOutFallbackStrategy, dVar);
        CrashlyticsReportPersistence crashlyticsReportPersistence = new CrashlyticsReportPersistence(fileStore, dVar, crashlyticsAppQualitySessionsSubscriber);
        CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = eu.c;
        com.google.android.datatransport.runtime.d.b(context);
        pg1 pg1VarC = com.google.android.datatransport.runtime.d.a().c(new CCTDestination(eu.d, eu.e));
        n20 n20Var = new n20("json");
        oq oqVar = eu.f;
        return new b71(crashlyticsReportDataCapture, crashlyticsReportPersistence, new eu(new g31(pg1VarC.getTransport("FIREBASE_CRASHLYTICS_REPORT", CrashlyticsReport.class, n20Var, oqVar), dVar.getSettingsSync(), onDemandCounter), oqVar), logFileManager, userMetadata, idManager, crashlyticsWorkers);
    }

    public static List e(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            h0 h0Var = new h0();
            String str = (String) entry.getKey();
            if (str == null) {
                io0.e("Null key");
                return null;
            }
            h0Var.a = str;
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                io0.e("Null value");
                return null;
            }
            h0Var.b = str2;
            arrayList.add(h0Var.a());
        }
        Collections.sort(arrayList, new es(6));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final g f(String str, Executor executor) {
        CrashlyticsReportWithSessionId yaVar;
        TaskCompletionSource taskCompletionSource;
        ArrayList<File> arrayListB = this.b.b();
        ArrayList<CrashlyticsReportWithSessionId> arrayList = new ArrayList();
        for (File file : arrayListB) {
            try {
                CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = CrashlyticsReportPersistence.g;
                String strE = CrashlyticsReportPersistence.e(file);
                crashlyticsReportJsonTransform.getClass();
                arrayList.add(new ya(CrashlyticsReportJsonTransform.i(strE), file.getName(), file));
            } catch (IOException unused) {
                Logger logger = Logger.b;
                Objects.toString(file);
                logger.a(5);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (CrashlyticsReportWithSessionId crashlyticsReportWithSessionId : arrayList) {
            if (str == null || str.equals(crashlyticsReportWithSessionId.c())) {
                eu euVar = this.c;
                if (crashlyticsReportWithSessionId.a().f() == null || crashlyticsReportWithSessionId.a().e() == null) {
                    FirebaseInstallationId firebaseInstallationIdB = this.f.b(true);
                    CrashlyticsReport crashlyticsReportA = crashlyticsReportWithSessionId.a();
                    String str2 = firebaseInstallationIdB.a;
                    b0 b0VarM = crashlyticsReportA.m();
                    b0VarM.e = str2;
                    c0 c0VarA = b0VarM.a();
                    String str3 = firebaseInstallationIdB.b;
                    b0 b0VarM2 = c0VarA.m();
                    b0VarM2.f = str3;
                    yaVar = new ya(b0VarM2.a(), crashlyticsReportWithSessionId.c(), crashlyticsReportWithSessionId.b());
                } else {
                    yaVar = crashlyticsReportWithSessionId;
                }
                boolean z = str != null;
                g31 g31Var = euVar.a;
                synchronized (g31Var.f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z) {
                            g31Var.i.a.getAndIncrement();
                            if (g31Var.f.size() < g31Var.e) {
                                Logger logger2 = Logger.b;
                                logger2.a(3);
                                g31Var.f.size();
                                logger2.a(3);
                                g31Var.g.execute(new wq(g31Var, yaVar, taskCompletionSource, 1, false));
                                logger2.a(3);
                                taskCompletionSource.d(yaVar);
                            } else {
                                g31Var.a();
                                Logger.b.a(3);
                                g31Var.i.b.getAndIncrement();
                                taskCompletionSource.d(yaVar);
                            }
                        } else {
                            g31Var.b(yaVar, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.a.f(executor, new s31(this)));
            }
        }
        return b.f(arrayList2);
    }
}
