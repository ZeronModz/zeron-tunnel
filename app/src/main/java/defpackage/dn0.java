package defpackage;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.l3;
import com.google.android.gms.internal.consent_sdk.zzco;
import com.google.common.base.Predicate;
import com.google.common.collect.s1;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import com.trilead.ssh2.sftp.Packet;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import kotlin.time.ComparableTimeMark;
import kotlin.time.a;
import kotlinx.io.Segment;
import okio.SegmentedByteString;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dn0 {
    public static volatile jc0 a;
    public static final Object[] b = new Object[0];
    public static final int[][] c = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] d = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] e = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, Packet.SSH_FXP_HANDLE, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, Packet.SSH_FXP_HANDLE, 126, -1}, new int[]{6, 26, 52, 78, Packet.SSH_FXP_NAME, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, Packet.SSH_FXP_HANDLE, 126, 150}, new int[]{6, 24, 50, 76, Packet.SSH_FXP_HANDLE, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] f = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};
    public static final String[] g = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] h = {44100, 48000, 32000};
    public static final int[] i = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] j = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] k = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] l = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] m = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static lw1 n;

    public static int A(int i2, int i3, int i4, ByteBuffer byteBuffer) {
        byte b2;
        int i5;
        byte b3;
        int i6;
        int i7 = i3;
        if (i2 != 0) {
            if (i7 >= i4) {
                return i2;
            }
            byte b4 = (byte) i2;
            if (b4 < -32) {
                if (b4 < -62) {
                    return -1;
                }
                int i8 = i7 + 1;
                if (byteBuffer.get(i7) > -65) {
                    return -1;
                }
                i7 = i8;
            } else if (b4 < -16) {
                byte b5 = (byte) (~(i2 >> 8));
                if (b5 == 0) {
                    i6 = i7 + 1;
                    b3 = byteBuffer.get(i7);
                    if (i6 >= i4) {
                        return l3.c(b4, b3);
                    }
                } else {
                    b3 = b5;
                    i6 = i7;
                }
                if (b3 > -65) {
                    return -1;
                }
                if (b4 == -32 && b3 < -96) {
                    return -1;
                }
                if (b4 == -19 && b3 >= -96) {
                    return -1;
                }
                i7 = i6 + 1;
                if (byteBuffer.get(i6) > -65) {
                    return -1;
                }
            } else {
                byte b6 = (byte) (~(i2 >> 8));
                if (b6 == 0) {
                    i5 = i7 + 1;
                    b6 = byteBuffer.get(i7);
                    if (i5 >= i4) {
                        return l3.c(b4, b6);
                    }
                    b2 = 0;
                } else {
                    b2 = (byte) (i2 >> 16);
                    i5 = i7;
                }
                if (b2 == 0) {
                    int i9 = i5 + 1;
                    byte b7 = byteBuffer.get(i5);
                    if (i9 >= i4) {
                        return l3.d(b4, b6, b7);
                    }
                    b2 = b7;
                    i5 = i9;
                }
                if (b6 > -65) {
                    return -1;
                }
                if ((((b6 + 112) + (b4 << 28)) >> 30) != 0 || b2 > -65) {
                    return -1;
                }
                i7 = i5 + 1;
                if (byteBuffer.get(i5) > -65) {
                    return -1;
                }
            }
        }
        dn0 dn0Var = l3.a;
        int i10 = i4 - 7;
        int i11 = i7;
        while (i11 < i10 && (byteBuffer.getLong(i11) & (-9187201950435737472L)) == 0) {
            i11 += 8;
        }
        int i12 = (i11 - i7) + i7;
        while (i12 < i4) {
            int i13 = i12 + 1;
            byte b8 = byteBuffer.get(i12);
            if (b8 >= 0) {
                i12 = i13;
            } else if (b8 < -32) {
                if (i13 >= i4) {
                    return b8;
                }
                if (b8 < -62 || byteBuffer.get(i13) > -65) {
                    return -1;
                }
                i12 += 2;
            } else if (b8 < -16) {
                if (i13 >= i4 - 1) {
                    return l3.e(b8, i13, i4 - i13, byteBuffer);
                }
                int i14 = i12 + 2;
                byte b9 = byteBuffer.get(i13);
                if (b9 > -65) {
                    return -1;
                }
                if (b8 == -32 && b9 < -96) {
                    return -1;
                }
                if ((b8 == -19 && b9 >= -96) || byteBuffer.get(i14) > -65) {
                    return -1;
                }
                i12 += 3;
            } else {
                if (i13 >= i4 - 2) {
                    return l3.e(b8, i13, i4 - i13, byteBuffer);
                }
                int i15 = i12 + 2;
                byte b10 = byteBuffer.get(i13);
                if (b10 > -65) {
                    return -1;
                }
                if ((((b10 + 112) + (b8 << 28)) >> 30) != 0) {
                    return -1;
                }
                int i16 = i12 + 3;
                if (byteBuffer.get(i15) > -65) {
                    return -1;
                }
                i12 += 4;
                if (byteBuffer.get(i16) > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static final int C(SegmentedByteString segmentedByteString, int i2) {
        int i3;
        int[] directory$okio = segmentedByteString.getDirectory();
        int i4 = i2 + 1;
        int length = segmentedByteString.getSegments().length;
        directory$okio.getClass();
        int i5 = length - 1;
        int i6 = 0;
        while (true) {
            if (i6 <= i5) {
                i3 = (i6 + i5) >>> 1;
                int i7 = directory$okio[i3];
                if (i7 >= i4) {
                    if (i7 <= i4) {
                        break;
                    }
                    i5 = i3 - 1;
                } else {
                    i6 = i3 + 1;
                }
            } else {
                i3 = (-i6) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }

    public static long D(int i2, long j2) {
        long j3 = i2;
        jx0.b(j3 > 0, "bytesPerFrame must be greater than 0.");
        return j2 / j3;
    }

    public static void E(List list, Predicate predicate, int i2, int i3) {
        for (int size = list.size() - 1; size > i3; size--) {
            if (predicate.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            list.remove(i4);
        }
    }

    public static int F(int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            return 90;
        }
        if (i2 == 2) {
            return 180;
        }
        if (i2 == 3) {
            return 270;
        }
        u7.r(hz.o(i2, "Unsupported surface rotation: "));
        return 0;
    }

    public static int G(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i2});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final Object[] H(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = b;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i3);
            }
            i2 = i3;
        }
    }

    public static final Object[] I(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        collection.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final String J(String str) {
        str.getClass();
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            char cCharAt = str.charAt(i2);
            if ((('A' > cCharAt || cCharAt >= '[') ? (cCharAt < 0 || cCharAt >= 128) ? Character.toLowerCase(cCharAt) : cCharAt : (char) (cCharAt + ' ')) != cCharAt) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append((CharSequence) str, 0, i2);
        int length2 = str.length() - 1;
        if (i2 <= length2) {
            while (true) {
                char cCharAt2 = str.charAt(i2);
                if ('A' <= cCharAt2 && cCharAt2 < '[') {
                    cCharAt2 = (char) (cCharAt2 + ' ');
                } else if (cCharAt2 < 0 || cCharAt2 >= 128) {
                    cCharAt2 = Character.toLowerCase(cCharAt2);
                }
                sb.append(cCharAt2);
                if (i2 == length2) {
                    break;
                }
                i2++;
            }
        }
        return sb.toString();
    }

    public static int K(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = i5 - 1;
        int i8 = h[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? i[i7] : j[i7]) * 12) / i8) + i9) * 4;
        }
        int i10 = i3 == 3 ? i4 == 2 ? k[i7] : l[i7] : m[i7];
        if (i3 == 3) {
            return ((i10 * 144) / i8) + i9;
        }
        return (((i4 == 1 ? 72 : 144) * i10) / i8) + i9;
    }

    public static long L(ByteBuffer byteBuffer) {
        long j2 = byteBuffer.getInt();
        return j2 < 0 ? j2 + 4294967296L : j2;
    }

    public static kx M(Context context, String str) {
        String strConcat;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("/", -1);
        int length = strArrSplit.length;
        if (length == 1) {
            String strValueOf = String.valueOf(context.getPackageName());
            str2 = strArrSplit[0];
            strConcat = strValueOf.concat("_preferences");
        } else {
            if (length != 2) {
                return null;
            }
            strConcat = strArrSplit[0];
            str2 = strArrSplit[1];
        }
        if (TextUtils.isEmpty(strConcat) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new kx(strConcat, str2, 3);
    }

    public static boolean N(int i2) {
        Boolean bool;
        if (i2 - 1 == 0) {
            return !q63.a();
        }
        if (!q63.a()) {
            return true;
        }
        try {
            int i3 = Conscrypt.a;
            bool = (Boolean) Conscrypt.class.getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            q63.a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }

    public static int O(int i2) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i2) * (-862048943)), 15)) * 461845907);
    }

    public static int P(Object obj) {
        return O(obj == null ? 0 : obj.hashCode());
    }

    public static void Q(Context context, HashSet hashSet) {
        HashMap map;
        zzco zzcoVar = new zzco(context);
        Iterator it = hashSet.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = zzcoVar.c;
            if (!zHasNext) {
                break;
            }
            String str = (String) it.next();
            kx kxVarM = M(context, str);
            if (kxVarM == null) {
                "clearKeys: unable to process key: ".concat(String.valueOf(str));
            } else {
                String str2 = kxVarM.b;
                if (!map.containsKey(str2)) {
                    map.put(str2, zzcoVar.b.getSharedPreferences(str2, 0).edit());
                }
                ((SharedPreferences.Editor) map.get(str2)).remove(kxVarM.c);
            }
        }
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            ((SharedPreferences.Editor) it2.next()).commit();
        }
    }

    public static long R(ByteBuffer byteBuffer) {
        long jL = L(byteBuffer) << 32;
        if (jL >= 0) {
            return L(byteBuffer) + jL;
        }
        s31.f("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
        return 0L;
    }

    public static double S(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | (65280 & (bArr[2] << 8))) | (bArr[3] & 255))) / 65536.0d;
    }

    public static boolean T(byte b2) {
        return b2 > -65;
    }

    public static double U(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | (65280 & (bArr[2] << 8))) | (bArr[3] & 255))) / 1.073741824E9d;
    }

    public static boolean a(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        iterable.getClass();
        return s1.a(collection, iterable.iterator());
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(com.google.zxing.common.BitArray r24, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel r25, defpackage.jm1 r26, int r27, com.google.zxing.qrcode.encoder.ByteMatrix r28) throws com.google.zxing.WriterException {
        /*
            Method dump skipped, instruction units count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn0.b(com.google.zxing.common.BitArray, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel, jm1, int, com.google.zxing.qrcode.encoder.ByteMatrix):void");
    }

    public static int c(int i2, int i3) {
        if (i3 == 0) {
            u7.r("0 polynomial");
            return 0;
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i3);
        int i4 = 32 - iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2 = i2 << (31 - iNumberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= i4) {
            iNumberOfLeadingZeros2 ^= i3 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - i4);
        }
        return iNumberOfLeadingZeros2;
    }

    public static void d(Class cls, Object obj) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061 A[PHI: r6
      0x0061: PHI (r6v29 int) = (r6v5 int), (r6v18 int), (r6v18 int), (r6v21 int), (r6v28 int), (r6v37 int), (r6v38 int) binds: [B:90:0x014c, B:65:0x00dd, B:67:0x00e3, B:54:0x00bb, B:40:0x0086, B:28:0x005b, B:27:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String e(int r16, int r17, byte[] r18) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn0.e(int, int, byte[]):java.lang.String");
    }

    public static int f(ComparableTimeMark comparableTimeMark, ComparableTimeMark comparableTimeMark2) {
        comparableTimeMark2.getClass();
        long jMo49minusUwyO8pc = comparableTimeMark.mo49minusUwyO8pc(comparableTimeMark2);
        a.b.getClass();
        return a.c(jMo49minusUwyO8pc, 0L);
    }

    public static String h(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
        if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i4 = i2 + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i2 < i4) {
            byte b2 = byteBuffer.get(i2);
            if (b2 < 0) {
                break;
            }
            i2++;
            cArr[i5] = (char) b2;
            i5++;
        }
        int i6 = i5;
        while (i2 < i4) {
            int i7 = i2 + 1;
            byte b3 = byteBuffer.get(i2);
            if (b3 >= 0) {
                int i8 = i6 + 1;
                cArr[i6] = (char) b3;
                while (i7 < i4) {
                    byte b4 = byteBuffer.get(i7);
                    if (b4 < 0) {
                        break;
                    }
                    i7++;
                    cArr[i8] = (char) b4;
                    i8++;
                }
                i6 = i8;
                i2 = i7;
            } else if (b3 < -32) {
                if (i7 >= i4) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                i2 += 2;
                cn0.H(b3, byteBuffer.get(i7), cArr, i6);
                i6++;
            } else if (b3 < -16) {
                if (i7 >= i4 - 1) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                int i9 = i2 + 2;
                i2 += 3;
                cn0.G(b3, byteBuffer.get(i7), byteBuffer.get(i9), cArr, i6);
                i6++;
            } else {
                if (i7 >= i4 - 2) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                byte b5 = byteBuffer.get(i7);
                int i10 = i2 + 3;
                byte b6 = byteBuffer.get(i2 + 2);
                i2 += 4;
                cn0.F(b3, b5, b6, byteBuffer.get(i10), cArr, i6);
                i6 += 2;
            }
        }
        return new String(cArr, 0, i6);
    }

    public static float j(float f2, float f3, float f4, float f5) {
        return (float) Math.hypot(f4 - f2, f5 - f3);
    }

    public static float k(float f2, float f3, float f4, float f5) {
        float fJ = j(f2, f3, 0.0f, 0.0f);
        float fJ2 = j(f2, f3, f4, 0.0f);
        float fJ3 = j(f2, f3, f4, f5);
        float fJ4 = j(f2, f3, 0.0f, f5);
        return (fJ <= fJ2 || fJ <= fJ3 || fJ <= fJ4) ? (fJ2 <= fJ3 || fJ2 <= fJ4) ? fJ3 > fJ4 ? fJ3 : fJ4 : fJ2 : fJ;
    }

    public static void l(int i2, int i3, ByteMatrix byteMatrix) throws WriterException {
        for (int i4 = 0; i4 < 8; i4++) {
            int i5 = i2 + i4;
            if (!u(byteMatrix.a(i5, i3))) {
                throw new WriterException();
            }
            byteMatrix.b(i5, i3, 0);
        }
    }

    public static void m(int i2, int i3, ByteMatrix byteMatrix) {
        for (int i4 = 0; i4 < 7; i4++) {
            int[] iArr = c[i4];
            for (int i5 = 0; i5 < 7; i5++) {
                byteMatrix.b(i2 + i5, i3 + i4, iArr[i5]);
            }
        }
    }

    public static void n(int i2, int i3, ByteMatrix byteMatrix) throws WriterException {
        for (int i4 = 0; i4 < 7; i4++) {
            int i5 = i3 + i4;
            if (!u(byteMatrix.a(i2, i5))) {
                throw new WriterException();
            }
            byteMatrix.b(i2, i5, 0);
        }
    }

    public static boolean p(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static long q(int i2, long j2) {
        long j3 = i2;
        jx0.b(j3 > 0, "sampleRate must be greater than 0.");
        return (1000000000 * j2) / j3;
    }

    public static ScheduledExecutorService r() {
        if (a != null) {
            return a;
        }
        synchronized (dn0.class) {
            try {
                if (a == null) {
                    a = new jc0(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }

    public static Object s(Collection collection) {
        Iterator it = collection.iterator();
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i2 = 0; i2 < 4 && it.hasNext(); i2++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static int t(int i2, int i3, boolean z) {
        int i4 = z ? ((i3 - i2) + 360) % 360 : (i3 + i2) % 360;
        if (km0.e(2, km0.f("CameraOrientationUtil"))) {
            km0.a("CameraOrientationUtil");
        }
        return i4;
    }

    public static boolean u(int i2) {
        return i2 == -1;
    }

    public static final boolean v(Segment segment) {
        segment.getClass();
        return segment.b() == 0;
    }

    public static float x(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public abstract int B(int i2, int i3, int i4, ByteBuffer byteBuffer);

    public abstract String g(int i2, int i3, byte[] bArr);

    public abstract String i(ByteBuffer byteBuffer, int i2, int i3);

    public abstract int o(String str, byte[] bArr, int i2, int i3);

    public boolean w(int i2, int i3, byte[] bArr) {
        return z(0, bArr, i2, i3) == 0;
    }

    public int y(int i2, int i3, int i4, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return byteBuffer.isDirect() ? B(i2, i3, i4, byteBuffer) : A(i2, i3, i4, byteBuffer);
        }
        int iArrayOffset = byteBuffer.arrayOffset();
        return z(i2, byteBuffer.array(), i3 + iArrayOffset, iArrayOffset + i4);
    }

    public abstract int z(int i2, byte[] bArr, int i3, int i4);
}
