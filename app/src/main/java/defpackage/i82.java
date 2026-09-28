package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbwo;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class i82 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzbwo b;

    public /* synthetic */ i82(zzbwo zzbwoVar, int i) {
        this.a = i;
        this.b = zzbwoVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        zzbwo zzbwoVar = this.b;
        switch (i2) {
            case 0:
                Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
                data.putExtra("title", zzbwoVar.e);
                data.putExtra("eventLocation", zzbwoVar.i);
                data.putExtra("description", zzbwoVar.h);
                long j = zzbwoVar.f;
                if (j > -1) {
                    data.putExtra("beginTime", j);
                }
                long j2 = zzbwoVar.g;
                if (j2 > -1) {
                    data.putExtra("endTime", j2);
                }
                data.setFlags(268435456);
                zzt.zzc();
                zzs.zzaa(zzbwoVar.d, data);
                break;
            default:
                zzbwoVar.a("Operation denied by user.");
                break;
        }
    }
}
