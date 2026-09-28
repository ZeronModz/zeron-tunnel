package defpackage;

import android.graphics.Typeface;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import androidx.emoji2.text.flatbuffer.MetadataList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class cq0 {
    public final MetadataList a;
    public final char[] b;
    public final bq0 c = new bq0(1024);
    public final Typeface d;

    public cq0(Typeface typeface, MetadataList metadataList) {
        int i;
        int i2;
        int i3;
        int i4;
        this.d = typeface;
        this.a = metadataList;
        int iA = metadataList.a(6);
        if (iA != 0) {
            int i5 = iA + metadataList.a;
            i = metadataList.b.getInt(metadataList.b.getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.b = new char[i * 2];
        int iA2 = metadataList.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + metadataList.a;
            i2 = metadataList.b.getInt(metadataList.b.getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            nj1 nj1Var = new nj1(this, i7);
            MetadataItem metadataItemB = nj1Var.b();
            int iA3 = metadataItemB.a(4);
            Character.toChars(iA3 != 0 ? metadataItemB.b.getInt(iA3 + metadataItemB.a) : 0, this.b, i7 * 2);
            MetadataItem metadataItemB2 = nj1Var.b();
            int iA4 = metadataItemB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + metadataItemB2.a;
                i3 = metadataItemB2.b.getInt(metadataItemB2.b.getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            jx0.b(i3 > 0, "invalid metadata codepoint length");
            bq0 bq0Var = this.c;
            MetadataItem metadataItemB3 = nj1Var.b();
            int iA5 = metadataItemB3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + metadataItemB3.a;
                i4 = metadataItemB3.b.getInt(metadataItemB3.b.getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            bq0Var.a(nj1Var, 0, i4 - 1);
        }
    }
}
