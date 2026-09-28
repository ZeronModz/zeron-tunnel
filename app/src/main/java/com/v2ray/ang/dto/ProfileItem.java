package com.v2ray.ang.dto;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hz;
import defpackage.ul1;
import defpackage.vh;
import defpackage.xu;
import defpackage.yg0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.c;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\bo\n\u0002\u0010!\n\u0002\b3\b\u0086\b\u0018\u0000 Ä\u00012\u00020\u0001:\u0002Ä\u0001Bó\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b1\u00102J\u000e\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070\u0092\u0001J\u0007\u0010\u0093\u0001\u001a\u00020\u0007J\u0015\u0010\u0094\u0001\u001a\u00020\"2\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\n\u0010\u0096\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010°\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010±\u0001\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0002\u0010nJ\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¶\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010·\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0012\u0010¹\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0003\u0010\u0081\u0001J\f\u0010º\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¼\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jþ\u0003\u0010À\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0003\u0010Á\u0001J\n\u0010Â\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010Ã\u0001\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u00108\"\u0004\b@\u0010:R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u00108\"\u0004\bB\u0010:R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u00108\"\u0004\bD\u0010:R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u00108\"\u0004\bF\u0010:R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u00108\"\u0004\bH\u0010:R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u00108\"\u0004\bJ\u0010:R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u00108\"\u0004\bL\u0010:R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u00108\"\u0004\bN\u0010:R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u00108\"\u0004\bP\u0010:R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u00108\"\u0004\bR\u0010:R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u00108\"\u0004\bT\u0010:R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u00108\"\u0004\bV\u0010:R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u00108\"\u0004\bX\u0010:R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u00108\"\u0004\bZ\u0010:R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u00108\"\u0004\b\\\u0010:R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u00108\"\u0004\b^\u0010:R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u00108\"\u0004\b`\u0010:R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u00108\"\u0004\bb\u0010:R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u00108\"\u0004\bd\u0010:R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u00108\"\u0004\bf\u0010:R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u00108\"\u0004\bh\u0010:R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u00108\"\u0004\bj\u0010:R\u001c\u0010 \u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u00108\"\u0004\bl\u0010:R\u001e\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u0010\n\u0002\u0010q\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001c\u0010#\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u00108\"\u0004\bs\u0010:R\u001c\u0010$\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u00108\"\u0004\bu\u0010:R\u001c\u0010%\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u00108\"\u0004\bw\u0010:R\u001c\u0010&\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u00108\"\u0004\by\u0010:R\u001c\u0010'\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u00108\"\u0004\b{\u0010:R\u001c\u0010(\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u00108\"\u0004\b}\u0010:R\u001c\u0010)\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u00108\"\u0004\b\u007f\u0010:R#\u0010*\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u0084\u0001\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001e\u0010+\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u00108\"\u0005\b\u0086\u0001\u0010:R\u001e\u0010,\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u00108\"\u0005\b\u0088\u0001\u0010:R\u001e\u0010-\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u00108\"\u0005\b\u008a\u0001\u0010:R\u001e\u0010.\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u00108\"\u0005\b\u008c\u0001\u0010:R\u001e\u0010/\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u00108\"\u0005\b\u008e\u0001\u0010:R\u001e\u00100\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u00108\"\u0005\b\u0090\u0001\u0010:¨\u0006Å\u0001"}, d2 = {"Lcom/v2ray/ang/dto/ProfileItem;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "configVersion", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "configType", "Lcom/v2ray/ang/dto/EConfigType;", "subscriptionId", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "addedTime", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "remarks", "server", "serverPort", "password", "method", "flow", "username", "network", "headerType", "host", "path", "seed", "quicSecurity", "quicKey", "mode", "serviceName", "authority", "xhttpMode", "xhttpExtra", "security", "sni", "alpn", "fingerPrint", "insecure", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "publicKey", "shortId", "spiderX", "secretKey", "preSharedKey", "localAddress", "reserved", "mtu", "obfsPassword", "portHopping", "portHoppingInterval", "pinSHA256", "bandwidthDown", "bandwidthUp", "<init>", "(ILcom/v2ray/ang/dto/EConfigType;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConfigVersion", "()I", "getConfigType", "()Lcom/v2ray/ang/dto/EConfigType;", "getSubscriptionId", "()Ljava/lang/String;", "setSubscriptionId", "(Ljava/lang/String;)V", "getAddedTime", "()J", "setAddedTime", "(J)V", "getRemarks", "setRemarks", "getServer", "setServer", "getServerPort", "setServerPort", "getPassword", "setPassword", "getMethod", "setMethod", "getFlow", "setFlow", "getUsername", "setUsername", "getNetwork", "setNetwork", "getHeaderType", "setHeaderType", "getHost", "setHost", "getPath", "setPath", "getSeed", "setSeed", "getQuicSecurity", "setQuicSecurity", "getQuicKey", "setQuicKey", "getMode", "setMode", "getServiceName", "setServiceName", "getAuthority", "setAuthority", "getXhttpMode", "setXhttpMode", "getXhttpExtra", "setXhttpExtra", "getSecurity", "setSecurity", "getSni", "setSni", "getAlpn", "setAlpn", "getFingerPrint", "setFingerPrint", "getInsecure", "()Ljava/lang/Boolean;", "setInsecure", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPublicKey", "setPublicKey", "getShortId", "setShortId", "getSpiderX", "setSpiderX", "getSecretKey", "setSecretKey", "getPreSharedKey", "setPreSharedKey", "getLocalAddress", "setLocalAddress", "getReserved", "setReserved", "getMtu", "()Ljava/lang/Integer;", "setMtu", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getObfsPassword", "setObfsPassword", "getPortHopping", "setPortHopping", "getPortHoppingInterval", "setPortHoppingInterval", "getPinSHA256", "setPinSHA256", "getBandwidthDown", "setBandwidthDown", "getBandwidthUp", "setBandwidthUp", "getAllOutboundTags", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "getServerAddressAndPort", "equals", "other", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "copy", "(ILcom/v2ray/ang/dto/EConfigType;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/v2ray/ang/dto/ProfileItem;", "hashCode", "toString", "Companion", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProfileItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long addedTime;
    private String alpn;
    private String authority;
    private String bandwidthDown;
    private String bandwidthUp;
    private final EConfigType configType;
    private final int configVersion;
    private String fingerPrint;
    private String flow;
    private String headerType;
    private String host;
    private Boolean insecure;
    private String localAddress;
    private String method;
    private String mode;
    private Integer mtu;
    private String network;
    private String obfsPassword;
    private String password;
    private String path;
    private String pinSHA256;
    private String portHopping;
    private String portHoppingInterval;
    private String preSharedKey;
    private String publicKey;
    private String quicKey;
    private String quicSecurity;
    private String remarks;
    private String reserved;
    private String secretKey;
    private String security;
    private String seed;
    private String server;
    private String serverPort;
    private String serviceName;
    private String shortId;
    private String sni;
    private String spiderX;
    private String subscriptionId;
    private String username;
    private String xhttpExtra;
    private String xhttpMode;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ ProfileItem(int r40, com.v2ray.ang.dto.EConfigType r41, java.lang.String r42, long r43, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, java.lang.Boolean r68, java.lang.String r69, java.lang.String r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.lang.Integer r76, java.lang.String r77, java.lang.String r78, java.lang.String r79, java.lang.String r80, java.lang.String r81, java.lang.String r82, int r83, int r84, defpackage.xu r85) {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.dto.ProfileItem.<init>(int, com.v2ray.ang.dto.EConfigType, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, xu):void");
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getConfigVersion() {
        return this.configVersion;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFlow() {
        return this.flow;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getHeaderType() {
        return this.headerType;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getSeed() {
        return this.seed;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getQuicSecurity() {
        return this.quicSecurity;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getQuicKey() {
        return this.quicKey;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EConfigType getConfigType() {
        return this.configType;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getServiceName() {
        return this.serviceName;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getAuthority() {
        return this.authority;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getXhttpMode() {
        return this.xhttpMode;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getXhttpExtra() {
        return this.xhttpExtra;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getSecurity() {
        return this.security;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getSni() {
        return this.sni;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getAlpn() {
        return this.alpn;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getFingerPrint() {
        return this.fingerPrint;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Boolean getInsecure() {
        return this.insecure;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getShortId() {
        return this.shortId;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getSpiderX() {
        return this.spiderX;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getSecretKey() {
        return this.secretKey;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getPreSharedKey() {
        return this.preSharedKey;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getLocalAddress() {
        return this.localAddress;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getReserved() {
        return this.reserved;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final Integer getMtu() {
        return this.mtu;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getObfsPassword() {
        return this.obfsPassword;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getPortHopping() {
        return this.portHopping;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getPortHoppingInterval() {
        return this.portHoppingInterval;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getAddedTime() {
        return this.addedTime;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getPinSHA256() {
        return this.pinSHA256;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getBandwidthDown() {
        return this.bandwidthDown;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getBandwidthUp() {
        return this.bandwidthUp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRemarks() {
        return this.remarks;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getServer() {
        return this.server;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getServerPort() {
        return this.serverPort;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    public final ProfileItem copy(int configVersion, EConfigType configType, String subscriptionId, long addedTime, String remarks, String server, String serverPort, String password, String method, String flow, String username, String network, String headerType, String host, String path, String seed, String quicSecurity, String quicKey, String mode, String serviceName, String authority, String xhttpMode, String xhttpExtra, String security, String sni, String alpn, String fingerPrint, Boolean insecure, String publicKey, String shortId, String spiderX, String secretKey, String preSharedKey, String localAddress, String reserved, Integer mtu, String obfsPassword, String portHopping, String portHoppingInterval, String pinSHA256, String bandwidthDown, String bandwidthUp) {
        configType.getClass();
        subscriptionId.getClass();
        remarks.getClass();
        return new ProfileItem(configVersion, configType, subscriptionId, addedTime, remarks, server, serverPort, password, method, flow, username, network, headerType, host, path, seed, quicSecurity, quicKey, mode, serviceName, authority, xhttpMode, xhttpExtra, security, sni, alpn, fingerPrint, insecure, publicKey, shortId, spiderX, secretKey, preSharedKey, localAddress, reserved, mtu, obfsPassword, portHopping, portHoppingInterval, pinSHA256, bandwidthDown, bandwidthUp);
    }

    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        ProfileItem profileItem = (ProfileItem) other;
        return yg0.a(this.server, profileItem.server) && yg0.a(this.serverPort, profileItem.serverPort) && yg0.a(this.password, profileItem.password) && yg0.a(this.method, profileItem.method) && yg0.a(this.flow, profileItem.flow) && yg0.a(this.username, profileItem.username) && yg0.a(this.network, profileItem.network) && yg0.a(this.headerType, profileItem.headerType) && yg0.a(this.host, profileItem.host) && yg0.a(this.path, profileItem.path) && yg0.a(this.seed, profileItem.seed) && yg0.a(this.quicSecurity, profileItem.quicSecurity) && yg0.a(this.quicKey, profileItem.quicKey) && yg0.a(this.mode, profileItem.mode) && yg0.a(this.serviceName, profileItem.serviceName) && yg0.a(this.authority, profileItem.authority) && yg0.a(this.xhttpMode, profileItem.xhttpMode) && yg0.a(this.security, profileItem.security) && yg0.a(this.sni, profileItem.sni) && yg0.a(this.alpn, profileItem.alpn) && yg0.a(this.fingerPrint, profileItem.fingerPrint) && yg0.a(this.publicKey, profileItem.publicKey) && yg0.a(this.shortId, profileItem.shortId) && yg0.a(this.secretKey, profileItem.secretKey) && yg0.a(this.localAddress, profileItem.localAddress) && yg0.a(this.reserved, profileItem.reserved) && yg0.a(this.mtu, profileItem.mtu) && yg0.a(this.obfsPassword, profileItem.obfsPassword) && yg0.a(this.portHopping, profileItem.portHopping) && yg0.a(this.portHoppingInterval, profileItem.portHoppingInterval) && yg0.a(this.pinSHA256, profileItem.pinSHA256);
    }

    public final long getAddedTime() {
        return this.addedTime;
    }

    public final List<String> getAllOutboundTags() {
        return c.B("proxy", "direct", "block");
    }

    public final String getAlpn() {
        return this.alpn;
    }

    public final String getAuthority() {
        return this.authority;
    }

    public final String getBandwidthDown() {
        return this.bandwidthDown;
    }

    public final String getBandwidthUp() {
        return this.bandwidthUp;
    }

    public final EConfigType getConfigType() {
        return this.configType;
    }

    public final int getConfigVersion() {
        return this.configVersion;
    }

    public final String getFingerPrint() {
        return this.fingerPrint;
    }

    public final String getFlow() {
        return this.flow;
    }

    public final String getHeaderType() {
        return this.headerType;
    }

    public final String getHost() {
        return this.host;
    }

    public final Boolean getInsecure() {
        return this.insecure;
    }

    public final String getLocalAddress() {
        return this.localAddress;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getMode() {
        return this.mode;
    }

    public final Integer getMtu() {
        return this.mtu;
    }

    public final String getNetwork() {
        return this.network;
    }

    public final String getObfsPassword() {
        return this.obfsPassword;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getPinSHA256() {
        return this.pinSHA256;
    }

    public final String getPortHopping() {
        return this.portHopping;
    }

    public final String getPortHoppingInterval() {
        return this.portHoppingInterval;
    }

    public final String getPreSharedKey() {
        return this.preSharedKey;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public final String getQuicKey() {
        return this.quicKey;
    }

    public final String getQuicSecurity() {
        return this.quicSecurity;
    }

    public final String getRemarks() {
        return this.remarks;
    }

    public final String getReserved() {
        return this.reserved;
    }

    public final String getSecretKey() {
        return this.secretKey;
    }

    public final String getSecurity() {
        return this.security;
    }

    public final String getSeed() {
        return this.seed;
    }

    public final String getServer() {
        return this.server;
    }

    public final String getServerAddressAndPort() {
        String str = this.server;
        if ((str == null || str.length() == 0) && this.configType == EConfigType.CUSTOM) {
            return "127.0.0.1:10808";
        }
        Regex regex = ul1.a;
        return vh.m(ul1.l(this.server), ":", this.serverPort);
    }

    public final String getServerPort() {
        return this.serverPort;
    }

    public final String getServiceName() {
        return this.serviceName;
    }

    public final String getShortId() {
        return this.shortId;
    }

    public final String getSni() {
        return this.sni;
    }

    public final String getSpiderX() {
        return this.spiderX;
    }

    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getXhttpExtra() {
        return this.xhttpExtra;
    }

    public final String getXhttpMode() {
        return this.xhttpMode;
    }

    public int hashCode() {
        int iC = vh.c((this.configType.hashCode() + (this.configVersion * 31)) * 31, 31, this.subscriptionId);
        long j = this.addedTime;
        int iC2 = vh.c((iC + ((int) (j ^ (j >>> 32)))) * 31, 31, this.remarks);
        String str = this.server;
        int iHashCode = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.serverPort;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.password;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.method;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.flow;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.username;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.network;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.headerType;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.host;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.path;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.seed;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.quicSecurity;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.quicKey;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.mode;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.serviceName;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.authority;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.xhttpMode;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.xhttpExtra;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.security;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.sni;
        int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.alpn;
        int iHashCode21 = (iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.fingerPrint;
        int iHashCode22 = (iHashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        Boolean bool = this.insecure;
        int iHashCode23 = (iHashCode22 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str23 = this.publicKey;
        int iHashCode24 = (iHashCode23 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.shortId;
        int iHashCode25 = (iHashCode24 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.spiderX;
        int iHashCode26 = (iHashCode25 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.secretKey;
        int iHashCode27 = (iHashCode26 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.preSharedKey;
        int iHashCode28 = (iHashCode27 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.localAddress;
        int iHashCode29 = (iHashCode28 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.reserved;
        int iHashCode30 = (iHashCode29 + (str29 == null ? 0 : str29.hashCode())) * 31;
        Integer num = this.mtu;
        int iHashCode31 = (iHashCode30 + (num == null ? 0 : num.hashCode())) * 31;
        String str30 = this.obfsPassword;
        int iHashCode32 = (iHashCode31 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.portHopping;
        int iHashCode33 = (iHashCode32 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.portHoppingInterval;
        int iHashCode34 = (iHashCode33 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.pinSHA256;
        int iHashCode35 = (iHashCode34 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.bandwidthDown;
        int iHashCode36 = (iHashCode35 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.bandwidthUp;
        return iHashCode36 + (str35 != null ? str35.hashCode() : 0);
    }

    public final void setAddedTime(long j) {
        this.addedTime = j;
    }

    public final void setAlpn(String str) {
        this.alpn = str;
    }

    public final void setAuthority(String str) {
        this.authority = str;
    }

    public final void setBandwidthDown(String str) {
        this.bandwidthDown = str;
    }

    public final void setBandwidthUp(String str) {
        this.bandwidthUp = str;
    }

    public final void setFingerPrint(String str) {
        this.fingerPrint = str;
    }

    public final void setFlow(String str) {
        this.flow = str;
    }

    public final void setHeaderType(String str) {
        this.headerType = str;
    }

    public final void setHost(String str) {
        this.host = str;
    }

    public final void setInsecure(Boolean bool) {
        this.insecure = bool;
    }

    public final void setLocalAddress(String str) {
        this.localAddress = str;
    }

    public final void setMethod(String str) {
        this.method = str;
    }

    public final void setMode(String str) {
        this.mode = str;
    }

    public final void setMtu(Integer num) {
        this.mtu = num;
    }

    public final void setNetwork(String str) {
        this.network = str;
    }

    public final void setObfsPassword(String str) {
        this.obfsPassword = str;
    }

    public final void setPassword(String str) {
        this.password = str;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final void setPinSHA256(String str) {
        this.pinSHA256 = str;
    }

    public final void setPortHopping(String str) {
        this.portHopping = str;
    }

    public final void setPortHoppingInterval(String str) {
        this.portHoppingInterval = str;
    }

    public final void setPreSharedKey(String str) {
        this.preSharedKey = str;
    }

    public final void setPublicKey(String str) {
        this.publicKey = str;
    }

    public final void setQuicKey(String str) {
        this.quicKey = str;
    }

    public final void setQuicSecurity(String str) {
        this.quicSecurity = str;
    }

    public final void setRemarks(String str) {
        str.getClass();
        this.remarks = str;
    }

    public final void setReserved(String str) {
        this.reserved = str;
    }

    public final void setSecretKey(String str) {
        this.secretKey = str;
    }

    public final void setSecurity(String str) {
        this.security = str;
    }

    public final void setSeed(String str) {
        this.seed = str;
    }

    public final void setServer(String str) {
        this.server = str;
    }

    public final void setServerPort(String str) {
        this.serverPort = str;
    }

    public final void setServiceName(String str) {
        this.serviceName = str;
    }

    public final void setShortId(String str) {
        this.shortId = str;
    }

    public final void setSni(String str) {
        this.sni = str;
    }

    public final void setSpiderX(String str) {
        this.spiderX = str;
    }

    public final void setSubscriptionId(String str) {
        str.getClass();
        this.subscriptionId = str;
    }

    public final void setUsername(String str) {
        this.username = str;
    }

    public final void setXhttpExtra(String str) {
        this.xhttpExtra = str;
    }

    public final void setXhttpMode(String str) {
        this.xhttpMode = str;
    }

    public String toString() {
        int i = this.configVersion;
        EConfigType eConfigType = this.configType;
        String str = this.subscriptionId;
        long j = this.addedTime;
        String str2 = this.remarks;
        String str3 = this.server;
        String str4 = this.serverPort;
        String str5 = this.password;
        String str6 = this.method;
        String str7 = this.flow;
        String str8 = this.username;
        String str9 = this.network;
        String str10 = this.headerType;
        String str11 = this.host;
        String str12 = this.path;
        String str13 = this.seed;
        String str14 = this.quicSecurity;
        String str15 = this.quicKey;
        String str16 = this.mode;
        String str17 = this.serviceName;
        String str18 = this.authority;
        String str19 = this.xhttpMode;
        String str20 = this.xhttpExtra;
        String str21 = this.security;
        String str22 = this.sni;
        String str23 = this.alpn;
        String str24 = this.fingerPrint;
        Boolean bool = this.insecure;
        String str25 = this.publicKey;
        String str26 = this.shortId;
        String str27 = this.spiderX;
        String str28 = this.secretKey;
        String str29 = this.preSharedKey;
        String str30 = this.localAddress;
        String str31 = this.reserved;
        Integer num = this.mtu;
        String str32 = this.obfsPassword;
        String str33 = this.portHopping;
        String str34 = this.portHoppingInterval;
        String str35 = this.pinSHA256;
        String str36 = this.bandwidthDown;
        String str37 = this.bandwidthUp;
        StringBuilder sb = new StringBuilder("ProfileItem(configVersion=");
        sb.append(i);
        sb.append(", configType=");
        sb.append(eConfigType);
        sb.append(", subscriptionId=");
        sb.append(str);
        sb.append(", addedTime=");
        sb.append(j);
        hz.H(sb, ", remarks=", str2, ", server=", str3);
        hz.H(sb, ", serverPort=", str4, ", password=", str5);
        hz.H(sb, ", method=", str6, ", flow=", str7);
        hz.H(sb, ", username=", str8, ", network=", str9);
        hz.H(sb, ", headerType=", str10, ", host=", str11);
        hz.H(sb, ", path=", str12, ", seed=", str13);
        hz.H(sb, ", quicSecurity=", str14, ", quicKey=", str15);
        hz.H(sb, ", mode=", str16, ", serviceName=", str17);
        hz.H(sb, ", authority=", str18, ", xhttpMode=", str19);
        hz.H(sb, ", xhttpExtra=", str20, ", security=", str21);
        hz.H(sb, ", sni=", str22, ", alpn=", str23);
        sb.append(", fingerPrint=");
        sb.append(str24);
        sb.append(", insecure=");
        sb.append(bool);
        hz.H(sb, ", publicKey=", str25, ", shortId=", str26);
        hz.H(sb, ", spiderX=", str27, ", secretKey=", str28);
        hz.H(sb, ", preSharedKey=", str29, ", localAddress=", str30);
        sb.append(", reserved=");
        sb.append(str31);
        sb.append(", mtu=");
        sb.append(num);
        hz.H(sb, ", obfsPassword=", str32, ", portHopping=", str33);
        hz.H(sb, ", portHoppingInterval=", str34, ", pinSHA256=", str35);
        hz.H(sb, ", bandwidthDown=", str36, ", bandwidthUp=", str37);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/v2ray/ang/dto/ProfileItem$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "create", "Lcom/v2ray/ang/dto/ProfileItem;", "configType", "Lcom/v2ray/ang/dto/EConfigType;", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(xu xuVar) {
            this();
        }

        public final ProfileItem create(EConfigType configType) {
            configType.getClass();
            return new ProfileItem(0, configType, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -3, 1023, null);
        }

        private Companion() {
        }
    }

    public ProfileItem(int i, EConfigType eConfigType, String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, Boolean bool, String str25, String str26, String str27, String str28, String str29, String str30, String str31, Integer num, String str32, String str33, String str34, String str35, String str36, String str37) {
        eConfigType.getClass();
        str.getClass();
        str2.getClass();
        this.configVersion = i;
        this.configType = eConfigType;
        this.subscriptionId = str;
        this.addedTime = j;
        this.remarks = str2;
        this.server = str3;
        this.serverPort = str4;
        this.password = str5;
        this.method = str6;
        this.flow = str7;
        this.username = str8;
        this.network = str9;
        this.headerType = str10;
        this.host = str11;
        this.path = str12;
        this.seed = str13;
        this.quicSecurity = str14;
        this.quicKey = str15;
        this.mode = str16;
        this.serviceName = str17;
        this.authority = str18;
        this.xhttpMode = str19;
        this.xhttpExtra = str20;
        this.security = str21;
        this.sni = str22;
        this.alpn = str23;
        this.fingerPrint = str24;
        this.insecure = bool;
        this.publicKey = str25;
        this.shortId = str26;
        this.spiderX = str27;
        this.secretKey = str28;
        this.preSharedKey = str29;
        this.localAddress = str30;
        this.reserved = str31;
        this.mtu = num;
        this.obfsPassword = str32;
        this.portHopping = str33;
        this.portHoppingInterval = str34;
        this.pinSHA256 = str35;
        this.bandwidthDown = str36;
        this.bandwidthUp = str37;
    }
}
