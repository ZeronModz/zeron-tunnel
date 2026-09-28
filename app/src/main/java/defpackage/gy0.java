package defpackage;

import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzao;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzg;
import com.journeyapps.barcodescanner.Size;
import com.journeyapps.barcodescanner.camera.PreviewScalingStrategy;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class gy0 implements Comparator {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public gy0(zzai zzaiVar, zzg zzgVar) {
        this.b = zzaiVar;
        this.c = zzgVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                PreviewScalingStrategy previewScalingStrategy = (PreviewScalingStrategy) obj3;
                Size size = (Size) obj4;
                return Float.compare(previewScalingStrategy.b((Size) obj2, size), previewScalingStrategy.b((Size) obj, size));
            default:
                zzao zzaoVar = (zzao) obj;
                zzao zzaoVar2 = (zzao) obj2;
                if (zzaoVar instanceof zzat) {
                    return !(zzaoVar2 instanceof zzat) ? 1 : 0;
                }
                if (zzaoVar2 instanceof zzat) {
                    return -1;
                }
                zzai zzaiVar = (zzai) obj4;
                return zzaiVar == null ? zzaoVar.zzc().compareTo(zzaoVar2.zzc()) : (int) n8.z0(zzaiVar.a((zzg) obj3, Arrays.asList(zzaoVar, zzaoVar2)).zzd().doubleValue());
        }
    }

    public gy0(PreviewScalingStrategy previewScalingStrategy, Size size) {
        this.c = previewScalingStrategy;
        this.b = size;
    }
}
