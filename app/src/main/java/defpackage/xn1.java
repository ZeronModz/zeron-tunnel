package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xn1 extends ao1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xn1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ao1, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) obj;
                viewPager2.e = true;
                viewPager2.l.l = true;
                break;
            default:
                ((eo1) obj).a();
                break;
        }
    }
}
