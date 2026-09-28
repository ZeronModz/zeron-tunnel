package me.ibrahimsn.lib;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.core.view.h;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs$CastExtraArgs;
import defpackage.a91;
import defpackage.c11;
import defpackage.in;
import defpackage.mk1;
import defpackage.nx2;
import defpackage.qj1;
import defpackage.r31;
import defpackage.rb0;
import defpackage.xu;
import defpackage.yg0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u001c\u0018\u00002\u00020\u0001:\u0001gB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\u0010\u001a\u00020\u000e2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0012\u001a\u00020\u000e2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\u0004\b\u0012\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0010\u0010\u0018R$\u0010 \u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u0012\u0010\u001fR0\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0011R0\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010\u0011R&\u00100\u001a\u00020\u00062\b\b\u0001\u0010+\u001a\u00020\u00068G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R&\u00103\u001a\u00020\u00062\b\b\u0001\u0010+\u001a\u00020\u00068G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R&\u00109\u001a\u0002042\b\b\u0001\u0010+\u001a\u0002048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R&\u0010<\u001a\u0002042\b\b\u0001\u0010+\u001a\u0002048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u00106\"\u0004\b;\u00108R&\u0010?\u001a\u0002042\b\b\u0001\u0010+\u001a\u0002048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u00106\"\u0004\b>\u00108R$\u0010B\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010-\"\u0004\bA\u0010/R&\u0010E\u001a\u0002042\b\b\u0001\u0010+\u001a\u0002048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u00106\"\u0004\bD\u00108R&\u0010H\u001a\u00020\u00062\b\b\u0001\u0010+\u001a\u00020\u00068G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010-\"\u0004\bG\u0010/R&\u0010K\u001a\u0002042\b\b\u0001\u0010+\u001a\u0002048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u00106\"\u0004\bJ\u00108R$\u0010Q\u001a\u00020L2\u0006\u0010+\u001a\u00020L8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR&\u0010T\u001a\u0002042\b\b\u0001\u0010+\u001a\u0002048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u00106\"\u0004\bS\u00108R&\u0010W\u001a\u0002042\b\b\u0001\u0010+\u001a\u0002048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u00106\"\u0004\bV\u00108R&\u0010Z\u001a\u00020\u00062\b\b\u0001\u0010+\u001a\u00020\u00068G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010-\"\u0004\bY\u0010/R&\u0010]\u001a\u00020\u00062\b\b\u0001\u0010+\u001a\u00020\u00068G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010-\"\u0004\b\\\u0010/R&\u0010`\u001a\u00020\u00062\b\b\u0001\u0010+\u001a\u00020\u00068G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010-\"\u0004\b_\u0010/R&\u0010c\u001a\u00020\u00062\b\b\u0001\u0010+\u001a\u00020\u00068G@FX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010-\"\u0004\bb\u0010/R$\u0010f\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010-\"\u0004\be\u0010/¨\u0006h"}, d2 = {"Lme/ibrahimsn/lib/SmoothBottomBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "position", "Lmk1;", ServiceSpecificExtraArgs$CastExtraArgs.LISTENER, "setOnItemSelectedListener", "(Lkotlin/jvm/functions/Function1;)V", "setOnItemReselectedListener", "Lme/ibrahimsn/lib/OnItemSelectedListener;", "w", "Lme/ibrahimsn/lib/OnItemSelectedListener;", "getOnItemSelectedListener", "()Lme/ibrahimsn/lib/OnItemSelectedListener;", "(Lme/ibrahimsn/lib/OnItemSelectedListener;)V", "onItemSelectedListener", "Lme/ibrahimsn/lib/OnItemReselectedListener;", "x", "Lme/ibrahimsn/lib/OnItemReselectedListener;", "getOnItemReselectedListener", "()Lme/ibrahimsn/lib/OnItemReselectedListener;", "(Lme/ibrahimsn/lib/OnItemReselectedListener;)V", "onItemReselectedListener", "y", "Lkotlin/jvm/functions/Function1;", "getOnItemSelected", "()Lkotlin/jvm/functions/Function1;", "setOnItemSelected", "onItemSelected", "z", "getOnItemReselected", "setOnItemReselected", "onItemReselected", "value", "getBarBackgroundColor", "()I", "setBarBackgroundColor", "(I)V", "barBackgroundColor", "getBarIndicatorColor", "setBarIndicatorColor", "barIndicatorColor", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "getBarIndicatorRadius", "()F", "setBarIndicatorRadius", "(F)V", "barIndicatorRadius", "getBarSideMargins", "setBarSideMargins", "barSideMargins", "getBarCornerRadius", "setBarCornerRadius", "barCornerRadius", "getBarCorners", "setBarCorners", "barCorners", "getItemTextSize", "setItemTextSize", "itemTextSize", "getItemTextColor", "setItemTextColor", "itemTextColor", "getItemPadding", "setItemPadding", "itemPadding", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "getItemAnimDuration", "()J", "setItemAnimDuration", "(J)V", "itemAnimDuration", "getItemIconSize", "setItemIconSize", "itemIconSize", "getItemIconMargin", "setItemIconMargin", "itemIconMargin", "getItemIconTint", "setItemIconTint", "itemIconTint", "getItemIconTintActive", "setItemIconTintActive", "itemIconTintActive", "getItemFontFamily", "setItemFontFamily", "itemFontFamily", "getItemMenuRes", "setItemMenuRes", "itemMenuRes", "getItemActiveIndex", "setItemActiveIndex", "itemActiveIndex", "Companion", "lib_release"}, k = 1, mv = {1, 4, 2})
public final class SmoothBottomBar extends View {
    public static final /* synthetic */ int E = 0;
    public final Paint A;
    public final Paint B;
    public final Paint C;
    public final AccessibleExploreByTouchHelper D;
    public float a;
    public int b;
    public float c;
    public final RectF d;
    public List e;
    public int f;
    public int g;
    public float h;
    public float i;
    public float j;
    public int k;
    public float l;
    public long m;
    public float n;
    public float o;
    public int p;
    public int q;
    public int r;
    public float s;
    public int t;
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public OnItemSelectedListener onItemSelectedListener;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public OnItemReselectedListener onItemReselectedListener;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public Function1 onItemSelected;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public Function1 onItemReselected;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004¨\u0006\u001e"}, d2 = {"Lme/ibrahimsn/lib/SmoothBottomBar$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ALL_CORNERS", "I", "BOTTOM_LEFT_CORNER", "BOTTOM_RIGHT_CORNER", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "DEFAULT_ANIM_DURATION", "J", "DEFAULT_BAR_CORNERS", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "DEFAULT_BAR_CORNER_RADIUS", "F", "DEFAULT_CORNER_RADIUS", "DEFAULT_ICON_MARGIN", "DEFAULT_ICON_SIZE", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "DEFAULT_INDICATOR_COLOR", "Ljava/lang/String;", "DEFAULT_ITEM_PADDING", "DEFAULT_SIDE_MARGIN", "DEFAULT_TEXT_SIZE", "DEFAULT_TINT", "INVALID_RES", "NO_CORNERS", "OPAQUE", "TOP_LEFT_CORNER", "TOP_RIGHT_CORNER", "TRANSPARENT", "lib_release"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmoothBottomBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.b = getQ();
        this.c = getI();
        this.d = new RectF();
        this.e = EmptyList.INSTANCE;
        this.f = -1;
        this.g = Color.parseColor("#2DFFFFFF");
        this.h = qj1.q(context, 20.0f);
        this.i = qj1.q(context, 10.0f);
        this.j = qj1.q(context, 0.0f);
        this.k = 3;
        this.l = qj1.q(context, 10.0f);
        this.m = 200L;
        this.n = qj1.q(context, 18.0f);
        this.o = qj1.q(context, 4.0f);
        this.p = Color.parseColor("#C8FFFFFF");
        this.q = -1;
        this.r = -1;
        this.s = qj1.q(context, 11.0f);
        this.t = -1;
        this.u = -1;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(getG());
        this.A = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        paint2.setColor(getG());
        this.B = paint2;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        paint3.setColor(getR());
        paint3.setTextSize(getS());
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setFakeBoldText(true);
        this.C = paint3;
        Context context2 = getContext();
        context2.getClass();
        TypedArray typedArrayObtainStyledAttributes = context2.getTheme().obtainStyledAttributes(attributeSet, c11.a, i, 0);
        try {
            try {
                setBarBackgroundColor(typedArrayObtainStyledAttributes.getColor(1, getF()));
                setBarIndicatorColor(typedArrayObtainStyledAttributes.getColor(9, getG()));
                setBarIndicatorRadius(typedArrayObtainStyledAttributes.getDimension(10, getH()));
                setBarSideMargins(typedArrayObtainStyledAttributes.getDimension(14, getI()));
                setBarCornerRadius(typedArrayObtainStyledAttributes.getDimension(2, getJ()));
                setBarCorners(typedArrayObtainStyledAttributes.getInteger(3, getK()));
                setItemPadding(typedArrayObtainStyledAttributes.getDimension(12, getL()));
                setItemTextColor(typedArrayObtainStyledAttributes.getColor(15, getR()));
                setItemTextSize(typedArrayObtainStyledAttributes.getDimension(16, getS()));
                setItemIconSize(typedArrayObtainStyledAttributes.getDimension(6, getN()));
                setItemIconMargin(typedArrayObtainStyledAttributes.getDimension(5, getO()));
                setItemIconTint(typedArrayObtainStyledAttributes.getColor(7, getP()));
                setItemIconTintActive(typedArrayObtainStyledAttributes.getColor(8, getQ()));
                setItemActiveIndex(typedArrayObtainStyledAttributes.getInt(0, getV()));
                setItemFontFamily(typedArrayObtainStyledAttributes.getResourceId(11, getT()));
                setItemAnimDuration(typedArrayObtainStyledAttributes.getInt(4, (int) getM()));
                setItemMenuRes(typedArrayObtainStyledAttributes.getResourceId(13, getU()));
            } catch (Exception e) {
                e.printStackTrace();
            }
            AccessibleExploreByTouchHelper accessibleExploreByTouchHelper = new AccessibleExploreByTouchHelper(this, this.e, new AnonymousClass1(this));
            this.D = accessibleExploreByTouchHelper;
            h.p(this, accessibleExploreByTouchHelper);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void a() {
        if (this.e.isEmpty()) {
            return;
        }
        int i = 0;
        for (BottomBarItem bottomBarItem : this.e) {
            if (i == getV()) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(bottomBarItem.e, 255);
                valueAnimatorOfInt.setDuration(getM());
                valueAnimatorOfInt.addUpdateListener(new in(this, bottomBarItem));
                valueAnimatorOfInt.start();
            } else {
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(bottomBarItem.e, 0);
                valueAnimatorOfInt2.setDuration(getM());
                valueAnimatorOfInt2.addUpdateListener(new in(this, bottomBarItem));
                valueAnimatorOfInt2.start();
            }
            i++;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.c, ((BottomBarItem) this.e.get(getV())).d.left);
        valueAnimatorOfFloat.setDuration(getM());
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new a91(this, 0));
        valueAnimatorOfFloat.start();
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(getP()), Integer.valueOf(getQ()));
        valueAnimatorOfObject.setDuration(getM());
        valueAnimatorOfObject.addUpdateListener(new a91(this, 1));
        valueAnimatorOfObject.start();
    }

    public final void b(int i) {
        AccessibleExploreByTouchHelper accessibleExploreByTouchHelper = this.D;
        accessibleExploreByTouchHelper.p(i);
        if (i != getV()) {
            setItemActiveIndex(i);
            Function1 function1 = this.onItemSelected;
            if (function1 != null) {
            }
            OnItemSelectedListener onItemSelectedListener = this.onItemSelectedListener;
            if (onItemSelectedListener != null) {
                onItemSelectedListener.onItemSelect(i);
            }
        } else {
            Function1 function12 = this.onItemReselected;
            if (function12 != null) {
            }
            OnItemReselectedListener onItemReselectedListener = this.onItemReselectedListener;
            if (onItemReselectedListener != null) {
                onItemReselectedListener.onItemReselect(i);
            }
        }
        accessibleExploreByTouchHelper.x(i, 1);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return this.D.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    /* JADX INFO: renamed from: getBarBackgroundColor, reason: from getter */
    public final int getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: getBarCornerRadius, reason: from getter */
    public final float getJ() {
        return this.j;
    }

    /* JADX INFO: renamed from: getBarCorners, reason: from getter */
    public final int getK() {
        return this.k;
    }

    /* JADX INFO: renamed from: getBarIndicatorColor, reason: from getter */
    public final int getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: getBarIndicatorRadius, reason: from getter */
    public final float getH() {
        return this.h;
    }

    /* JADX INFO: renamed from: getBarSideMargins, reason: from getter */
    public final float getI() {
        return this.i;
    }

    /* JADX INFO: renamed from: getItemActiveIndex, reason: from getter */
    public final int getV() {
        return this.v;
    }

    /* JADX INFO: renamed from: getItemAnimDuration, reason: from getter */
    public final long getM() {
        return this.m;
    }

    /* JADX INFO: renamed from: getItemFontFamily, reason: from getter */
    public final int getT() {
        return this.t;
    }

    /* JADX INFO: renamed from: getItemIconMargin, reason: from getter */
    public final float getO() {
        return this.o;
    }

    /* JADX INFO: renamed from: getItemIconSize, reason: from getter */
    public final float getN() {
        return this.n;
    }

    /* JADX INFO: renamed from: getItemIconTint, reason: from getter */
    public final int getP() {
        return this.p;
    }

    /* JADX INFO: renamed from: getItemIconTintActive, reason: from getter */
    public final int getQ() {
        return this.q;
    }

    /* JADX INFO: renamed from: getItemMenuRes, reason: from getter */
    public final int getU() {
        return this.u;
    }

    /* JADX INFO: renamed from: getItemPadding, reason: from getter */
    public final float getL() {
        return this.l;
    }

    /* JADX INFO: renamed from: getItemTextColor, reason: from getter */
    public final int getR() {
        return this.r;
    }

    /* JADX INFO: renamed from: getItemTextSize, reason: from getter */
    public final float getS() {
        return this.s;
    }

    public final Function1<Integer, mk1> getOnItemReselected() {
        return this.onItemReselected;
    }

    public final OnItemReselectedListener getOnItemReselectedListener() {
        return this.onItemReselectedListener;
    }

    public final Function1<Integer, mk1> getOnItemSelected() {
        return this.onItemSelected;
    }

    public final OnItemSelectedListener getOnItemSelectedListener() {
        return this.onItemSelectedListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.ibrahimsn.lib.SmoothBottomBar.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float i5 = getI();
        this.a = (getWidth() - (getI() * 2.0f)) / this.e.size();
        int layoutDirection = getLayoutDirection();
        List<BottomBarItem> listJ = this.e;
        if (layoutDirection == 1) {
            listJ = c.J(listJ);
        }
        for (BottomBarItem bottomBarItem : listJ) {
            boolean z = false;
            while (this.C.measureText(bottomBarItem.a) > ((this.a - getN()) - getO()) - (getL() * 2.0f)) {
                bottomBarItem.a = g.t(1, bottomBarItem.a);
                z = true;
            }
            if (z) {
                String strT = g.t(1, bottomBarItem.a);
                bottomBarItem.a = strT;
                bottomBarItem.a = strT + getContext().getString(R.string.ellipsis);
            }
            bottomBarItem.d = new RectF(i5, 0.0f, this.a + i5, getHeight());
            i5 += this.a;
        }
        a();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            return true;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            Iterator it = this.e.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((BottomBarItem) it.next()).d.contains(motionEvent.getX(), motionEvent.getY())) {
                    b(i);
                    break;
                }
                i++;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setBarBackgroundColor(int i) {
        this.f = i;
        this.A.setColor(i);
        invalidate();
    }

    public final void setBarCornerRadius(float f) {
        this.j = f;
        invalidate();
    }

    public final void setBarCorners(int i) {
        this.k = i;
        invalidate();
    }

    public final void setBarIndicatorColor(int i) {
        this.g = i;
        this.B.setColor(i);
        invalidate();
    }

    public final void setBarIndicatorRadius(float f) {
        this.h = f;
        invalidate();
    }

    public final void setBarSideMargins(float f) {
        this.i = f;
        invalidate();
    }

    public final void setItemActiveIndex(int i) {
        this.v = i;
        a();
    }

    public final void setItemAnimDuration(long j) {
        this.m = j;
    }

    public final void setItemFontFamily(int i) {
        this.t = i;
        if (i != -1) {
            Context context = getContext();
            ThreadLocal threadLocal = r31.a;
            this.C.setTypeface(context.isRestricted() ? null : r31.b(context, i, new TypedValue(), 0, null, false, false));
            invalidate();
        }
    }

    public final void setItemIconMargin(float f) {
        this.o = f;
        invalidate();
    }

    public final void setItemIconSize(float f) {
        this.n = f;
        invalidate();
    }

    public final void setItemIconTint(int i) {
        this.p = i;
        invalidate();
    }

    public final void setItemIconTintActive(int i) {
        this.q = i;
        invalidate();
    }

    public final void setItemMenuRes(int i) throws Throwable {
        int next;
        this.u = i;
        if (i != -1) {
            Context context = getContext();
            context.getClass();
            BottomBarParser bottomBarParser = new BottomBarParser(context, i);
            ArrayList arrayList = new ArrayList();
            do {
                XmlResourceParser xmlResourceParser = bottomBarParser.a;
                next = xmlResourceParser.next();
                if (next == 2 && yg0.a(xmlResourceParser.getName(), "item")) {
                    int attributeCount = xmlResourceParser.getAttributeCount();
                    String attributeValue = null;
                    String attributeValue2 = null;
                    Drawable drawable = null;
                    for (int i2 = 0; i2 < attributeCount; i2++) {
                        String attributeName = xmlResourceParser.getAttributeName(i2);
                        if (attributeName != null) {
                            int iHashCode = attributeName.hashCode();
                            Context context2 = bottomBarParser.b;
                            if (iHashCode != -1273585213) {
                                if (iHashCode != 3226745) {
                                    if (iHashCode == 110371416 && attributeName.equals("title")) {
                                        try {
                                            attributeValue = context2.getString(xmlResourceParser.getAttributeResourceValue(i2, 0));
                                        } catch (Resources.NotFoundException unused) {
                                            attributeValue = xmlResourceParser.getAttributeValue(i2);
                                        }
                                    }
                                } else if (attributeName.equals("icon")) {
                                    drawable = context2.getDrawable(xmlResourceParser.getAttributeResourceValue(i2, 0));
                                }
                            } else if (attributeName.equals("contentDescription")) {
                                try {
                                    attributeValue2 = context2.getString(xmlResourceParser.getAttributeResourceValue(i2, 0));
                                } catch (Resources.NotFoundException unused2) {
                                    attributeValue2 = xmlResourceParser.getAttributeValue(i2);
                                }
                            }
                        }
                    }
                    if (drawable == null) {
                        throw new Throwable("Item icon can not be null!");
                    }
                    String strValueOf = attributeValue2;
                    String strValueOf2 = String.valueOf(attributeValue);
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(attributeValue);
                    }
                    arrayList.add(new BottomBarItem(strValueOf2, strValueOf, drawable, null, 0, 8, null));
                }
            } while (next != 1);
            this.e = arrayList;
            invalidate();
        }
    }

    public final void setItemPadding(float f) {
        this.l = f;
        invalidate();
    }

    public final void setItemTextColor(int i) {
        this.r = i;
        this.C.setColor(i);
        invalidate();
    }

    public final void setItemTextSize(float f) {
        this.s = f;
        this.C.setTextSize(f);
        invalidate();
    }

    public final void setOnItemReselected(Function1<? super Integer, mk1> function1) {
        this.onItemReselected = function1;
    }

    public final void setOnItemReselectedListener(Function1<? super Integer, mk1> listener) {
        listener.getClass();
        this.onItemReselectedListener = new nx2(listener, 12);
    }

    public final void setOnItemSelected(Function1<? super Integer, mk1> function1) {
        this.onItemSelected = function1;
    }

    public final void setOnItemSelectedListener(Function1<? super Integer, mk1> listener) {
        listener.getClass();
        this.onItemSelectedListener = new rb0(listener, 14);
    }

    /* JADX INFO: renamed from: me.ibrahimsn.lib.SmoothBottomBar$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "p1", "Lmk1;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Integer, mk1> {
        public AnonymousClass1(SmoothBottomBar smoothBottomBar) {
            super(1, smoothBottomBar, SmoothBottomBar.class, "onClickAction", "onClickAction(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ mk1 invoke(Integer num) {
            invoke(num.intValue());
            return mk1.a;
        }

        public final void invoke(int i) {
            SmoothBottomBar smoothBottomBar = (SmoothBottomBar) this.receiver;
            int i2 = SmoothBottomBar.E;
            smoothBottomBar.b(i);
        }
    }

    public final void setOnItemReselectedListener(OnItemReselectedListener onItemReselectedListener) {
        this.onItemReselectedListener = onItemReselectedListener;
    }

    public final void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        this.onItemSelectedListener = onItemSelectedListener;
    }

    public SmoothBottomBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SmoothBottomBar(Context context, AttributeSet attributeSet, int i, int i2, xu xuVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.SmoothBottomBarStyle : i);
    }

    public SmoothBottomBar(Context context) {
        this(context, null, 0, 6, null);
    }
}
