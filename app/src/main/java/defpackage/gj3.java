package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import com.google.android.gms.internal.ads.td;
import com.google.android.gms.internal.ads.zzpx;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gj3 extends AudioDeviceCallback {
    public final /* synthetic */ zzpx a;

    public /* synthetic */ gj3(zzpx zzpxVar) {
        this.a = zzpxVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzpx zzpxVar = this.a;
        zzpxVar.a(td.a(zzpxVar.a, zzpxVar.i, zzpxVar.h));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzpx zzpxVar;
        String str = wt2.a;
        int length = audioDeviceInfoArr.length;
        int i = 0;
        while (true) {
            zzpxVar = this.a;
            if (i >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i], zzpxVar.h)) {
                zzpxVar.h = null;
                break;
            }
            i++;
        }
        zzpxVar.a(td.a(zzpxVar.a, zzpxVar.i, zzpxVar.h));
    }
}
