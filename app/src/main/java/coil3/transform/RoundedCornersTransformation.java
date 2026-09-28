package coil3.transform;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import coil3.size.Dimension;
import coil3.size.Scale;
import coil3.size.Size;
import com.google.android.gms.ads.RequestConfiguration;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.cy;
import defpackage.n8;
import defpackage.u7;
import defpackage.xu;
import defpackage.yg0;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.math.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lcoil3/transform/RoundedCornersTransformation;", "Lcoil3/transform/Transformation;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "topLeft", "topRight", "bottomLeft", "bottomRight", "<init>", "(FFFF)V", "radius", "(F)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RoundedCornersTransformation extends Transformation {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final String e;

    public RoundedCornersTransformation(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (f < 0.0f || f2 < 0.0f || f3 < 0.0f || f4 < 0.0f) {
            u7.r("All radii must be >= 0.");
            throw null;
        }
        this.e = Reflection.a(RoundedCornersTransformation.class).getQualifiedName() + '-' + f + ',' + f2 + ',' + f3 + ',' + f4;
    }

    @Override // coil3.transform.Transformation
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getE() {
        return this.e;
    }

    @Override // coil3.transform.Transformation
    public final Bitmap b(Bitmap bitmap, Size size) {
        long jR;
        Paint paint = new Paint(3);
        if (yg0.a(size, Size.c)) {
            jR = yg0.r(bitmap.getWidth(), bitmap.getHeight());
        } else {
            Dimension dimension = size.a;
            Dimension dimension2 = size.b;
            if ((dimension instanceof cy) && (dimension2 instanceof cy)) {
                jR = yg0.r(((cy) dimension).a, ((cy) dimension2).a);
            } else {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                Dimension dimension3 = size.a;
                boolean z = dimension3 instanceof cy;
                int i = AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
                int i2 = z ? ((cy) dimension3).a : Integer.MIN_VALUE;
                if (dimension2 instanceof cy) {
                    i = ((cy) dimension2).a;
                }
                double dK = n8.k(width, height, i2, i, Scale.FILL);
                jR = yg0.r(a.a(((double) bitmap.getWidth()) * dK), a.a(dK * ((double) bitmap.getHeight())));
            }
        }
        int i3 = (int) (jR >> 32);
        int i4 = (int) (jR & 4294967295L);
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Matrix matrix = new Matrix();
        float fK = (float) n8.k(bitmap.getWidth(), bitmap.getHeight(), i3, i4, Scale.FILL);
        matrix.setTranslate((i3 - (bitmap.getWidth() * fK)) / 2.0f, (i4 - (bitmap.getHeight() * fK)) / 2.0f);
        matrix.preScale(fK, fK);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f = this.a;
        float f2 = this.b;
        float f3 = this.d;
        float f4 = this.c;
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        RectF rectF = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return bitmapCreateBitmap;
    }

    public /* synthetic */ RoundedCornersTransformation(float f, float f2, float f3, float f4, int i, xu xuVar) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }

    public RoundedCornersTransformation() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public RoundedCornersTransformation(float f) {
        this(f, f, f, f);
    }
}
