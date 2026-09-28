package defpackage;

import androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class e10 extends EmojiCompat$MetadataRepoLoaderCallback {
    public final /* synthetic */ EmojiCompat$MetadataRepoLoaderCallback a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public e10(EmojiCompat$MetadataRepoLoaderCallback emojiCompat$MetadataRepoLoaderCallback, ThreadPoolExecutor threadPoolExecutor) {
        this.a = emojiCompat$MetadataRepoLoaderCallback;
        this.b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback
    public final void a(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback
    public final void b(cq0 cq0Var) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(cq0Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
