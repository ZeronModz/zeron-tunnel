package com.github.mikephil.charting.exception;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class DrawingDataSetNotCreatedException extends RuntimeException {
    private static final long serialVersionUID = 1;

    public DrawingDataSetNotCreatedException() {
        super("Have to create a new drawing set first. Call ChartData's createNewDrawingDataSet() method");
    }
}
