package defpackage;

import android.widget.Filter;
import com.blacksquircle.ui.editorkit.plugin.autocomplete.SuggestionAdapter;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class zb1 extends Filter {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ SuggestionAdapter b;

    public zb1(SuggestionAdapter suggestionAdapter) {
        this.b = suggestionAdapter;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList = this.a;
        arrayList.clear();
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = arrayList;
        filterResults.count = arrayList.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        filterResults.getClass();
        SuggestionAdapter suggestionAdapter = this.b;
        suggestionAdapter.clear();
        suggestionAdapter.addAll(this.a);
        suggestionAdapter.notifyDataSetChanged();
    }
}
