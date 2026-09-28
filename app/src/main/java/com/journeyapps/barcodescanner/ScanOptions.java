package com.journeyapps.barcodescanner;

import java.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ScanOptions {
    public static final List c = DesugarCollections.unmodifiableList(Arrays.asList("UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14"));
    public static final List d = DesugarCollections.unmodifiableList(Arrays.asList("UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14", "CODE_39", "CODE_93", "CODE_128", "ITF", "RSS_14", "RSS_EXPANDED"));
    public final HashMap a = new HashMap(3);
    public Class b;
}
