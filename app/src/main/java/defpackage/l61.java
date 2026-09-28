package defpackage;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.config.VideoEncoderConfigDefaultResolver;
import androidx.camera.video.internal.config.VideoEncoderConfigVideoProfileResolver;
import androidx.camera.video.internal.config.c;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.camera.video.j;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.b;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.v2ray.ang.adapter.ServerAdapter;
import defpackage.ez0;
import defpackage.io0;
import defpackage.km0;
import defpackage.nc1;
import java.util.Objects;
import kotlin.Lazy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l61 implements OnUserEarnedRewardListener, CallbackToFutureAdapter$Resolver {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l61(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(final b bVar) {
        final j jVar = (j) this.a;
        final SurfaceRequest surfaceRequest = (SurfaceRequest) this.b;
        Timebase timebase = (Timebase) this.c;
        VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy = (VideoValidatedEncoderProfilesProxy) this.d;
        bp0 bp0Var = (bp0) this.e;
        DynamicRange dynamicRange = surfaceRequest.c;
        ed edVarB = c.b(bp0Var, dynamicRange, videoValidatedEncoderProfilesProxy);
        um1 um1Var = ((xb) bp0Var).a;
        Size size = surfaceRequest.b;
        Range range = surfaceRequest.d;
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = edVarB.c;
        try {
            Encoder encoderCreateEncoder = jVar.c.createEncoder(jVar.a, (cd) (videoProfileProxy != null ? new VideoEncoderConfigVideoProfileResolver(edVarB.a, timebase, um1Var, size, videoProfileProxy, dynamicRange, range) : new VideoEncoderConfigDefaultResolver(edVarB.a, timebase, um1Var, size, dynamicRange, range)).get());
            jVar.d = encoderCreateEncoder;
            Encoder.EncoderInput input = encoderCreateEncoder.getInput();
            if (input instanceof Encoder.SurfaceInput) {
                ((Encoder.SurfaceInput) input).setOnSurfaceUpdateListener(jVar.b, new Encoder.SurfaceInput.OnSurfaceUpdateListener() { // from class: androidx.camera.video.i
                    @Override // androidx.camera.video.internal.encoder.Encoder.SurfaceInput.OnSurfaceUpdateListener
                    public final void onSurfaceUpdate(Surface surface) {
                        androidx.camera.core.impl.utils.executor.b bVar2;
                        j jVar2 = jVar;
                        int iOrdinal = jVar2.i.ordinal();
                        androidx.concurrent.futures.b bVar3 = bVar;
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                SurfaceRequest surfaceRequest2 = surfaceRequest;
                                if (surfaceRequest2.a()) {
                                    Objects.toString(surfaceRequest2, "EMPTY");
                                    km0.a("VideoEncoderSession");
                                    bVar3.b(null);
                                    jVar2.a();
                                    return;
                                }
                                jVar2.e = surface;
                                Objects.toString(surface);
                                km0.a("VideoEncoderSession");
                                surfaceRequest2.b(surface, jVar2.b, new nc1(jVar2, 2));
                                jVar2.i = VideoEncoderSession$VideoEncoderState.READY;
                                bVar3.b(jVar2.d);
                                return;
                            }
                            if (iOrdinal != 2) {
                                if (iOrdinal == 3) {
                                    if (jVar2.h != null && (bVar2 = jVar2.g) != null) {
                                        bVar2.execute(new ez0(25, jVar2, surface));
                                    }
                                    Objects.toString(surface);
                                    km0.g("VideoEncoderSession");
                                    return;
                                }
                                if (iOrdinal != 4) {
                                    io0.q("State ", jVar2.i, " is not handled");
                                    return;
                                }
                            }
                        }
                        Objects.toString(jVar2.i);
                        km0.a("VideoEncoderSession");
                        bVar3.b(null);
                    }
                });
            } else {
                bVar.d(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            }
        } catch (InvalidConfigException e) {
            km0.c("VideoEncoderSession");
            bVar.d(e);
        }
        return "ConfigureVideoEncoderFuture " + jVar;
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) throws JSONException {
        View view = (View) this.a;
        JSONArray jSONArray = (JSONArray) this.b;
        ServerAdapter serverAdapter = (ServerAdapter) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        rewardItem.getClass();
        view.setVisibility(0);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", str);
        jSONObject.put("dateCreated", str2);
        jSONArray.put(jSONObject);
        Lazy lazy = zq0.a;
        String string = jSONArray.toString();
        string.getClass();
        zq0.u().i("BoostedServer", string);
        qf3.L(serverAdapter.d, "Server Boosted!!!");
    }
}
