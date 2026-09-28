package defpackage;

import android.content.Context;
import androidx.emoji2.text.EmojiCompat$MetadataRepoLoader;
import androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzdca;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzgru;
import com.google.android.gms.internal.ads.zzvx;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class f10 implements EmojiCompat$MetadataRepoLoader, zzgru, zzdhc {
    public final /* synthetic */ int a;
    public final Context b;

    public f10(Context context) {
        this.a = 0;
        this.b = context.getApplicationContext();
    }

    @Override // androidx.emoji2.text.EmojiCompat$MetadataRepoLoader
    public void load(EmojiCompat$MetadataRepoLoaderCallback emojiCompat$MetadataRepoLoaderCallback) {
        bq bqVar = new bq("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), bqVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new vf(this, 7, emojiCompat$MetadataRepoLoaderCallback, threadPoolExecutor));
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ Object mo10zza() {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 1:
                return sb2.z(context);
            default:
                return new zzvx(context, new zzaeq());
        }
    }

    public /* synthetic */ f10(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // com.google.android.gms.internal.ads.zzdhc
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo3zza(Object obj) {
        ((zzdca) obj).zzc(this.b);
    }
}
