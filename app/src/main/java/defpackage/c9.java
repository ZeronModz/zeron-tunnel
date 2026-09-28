package defpackage;

import android.media.AudioManager$AudioRecordingCallback;
import android.media.AudioRecordingConfiguration;
import androidx.camera.video.internal.audio.AudioStreamImpl;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class c9 extends AudioManager$AudioRecordingCallback {
    public final /* synthetic */ AudioStreamImpl a;

    public c9(AudioStreamImpl audioStreamImpl) {
        this.a = audioStreamImpl;
    }

    public final void onRecordingConfigChanged(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) it.next();
            int clientAudioSessionId = audioRecordingConfiguration.getClientAudioSessionId();
            AudioStreamImpl audioStreamImpl = this.a;
            if (clientAudioSessionId == audioStreamImpl.a.getAudioSessionId()) {
                audioStreamImpl.c(k5.q(audioRecordingConfiguration));
                return;
            }
        }
    }
}
