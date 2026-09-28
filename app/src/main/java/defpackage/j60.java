package defpackage;

import android.content.SharedPreferences;
import androidx.activity.FullyDrawnReporter;
import androidx.camera.core.ImageProxy;
import androidx.camera.lifecycle.b;
import androidx.fragment.app.strictmode.Violation;
import androidx.room.InvalidationTracker;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j60(String str, Violation violation) {
        this.a = 2;
        this.b = violation;
    }

    private final void a() {
        FullyDrawnReporter fullyDrawnReporter = (FullyDrawnReporter) this.b;
        synchronized (fullyDrawnReporter.c) {
            fullyDrawnReporter.e = false;
            if (fullyDrawnReporter.d == 0 && !fullyDrawnReporter.f) {
                fullyDrawnReporter.b.invoke();
                fullyDrawnReporter.a();
            }
        }
    }

    private final void b() {
        cf0 cf0Var = (cf0) this.b;
        synchronized (cf0Var.u) {
            try {
                cf0Var.w = null;
                ImageProxy imageProxy = cf0Var.v;
                if (imageProxy != null) {
                    cf0Var.v = null;
                    cf0Var.e(imageProxy);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        InvalidationTracker invalidationTracker = (InvalidationTracker) this.b;
        InvalidationTracker.Companion companion = InvalidationTracker.p;
        synchronized (invalidationTracker.n) {
            invalidationTracker.h = false;
            invalidationTracker.j.d();
            SupportSQLiteStatement supportSQLiteStatement = invalidationTracker.i;
            if (supportSQLiteStatement != null) {
                supportSQLiteStatement.close();
            }
        }
    }

    private final void d() {
        b bVar = (b) this.b;
        bVar.getClass();
        bVar.unbindAll();
        dk0 dk0Var = bVar.d;
        synchronized (dk0Var.a) {
            try {
                Iterator it = new HashSet(dk0Var.c.keySet()).iterator();
                while (it.hasNext()) {
                    dk0Var.l(((ck0) it.next()).b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void e() {
        tj1 tj1Var = (tj1) this.b;
        synchronized (((ArrayDeque) tj1Var.c)) {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) tj1Var.b).edit();
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayDeque) tj1Var.c).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(",");
            }
            editorEdit.putString("topic_operation_queue", sb.toString()).commit();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x022f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j60.run():void");
    }

    public /* synthetic */ j60(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
