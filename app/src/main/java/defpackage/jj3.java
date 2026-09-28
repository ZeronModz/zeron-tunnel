package defpackage;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.cloudmessaging.IMessengerCompat;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.internal.ads.zzdr;
import com.google.android.gms.internal.ads.zzwg;
import com.google.android.gms.internal.ads.zzwu;
import com.google.android.gms.internal.ads.zzwv;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class jj3 implements zzdr {
    public final Object a;
    public final Object b;

    public jj3(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.a = new Messenger(iBinder);
            this.b = null;
        } else if (Objects.equals(interfaceDescriptor, IMessengerCompat.DESCRIPTOR)) {
            this.b = new zzd(iBinder);
            this.a = null;
        } else {
            "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor));
            fj3.b();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public /* synthetic */ void zza(Object obj) {
        ((zzwv) obj).zzam(0, ((zzwu) this.a).a, (zzwg) this.b);
    }

    public /* synthetic */ jj3(zzwu zzwuVar, zzwg zzwgVar) {
        this.a = zzwuVar;
        this.b = zzwgVar;
    }
}
