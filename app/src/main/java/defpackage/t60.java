package defpackage;

import android.content.Context;
import com.google.firebase.sessions.c;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t60 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ t60(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IOException {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                File fileH = j03.h(context, "firebaseSessions/sessionConfigsDataStore.data");
                c.b(fileH);
                return fileH;
            default:
                File fileH2 = j03.h(context, "firebaseSessions/sessionDataStore.data");
                c.b(fileH2);
                return fileH2;
        }
    }
}
