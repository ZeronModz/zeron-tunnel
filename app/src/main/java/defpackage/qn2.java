package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzdv;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.zzcen;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzgzy;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qn2 extends zzdv {
    public final HashMap a = new HashMap();
    public final Context b;
    public final WeakReference c;
    public final jn2 d;
    public final zzgzy e;
    public gn2 f;

    public qn2(Context context, WeakReference weakReference, jn2 jn2Var, zzgzy zzgzyVar) {
        this.b = context;
        this.c = weakReference;
        this.d = jn2Var;
        this.e = zzgzyVar;
    }

    public static String f(Object obj) {
        ResponseInfo responseInfo;
        zzea zzeaVarZzd;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzeaVarZzd = responseInfo.zzd()) == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        try {
            return zzeaVarZzd.zzj();
        } catch (RemoteException unused) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    public final synchronized void a(String str) {
        HashMap map;
        Object obj;
        try {
            jn2 jn2Var = this.d;
            zzcjl zzcjlVar = jn2Var.d;
            Activity activityZzj = (zzcjlVar == null || zzcjlVar.zzX()) ? null : jn2Var.d.zzj();
            if (activityZzj != null && (obj = (map = this.a).get(str)) != null) {
                l32 l32Var = p32.Pa;
                if (!((Boolean) zzbd.zzc().a(l32Var)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
                    map.remove(str);
                }
                d(f(obj));
                if (obj instanceof AppOpenAd) {
                    ((AppOpenAd) obj).show(activityZzj);
                    return;
                }
                if (obj instanceof InterstitialAd) {
                    ((InterstitialAd) obj).show(activityZzj);
                    return;
                }
                if (obj instanceof RewardedAd) {
                    ((RewardedAd) obj).show(activityZzj, pi2.n);
                    return;
                }
                if (obj instanceof RewardedInterstitialAd) {
                    ((RewardedInterstitialAd) obj).show(activityZzj, pi2.m);
                    return;
                }
                if (((Boolean) zzbd.zzc().a(l32Var)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                    Intent intent = new Intent();
                    Context contextE = e();
                    intent.setClassName(contextE, OutOfContextTestingActivity.CLASS_NAME);
                    intent.putExtra(OutOfContextTestingActivity.AD_UNIT_KEY, str);
                    zzt.zzc();
                    zzs.zzaa(contextE, intent);
                }
            }
        } finally {
        }
    }

    public final synchronized void b(Object obj, String str) {
        this.a.put(str, obj);
        c(f(obj));
    }

    public final synchronized void c(String str) {
        try {
            zzcen zzcenVarE = this.f.e(str);
            ci2 ci2Var = new ci2(this, 4);
            zzcenVarE.addListener(new s33(0, zzcenVarE, ci2Var), this.e);
        } catch (NullPointerException e) {
            zzt.zzh().f("OutOfContextTester.setAdAsOutOfContext", e);
            this.d.b();
        }
    }

    public final synchronized void d(String str) {
        try {
            zzcen zzcenVarE = this.f.e(str);
            ca2 ca2Var = new ca2(this, 18);
            zzcenVarE.addListener(new s33(0, zzcenVarE, ca2Var), this.e);
        } catch (NullPointerException e) {
            zzt.zzh().f("OutOfContextTester.setAdAsShown", e);
            this.d.b();
        }
    }

    public final Context e() {
        Context context = (Context) this.c.get();
        return context == null ? this.b : context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdw
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) a.d(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) a.d(iObjectWrapper2);
        if (context == null || viewGroup == null) {
            return;
        }
        HashMap map = this.a;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof AdView) {
            AdView adView = (AdView) obj;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setTag("layout");
            rn2.b(linearLayout, -1, -1);
            linearLayout.setGravity(17);
            linearLayout.addView(adView);
            adView.setTag("ad_view");
            viewGroup.addView(linearLayout);
            return;
        }
        if (obj instanceof NativeAd) {
            NativeAd nativeAd = (NativeAd) obj;
            NativeAdView nativeAdView = new NativeAdView(context);
            nativeAdView.setTag("ad_view_tag");
            rn2.b(nativeAdView, -1, -1);
            viewGroup.addView(nativeAdView);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setTag("layout_tag");
            linearLayout2.setOrientation(1);
            rn2.b(linearLayout2, -1, -1);
            linearLayout2.setBackgroundColor(-1);
            nativeAdView.addView(linearLayout2);
            Resources resourcesE = zzt.zzh().e();
            linearLayout2.addView(rn2.a(context, resourcesE == null ? "Headline" : resourcesE.getString(R.string.native_headline), android.R.style.TextAppearance.Small, -9210245, 0.0f, "headline_header_tag"));
            String headline = nativeAd.getHeadline();
            if (headline == null) {
                headline = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            View viewA = rn2.a(context, headline, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "headline_tag");
            nativeAdView.setHeadlineView(viewA);
            linearLayout2.addView(viewA);
            linearLayout2.addView(rn2.a(context, resourcesE == null ? "Body" : resourcesE.getString(R.string.native_body), android.R.style.TextAppearance.Small, -9210245, 0.0f, "body_header_tag"));
            String body = nativeAd.getBody();
            if (body == null) {
                body = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            View viewA2 = rn2.a(context, body, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "body_tag");
            nativeAdView.setBodyView(viewA2);
            linearLayout2.addView(viewA2);
            linearLayout2.addView(rn2.a(context, resourcesE == null ? "Media View" : resourcesE.getString(R.string.native_media_view), android.R.style.TextAppearance.Small, -9210245, 0.0f, "media_view_header_tag"));
            MediaView mediaView = new MediaView(context);
            mediaView.setTag("media_view_tag");
            nativeAdView.setMediaView(mediaView);
            linearLayout2.addView(mediaView);
            nativeAdView.setNativeAd(nativeAd);
        }
    }
}
