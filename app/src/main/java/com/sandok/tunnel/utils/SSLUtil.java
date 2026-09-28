package com.sandok.tunnel.utils;

import android.text.TextUtils;
import com.sandok.tunnel.service.InjectorService;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.LinkedHashSet;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class SSLUtil extends SSLSocketFactory {
    private InjectorService mInjector;
    private SSLContext mSSLContext;

    public SSLUtil(InjectorService injectorService) throws Exception {
        this.mInjector = injectorService;
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        this.mSSLContext = sSLContext;
        sSLContext.init(null, new TrustManager[]{new MyX509TrustManager()}, new SecureRandom());
    }

    private void createSSLSocket(String str, int i, boolean z) throws IOException {
        this.mInjector.mSSLSocket = (SSLSocket) this.mSSLContext.getSocketFactory().createSocket(this.mInjector.server, str, i, z);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Collections.addAll(linkedHashSet, this.mInjector.mSSLSocket.getEnabledProtocols());
        this.mInjector.mSSLSocket.setEnabledProtocols((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
        log("Enabled Protocols: " + TextUtils.join(", ", this.mInjector.mSSLSocket.getEnabledProtocols()));
        this.mInjector.mSSLSocket.addHandshakeCompletedListener(new HandshakeCompletedListener() { // from class: com.sandok.tunnel.utils.SSLUtil.1
            @Override // javax.net.ssl.HandshakeCompletedListener
            public void handshakeCompleted(HandshakeCompletedEvent handshakeCompletedEvent) {
                SSLSession session = handshakeCompletedEvent.getSession();
                SSLUtil.this.log("<b>Cipher Suite: " + session.getCipherSuite() + "</b>");
                SSLUtil.this.log("HandshakeCompleted!");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void log(String str) {
        this.mInjector.log(str);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        createSSLSocket(str, i, true);
        return this.mInjector.mSSLSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        createSSLSocket(str, i, z);
        return this.mInjector.mSSLSocket;
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public class MyX509TrustManager implements X509TrustManager {
        public MyX509TrustManager() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }
    }
}
