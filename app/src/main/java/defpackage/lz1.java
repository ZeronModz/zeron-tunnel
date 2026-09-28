package defpackage;

import com.google.android.gms.internal.ads.zzaul;
import com.google.android.gms.internal.ads.zzauz;
import com.google.android.gms.internal.ads.zzguq;
import com.google.android.gms.internal.ads.zzgus;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lz1 {
    public static final HashMap a;

    static {
        zzguq zzguqVar = new zzguq();
        zzguqVar.a(zzaul.zza, -42L, -64L);
        zzguqVar.a(zzaul.zzb, -6L, -53L);
        zzguqVar.a(zzaul.zzc, -41L, -31L);
        zzguqVar.a(zzaul.zzd, -40L, -28L);
        zzguqVar.a(zzaul.zze, -29L, -37L);
        zzguqVar.a(zzaul.zzf, -80L, -32L);
        zzguqVar.a(zzaul.zzg, -17L, -36L);
        zzguqVar.a(zzaul.zzh, -82L, -35L);
        zzguqVar.a(zzaul.zzi, -63L, -52L);
        zzguqVar.a(zzaul.zzj, -23L, -11L);
        zzguqVar.a(zzaul.zzk, -69L, -68L);
        zzguqVar.a(zzaul.zzl, -62L, -55L);
        zzguqVar.a(zzaul.zzm, -78L, -25L);
        zzguqVar.a(zzaul.zzn, -71L, -3L);
        zzguqVar.a(zzaul.zzo, -18L, -4L);
        zzguqVar.a(zzaul.zzp, -67L, -19L);
        zzguqVar.a(zzaul.zzq, -58L);
        zzguqVar.a(zzaul.zzr, -2L);
        zzguqVar.a(zzaul.zzs, -34L);
        zzguqVar.a(zzaul.zzt, -30L);
        zzguqVar.a(zzaul.zzu, -56L);
        zzguqVar.a(zzaul.zzw, -57L);
        zzguqVar.a(zzaul.zzx, -66L);
        zzguqVar.a(zzaul.zzy, -60L);
        zzguqVar.a(zzaul.zzz, -27L);
        zzguqVar.a(zzaul.zzA, -26L);
        zzguqVar.a(zzaul.zzB, -74L);
        zzguqVar.a(zzaul.zzC, -77L);
        zzguqVar.a(zzaul.zzE, -38L);
        zzguqVar.a(zzaul.zzG, -79L);
        zzguqVar.a(zzaul.zzH, -7L);
        zzguqVar.a(zzaul.zzI, -51L);
        zzguqVar.a(zzaul.zzJ, -9L);
        zzguqVar.a(zzaul.zzK, -47L);
        zzguqVar.a(zzaul.zzL, -70L);
        zzguqVar.a(zzaul.zzM, -14L);
        zzguqVar.a(zzaul.zzN, -5L);
        zzguqVar.a(zzaul.zzO, -39L);
        zzguqVar.a(zzaul.zzP, -8L);
        zzguqVar.a(zzaul.zzQ, -54L);
        zzguqVar.a(zzaul.zzR, -15L);
        zzguqVar.a(zzaul.zzS, -12L);
        zzguqVar.a(zzaul.zzT, -21L);
        zzguqVar.a(zzaul.zzU, -43L);
        zzguqVar.a(zzaul.zzF, -20L);
        zzguqVar.a(zzaul.zzD, -81L);
        zzguqVar.a(zzaul.zzV, -46L);
        zzguqVar.a(zzaul.zzW, -61L);
        zzguqVar.a(zzaul.zzX, -44L);
        zzguqVar.a(zzaul.zzv, -59L);
        zzguqVar.a(zzaul.zzY, -49L);
        zzguqVar.a(zzaul.zzZ, -75L);
        zzguqVar.a(zzaul.zzaa, -24L);
        zzguqVar.a(zzaul.zzaf, -13L);
        zzguqVar.a(zzaul.zzag, -1L);
        zzguqVar.a(zzaul.zzab, -33L);
        zzguqVar.a(zzaul.zzac, -45L);
        zzguqVar.a(zzaul.zzad, -50L);
        zzguqVar.a(zzaul.zzae, -65L);
        zzguqVar.a(zzaul.zzah, -16L);
        zzguqVar.a(zzaul.zzai, -73L);
        zzguqVar.a(zzaul.zzaj, -10L);
        zzguqVar.a(zzaul.zzak, -48L);
        zzguqVar.a(zzaul.zzal, -22L);
        zzguqVar.a(zzaul.zzam, -76L);
        zzguqVar.a(zzaul.zzan, -72L);
        zzgus zzgusVarB = zzguqVar.b();
        i23 it = zzgusVarB.zza().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((Long) entry.getValue()).longValue() > -1 || ((Long) entry.getValue()).longValue() < -82) {
                throw new zzauz(iz1.a("DkWkogARIjm8VAqEzyEdNWdUqAjIW8EtmA==").concat(String.valueOf(entry.getValue())));
            }
        }
        HashMap map = new HashMap();
        i23 it2 = zzgusVarB.zza().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            zzaul zzaulVar = (zzaul) entry2.getKey();
            Long l = (Long) entry2.getValue();
            long jLongValue = l.longValue();
            if (map.containsKey(l)) {
                String strValueOf = String.valueOf(map.get(l));
                String strValueOf2 = String.valueOf(zzaulVar);
                StringBuilder sb = new StringBuilder(strValueOf.length() + String.valueOf(jLongValue).length() + 27 + 5 + strValueOf2.length());
                String strA = iz1.a("H16u7wATM3S4Tl6egTYIeX5f+xfdXtsmmA==");
                String strA2 = iz1.a("cQk=");
                String strA3 = iz1.a("a0ivq0U=");
                sb.append(strA);
                sb.append(jLongValue);
                sb.append(strA2);
                sb.append(strValueOf);
                sb.append(strA3);
                sb.append(strValueOf2);
                throw new zzauz(sb.toString());
            }
            map.put(l, zzaulVar);
        }
        a = map;
    }
}
