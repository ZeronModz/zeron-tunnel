package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import androidx.cursoradapter.widget.CursorAdapter;
import com.google.android.gms.internal.measurement.p0;
import com.google.android.gms.internal.measurement.zzjl;
import com.google.android.gms.internal.measurement.zzjs;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ps extends ContentObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps(CursorAdapter cursorAdapter) {
        super(new Handler());
        this.a = 0;
        this.b = cursorAdapter;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        switch (this.a) {
            case 0:
                CursorAdapter cursorAdapter = (CursorAdapter) this.b;
                if (!cursorAdapter.b || (cursor = cursorAdapter.c) == null || cursor.isClosed()) {
                    return;
                }
                cursorAdapter.a = cursorAdapter.c.requery();
                return;
            case 1:
                ((zzjl) this.b).a.set(true);
                return;
            default:
                p0 p0Var = (p0) this.b;
                synchronized (p0Var.f) {
                    p0Var.g = null;
                    p0Var.c.run();
                    break;
                }
                synchronized (p0Var) {
                    try {
                        Iterator it = p0Var.h.iterator();
                        while (it.hasNext()) {
                            ((zzjs) it.next()).zza();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ps(Object obj, int i) {
        super(null);
        this.a = i;
        this.b = obj;
    }
}
