package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzdin;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.messaging.NotificationParams;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class kx implements zzdhc {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;

    public kx(NotificationParams notificationParams) {
        this.a = 1;
        this.b = notificationParams.h("gcm.n.title");
        notificationParams.f("gcm.n.title");
        Object[] objArrE = notificationParams.e("gcm.n.title");
        if (objArrE != null) {
            String[] strArr = new String[objArrE.length];
            for (int i = 0; i < objArrE.length; i++) {
                strArr[i] = String.valueOf(objArrE[i]);
            }
        }
        this.c = notificationParams.h("gcm.n.body");
        notificationParams.f("gcm.n.body");
        Object[] objArrE2 = notificationParams.e("gcm.n.body");
        if (objArrE2 != null) {
            String[] strArr2 = new String[objArrE2.length];
            for (int i2 = 0; i2 < objArrE2.length; i2++) {
                strArr2[i2] = String.valueOf(objArrE2[i2]);
            }
        }
        notificationParams.h("gcm.n.icon");
        if (TextUtils.isEmpty(notificationParams.h("gcm.n.sound2"))) {
            notificationParams.h("gcm.n.sound");
        }
        notificationParams.h("gcm.n.tag");
        notificationParams.h("gcm.n.color");
        notificationParams.h("gcm.n.click_action");
        notificationParams.h("gcm.n.android_channel_id");
        String strH = notificationParams.h("gcm.n.link_android");
        strH = TextUtils.isEmpty(strH) ? notificationParams.h("gcm.n.link") : strH;
        if (!TextUtils.isEmpty(strH)) {
            Uri.parse(strH);
        }
        notificationParams.h("gcm.n.image");
        notificationParams.h("gcm.n.ticker");
        notificationParams.b("gcm.n.notification_priority");
        notificationParams.b("gcm.n.visibility");
        notificationParams.b("gcm.n.notification_count");
        notificationParams.a("gcm.n.sticky");
        notificationParams.a("gcm.n.local_only");
        notificationParams.a("gcm.n.default_sound");
        notificationParams.a("gcm.n.default_vibrate_timings");
        notificationParams.a("gcm.n.default_light_settings");
        String strH2 = notificationParams.h("gcm.n.event_time");
        if (!TextUtils.isEmpty(strH2)) {
            try {
                Long.parseLong(strH2);
            } catch (NumberFormatException unused) {
                NotificationParams.l("gcm.n.event_time");
            }
        }
        notificationParams.d();
        notificationParams.i();
    }

    @Override // com.google.android.gms.internal.ads.zzdhc
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo3zza(Object obj) {
        switch (this.a) {
            case 4:
                ((AppEventListener) obj).onAppEvent(this.b, this.c);
                break;
            default:
                ((zzdin) obj).zzc(this.b, this.c);
                break;
        }
    }

    public kx(DevelopmentPlatformProvider developmentPlatformProvider) {
        this.a = 0;
        Context context = developmentPlatformProvider.a;
        int iE = CommonUtils.e(context, "com.google.firebase.crashlytics.unity_version", TypedValues.Custom.S_STRING);
        if (iE != 0) {
            this.b = "Unity";
            this.c = context.getResources().getString(iE);
            Logger.b.a(2);
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.b = "Flutter";
                this.c = null;
                Logger.b.a(2);
                return;
            } catch (IOException unused) {
            }
        }
        this.b = null;
        this.c = null;
    }

    public /* synthetic */ kx(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }
}
