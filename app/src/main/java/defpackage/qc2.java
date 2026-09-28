package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzbin;
import com.google.android.gms.internal.ads.zzbxx;
import com.google.android.gms.internal.ads.zzcca;
import com.google.android.gms.internal.ads.zzdvu;
import com.google.android.gms.internal.ads.zzext;
import com.google.android.gms.internal.ads.zzeyq;
import com.google.android.gms.internal.ads.zzfdr;
import com.google.android.gms.internal.ads.zzikg;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qc2 implements zzikg {
    public final /* synthetic */ int a;

    public qc2(ji2 ji2Var) {
        this.a = 9;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        switch (this.a) {
            case 0:
                return zzt.zzh();
            case 1:
                ta2 ta2Var = g3.a;
                k02.J(ta2Var);
                return new uh2(ta2Var, 20);
            case 2:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage("com.android.vending");
                intent.setData(Uri.parse("https://play.google.com/d"));
                return intent;
            case 3:
                String strZzf = zzbb.zzf();
                k02.J(strZzf);
                return strZzf;
            case 4:
                return new zzbin();
            case 5:
                return new zzbxx();
            case 6:
                return new zzcca();
            case 7:
                return zzt.zzD();
            case 8:
                Set set = Collections.EMPTY_SET;
                k02.J(set);
                return set;
            case 9:
                Set set2 = Collections.EMPTY_SET;
                k02.J(set2);
                return set2;
            case 10:
                Set set3 = Collections.EMPTY_SET;
                k02.J(set3);
                return set3;
            case 11:
                Set set4 = Collections.EMPTY_SET;
                k02.J(set4);
                return set4;
            case 12:
                Set set5 = Collections.EMPTY_SET;
                k02.J(set5);
                return set5;
            case 13:
                Set set6 = Collections.EMPTY_SET;
                k02.J(set6);
                return set6;
            case 14:
                Set set7 = Collections.EMPTY_SET;
                k02.J(set7);
                return set7;
            case 15:
            case 16:
            case 17:
            case 18:
                return null;
            case 19:
                ta2 ta2Var2 = g3.a;
                k02.J(ta2Var2);
                return new zzdvu(ta2Var2);
            case 20:
                ta2 ta2Var3 = g3.a;
                k02.J(ta2Var3);
                return new wq2(ta2Var3);
            case 21:
                ta2 ta2Var4 = g3.a;
                k02.J(ta2Var4);
                return new er2(ta2Var4, 4);
            case 22:
                ta2 ta2Var5 = g3.a;
                k02.J(ta2Var5);
                return new zzext(ta2Var5);
            case 23:
                ta2 ta2Var6 = g3.a;
                k02.J(ta2Var6);
                return new zzeyq(ta2Var6);
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                ta2 ta2Var7 = g3.a;
                k02.J(ta2Var7);
                return new zzfdr(ta2Var7);
            default:
                return wu.a;
        }
    }

    public /* synthetic */ qc2(int i) {
        this.a = i;
    }
}
