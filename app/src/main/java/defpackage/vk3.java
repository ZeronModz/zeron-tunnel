package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import com.google.android.gms.internal.ads.f0;
import com.google.android.gms.internal.ads.zd;
import com.google.android.gms.internal.ads.zzio;
import com.trilead.ssh2.sftp.AttribFlags;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class vk3 {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public int k;
    public float l;

    public vk3(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = z4;
        this.i = f0.b(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.vk3 a(java.lang.String r9, java.lang.String r10, java.lang.String r11, android.media.MediaCodecInfo.CodecCapabilities r12, boolean r13, boolean r14) {
        /*
            vk3 r0 = new vk3
            r1 = 1
            r2 = 0
            if (r12 == 0) goto L10
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r12.isFeatureSupported(r3)
            if (r3 == 0) goto L10
            r6 = r1
            goto L11
        L10:
            r6 = r2
        L11:
            if (r12 == 0) goto L18
            java.lang.String r3 = "tunneled-playback"
            r12.isFeatureSupported(r3)
        L18:
            if (r14 != 0) goto L24
            if (r12 == 0) goto L26
            java.lang.String r14 = "secure-playback"
            boolean r14 = r12.isFeatureSupported(r14)
            if (r14 == 0) goto L26
        L24:
            r7 = r1
            goto L27
        L26:
            r7 = r2
        L27:
            int r14 = android.os.Build.VERSION.SDK_INT
            r3 = 35
            if (r14 < r3) goto L61
            if (r12 == 0) goto L61
            java.lang.String r14 = "detached-surface"
            boolean r14 = r12.isFeatureSupported(r14)
            if (r14 == 0) goto L61
            java.lang.String r14 = android.os.Build.MANUFACTURER
            java.lang.String r3 = "Xiaomi"
            boolean r3 = r14.equals(r3)
            if (r3 != 0) goto L61
            java.lang.String r3 = "OPPO"
            boolean r3 = r14.equals(r3)
            if (r3 != 0) goto L61
            java.lang.String r3 = "realme"
            boolean r3 = r14.equals(r3)
            if (r3 != 0) goto L61
            java.lang.String r3 = "motorola"
            boolean r3 = r14.equals(r3)
            if (r3 != 0) goto L61
            java.lang.String r3 = "LENOVO"
            boolean r14 = r14.equals(r3)
            if (r14 == 0) goto L68
        L61:
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            r8 = r2
            r2 = r10
            goto L6e
        L68:
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r8 = r1
            r1 = r9
        L6e:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk3.a(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):vk3");
    }

    public static boolean i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Range<Double> achievableFrameRatesFor;
        Point pointJ = j(videoCapabilities, i, i2);
        int i3 = pointJ.x;
        int i4 = pointJ.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4)) == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
        }
        return false;
    }

    public static Point j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = wt2.a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean b(yk3 yk3Var) {
        int i;
        String str = yk3Var.m;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(zd.d(yk3Var))) || !f(yk3Var, true) || !g(yk3Var)) {
            return false;
        }
        if (this.i) {
            int i2 = yk3Var.t;
            if (i2 > 0 && (i = yk3Var.u) > 0) {
                return e(i2, i, yk3Var.x);
            }
        } else {
            int i3 = yk3Var.F;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i3 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i3)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 20);
                    sb.append("sampleRate.support, ");
                    sb.append(i3);
                    h(sb.toString());
                    return false;
                }
            }
            int i4 = yk3Var.E;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    String str3 = this.a;
                    StringBuilder sb2 = new StringBuilder(ec1.H(String.valueOf(maxInputChannelCount).length() + str3.length() + 32 + 4, 1, String.valueOf(i5)));
                    sb2.append("AssumedMaxChannelAdjustment: ");
                    sb2.append(str3);
                    sb2.append(", [");
                    sb2.append(maxInputChannelCount);
                    sb2.append(" to ");
                    sb2.append(i5);
                    sb2.append("]");
                    ii2.K(sb2.toString());
                    maxInputChannelCount = i5;
                }
                if (maxInputChannelCount < i4) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i4).length() + 22);
                    sb3.append("channelCount.support, ");
                    sb3.append(i4);
                    h(sb3.toString());
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean c(yk3 yk3Var) {
        if (this.i) {
            return this.e;
        }
        Pair pairB = rj2.b(yk3Var);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    public final zzio d(yk3 yk3Var, yk3 yk3Var2) {
        yk3 yk3Var3;
        yk3 yk3Var4;
        int i;
        String str = yk3Var.m;
        String str2 = yk3Var2.m;
        tc3 tc3Var = yk3Var2.C;
        int i2 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (yk3Var.y != yk3Var2.y) {
                i2 |= 1024;
            }
            boolean z = (yk3Var.t == yk3Var2.t && yk3Var.u == yk3Var2.u) ? false : true;
            if (!this.e && z) {
                i2 |= 512;
            }
            tc3 tc3Var2 = yk3Var.C;
            if ((!tc3.a(tc3Var2) || !tc3.a(tc3Var)) && !Objects.equals(tc3Var2, tc3Var)) {
                i2 |= 2048;
            }
            boolean zStartsWith = Build.MODEL.startsWith("SM-T230");
            String str3 = this.a;
            if (zStartsWith && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !yk3Var.b(yk3Var2)) {
                i2 |= 2;
            }
            int i3 = yk3Var.v;
            if (i3 != -1 && (i = yk3Var.w) != -1 && i3 == yk3Var2.v && i == yk3Var2.w && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(str2, "video/dolby-vision")) {
                Pair pairB = rj2.b(yk3Var);
                Pair pairB2 = rj2.b(yk3Var2);
                if (pairB == null || pairB2 == null || !((Integer) pairB.first).equals(pairB2.first)) {
                    i2 = 2;
                }
            }
            if (i2 == 0) {
                return new zzio(str3, yk3Var, yk3Var2, true == yk3Var.b(yk3Var2) ? 3 : 2, 0);
            }
            yk3Var3 = yk3Var;
            yk3Var4 = yk3Var2;
        } else {
            yk3Var3 = yk3Var;
            yk3Var4 = yk3Var2;
            if (yk3Var3.E != yk3Var4.E) {
                i2 |= AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE;
            }
            if (yk3Var3.F != yk3Var4.F) {
                i2 |= AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT;
            }
            if (yk3Var3.G != yk3Var4.G) {
                i2 |= AttribFlags.SSH_FILEXFER_ATTR_UNTRANSLATED_NAME;
            }
            String str4 = this.b;
            if (i2 == 0 && (str4.equals("audio/mp4a-latm") || str4.equals("audio/ac4"))) {
                Pair pairB3 = rj2.b(yk3Var3);
                Pair pairB4 = rj2.b(yk3Var4);
                if (pairB3 != null && pairB4 != null) {
                    int iIntValue = ((Integer) pairB3.first).intValue();
                    int iIntValue2 = ((Integer) pairB4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new zzio(this.a, yk3Var3, yk3Var4, 3, 0);
                    }
                    if (str4.equals("audio/ac4") && pairB3.equals(pairB4)) {
                        return new zzio(this.a, yk3Var3, yk3Var4, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (str4.equals("audio/eac3-joc") || str4.equals("audio/eac3"))) {
                return new zzio(this.a, yk3Var3, yk3Var4, 3, 0);
            }
            if (!yk3Var3.b(yk3Var4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str4)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new zzio(this.a, yk3Var3, yk3Var4, 1, 0);
            }
        }
        return new zzio(this.a, yk3Var3, yk3Var4, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(int r11, int r12, double r13) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk3.e(int, int, double):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(defpackage.yk3 r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk3.f(yk3, boolean):boolean");
    }

    public final boolean g(yk3 yk3Var) {
        return (Objects.equals(yk3Var.m, "audio/flac") && yk3Var.G == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final void h(String str) {
        String str2 = wt2.a;
        String str3 = this.b;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length() + 14;
        String str4 = this.a;
        StringBuilder sb = new StringBuilder(str4.length() + length3 + 2 + length + 3 + length2 + 1);
        hz.H(sb, "NoSupport [", str, "] [", str4);
        hz.H(sb, ", ", str3, "] [", str2);
        sb.append("]");
        ii2.D(sb.toString());
    }

    public final String toString() {
        return this.a;
    }
}
