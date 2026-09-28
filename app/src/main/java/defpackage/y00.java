package defpackage;

import android.os.Build;
import androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback;
import androidx.emoji2.text.c;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class y00 extends EmojiCompat$MetadataRepoLoaderCallback {
    public final /* synthetic */ z00 a;

    public y00(z00 z00Var) {
        this.a = z00Var;
    }

    @Override // androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback
    public final void a(Throwable th) {
        this.a.a.d(th);
    }

    @Override // androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback
    public final void b(cq0 cq0Var) {
        z00 z00Var = this.a;
        z00Var.c = cq0Var;
        cq0 cq0Var2 = z00Var.c;
        b10 b10Var = z00Var.a;
        z00Var.b = new c(cq0Var2, b10Var.g, b10Var.i, Build.VERSION.SDK_INT >= 34 ? i10.a() : l02.p());
        b10 b10Var2 = z00Var.a;
        ArrayList arrayList = new ArrayList();
        b10Var2.a.writeLock().lock();
        try {
            b10Var2.c = 1;
            arrayList.addAll(b10Var2.b);
            b10Var2.b.clear();
            b10Var2.a.writeLock().unlock();
            b10Var2.d.post(new ph(arrayList, b10Var2.c, (Throwable) null));
        } catch (Throwable th) {
            b10Var2.a.writeLock().unlock();
            throw th;
        }
    }
}
