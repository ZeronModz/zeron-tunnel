package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.r5;
import com.google.android.gms.internal.ads.zzbdb;
import com.google.android.gms.internal.ads.zzbil;
import com.google.android.gms.internal.ads.zzbin;
import com.google.android.gms.internal.ads.zzgcz;
import com.google.android.gms.internal.ads.zzgdb;
import com.google.android.gms.internal.ads.zzgdc;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import java.util.function.Function$CC;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Function;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class w32 implements zzikg {
    public final /* synthetic */ int a;
    public final zzikp b;
    public final se3 c;
    public final zzikp d;

    public /* synthetic */ w32(int i, Object obj, se3 se3Var, se3 se3Var2) {
        this.a = i;
        this.c = se3Var;
        this.b = (zzikp) obj;
        this.d = se3Var2;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        final int i2 = 0;
        zzikp zzikpVar = this.d;
        zzikp zzikpVar2 = this.b;
        se3 se3Var = this.c;
        switch (i) {
            case 0:
                return new zzbil(((sc2) zzikpVar2).a(), (ScheduledExecutorService) zzikpVar.zzb(), new zzbin(), (bv2) se3Var.zzb());
            case 1:
                VersionInfoParcel versionInfoParcelA = ((yc2) zzikpVar2).a();
                JSONObject jSONObject = (JSONObject) se3Var.zzb();
                String str = (String) zzikpVar.zzb();
                boolean zEquals = "native".equals(str);
                zzt.zzc();
                return new zzbdb(UUID.randomUUID().toString(), versionInfoParcelA, str, jSONObject, false, zEquals);
            case 2:
                Context context = (Context) zzikpVar2.zzb();
                return new rz2(context, context.getSharedPreferences("pcvmspf2", 0), se3.b(se3Var), (f6) zzikpVar.zzb());
            case 3:
                File file = (File) se3Var.zzb();
                zzgdc zzgdcVar = (zzgdc) zzikpVar2.zzb();
                final f6 f6Var = (f6) zzikpVar.zzb();
                r5 r5VarA = r5.A();
                Function function = new Function() { // from class: c03
                    public /* synthetic */ Function andThen(Function function2) {
                        int i3 = i2;
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i2) {
                            case 0:
                                f6Var.d(15308, th);
                                return r5.A();
                            case 1:
                                f6Var.d(15310, th);
                                return new byte[0];
                            case 2:
                                f6Var.d(15310, th);
                                return new byte[0];
                            case 3:
                                f6Var.d(15309, th);
                                return new byte[0];
                            case 4:
                                f6Var.d(15309, th);
                                return new byte[0];
                            case 5:
                                f6Var.d(15308, th);
                                return r5.A();
                            case 6:
                                f6Var.d(20310, th);
                                return new byte[0];
                            case 7:
                                f6Var.d(20309, th);
                                return new byte[0];
                            default:
                                f6Var.d(20308, th);
                                return r5.A();
                        }
                    }

                    public /* synthetic */ Function compose(Function function2) {
                        int i3 = i2;
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                zzgdcVar.getClass();
                return new zzgdb(file, zzgdcVar.a, new zzgcz(r5VarA), function);
            case 4:
                File file2 = (File) se3Var.zzb();
                zzgdc zzgdcVar2 = (zzgdc) zzikpVar2.zzb();
                final f6 f6Var2 = (f6) zzikpVar.zzb();
                final int i3 = 2;
                return zzgdcVar2.a(file2, new byte[0], new Function() { // from class: c03
                    public /* synthetic */ Function andThen(Function function2) {
                        int i32 = i3;
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i3) {
                            case 0:
                                f6Var2.d(15308, th);
                                return r5.A();
                            case 1:
                                f6Var2.d(15310, th);
                                return new byte[0];
                            case 2:
                                f6Var2.d(15310, th);
                                return new byte[0];
                            case 3:
                                f6Var2.d(15309, th);
                                return new byte[0];
                            case 4:
                                f6Var2.d(15309, th);
                                return new byte[0];
                            case 5:
                                f6Var2.d(15308, th);
                                return r5.A();
                            case 6:
                                f6Var2.d(20310, th);
                                return new byte[0];
                            case 7:
                                f6Var2.d(20309, th);
                                return new byte[0];
                            default:
                                f6Var2.d(20308, th);
                                return r5.A();
                        }
                    }

                    public /* synthetic */ Function compose(Function function2) {
                        int i32 = i3;
                        return Function$CC.$default$compose(this, function2);
                    }
                });
            case 5:
                File file3 = (File) se3Var.zzb();
                zzgdc zzgdcVar3 = (zzgdc) zzikpVar2.zzb();
                final f6 f6Var3 = (f6) zzikpVar.zzb();
                final int i4 = 4;
                return zzgdcVar3.a(file3, new byte[0], new Function() { // from class: c03
                    public /* synthetic */ Function andThen(Function function2) {
                        int i32 = i4;
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i4) {
                            case 0:
                                f6Var3.d(15308, th);
                                return r5.A();
                            case 1:
                                f6Var3.d(15310, th);
                                return new byte[0];
                            case 2:
                                f6Var3.d(15310, th);
                                return new byte[0];
                            case 3:
                                f6Var3.d(15309, th);
                                return new byte[0];
                            case 4:
                                f6Var3.d(15309, th);
                                return new byte[0];
                            case 5:
                                f6Var3.d(15308, th);
                                return r5.A();
                            case 6:
                                f6Var3.d(20310, th);
                                return new byte[0];
                            case 7:
                                f6Var3.d(20309, th);
                                return new byte[0];
                            default:
                                f6Var3.d(20308, th);
                                return r5.A();
                        }
                    }

                    public /* synthetic */ Function compose(Function function2) {
                        int i32 = i4;
                        return Function$CC.$default$compose(this, function2);
                    }
                });
            case 6:
                File file4 = (File) se3Var.zzb();
                zzgdc zzgdcVar4 = (zzgdc) zzikpVar2.zzb();
                final f6 f6Var4 = (f6) zzikpVar.zzb();
                r5 r5VarA2 = r5.A();
                final int i5 = 5;
                Function function2 = new Function() { // from class: c03
                    public /* synthetic */ Function andThen(Function function22) {
                        int i32 = i5;
                        return Function$CC.$default$andThen(this, function22);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i5) {
                            case 0:
                                f6Var4.d(15308, th);
                                return r5.A();
                            case 1:
                                f6Var4.d(15310, th);
                                return new byte[0];
                            case 2:
                                f6Var4.d(15310, th);
                                return new byte[0];
                            case 3:
                                f6Var4.d(15309, th);
                                return new byte[0];
                            case 4:
                                f6Var4.d(15309, th);
                                return new byte[0];
                            case 5:
                                f6Var4.d(15308, th);
                                return r5.A();
                            case 6:
                                f6Var4.d(20310, th);
                                return new byte[0];
                            case 7:
                                f6Var4.d(20309, th);
                                return new byte[0];
                            default:
                                f6Var4.d(20308, th);
                                return r5.A();
                        }
                    }

                    public /* synthetic */ Function compose(Function function22) {
                        int i32 = i5;
                        return Function$CC.$default$compose(this, function22);
                    }
                };
                zzgdcVar4.getClass();
                return new zzgdb(file4, zzgdcVar4.a, new zzgcz(r5VarA2), function2);
            case 7:
                File file5 = (File) se3Var.zzb();
                zzgdc zzgdcVar5 = (zzgdc) zzikpVar2.zzb();
                final f6 f6Var5 = (f6) zzikpVar.zzb();
                final int i6 = 1;
                return zzgdcVar5.a(file5, new byte[0], new Function() { // from class: c03
                    public /* synthetic */ Function andThen(Function function22) {
                        int i32 = i6;
                        return Function$CC.$default$andThen(this, function22);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i6) {
                            case 0:
                                f6Var5.d(15308, th);
                                return r5.A();
                            case 1:
                                f6Var5.d(15310, th);
                                return new byte[0];
                            case 2:
                                f6Var5.d(15310, th);
                                return new byte[0];
                            case 3:
                                f6Var5.d(15309, th);
                                return new byte[0];
                            case 4:
                                f6Var5.d(15309, th);
                                return new byte[0];
                            case 5:
                                f6Var5.d(15308, th);
                                return r5.A();
                            case 6:
                                f6Var5.d(20310, th);
                                return new byte[0];
                            case 7:
                                f6Var5.d(20309, th);
                                return new byte[0];
                            default:
                                f6Var5.d(20308, th);
                                return r5.A();
                        }
                    }

                    public /* synthetic */ Function compose(Function function22) {
                        int i32 = i6;
                        return Function$CC.$default$compose(this, function22);
                    }
                });
            case 8:
                File file6 = (File) se3Var.zzb();
                zzgdc zzgdcVar6 = (zzgdc) zzikpVar2.zzb();
                final f6 f6Var6 = (f6) zzikpVar.zzb();
                final int i7 = 3;
                return zzgdcVar6.a(file6, new byte[0], new Function() { // from class: c03
                    public /* synthetic */ Function andThen(Function function22) {
                        int i32 = i7;
                        return Function$CC.$default$andThen(this, function22);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i7) {
                            case 0:
                                f6Var6.d(15308, th);
                                return r5.A();
                            case 1:
                                f6Var6.d(15310, th);
                                return new byte[0];
                            case 2:
                                f6Var6.d(15310, th);
                                return new byte[0];
                            case 3:
                                f6Var6.d(15309, th);
                                return new byte[0];
                            case 4:
                                f6Var6.d(15309, th);
                                return new byte[0];
                            case 5:
                                f6Var6.d(15308, th);
                                return r5.A();
                            case 6:
                                f6Var6.d(20310, th);
                                return new byte[0];
                            case 7:
                                f6Var6.d(20309, th);
                                return new byte[0];
                            default:
                                f6Var6.d(20308, th);
                                return r5.A();
                        }
                    }

                    public /* synthetic */ Function compose(Function function22) {
                        int i32 = i7;
                        return Function$CC.$default$compose(this, function22);
                    }
                });
            case 9:
                return new e03((rz2) se3Var.zzb(), (ExecutorService) zzikpVar2.zzb(), (f6) zzikpVar.zzb());
            case 10:
                File file7 = (File) se3Var.zzb();
                zzgdc zzgdcVar7 = (zzgdc) zzikpVar2.zzb();
                final f6 f6Var7 = (f6) zzikpVar.zzb();
                r5 r5VarA3 = r5.A();
                final int i8 = 8;
                Function function3 = new Function() { // from class: c03
                    public /* synthetic */ Function andThen(Function function22) {
                        int i32 = i8;
                        return Function$CC.$default$andThen(this, function22);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i8) {
                            case 0:
                                f6Var7.d(15308, th);
                                return r5.A();
                            case 1:
                                f6Var7.d(15310, th);
                                return new byte[0];
                            case 2:
                                f6Var7.d(15310, th);
                                return new byte[0];
                            case 3:
                                f6Var7.d(15309, th);
                                return new byte[0];
                            case 4:
                                f6Var7.d(15309, th);
                                return new byte[0];
                            case 5:
                                f6Var7.d(15308, th);
                                return r5.A();
                            case 6:
                                f6Var7.d(20310, th);
                                return new byte[0];
                            case 7:
                                f6Var7.d(20309, th);
                                return new byte[0];
                            default:
                                f6Var7.d(20308, th);
                                return r5.A();
                        }
                    }

                    public /* synthetic */ Function compose(Function function22) {
                        int i32 = i8;
                        return Function$CC.$default$compose(this, function22);
                    }
                };
                zzgdcVar7.getClass();
                return new zzgdb(file7, zzgdcVar7.a, new zzgcz(r5VarA3), function3);
            case 11:
                File file8 = (File) se3Var.zzb();
                zzgdc zzgdcVar8 = (zzgdc) zzikpVar2.zzb();
                final f6 f6Var8 = (f6) zzikpVar.zzb();
                final int i9 = 6;
                return zzgdcVar8.a(file8, new byte[0], new Function() { // from class: c03
                    public /* synthetic */ Function andThen(Function function22) {
                        int i32 = i9;
                        return Function$CC.$default$andThen(this, function22);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i9) {
                            case 0:
                                f6Var8.d(15308, th);
                                return r5.A();
                            case 1:
                                f6Var8.d(15310, th);
                                return new byte[0];
                            case 2:
                                f6Var8.d(15310, th);
                                return new byte[0];
                            case 3:
                                f6Var8.d(15309, th);
                                return new byte[0];
                            case 4:
                                f6Var8.d(15309, th);
                                return new byte[0];
                            case 5:
                                f6Var8.d(15308, th);
                                return r5.A();
                            case 6:
                                f6Var8.d(20310, th);
                                return new byte[0];
                            case 7:
                                f6Var8.d(20309, th);
                                return new byte[0];
                            default:
                                f6Var8.d(20308, th);
                                return r5.A();
                        }
                    }

                    public /* synthetic */ Function compose(Function function22) {
                        int i32 = i9;
                        return Function$CC.$default$compose(this, function22);
                    }
                });
            default:
                File file9 = (File) se3Var.zzb();
                zzgdc zzgdcVar9 = (zzgdc) zzikpVar2.zzb();
                final f6 f6Var9 = (f6) zzikpVar.zzb();
                final int i10 = 7;
                return zzgdcVar9.a(file9, new byte[0], new Function() { // from class: c03
                    public /* synthetic */ Function andThen(Function function22) {
                        int i32 = i10;
                        return Function$CC.$default$andThen(this, function22);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i10) {
                            case 0:
                                f6Var9.d(15308, th);
                                return r5.A();
                            case 1:
                                f6Var9.d(15310, th);
                                return new byte[0];
                            case 2:
                                f6Var9.d(15310, th);
                                return new byte[0];
                            case 3:
                                f6Var9.d(15309, th);
                                return new byte[0];
                            case 4:
                                f6Var9.d(15309, th);
                                return new byte[0];
                            case 5:
                                f6Var9.d(15308, th);
                                return r5.A();
                            case 6:
                                f6Var9.d(20310, th);
                                return new byte[0];
                            case 7:
                                f6Var9.d(20309, th);
                                return new byte[0];
                            default:
                                f6Var9.d(20308, th);
                                return r5.A();
                        }
                    }

                    public /* synthetic */ Function compose(Function function22) {
                        int i32 = i10;
                        return Function$CC.$default$compose(this, function22);
                    }
                });
        }
    }

    public /* synthetic */ w32(zzikg zzikgVar, se3 se3Var, zzikp zzikpVar, int i) {
        this.a = i;
        this.b = zzikgVar;
        this.c = se3Var;
        this.d = zzikpVar;
    }

    public w32(zzikp zzikpVar, zzikp zzikpVar2, se3 se3Var) {
        this.a = 0;
        this.b = zzikpVar;
        this.d = zzikpVar2;
        this.c = se3Var;
    }
}
