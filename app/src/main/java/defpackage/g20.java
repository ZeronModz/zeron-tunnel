package defpackage;

import android.media.MediaCodec;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.util.Range;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.EncoderCallback;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.f;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g20(f fVar, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
        this.a = 2;
        this.e = fVar;
        this.c = bufferInfo;
        this.d = mediaCodec;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EncoderCallback encoderCallback;
        Executor executor;
        long j;
        long j2;
        MediaCodec.BufferInfo bufferInfo;
        switch (this.a) {
            case 0:
                EncoderImpl encoderImpl = (EncoderImpl) this.e;
                int i = this.b;
                String str = (String) this.c;
                Throwable th = (Throwable) this.d;
                Range range = EncoderImpl.E;
                encoderImpl.d(i, str, th);
                return;
            case 1:
                EncoderCallback encoderCallback2 = (EncoderCallback) this.e;
                int i2 = this.b;
                String str2 = (String) this.c;
                Throwable th2 = (Throwable) this.d;
                Range range2 = EncoderImpl.E;
                encoderCallback2.onEncodeError(new EncodeException(i2, str2, th2));
                return;
            case 2:
                f fVar = (f) this.e;
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.c;
                MediaCodec mediaCodec = (MediaCodec) this.d;
                int i3 = this.b;
                boolean z = fVar.j;
                EncoderImpl encoderImpl2 = fVar.k;
                if (z) {
                    km0.g(encoderImpl2.a);
                    return;
                }
                switch (encoderImpl2.t) {
                    case CONFIGURED:
                    case ERROR:
                    case RELEASED:
                        return;
                    case STARTED:
                    case PAUSED:
                    case STOPPING:
                    case PENDING_START:
                    case PENDING_START_PAUSED:
                    case PENDING_RELEASE:
                        synchronized (fVar.k.b) {
                            EncoderImpl encoderImpl3 = fVar.k;
                            encoderCallback = encoderImpl3.r;
                            executor = encoderImpl3.s;
                            break;
                        }
                        if (!fVar.c) {
                            fVar.c = true;
                            try {
                                Objects.requireNonNull(encoderCallback);
                                executor.execute(new j20(encoderCallback, 1));
                            } catch (RejectedExecutionException unused) {
                                km0.c(fVar.k.a);
                            }
                            break;
                        }
                        if (!fVar.a(bufferInfo2)) {
                            try {
                                fVar.k.e.releaseOutputBuffer(i3, false);
                            } catch (MediaCodec.CodecException e) {
                                fVar.k.b(1, e.getMessage(), e);
                                return;
                            }
                            break;
                        } else {
                            if (!fVar.d) {
                                fVar.d = true;
                                EncoderImpl encoderImpl4 = fVar.k;
                                String str3 = encoderImpl4.a;
                                long j3 = bufferInfo2.presentationTimeUs;
                                Objects.toString(encoderImpl4.p);
                                SystemClock.uptimeMillis();
                                SystemClock.elapsedRealtime();
                                km0.a(str3);
                            }
                            long j4 = fVar.k.v;
                            if (j4 > 0) {
                                j = bufferInfo2.presentationTimeUs;
                                j2 = j - j4;
                            } else {
                                j = bufferInfo2.presentationTimeUs;
                                j2 = j;
                            }
                            if (j == j2) {
                                bufferInfo = bufferInfo2;
                            } else {
                                jx0.g(null, j2 > fVar.g);
                                bufferInfo = new MediaCodec.BufferInfo();
                                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, j2, bufferInfo2.flags);
                            }
                            fVar.g = bufferInfo.presentationTimeUs;
                            try {
                                fVar.c(new b20(mediaCodec, i3, bufferInfo), encoderCallback, executor);
                            } catch (MediaCodec.CodecException e2) {
                                fVar.k.b(1, e2.getMessage(), e2);
                                return;
                            }
                            break;
                        }
                        if (fVar.e) {
                            return;
                        }
                        Range range3 = EncoderImpl.E;
                        if ((bufferInfo2.flags & 4) == 0) {
                            if (!fVar.b) {
                                return;
                            }
                            EncoderImpl encoderImpl5 = fVar.k;
                            if (!encoderImpl5.C || bufferInfo2.presentationTimeUs <= ((Long) encoderImpl5.u.getUpper()).longValue()) {
                                return;
                            }
                        }
                        fVar.b();
                        return;
                    default:
                        s31.e(fVar.k.t, "Unknown state: ");
                        return;
                }
            default:
                Uploader uploader = (Uploader) this.e;
                TransportContext transportContext = (TransportContext) this.c;
                int i4 = this.b;
                Runnable runnable = (Runnable) this.d;
                SynchronizationGuard synchronizationGuard = uploader.f;
                try {
                    try {
                        EventStore eventStore = uploader.c;
                        Objects.requireNonNull(eventStore);
                        synchronizationGuard.runCriticalSection(new q21(eventStore, 3));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) uploader.a.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            synchronizationGuard.runCriticalSection(new qi(i4, uploader, transportContext));
                        } else {
                            uploader.a(transportContext, i4);
                        }
                    } catch (Throwable th3) {
                        runnable.run();
                        throw th3;
                    }
                    break;
                } catch (SynchronizationException unused2) {
                    uploader.d.schedule(transportContext, i4 + 1);
                }
                runnable.run();
                return;
        }
    }

    public /* synthetic */ g20(Uploader uploader, TransportContext transportContext, int i, Runnable runnable) {
        this.a = 3;
        this.e = uploader;
        this.c = transportContext;
        this.b = i;
        this.d = runnable;
    }

    public /* synthetic */ g20(Object obj, int i, String str, Throwable th, int i2) {
        this.a = i2;
        this.e = obj;
        this.b = i;
        this.c = str;
        this.d = th;
    }
}
