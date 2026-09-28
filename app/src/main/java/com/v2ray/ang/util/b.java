package com.v2ray.ang.util;

import android.animation.Animator;
import android.view.ViewGroup;
import com.v2ray.ang.util.FlipShareView;
import defpackage.d70;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends d70 {
    public final /* synthetic */ FlipShareView a;

    public b(FlipShareView flipShareView) {
        this.a = flipShareView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = FlipShareView.x;
        FlipShareView flipShareView = this.a;
        ViewGroup viewGroup = (ViewGroup) flipShareView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(flipShareView);
        }
        FlipShareView.OnFlipClickListener onFlipClickListener = flipShareView.w;
        if (onFlipClickListener != null) {
            onFlipClickListener.dismiss();
        }
    }
}
