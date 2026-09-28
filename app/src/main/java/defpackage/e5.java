package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.vectordrawable.graphics.drawable.ArgbEvaluator;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e5 {
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03bf, code lost:
    
        if (r32 == null) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03c1, code lost:
    
        if (r18 == null) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03c3, code lost:
    
        r1 = new android.animation.Animator[r18.size()];
        r2 = r18.iterator();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03d2, code lost:
    
        if (r2.hasNext() == false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03d4, code lost:
    
        r1[r11] = (android.animation.Animator) r2.next();
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03e0, code lost:
    
        if (r33 != 0) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03e2, code lost:
    
        r32.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03e5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03e6, code lost:
    
        r32.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03e9, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r18 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0391 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator a(android.content.Context r27, android.content.res.Resources r28, android.content.res.Resources.Theme r29, org.xmlpull.v1.XmlPullParser r30, android.util.AttributeSet r31, android.animation.AnimatorSet r32, int r33) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e5.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        int i4 = 0;
        boolean z = typedValuePeekValue != null;
        int i5 = z ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i3);
        boolean z2 = typedValuePeekValue2 != null;
        int i6 = z2 ? typedValuePeekValue2.type : 0;
        if (i == 4) {
            i = ((z && c(i5)) || (z2 && c(i6))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            hw0[] hw0VarArrC = iw0.c(string);
            hw0[] hw0VarArrC2 = iw0.c(string2);
            if (hw0VarArrC != null || hw0VarArrC2 != null) {
                if (hw0VarArrC != null) {
                    d5 d5Var = new d5(i4);
                    if (hw0VarArrC2 == null) {
                        return PropertyValuesHolder.ofObject(str, d5Var, hw0VarArrC);
                    }
                    if (iw0.a(hw0VarArrC, hw0VarArrC2)) {
                        return PropertyValuesHolder.ofObject(str, d5Var, hw0VarArrC, hw0VarArrC2);
                    }
                    throw new InflateException(hz.v(" Can't morph from ", string, " to ", string2));
                }
                if (hw0VarArrC2 != null) {
                    return PropertyValuesHolder.ofObject(str, new d5(i4), hw0VarArrC2);
                }
            }
            return null;
        }
        ArgbEvaluator argbEvaluator = i == 3 ? ArgbEvaluator.a : null;
        if (z3) {
            if (z) {
                float dimension = i5 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                if (z2) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i6 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i6 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z) {
            int dimension2 = i5 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : c(i5) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
            if (z2) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i6 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : c(i6) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
            }
        } else if (z2) {
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i6 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : c(i6) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
        }
        if (propertyValuesHolderOfInt != null && argbEvaluator != null) {
            propertyValuesHolderOfInt.setEvaluator(argbEvaluator);
        }
        return propertyValuesHolderOfInt;
    }

    public static boolean c(int i) {
        return i >= 28 && i <= 31;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator;
        int i;
        ValueAnimator valueAnimator2;
        TypedArray typedArrayF = hj1.f(resources, theme, attributeSet, xg0.g);
        TypedArray typedArrayF2 = hj1.f(resources, theme, attributeSet, xg0.k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long jC = hj1.c(typedArrayF, xmlPullParser, TypedValues.TransitionType.S_DURATION, 1, 300);
        long j = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null ? typedArrayF.getInt(2, 0) : 0;
        int i2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? typedArrayF.getInt(7, 4) : 4;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i2 == 4) {
                TypedValue typedValuePeekValue = typedArrayF.peekValue(5);
                boolean z = typedValuePeekValue != null;
                int i3 = z ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayF.peekValue(6);
                boolean z2 = typedValuePeekValue2 != null;
                i2 = ((z && c(i3)) || (z2 && c(z2 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderB = b(typedArrayF, i2, 5, 6, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            if (propertyValuesHolderB != null) {
                valueAnimator3.setValues(propertyValuesHolderB);
            }
        }
        valueAnimator3.setDuration(jC);
        valueAnimator3.setStartDelay(j);
        valueAnimator3.setRepeatCount(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null ? typedArrayF.getInt(3, 0) : 0);
        valueAnimator3.setRepeatMode(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null ? typedArrayF.getInt(4, 1) : 1);
        if (typedArrayF2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String strD = hj1.d(typedArrayF2, xmlPullParser, "pathData", 1);
            if (strD != null) {
                String strD2 = hj1.d(typedArrayF2, xmlPullParser, "propertyXName", 2);
                String strD3 = hj1.d(typedArrayF2, xmlPullParser, "propertyYName", 3);
                if (i2 != 2) {
                }
                if (strD2 == null && strD3 == null) {
                    throw new InflateException(typedArrayF2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathD = iw0.d(strD);
                PathMeasure pathMeasure = new PathMeasure(pathD, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float length = 0.0f;
                do {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(pathD, false);
                int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f = length / (iMin - 1);
                int i4 = 0;
                valueAnimator = valueAnimator3;
                float f2 = 0.0f;
                int i5 = 0;
                while (true) {
                    if (i4 >= iMin) {
                        break;
                    }
                    int i6 = iMin;
                    pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i5)).floatValue(), fArr3, null);
                    fArr[i4] = fArr3[0];
                    fArr2[i4] = fArr3[1];
                    int i7 = i5 + 1;
                    f2 += f;
                    if (i7 < arrayList.size() && f2 > ((Float) arrayList.get(i7)).floatValue()) {
                        pathMeasure2.nextContour();
                        i5 = i7;
                    }
                    i4++;
                    iMin = i6;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = strD2 != null ? PropertyValuesHolder.ofFloat(strD2, fArr) : null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = strD3 != null ? PropertyValuesHolder.ofFloat(strD3, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                } else if (propertyValuesHolderOfFloat2 == null) {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat);
                } else {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                }
                i = 0;
            } else {
                valueAnimator = valueAnimator3;
                i = 0;
                objectAnimator2.setPropertyName(hj1.d(typedArrayF2, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            i = 0;
        }
        int resourceId = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? typedArrayF.getResourceId(i, i) : i;
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArrayF.recycle();
        if (typedArrayF2 != null) {
            typedArrayF2.recycle();
        }
        return valueAnimator2;
    }
}
