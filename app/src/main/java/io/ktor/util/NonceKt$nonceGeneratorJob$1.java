package io.ktor.util;

import defpackage.mk1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.util.NonceKt$nonceGeneratorJob$1", f = "Nonce.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {76}, m = "invokeSuspend", n = {"seedChannel", "previousRoundNonceList", "secureInstance", "weakRandom", "secureBytes", "weakBytes", "randomNonceList", "lastReseed", "index"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "I$0"})
final class NonceKt$nonceGeneratorJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    public NonceKt$nonceGeneratorJob$1(Continuation<? super NonceKt$nonceGeneratorJob$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new NonceKt$nonceGeneratorJob$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((NonceKt$nonceGeneratorJob$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Path cross not found for [B:68:0x005a, B:19:0x0063], limit reached: 76 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc A[Catch: all -> 0x003f, LOOP:1: B:37:0x00da->B:38:0x00dc, LOOP_END, TryCatch #4 {all -> 0x003f, blocks: (B:6:0x002e, B:48:0x014f, B:45:0x012e, B:49:0x0151, B:51:0x0160, B:36:0x00d1, B:38:0x00dc, B:39:0x00e5, B:41:0x00f1, B:43:0x0102, B:42:0x00ff), top: B:70:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1 A[Catch: all -> 0x003f, TryCatch #4 {all -> 0x003f, blocks: (B:6:0x002e, B:48:0x014f, B:45:0x012e, B:49:0x0151, B:51:0x0160, B:36:0x00d1, B:38:0x00dc, B:39:0x00e5, B:41:0x00f1, B:43:0x0102, B:42:0x00ff), top: B:70:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff A[Catch: all -> 0x003f, TryCatch #4 {all -> 0x003f, blocks: (B:6:0x002e, B:48:0x014f, B:45:0x012e, B:49:0x0151, B:51:0x0160, B:36:0x00d1, B:38:0x00dc, B:39:0x00e5, B:41:0x00f1, B:43:0x0102, B:42:0x00ff), top: B:70:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e A[Catch: all -> 0x003f, TryCatch #4 {all -> 0x003f, blocks: (B:6:0x002e, B:48:0x014f, B:45:0x012e, B:49:0x0151, B:51:0x0160, B:36:0x00d1, B:38:0x00dc, B:39:0x00e5, B:41:0x00f1, B:43:0x0102, B:42:0x00ff), top: B:70:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0151 A[Catch: all -> 0x003f, TryCatch #4 {all -> 0x003f, blocks: (B:6:0x002e, B:48:0x014f, B:45:0x012e, B:49:0x0151, B:51:0x0160, B:36:0x00d1, B:38:0x00dc, B:39:0x00e5, B:41:0x00f1, B:43:0x0102, B:42:0x00ff), top: B:70:0x002e }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x014c -> B:48:0x014f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.NonceKt$nonceGeneratorJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
