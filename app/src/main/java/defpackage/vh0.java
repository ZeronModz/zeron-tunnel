package defpackage;

import junit.framework.Test;
import junit.framework.TestResult;
import org.junit.runner.Describable;
import org.junit.runner.Description;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class vh0 implements Test, Describable {
    public final Description a;

    public vh0(Description description) {
        this.a = description;
    }

    @Override // junit.framework.Test
    public final int countTestCases() {
        return 1;
    }

    @Override // org.junit.runner.Describable
    public final Description getDescription() {
        return this.a;
    }

    @Override // junit.framework.Test
    public final void run(TestResult testResult) {
        throw new RuntimeException("This test stub created only for informational purposes.");
    }

    public final String toString() {
        return this.a.toString();
    }
}
