package defpackage;

import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.audio.BufferedAudioStream;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BufferedAudioStream b;

    public /* synthetic */ uf(BufferedAudioStream bufferedAudioStream, int i) {
        this.a = i;
        this.b = bufferedAudioStream;
    }

    private final void a() {
        BufferedAudioStream bufferedAudioStream = this.b;
        bufferedAudioStream.k.set(false);
        bufferedAudioStream.g.release();
        synchronized (bufferedAudioStream.e) {
            bufferedAudioStream.f = null;
            bufferedAudioStream.c.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                BufferedAudioStream bufferedAudioStream = this.b;
                bufferedAudioStream.k.set(false);
                bufferedAudioStream.g.stop();
                synchronized (bufferedAudioStream.e) {
                    bufferedAudioStream.f = null;
                    bufferedAudioStream.c.clear();
                    break;
                }
                return;
            case 1:
                BufferedAudioStream bufferedAudioStream2 = this.b;
                try {
                    bufferedAudioStream2.g.start();
                    if (bufferedAudioStream2.k.getAndSet(true)) {
                        return;
                    }
                    bufferedAudioStream2.b();
                    return;
                } catch (AudioStream.AudioStreamException e) {
                    p60.l(e);
                    return;
                }
            case 2:
                a();
                return;
            default:
                this.b.b();
                return;
        }
    }
}
