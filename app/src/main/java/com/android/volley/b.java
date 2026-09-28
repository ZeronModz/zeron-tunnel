package com.android.volley;

import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final boolean c = VolleyLog.a;
    public final ArrayList a = new ArrayList();
    public boolean b = false;

    public final synchronized void a(long j, String str) {
        if (this.b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.a.add(new VolleyLog$MarkerLog$Marker(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        this.b = true;
        ArrayList arrayList = this.a;
        long j = arrayList.size() == 0 ? 0L : ((VolleyLog$MarkerLog$Marker) arrayList.get(arrayList.size() - 1)).c - ((VolleyLog$MarkerLog$Marker) arrayList.get(0)).c;
        if (j <= 0) {
            return;
        }
        long j2 = ((VolleyLog$MarkerLog$Marker) this.a.get(0)).c;
        VolleyLog.a("(%-4d ms) %s", Long.valueOf(j), str);
        for (VolleyLog$MarkerLog$Marker volleyLog$MarkerLog$Marker : this.a) {
            long j3 = volleyLog$MarkerLog$Marker.c;
            VolleyLog.a("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(volleyLog$MarkerLog$Marker.b), volleyLog$MarkerLog$Marker.a);
            j2 = j3;
        }
    }

    public final void finalize() {
        if (this.b) {
            return;
        }
        b("Request on the loose");
        VolleyLog.a("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
