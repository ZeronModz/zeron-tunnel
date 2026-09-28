package defpackage;

import com.google.android.gms.internal.ads.zzgqr;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class k13 extends m13 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k13(CharSequence charSequence, Object obj, int i) {
        super(charSequence);
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.m13
    public final int a(int i) {
        int i2 = this.f;
        Object obj = this.g;
        switch (i2) {
            case 0:
                CharSequence charSequence = this.c;
                int length = charSequence.length();
                n8.H0(i, length);
                while (i < length) {
                    if (((h13) obj).a(charSequence.charAt(i))) {
                        return i;
                    }
                    i++;
                }
                return -1;
            default:
                Matcher matcher = ((i13) ((zzgqr) obj)).a;
                if (matcher.find(i)) {
                    return matcher.start();
                }
                return -1;
        }
    }

    @Override // defpackage.m13
    public final int b(int i) {
        switch (this.f) {
            case 0:
                return i + 1;
            default:
                return ((i13) ((zzgqr) this.g)).a.end();
        }
    }
}
