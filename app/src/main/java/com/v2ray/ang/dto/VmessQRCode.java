package com.v2ray.ang.dto;

import com.google.android.gms.ads.RequestConfiguration;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.ec1;
import defpackage.hz;
import defpackage.vh;
import defpackage.xu;
import defpackage.yg0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\bA\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u009f\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020HHÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0015\"\u0004\b/\u0010\u0017R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u0010\u0017R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017¨\u0006J"}, d2 = {"Lcom/v2ray/ang/dto/VmessQRCode;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "v", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ps", "add", "port", "id", "aid", "scy", "net", "type", "host", "path", "tls", "sni", "alpn", "fp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getV", "()Ljava/lang/String;", "setV", "(Ljava/lang/String;)V", "getPs", "setPs", "getAdd", "setAdd", "getPort", "setPort", "getId", "setId", "getAid", "setAid", "getScy", "setScy", "getNet", "setNet", "getType", "setType", "getHost", "setHost", "getPath", "setPath", "getTls", "setTls", "getSni", "setSni", "getAlpn", "setAlpn", "getFp", "setFp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VmessQRCode {
    private String add;
    private String aid;
    private String alpn;
    private String fp;
    private String host;
    private String id;
    private String net;
    private String path;
    private String port;
    private String ps;
    private String scy;
    private String sni;
    private String tls;
    private String type;
    private String v;

    public /* synthetic */ VmessQRCode(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, xu xuVar) {
        this((i & 1) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str, (i & 2) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str2, (i & 4) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str3, (i & 8) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str4, (i & 16) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str5, (i & 32) != 0 ? "0" : str6, (i & 64) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str7, (i & 128) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str8, (i & 256) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str9, (i & 512) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str10, (i & 1024) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str11, (i & 2048) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str12, (i & AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str13, (i & AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str14, (i & AttribFlags.SSH_FILEXFER_ATTR_UNTRANSLATED_NAME) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getV() {
        return this.v;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTls() {
        return this.tls;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSni() {
        return this.sni;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getAlpn() {
        return this.alpn;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getFp() {
        return this.fp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPs() {
        return this.ps;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAdd() {
        return this.add;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPort() {
        return this.port;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAid() {
        return this.aid;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getScy() {
        return this.scy;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNet() {
        return this.net;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final VmessQRCode copy(String v, String ps, String add, String port, String id, String aid, String scy, String net2, String type, String host, String path, String tls, String sni, String alpn, String fp) {
        ec1.T(v, ps, add, port, id);
        ec1.T(aid, scy, net2, type, host);
        path.getClass();
        tls.getClass();
        sni.getClass();
        alpn.getClass();
        fp.getClass();
        return new VmessQRCode(v, ps, add, port, id, aid, scy, net2, type, host, path, tls, sni, alpn, fp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VmessQRCode)) {
            return false;
        }
        VmessQRCode vmessQRCode = (VmessQRCode) other;
        return yg0.a(this.v, vmessQRCode.v) && yg0.a(this.ps, vmessQRCode.ps) && yg0.a(this.add, vmessQRCode.add) && yg0.a(this.port, vmessQRCode.port) && yg0.a(this.id, vmessQRCode.id) && yg0.a(this.aid, vmessQRCode.aid) && yg0.a(this.scy, vmessQRCode.scy) && yg0.a(this.net, vmessQRCode.net) && yg0.a(this.type, vmessQRCode.type) && yg0.a(this.host, vmessQRCode.host) && yg0.a(this.path, vmessQRCode.path) && yg0.a(this.tls, vmessQRCode.tls) && yg0.a(this.sni, vmessQRCode.sni) && yg0.a(this.alpn, vmessQRCode.alpn) && yg0.a(this.fp, vmessQRCode.fp);
    }

    public final String getAdd() {
        return this.add;
    }

    public final String getAid() {
        return this.aid;
    }

    public final String getAlpn() {
        return this.alpn;
    }

    public final String getFp() {
        return this.fp;
    }

    public final String getHost() {
        return this.host;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNet() {
        return this.net;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getPort() {
        return this.port;
    }

    public final String getPs() {
        return this.ps;
    }

    public final String getScy() {
        return this.scy;
    }

    public final String getSni() {
        return this.sni;
    }

    public final String getTls() {
        return this.tls;
    }

    public final String getType() {
        return this.type;
    }

    public final String getV() {
        return this.v;
    }

    public int hashCode() {
        return this.fp.hashCode() + vh.c(vh.c(vh.c(vh.c(vh.c(vh.c(vh.c(vh.c(vh.c(vh.c(vh.c(vh.c(vh.c(this.v.hashCode() * 31, 31, this.ps), 31, this.add), 31, this.port), 31, this.id), 31, this.aid), 31, this.scy), 31, this.net), 31, this.type), 31, this.host), 31, this.path), 31, this.tls), 31, this.sni), 31, this.alpn);
    }

    public final void setAdd(String str) {
        str.getClass();
        this.add = str;
    }

    public final void setAid(String str) {
        str.getClass();
        this.aid = str;
    }

    public final void setAlpn(String str) {
        str.getClass();
        this.alpn = str;
    }

    public final void setFp(String str) {
        str.getClass();
        this.fp = str;
    }

    public final void setHost(String str) {
        str.getClass();
        this.host = str;
    }

    public final void setId(String str) {
        str.getClass();
        this.id = str;
    }

    public final void setNet(String str) {
        str.getClass();
        this.net = str;
    }

    public final void setPath(String str) {
        str.getClass();
        this.path = str;
    }

    public final void setPort(String str) {
        str.getClass();
        this.port = str;
    }

    public final void setPs(String str) {
        str.getClass();
        this.ps = str;
    }

    public final void setScy(String str) {
        str.getClass();
        this.scy = str;
    }

    public final void setSni(String str) {
        str.getClass();
        this.sni = str;
    }

    public final void setTls(String str) {
        str.getClass();
        this.tls = str;
    }

    public final void setType(String str) {
        str.getClass();
        this.type = str;
    }

    public final void setV(String str) {
        str.getClass();
        this.v = str;
    }

    public String toString() {
        String str = this.v;
        String str2 = this.ps;
        String str3 = this.add;
        String str4 = this.port;
        String str5 = this.id;
        String str6 = this.aid;
        String str7 = this.scy;
        String str8 = this.net;
        String str9 = this.type;
        String str10 = this.host;
        String str11 = this.path;
        String str12 = this.tls;
        String str13 = this.sni;
        String str14 = this.alpn;
        String str15 = this.fp;
        StringBuilder sbA = hz.A("VmessQRCode(v=", str, ", ps=", str2, ", add=");
        hz.H(sbA, str3, ", port=", str4, ", id=");
        hz.H(sbA, str5, ", aid=", str6, ", scy=");
        hz.H(sbA, str7, ", net=", str8, ", type=");
        hz.H(sbA, str9, ", host=", str10, ", path=");
        hz.H(sbA, str11, ", tls=", str12, ", sni=");
        hz.H(sbA, str13, ", alpn=", str14, ", fp=");
        return vh.s(sbA, str15, ")");
    }

    public VmessQRCode(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        ec1.T(str, str2, str3, str4, str5);
        ec1.T(str6, str7, str8, str9, str10);
        ec1.T(str11, str12, str13, str14, str15);
        this.v = str;
        this.ps = str2;
        this.add = str3;
        this.port = str4;
        this.id = str5;
        this.aid = str6;
        this.scy = str7;
        this.net = str8;
        this.type = str9;
        this.host = str10;
        this.path = str11;
        this.tls = str12;
        this.sni = str13;
        this.alpn = str14;
        this.fp = str15;
    }

    public VmessQRCode() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }
}
