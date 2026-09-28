package soup.neumorphism;

import android.content.res.TypedArray;
import android.util.TypedValue;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lsoup/neumorphism/NeumorphShapeAppearanceModel;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "Builder", "Companion", "neumorphism_release"}, k = 1, mv = {1, 4, 0})
public final class NeumorphShapeAppearanceModel {
    public static final Companion f = new Companion(null);
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsoup/neumorphism/NeumorphShapeAppearanceModel$Builder;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "neumorphism_release"}, k = 1, mv = {1, 4, 0})
    public static final class Builder {
        public int a;
        public float b;
        public float c;
        public float d;
        public float e;
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsoup/neumorphism/NeumorphShapeAppearanceModel$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "neumorphism_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion(xu xuVar) {
        }

        public static float a(TypedArray typedArray, int i, float f) {
            TypedValue typedValuePeekValue = typedArray.peekValue(i);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                return f;
            }
            int i2 = typedValuePeekValue.data;
            typedArray.getResources().getClass();
            return TypedValue.complexToDimensionPixelSize(i2, r2.getDisplayMetrics());
        }
    }

    public NeumorphShapeAppearanceModel(Builder builder, xu xuVar) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
    }

    public NeumorphShapeAppearanceModel() {
        this.a = 0;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
    }
}
