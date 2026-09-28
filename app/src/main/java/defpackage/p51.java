package defpackage;

import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.search.SearchView;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p51 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ p51(SearchView searchView, int i) {
        this.a = i;
        this.b = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        SearchView searchView = this.b;
        switch (i) {
            case 0:
                int i2 = SearchView.D;
                searchView.g();
                break;
            case 1:
                int i3 = SearchView.D;
                if (!searchView.B.equals(SearchView.TransitionState.HIDDEN) && !searchView.B.equals(SearchView.TransitionState.HIDING)) {
                    searchView.o.k();
                    break;
                }
                break;
            default:
                int i4 = SearchView.D;
                searchView.j.setText(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                searchView.e();
                break;
        }
    }
}
