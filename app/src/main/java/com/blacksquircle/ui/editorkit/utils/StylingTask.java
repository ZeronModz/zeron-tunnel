package com.blacksquircle.ui.editorkit.utils;

import android.os.Handler;
import android.os.Looper;
import com.blacksquircle.ui.language.base.model.SyntaxHighlightResult;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import defpackage.xu;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000bB5\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/blacksquircle/ui/editorkit/utils/StylingTask;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lkotlin/Function0;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcom/blacksquircle/ui/language/base/model/SyntaxHighlightResult;", "doAsync", "Lkotlin/Function1;", "Lmk1;", "onSuccess", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Companion", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StylingTask {
    public static final /* synthetic */ int e = 0;
    public final Function0 a;
    public final Function1 b;
    public final Handler c;
    public final ExecutorService d;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/editorkit/utils/StylingTask$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "TAG", "Ljava/lang/String;", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    public StylingTask(Function0<? extends List<SyntaxHighlightResult>> function0, Function1<? super List<SyntaxHighlightResult>, mk1> function1) {
        function0.getClass();
        function1.getClass();
        this.a = function0;
        this.b = function1;
        this.c = new Handler(Looper.getMainLooper());
        this.d = Executors.newSingleThreadExecutor();
    }
}
