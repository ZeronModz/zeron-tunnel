package com.blacksquircle.ui.editorkit.plugin.linenumbers;

import defpackage.mk1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/blacksquircle/ui/editorkit/plugin/linenumbers/LineNumbersPlugin;", "Lmk1;", "invoke", "(Lcom/blacksquircle/ui/editorkit/plugin/linenumbers/LineNumbersPlugin;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
final class ActionsKt$lineNumbers$1 extends Lambda implements Function1<LineNumbersPlugin, mk1> {
    public static final ActionsKt$lineNumbers$1 INSTANCE = new ActionsKt$lineNumbers$1();

    public ActionsKt$lineNumbers$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ mk1 invoke(LineNumbersPlugin lineNumbersPlugin) {
        invoke2(lineNumbersPlugin);
        return mk1.a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LineNumbersPlugin lineNumbersPlugin) {
        lineNumbersPlugin.getClass();
    }
}
