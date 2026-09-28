package defpackage;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class v51 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ SeekBarPreference a;

    public v51(SeekBarPreference seekBarPreference) {
        this.a = seekBarPreference;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        SeekBarPreference seekBarPreference = this.a;
        if (z && (seekBarPreference.W || !seekBarPreference.R)) {
            seekBarPreference.B(seekBar);
            return;
        }
        int i2 = i + seekBarPreference.O;
        TextView textView = seekBarPreference.T;
        if (textView != null) {
            textView.setText(String.valueOf(i2));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.a.R = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        SeekBarPreference seekBarPreference = this.a;
        seekBarPreference.R = false;
        if (seekBar.getProgress() + seekBarPreference.O != seekBarPreference.N) {
            seekBarPreference.B(seekBar);
        }
    }
}
