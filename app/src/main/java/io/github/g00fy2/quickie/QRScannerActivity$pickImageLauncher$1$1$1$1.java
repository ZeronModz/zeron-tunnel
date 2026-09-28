package io.github.g00fy2.quickie;

import defpackage.mk1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public /* synthetic */ class QRScannerActivity$pickImageLauncher$1$1$1$1 extends FunctionReferenceImpl implements Function1<String, mk1> {
    public QRScannerActivity$pickImageLauncher$1$1$1$1(Object obj) {
        super(1, obj, QRScannerActivity.class, "onSuccess", "onSuccess(Ljava/lang/String;)V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        str.getClass();
        QRScannerActivity qRScannerActivity = (QRScannerActivity) this.receiver;
        int i = QRScannerActivity.j;
        qRScannerActivity.h(str);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ mk1 invoke(String str) {
        invoke2(str);
        return mk1.a;
    }
}
