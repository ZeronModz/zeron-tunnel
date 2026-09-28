package defpackage;

import android.util.Range;
import androidx.camera.video.internal.encoder.EncoderImpl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EncoderImpl b;

    public /* synthetic */ e20(EncoderImpl encoderImpl, int i) {
        this.a = i;
        this.b = encoderImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        EncoderImpl encoderImpl = this.b;
        switch (i) {
            case 0:
                Range range = EncoderImpl.E;
                xg0.a(encoderImpl.a(), new jx2(encoderImpl, 7), encoderImpl.h);
                break;
            case 1:
                Range range2 = EncoderImpl.E;
                int iOrdinal = encoderImpl.t.ordinal();
                if (iOrdinal == 1) {
                    encoderImpl.f();
                } else if (iOrdinal == 6 || iOrdinal == 8) {
                    u7.p("Encoder is released");
                }
                break;
            case 2:
                Range range3 = EncoderImpl.E;
                encoderImpl.B = true;
                if (encoderImpl.A) {
                    encoderImpl.e.stop();
                    encoderImpl.g();
                }
                break;
            case 3:
                Range range4 = EncoderImpl.E;
                encoderImpl.h.execute(new e20(encoderImpl, 4));
                break;
            default:
                Range range5 = EncoderImpl.E;
                if (encoderImpl.w) {
                    km0.g(encoderImpl.a);
                    encoderImpl.x = null;
                    encoderImpl.i();
                    encoderImpl.w = false;
                }
                break;
        }
    }
}
