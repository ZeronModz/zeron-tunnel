package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.f;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class fo0 extends RecyclerView.OnScrollListener {
    public final /* synthetic */ f a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ MaterialCalendar c;

    public fo0(MaterialCalendar materialCalendar, f fVar, MaterialButton materialButton) {
        this.c = materialCalendar;
        this.a = fVar;
        this.b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void b(RecyclerView recyclerView, int i, int i2) {
        kh khVar = this.a.d;
        MaterialCalendar materialCalendar = this.c;
        RecyclerView recyclerView2 = materialCalendar.h0;
        int iN0 = i < 0 ? ((LinearLayoutManager) recyclerView2.getLayoutManager()).N0() : ((LinearLayoutManager) recyclerView2.getLayoutManager()).O0();
        Calendar calendarD = ol1.d(khVar.a.a);
        calendarD.add(2, iN0);
        materialCalendar.d0 = new er0(calendarD);
        Calendar calendarD2 = ol1.d(khVar.a.a);
        calendarD2.add(2, iN0);
        calendarD2.set(5, 1);
        Calendar calendarD3 = ol1.d(calendarD2);
        calendarD3.get(2);
        calendarD3.get(1);
        calendarD3.getMaximum(7);
        calendarD3.getActualMaximum(5);
        calendarD3.getTimeInMillis();
        this.b.setText(qf3.y(calendarD3.getTimeInMillis()));
    }
}
