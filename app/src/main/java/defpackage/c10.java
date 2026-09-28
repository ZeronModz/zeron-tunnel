package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class c10 implements DefaultLifecycleObserver {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public c10(CancellableContinuationImpl cancellableContinuationImpl) {
        this.b = cancellableContinuationImpl;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        switch (this.a) {
            case 0:
                lifecycleOwner.getClass();
                break;
            default:
                lifecycleOwner.getClass();
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        switch (this.a) {
            case 0:
                lifecycleOwner.getClass();
                break;
            default:
                lifecycleOwner.getClass();
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        switch (this.a) {
            case 0:
                lifecycleOwner.getClass();
                break;
            default:
                lifecycleOwner.getClass();
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        switch (this.a) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? cq.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new g10(0), 500L);
                ((Lifecycle) this.b).c(this);
                break;
            default:
                lifecycleOwner.getClass();
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        switch (this.a) {
            case 0:
                lifecycleOwner.getClass();
                break;
            default:
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.b;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m36constructorimpl(mk1.a));
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        switch (this.a) {
            case 0:
                lifecycleOwner.getClass();
                break;
            default:
                lifecycleOwner.getClass();
                break;
        }
    }

    public c10(EmojiCompatInitializer emojiCompatInitializer, Lifecycle lifecycle) {
        this.b = lifecycle;
    }
}
