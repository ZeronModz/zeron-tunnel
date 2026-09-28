package io.ktor.client.request.forms;

import defpackage.mk1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.io.Buffer;
import kotlinx.io.Sink;
import kotlinx.io.Source;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
public final class FormDslKt$append$1 implements Function0<Source> {
    public final /* synthetic */ Function1 a;

    public FormDslKt$append$1(Function1<? super Sink, mk1> function1) {
        this.a = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Source invoke() {
        Buffer buffer = new Buffer();
        this.a.invoke(buffer);
        return buffer;
    }
}
