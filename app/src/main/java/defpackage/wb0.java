package defpackage;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApi$Settings$Builder;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class wb0 {
    public static final wb0 c = new GoogleApi$Settings$Builder().a();
    public final StatusExceptionMapper a;
    public final Looper b;

    public wb0(StatusExceptionMapper statusExceptionMapper, Looper looper) {
        this.a = statusExceptionMapper;
        this.b = looper;
    }
}
