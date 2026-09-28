package defpackage;

import java.util.Iterator;
import junit.framework.JUnit4TestAdapterCache;
import junit.framework.Test;
import junit.framework.TestListener;
import junit.framework.TestResult;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class uh0 extends RunListener {
    public final /* synthetic */ TestResult a;
    public final /* synthetic */ JUnit4TestAdapterCache b;

    public uh0(JUnit4TestAdapterCache jUnit4TestAdapterCache, TestResult testResult) {
        this.b = jUnit4TestAdapterCache;
        this.a = testResult;
    }

    @Override // org.junit.runner.notification.RunListener
    public final void testFailure(Failure failure) {
        this.a.a(this.b.asTest(failure.getDescription()), failure.getException());
    }

    @Override // org.junit.runner.notification.RunListener
    public final void testFinished(Description description) {
        Test testAsTest = this.b.asTest(description);
        Iterator it = this.a.b().iterator();
        while (it.hasNext()) {
            ((TestListener) it.next()).endTest(testAsTest);
        }
    }

    @Override // org.junit.runner.notification.RunListener
    public final void testStarted(Description description) {
        this.a.d(this.b.asTest(description));
    }
}
