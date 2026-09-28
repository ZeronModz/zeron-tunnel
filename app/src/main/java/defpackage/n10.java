package defpackage;

import androidx.emoji2.text.flatbuffer.MetadataItem;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class n10 {
    public int a = 1;
    public final bq0 b;
    public bq0 c;
    public bq0 d;
    public int e;
    public int f;

    public n10(bq0 bq0Var) {
        this.b = bq0Var;
        this.c = bq0Var;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        MetadataItem metadataItemB = this.c.b.b();
        int iA = metadataItemB.a(6);
        return !(iA == 0 || metadataItemB.b.get(iA + metadataItemB.a) == 0) || this.e == 65039;
    }
}
