package com.v2ray.ang.helper;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/v2ray/ang/helper/ItemTouchHelperAdapter;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "fromPosition", "toPosition", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "onItemMove", "(II)Z", "Lmk1;", "onItemMoveCompleted", "()V", "position", "onItemDismiss", "(I)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ItemTouchHelperAdapter {
    void onItemDismiss(int position);

    boolean onItemMove(int fromPosition, int toPosition);

    void onItemMoveCompleted();
}
