package com.github.mikephil.charting.utils;

import com.github.mikephil.charting.data.Entry;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class EntryXComparator implements Comparator<Entry> {
    @Override // java.util.Comparator
    public final int compare(Entry entry, Entry entry2) {
        float fB = entry.b() - entry2.b();
        if (fB == 0.0f) {
            return 0;
        }
        return fB > 0.0f ? 1 : -1;
    }
}
