package io.github.g00fy2.quickie.extensions;

import android.graphics.Bitmap;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.RGBLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import defpackage.mk1;
import defpackage.u7;
import defpackage.vh;
import defpackage.xm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 1, 0})
@DebugMetadata(c = "io.github.g00fy2.quickie.extensions.BitmapQrReaderKt$readQrCode$1", f = "BitmapQrReader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class BitmapQrReaderKt$readQrCode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ int[] $barcodeFormats;
    final /* synthetic */ Function1<Throwable, mk1> $onFailure;
    final /* synthetic */ Function1<String, mk1> $onSuccess;
    final /* synthetic */ Bitmap $this_readQrCode;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BitmapQrReaderKt$readQrCode$1(int[] iArr, Bitmap bitmap, Function1<? super String, mk1> function1, Function1<? super Throwable, mk1> function12, Continuation<? super BitmapQrReaderKt$readQrCode$1> continuation) {
        super(2, continuation);
        this.$barcodeFormats = iArr;
        this.$this_readQrCode = bitmap;
        this.$onSuccess = function1;
        this.$onFailure = function12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        BitmapQrReaderKt$readQrCode$1 bitmapQrReaderKt$readQrCode$1 = new BitmapQrReaderKt$readQrCode$1(this.$barcodeFormats, this.$this_readQrCode, this.$onSuccess, this.$onFailure, continuation);
        bitmapQrReaderKt$readQrCode$1.L$0 = obj;
        return bitmapQrReaderKt$readQrCode$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((BitmapQrReaderKt$readQrCode$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objD;
        Object objD2;
        mk1 mk1Var = mk1.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d.b(obj);
        MultiFormatReader multiFormatReader = new MultiFormatReader();
        int[] iArr = this.$barcodeFormats;
        Pair pair = new Pair(DecodeHintType.CHARACTER_SET, xm.a);
        Pair pair2 = new Pair(DecodeHintType.TRY_HARDER, Boolean.TRUE);
        DecodeHintType decodeHintType = DecodeHintType.POSSIBLE_FORMATS;
        List listV = b.v(iArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = listV.iterator();
        while (it.hasNext()) {
            BarcodeFormat value = io.github.g00fy2.quickie.config.BarcodeFormat.getEntries().get(((Number) it.next()).intValue()).getValue();
            if (value != null) {
                arrayList.add(value);
            }
        }
        Pair pair3 = new Pair(decodeHintType, arrayList);
        multiFormatReader.b(kotlin.collections.d.e(pair, pair2, pair3));
        Bitmap bitmap = this.$this_readQrCode;
        Function1<String, mk1> function1 = this.$onSuccess;
        try {
            Result.Companion companion = Result.INSTANCE;
            int[] iArr2 = new int[bitmap.getWidth() * bitmap.getHeight()];
            bitmap.getPixels(iArr2, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
            String str = multiFormatReader.decode(new BinaryBitmap(new HybridBinarizer(new RGBLuminanceSource(bitmap.getWidth(), bitmap.getHeight(), iArr2)))).a;
            str.getClass();
            function1.invoke(str);
            objD = Result.m36constructorimpl(mk1Var);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objD = vh.d(th);
        }
        Function1<Throwable, mk1> function12 = this.$onFailure;
        Bitmap bitmap2 = this.$this_readQrCode;
        Function1<String, mk1> function13 = this.$onSuccess;
        Throwable thM39exceptionOrNullimpl = Result.m39exceptionOrNullimpl(objD);
        if (thM39exceptionOrNullimpl != null) {
            if (thM39exceptionOrNullimpl instanceof NotFoundException) {
                int width = bitmap2.getWidth() * bitmap2.getHeight();
                int[] iArr3 = new int[width];
                bitmap2.getPixels(iArr3, 0, bitmap2.getWidth(), 0, 0, bitmap2.getWidth(), bitmap2.getHeight());
                for (int i = 0; i < width; i++) {
                    iArr3[i] = ~iArr3[i];
                }
                RGBLuminanceSource rGBLuminanceSource = new RGBLuminanceSource(bitmap2.getWidth(), bitmap2.getHeight(), iArr3);
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    objD2 = Result.m36constructorimpl(multiFormatReader.decode(new BinaryBitmap(new HybridBinarizer(rGBLuminanceSource))));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    objD2 = vh.d(th2);
                }
                Throwable thM39exceptionOrNullimpl2 = Result.m39exceptionOrNullimpl(objD2);
                if (thM39exceptionOrNullimpl2 != null) {
                    function12.invoke(thM39exceptionOrNullimpl2);
                }
                com.google.zxing.Result result = (com.google.zxing.Result) (Result.m42isFailureimpl(objD2) ? null : objD2);
                if (result == null) {
                    return mk1Var;
                }
                String str2 = result.a;
                str2.getClass();
                function13.invoke(str2);
            } else {
                function12.invoke(thM39exceptionOrNullimpl);
            }
        }
        return mk1Var;
    }
}
