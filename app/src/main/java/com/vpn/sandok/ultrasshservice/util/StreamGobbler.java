package com.vpn.sandok.ultrasshservice.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class StreamGobbler extends Thread {
    private OnLineListener listener;
    private final BufferedReader reader;
    private List<String> writer;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface OnLineListener {
        void onLine(String str);
    }

    public StreamGobbler(InputStream inputStream, List<String> list) {
        this.reader = new BufferedReader(new InputStreamReader(inputStream));
        this.writer = list;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            try {
                String line = this.reader.readLine();
                if (line != null) {
                    List<String> list = this.writer;
                    if (list != null) {
                        list.add(line);
                    }
                    OnLineListener onLineListener = this.listener;
                    if (onLineListener != null) {
                        onLineListener.onLine(line);
                    }
                }
            } catch (IOException unused) {
            }
            try {
                this.reader.close();
                return;
            } catch (IOException unused2) {
                return;
            }
        }
    }

    public StreamGobbler(InputStream inputStream, OnLineListener onLineListener) {
        this.reader = new BufferedReader(new InputStreamReader(inputStream));
        this.listener = onLineListener;
    }
}
