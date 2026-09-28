package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.f;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class go0 implements View.OnClickListener {
    public final /* synthetic */ f a;
    public final /* synthetic */ MaterialCalendar b;

    public go0(MaterialCalendar materialCalendar, f fVar) {
        this.b = materialCalendar;
        this.a = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.b;
        int iN0 = ((LinearLayoutManager) materialCalendar.h0.getLayoutManager()).N0() + 1;
        if (iN0 < materialCalendar.h0.getAdapter().c()) {
            Calendar calendarD = ol1.d(this.a.d.a.a);
            calendarD.add(2, iN0);
            materialCalendar.X(new er0(calendarD));
        }
    }
}
