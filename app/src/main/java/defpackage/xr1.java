package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import dev.zeron.tunnel.R;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.g;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class xr1 extends RecyclerView.Adapter {
    public final MaterialCalendar d;

    public xr1(MaterialCalendar materialCalendar) {
        this.d = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int c() {
        return this.d.b0.f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void k(RecyclerView.ViewHolder viewHolder, int i) {
        MaterialCalendar materialCalendar = this.d;
        int i2 = materialCalendar.b0.a.c + i;
        TextView textView = ((wr1) viewHolder).u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(ol1.h().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        mh mhVar = materialCalendar.f0;
        Calendar calendarH = ol1.h();
        lh lhVar = (lh) (calendarH.get(1) == i2 ? mhVar.f : mhVar.d);
        Iterator<Long> it = materialCalendar.a0.getSelectedDays().iterator();
        while (it.hasNext()) {
            calendarH.setTimeInMillis(it.next().longValue());
            if (calendarH.get(1) == i2) {
                lhVar = (lh) mhVar.e;
            }
        }
        lhVar.b(textView);
        textView.setOnClickListener(new g(this, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder m(ViewGroup viewGroup, int i) {
        return new wr1((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
