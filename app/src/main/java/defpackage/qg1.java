package defpackage;

import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.d;
import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qg1 implements Transport {
    public final TransportContext a;
    public final String b;
    public final n20 c;
    public final Transformer d;
    public final d e;

    public qg1(TransportContext transportContext, String str, n20 n20Var, Transformer transformer, d dVar) {
        this.a = transportContext;
        this.b = str;
        this.c = n20Var;
        this.d = transformer;
        this.e = dVar;
    }

    @Override // com.google.android.datatransport.Transport
    public final void schedule(Event event, TransportScheduleCallback transportScheduleCallback) {
        mc mcVar = new mc();
        TransportContext transportContext = this.a;
        if (transportContext == null) {
            io0.e("Null transportContext");
            return;
        }
        mcVar.a = transportContext;
        if (event == null) {
            io0.e("Null event");
            return;
        }
        mcVar.c = event;
        String str = this.b;
        if (str == null) {
            io0.e("Null transportName");
            return;
        }
        mcVar.b = str;
        Transformer transformer = this.d;
        if (transformer == null) {
            io0.e("Null transformer");
            return;
        }
        mcVar.d = transformer;
        n20 n20Var = this.c;
        if (n20Var == null) {
            io0.e("Null encoding");
            return;
        }
        mcVar.e = n20Var;
        Transformer transformer2 = mcVar.d;
        String strConcat = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (transformer2 == null) {
            strConcat = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.concat(" transformer");
        }
        if (mcVar.e == null) {
            strConcat = strConcat.concat(" encoding");
        }
        if (!strConcat.isEmpty()) {
            u7.p("Missing required properties:".concat(strConcat));
        } else {
            this.e.send(new nc(mcVar.a, mcVar.b, mcVar.c, mcVar.d, mcVar.e), transportScheduleCallback);
        }
    }

    @Override // com.google.android.datatransport.Transport
    public final void send(Event event) {
        schedule(event, new s31(22));
    }
}
