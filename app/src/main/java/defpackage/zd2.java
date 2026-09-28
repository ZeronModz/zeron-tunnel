package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.measurement.zzcr;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.internal.measurement.zzcx;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.internal.measurement.zzdc;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zd2 extends cs1 implements zzcr {
    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeLong(j);
        f(23, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        x52.b(parcelE, bundle);
        f(9, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void clearMeasurementEnabled(long j) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeLong(j);
        f(24, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void generateEventId(zzcu zzcuVar) {
        Parcel parcelE = e();
        x52.c(parcelE, zzcuVar);
        f(22, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getAppInstanceId(zzcu zzcuVar) {
        Parcel parcelE = e();
        x52.c(parcelE, zzcuVar);
        f(20, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getCachedAppInstanceId(zzcu zzcuVar) {
        Parcel parcelE = e();
        x52.c(parcelE, zzcuVar);
        f(19, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getConditionalUserProperties(String str, String str2, zzcu zzcuVar) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        x52.c(parcelE, zzcuVar);
        f(10, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getCurrentScreenClass(zzcu zzcuVar) {
        Parcel parcelE = e();
        x52.c(parcelE, zzcuVar);
        f(17, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getCurrentScreenName(zzcu zzcuVar) {
        Parcel parcelE = e();
        x52.c(parcelE, zzcuVar);
        f(16, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getGmpAppId(zzcu zzcuVar) {
        Parcel parcelE = e();
        x52.c(parcelE, zzcuVar);
        f(21, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getMaxUserProperties(String str, zzcu zzcuVar) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        x52.c(parcelE, zzcuVar);
        f(6, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getSessionId(zzcu zzcuVar) {
        Parcel parcelE = e();
        x52.c(parcelE, zzcuVar);
        f(46, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getTestFlag(zzcu zzcuVar, int i) {
        Parcel parcelE = e();
        x52.c(parcelE, zzcuVar);
        parcelE.writeInt(i);
        f(38, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getUserProperties(String str, String str2, boolean z, zzcu zzcuVar) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        ClassLoader classLoader = x52.a;
        parcelE.writeInt(z ? 1 : 0);
        x52.c(parcelE, zzcuVar);
        f(5, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void initForTests(Map map) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void initialize(IObjectWrapper iObjectWrapper, zzdd zzddVar, long j) {
        Parcel parcelE = e();
        x52.c(parcelE, iObjectWrapper);
        x52.b(parcelE, zzddVar);
        parcelE.writeLong(j);
        f(1, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void isDataCollectionEnabled(zzcu zzcuVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        x52.b(parcelE, bundle);
        parcelE.writeInt(z ? 1 : 0);
        parcelE.writeInt(z2 ? 1 : 0);
        parcelE.writeLong(j);
        f(2, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzcu zzcuVar, long j) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel parcelE = e();
        parcelE.writeInt(5);
        parcelE.writeString(str);
        x52.c(parcelE, iObjectWrapper);
        x52.c(parcelE, iObjectWrapper2);
        x52.c(parcelE, iObjectWrapper3);
        f(33, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j) {
        Parcel parcelE = e();
        x52.b(parcelE, zzdfVar);
        x52.b(parcelE, bundle);
        parcelE.writeLong(j);
        f(53, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel parcelE = e();
        x52.b(parcelE, zzdfVar);
        parcelE.writeLong(j);
        f(54, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel parcelE = e();
        x52.b(parcelE, zzdfVar);
        parcelE.writeLong(j);
        f(55, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel parcelE = e();
        x52.b(parcelE, zzdfVar);
        parcelE.writeLong(j);
        f(56, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcu zzcuVar, long j) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, zzcu zzcuVar, long j) {
        Parcel parcelE = e();
        x52.b(parcelE, zzdfVar);
        x52.c(parcelE, zzcuVar);
        parcelE.writeLong(j);
        f(57, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel parcelE = e();
        x52.b(parcelE, zzdfVar);
        parcelE.writeLong(j);
        f(51, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel parcelE = e();
        x52.b(parcelE, zzdfVar);
        parcelE.writeLong(j);
        f(52, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void performAction(Bundle bundle, zzcu zzcuVar, long j) {
        Parcel parcelE = e();
        x52.b(parcelE, bundle);
        x52.c(parcelE, zzcuVar);
        parcelE.writeLong(j);
        f(32, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void registerOnMeasurementEventListener(zzda zzdaVar) {
        Parcel parcelE = e();
        x52.c(parcelE, zzdaVar);
        f(35, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void resetAnalyticsData(long j) {
        Parcel parcelE = e();
        parcelE.writeLong(j);
        f(12, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void retrieveAndUploadBatches(zzcx zzcxVar) {
        Parcel parcelE = e();
        x52.c(parcelE, zzcxVar);
        f(58, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelE = e();
        x52.b(parcelE, bundle);
        parcelE.writeLong(j);
        f(8, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setConsent(Bundle bundle, long j) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setConsentThirdParty(Bundle bundle, long j) {
        Parcel parcelE = e();
        x52.b(parcelE, bundle);
        parcelE.writeLong(j);
        f(45, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j) {
        Parcel parcelE = e();
        x52.b(parcelE, zzdfVar);
        parcelE.writeString(str);
        parcelE.writeString(str2);
        parcelE.writeLong(j);
        f(50, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setDataCollectionEnabled(boolean z) {
        Parcel parcelE = e();
        ClassLoader classLoader = x52.a;
        parcelE.writeInt(z ? 1 : 0);
        f(39, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelE = e();
        x52.b(parcelE, bundle);
        f(42, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setEventInterceptor(zzda zzdaVar) {
        Parcel parcelE = e();
        x52.c(parcelE, zzdaVar);
        f(34, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setInstanceIdProvider(zzdc zzdcVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel parcelE = e();
        ClassLoader classLoader = x52.a;
        parcelE.writeInt(z ? 1 : 0);
        parcelE.writeLong(j);
        f(11, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setMinimumSessionDuration(long j) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setSessionTimeoutDuration(long j) {
        Parcel parcelE = e();
        parcelE.writeLong(j);
        f(14, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setSgtmDebugInfo(Intent intent) {
        Parcel parcelE = e();
        x52.b(parcelE, intent);
        f(48, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setUserId(String str, long j) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeLong(j);
        f(7, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        x52.c(parcelE, iObjectWrapper);
        parcelE.writeInt(z ? 1 : 0);
        parcelE.writeLong(j);
        f(4, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void unregisterOnMeasurementEventListener(zzda zzdaVar) {
        Parcel parcelE = e();
        x52.c(parcelE, zzdaVar);
        f(36, parcelE);
    }
}
