package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.video.VideoCapabilities;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.datastore.preferences.protobuf.Internal$EnumLite;
import androidx.datastore.preferences.protobuf.Internal$EnumLiteMap;
import androidx.datastore.preferences.protobuf.Syntax;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzdc;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.common.internal.zaj;
import com.google.android.gms.internal.ads.zzado;
import com.google.android.gms.internal.ads.zzaeo;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzaeu;
import com.google.android.gms.internal.ads.zzaex;
import com.google.android.gms.internal.ads.zzafy;
import com.google.android.gms.internal.ads.zzagh;
import com.google.android.gms.internal.ads.zzaij;
import com.google.android.gms.internal.ads.zzamd;
import com.google.android.gms.internal.ads.zzamf;
import com.google.android.gms.internal.ads.zzbda;
import com.google.android.gms.internal.ads.zzbkz;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbv;
import com.google.android.gms.internal.ads.zzbxo;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzcdg;
import com.google.android.gms.internal.ads.zzibw;
import com.google.android.gms.stats.zzd;
import com.google.common.base.Function;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.installations.time.Clock;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.util.DesugarCollections;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class ed1 implements Internal$EnumLiteMap, Clock, Function, VideoCapabilities, zaj, RewardItem, zzq, zzado, zzaeo, zzaex, zzaij, zzamd, zzd, ComponentFactory, zzibw {
    public static ed1 b;
    public static final /* synthetic */ ed1 c = new ed1(10);
    public static final /* synthetic */ ed1 d = new ed1(11);
    public static final /* synthetic */ ed1 e = new ed1(13);
    public static final /* synthetic */ ed1 f = new ed1(14);
    public static final /* synthetic */ ed1 g = new ed1(16);
    public static final /* synthetic */ ed1 h = new ed1(17);
    public static final /* synthetic */ ed1 i = new ed1(18);
    public static final /* synthetic */ ed1 j = new ed1(19);
    public static final /* synthetic */ ed1 k = new ed1(21);
    public static final /* synthetic */ ed1 l = new ed1(22);
    public static final /* synthetic */ ed1 m = new ed1(23);
    public static final /* synthetic */ ed1 n = new ed1(24);
    public static final /* synthetic */ ed1 o = new ed1(25);
    public static final /* synthetic */ ed1 p = new ed1(27);
    public static final /* synthetic */ ed1 q = new ed1(28);
    public final /* synthetic */ int a;

    public /* synthetic */ ed1(int i2) {
        this.a = i2;
    }

    public boolean a(CharSequence charSequence) {
        return charSequence instanceof ix0;
    }

    @Override // com.google.common.base.Function, androidx.camera.core.impl.utils.futures.AsyncFunction
    public Object apply(Object obj) {
        return DesugarCollections.unmodifiableMap((Map) obj);
    }

    @Override // com.google.firebase.components.ComponentFactory
    public /* synthetic */ Object create(ComponentContainer componentContainer) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(componentContainer);
    }

    @Override // com.google.firebase.installations.time.Clock
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // androidx.camera.video.VideoCapabilities
    public VideoValidatedEncoderProfilesProxy findNearestHigherSupportedEncoderProfilesFor(Size size, DynamicRange dynamicRange) {
        return null;
    }

    @Override // androidx.camera.video.VideoCapabilities
    public b01 findNearestHigherSupportedQualityFor(Size size, DynamicRange dynamicRange) {
        return b01.g;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLiteMap
    public Internal$EnumLite findValueByNumber(int i2) {
        return Syntax.forNumber(i2);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        return 1;
    }

    @Override // androidx.camera.video.VideoCapabilities
    public VideoValidatedEncoderProfilesProxy getProfiles(b01 b01Var, DynamicRange dynamicRange) {
        return null;
    }

    @Override // androidx.camera.video.VideoCapabilities
    public Set getSupportedDynamicRanges() {
        return new HashSet();
    }

    @Override // androidx.camera.video.VideoCapabilities
    public List getSupportedQualities(DynamicRange dynamicRange) {
        return new ArrayList();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public String getType() {
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    @Override // com.google.android.gms.common.internal.zaj
    public boolean isConnected() {
        return false;
    }

    @Override // androidx.camera.video.VideoCapabilities
    public boolean isQualitySupported(b01 b01Var, DynamicRange dynamicRange) {
        return false;
    }

    @Override // androidx.camera.video.VideoCapabilities
    public boolean isStabilizationSupported() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        switch (this.a) {
            case 10:
                int i2 = r82.a;
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                return iInterfaceQueryLocalInterface instanceof zzbxv ? (zzbxv) iInterfaceQueryLocalInterface : new q82(iBinder);
            case 11:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                return iInterfaceQueryLocalInterface2 instanceof zzdx ? (zzdx) iInterfaceQueryLocalInterface2 : new zzdx(iBinder);
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 20:
            default:
                int i3 = i12.a;
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
                return iInterfaceQueryLocalInterface3 instanceof zzbda ? (zzbda) iInterfaceQueryLocalInterface3 : new h12(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
            case 16:
                int i4 = pa2.a;
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface4 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
                return iInterfaceQueryLocalInterface4 instanceof zzcdg ? (zzcdg) iInterfaceQueryLocalInterface4 : new oa2(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
            case 17:
                int i5 = o82.a;
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface5 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
                return iInterfaceQueryLocalInterface5 instanceof zzbxo ? (zzbxo) iInterfaceQueryLocalInterface5 : new n82(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
            case 19:
                int i6 = o62.a;
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface6 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
                return iInterfaceQueryLocalInterface6 instanceof zzbpn ? (zzbpn) iInterfaceQueryLocalInterface6 : new n62(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
            case 21:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface7 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                return iInterfaceQueryLocalInterface7 instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface7 : new zzbu(iBinder);
            case 22:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface8 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                return iInterfaceQueryLocalInterface8 instanceof zzcl ? (zzcl) iInterfaceQueryLocalInterface8 : new zzcl(iBinder);
            case 23:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface9 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                return iInterfaceQueryLocalInterface9 instanceof zzdc ? (zzdc) iInterfaceQueryLocalInterface9 : new zzdc(iBinder);
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                int i7 = f52.a;
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface10 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                return iInterfaceQueryLocalInterface10 instanceof zzbkz ? (zzbkz) iInterfaceQueryLocalInterface10 : new e52(iBinder);
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                int i8 = j52.a;
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface11 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
                return iInterfaceQueryLocalInterface11 instanceof zzblf ? (zzblf) iInterfaceQueryLocalInterface11 : new i52(iBinder);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public int zzb(yk3 yk3Var) {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public zzamf zzc(yk3 yk3Var) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public zzagh zzu(int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public void zzv() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public void zzw(zzafy zzafyVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public void zzb() {
    }

    public /* synthetic */ ed1(Object obj, int i2) {
        this.a = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public void zzd(zzbv zzbvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public boolean zza(yk3 yk3Var) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzado
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public void mo17zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public /* synthetic */ Constructor zza() {
        switch (this.a) {
            case 13:
                int[] iArr = zzaeq.c;
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzaeu.class).getConstructor(null);
            default:
                int[] iArr2 = zzaeq.c;
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzaeu.class).getConstructor(Integer.TYPE);
                }
                return null;
        }
    }
}
