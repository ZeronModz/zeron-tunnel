package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import dev.zeron.tunnel.R;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.resources.TextAppearance;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class md {
    public final BadgeState$State a;
    public final BadgeState$State b = new BadgeState$State();
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;

    public md(Context context, BadgeState$State badgeState$State) {
        AttributeSet attributeSetAsAttributeSet;
        int styleAttribute;
        int next;
        badgeState$State = badgeState$State == null ? new BadgeState$State() : badgeState$State;
        int i = badgeState$State.a;
        if (i != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSetAsAttributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayD = ke1.d(context, attributeSetAsAttributeSet, y01.c, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.c = typedArrayD.getDimensionPixelSize(4, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = typedArrayD.getDimensionPixelSize(14, -1);
        this.e = typedArrayD.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.g = typedArrayD.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f = typedArrayD.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.h = typedArrayD.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.k = typedArrayD.getInt(24, 1);
        BadgeState$State badgeState$State2 = this.b;
        int i2 = badgeState$State.i;
        badgeState$State2.i = i2 == -2 ? 255 : i2;
        int i3 = badgeState$State.k;
        if (i3 != -2) {
            badgeState$State2.k = i3;
        } else {
            boolean zHasValue = typedArrayD.hasValue(23);
            BadgeState$State badgeState$State3 = this.b;
            if (zHasValue) {
                badgeState$State3.k = typedArrayD.getInt(23, 0);
            } else {
                badgeState$State3.k = -1;
            }
        }
        String str = badgeState$State.j;
        if (str != null) {
            this.b.j = str;
        } else if (typedArrayD.hasValue(7)) {
            this.b.j = typedArrayD.getString(7);
        }
        BadgeState$State badgeState$State4 = this.b;
        badgeState$State4.o = badgeState$State.o;
        CharSequence charSequence = badgeState$State.p;
        badgeState$State4.p = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        BadgeState$State badgeState$State5 = this.b;
        int i4 = badgeState$State.q;
        badgeState$State5.q = i4 == 0 ? R.plurals.mtrl_badge_content_description : i4;
        int i5 = badgeState$State.r;
        badgeState$State5.r = i5 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i5;
        Boolean bool = badgeState$State.t;
        badgeState$State5.t = Boolean.valueOf(bool == null || bool.booleanValue());
        BadgeState$State badgeState$State6 = this.b;
        int i6 = badgeState$State.l;
        badgeState$State6.l = i6 == -2 ? typedArrayD.getInt(21, -2) : i6;
        BadgeState$State badgeState$State7 = this.b;
        int i7 = badgeState$State.m;
        badgeState$State7.m = i7 == -2 ? typedArrayD.getInt(22, -2) : i7;
        BadgeState$State badgeState$State8 = this.b;
        Integer num = badgeState$State.e;
        badgeState$State8.e = Integer.valueOf(num == null ? typedArrayD.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        BadgeState$State badgeState$State9 = this.b;
        Integer num2 = badgeState$State.f;
        badgeState$State9.f = Integer.valueOf(num2 == null ? typedArrayD.getResourceId(6, 0) : num2.intValue());
        BadgeState$State badgeState$State10 = this.b;
        Integer num3 = badgeState$State.g;
        badgeState$State10.g = Integer.valueOf(num3 == null ? typedArrayD.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        BadgeState$State badgeState$State11 = this.b;
        Integer num4 = badgeState$State.h;
        badgeState$State11.h = Integer.valueOf(num4 == null ? typedArrayD.getResourceId(16, 0) : num4.intValue());
        BadgeState$State badgeState$State12 = this.b;
        Integer num5 = badgeState$State.b;
        badgeState$State12.b = Integer.valueOf(num5 == null ? so0.b(context, typedArrayD, 1).getDefaultColor() : num5.intValue());
        BadgeState$State badgeState$State13 = this.b;
        Integer num6 = badgeState$State.d;
        badgeState$State13.d = Integer.valueOf(num6 == null ? typedArrayD.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = badgeState$State.c;
        if (num7 != null) {
            this.b.c = num7;
        } else {
            boolean zHasValue2 = typedArrayD.hasValue(9);
            BadgeState$State badgeState$State14 = this.b;
            if (zHasValue2) {
                badgeState$State14.c = Integer.valueOf(so0.b(context, typedArrayD, 9).getDefaultColor());
            } else {
                this.b.c = Integer.valueOf(new TextAppearance(context, badgeState$State14.d.intValue()).j.getDefaultColor());
            }
        }
        BadgeState$State badgeState$State15 = this.b;
        Integer num8 = badgeState$State.s;
        badgeState$State15.s = Integer.valueOf(num8 == null ? typedArrayD.getInt(2, 8388661) : num8.intValue());
        BadgeState$State badgeState$State16 = this.b;
        Integer num9 = badgeState$State.u;
        badgeState$State16.u = Integer.valueOf(num9 == null ? typedArrayD.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        BadgeState$State badgeState$State17 = this.b;
        Integer num10 = badgeState$State.v;
        badgeState$State17.v = Integer.valueOf(num10 == null ? typedArrayD.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        BadgeState$State badgeState$State18 = this.b;
        Integer num11 = badgeState$State.w;
        badgeState$State18.w = Integer.valueOf(num11 == null ? typedArrayD.getDimensionPixelOffset(18, 0) : num11.intValue());
        BadgeState$State badgeState$State19 = this.b;
        Integer num12 = badgeState$State.x;
        badgeState$State19.x = Integer.valueOf(num12 == null ? typedArrayD.getDimensionPixelOffset(25, 0) : num12.intValue());
        BadgeState$State badgeState$State20 = this.b;
        Integer num13 = badgeState$State.y;
        badgeState$State20.y = Integer.valueOf(num13 == null ? typedArrayD.getDimensionPixelOffset(19, badgeState$State20.w.intValue()) : num13.intValue());
        BadgeState$State badgeState$State21 = this.b;
        Integer num14 = badgeState$State.z;
        badgeState$State21.z = Integer.valueOf(num14 == null ? typedArrayD.getDimensionPixelOffset(26, badgeState$State21.x.intValue()) : num14.intValue());
        BadgeState$State badgeState$State22 = this.b;
        Integer num15 = badgeState$State.C;
        badgeState$State22.C = Integer.valueOf(num15 == null ? typedArrayD.getDimensionPixelOffset(20, 0) : num15.intValue());
        BadgeState$State badgeState$State23 = this.b;
        Integer num16 = badgeState$State.A;
        badgeState$State23.A = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        BadgeState$State badgeState$State24 = this.b;
        Integer num17 = badgeState$State.B;
        badgeState$State24.B = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        BadgeState$State badgeState$State25 = this.b;
        Boolean bool2 = badgeState$State.D;
        badgeState$State25.D = Boolean.valueOf(bool2 == null ? typedArrayD.getBoolean(0, false) : bool2.booleanValue());
        typedArrayD.recycle();
        Locale locale = badgeState$State.n;
        BadgeState$State badgeState$State26 = this.b;
        if (locale == null) {
            badgeState$State26.n = Build.VERSION.SDK_INT >= 24 ? Locale.getDefault(Locale.Category.FORMAT) : Locale.getDefault();
        } else {
            badgeState$State26.n = locale;
        }
        this.a = badgeState$State;
    }
}
