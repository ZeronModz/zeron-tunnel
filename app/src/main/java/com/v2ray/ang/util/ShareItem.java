package com.v2ray.ang.util;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ShareItem {
    public String a;
    public final int b;
    public final int c;
    public final Bitmap d;

    public ShareItem(String str, Bitmap bitmap) {
        this.b = -16777216;
        this.c = -1;
        this.a = str;
        this.d = bitmap;
    }

    public final String toString() {
        return "ShareItem{title='" + this.a + "', titleColor=" + this.b + ", bgColor=" + this.c + ", icon=" + this.d + '}';
    }

    public ShareItem(String str) {
        this.b = -16777216;
        this.c = -1;
        this.a = str;
    }

    public ShareItem(String str, int i) {
        this.b = -16777216;
        this.a = str;
        this.c = i;
    }

    public ShareItem(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public ShareItem(String str, int i, Bitmap bitmap) {
        this.b = -16777216;
        this.a = str;
        this.c = i;
        this.d = bitmap;
    }

    public ShareItem(String str, int i, int i2, Bitmap bitmap) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = bitmap;
    }
}
