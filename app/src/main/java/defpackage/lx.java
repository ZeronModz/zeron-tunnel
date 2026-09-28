package defpackage;

import androidx.core.util.Consumer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lx implements Consumer {
    public final /* synthetic */ int a;

    public /* synthetic */ lx(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v2 androidx.camera.core.impl.Quirks, still in use, count: 3, list:
          (r7v2 androidx.camera.core.impl.Quirks) from 0x047b: MOVE (r19v1 androidx.camera.core.impl.Quirks) = (r7v2 androidx.camera.core.impl.Quirks) (LINE:1148)
          (r7v2 androidx.camera.core.impl.Quirks) from 0x0470: MOVE (r19v3 androidx.camera.core.impl.Quirks) = (r7v2 androidx.camera.core.impl.Quirks) (LINE:1137)
          (r7v2 androidx.camera.core.impl.Quirks) from 0x0453: MOVE (r19v6 androidx.camera.core.impl.Quirks) = (r7v2 androidx.camera.core.impl.Quirks) (LINE:1108)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // androidx.core.util.Consumer
    public final void accept(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 2388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx.accept(java.lang.Object):void");
    }
}
