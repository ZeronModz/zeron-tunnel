package com.v2ray.ang.dto;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hz;
import defpackage.xu;
import defpackage.yg0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u0006."}, d2 = {"Lcom/v2ray/ang/dto/IPAPIInfo;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ip", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "clientIp", "ip_addr", "query", "country", "country_name", "country_code", "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIp", "()Ljava/lang/String;", "setIp", "(Ljava/lang/String;)V", "getClientIp", "setClientIp", "getIp_addr", "setIp_addr", "getQuery", "setQuery", "getCountry", "setCountry", "getCountry_name", "setCountry_name", "getCountry_code", "setCountry_code", "getCountryCode", "setCountryCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IPAPIInfo {
    private String clientIp;
    private String country;
    private String countryCode;
    private String country_code;
    private String country_name;
    private String ip;
    private String ip_addr;
    private String query;

    public /* synthetic */ IPAPIInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, xu xuVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8);
    }

    public static /* synthetic */ IPAPIInfo copy$default(IPAPIInfo iPAPIInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iPAPIInfo.ip;
        }
        if ((i & 2) != 0) {
            str2 = iPAPIInfo.clientIp;
        }
        if ((i & 4) != 0) {
            str3 = iPAPIInfo.ip_addr;
        }
        if ((i & 8) != 0) {
            str4 = iPAPIInfo.query;
        }
        if ((i & 16) != 0) {
            str5 = iPAPIInfo.country;
        }
        if ((i & 32) != 0) {
            str6 = iPAPIInfo.country_name;
        }
        if ((i & 64) != 0) {
            str7 = iPAPIInfo.country_code;
        }
        if ((i & 128) != 0) {
            str8 = iPAPIInfo.countryCode;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return iPAPIInfo.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClientIp() {
        return this.clientIp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIp_addr() {
        return this.ip_addr;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCountry_name() {
        return this.country_name;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCountry_code() {
        return this.country_code;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final IPAPIInfo copy(String ip, String clientIp, String ip_addr, String query, String country, String country_name, String country_code, String countryCode) {
        return new IPAPIInfo(ip, clientIp, ip_addr, query, country, country_name, country_code, countryCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IPAPIInfo)) {
            return false;
        }
        IPAPIInfo iPAPIInfo = (IPAPIInfo) other;
        return yg0.a(this.ip, iPAPIInfo.ip) && yg0.a(this.clientIp, iPAPIInfo.clientIp) && yg0.a(this.ip_addr, iPAPIInfo.ip_addr) && yg0.a(this.query, iPAPIInfo.query) && yg0.a(this.country, iPAPIInfo.country) && yg0.a(this.country_name, iPAPIInfo.country_name) && yg0.a(this.country_code, iPAPIInfo.country_code) && yg0.a(this.countryCode, iPAPIInfo.countryCode);
    }

    public final String getClientIp() {
        return this.clientIp;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCountry_code() {
        return this.country_code;
    }

    public final String getCountry_name() {
        return this.country_name;
    }

    public final String getIp() {
        return this.ip;
    }

    public final String getIp_addr() {
        return this.ip_addr;
    }

    public final String getQuery() {
        return this.query;
    }

    public int hashCode() {
        String str = this.ip;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientIp;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ip_addr;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.query;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.country;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.country_name;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.country_code;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.countryCode;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final void setClientIp(String str) {
        this.clientIp = str;
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public final void setCountryCode(String str) {
        this.countryCode = str;
    }

    public final void setCountry_code(String str) {
        this.country_code = str;
    }

    public final void setCountry_name(String str) {
        this.country_name = str;
    }

    public final void setIp(String str) {
        this.ip = str;
    }

    public final void setIp_addr(String str) {
        this.ip_addr = str;
    }

    public final void setQuery(String str) {
        this.query = str;
    }

    public String toString() {
        String str = this.ip;
        String str2 = this.clientIp;
        String str3 = this.ip_addr;
        String str4 = this.query;
        String str5 = this.country;
        String str6 = this.country_name;
        String str7 = this.country_code;
        String str8 = this.countryCode;
        StringBuilder sbA = hz.A("IPAPIInfo(ip=", str, ", clientIp=", str2, ", ip_addr=");
        hz.H(sbA, str3, ", query=", str4, ", country=");
        hz.H(sbA, str5, ", country_name=", str6, ", country_code=");
        return hz.x(sbA, str7, ", countryCode=", str8, ")");
    }

    public IPAPIInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.ip = str;
        this.clientIp = str2;
        this.ip_addr = str3;
        this.query = str4;
        this.country = str5;
        this.country_name = str6;
        this.country_code = str7;
        this.countryCode = str8;
    }

    public IPAPIInfo() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
