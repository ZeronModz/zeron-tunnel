package defpackage;

import junit.extensions.ActiveTestSuite;
import junit.framework.Test;
import junit.framework.TestResult;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l2 extends Thread {
    public final /* synthetic */ Test a;
    public final /* synthetic */ TestResult b;
    public final /* synthetic */ ActiveTestSuite c;

    public l2(ActiveTestSuite activeTestSuite, Test test, TestResult testResult) {
        this.c = activeTestSuite;
        this.a = test;
        this.b = testResult;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ActiveTestSuite activeTestSuite = this.c;
        try {
            this.a.run(this.b);
            synchronized (activeTestSuite) {
                activeTestSuite.c++;
                activeTestSuite.notifyAll();
            }
        } catch (Throwable th) {
            activeTestSuite.d();
            throw th;
        }
    }
}
