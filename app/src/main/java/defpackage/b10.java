package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.collection.ArraySet;
import androidx.emoji2.text.EmojiCompat$DefaultSpanFactory;
import androidx.emoji2.text.EmojiCompat$InitCallback;
import androidx.emoji2.text.EmojiCompat$MetadataRepoLoader;
import androidx.emoji2.text.EmojiCompat$SpanFactory;
import defpackage.nj1;
import defpackage.o10;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class b10 {
    public static final Object j = new Object();
    public static volatile b10 k;
    public final ReentrantReadWriteLock a;
    public final ArraySet b;
    public volatile int c;
    public final Handler d;
    public final z00 e;
    public final EmojiCompat$MetadataRepoLoader f;
    public final EmojiCompat$DefaultSpanFactory g;
    public final int h;
    public final fv i;

    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.emoji2.text.EmojiCompat$DefaultSpanFactory] */
    public b10(d10 d10Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        EmojiCompat$MetadataRepoLoader emojiCompat$MetadataRepoLoader = d10Var.a;
        this.f = emojiCompat$MetadataRepoLoader;
        int i = d10Var.b;
        this.h = i;
        this.i = d10Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new ArraySet();
        this.g = new EmojiCompat$SpanFactory() { // from class: androidx.emoji2.text.EmojiCompat$DefaultSpanFactory
            @Override // androidx.emoji2.text.EmojiCompat$SpanFactory
            public final o10 createSpan(nj1 nj1Var) {
                return new TypefaceEmojiSpan(nj1Var);
            }
        };
        z00 z00Var = new z00(this);
        this.e = z00Var;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                emojiCompat$MetadataRepoLoader.load(new y00(z00Var));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static b10 a() {
        b10 b10Var;
        synchronized (j) {
            b10Var = k;
            jx0.g("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", b10Var != null);
        }
        return b10Var;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void c() {
        jx0.g("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.h == 1);
        if (b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            z00 z00Var = this.e;
            b10 b10Var = z00Var.a;
            try {
                b10Var.f.load(new y00(z00Var));
            } catch (Throwable th) {
                b10Var.d(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new ph(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0092 A[Catch: all -> 0x0085, TRY_ENTER, TryCatch #0 {all -> 0x0085, blocks: (B:32:0x005d, B:35:0x0062, B:37:0x0066, B:39:0x0073, B:46:0x0092, B:48:0x009c, B:50:0x009f, B:52:0x00a2, B:54:0x00b2, B:55:0x00b5), top: B:87:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:32:0x005d, B:35:0x0062, B:37:0x0066, B:39:0x0073, B:46:0x0092, B:48:0x009c, B:50:0x009f, B:52:0x00a2, B:54:0x00b2, B:55:0x00b5), top: B:87:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c4 A[Catch: all -> 0x00f7, TRY_ENTER, TryCatch #1 {all -> 0x00f7, blocks: (B:59:0x00c4, B:62:0x00cc, B:44:0x0088), top: B:89:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence e(int r10, int r11, java.lang.CharSequence r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b10.e(int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void f(EmojiCompat$InitCallback emojiCompat$InitCallback) {
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new ph(Arrays.asList(emojiCompat$InitCallback), this.c, (Throwable) null));
            } else {
                this.b.add(emojiCompat$InitCallback);
            }
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }
}
