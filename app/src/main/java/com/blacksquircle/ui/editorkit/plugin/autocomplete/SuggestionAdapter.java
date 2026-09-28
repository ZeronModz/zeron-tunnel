package com.blacksquircle.ui.editorkit.plugin.autocomplete;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import com.blacksquircle.ui.language.base.model.Suggestion;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.zb1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/blacksquircle/ui/editorkit/plugin/autocomplete/SuggestionAdapter;", "Landroid/widget/ArrayAdapter;", "Lcom/blacksquircle/ui/language/base/model/Suggestion;", "Landroid/content/Context;", "context", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "resourceId", "<init>", "(Landroid/content/Context;I)V", "SuggestionViewHolder", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class SuggestionAdapter extends ArrayAdapter<Suggestion> {

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/blacksquircle/ui/editorkit/plugin/autocomplete/SuggestionAdapter$SuggestionViewHolder;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class SuggestionViewHolder {
        public final View a;

        public SuggestionViewHolder(View view) {
            view.getClass();
            this.a = view;
        }

        public abstract void a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestionAdapter(Context context, int i) {
        super(context, i);
        context.getClass();
    }

    public abstract SuggestionViewHolder a();

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        return new zb1(this);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        viewGroup.getClass();
        SuggestionViewHolder suggestionViewHolderA = a();
        suggestionViewHolderA.a();
        return suggestionViewHolderA.a;
    }
}
