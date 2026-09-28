package com.vpn.sandok.ultrasshservice.util.securepreferences.crypto;

import defpackage.u7;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class HashSHA {
    public static byte[] hashUsingSHA256(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException unused) {
            u7.p("Unable to hash!");
            return null;
        }
    }

    public static byte[] hashUsingSHA512(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-512").digest(bArr);
        } catch (NoSuchAlgorithmException unused) {
            u7.p("Unable to hash!");
            return null;
        }
    }
}
