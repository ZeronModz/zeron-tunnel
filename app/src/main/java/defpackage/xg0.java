package defpackage;

import android.R;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Bundle;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.datastore.preferences.protobuf.DescriptorProtos$Edition;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzaz;
import com.google.android.gms.internal.ads.a9;
import com.google.android.gms.internal.ads.m7;
import com.google.android.gms.internal.ads.z8;
import com.google.android.gms.internal.ads.zzat;
import com.google.android.gms.internal.ads.zzday;
import com.google.android.gms.internal.ads.zzecr;
import com.google.android.gms.internal.ads.zzekk;
import com.google.android.gms.internal.ads.zzekl;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzhqb;
import com.google.android.gms.internal.ads.zzicg;
import com.google.common.util.concurrent.ListenableFuture;
import com.trilead.ssh2.sftp.AttribFlags;
import io.ktor.client.engine.okhttp.b;
import io.ktor.utils.io.ByteWriteChannel;
import java.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import kotlin.collections.EmptyList;
import kotlin.collections.c;
import kotlin.collections.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.g;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Delay;
import kotlinx.io.Buffer;
import kotlinx.io.Segment;
import kotlinx.io.Sink;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import org.slf4j.Marker;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xg0 {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] e = {R.attr.drawable};
    public static final int[] f = {R.attr.name, R.attr.animation};
    public static final int[] g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};
    public static final int[] h = {R.attr.ordering};
    public static final int[] i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};
    public static final int[] j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};
    public static final int[] k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};
    public static final int[] l = {R.attr.controlX1, R.attr.controlY1, R.attr.controlX2, R.attr.controlY2, R.attr.pathData};
    public static final int[] m = {2002, 2000, 1920, 1601, 1600, DescriptorProtos$Edition.EDITION_2024_VALUE, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final String[] n = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};
    public static final String[] o = {"ad_impression"};
    public static final String[] p = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};
    public static final String[] q = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    public static boolean A(String str, String str2) {
        if (!g.o(str2, Marker.ANY_MARKER, false)) {
            return false;
        }
        if (str2.equals(Marker.ANY_MARKER)) {
            return true;
        }
        if (g.z(str2, Marker.ANY_MARKER, 0, false, 6) == g.D(6, str2, Marker.ANY_MARKER) && g.u(str2, Marker.ANY_MARKER, false)) {
            return g.R(str, str2.substring(0, str2.length() - 1), false);
        }
        u7.r("Name pattern with a wildcard must only contain a single wildcard in the end");
        return false;
    }

    public static Object B(ByteWriteChannel byteWriteChannel, b bVar, Continuation continuation) {
        Buffer buffer = byteWriteChannel.getWriteBuffer().getC();
        Segment segmentE = buffer.e(1);
        byte[] bArr = segmentE.a;
        int i2 = segmentE.c;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i2, bArr.length - i2);
        byteBufferWrap.getClass();
        bVar.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i2;
        if (iPosition == 1) {
            segmentE.c += iPosition;
            buffer.c += (long) iPosition;
        } else {
            if (iPosition < 0 || iPosition > segmentE.a()) {
                u7.n(segmentE.a(), vh.v(iPosition, "Invalid number of bytes written: ", ". Should be in 0.."));
                return null;
            }
            if (iPosition != 0) {
                segmentE.c += iPosition;
                buffer.c += (long) iPosition;
            } else if (dn0.v(segmentE)) {
                buffer.c();
            }
        }
        Object objFlush = byteWriteChannel.flush(continuation);
        return objFlush == CoroutineSingletons.COROUTINE_SUSPENDED ? objFlush : mk1.a;
    }

    public static final Object C(ByteWriteChannel byteWriteChannel, ByteBuffer byteBuffer, ContinuationImpl continuationImpl) {
        Sink writeBuffer = byteWriteChannel.getWriteBuffer();
        writeBuffer.getClass();
        byteBuffer.getClass();
        long j2 = writeBuffer.getC().c;
        l02.K(writeBuffer.getC(), byteBuffer);
        long j3 = writeBuffer.getC().c;
        writeBuffer.hintEmit();
        Object objFlush = byteWriteChannel.flush(continuationImpl);
        return objFlush == CoroutineSingletons.COROUTINE_SUSPENDED ? objFlush : mk1.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            kotlin.coroutines.CoroutineContext r0 = r7.getB()
            kotlinx.coroutines.g.d(r0)
            kotlin.coroutines.Continuation r7 = kotlin.coroutines.intrinsics.a.c(r7)
            boolean r1 = r7 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r1 == 0) goto L12
            kotlinx.coroutines.internal.DispatchedContinuation r7 = (kotlinx.coroutines.internal.DispatchedContinuation) r7
            goto L13
        L12:
            r7 = 0
        L13:
            mk1 r1 = defpackage.mk1.a
            if (r7 != 0) goto L19
        L17:
            r7 = r1
            goto L80
        L19:
            kotlinx.coroutines.CoroutineDispatcher r2 = r7.d
            boolean r3 = defpackage.ly.c(r2, r0)
            r4 = 1
            if (r3 == 0) goto L2a
            r7.f = r1
            r7.c = r4
            r2.b(r0, r7)
            goto L7e
        L2a:
            kotlinx.coroutines.YieldContext r3 = new kotlinx.coroutines.YieldContext
            r3.<init>()
            kotlin.coroutines.CoroutineContext r0 = r0.plus(r3)
            r7.f = r1
            r7.c = r4
            r2.b(r0, r7)
            boolean r0 = r3.b
            if (r0 == 0) goto L7e
            kotlinx.coroutines.EventLoop r0 = defpackage.me1.a()
            kotlin.collections.ArrayDeque r2 = r0.e
            if (r2 == 0) goto L4b
            boolean r2 = r2.isEmpty()
            goto L4c
        L4b:
            r2 = r4
        L4c:
            if (r2 == 0) goto L4f
            goto L17
        L4f:
            long r2 = r0.c
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L64
            r7.f = r1
            r7.c = r4
            r0.f(r7)
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            goto L80
        L64:
            r0.g(r4)
            r7.run()     // Catch: java.lang.Throwable -> L74
        L6a:
            boolean r2 = r0.i()     // Catch: java.lang.Throwable -> L74
            if (r2 != 0) goto L6a
        L70:
            r0.e(r4)
            goto L17
        L74:
            r2 = move-exception
            r7.e(r2)     // Catch: java.lang.Throwable -> L79
            goto L70
        L79:
            r7 = move-exception
            r0.e(r4)
            throw r7
        L7e:
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
        L80:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r7 != r0) goto L85
            return r7
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg0.D(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static zze E(Throwable th) {
        if (th instanceof zzekk) {
            zzekk zzekkVar = (zzekk) th;
            return N(zzekkVar.zza(), zzekkVar.zzb());
        }
        if (th instanceof zzecr) {
            return th.getMessage() == null ? P(((zzecr) th).zza(), null, null) : P(((zzecr) th).zza(), th.getMessage(), null);
        }
        if (!(th instanceof zzaz)) {
            return P(1, null, null);
        }
        zzaz zzazVar = (zzaz) th;
        int iZza = zzazVar.zza();
        String message = zzazVar.getMessage();
        if (message == null) {
            message = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return new zze(iZza, message, MobileAds.ERROR_DOMAIN, null, null);
    }

    public static /* synthetic */ String F(int i2) {
        switch (i2) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }

    public static g43 G(String str) {
        try {
            try {
                byte[] bArrA = new m7(new ByteArrayInputStream(str.getBytes(m7.b))).zzb().a();
                try {
                    gd3 gd3Var = gd3.b;
                    int i2 = wc3.a;
                    a9 a9VarZ = a9.z(bArrA, gd3.c);
                    for (z8 z8Var : a9VarZ.w()) {
                        if (z8Var.v().x() == zzhqb.UNKNOWN_KEYMATERIAL || z8Var.v().x() == zzhqb.SYMMETRIC || z8Var.v().x() == zzhqb.ASYMMETRIC_PRIVATE) {
                            throw new GeneralSecurityException("keyset contains key material of type " + z8Var.v().x().name() + " for type url " + z8Var.v().v());
                        }
                    }
                    return g43.a(a9VarZ);
                } catch (zzicg unused) {
                    throw new GeneralSecurityException("invalid keyset");
                }
            } catch (zzicg unused2) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IOException unused3) {
            zg1.m("Parse keyset failed");
            return null;
        }
    }

    public static void H(Object obj, Object obj2) {
        if (obj == null) {
            io0.e("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            String string = obj.toString();
            io0.e(vh.t(new StringBuilder(string.length() + 26), "null value in entry: ", string, "=null"));
        }
    }

    public static void I(String str) {
        if (((Boolean) s42.a.g()).booleanValue()) {
            zzo.zzd(str);
        }
    }

    public static long J(zzer zzerVar, int i2, int i3) {
        zzerVar.D(i2);
        if (zzerVar.B() < 5) {
            return -9223372036854775807L;
        }
        int iB = zzerVar.b();
        if ((8388608 & iB) != 0 || ((iB >> 8) & 8191) != i3 || (iB & 32) == 0 || zzerVar.I() < 7 || zzerVar.B() < 7 || (zzerVar.I() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzerVar.F(0, 6, bArr);
        long j2 = bArr[0];
        long j3 = bArr[1];
        long j4 = bArr[2];
        long j5 = bArr[3] & 255;
        return ((j2 & 255) << 25) | ((j3 & 255) << 17) | ((j4 & 255) << 9) | (j5 + j5) | ((((long) bArr[4]) & 255) >> 7);
    }

    public static zze K(Throwable th, zzekl zzeklVar) {
        zze zzeVar;
        zze zzeVarE = E(th);
        int i2 = zzeVarE.zza;
        if ((i2 == 3 || i2 == 0) && (zzeVar = zzeVarE.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zzeVarE.zzd = null;
        }
        if (zzeklVar != null) {
            zzeVarE.zze = new zzday(zzeklVar.e, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzeklVar, zzeklVar.d, zzeklVar.c);
        }
        return zzeVarE;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ew1 L(com.google.android.gms.internal.ads.zzeq r10) {
        /*
            r0 = 16
            int r1 = r10.h(r0)
            int r0 = r10.h(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r10.h(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r10.h(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r10.h(r1)
            boolean r2 = r10.g()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r10.h(r2)
            boolean r5 = r10.g()
            if (r5 == 0) goto L47
            int r5 = r10.h(r4)
            if (r5 <= 0) goto L47
            r10.f(r1)
        L47:
            boolean r5 = r10.g()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r7 = 44100(0xac44, float:6.1797E-41)
            r8 = 1
            if (r8 == r5) goto L56
            r5 = r7
            goto L57
        L56:
            r5 = r6
        L57:
            int r10 = r10.h(r3)
            int[] r9 = defpackage.xg0.m
            if (r5 != r7) goto L66
            r7 = 13
            if (r10 != r7) goto L66
            r10 = r9[r7]
            goto L94
        L66:
            r7 = 0
            if (r5 != r6) goto L93
            r6 = 14
            if (r10 >= r6) goto L93
            r6 = r9[r10]
            int r2 = r2 % 5
            r7 = 8
            if (r2 == r8) goto L8c
            r8 = 11
            if (r2 == r1) goto L87
            if (r2 == r4) goto L8c
            if (r2 == r3) goto L7e
            goto L91
        L7e:
            if (r10 == r4) goto L84
            if (r10 == r7) goto L84
            if (r10 != r8) goto L91
        L84:
            int r10 = r6 + 1
            goto L94
        L87:
            if (r10 == r7) goto L84
            if (r10 != r8) goto L91
            goto L84
        L8c:
            if (r10 == r4) goto L84
            if (r10 != r7) goto L91
            goto L84
        L91:
            r10 = r6
            goto L94
        L93:
            r10 = r7
        L94:
            ew1 r1 = new ew1
            r1.<init>(r5, r0, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg0.L(com.google.android.gms.internal.ads.zzeq):ew1");
    }

    public static void M(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 29 + String.valueOf(i2).length());
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static zze N(int i2, zze zzeVar) {
        if (i2 == 0) {
            throw null;
        }
        if (i2 == 8) {
            if (((Integer) zzbd.zzc().a(p32.C9)).intValue() > 0) {
                return zzeVar;
            }
            i2 = 8;
        }
        return P(i2, null, zzeVar);
    }

    public static void O(int i2, zzer zzerVar) {
        zzerVar.y(7);
        byte[] bArr = zzerVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i2 >> 16) & 255);
        bArr[5] = (byte) ((i2 >> 8) & 255);
        bArr[6] = (byte) (i2 & 255);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zze P(int i2, String str, zze zzeVar) {
        String str2;
        int i3 = i2 - 1;
        if (str == null) {
            if (i2 == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i3) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) zzbd.zzc().a(p32.F9)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i2 == 0) {
            throw null;
        }
        int i4 = 0;
        int i5 = 2;
        switch (i3) {
            case 0:
            case 11:
            case 15:
                i5 = i4;
                return new zze(i5, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i5 = 1;
                return new zze(i5, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 2:
            case 10:
            case 18:
                i5 = 3;
                return new zze(i5, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 3:
                i4 = 8;
                i5 = i4;
                return new zze(i5, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 4:
            case 8:
            case 17:
                return new zze(i5, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 7:
                i4 = 4;
                i5 = i4;
                return new zze(i5, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 12:
                if (((Integer) zzbd.zzc().a(p32.F9)).intValue() <= 0) {
                    i4 = 9;
                    i5 = i4;
                    return new zze(i5, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                }
                i5 = 3;
                return new zze(i5, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 13:
                i4 = 10;
                i5 = i4;
                return new zze(i5, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 14:
                i4 = 11;
                i5 = i4;
                return new zze(i5, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            default:
                switch (i2) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }

    public static void Q(zzeq zzeqVar, dw1 dw1Var) throws zzat {
        int iH = zzeqVar.h(5);
        zzeqVar.f(2);
        if (zzeqVar.g()) {
            zzeqVar.f(5);
        }
        if (iH >= 7 && iH <= 10) {
            zzeqVar.e();
        }
        if (zzeqVar.g()) {
            int iH2 = zzeqVar.h(3);
            if (dw1Var.b == -1 && iH >= 0 && iH <= 15 && (iH2 == 0 || iH2 == 1)) {
                dw1Var.b = iH;
            }
            if (zzeqVar.g()) {
                S(zzeqVar);
            }
        }
    }

    public static void R(zzeq zzeqVar, dw1 dw1Var) throws zzat {
        zzeqVar.f(2);
        boolean zG = zzeqVar.g();
        int iH = zzeqVar.h(8);
        for (int i2 = 0; i2 < iH; i2++) {
            zzeqVar.f(2);
            if (zzeqVar.g()) {
                zzeqVar.f(5);
            }
            if (zG) {
                zzeqVar.f(24);
            } else {
                if (zzeqVar.g()) {
                    if (!zzeqVar.g()) {
                        zzeqVar.f(4);
                    }
                    dw1Var.c = zzeqVar.h(6) + 1;
                }
                zzeqVar.f(4);
            }
        }
        if (zzeqVar.g()) {
            zzeqVar.f(3);
            if (zzeqVar.g()) {
                S(zzeqVar);
            }
        }
    }

    public static void S(zzeq zzeqVar) throws zzat {
        int iH = zzeqVar.h(6);
        if (iH < 2 || iH > 42) {
            throw zzat.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iH)));
        }
        zzeqVar.f(iH * 8);
    }

    public static void a(ListenableFuture listenableFuture, FutureCallback futureCallback, Executor executor) {
        futureCallback.getClass();
        listenableFuture.addListener(new db0(0, listenableFuture, futureCallback), executor);
    }

    public static zk0 b(List list) {
        return new zk0(new ArrayList(list), true, fy.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(android.content.ComponentName r5, android.content.ComponentName r6) {
        /*
            r6.getClass()
            java.lang.String r0 = "*"
            r1 = 1
            r2 = 0
            if (r5 != 0) goto L1e
            java.lang.String r5 = r6.getPackageName()
            boolean r5 = defpackage.yg0.a(r5, r0)
            if (r5 == 0) goto L7c
            java.lang.String r5 = r6.getClassName()
            boolean r5 = defpackage.yg0.a(r5, r0)
            if (r5 == 0) goto L7c
            goto L7b
        L1e:
            java.lang.String r3 = r5.toString()
            r3.getClass()
            boolean r0 = kotlin.text.g.o(r3, r0, r2)
            if (r0 != 0) goto L7d
            java.lang.String r0 = r5.getPackageName()
            java.lang.String r3 = r6.getPackageName()
            boolean r0 = defpackage.yg0.a(r0, r3)
            if (r0 != 0) goto L50
            java.lang.String r0 = r5.getPackageName()
            r0.getClass()
            java.lang.String r3 = r6.getPackageName()
            r3.getClass()
            boolean r0 = A(r0, r3)
            if (r0 == 0) goto L4e
            goto L50
        L4e:
            r0 = r2
            goto L51
        L50:
            r0 = r1
        L51:
            java.lang.String r3 = r5.getClassName()
            java.lang.String r4 = r6.getClassName()
            boolean r3 = defpackage.yg0.a(r3, r4)
            if (r3 != 0) goto L76
            java.lang.String r5 = r5.getClassName()
            r5.getClass()
            java.lang.String r6 = r6.getClassName()
            r6.getClass()
            boolean r5 = A(r5, r6)
            if (r5 == 0) goto L74
            goto L76
        L74:
            r5 = r2
            goto L77
        L76:
            r5 = r1
        L77:
            if (r0 == 0) goto L7c
            if (r5 == 0) goto L7c
        L7b:
            return r1
        L7c:
            return r2
        L7d:
            java.lang.String r5 = "Wildcard can only be part of the rule."
            defpackage.u7.r(r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg0.c(android.content.ComponentName, android.content.ComponentName):boolean");
    }

    public static void d(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    public static Object e(Delay delay, long j2, Continuation continuation) {
        if (j2 > 0) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(a.c(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            delay.scheduleResumeAfterDelay(j2, cancellableContinuationImpl);
            Object objM = cancellableContinuationImpl.m();
            if (objM == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM;
            }
        }
        return mk1.a;
    }

    public static final DeserializationStrategy f(AbstractPolymorphicSerializer abstractPolymorphicSerializer, CompositeDecoder compositeDecoder, String str) {
        DeserializationStrategy deserializationStrategyA = abstractPolymorphicSerializer.a(compositeDecoder, str);
        if (deserializationStrategyA != null) {
            return deserializationStrategyA;
        }
        sb2.t(str, abstractPolymorphicSerializer.getA());
        throw null;
    }

    public static final SerializationStrategy g(AbstractPolymorphicSerializer abstractPolymorphicSerializer, Encoder encoder, Object obj) {
        SerializationStrategy serializationStrategyB = abstractPolymorphicSerializer.b(encoder, obj);
        if (serializationStrategyB != null) {
            return serializationStrategyB;
        }
        ClassReference classReferenceA = Reflection.a(obj.getClass());
        KClass kClassC = abstractPolymorphicSerializer.getA();
        kClassC.getClass();
        String simpleName = classReferenceA.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(classReferenceA);
        }
        sb2.t(simpleName, kClassC);
        throw null;
    }

    public static Object h(Future future) {
        jx0.g("Future was expected to be done, " + future, future.isDone());
        return l(future);
    }

    public static String i(int i2) {
        ArrayList arrayList = new ArrayList();
        if ((i2 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i2 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i2 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "|");
            }
        }
        return sb.toString();
    }

    public static final int j(String str, Bundle bundle) {
        str.getClass();
        int i2 = bundle.getInt(str, AttribFlags.SSH_FILEXFER_ATTR_EXTENDED);
        if (i2 != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i2;
        }
        yg0.E(str);
        throw null;
    }

    public static final Bundle k(String str, Bundle bundle) {
        str.getClass();
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        yg0.E(str);
        throw null;
    }

    public static Object l(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static rf0 m(Object obj) {
        return obj == null ? rf0.c : new rf0(obj, 0);
    }

    public static boolean n(CameraCharacteristicsProvider cameraCharacteristicsProvider) {
        Boolean bool;
        try {
            bool = (Boolean) cameraCharacteristicsProvider.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException unused) {
            if (px.a.b(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT));
                km0.a("FlashAvailability");
            } else {
                String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT));
                km0.c("FlashAvailability");
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            km0.g("FlashAvailability");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean o(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return qf3.D(context);
        }
        return true;
    }

    public static ListenableFuture p(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
        bVar.c = new n31();
        oh ohVar = new oh(bVar);
        bVar.b = ohVar;
        bVar.a = vh.class;
        try {
            s(false, listenableFuture, bVar, fy.b());
            bVar.a = "nonCancellationPropagating[" + listenableFuture + "]";
        } catch (Exception e2) {
            ohVar.a(e2);
        }
        return ohVar;
    }

    public static BigDecimal q(String str) {
        d(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public static void r(ListenableFuture listenableFuture, androidx.concurrent.futures.b bVar) {
        s(true, listenableFuture, bVar, fy.b());
    }

    public static void s(boolean z, ListenableFuture listenableFuture, androidx.concurrent.futures.b bVar, fy fyVar) {
        listenableFuture.getClass();
        bVar.getClass();
        fyVar.getClass();
        a(listenableFuture, new rb0(bVar, 8), fyVar);
        if (z) {
            bVar.a(new g6(listenableFuture, 12), fy.b());
        }
    }

    public static int t(int i2, int i3) {
        return cn0.S(((long) i2) + ((long) i3));
    }

    public static zk0 u(ArrayList arrayList) {
        return new zk0(new ArrayList(arrayList), false, fy.b());
    }

    public static final List v(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? DesugarCollections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(c.r(list)) : EmptyList.INSTANCE;
    }

    public static final Map w(Map map) {
        int size = map.size();
        if (size == 0) {
            return d.a();
        }
        if (size != 1) {
            return DesugarCollections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) c.q(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static String x(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (c2 >= 'A' && c2 <= 'Z') {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static String y(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (c2 >= 'a' && c2 <= 'z') {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static am z(ListenableFuture listenableFuture, AsyncFunction asyncFunction, Executor executor) {
        am amVar = new am(asyncFunction, listenableFuture);
        listenableFuture.addListener(amVar, executor);
        return amVar;
    }
}
