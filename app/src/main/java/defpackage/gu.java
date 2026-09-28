package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import dev.zeron.tunnel.R;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class gu extends TextWatcherAdapter {
    public final TextInputLayout a;
    public final String b;
    public final DateFormat c;
    public final kh d;
    public final String e;
    public final r4 f;
    public c80 g;
    public int h = 0;

    public gu(String str, DateFormat dateFormat, TextInputLayout textInputLayout, kh khVar) {
        this.b = str;
        this.c = dateFormat;
        this.a = textInputLayout;
        this.d = khVar;
        this.e = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.f = new r4(22, this, str);
    }

    public abstract void a();

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) || editable.length() == 0) {
            return;
        }
        int length = editable.length();
        String str = this.b;
        if (length >= str.length() || editable.length() < this.h) {
            return;
        }
        char cCharAt = str.charAt(editable.length());
        if (Character.isLetterOrDigit(cCharAt)) {
            return;
        }
        editable.append(cCharAt);
    }

    public abstract void b(Long l);

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.h = charSequence.length();
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        kh khVar = this.d;
        TextInputLayout textInputLayout = this.a;
        r4 r4Var = this.f;
        textInputLayout.removeCallbacks(r4Var);
        textInputLayout.removeCallbacks(this.g);
        textInputLayout.setError(null);
        b(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.b.length()) {
            return;
        }
        try {
            Date date = this.c.parse(charSequence.toString());
            textInputLayout.setError(null);
            long time = date.getTime();
            if (khVar.c.isValid(time)) {
                Calendar calendarD = ol1.d(khVar.a.a);
                calendarD.set(5, 1);
                if (calendarD.getTimeInMillis() <= time) {
                    er0 er0Var = khVar.b;
                    int i4 = er0Var.e;
                    Calendar calendarD2 = ol1.d(er0Var.a);
                    calendarD2.set(5, i4);
                    if (time <= calendarD2.getTimeInMillis()) {
                        b(Long.valueOf(date.getTime()));
                        return;
                    }
                }
            }
            c80 c80Var = new c80(this, time, 4);
            this.g = c80Var;
            textInputLayout.post(c80Var);
        } catch (ParseException unused) {
            textInputLayout.post(r4Var);
        }
    }
}
