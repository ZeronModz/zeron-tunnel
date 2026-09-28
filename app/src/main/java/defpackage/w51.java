package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class w51 implements View.OnKeyListener {
    public final /* synthetic */ SeekBarPreference a;

    public w51(SeekBarPreference seekBarPreference) {
        this.a = seekBarPreference;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SeekBar seekBar;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        SeekBarPreference seekBarPreference = this.a;
        if ((!seekBarPreference.U && (i == 21 || i == 22)) || i == 23 || i == 66 || (seekBar = seekBarPreference.S) == null) {
            return false;
        }
        return seekBar.onKeyDown(i, keyEvent);
    }
}
