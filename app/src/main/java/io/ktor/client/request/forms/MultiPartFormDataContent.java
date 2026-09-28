package io.ktor.client.request.forms;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ay2;
import defpackage.hr;
import defpackage.if3;
import defpackage.l8;
import defpackage.le0;
import defpackage.mc2;
import defpackage.p60;
import defpackage.r80;
import defpackage.vh;
import defpackage.xm;
import defpackage.xu;
import io.ktor.client.request.forms.PreparedPart;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.PartData;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.c;
import kotlin.random.Random;
import kotlin.text.a;
import kotlin.text.g;
import kotlinx.io.Buffer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/client/request/forms/MultiPartFormDataContent;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/http/content/PartData;", "parts", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "boundary", "Lio/ktor/http/ContentType;", "contentType", "<init>", "(Ljava/util/List;Ljava/lang/String;Lio/ktor/http/ContentType;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiPartFormDataContent extends OutgoingContent.WriteChannelContent {
    public final ContentType a;
    public final byte[] b;
    public final byte[] c;
    public final int d;
    public final int e;
    public final ArrayList f;
    public final Long g;

    public MultiPartFormDataContent(List<? extends PartData> list, String str, ContentType contentType) throws CharacterCodingException {
        PreparedPart channelPart;
        list.getClass();
        str.getClass();
        contentType.getClass();
        this.a = contentType;
        String strM = vh.m("--", str, "\r\n");
        Charset charset = xm.a;
        byte[] bArrM = if3.M(strM, charset);
        this.b = bArrM;
        byte[] bArrM2 = if3.M("--" + str + "--\r\n", charset);
        this.c = bArrM2;
        this.d = bArrM2.length;
        this.e = (r80.a.length * 2) + bArrM.length;
        ArrayList arrayList = new ArrayList(c.l(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.f = arrayList;
                Long lValueOf = 0L;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        l = lValueOf;
                        break;
                    }
                    Long l = ((PreparedPart) it2.next()).b;
                    if (l == null) {
                        break;
                    } else {
                        lValueOf = lValueOf != null ? Long.valueOf(l.longValue() + lValueOf.longValue()) : null;
                    }
                }
                this.g = l != null ? Long.valueOf(l.longValue() + ((long) this.d)) : l;
                return;
            }
            PartData partData = (PartData) it.next();
            Buffer buffer = new Buffer();
            for (Map.Entry<String, List<String>> entry : partData.b.entries()) {
                if3.P(buffer, entry.getKey() + ": " + c.w(entry.getValue(), "; ", null, null, null, 62));
                ay2.y(buffer, r80.a);
            }
            Headers headers = partData.b;
            List list2 = le0.a;
            String str2 = headers.get("Content-Length");
            Long lValueOf2 = str2 != null ? Long.valueOf(Long.parseLong(str2)) : null;
            if (partData instanceof PartData.FileItem) {
                byte[] bArrD = mc2.D(buffer, -1);
                channelPart = new PreparedPart.ChannelPart(bArrD, ((PartData.FileItem) partData).e, lValueOf2 != null ? Long.valueOf(lValueOf2.longValue() + ((long) this.e) + ((long) bArrD.length)) : null);
            } else if (partData instanceof PartData.BinaryItem) {
                byte[] bArrD2 = mc2.D(buffer, -1);
                channelPart = new PreparedPart.InputPart(bArrD2, ((PartData.BinaryItem) partData).e, lValueOf2 != null ? Long.valueOf(lValueOf2.longValue() + ((long) this.e) + ((long) bArrD2.length)) : null);
            } else if (partData instanceof PartData.FormItem) {
                Buffer buffer2 = new Buffer();
                if3.P(buffer2, ((PartData.FormItem) partData).e);
                byte[] bArrD3 = mc2.D(buffer2, -1);
                l8 l8Var = new l8(bArrD3, 8);
                if (lValueOf2 == null) {
                    if3.P(buffer, "Content-Length: " + bArrD3.length);
                    ay2.y(buffer, r80.a);
                }
                channelPart = new PreparedPart.InputPart(mc2.D(buffer, -1), l8Var, Long.valueOf(bArrD3.length + this.e + r1.length));
            } else {
                if (!(partData instanceof PartData.BinaryChannelItem)) {
                    p60.b();
                    throw null;
                }
                byte[] bArrD4 = mc2.D(buffer, -1);
                channelPart = new PreparedPart.ChannelPart(bArrD4, ((PartData.BinaryChannelItem) partData).e, lValueOf2 != null ? Long.valueOf(lValueOf2.longValue() + ((long) this.e) + ((long) bArrD4.length)) : null);
            }
            arrayList.add(channelPart);
        }
    }

    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getG() {
        return this.g;
    }

    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ContentType getA() {
        return this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0156, code lost:
    
        if (r10 == r1) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc A[Catch: all -> 0x0047, TryCatch #3 {all -> 0x0047, blocks: (B:17:0x0042, B:22:0x0056, B:45:0x00d6, B:47:0x00dc, B:51:0x00fc, B:54:0x0114, B:67:0x015a, B:80:0x018a, B:86:0x01ab, B:25:0x0069, B:44:0x00d0), top: B:108:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0114 A[Catch: all -> 0x0047, PHI: r6 r8 r9 r10
      0x0114: PHI (r6v12 io.ktor.client.request.forms.MultiPartFormDataContent) = 
      (r6v3 io.ktor.client.request.forms.MultiPartFormDataContent)
      (r6v13 io.ktor.client.request.forms.MultiPartFormDataContent)
     binds: [B:39:0x00b4, B:52:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x0114: PHI (r8v35 io.ktor.client.request.forms.PreparedPart) = (r8v10 io.ktor.client.request.forms.PreparedPart), (r8v36 io.ktor.client.request.forms.PreparedPart) binds: [B:39:0x00b4, B:52:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x0114: PHI (r9v23 ??) = (r9v9 ??), (r9v38 ??) binds: [B:39:0x00b4, B:52:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x0114: PHI (r10v20 java.util.Iterator) = (r10v6 java.util.Iterator), (r10v21 java.util.Iterator) binds: [B:39:0x00b4, B:52:0x0110] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x0047, blocks: (B:17:0x0042, B:22:0x0056, B:45:0x00d6, B:47:0x00dc, B:51:0x00fc, B:54:0x0114, B:67:0x015a, B:80:0x018a, B:86:0x01ab, B:25:0x0069, B:44:0x00d0), top: B:108:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0132 A[Catch: all -> 0x009d, TRY_LEAVE, TryCatch #4 {all -> 0x009d, blocks: (B:58:0x012e, B:60:0x0132, B:73:0x0165, B:75:0x0169, B:84:0x01a5, B:85:0x01aa, B:71:0x0161, B:72:0x0164, B:33:0x0098, B:38:0x00b1, B:41:0x00c7, B:69:0x015f, B:61:0x013c, B:28:0x007e), top: B:108:0x0022, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0165 A[Catch: all -> 0x009d, TryCatch #4 {all -> 0x009d, blocks: (B:58:0x012e, B:60:0x0132, B:73:0x0165, B:75:0x0169, B:84:0x01a5, B:85:0x01aa, B:71:0x0161, B:72:0x0164, B:33:0x0098, B:38:0x00b1, B:41:0x00c7, B:69:0x015f, B:61:0x013c, B:28:0x007e), top: B:108:0x0022, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ab A[Catch: all -> 0x0047, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0047, blocks: (B:17:0x0042, B:22:0x0056, B:45:0x00d6, B:47:0x00dc, B:51:0x00fc, B:54:0x0114, B:67:0x015a, B:80:0x018a, B:86:0x01ab, B:25:0x0069, B:44:0x00d0), top: B:108:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e3 A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v9, types: [io.ktor.utils.io.ByteWriteChannel] */
    /* JADX WARN: Type inference failed for: r9v0, types: [io.ktor.utils.io.ByteWriteChannel] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v18, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [io.ktor.utils.io.ByteWriteChannel] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v25, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v26, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v29, types: [io.ktor.utils.io.ByteWriteChannel] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x01a1 -> B:45:0x00d6). Please report as a decompilation issue!!! */
    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(io.ktor.utils.io.ByteWriteChannel r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.request.forms.MultiPartFormDataContent.d(io.ktor.utils.io.ByteWriteChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public MultiPartFormDataContent(List list, String str, ContentType contentType, int i, xu xuVar) {
        if ((i & 2) != 0) {
            byte[] bArr = r80.a;
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < 32; i2++) {
                int iNextInt = Random.INSTANCE.nextInt();
                a.b(16);
                String string = Integer.toString(iNextInt, 16);
                string.getClass();
                sb.append(string);
            }
            str = g.Y(70, sb.toString());
        }
        this(list, str, (i & 4) != 0 ? hr.a.c("boundary", str) : contentType);
    }
}
