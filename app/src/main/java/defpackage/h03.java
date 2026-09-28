package defpackage;

import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.r5;
import com.google.android.gms.internal.ads.zzgmu;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class h03 implements zzgmu {
    public final f6 a;
    public final long b;

    public h03(f6 f6Var, long j) {
        this.a = f6Var;
        this.b = j;
    }

    public static boolean a(r5 r5Var) {
        int iV = r5Var.w().v().v();
        int iZzb = r5Var.w().v().zzb();
        byte[] bArrJ = w91.J();
        bArrJ.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.getClass();
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort((short) iV);
        byteBufferAllocate.putInt(iZzb);
        byte[] bArrArray = byteBufferAllocate.array();
        bArrArray.getClass();
        return Arrays.equals(bArrArray, bArrJ);
    }

    @Override // com.google.android.gms.internal.ads.zzgmu
    public final boolean zza(r5 r5Var) {
        f6 f6Var = this.a;
        if (r5Var == null || r5Var.equals(r5.A())) {
            f6Var.b(20202);
            return true;
        }
        if (!a(r5Var)) {
            f6Var.b(20205);
            return true;
        }
        boolean z = r5Var.w().x() - System.currentTimeMillis() <= this.b;
        if (z) {
            f6Var.b(20203);
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzgmu
    public final boolean zzb(r5 r5Var) {
        f6 f6Var = this.a;
        if (r5Var == null || r5Var.equals(r5.A())) {
            f6Var.b(20204);
            return false;
        }
        if (a(r5Var)) {
            return true;
        }
        f6Var.b(20206);
        return false;
    }
}
