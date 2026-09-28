package io.ktor.http.auth;

import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final Regex a;

    static {
        kotlin.collections.b.y(new Character[]{'!', '#', '$', '%', '&', '\'', '*', '+', '-', '.', '^', '_', '`', '|', '~'});
        kotlin.collections.b.y(new Character[]{'-', '.', '_', '~', '+', '/'});
        a = new Regex("[a-zA-Z0-9\\-._~+/]+=*");
        new Regex("\\\\.");
    }
}
