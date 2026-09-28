package com.github.mikephil.charting.utils;

import android.graphics.Color;
import com.google.android.gms.ads.RequestConfiguration;
import com.sandok.tunnel.core.Connection;
import com.trilead.ssh2.sftp.Packet;
import org.conscrypt.metrics.ConscryptStatsLog;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class ColorTemplate {
    public static final /* synthetic */ int a = 0;

    static {
        Color.rgb(207, 248, 246);
        Color.rgb(148, 212, 212);
        Color.rgb(136, 180, 187);
        Color.rgb(118, 174, 175);
        Color.rgb(42, 109, 130);
        Color.rgb(217, 80, 138);
        Color.rgb(254, 149, 7);
        Color.rgb(254, 247, Connection.CONNECTION_DEFAULT_TIMEOUT);
        Color.rgb(106, 167, 134);
        Color.rgb(53, 194, 209);
        Color.rgb(64, 89, 128);
        Color.rgb(149, 165, 124);
        Color.rgb(217, 184, 162);
        Color.rgb(191, 134, 134);
        Color.rgb(179, 48, 80);
        Color.rgb(193, 37, 82);
        Color.rgb(255, Packet.SSH_FXP_HANDLE, 0);
        Color.rgb(245, 199, 0);
        Color.rgb(106, 150, 31);
        Color.rgb(179, 100, 53);
        Color.rgb(192, 255, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA);
        Color.rgb(255, 247, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA);
        Color.rgb(255, 208, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA);
        Color.rgb(ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA, 234, 255);
        Color.rgb(255, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_GCM_SHA384);
        a("#2ecc71");
        a("#f1c40f");
        a("#e74c3c");
        a("#3498db");
    }

    public static void a(String str) {
        int i = (int) Long.parseLong(str.replace("#", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), 16);
        Color.rgb((i >> 16) & 255, (i >> 8) & 255, i & 255);
    }
}
