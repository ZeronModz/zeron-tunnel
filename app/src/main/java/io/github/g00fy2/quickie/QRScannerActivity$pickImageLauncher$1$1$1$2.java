package io.github.g00fy2.quickie;

import defpackage.mk1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public /* synthetic */ class QRScannerActivity$pickImageLauncher$1$1$1$2 extends FunctionReferenceImpl implements Function1<Throwable, mk1> {
    public QRScannerActivity$pickImageLauncher$1$1$1$2(Object obj) {
        super(1, obj, QRScannerActivity.class, "onFailure", "onFailure(Ljava/lang/Throwable;)V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        th.getClass();
        QRScannerActivity qRScannerActivity = (QRScannerActivity) this.receiver;
        int i = QRScannerActivity.j;
        qRScannerActivity.g(th);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ mk1 invoke(Throwable th) {
        invoke2(th);
        return mk1.a;
    }
}
