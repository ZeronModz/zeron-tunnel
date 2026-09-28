package com.vpn.sandok.ultrasshservice.tunnel.vpn;

import android.os.AsyncTask;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class Pinger2 extends AsyncTask<Void, Void, Boolean> {
    Integer latency = 999;
    private String mHost;
    private OnPingListener mListener;
    private String mPort;
    private int mTimeOut;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface OnPingListener {
        void accept(Boolean bool);

        void ms(int i);
    }

    public Pinger2(OnPingListener onPingListener, String str, String str2, int i) {
        this.mListener = onPingListener;
        this.mHost = str;
        this.mPort = str2;
        this.mTimeOut = i;
        executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // android.os.AsyncTask
    public Boolean doInBackground(Void... voidArr) {
        try {
            long time = new Date().getTime();
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(this.mHost, Integer.parseInt(this.mPort)), this.mTimeOut);
            this.latency = Integer.valueOf((int) (new Date().getTime() - time));
            socket.close();
            return Boolean.TRUE;
        } catch (IOException unused) {
            return Boolean.FALSE;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Boolean bool) {
        this.mListener.accept(bool);
        this.mListener.ms(this.latency.intValue());
    }
}
