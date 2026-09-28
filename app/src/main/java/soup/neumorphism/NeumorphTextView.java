package soup.neumorphism;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.d11;
import defpackage.mu;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lsoup/neumorphism/NeumorphTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "neumorphism_release"}, k = 1, mv = {1, 4, 0})
public final class NeumorphTextView extends AppCompatTextView {
    public final float h;
    public final int i;
    public final int j;
    public final Paint k;
    public Bitmap l;
    public Bitmap m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeumorphTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        context.getClass();
        this.k = new Paint(3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d11.h, i, i2);
        this.h = typedArrayObtainStyledAttributes.getDimension(2, 0.0f);
        this.i = mu.l(context, typedArrayObtainStyledAttributes, 1, R.color.design_default_color_shadow_light);
        this.j = mu.l(context, typedArrayObtainStyledAttributes, 0, R.color.design_default_color_shadow_dark);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static Bitmap n(NeumorphTextView neumorphTextView, Bitmap bitmap, int i, int i2, int i3) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.save();
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        Paint paint = new Paint(3);
        paint.setColor(i3);
        paint.setMaskFilter(new BlurMaskFilter(Math.max(1.0f, 5.0f), BlurMaskFilter.Blur.NORMAL));
        Bitmap bitmapExtractAlpha = bitmapCreateBitmap.extractAlpha(paint, new int[2]);
        paint.setMaskFilter(null);
        bitmapCreateBitmap.eraseColor(0);
        canvas.drawBitmap(bitmapExtractAlpha, r5[0], r5[1], paint);
        return bitmapCreateBitmap;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.getClass();
        Bitmap bitmap = this.l;
        Paint paint = this.k;
        float f = this.h;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, -f, -f, paint);
        }
        Bitmap bitmap2 = this.m;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, f, f, paint);
        }
        super.draw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(-16777216);
        textPaint.setTextSize(getTextSize());
        textPaint.setTypeface(getTypeface());
        if (!isInEditMode()) {
            CharSequence text = getText();
            text.getClass();
            StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(text, 0, text.length(), textPaint, Integer.MAX_VALUE).build();
            staticLayoutBuild.getClass();
            staticLayoutBuild.draw(new Canvas(bitmapCreateBitmap));
        }
        bitmapCreateBitmap.getClass();
        if (this.l == null) {
            this.l = n(this, bitmapCreateBitmap, i, i2, this.i);
        }
        if (this.m == null) {
            this.m = n(this, bitmapCreateBitmap, i, i2, this.j);
        }
    }

    public NeumorphTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public NeumorphTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ NeumorphTextView(Context context, AttributeSet attributeSet, int i, int i2, int i3, xu xuVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.neumorphTextViewStyle : i, (i3 & 8) != 0 ? R.style.Widget_Neumorph_TextView : i2);
    }

    public NeumorphTextView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
