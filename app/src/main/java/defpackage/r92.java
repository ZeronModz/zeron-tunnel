package defpackage;

import android.media.AudioManager;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzcd;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r92 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ zzcd a;

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        zzcd zzcdVar = this.a;
        zzcdVar.getClass();
        if (i == -3 || i == -2) {
            if (i != -2) {
                zzcdVar.e(4);
                return;
            }
            zzcc zzccVar = zzcdVar.c;
            if (zzccVar != null) {
                zzccVar.zzb(0);
            }
            zzcdVar.e(3);
            return;
        }
        if (i == -1) {
            zzcc zzccVar2 = zzcdVar.c;
            if (zzccVar2 != null) {
                zzccVar2.zzb(-1);
            }
            zzcdVar.d();
            zzcdVar.e(1);
            return;
        }
        if (i != 1) {
            ec1.N(i, "Unknown focus change type: ", new StringBuilder(String.valueOf(i).length() + 27));
            return;
        }
        zzcdVar.e(2);
        zzcc zzccVar3 = zzcdVar.c;
        if (zzccVar3 != null) {
            zzccVar3.zzb(1);
        }
    }
}
