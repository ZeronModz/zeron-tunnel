package defpackage;

import com.google.android.gms.internal.ads.zzat;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzgl;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fw1 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public fw1(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static fw1 a(zzer zzerVar) throws zzat {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            zzerVar.E(4);
            int I = (zzerVar.I() & 3) + 1;
            if (I == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int I2 = zzerVar.I() & 31;
            for (int i9 = 0; i9 < I2; i9++) {
                int iJ = zzerVar.J();
                int i10 = zzerVar.b;
                zzerVar.E(iJ);
                byte[] bArr = zzerVar.a;
                byte[] bArr2 = rj2.a;
                byte[] bArr3 = new byte[iJ + 4];
                System.arraycopy(rj2.a, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i10, bArr3, 4, iJ);
                arrayList.add(bArr3);
            }
            int I3 = zzerVar.I();
            for (int i11 = 0; i11 < I3; i11++) {
                int iJ2 = zzerVar.J();
                int i12 = zzerVar.b;
                zzerVar.E(iJ2);
                byte[] bArr4 = zzerVar.a;
                byte[] bArr5 = rj2.a;
                byte[] bArr6 = new byte[iJ2 + 4];
                System.arraycopy(rj2.a, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i12, bArr6, 4, iJ2);
                arrayList.add(bArr6);
            }
            if (I2 > 0) {
                zzgl zzglVarM = j03.M(5, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i13 = zzglVarM.e;
                int i14 = zzglVarM.f;
                int i15 = zzglVarM.h + 8;
                int i16 = zzglVarM.i + 8;
                int i17 = zzglVarM.j;
                int i18 = zzglVarM.k;
                int i19 = zzglVarM.l;
                int i20 = zzglVarM.m;
                float f2 = zzglVarM.g;
                int i21 = zzglVarM.a;
                int i22 = zzglVarM.b;
                int i23 = zzglVarM.c;
                byte[] bArr7 = rj2.a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
                i6 = i20;
                f = f2;
                i7 = i18;
                i8 = i19;
                i4 = i16;
                i5 = i17;
                i2 = i14;
                i3 = i15;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new fw1(arrayList, I, i, i2, i3, i4, i5, i7, i8, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzat.zzb("Error parsing AVC config", e);
        }
    }
}
