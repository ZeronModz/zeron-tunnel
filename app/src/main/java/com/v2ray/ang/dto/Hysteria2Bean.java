package com.v2ray.ang.dto;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ec1;
import defpackage.hz;
import defpackage.vh;
import defpackage.yg0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u000556789Bo\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jz\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006:"}, d2 = {"Lcom/v2ray/ang/dto/Hysteria2Bean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "server", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "auth", "lazy", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "obfs", "Lcom/v2ray/ang/dto/Hysteria2Bean$ObfsBean;", "socks5", "Lcom/v2ray/ang/dto/Hysteria2Bean$Socks5Bean;", "http", "tls", "Lcom/v2ray/ang/dto/Hysteria2Bean$TlsBean;", "transport", "Lcom/v2ray/ang/dto/Hysteria2Bean$TransportBean;", "bandwidth", "Lcom/v2ray/ang/dto/Hysteria2Bean$BandwidthBean;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/v2ray/ang/dto/Hysteria2Bean$ObfsBean;Lcom/v2ray/ang/dto/Hysteria2Bean$Socks5Bean;Lcom/v2ray/ang/dto/Hysteria2Bean$Socks5Bean;Lcom/v2ray/ang/dto/Hysteria2Bean$TlsBean;Lcom/v2ray/ang/dto/Hysteria2Bean$TransportBean;Lcom/v2ray/ang/dto/Hysteria2Bean$BandwidthBean;)V", "getServer", "()Ljava/lang/String;", "getAuth", "getLazy", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getObfs", "()Lcom/v2ray/ang/dto/Hysteria2Bean$ObfsBean;", "getSocks5", "()Lcom/v2ray/ang/dto/Hysteria2Bean$Socks5Bean;", "getHttp", "getTls", "()Lcom/v2ray/ang/dto/Hysteria2Bean$TlsBean;", "getTransport", "()Lcom/v2ray/ang/dto/Hysteria2Bean$TransportBean;", "getBandwidth", "()Lcom/v2ray/ang/dto/Hysteria2Bean$BandwidthBean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/v2ray/ang/dto/Hysteria2Bean$ObfsBean;Lcom/v2ray/ang/dto/Hysteria2Bean$Socks5Bean;Lcom/v2ray/ang/dto/Hysteria2Bean$Socks5Bean;Lcom/v2ray/ang/dto/Hysteria2Bean$TlsBean;Lcom/v2ray/ang/dto/Hysteria2Bean$TransportBean;Lcom/v2ray/ang/dto/Hysteria2Bean$BandwidthBean;)Lcom/v2ray/ang/dto/Hysteria2Bean;", "equals", "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "ObfsBean", "Socks5Bean", "TlsBean", "TransportBean", "BandwidthBean", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Hysteria2Bean {
    private final String auth;
    private final BandwidthBean bandwidth;
    private final Socks5Bean http;
    private final Boolean lazy;
    private final ObfsBean obfs;
    private final String server;
    private final Socks5Bean socks5;
    private final TlsBean tls;
    private final TransportBean transport;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/v2ray/ang/dto/Hysteria2Bean$BandwidthBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "down", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "up", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDown", "()Ljava/lang/String;", "getUp", "component1", "component2", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BandwidthBean {
        private final String down;
        private final String up;

        public BandwidthBean(String str, String str2) {
            this.down = str;
            this.up = str2;
        }

        public static /* synthetic */ BandwidthBean copy$default(BandwidthBean bandwidthBean, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bandwidthBean.down;
            }
            if ((i & 2) != 0) {
                str2 = bandwidthBean.up;
            }
            return bandwidthBean.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDown() {
            return this.down;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUp() {
            return this.up;
        }

        public final BandwidthBean copy(String down, String up) {
            return new BandwidthBean(down, up);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BandwidthBean)) {
                return false;
            }
            BandwidthBean bandwidthBean = (BandwidthBean) other;
            return yg0.a(this.down, bandwidthBean.down) && yg0.a(this.up, bandwidthBean.up);
        }

        public final String getDown() {
            return this.down;
        }

        public final String getUp() {
            return this.up;
        }

        public int hashCode() {
            String str = this.down;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.up;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return ec1.L("BandwidthBean(down=", this.down, ", up=", this.up, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/v2ray/ang/dto/Hysteria2Bean$ObfsBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "type", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "salamander", "Lcom/v2ray/ang/dto/Hysteria2Bean$ObfsBean$SalamanderBean;", "<init>", "(Ljava/lang/String;Lcom/v2ray/ang/dto/Hysteria2Bean$ObfsBean$SalamanderBean;)V", "getType", "()Ljava/lang/String;", "getSalamander", "()Lcom/v2ray/ang/dto/Hysteria2Bean$ObfsBean$SalamanderBean;", "component1", "component2", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "SalamanderBean", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ObfsBean {
        private final SalamanderBean salamander;
        private final String type;

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/v2ray/ang/dto/Hysteria2Bean$ObfsBean$SalamanderBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "password", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;)V", "getPassword", "()Ljava/lang/String;", "component1", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SalamanderBean {
            private final String password;

            public SalamanderBean(String str) {
                this.password = str;
            }

            public static /* synthetic */ SalamanderBean copy$default(SalamanderBean salamanderBean, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = salamanderBean.password;
                }
                return salamanderBean.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getPassword() {
                return this.password;
            }

            public final SalamanderBean copy(String password) {
                return new SalamanderBean(password);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SalamanderBean) && yg0.a(this.password, ((SalamanderBean) other).password);
            }

            public final String getPassword() {
                return this.password;
            }

            public int hashCode() {
                String str = this.password;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return vh.m("SalamanderBean(password=", this.password, ")");
            }
        }

        public ObfsBean(String str, SalamanderBean salamanderBean) {
            this.type = str;
            this.salamander = salamanderBean;
        }

        public static /* synthetic */ ObfsBean copy$default(ObfsBean obfsBean, String str, SalamanderBean salamanderBean, int i, Object obj) {
            if ((i & 1) != 0) {
                str = obfsBean.type;
            }
            if ((i & 2) != 0) {
                salamanderBean = obfsBean.salamander;
            }
            return obfsBean.copy(str, salamanderBean);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final SalamanderBean getSalamander() {
            return this.salamander;
        }

        public final ObfsBean copy(String type, SalamanderBean salamander) {
            return new ObfsBean(type, salamander);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ObfsBean)) {
                return false;
            }
            ObfsBean obfsBean = (ObfsBean) other;
            return yg0.a(this.type, obfsBean.type) && yg0.a(this.salamander, obfsBean.salamander);
        }

        public final SalamanderBean getSalamander() {
            return this.salamander;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            SalamanderBean salamanderBean = this.salamander;
            return iHashCode + (salamanderBean != null ? salamanderBean.hashCode() : 0);
        }

        public String toString() {
            return "ObfsBean(type=" + this.type + ", salamander=" + this.salamander + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/v2ray/ang/dto/Hysteria2Bean$Socks5Bean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "listen", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;)V", "getListen", "()Ljava/lang/String;", "component1", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Socks5Bean {
        private final String listen;

        public Socks5Bean(String str) {
            this.listen = str;
        }

        public static /* synthetic */ Socks5Bean copy$default(Socks5Bean socks5Bean, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = socks5Bean.listen;
            }
            return socks5Bean.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getListen() {
            return this.listen;
        }

        public final Socks5Bean copy(String listen) {
            return new Socks5Bean(listen);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Socks5Bean) && yg0.a(this.listen, ((Socks5Bean) other).listen);
        }

        public final String getListen() {
            return this.listen;
        }

        public int hashCode() {
            String str = this.listen;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return vh.m("Socks5Bean(listen=", this.listen, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/v2ray/ang/dto/Hysteria2Bean$TlsBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "sni", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "insecure", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "pinSHA256", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getSni", "()Ljava/lang/String;", "getInsecure", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPinSHA256", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/v2ray/ang/dto/Hysteria2Bean$TlsBean;", "equals", "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TlsBean {
        private final Boolean insecure;
        private final String pinSHA256;
        private final String sni;

        public TlsBean(String str, Boolean bool, String str2) {
            this.sni = str;
            this.insecure = bool;
            this.pinSHA256 = str2;
        }

        public static /* synthetic */ TlsBean copy$default(TlsBean tlsBean, String str, Boolean bool, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tlsBean.sni;
            }
            if ((i & 2) != 0) {
                bool = tlsBean.insecure;
            }
            if ((i & 4) != 0) {
                str2 = tlsBean.pinSHA256;
            }
            return tlsBean.copy(str, bool, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSni() {
            return this.sni;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getInsecure() {
            return this.insecure;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPinSHA256() {
            return this.pinSHA256;
        }

        public final TlsBean copy(String sni, Boolean insecure, String pinSHA256) {
            return new TlsBean(sni, insecure, pinSHA256);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TlsBean)) {
                return false;
            }
            TlsBean tlsBean = (TlsBean) other;
            return yg0.a(this.sni, tlsBean.sni) && yg0.a(this.insecure, tlsBean.insecure) && yg0.a(this.pinSHA256, tlsBean.pinSHA256);
        }

        public final Boolean getInsecure() {
            return this.insecure;
        }

        public final String getPinSHA256() {
            return this.pinSHA256;
        }

        public final String getSni() {
            return this.sni;
        }

        public int hashCode() {
            String str = this.sni;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.insecure;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.pinSHA256;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.sni;
            Boolean bool = this.insecure;
            String str2 = this.pinSHA256;
            StringBuilder sb = new StringBuilder("TlsBean(sni=");
            sb.append(str);
            sb.append(", insecure=");
            sb.append(bool);
            sb.append(", pinSHA256=");
            return vh.s(sb, str2, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/v2ray/ang/dto/Hysteria2Bean$TransportBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "type", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "udp", "Lcom/v2ray/ang/dto/Hysteria2Bean$TransportBean$TransportUdpBean;", "<init>", "(Ljava/lang/String;Lcom/v2ray/ang/dto/Hysteria2Bean$TransportBean$TransportUdpBean;)V", "getType", "()Ljava/lang/String;", "getUdp", "()Lcom/v2ray/ang/dto/Hysteria2Bean$TransportBean$TransportUdpBean;", "component1", "component2", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "TransportUdpBean", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransportBean {
        private final String type;
        private final TransportUdpBean udp;

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/v2ray/ang/dto/Hysteria2Bean$TransportBean$TransportUdpBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "hopInterval", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;)V", "getHopInterval", "()Ljava/lang/String;", "component1", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TransportUdpBean {
            private final String hopInterval;

            public TransportUdpBean(String str) {
                this.hopInterval = str;
            }

            public static /* synthetic */ TransportUdpBean copy$default(TransportUdpBean transportUdpBean, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = transportUdpBean.hopInterval;
                }
                return transportUdpBean.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getHopInterval() {
                return this.hopInterval;
            }

            public final TransportUdpBean copy(String hopInterval) {
                return new TransportUdpBean(hopInterval);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TransportUdpBean) && yg0.a(this.hopInterval, ((TransportUdpBean) other).hopInterval);
            }

            public final String getHopInterval() {
                return this.hopInterval;
            }

            public int hashCode() {
                String str = this.hopInterval;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return vh.m("TransportUdpBean(hopInterval=", this.hopInterval, ")");
            }
        }

        public TransportBean(String str, TransportUdpBean transportUdpBean) {
            this.type = str;
            this.udp = transportUdpBean;
        }

        public static /* synthetic */ TransportBean copy$default(TransportBean transportBean, String str, TransportUdpBean transportUdpBean, int i, Object obj) {
            if ((i & 1) != 0) {
                str = transportBean.type;
            }
            if ((i & 2) != 0) {
                transportUdpBean = transportBean.udp;
            }
            return transportBean.copy(str, transportUdpBean);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final TransportUdpBean getUdp() {
            return this.udp;
        }

        public final TransportBean copy(String type, TransportUdpBean udp) {
            return new TransportBean(type, udp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransportBean)) {
                return false;
            }
            TransportBean transportBean = (TransportBean) other;
            return yg0.a(this.type, transportBean.type) && yg0.a(this.udp, transportBean.udp);
        }

        public final String getType() {
            return this.type;
        }

        public final TransportUdpBean getUdp() {
            return this.udp;
        }

        public int hashCode() {
            String str = this.type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            TransportUdpBean transportUdpBean = this.udp;
            return iHashCode + (transportUdpBean != null ? transportUdpBean.hashCode() : 0);
        }

        public String toString() {
            return "TransportBean(type=" + this.type + ", udp=" + this.udp + ")";
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ Hysteria2Bean(java.lang.String r11, java.lang.String r12, java.lang.Boolean r13, com.v2ray.ang.dto.Hysteria2Bean.ObfsBean r14, com.v2ray.ang.dto.Hysteria2Bean.Socks5Bean r15, com.v2ray.ang.dto.Hysteria2Bean.Socks5Bean r16, com.v2ray.ang.dto.Hysteria2Bean.TlsBean r17, com.v2ray.ang.dto.Hysteria2Bean.TransportBean r18, com.v2ray.ang.dto.Hysteria2Bean.BandwidthBean r19, int r20, defpackage.xu r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 4
            if (r1 == 0) goto L8
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
        L8:
            r3 = r13
            r13 = r0 & 8
            r1 = 0
            if (r13 == 0) goto L10
            r4 = r1
            goto L11
        L10:
            r4 = r14
        L11:
            r13 = r0 & 16
            if (r13 == 0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r15
        L18:
            r13 = r0 & 32
            if (r13 == 0) goto L1e
            r6 = r1
            goto L20
        L1e:
            r6 = r16
        L20:
            r13 = r0 & 64
            if (r13 == 0) goto L26
            r7 = r1
            goto L28
        L26:
            r7 = r17
        L28:
            r13 = r0 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto L2e
            r8 = r1
            goto L30
        L2e:
            r8 = r18
        L30:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L39
            r9 = r1
            r0 = r10
            r2 = r12
            r1 = r11
            goto L3e
        L39:
            r9 = r19
            r0 = r10
            r1 = r11
            r2 = r12
        L3e:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.dto.Hysteria2Bean.<init>(java.lang.String, java.lang.String, java.lang.Boolean, com.v2ray.ang.dto.Hysteria2Bean$ObfsBean, com.v2ray.ang.dto.Hysteria2Bean$Socks5Bean, com.v2ray.ang.dto.Hysteria2Bean$Socks5Bean, com.v2ray.ang.dto.Hysteria2Bean$TlsBean, com.v2ray.ang.dto.Hysteria2Bean$TransportBean, com.v2ray.ang.dto.Hysteria2Bean$BandwidthBean, int, xu):void");
    }

    public static /* synthetic */ Hysteria2Bean copy$default(Hysteria2Bean hysteria2Bean, String str, String str2, Boolean bool, ObfsBean obfsBean, Socks5Bean socks5Bean, Socks5Bean socks5Bean2, TlsBean tlsBean, TransportBean transportBean, BandwidthBean bandwidthBean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hysteria2Bean.server;
        }
        if ((i & 2) != 0) {
            str2 = hysteria2Bean.auth;
        }
        if ((i & 4) != 0) {
            bool = hysteria2Bean.lazy;
        }
        if ((i & 8) != 0) {
            obfsBean = hysteria2Bean.obfs;
        }
        if ((i & 16) != 0) {
            socks5Bean = hysteria2Bean.socks5;
        }
        if ((i & 32) != 0) {
            socks5Bean2 = hysteria2Bean.http;
        }
        if ((i & 64) != 0) {
            tlsBean = hysteria2Bean.tls;
        }
        if ((i & 128) != 0) {
            transportBean = hysteria2Bean.transport;
        }
        if ((i & 256) != 0) {
            bandwidthBean = hysteria2Bean.bandwidth;
        }
        TransportBean transportBean2 = transportBean;
        BandwidthBean bandwidthBean2 = bandwidthBean;
        Socks5Bean socks5Bean3 = socks5Bean2;
        TlsBean tlsBean2 = tlsBean;
        Socks5Bean socks5Bean4 = socks5Bean;
        Boolean bool2 = bool;
        return hysteria2Bean.copy(str, str2, bool2, obfsBean, socks5Bean4, socks5Bean3, tlsBean2, transportBean2, bandwidthBean2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getServer() {
        return this.server;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuth() {
        return this.auth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getLazy() {
        return this.lazy;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ObfsBean getObfs() {
        return this.obfs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Socks5Bean getSocks5() {
        return this.socks5;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Socks5Bean getHttp() {
        return this.http;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TlsBean getTls() {
        return this.tls;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TransportBean getTransport() {
        return this.transport;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BandwidthBean getBandwidth() {
        return this.bandwidth;
    }

    public final Hysteria2Bean copy(String server, String auth, Boolean lazy, ObfsBean obfs, Socks5Bean socks5, Socks5Bean http, TlsBean tls, TransportBean transport, BandwidthBean bandwidth) {
        return new Hysteria2Bean(server, auth, lazy, obfs, socks5, http, tls, transport, bandwidth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Hysteria2Bean)) {
            return false;
        }
        Hysteria2Bean hysteria2Bean = (Hysteria2Bean) other;
        return yg0.a(this.server, hysteria2Bean.server) && yg0.a(this.auth, hysteria2Bean.auth) && yg0.a(this.lazy, hysteria2Bean.lazy) && yg0.a(this.obfs, hysteria2Bean.obfs) && yg0.a(this.socks5, hysteria2Bean.socks5) && yg0.a(this.http, hysteria2Bean.http) && yg0.a(this.tls, hysteria2Bean.tls) && yg0.a(this.transport, hysteria2Bean.transport) && yg0.a(this.bandwidth, hysteria2Bean.bandwidth);
    }

    public final String getAuth() {
        return this.auth;
    }

    public final BandwidthBean getBandwidth() {
        return this.bandwidth;
    }

    public final Socks5Bean getHttp() {
        return this.http;
    }

    public final Boolean getLazy() {
        return this.lazy;
    }

    public final ObfsBean getObfs() {
        return this.obfs;
    }

    public final String getServer() {
        return this.server;
    }

    public final Socks5Bean getSocks5() {
        return this.socks5;
    }

    public final TlsBean getTls() {
        return this.tls;
    }

    public final TransportBean getTransport() {
        return this.transport;
    }

    public int hashCode() {
        String str = this.server;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.auth;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.lazy;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        ObfsBean obfsBean = this.obfs;
        int iHashCode4 = (iHashCode3 + (obfsBean == null ? 0 : obfsBean.hashCode())) * 31;
        Socks5Bean socks5Bean = this.socks5;
        int iHashCode5 = (iHashCode4 + (socks5Bean == null ? 0 : socks5Bean.hashCode())) * 31;
        Socks5Bean socks5Bean2 = this.http;
        int iHashCode6 = (iHashCode5 + (socks5Bean2 == null ? 0 : socks5Bean2.hashCode())) * 31;
        TlsBean tlsBean = this.tls;
        int iHashCode7 = (iHashCode6 + (tlsBean == null ? 0 : tlsBean.hashCode())) * 31;
        TransportBean transportBean = this.transport;
        int iHashCode8 = (iHashCode7 + (transportBean == null ? 0 : transportBean.hashCode())) * 31;
        BandwidthBean bandwidthBean = this.bandwidth;
        return iHashCode8 + (bandwidthBean != null ? bandwidthBean.hashCode() : 0);
    }

    public String toString() {
        String str = this.server;
        String str2 = this.auth;
        Boolean bool = this.lazy;
        ObfsBean obfsBean = this.obfs;
        Socks5Bean socks5Bean = this.socks5;
        Socks5Bean socks5Bean2 = this.http;
        TlsBean tlsBean = this.tls;
        TransportBean transportBean = this.transport;
        BandwidthBean bandwidthBean = this.bandwidth;
        StringBuilder sbA = hz.A("Hysteria2Bean(server=", str, ", auth=", str2, ", lazy=");
        sbA.append(bool);
        sbA.append(", obfs=");
        sbA.append(obfsBean);
        sbA.append(", socks5=");
        sbA.append(socks5Bean);
        sbA.append(", http=");
        sbA.append(socks5Bean2);
        sbA.append(", tls=");
        sbA.append(tlsBean);
        sbA.append(", transport=");
        sbA.append(transportBean);
        sbA.append(", bandwidth=");
        sbA.append(bandwidthBean);
        sbA.append(")");
        return sbA.toString();
    }

    public Hysteria2Bean(String str, String str2, Boolean bool, ObfsBean obfsBean, Socks5Bean socks5Bean, Socks5Bean socks5Bean2, TlsBean tlsBean, TransportBean transportBean, BandwidthBean bandwidthBean) {
        this.server = str;
        this.auth = str2;
        this.lazy = bool;
        this.obfs = obfsBean;
        this.socks5 = socks5Bean;
        this.http = socks5Bean2;
        this.tls = tlsBean;
        this.transport = transportBean;
        this.bandwidth = bandwidthBean;
    }
}
