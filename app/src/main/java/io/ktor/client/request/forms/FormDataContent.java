package io.ktor.client.request.forms;

import defpackage.fr;
import defpackage.if3;
import defpackage.w91;
import defpackage.xm;
import defpackage.z3;
import io.ktor.http.ContentType;
import io.ktor.http.Parameters;
import io.ktor.http.content.OutgoingContent;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/request/forms/FormDataContent;", "Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "Lio/ktor/http/Parameters;", "formData", "<init>", "(Lio/ktor/http/Parameters;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FormDataContent extends OutgoingContent.ByteArrayContent {
    public final Parameters a;
    public final byte[] b;
    public final long c;
    public final ContentType d;

    public FormDataContent(Parameters parameters) throws CharacterCodingException {
        parameters.getClass();
        this.a = parameters;
        Set<Map.Entry<String, List<String>>> setEntries = parameters.entries();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(c.l(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new Pair(entry.getKey(), (String) it2.next()));
            }
            c.i(arrayList, arrayList2);
        }
        StringBuilder sb = new StringBuilder();
        c.v(arrayList, sb, "&", new z3(20), 60);
        String string = sb.toString();
        Charset charset = xm.a;
        this.b = if3.M(string, charset);
        this.c = r8.length;
        this.d = w91.D(fr.i, charset);
    }

    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: a */
    public final Long getC() {
        return Long.valueOf(this.c);
    }

    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ContentType getD() {
        return this.d;
    }

    @Override // io.ktor.http.content.OutgoingContent.ByteArrayContent
    /* JADX INFO: renamed from: d, reason: from getter */
    public final byte[] getB() {
        return this.b;
    }
}
