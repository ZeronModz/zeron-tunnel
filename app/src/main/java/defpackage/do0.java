package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class do0 extends c91 {
    public final /* synthetic */ int E;
    public final /* synthetic */ MaterialCalendar F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do0(MaterialCalendar materialCalendar, Context context, int i, int i2) {
        super(context, i, false);
        this.F = materialCalendar;
        this.E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D0(RecyclerView.State state, int[] iArr) {
        MaterialCalendar materialCalendar = this.F;
        RecyclerView recyclerView = materialCalendar.h0;
        if (this.E == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = materialCalendar.h0.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = materialCalendar.h0.getHeight();
        }
    }
}
