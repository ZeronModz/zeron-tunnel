package defpackage;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class us extends r20 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ us(b bVar, int i) {
        super(bVar);
        this.e = i;
    }

    @Override // defpackage.r20
    public void q() {
        switch (this.e) {
            case 0:
                b bVar = this.b;
                bVar.o = null;
                CheckableImageButton checkableImageButton = bVar.g;
                checkableImageButton.setOnLongClickListener(null);
                ii2.v(checkableImageButton, null);
                break;
        }
    }
}
