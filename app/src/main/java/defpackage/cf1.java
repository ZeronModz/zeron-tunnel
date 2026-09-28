package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cf1 {
    public static Typeface a = Typeface.create("sans-serif-condensed", 0);
    public static int b = 16;
    public static boolean c = true;
    public static boolean d = true;
    public static int e = -1;
    public static int f = -1;
    public static int g = -1;
    public static boolean h = true;
    public static Toast i = null;

    public static Toast a(Context context, CharSequence charSequence, Drawable drawable, int i2, int i3, int i4, boolean z) {
        Toast toastMakeText = Toast.makeText(context, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, i4);
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.toast_layout, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.toast_icon);
        TextView textView = (TextView) viewInflate.findViewById(R.id.toast_text);
        NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) n8.p(context, 2131231082);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ninePatchDrawable.setColorFilter(i2, mode);
        viewInflate.setBackground(ninePatchDrawable);
        if (!z) {
            imageView.setVisibility(8);
        } else {
            if (drawable == null) {
                u7.r("Avoid passing 'icon' as null if 'withIcon' is set to true");
                return null;
            }
            if (c) {
                drawable.setColorFilter(i3, mode);
            }
            imageView.setBackground(drawable);
        }
        textView.setText(charSequence);
        textView.setTextColor(i3);
        textView.setTypeface(a);
        textView.setTextSize(2, b);
        toastMakeText.setView(viewInflate);
        if (!d) {
            Toast toast = i;
            if (toast != null) {
                toast.cancel();
            }
            i = toastMakeText;
        }
        int gravity = e;
        if (gravity == -1) {
            gravity = toastMakeText.getGravity();
        }
        int xOffset = f;
        if (xOffset == -1) {
            xOffset = toastMakeText.getXOffset();
        }
        int yOffset = g;
        if (yOffset == -1) {
            yOffset = toastMakeText.getYOffset();
        }
        toastMakeText.setGravity(gravity, xOffset, yOffset);
        return toastMakeText;
    }

    public static Toast b(Context context, String str) {
        return (!h || Build.VERSION.SDK_INT < 29) ? Build.VERSION.SDK_INT >= 27 ? a(context, str, null, context.getColor(R.color.defaultTextColor), context.getColor(R.color.normalColor), 0, false) : a(context, str, null, context.getColor(R.color.normalColor), context.getColor(R.color.defaultTextColor), 0, false) : (context.getResources().getConfiguration().uiMode & 48) == 16 ? a(context, str, null, context.getColor(R.color.defaultTextColor), context.getColor(R.color.normalColor), 0, false) : a(context, str, null, context.getColor(R.color.normalColor), context.getColor(R.color.defaultTextColor), 0, false);
    }
}
