package com.v2ray.ang.dto;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.gson.annotations.SerializedName;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.ec1;
import defpackage.hz;
import defpackage.ul1;
import defpackage.vh;
import defpackage.xu;
import defpackage.yg0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.c;
import kotlin.enums.EnumEntries;
import kotlin.text.Regex;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0007XYZ[\\]^BË\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f\u0012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\nj\b\u0012\u0004\u0012\u00020\u000e`\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010?\u001a\u0004\u0018\u00010\u000eJ\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000e0AJ\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\t\u0010D\u001a\u00020\u0006HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0019\u0010F\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fHÆ\u0003J\u0019\u0010G\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\nj\b\u0012\u0004\u0012\u00020\u000e`\fHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010I\u001a\u00020\u0012HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0001HÆ\u0003JÕ\u0001\u0010Q\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\nj\b\u0012\u0004\u0012\u00020\u000e`\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010U\u001a\u00020VHÖ\u0001J\t\u0010W\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R!\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R*\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\nj\b\u0012\u0004\u0012\u00020\u000e`\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010+\"\u0004\b-\u0010.R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010!\"\u0004\b9\u0010#R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b:\u0010!R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010!\"\u0004\b<\u0010#R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010!\"\u0004\b>\u0010#¨\u0006_"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "remarks", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "stats", "log", "Lcom/v2ray/ang/dto/V2rayConfig$LogBean;", "policy", "Lcom/v2ray/ang/dto/V2rayConfig$PolicyBean;", "inbounds", "Ljava/util/ArrayList;", "Lcom/v2ray/ang/dto/V2rayConfig$InboundBean;", "Lkotlin/collections/ArrayList;", "outbounds", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean;", "dns", "Lcom/v2ray/ang/dto/V2rayConfig$DnsBean;", "routing", "Lcom/v2ray/ang/dto/V2rayConfig$RoutingBean;", "api", "transport", "reverse", "fakedns", "browserForwarder", "observatory", "burstObservatory", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lcom/v2ray/ang/dto/V2rayConfig$LogBean;Lcom/v2ray/ang/dto/V2rayConfig$PolicyBean;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/v2ray/ang/dto/V2rayConfig$DnsBean;Lcom/v2ray/ang/dto/V2rayConfig$RoutingBean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getRemarks", "()Ljava/lang/String;", "setRemarks", "(Ljava/lang/String;)V", "getStats", "()Ljava/lang/Object;", "setStats", "(Ljava/lang/Object;)V", "getLog", "()Lcom/v2ray/ang/dto/V2rayConfig$LogBean;", "getPolicy", "()Lcom/v2ray/ang/dto/V2rayConfig$PolicyBean;", "setPolicy", "(Lcom/v2ray/ang/dto/V2rayConfig$PolicyBean;)V", "getInbounds", "()Ljava/util/ArrayList;", "getOutbounds", "setOutbounds", "(Ljava/util/ArrayList;)V", "getDns", "()Lcom/v2ray/ang/dto/V2rayConfig$DnsBean;", "setDns", "(Lcom/v2ray/ang/dto/V2rayConfig$DnsBean;)V", "getRouting", "()Lcom/v2ray/ang/dto/V2rayConfig$RoutingBean;", "getApi", "getTransport", "getReverse", "getFakedns", "setFakedns", "getBrowserForwarder", "getObservatory", "setObservatory", "getBurstObservatory", "setBurstObservatory", "getProxyOutbound", "getAllProxyOutbound", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "LogBean", "InboundBean", "OutboundBean", "DnsBean", "RoutingBean", "PolicyBean", "FakednsBean", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class V2rayConfig {
    private final Object api;
    private final Object browserForwarder;
    private Object burstObservatory;
    private DnsBean dns;
    private Object fakedns;
    private final ArrayList<InboundBean> inbounds;
    private final LogBean log;
    private Object observatory;
    private ArrayList<OutboundBean> outbounds;
    private PolicyBean policy;
    private String remarks;
    private final Object reverse;
    private final RoutingBean routing;
    private Object stats;
    private final Object transport;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0003<=>BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010$\u001a\u0004\u0018\u00010\u0003J\r\u0010%\u001a\u0004\u0018\u00010&¢\u0006\u0002\u0010'J\u0006\u0010(\u001a\u00020\u0003J\b\u0010)\u001a\u0004\u0018\u00010\u0003J\b\u0010*\u001a\u0004\u0018\u00010\u0003J\u0010\u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010,J\u0006\u0010-\u001a\u00020.J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\fHÆ\u0003JY\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020&HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006?"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "tag", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "protocol", "settings", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean;", "streamSettings", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean;", "proxySettings", "sendThrough", "mux", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$MuxBean;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean;Ljava/lang/Object;Ljava/lang/String;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$MuxBean;)V", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "getProtocol", "setProtocol", "getSettings", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean;", "setSettings", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean;)V", "getStreamSettings", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean;", "setStreamSettings", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean;)V", "getProxySettings", "()Ljava/lang/Object;", "getSendThrough", "getMux", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$MuxBean;", "setMux", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$MuxBean;)V", "getServerAddress", "getServerPort", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "()Ljava/lang/Integer;", "getServerAddressAndPort", "getPassword", "getSecurityEncryption", "getTransportSettingDetails", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ensureSockopt", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$SockoptBean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", "toString", "OutSettingsBean", "StreamSettingsBean", "MuxBean", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OutboundBean {
        private MuxBean mux;
        private String protocol;
        private final Object proxySettings;
        private final String sendThrough;
        private OutSettingsBean settings;
        private StreamSettingsBean streamSettings;
        private String tag;

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0006_`abcdBñ\u0001\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u0011\u0010J\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00105J\u000b\u0010O\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00105J\u000b\u0010R\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0011\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0003HÆ\u0003J\u0011\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0003HÆ\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00105J\u000b\u0010W\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jø\u0001\u0010X\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00032\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010YJ\u0013\u0010Z\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010]\u001a\u00020\u0011HÖ\u0001J\t\u0010^\u001a\u00020\u000eHÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010/\"\u0004\b8\u00109R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b:\u0010/R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00106\u001a\u0004\b;\u00105R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b<\u0010/R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010/\"\u0004\b>\u00109R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u001fR\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001f\"\u0004\bA\u0010!R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\bB\u00105\"\u0004\bC\u0010DR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010/\"\u0004\bF\u00109¨\u0006e"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "vnext", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$VnextBean;", "fragment", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$FragmentBean;", "noises", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$NoiseBean;", "servers", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$ServersBean;", "response", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$Response;", "network", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "address", "port", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "domainStrategy", "redirect", "userLevel", "inboundTag", "secretKey", "peers", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$WireGuardBean;", "reserved", "mtu", "obfsPassword", "<init>", "(Ljava/util/List;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$FragmentBean;Ljava/util/List;Ljava/util/List;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$Response;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)V", "getVnext", "()Ljava/util/List;", "setVnext", "(Ljava/util/List;)V", "getFragment", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$FragmentBean;", "setFragment", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$FragmentBean;)V", "getNoises", "setNoises", "getServers", "setServers", "getResponse", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$Response;", "setResponse", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$Response;)V", "getNetwork", "()Ljava/lang/String;", "getAddress", "()Ljava/lang/Object;", "setAddress", "(Ljava/lang/Object;)V", "getPort", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDomainStrategy", "setDomainStrategy", "(Ljava/lang/String;)V", "getRedirect", "getUserLevel", "getInboundTag", "getSecretKey", "setSecretKey", "getPeers", "getReserved", "setReserved", "getMtu", "setMtu", "(Ljava/lang/Integer;)V", "getObfsPassword", "setObfsPassword", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/util/List;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$FragmentBean;Ljava/util/List;Ljava/util/List;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$Response;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean;", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", "toString", "VnextBean", "FragmentBean", "NoiseBean", "ServersBean", "Response", "WireGuardBean", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OutSettingsBean {
            private Object address;
            private String domainStrategy;
            private FragmentBean fragment;
            private final String inboundTag;
            private Integer mtu;
            private final String network;
            private List<NoiseBean> noises;
            private String obfsPassword;
            private final List<WireGuardBean> peers;
            private final Integer port;
            private final String redirect;
            private List<Integer> reserved;
            private Response response;
            private String secretKey;
            private List<ServersBean> servers;
            private final Integer userLevel;
            private List<VnextBean> vnext;

            /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$Response;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "type", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "setType", "component1", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Response {
                private String type;

                public Response(String str) {
                    str.getClass();
                    this.type = str;
                }

                public static /* synthetic */ Response copy$default(Response response, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = response.type;
                    }
                    return response.copy(str);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getType() {
                    return this.type;
                }

                public final Response copy(String type) {
                    type.getClass();
                    return new Response(type);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Response) && yg0.a(this.type, ((Response) other).type);
                }

                public final String getType() {
                    return this.type;
                }

                public int hashCode() {
                    return this.type.hashCode();
                }

                public final void setType(String str) {
                    str.getClass();
                    this.type = str;
                }

                public String toString() {
                    return vh.m("Response(type=", this.type, ")");
                }
            }

            public /* synthetic */ OutSettingsBean(List list, FragmentBean fragmentBean, List list2, List list3, Response response, String str, Object obj, Integer num, String str2, String str3, Integer num2, String str4, String str5, List list4, List list5, Integer num3, String str6, int i, xu xuVar) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : fragmentBean, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : response, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : obj, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : num2, (i & 2048) != 0 ? null : str4, (i & AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE) != 0 ? null : str5, (i & AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT) != 0 ? null : list4, (i & AttribFlags.SSH_FILEXFER_ATTR_UNTRANSLATED_NAME) != 0 ? null : list5, (i & AttribFlags.SSH_FILEXFER_ATTR_CTIME) != 0 ? null : num3, (i & 65536) != 0 ? null : str6);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ OutSettingsBean copy$default(OutSettingsBean outSettingsBean, List list, FragmentBean fragmentBean, List list2, List list3, Response response, String str, Object obj, Integer num, String str2, String str3, Integer num2, String str4, String str5, List list4, List list5, Integer num3, String str6, int i, Object obj2) {
                String str7;
                Integer num4;
                List list6;
                OutSettingsBean outSettingsBean2;
                List list7;
                FragmentBean fragmentBean2;
                List list8;
                List list9;
                Response response2;
                String str8;
                Object obj3;
                Integer num5;
                String str9;
                String str10;
                Integer num6;
                String str11;
                String str12;
                List list10;
                List list11 = (i & 1) != 0 ? outSettingsBean.vnext : list;
                FragmentBean fragmentBean3 = (i & 2) != 0 ? outSettingsBean.fragment : fragmentBean;
                List list12 = (i & 4) != 0 ? outSettingsBean.noises : list2;
                List list13 = (i & 8) != 0 ? outSettingsBean.servers : list3;
                Response response3 = (i & 16) != 0 ? outSettingsBean.response : response;
                String str13 = (i & 32) != 0 ? outSettingsBean.network : str;
                Object obj4 = (i & 64) != 0 ? outSettingsBean.address : obj;
                Integer num7 = (i & 128) != 0 ? outSettingsBean.port : num;
                String str14 = (i & 256) != 0 ? outSettingsBean.domainStrategy : str2;
                String str15 = (i & 512) != 0 ? outSettingsBean.redirect : str3;
                Integer num8 = (i & 1024) != 0 ? outSettingsBean.userLevel : num2;
                String str16 = (i & 2048) != 0 ? outSettingsBean.inboundTag : str4;
                String str17 = (i & AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE) != 0 ? outSettingsBean.secretKey : str5;
                List list14 = (i & AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT) != 0 ? outSettingsBean.peers : list4;
                List list15 = list11;
                List list16 = (i & AttribFlags.SSH_FILEXFER_ATTR_UNTRANSLATED_NAME) != 0 ? outSettingsBean.reserved : list5;
                Integer num9 = (i & AttribFlags.SSH_FILEXFER_ATTR_CTIME) != 0 ? outSettingsBean.mtu : num3;
                if ((i & 65536) != 0) {
                    num4 = num9;
                    str7 = outSettingsBean.obfsPassword;
                    list7 = list16;
                    fragmentBean2 = fragmentBean3;
                    list8 = list12;
                    list9 = list13;
                    response2 = response3;
                    str8 = str13;
                    obj3 = obj4;
                    num5 = num7;
                    str9 = str14;
                    str10 = str15;
                    num6 = num8;
                    str11 = str16;
                    str12 = str17;
                    list10 = list14;
                    list6 = list15;
                    outSettingsBean2 = outSettingsBean;
                } else {
                    str7 = str6;
                    num4 = num9;
                    list6 = list15;
                    outSettingsBean2 = outSettingsBean;
                    list7 = list16;
                    fragmentBean2 = fragmentBean3;
                    list8 = list12;
                    list9 = list13;
                    response2 = response3;
                    str8 = str13;
                    obj3 = obj4;
                    num5 = num7;
                    str9 = str14;
                    str10 = str15;
                    num6 = num8;
                    str11 = str16;
                    str12 = str17;
                    list10 = list14;
                }
                return outSettingsBean2.copy(list6, fragmentBean2, list8, list9, response2, str8, obj3, num5, str9, str10, num6, str11, str12, list10, list7, num4, str7);
            }

            public final List<VnextBean> component1() {
                return this.vnext;
            }

            /* JADX INFO: renamed from: component10, reason: from getter */
            public final String getRedirect() {
                return this.redirect;
            }

            /* JADX INFO: renamed from: component11, reason: from getter */
            public final Integer getUserLevel() {
                return this.userLevel;
            }

            /* JADX INFO: renamed from: component12, reason: from getter */
            public final String getInboundTag() {
                return this.inboundTag;
            }

            /* JADX INFO: renamed from: component13, reason: from getter */
            public final String getSecretKey() {
                return this.secretKey;
            }

            public final List<WireGuardBean> component14() {
                return this.peers;
            }

            public final List<Integer> component15() {
                return this.reserved;
            }

            /* JADX INFO: renamed from: component16, reason: from getter */
            public final Integer getMtu() {
                return this.mtu;
            }

            /* JADX INFO: renamed from: component17, reason: from getter */
            public final String getObfsPassword() {
                return this.obfsPassword;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final FragmentBean getFragment() {
                return this.fragment;
            }

            public final List<NoiseBean> component3() {
                return this.noises;
            }

            public final List<ServersBean> component4() {
                return this.servers;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final Response getResponse() {
                return this.response;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            public final String getNetwork() {
                return this.network;
            }

            /* JADX INFO: renamed from: component7, reason: from getter */
            public final Object getAddress() {
                return this.address;
            }

            /* JADX INFO: renamed from: component8, reason: from getter */
            public final Integer getPort() {
                return this.port;
            }

            /* JADX INFO: renamed from: component9, reason: from getter */
            public final String getDomainStrategy() {
                return this.domainStrategy;
            }

            public final OutSettingsBean copy(List<VnextBean> vnext, FragmentBean fragment, List<NoiseBean> noises, List<ServersBean> servers, Response response, String network, Object address, Integer port, String domainStrategy, String redirect, Integer userLevel, String inboundTag, String secretKey, List<WireGuardBean> peers, List<Integer> reserved, Integer mtu, String obfsPassword) {
                return new OutSettingsBean(vnext, fragment, noises, servers, response, network, address, port, domainStrategy, redirect, userLevel, inboundTag, secretKey, peers, reserved, mtu, obfsPassword);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OutSettingsBean)) {
                    return false;
                }
                OutSettingsBean outSettingsBean = (OutSettingsBean) other;
                return yg0.a(this.vnext, outSettingsBean.vnext) && yg0.a(this.fragment, outSettingsBean.fragment) && yg0.a(this.noises, outSettingsBean.noises) && yg0.a(this.servers, outSettingsBean.servers) && yg0.a(this.response, outSettingsBean.response) && yg0.a(this.network, outSettingsBean.network) && yg0.a(this.address, outSettingsBean.address) && yg0.a(this.port, outSettingsBean.port) && yg0.a(this.domainStrategy, outSettingsBean.domainStrategy) && yg0.a(this.redirect, outSettingsBean.redirect) && yg0.a(this.userLevel, outSettingsBean.userLevel) && yg0.a(this.inboundTag, outSettingsBean.inboundTag) && yg0.a(this.secretKey, outSettingsBean.secretKey) && yg0.a(this.peers, outSettingsBean.peers) && yg0.a(this.reserved, outSettingsBean.reserved) && yg0.a(this.mtu, outSettingsBean.mtu) && yg0.a(this.obfsPassword, outSettingsBean.obfsPassword);
            }

            public final Object getAddress() {
                return this.address;
            }

            public final String getDomainStrategy() {
                return this.domainStrategy;
            }

            public final FragmentBean getFragment() {
                return this.fragment;
            }

            public final String getInboundTag() {
                return this.inboundTag;
            }

            public final Integer getMtu() {
                return this.mtu;
            }

            public final String getNetwork() {
                return this.network;
            }

            public final List<NoiseBean> getNoises() {
                return this.noises;
            }

            public final String getObfsPassword() {
                return this.obfsPassword;
            }

            public final List<WireGuardBean> getPeers() {
                return this.peers;
            }

            public final Integer getPort() {
                return this.port;
            }

            public final String getRedirect() {
                return this.redirect;
            }

            public final List<Integer> getReserved() {
                return this.reserved;
            }

            public final Response getResponse() {
                return this.response;
            }

            public final String getSecretKey() {
                return this.secretKey;
            }

            public final List<ServersBean> getServers() {
                return this.servers;
            }

            public final Integer getUserLevel() {
                return this.userLevel;
            }

            public final List<VnextBean> getVnext() {
                return this.vnext;
            }

            public int hashCode() {
                List<VnextBean> list = this.vnext;
                int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                FragmentBean fragmentBean = this.fragment;
                int iHashCode2 = (iHashCode + (fragmentBean == null ? 0 : fragmentBean.hashCode())) * 31;
                List<NoiseBean> list2 = this.noises;
                int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
                List<ServersBean> list3 = this.servers;
                int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
                Response response = this.response;
                int iHashCode5 = (iHashCode4 + (response == null ? 0 : response.hashCode())) * 31;
                String str = this.network;
                int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
                Object obj = this.address;
                int iHashCode7 = (iHashCode6 + (obj == null ? 0 : obj.hashCode())) * 31;
                Integer num = this.port;
                int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
                String str2 = this.domainStrategy;
                int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.redirect;
                int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Integer num2 = this.userLevel;
                int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
                String str4 = this.inboundTag;
                int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.secretKey;
                int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
                List<WireGuardBean> list4 = this.peers;
                int iHashCode14 = (iHashCode13 + (list4 == null ? 0 : list4.hashCode())) * 31;
                List<Integer> list5 = this.reserved;
                int iHashCode15 = (iHashCode14 + (list5 == null ? 0 : list5.hashCode())) * 31;
                Integer num3 = this.mtu;
                int iHashCode16 = (iHashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
                String str6 = this.obfsPassword;
                return iHashCode16 + (str6 != null ? str6.hashCode() : 0);
            }

            public final void setAddress(Object obj) {
                this.address = obj;
            }

            public final void setDomainStrategy(String str) {
                this.domainStrategy = str;
            }

            public final void setFragment(FragmentBean fragmentBean) {
                this.fragment = fragmentBean;
            }

            public final void setMtu(Integer num) {
                this.mtu = num;
            }

            public final void setNoises(List<NoiseBean> list) {
                this.noises = list;
            }

            public final void setObfsPassword(String str) {
                this.obfsPassword = str;
            }

            public final void setReserved(List<Integer> list) {
                this.reserved = list;
            }

            public final void setResponse(Response response) {
                this.response = response;
            }

            public final void setSecretKey(String str) {
                this.secretKey = str;
            }

            public final void setServers(List<ServersBean> list) {
                this.servers = list;
            }

            public final void setVnext(List<VnextBean> list) {
                this.vnext = list;
            }

            public String toString() {
                List<VnextBean> list = this.vnext;
                FragmentBean fragmentBean = this.fragment;
                List<NoiseBean> list2 = this.noises;
                List<ServersBean> list3 = this.servers;
                Response response = this.response;
                String str = this.network;
                Object obj = this.address;
                Integer num = this.port;
                String str2 = this.domainStrategy;
                String str3 = this.redirect;
                Integer num2 = this.userLevel;
                String str4 = this.inboundTag;
                String str5 = this.secretKey;
                List<WireGuardBean> list4 = this.peers;
                List<Integer> list5 = this.reserved;
                Integer num3 = this.mtu;
                String str6 = this.obfsPassword;
                StringBuilder sb = new StringBuilder("OutSettingsBean(vnext=");
                sb.append(list);
                sb.append(", fragment=");
                sb.append(fragmentBean);
                sb.append(", noises=");
                sb.append(list2);
                sb.append(", servers=");
                sb.append(list3);
                sb.append(", response=");
                sb.append(response);
                sb.append(", network=");
                sb.append(str);
                sb.append(", address=");
                sb.append(obj);
                sb.append(", port=");
                sb.append(num);
                sb.append(", domainStrategy=");
                hz.H(sb, str2, ", redirect=", str3, ", userLevel=");
                sb.append(num2);
                sb.append(", inboundTag=");
                sb.append(str4);
                sb.append(", secretKey=");
                sb.append(str5);
                sb.append(", peers=");
                sb.append(list4);
                sb.append(", reserved=");
                sb.append(list5);
                sb.append(", mtu=");
                sb.append(num3);
                sb.append(", obfsPassword=");
                return vh.s(sb, str6, ")");
            }

            public OutSettingsBean(List<VnextBean> list, FragmentBean fragmentBean, List<NoiseBean> list2, List<ServersBean> list3, Response response, String str, Object obj, Integer num, String str2, String str3, Integer num2, String str4, String str5, List<WireGuardBean> list4, List<Integer> list5, Integer num3, String str6) {
                this.vnext = list;
                this.fragment = fragmentBean;
                this.noises = list2;
                this.servers = list3;
                this.response = response;
                this.network = str;
                this.address = obj;
                this.port = num;
                this.domainStrategy = str2;
                this.redirect = str3;
                this.userLevel = num2;
                this.inboundTag = str4;
                this.secretKey = str5;
                this.peers = list4;
                this.reserved = list5;
                this.mtu = num3;
                this.obfsPassword = str6;
            }

            /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$VnextBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "address", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "port", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "users", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$VnextBean$UsersBean;", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getPort", "()I", "setPort", "(I)V", "getUsers", "()Ljava/util/List;", "setUsers", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", "toString", "UsersBean", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class VnextBean {
                private String address;
                private int port;
                private List<UsersBean> users;

                public VnextBean(String str, int i, List<UsersBean> list) {
                    str.getClass();
                    list.getClass();
                    this.address = str;
                    this.port = i;
                    this.users = list;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ VnextBean copy$default(VnextBean vnextBean, String str, int i, List list, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        str = vnextBean.address;
                    }
                    if ((i2 & 2) != 0) {
                        i = vnextBean.port;
                    }
                    if ((i2 & 4) != 0) {
                        list = vnextBean.users;
                    }
                    return vnextBean.copy(str, i, list);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getAddress() {
                    return this.address;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final int getPort() {
                    return this.port;
                }

                public final List<UsersBean> component3() {
                    return this.users;
                }

                public final VnextBean copy(String address, int port, List<UsersBean> users) {
                    address.getClass();
                    users.getClass();
                    return new VnextBean(address, port, users);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof VnextBean)) {
                        return false;
                    }
                    VnextBean vnextBean = (VnextBean) other;
                    return yg0.a(this.address, vnextBean.address) && this.port == vnextBean.port && yg0.a(this.users, vnextBean.users);
                }

                public final String getAddress() {
                    return this.address;
                }

                public final int getPort() {
                    return this.port;
                }

                public final List<UsersBean> getUsers() {
                    return this.users;
                }

                public int hashCode() {
                    return this.users.hashCode() + (((this.address.hashCode() * 31) + this.port) * 31);
                }

                public final void setAddress(String str) {
                    str.getClass();
                    this.address = str;
                }

                public final void setPort(int i) {
                    this.port = i;
                }

                public final void setUsers(List<UsersBean> list) {
                    list.getClass();
                    this.users = list;
                }

                public String toString() {
                    return "VnextBean(address=" + this.address + ", port=" + this.port + ", users=" + this.users + ")";
                }

                public /* synthetic */ VnextBean(String str, int i, List list, int i2, xu xuVar) {
                    this((i2 & 1) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str, (i2 & 2) != 0 ? 443 : i, list);
                }

                /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003JR\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000f¨\u0006,"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$VnextBean$UsersBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "alterId", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "security", "level", "encryption", "flow", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getAlterId", "()Ljava/lang/Integer;", "setAlterId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSecurity", "setSecurity", "getLevel", "()I", "setLevel", "(I)V", "getEncryption", "setEncryption", "getFlow", "setFlow", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$VnextBean$UsersBean;", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class UsersBean {
                    private Integer alterId;
                    private String encryption;
                    private String flow;
                    private String id;
                    private int level;
                    private String security;

                    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
                        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
                        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
                        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
                        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
                        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
                        */
                    public /* synthetic */ UsersBean(java.lang.String r2, java.lang.Integer r3, java.lang.String r4, int r5, java.lang.String r6, java.lang.String r7, int r8, defpackage.xu r9) {
                        /*
                            r1 = this;
                            r9 = r8 & 1
                            if (r9 == 0) goto L6
                            java.lang.String r2 = ""
                        L6:
                            r9 = r8 & 2
                            r0 = 0
                            if (r9 == 0) goto Lc
                            r3 = r0
                        Lc:
                            r9 = r8 & 4
                            if (r9 == 0) goto L11
                            r4 = r0
                        L11:
                            r9 = r8 & 8
                            if (r9 == 0) goto L17
                            r5 = 8
                        L17:
                            r9 = r8 & 16
                            if (r9 == 0) goto L1c
                            r6 = r0
                        L1c:
                            r8 = r8 & 32
                            if (r8 == 0) goto L28
                            r9 = r0
                            r7 = r5
                            r8 = r6
                            r5 = r3
                            r6 = r4
                            r3 = r1
                            r4 = r2
                            goto L2f
                        L28:
                            r9 = r7
                            r8 = r6
                            r6 = r4
                            r7 = r5
                            r4 = r2
                            r5 = r3
                            r3 = r1
                        L2f:
                            r3.<init>(r4, r5, r6, r7, r8, r9)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.dto.V2rayConfig.OutboundBean.OutSettingsBean.VnextBean.UsersBean.<init>(java.lang.String, java.lang.Integer, java.lang.String, int, java.lang.String, java.lang.String, int, xu):void");
                    }

                    public static /* synthetic */ UsersBean copy$default(UsersBean usersBean, String str, Integer num, String str2, int i, String str3, String str4, int i2, Object obj) {
                        if ((i2 & 1) != 0) {
                            str = usersBean.id;
                        }
                        if ((i2 & 2) != 0) {
                            num = usersBean.alterId;
                        }
                        if ((i2 & 4) != 0) {
                            str2 = usersBean.security;
                        }
                        if ((i2 & 8) != 0) {
                            i = usersBean.level;
                        }
                        if ((i2 & 16) != 0) {
                            str3 = usersBean.encryption;
                        }
                        if ((i2 & 32) != 0) {
                            str4 = usersBean.flow;
                        }
                        String str5 = str3;
                        String str6 = str4;
                        return usersBean.copy(str, num, str2, i, str5, str6);
                    }

                    /* JADX INFO: renamed from: component1, reason: from getter */
                    public final String getId() {
                        return this.id;
                    }

                    /* JADX INFO: renamed from: component2, reason: from getter */
                    public final Integer getAlterId() {
                        return this.alterId;
                    }

                    /* JADX INFO: renamed from: component3, reason: from getter */
                    public final String getSecurity() {
                        return this.security;
                    }

                    /* JADX INFO: renamed from: component4, reason: from getter */
                    public final int getLevel() {
                        return this.level;
                    }

                    /* JADX INFO: renamed from: component5, reason: from getter */
                    public final String getEncryption() {
                        return this.encryption;
                    }

                    /* JADX INFO: renamed from: component6, reason: from getter */
                    public final String getFlow() {
                        return this.flow;
                    }

                    public final UsersBean copy(String id, Integer alterId, String security, int level, String encryption, String flow) {
                        id.getClass();
                        return new UsersBean(id, alterId, security, level, encryption, flow);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof UsersBean)) {
                            return false;
                        }
                        UsersBean usersBean = (UsersBean) other;
                        return yg0.a(this.id, usersBean.id) && yg0.a(this.alterId, usersBean.alterId) && yg0.a(this.security, usersBean.security) && this.level == usersBean.level && yg0.a(this.encryption, usersBean.encryption) && yg0.a(this.flow, usersBean.flow);
                    }

                    public final Integer getAlterId() {
                        return this.alterId;
                    }

                    public final String getEncryption() {
                        return this.encryption;
                    }

                    public final String getFlow() {
                        return this.flow;
                    }

                    public final String getId() {
                        return this.id;
                    }

                    public final int getLevel() {
                        return this.level;
                    }

                    public final String getSecurity() {
                        return this.security;
                    }

                    public int hashCode() {
                        int iHashCode = this.id.hashCode() * 31;
                        Integer num = this.alterId;
                        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                        String str = this.security;
                        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.level) * 31;
                        String str2 = this.encryption;
                        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                        String str3 = this.flow;
                        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
                    }

                    public final void setAlterId(Integer num) {
                        this.alterId = num;
                    }

                    public final void setEncryption(String str) {
                        this.encryption = str;
                    }

                    public final void setFlow(String str) {
                        this.flow = str;
                    }

                    public final void setId(String str) {
                        str.getClass();
                        this.id = str;
                    }

                    public final void setLevel(int i) {
                        this.level = i;
                    }

                    public final void setSecurity(String str) {
                        this.security = str;
                    }

                    public String toString() {
                        String str = this.id;
                        Integer num = this.alterId;
                        String str2 = this.security;
                        int i = this.level;
                        String str3 = this.encryption;
                        String str4 = this.flow;
                        StringBuilder sb = new StringBuilder("UsersBean(id=");
                        sb.append(str);
                        sb.append(", alterId=");
                        sb.append(num);
                        sb.append(", security=");
                        sb.append(str2);
                        sb.append(", level=");
                        sb.append(i);
                        sb.append(", encryption=");
                        return hz.x(sb, str3, ", flow=", str4, ")");
                    }

                    public UsersBean(String str, Integer num, String str2, int i, String str3, String str4) {
                        str.getClass();
                        this.id = str;
                        this.alterId = num;
                        this.security = str2;
                        this.level = i;
                        this.encryption = str3;
                        this.flow = str4;
                    }

                    public UsersBean() {
                        this(null, null, null, 0, null, null, 63, null);
                    }
                }
            }

            /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$FragmentBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "packets", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "length", "interval", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPackets", "()Ljava/lang/String;", "setPackets", "(Ljava/lang/String;)V", "getLength", "setLength", "getInterval", "setInterval", "component1", "component2", "component3", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class FragmentBean {
                private String interval;
                private String length;
                private String packets;

                public /* synthetic */ FragmentBean(String str, String str2, String str3, int i, xu xuVar) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
                }

                public static /* synthetic */ FragmentBean copy$default(FragmentBean fragmentBean, String str, String str2, String str3, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = fragmentBean.packets;
                    }
                    if ((i & 2) != 0) {
                        str2 = fragmentBean.length;
                    }
                    if ((i & 4) != 0) {
                        str3 = fragmentBean.interval;
                    }
                    return fragmentBean.copy(str, str2, str3);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getPackets() {
                    return this.packets;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getLength() {
                    return this.length;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final String getInterval() {
                    return this.interval;
                }

                public final FragmentBean copy(String packets, String length, String interval) {
                    return new FragmentBean(packets, length, interval);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof FragmentBean)) {
                        return false;
                    }
                    FragmentBean fragmentBean = (FragmentBean) other;
                    return yg0.a(this.packets, fragmentBean.packets) && yg0.a(this.length, fragmentBean.length) && yg0.a(this.interval, fragmentBean.interval);
                }

                public final String getInterval() {
                    return this.interval;
                }

                public final String getLength() {
                    return this.length;
                }

                public final String getPackets() {
                    return this.packets;
                }

                public int hashCode() {
                    String str = this.packets;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.length;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.interval;
                    return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
                }

                public final void setInterval(String str) {
                    this.interval = str;
                }

                public final void setLength(String str) {
                    this.length = str;
                }

                public final void setPackets(String str) {
                    this.packets = str;
                }

                public String toString() {
                    String str = this.packets;
                    String str2 = this.length;
                    return vh.s(hz.A("FragmentBean(packets=", str, ", length=", str2, ", interval="), this.interval, ")");
                }

                public FragmentBean(String str, String str2, String str3) {
                    this.packets = str;
                    this.length = str2;
                    this.interval = str3;
                }

                public FragmentBean() {
                    this(null, null, null, 7, null);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$NoiseBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "type", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "packet", "delay", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getPacket", "setPacket", "getDelay", "setDelay", "component1", "component2", "component3", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class NoiseBean {
                private String delay;
                private String packet;
                private String type;

                public /* synthetic */ NoiseBean(String str, String str2, String str3, int i, xu xuVar) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
                }

                public static /* synthetic */ NoiseBean copy$default(NoiseBean noiseBean, String str, String str2, String str3, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = noiseBean.type;
                    }
                    if ((i & 2) != 0) {
                        str2 = noiseBean.packet;
                    }
                    if ((i & 4) != 0) {
                        str3 = noiseBean.delay;
                    }
                    return noiseBean.copy(str, str2, str3);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getType() {
                    return this.type;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getPacket() {
                    return this.packet;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final String getDelay() {
                    return this.delay;
                }

                public final NoiseBean copy(String type, String packet, String delay) {
                    return new NoiseBean(type, packet, delay);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof NoiseBean)) {
                        return false;
                    }
                    NoiseBean noiseBean = (NoiseBean) other;
                    return yg0.a(this.type, noiseBean.type) && yg0.a(this.packet, noiseBean.packet) && yg0.a(this.delay, noiseBean.delay);
                }

                public final String getDelay() {
                    return this.delay;
                }

                public final String getPacket() {
                    return this.packet;
                }

                public final String getType() {
                    return this.type;
                }

                public int hashCode() {
                    String str = this.type;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.packet;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.delay;
                    return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
                }

                public final void setDelay(String str) {
                    this.delay = str;
                }

                public final void setPacket(String str) {
                    this.packet = str;
                }

                public final void setType(String str) {
                    this.type = str;
                }

                public String toString() {
                    String str = this.type;
                    String str2 = this.packet;
                    return vh.s(hz.A("NoiseBean(type=", str, ", packet=", str2, ", delay="), this.delay, ")");
                }

                public NoiseBean(String str, String str2, String str3) {
                    this.type = str;
                    this.packet = str2;
                    this.delay = str3;
                }

                public NoiseBean() {
                    this(null, null, null, 7, null);
                }
            }

            public OutSettingsBean() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
            }

            /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b0\b\u0086\b\u0018\u00002\u00020\u0001:\u0001?B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\tHÆ\u0003J\t\u00104\u001a\u00020\tHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010)J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0084\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u00062\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\tHÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010\u0016R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006@"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$ServersBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "address", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "method", "ota", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "password", "port", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "level", "email", "flow", "ivCheck", "users", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$ServersBean$SocksUsersBean;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getMethod", "setMethod", "getOta", "()Z", "setOta", "(Z)V", "getPassword", "setPassword", "getPort", "()I", "setPort", "(I)V", "getLevel", "setLevel", "getEmail", "getFlow", "setFlow", "getIvCheck", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUsers", "()Ljava/util/List;", "setUsers", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$ServersBean;", "equals", "other", "hashCode", "toString", "SocksUsersBean", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class ServersBean {
                private String address;
                private final String email;
                private String flow;
                private final Boolean ivCheck;
                private int level;
                private String method;
                private boolean ota;
                private String password;
                private int port;
                private List<SocksUsersBean> users;

                /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
                    	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
                    	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
                    	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
                    	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
                    	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
                    */
                public /* synthetic */ ServersBean(java.lang.String r2, java.lang.String r3, boolean r4, java.lang.String r5, int r6, int r7, java.lang.String r8, java.lang.String r9, java.lang.Boolean r10, java.util.List r11, int r12, defpackage.xu r13) {
                    /*
                        r1 = this;
                        r13 = r12 & 1
                        if (r13 == 0) goto L6
                        java.lang.String r2 = ""
                    L6:
                        r13 = r12 & 2
                        r0 = 0
                        if (r13 == 0) goto Lc
                        r3 = r0
                    Lc:
                        r13 = r12 & 4
                        if (r13 == 0) goto L11
                        r4 = 0
                    L11:
                        r13 = r12 & 8
                        if (r13 == 0) goto L16
                        r5 = r0
                    L16:
                        r13 = r12 & 16
                        if (r13 == 0) goto L1c
                        r6 = 443(0x1bb, float:6.21E-43)
                    L1c:
                        r13 = r12 & 32
                        if (r13 == 0) goto L22
                        r7 = 8
                    L22:
                        r13 = r12 & 64
                        if (r13 == 0) goto L27
                        r8 = r0
                    L27:
                        r13 = r12 & 128(0x80, float:1.8E-43)
                        if (r13 == 0) goto L2c
                        r9 = r0
                    L2c:
                        r13 = r12 & 256(0x100, float:3.59E-43)
                        if (r13 == 0) goto L31
                        r10 = r0
                    L31:
                        r12 = r12 & 512(0x200, float:7.17E-43)
                        if (r12 == 0) goto L41
                        r13 = r0
                        r11 = r9
                        r12 = r10
                        r9 = r7
                        r10 = r8
                        r7 = r5
                        r8 = r6
                        r5 = r3
                        r6 = r4
                        r3 = r1
                        r4 = r2
                        goto L4c
                    L41:
                        r13 = r11
                        r12 = r10
                        r10 = r8
                        r11 = r9
                        r8 = r6
                        r9 = r7
                        r6 = r4
                        r7 = r5
                        r4 = r2
                        r5 = r3
                        r3 = r1
                    L4c:
                        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.dto.V2rayConfig.OutboundBean.OutSettingsBean.ServersBean.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.Boolean, java.util.List, int, xu):void");
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ ServersBean copy$default(ServersBean serversBean, String str, String str2, boolean z, String str3, int i, int i2, String str4, String str5, Boolean bool, List list, int i3, Object obj) {
                    if ((i3 & 1) != 0) {
                        str = serversBean.address;
                    }
                    if ((i3 & 2) != 0) {
                        str2 = serversBean.method;
                    }
                    if ((i3 & 4) != 0) {
                        z = serversBean.ota;
                    }
                    if ((i3 & 8) != 0) {
                        str3 = serversBean.password;
                    }
                    if ((i3 & 16) != 0) {
                        i = serversBean.port;
                    }
                    if ((i3 & 32) != 0) {
                        i2 = serversBean.level;
                    }
                    if ((i3 & 64) != 0) {
                        str4 = serversBean.email;
                    }
                    if ((i3 & 128) != 0) {
                        str5 = serversBean.flow;
                    }
                    if ((i3 & 256) != 0) {
                        bool = serversBean.ivCheck;
                    }
                    if ((i3 & 512) != 0) {
                        list = serversBean.users;
                    }
                    Boolean bool2 = bool;
                    List list2 = list;
                    String str6 = str4;
                    String str7 = str5;
                    int i4 = i;
                    int i5 = i2;
                    return serversBean.copy(str, str2, z, str3, i4, i5, str6, str7, bool2, list2);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getAddress() {
                    return this.address;
                }

                public final List<SocksUsersBean> component10() {
                    return this.users;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getMethod() {
                    return this.method;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final boolean getOta() {
                    return this.ota;
                }

                /* JADX INFO: renamed from: component4, reason: from getter */
                public final String getPassword() {
                    return this.password;
                }

                /* JADX INFO: renamed from: component5, reason: from getter */
                public final int getPort() {
                    return this.port;
                }

                /* JADX INFO: renamed from: component6, reason: from getter */
                public final int getLevel() {
                    return this.level;
                }

                /* JADX INFO: renamed from: component7, reason: from getter */
                public final String getEmail() {
                    return this.email;
                }

                /* JADX INFO: renamed from: component8, reason: from getter */
                public final String getFlow() {
                    return this.flow;
                }

                /* JADX INFO: renamed from: component9, reason: from getter */
                public final Boolean getIvCheck() {
                    return this.ivCheck;
                }

                public final ServersBean copy(String address, String method, boolean ota, String password, int port, int level, String email, String flow, Boolean ivCheck, List<SocksUsersBean> users) {
                    address.getClass();
                    return new ServersBean(address, method, ota, password, port, level, email, flow, ivCheck, users);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ServersBean)) {
                        return false;
                    }
                    ServersBean serversBean = (ServersBean) other;
                    return yg0.a(this.address, serversBean.address) && yg0.a(this.method, serversBean.method) && this.ota == serversBean.ota && yg0.a(this.password, serversBean.password) && this.port == serversBean.port && this.level == serversBean.level && yg0.a(this.email, serversBean.email) && yg0.a(this.flow, serversBean.flow) && yg0.a(this.ivCheck, serversBean.ivCheck) && yg0.a(this.users, serversBean.users);
                }

                public final String getAddress() {
                    return this.address;
                }

                public final String getEmail() {
                    return this.email;
                }

                public final String getFlow() {
                    return this.flow;
                }

                public final Boolean getIvCheck() {
                    return this.ivCheck;
                }

                public final int getLevel() {
                    return this.level;
                }

                public final String getMethod() {
                    return this.method;
                }

                public final boolean getOta() {
                    return this.ota;
                }

                public final String getPassword() {
                    return this.password;
                }

                public final int getPort() {
                    return this.port;
                }

                public final List<SocksUsersBean> getUsers() {
                    return this.users;
                }

                public int hashCode() {
                    int iHashCode = this.address.hashCode() * 31;
                    String str = this.method;
                    int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.ota ? 1231 : 1237)) * 31;
                    String str2 = this.password;
                    int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.port) * 31) + this.level) * 31;
                    String str3 = this.email;
                    int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    String str4 = this.flow;
                    int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                    Boolean bool = this.ivCheck;
                    int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
                    List<SocksUsersBean> list = this.users;
                    return iHashCode6 + (list != null ? list.hashCode() : 0);
                }

                public final void setAddress(String str) {
                    str.getClass();
                    this.address = str;
                }

                public final void setFlow(String str) {
                    this.flow = str;
                }

                public final void setLevel(int i) {
                    this.level = i;
                }

                public final void setMethod(String str) {
                    this.method = str;
                }

                public final void setOta(boolean z) {
                    this.ota = z;
                }

                public final void setPassword(String str) {
                    this.password = str;
                }

                public final void setPort(int i) {
                    this.port = i;
                }

                public final void setUsers(List<SocksUsersBean> list) {
                    this.users = list;
                }

                public String toString() {
                    String str = this.address;
                    String str2 = this.method;
                    boolean z = this.ota;
                    String str3 = this.password;
                    int i = this.port;
                    int i2 = this.level;
                    String str4 = this.email;
                    String str5 = this.flow;
                    Boolean bool = this.ivCheck;
                    List<SocksUsersBean> list = this.users;
                    StringBuilder sbA = hz.A("ServersBean(address=", str, ", method=", str2, ", ota=");
                    sbA.append(z);
                    sbA.append(", password=");
                    sbA.append(str3);
                    sbA.append(", port=");
                    ec1.M(i, i2, ", level=", ", email=", sbA);
                    hz.H(sbA, str4, ", flow=", str5, ", ivCheck=");
                    sbA.append(bool);
                    sbA.append(", users=");
                    sbA.append(list);
                    sbA.append(")");
                    return sbA.toString();
                }

                /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
                @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$ServersBean$SocksUsersBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "user", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "pass", "level", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getUser", "()Ljava/lang/String;", "setUser", "(Ljava/lang/String;)V", "getPass", "setPass", "getLevel", "()I", "setLevel", "(I)V", "component1", "component2", "component3", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class SocksUsersBean {
                    private int level;
                    private String pass;
                    private String user;

                    public /* synthetic */ SocksUsersBean(String str, String str2, int i, int i2, xu xuVar) {
                        this((i2 & 1) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str, (i2 & 2) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str2, (i2 & 4) != 0 ? 8 : i);
                    }

                    public static /* synthetic */ SocksUsersBean copy$default(SocksUsersBean socksUsersBean, String str, String str2, int i, int i2, Object obj) {
                        if ((i2 & 1) != 0) {
                            str = socksUsersBean.user;
                        }
                        if ((i2 & 2) != 0) {
                            str2 = socksUsersBean.pass;
                        }
                        if ((i2 & 4) != 0) {
                            i = socksUsersBean.level;
                        }
                        return socksUsersBean.copy(str, str2, i);
                    }

                    /* JADX INFO: renamed from: component1, reason: from getter */
                    public final String getUser() {
                        return this.user;
                    }

                    /* JADX INFO: renamed from: component2, reason: from getter */
                    public final String getPass() {
                        return this.pass;
                    }

                    /* JADX INFO: renamed from: component3, reason: from getter */
                    public final int getLevel() {
                        return this.level;
                    }

                    public final SocksUsersBean copy(String user, String pass, int level) {
                        user.getClass();
                        pass.getClass();
                        return new SocksUsersBean(user, pass, level);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof SocksUsersBean)) {
                            return false;
                        }
                        SocksUsersBean socksUsersBean = (SocksUsersBean) other;
                        return yg0.a(this.user, socksUsersBean.user) && yg0.a(this.pass, socksUsersBean.pass) && this.level == socksUsersBean.level;
                    }

                    public final int getLevel() {
                        return this.level;
                    }

                    public final String getPass() {
                        return this.pass;
                    }

                    public final String getUser() {
                        return this.user;
                    }

                    public int hashCode() {
                        return vh.c(this.user.hashCode() * 31, 31, this.pass) + this.level;
                    }

                    public final void setLevel(int i) {
                        this.level = i;
                    }

                    public final void setPass(String str) {
                        str.getClass();
                        this.pass = str;
                    }

                    public final void setUser(String str) {
                        str.getClass();
                        this.user = str;
                    }

                    public String toString() {
                        return hz.q(this.level, ")", hz.A("SocksUsersBean(user=", this.user, ", pass=", this.pass, ", level="));
                    }

                    public SocksUsersBean(String str, String str2, int i) {
                        str.getClass();
                        str2.getClass();
                        this.user = str;
                        this.pass = str2;
                        this.level = i;
                    }

                    public SocksUsersBean() {
                        this(null, null, 0, 7, null);
                    }
                }

                public ServersBean(String str, String str2, boolean z, String str3, int i, int i2, String str4, String str5, Boolean bool, List<SocksUsersBean> list) {
                    str.getClass();
                    this.address = str;
                    this.method = str2;
                    this.ota = z;
                    this.password = str3;
                    this.port = i;
                    this.level = i2;
                    this.email = str4;
                    this.flow = str5;
                    this.ivCheck = bool;
                    this.users = list;
                }

                public ServersBean() {
                    this(null, null, false, null, 0, 0, null, null, null, null, 1023, null);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$OutSettingsBean$WireGuardBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "publicKey", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "preSharedKey", "endpoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPublicKey", "()Ljava/lang/String;", "setPublicKey", "(Ljava/lang/String;)V", "getPreSharedKey", "setPreSharedKey", "getEndpoint", "setEndpoint", "component1", "component2", "component3", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class WireGuardBean {
                private String endpoint;
                private String preSharedKey;
                private String publicKey;

                public /* synthetic */ WireGuardBean(String str, String str2, String str3, int i, xu xuVar) {
                    this((i & 1) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str3);
                }

                public static /* synthetic */ WireGuardBean copy$default(WireGuardBean wireGuardBean, String str, String str2, String str3, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = wireGuardBean.publicKey;
                    }
                    if ((i & 2) != 0) {
                        str2 = wireGuardBean.preSharedKey;
                    }
                    if ((i & 4) != 0) {
                        str3 = wireGuardBean.endpoint;
                    }
                    return wireGuardBean.copy(str, str2, str3);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getPublicKey() {
                    return this.publicKey;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getPreSharedKey() {
                    return this.preSharedKey;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final String getEndpoint() {
                    return this.endpoint;
                }

                public final WireGuardBean copy(String publicKey, String preSharedKey, String endpoint) {
                    publicKey.getClass();
                    endpoint.getClass();
                    return new WireGuardBean(publicKey, preSharedKey, endpoint);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof WireGuardBean)) {
                        return false;
                    }
                    WireGuardBean wireGuardBean = (WireGuardBean) other;
                    return yg0.a(this.publicKey, wireGuardBean.publicKey) && yg0.a(this.preSharedKey, wireGuardBean.preSharedKey) && yg0.a(this.endpoint, wireGuardBean.endpoint);
                }

                public final String getEndpoint() {
                    return this.endpoint;
                }

                public final String getPreSharedKey() {
                    return this.preSharedKey;
                }

                public final String getPublicKey() {
                    return this.publicKey;
                }

                public int hashCode() {
                    int iHashCode = this.publicKey.hashCode() * 31;
                    String str = this.preSharedKey;
                    return this.endpoint.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
                }

                public final void setEndpoint(String str) {
                    str.getClass();
                    this.endpoint = str;
                }

                public final void setPreSharedKey(String str) {
                    this.preSharedKey = str;
                }

                public final void setPublicKey(String str) {
                    str.getClass();
                    this.publicKey = str;
                }

                public String toString() {
                    String str = this.publicKey;
                    String str2 = this.preSharedKey;
                    return vh.s(hz.A("WireGuardBean(publicKey=", str, ", preSharedKey=", str2, ", endpoint="), this.endpoint, ")");
                }

                public WireGuardBean(String str, String str2, String str3) {
                    str.getClass();
                    str3.getClass();
                    this.publicKey = str;
                    this.preSharedKey = str2;
                    this.endpoint = str3;
                }

                public WireGuardBean() {
                    this(null, null, null, 7, null);
                }
            }
        }

        public /* synthetic */ OutboundBean(String str, String str2, OutSettingsBean outSettingsBean, StreamSettingsBean streamSettingsBean, Object obj, String str3, MuxBean muxBean, int i, xu xuVar) {
            this((i & 1) != 0 ? "proxy" : str, str2, (i & 4) != 0 ? null : outSettingsBean, (i & 8) != 0 ? null : streamSettingsBean, (i & 16) != 0 ? null : obj, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? new MuxBean(false, null, null, null, 14, null) : muxBean);
        }

        public static /* synthetic */ OutboundBean copy$default(OutboundBean outboundBean, String str, String str2, OutSettingsBean outSettingsBean, StreamSettingsBean streamSettingsBean, Object obj, String str3, MuxBean muxBean, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = outboundBean.tag;
            }
            if ((i & 2) != 0) {
                str2 = outboundBean.protocol;
            }
            if ((i & 4) != 0) {
                outSettingsBean = outboundBean.settings;
            }
            if ((i & 8) != 0) {
                streamSettingsBean = outboundBean.streamSettings;
            }
            if ((i & 16) != 0) {
                obj = outboundBean.proxySettings;
            }
            if ((i & 32) != 0) {
                str3 = outboundBean.sendThrough;
            }
            if ((i & 64) != 0) {
                muxBean = outboundBean.mux;
            }
            String str4 = str3;
            MuxBean muxBean2 = muxBean;
            Object obj3 = obj;
            OutSettingsBean outSettingsBean2 = outSettingsBean;
            return outboundBean.copy(str, str2, outSettingsBean2, streamSettingsBean, obj3, str4, muxBean2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getProtocol() {
            return this.protocol;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final OutSettingsBean getSettings() {
            return this.settings;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final StreamSettingsBean getStreamSettings() {
            return this.streamSettings;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Object getProxySettings() {
            return this.proxySettings;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getSendThrough() {
            return this.sendThrough;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final MuxBean getMux() {
            return this.mux;
        }

        public final OutboundBean copy(String tag, String protocol, OutSettingsBean settings, StreamSettingsBean streamSettings, Object proxySettings, String sendThrough, MuxBean mux) {
            tag.getClass();
            protocol.getClass();
            return new OutboundBean(tag, protocol, settings, streamSettings, proxySettings, sendThrough, mux);
        }

        public final StreamSettingsBean.SockoptBean ensureSockopt() {
            StreamSettingsBean streamSettingsBean = this.streamSettings;
            if (streamSettingsBean == null) {
                StreamSettingsBean streamSettingsBean2 = new StreamSettingsBean(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
                this.streamSettings = streamSettingsBean2;
                streamSettingsBean = streamSettingsBean2;
            }
            StreamSettingsBean.SockoptBean sockopt = streamSettingsBean.getSockopt();
            if (sockopt != null) {
                return sockopt;
            }
            StreamSettingsBean.SockoptBean sockoptBean = new StreamSettingsBean.SockoptBean(null, null, null, null, null, null, null, 127, null);
            streamSettingsBean.setSockopt(sockoptBean);
            return sockoptBean;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OutboundBean)) {
                return false;
            }
            OutboundBean outboundBean = (OutboundBean) other;
            return yg0.a(this.tag, outboundBean.tag) && yg0.a(this.protocol, outboundBean.protocol) && yg0.a(this.settings, outboundBean.settings) && yg0.a(this.streamSettings, outboundBean.streamSettings) && yg0.a(this.proxySettings, outboundBean.proxySettings) && yg0.a(this.sendThrough, outboundBean.sendThrough) && yg0.a(this.mux, outboundBean.mux);
        }

        public final MuxBean getMux() {
            return this.mux;
        }

        public final String getPassword() {
            List<OutSettingsBean.VnextBean> vnext;
            OutSettingsBean.VnextBean vnextBean;
            List<OutSettingsBean.VnextBean.UsersBean> users;
            OutSettingsBean.VnextBean.UsersBean usersBean;
            List<OutSettingsBean.ServersBean> servers;
            OutSettingsBean.ServersBean serversBean;
            List<OutSettingsBean.ServersBean> servers2;
            OutSettingsBean.ServersBean serversBean2;
            List<OutSettingsBean.ServersBean.SocksUsersBean> users2;
            OutSettingsBean.ServersBean.SocksUsersBean socksUsersBean;
            OutSettingsBean outSettingsBean;
            if (g.w(this.protocol, "VMESS", true) || g.w(this.protocol, "VLESS", true)) {
                OutSettingsBean outSettingsBean2 = this.settings;
                if (outSettingsBean2 == null || (vnext = outSettingsBean2.getVnext()) == null || (vnextBean = (OutSettingsBean.VnextBean) c.r(vnext)) == null || (users = vnextBean.getUsers()) == null || (usersBean = (OutSettingsBean.VnextBean.UsersBean) c.r(users)) == null) {
                    return null;
                }
                return usersBean.getId();
            }
            if (g.w(this.protocol, "SHADOWSOCKS", true) || g.w(this.protocol, "TROJAN", true) || g.w(this.protocol, "HYSTERIA2", true)) {
                OutSettingsBean outSettingsBean3 = this.settings;
                if (outSettingsBean3 == null || (servers = outSettingsBean3.getServers()) == null || (serversBean = (OutSettingsBean.ServersBean) c.r(servers)) == null) {
                    return null;
                }
                return serversBean.getPassword();
            }
            if (!g.w(this.protocol, "SOCKS", true) && !g.w(this.protocol, "HTTP", true)) {
                if (!g.w(this.protocol, "WIREGUARD", true) || (outSettingsBean = this.settings) == null) {
                    return null;
                }
                return outSettingsBean.getSecretKey();
            }
            OutSettingsBean outSettingsBean4 = this.settings;
            if (outSettingsBean4 == null || (servers2 = outSettingsBean4.getServers()) == null || (serversBean2 = (OutSettingsBean.ServersBean) c.r(servers2)) == null || (users2 = serversBean2.getUsers()) == null || (socksUsersBean = (OutSettingsBean.ServersBean.SocksUsersBean) c.r(users2)) == null) {
                return null;
            }
            return socksUsersBean.getPass();
        }

        public final String getProtocol() {
            return this.protocol;
        }

        public final Object getProxySettings() {
            return this.proxySettings;
        }

        public final String getSecurityEncryption() {
            OutSettingsBean outSettingsBean;
            List<OutSettingsBean.ServersBean> servers;
            OutSettingsBean.ServersBean serversBean;
            List<OutSettingsBean.VnextBean> vnext;
            OutSettingsBean.VnextBean vnextBean;
            List<OutSettingsBean.VnextBean.UsersBean> users;
            OutSettingsBean.VnextBean.UsersBean usersBean;
            List<OutSettingsBean.VnextBean> vnext2;
            OutSettingsBean.VnextBean vnextBean2;
            List<OutSettingsBean.VnextBean.UsersBean> users2;
            OutSettingsBean.VnextBean.UsersBean usersBean2;
            if (g.w(this.protocol, "VMESS", true)) {
                OutSettingsBean outSettingsBean2 = this.settings;
                if (outSettingsBean2 == null || (vnext2 = outSettingsBean2.getVnext()) == null || (vnextBean2 = (OutSettingsBean.VnextBean) c.r(vnext2)) == null || (users2 = vnextBean2.getUsers()) == null || (usersBean2 = (OutSettingsBean.VnextBean.UsersBean) c.r(users2)) == null) {
                    return null;
                }
                return usersBean2.getSecurity();
            }
            if (!g.w(this.protocol, "VLESS", true)) {
                if (!g.w(this.protocol, "SHADOWSOCKS", true) || (outSettingsBean = this.settings) == null || (servers = outSettingsBean.getServers()) == null || (serversBean = (OutSettingsBean.ServersBean) c.r(servers)) == null) {
                    return null;
                }
                return serversBean.getMethod();
            }
            OutSettingsBean outSettingsBean3 = this.settings;
            if (outSettingsBean3 == null || (vnext = outSettingsBean3.getVnext()) == null || (vnextBean = (OutSettingsBean.VnextBean) c.r(vnext)) == null || (users = vnextBean.getUsers()) == null || (usersBean = (OutSettingsBean.VnextBean.UsersBean) c.r(users)) == null) {
                return null;
            }
            return usersBean.getEncryption();
        }

        public final String getSendThrough() {
            return this.sendThrough;
        }

        public final String getServerAddress() {
            List<OutSettingsBean.VnextBean> vnext;
            OutSettingsBean.VnextBean vnextBean;
            List<OutSettingsBean.ServersBean> servers;
            OutSettingsBean.ServersBean serversBean;
            OutSettingsBean outSettingsBean;
            List<OutSettingsBean.WireGuardBean> peers;
            OutSettingsBean.WireGuardBean wireGuardBean;
            String endpoint;
            if (g.w(this.protocol, "VMESS", true) || g.w(this.protocol, "VLESS", true)) {
                OutSettingsBean outSettingsBean2 = this.settings;
                if (outSettingsBean2 == null || (vnext = outSettingsBean2.getVnext()) == null || (vnextBean = (OutSettingsBean.VnextBean) c.r(vnext)) == null) {
                    return null;
                }
                return vnextBean.getAddress();
            }
            if (g.w(this.protocol, "SHADOWSOCKS", true) || g.w(this.protocol, "SOCKS", true) || g.w(this.protocol, "HTTP", true) || g.w(this.protocol, "TROJAN", true) || g.w(this.protocol, "HYSTERIA2", true)) {
                OutSettingsBean outSettingsBean3 = this.settings;
                if (outSettingsBean3 == null || (servers = outSettingsBean3.getServers()) == null || (serversBean = (OutSettingsBean.ServersBean) c.r(servers)) == null) {
                    return null;
                }
                return serversBean.getAddress();
            }
            if (!g.w(this.protocol, "WIREGUARD", true) || (outSettingsBean = this.settings) == null || (peers = outSettingsBean.getPeers()) == null || (wireGuardBean = (OutSettingsBean.WireGuardBean) c.r(peers)) == null || (endpoint = wireGuardBean.getEndpoint()) == null) {
                return null;
            }
            int iD = g.D(6, endpoint, ":");
            return iD == -1 ? endpoint : endpoint.substring(0, iD);
        }

        public final String getServerAddressAndPort() {
            String serverAddress = getServerAddress();
            if (serverAddress == null) {
                serverAddress = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            Integer serverPort = getServerPort();
            Regex regex = ul1.a;
            return ul1.l(serverAddress) + ":" + serverPort;
        }

        public final Integer getServerPort() {
            List<OutSettingsBean.VnextBean> vnext;
            OutSettingsBean.VnextBean vnextBean;
            List<OutSettingsBean.ServersBean> servers;
            OutSettingsBean.ServersBean serversBean;
            OutSettingsBean outSettingsBean;
            List<OutSettingsBean.WireGuardBean> peers;
            OutSettingsBean.WireGuardBean wireGuardBean;
            String endpoint;
            if (g.w(this.protocol, "VMESS", true) || g.w(this.protocol, "VLESS", true)) {
                OutSettingsBean outSettingsBean2 = this.settings;
                if (outSettingsBean2 == null || (vnext = outSettingsBean2.getVnext()) == null || (vnextBean = (OutSettingsBean.VnextBean) c.r(vnext)) == null) {
                    return null;
                }
                return Integer.valueOf(vnextBean.getPort());
            }
            if (g.w(this.protocol, "SHADOWSOCKS", true) || g.w(this.protocol, "SOCKS", true) || g.w(this.protocol, "HTTP", true) || g.w(this.protocol, "TROJAN", true) || g.w(this.protocol, "HYSTERIA2", true)) {
                OutSettingsBean outSettingsBean3 = this.settings;
                if (outSettingsBean3 == null || (servers = outSettingsBean3.getServers()) == null || (serversBean = (OutSettingsBean.ServersBean) c.r(servers)) == null) {
                    return null;
                }
                return Integer.valueOf(serversBean.getPort());
            }
            if (!g.w(this.protocol, "WIREGUARD", true) || (outSettingsBean = this.settings) == null || (peers = outSettingsBean.getPeers()) == null || (wireGuardBean = (OutSettingsBean.WireGuardBean) c.r(peers)) == null || (endpoint = wireGuardBean.getEndpoint()) == null) {
                return null;
            }
            return Integer.valueOf(Integer.parseInt(g.V(endpoint, ":")));
        }

        public final OutSettingsBean getSettings() {
            return this.settings;
        }

        public final StreamSettingsBean getStreamSettings() {
            return this.streamSettings;
        }

        public final String getTag() {
            return this.tag;
        }

        public final List<String> getTransportSettingDetails() {
            StreamSettingsBean streamSettingsBean;
            String network;
            StreamSettingsBean streamSettingsBean2;
            StreamSettingsBean.GrpcSettingsBean grpcSettings;
            StreamSettingsBean.HttpSettingsBean httpSettings;
            StreamSettingsBean.XhttpSettingsBean xhttpSettings;
            StreamSettingsBean.HttpupgradeSettingsBean httpupgradeSettings;
            StreamSettingsBean.WsSettingsBean wsSettings;
            StreamSettingsBean.KcpSettingsBean kcpSettings;
            StreamSettingsBean.TcpSettingsBean tcpSettings;
            List<String> path;
            StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean.HeadersBean headers;
            List<String> host;
            String strW = null;
            if ((g.w(this.protocol, "VMESS", true) || g.w(this.protocol, "VLESS", true) || g.w(this.protocol, "TROJAN", true) || g.w(this.protocol, "SHADOWSOCKS", true)) && (streamSettingsBean = this.streamSettings) != null && (network = streamSettingsBean.getNetwork()) != null) {
                boolean zEquals = network.equals(NetworkType.TCP.getType());
                String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                if (zEquals) {
                    StreamSettingsBean streamSettingsBean3 = this.streamSettings;
                    if (streamSettingsBean3 != null && (tcpSettings = streamSettingsBean3.getTcpSettings()) != null) {
                        String type = tcpSettings.getHeader().getType();
                        StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean request = tcpSettings.getHeader().getRequest();
                        String strW2 = (request == null || (headers = request.getHeaders()) == null || (host = headers.getHost()) == null) ? null : c.w(host, ",", null, null, null, 62);
                        if (strW2 == null) {
                            strW2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean request2 = tcpSettings.getHeader().getRequest();
                        if (request2 != null && (path = request2.getPath()) != null) {
                            strW = c.w(path, ",", null, null, null, 62);
                        }
                        if (strW != null) {
                            str = strW;
                        }
                        return c.A(type, strW2, str);
                    }
                } else if (network.equals(NetworkType.KCP.getType())) {
                    StreamSettingsBean streamSettingsBean4 = this.streamSettings;
                    if (streamSettingsBean4 != null && (kcpSettings = streamSettingsBean4.getKcpSettings()) != null) {
                        String type2 = kcpSettings.getHeader().getType();
                        String seed = kcpSettings.getSeed();
                        if (seed == null) {
                            seed = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        return c.A(type2, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, seed);
                    }
                } else if (network.equals(NetworkType.WS.getType())) {
                    StreamSettingsBean streamSettingsBean5 = this.streamSettings;
                    if (streamSettingsBean5 != null && (wsSettings = streamSettingsBean5.getWsSettings()) != null) {
                        return c.A(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, wsSettings.getHeaders().getHost(), wsSettings.getPath());
                    }
                } else if (network.equals(NetworkType.HTTP_UPGRADE.getType())) {
                    StreamSettingsBean streamSettingsBean6 = this.streamSettings;
                    if (streamSettingsBean6 != null && (httpupgradeSettings = streamSettingsBean6.getHttpupgradeSettings()) != null) {
                        return c.A(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, httpupgradeSettings.getHost(), httpupgradeSettings.getPath());
                    }
                } else if (network.equals(NetworkType.XHTTP.getType())) {
                    StreamSettingsBean streamSettingsBean7 = this.streamSettings;
                    if (streamSettingsBean7 != null && (xhttpSettings = streamSettingsBean7.getXhttpSettings()) != null) {
                        return c.A(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, xhttpSettings.getHost(), xhttpSettings.getPath());
                    }
                } else if (network.equals(NetworkType.H2.getType())) {
                    StreamSettingsBean streamSettingsBean8 = this.streamSettings;
                    if (streamSettingsBean8 != null && (httpSettings = streamSettingsBean8.getHttpSettings()) != null) {
                        return c.A(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, c.w(httpSettings.getHost(), ",", null, null, null, 62), httpSettings.getPath());
                    }
                } else if (network.equals(NetworkType.GRPC.getType()) && (streamSettingsBean2 = this.streamSettings) != null && (grpcSettings = streamSettingsBean2.getGrpcSettings()) != null) {
                    String str2 = yg0.a(grpcSettings.getMultiMode(), Boolean.TRUE) ? "multi" : "gun";
                    String authority = grpcSettings.getAuthority();
                    if (authority != null) {
                        str = authority;
                    }
                    return c.A(str2, str, grpcSettings.getServiceName());
                }
            }
            return null;
        }

        public int hashCode() {
            int iC = vh.c(this.tag.hashCode() * 31, 31, this.protocol);
            OutSettingsBean outSettingsBean = this.settings;
            int iHashCode = (iC + (outSettingsBean == null ? 0 : outSettingsBean.hashCode())) * 31;
            StreamSettingsBean streamSettingsBean = this.streamSettings;
            int iHashCode2 = (iHashCode + (streamSettingsBean == null ? 0 : streamSettingsBean.hashCode())) * 31;
            Object obj = this.proxySettings;
            int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
            String str = this.sendThrough;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            MuxBean muxBean = this.mux;
            return iHashCode4 + (muxBean != null ? muxBean.hashCode() : 0);
        }

        public final void setMux(MuxBean muxBean) {
            this.mux = muxBean;
        }

        public final void setProtocol(String str) {
            str.getClass();
            this.protocol = str;
        }

        public final void setSettings(OutSettingsBean outSettingsBean) {
            this.settings = outSettingsBean;
        }

        public final void setStreamSettings(StreamSettingsBean streamSettingsBean) {
            this.streamSettings = streamSettingsBean;
        }

        public final void setTag(String str) {
            str.getClass();
            this.tag = str;
        }

        public String toString() {
            String str = this.tag;
            String str2 = this.protocol;
            OutSettingsBean outSettingsBean = this.settings;
            StreamSettingsBean streamSettingsBean = this.streamSettings;
            Object obj = this.proxySettings;
            String str3 = this.sendThrough;
            MuxBean muxBean = this.mux;
            StringBuilder sbA = hz.A("OutboundBean(tag=", str, ", protocol=", str2, ", settings=");
            sbA.append(outSettingsBean);
            sbA.append(", streamSettings=");
            sbA.append(streamSettingsBean);
            sbA.append(", proxySettings=");
            sbA.append(obj);
            sbA.append(", sendThrough=");
            sbA.append(str3);
            sbA.append(", mux=");
            sbA.append(muxBean);
            sbA.append(")");
            return sbA.toString();
        }

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bI\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u000bklmnopqrstuB¹\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010U\u001a\u00020\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u001cHÆ\u0003J»\u0001\u0010d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÆ\u0001J\u0013\u0010e\u001a\u00020f2\b\u0010g\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010h\u001a\u00020iHÖ\u0001J\t\u0010j\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010>\"\u0004\bF\u0010@R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006v"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "network", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "security", "tcpSettings", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;", "kcpSettings", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean;", "wsSettings", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean;", "httpupgradeSettings", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$HttpupgradeSettingsBean;", "xhttpSettings", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$XhttpSettingsBean;", "httpSettings", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$HttpSettingsBean;", "tlsSettings", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;", "quicSettings", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$QuicSettingBean;", "realitySettings", "grpcSettings", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$GrpcSettingsBean;", "hy2steriaSettings", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$Hy2steriaSettingsBean;", "dsSettings", "sockopt", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$SockoptBean;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$HttpupgradeSettingsBean;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$XhttpSettingsBean;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$HttpSettingsBean;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$QuicSettingBean;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$GrpcSettingsBean;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$Hy2steriaSettingsBean;Ljava/lang/Object;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$SockoptBean;)V", "getNetwork", "()Ljava/lang/String;", "setNetwork", "(Ljava/lang/String;)V", "getSecurity", "setSecurity", "getTcpSettings", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;", "setTcpSettings", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;)V", "getKcpSettings", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean;", "setKcpSettings", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean;)V", "getWsSettings", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean;", "setWsSettings", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean;)V", "getHttpupgradeSettings", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$HttpupgradeSettingsBean;", "setHttpupgradeSettings", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$HttpupgradeSettingsBean;)V", "getXhttpSettings", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$XhttpSettingsBean;", "setXhttpSettings", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$XhttpSettingsBean;)V", "getHttpSettings", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$HttpSettingsBean;", "setHttpSettings", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$HttpSettingsBean;)V", "getTlsSettings", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;", "setTlsSettings", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;)V", "getQuicSettings", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$QuicSettingBean;", "setQuicSettings", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$QuicSettingBean;)V", "getRealitySettings", "setRealitySettings", "getGrpcSettings", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$GrpcSettingsBean;", "setGrpcSettings", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$GrpcSettingsBean;)V", "getHy2steriaSettings", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$Hy2steriaSettingsBean;", "setHy2steriaSettings", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$Hy2steriaSettingsBean;)V", "getDsSettings", "()Ljava/lang/Object;", "getSockopt", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$SockoptBean;", "setSockopt", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$SockoptBean;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "TcpSettingsBean", "KcpSettingsBean", "WsSettingsBean", "HttpupgradeSettingsBean", "XhttpSettingsBean", "HttpSettingsBean", "SockoptBean", "TlsSettingsBean", "QuicSettingBean", "GrpcSettingsBean", "Hy2steriaSettingsBean", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class StreamSettingsBean {
            private final Object dsSettings;
            private GrpcSettingsBean grpcSettings;
            private HttpSettingsBean httpSettings;
            private HttpupgradeSettingsBean httpupgradeSettings;
            private Hy2steriaSettingsBean hy2steriaSettings;
            private KcpSettingsBean kcpSettings;
            private String network;
            private QuicSettingBean quicSettings;
            private TlsSettingsBean realitySettings;
            private String security;
            private SockoptBean sockopt;
            private TcpSettingsBean tcpSettings;
            private TlsSettingsBean tlsSettings;
            private WsSettingsBean wsSettings;
            private XhttpSettingsBean xhttpSettings;

            /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b=\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÊ\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u00032\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020EHÖ\u0001J\t\u0010F\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b(\u0010#R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b)\u0010#R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0017R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001b\"\u0004\b.\u0010\u001dR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u0010\u001d¨\u0006G"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "allowInsecure", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "serverName", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "alpn", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "minVersion", "maxVersion", "preferServerCipherSuites", "cipherSuites", "fingerprint", "certificates", "disableSystemRoot", "enableSessionResumption", "show", "publicKey", "shortId", "spiderX", "<init>", "(ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAllowInsecure", "()Z", "setAllowInsecure", "(Z)V", "getServerName", "()Ljava/lang/String;", "setServerName", "(Ljava/lang/String;)V", "getAlpn", "()Ljava/util/List;", "getMinVersion", "getMaxVersion", "getPreferServerCipherSuites", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCipherSuites", "getFingerprint", "getCertificates", "getDisableSystemRoot", "getEnableSessionResumption", "getShow", "getPublicKey", "setPublicKey", "getShortId", "setShortId", "getSpiderX", "setSpiderX", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;", "equals", "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class TlsSettingsBean {
                private boolean allowInsecure;
                private final List<String> alpn;
                private final List<Object> certificates;
                private final String cipherSuites;
                private final Boolean disableSystemRoot;
                private final Boolean enableSessionResumption;
                private final String fingerprint;
                private final String maxVersion;
                private final String minVersion;
                private final Boolean preferServerCipherSuites;
                private String publicKey;
                private String serverName;
                private String shortId;
                private final boolean show;
                private String spiderX;

                public /* synthetic */ TlsSettingsBean(boolean z, String str, List list, String str2, String str3, Boolean bool, String str4, String str5, List list2, Boolean bool2, Boolean bool3, boolean z2, String str6, String str7, String str8, int i, xu xuVar) {
                    this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : list2, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : bool3, (i & 2048) == 0 ? z2 : false, (i & AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE) != 0 ? null : str6, (i & AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT) != 0 ? null : str7, (i & AttribFlags.SSH_FILEXFER_ATTR_UNTRANSLATED_NAME) != 0 ? null : str8);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final boolean getAllowInsecure() {
                    return this.allowInsecure;
                }

                /* JADX INFO: renamed from: component10, reason: from getter */
                public final Boolean getDisableSystemRoot() {
                    return this.disableSystemRoot;
                }

                /* JADX INFO: renamed from: component11, reason: from getter */
                public final Boolean getEnableSessionResumption() {
                    return this.enableSessionResumption;
                }

                /* JADX INFO: renamed from: component12, reason: from getter */
                public final boolean getShow() {
                    return this.show;
                }

                /* JADX INFO: renamed from: component13, reason: from getter */
                public final String getPublicKey() {
                    return this.publicKey;
                }

                /* JADX INFO: renamed from: component14, reason: from getter */
                public final String getShortId() {
                    return this.shortId;
                }

                /* JADX INFO: renamed from: component15, reason: from getter */
                public final String getSpiderX() {
                    return this.spiderX;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getServerName() {
                    return this.serverName;
                }

                public final List<String> component3() {
                    return this.alpn;
                }

                /* JADX INFO: renamed from: component4, reason: from getter */
                public final String getMinVersion() {
                    return this.minVersion;
                }

                /* JADX INFO: renamed from: component5, reason: from getter */
                public final String getMaxVersion() {
                    return this.maxVersion;
                }

                /* JADX INFO: renamed from: component6, reason: from getter */
                public final Boolean getPreferServerCipherSuites() {
                    return this.preferServerCipherSuites;
                }

                /* JADX INFO: renamed from: component7, reason: from getter */
                public final String getCipherSuites() {
                    return this.cipherSuites;
                }

                /* JADX INFO: renamed from: component8, reason: from getter */
                public final String getFingerprint() {
                    return this.fingerprint;
                }

                public final List<Object> component9() {
                    return this.certificates;
                }

                public final TlsSettingsBean copy(boolean allowInsecure, String serverName, List<String> alpn, String minVersion, String maxVersion, Boolean preferServerCipherSuites, String cipherSuites, String fingerprint, List<? extends Object> certificates, Boolean disableSystemRoot, Boolean enableSessionResumption, boolean show, String publicKey, String shortId, String spiderX) {
                    return new TlsSettingsBean(allowInsecure, serverName, alpn, minVersion, maxVersion, preferServerCipherSuites, cipherSuites, fingerprint, certificates, disableSystemRoot, enableSessionResumption, show, publicKey, shortId, spiderX);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof TlsSettingsBean)) {
                        return false;
                    }
                    TlsSettingsBean tlsSettingsBean = (TlsSettingsBean) other;
                    return this.allowInsecure == tlsSettingsBean.allowInsecure && yg0.a(this.serverName, tlsSettingsBean.serverName) && yg0.a(this.alpn, tlsSettingsBean.alpn) && yg0.a(this.minVersion, tlsSettingsBean.minVersion) && yg0.a(this.maxVersion, tlsSettingsBean.maxVersion) && yg0.a(this.preferServerCipherSuites, tlsSettingsBean.preferServerCipherSuites) && yg0.a(this.cipherSuites, tlsSettingsBean.cipherSuites) && yg0.a(this.fingerprint, tlsSettingsBean.fingerprint) && yg0.a(this.certificates, tlsSettingsBean.certificates) && yg0.a(this.disableSystemRoot, tlsSettingsBean.disableSystemRoot) && yg0.a(this.enableSessionResumption, tlsSettingsBean.enableSessionResumption) && this.show == tlsSettingsBean.show && yg0.a(this.publicKey, tlsSettingsBean.publicKey) && yg0.a(this.shortId, tlsSettingsBean.shortId) && yg0.a(this.spiderX, tlsSettingsBean.spiderX);
                }

                public final boolean getAllowInsecure() {
                    return this.allowInsecure;
                }

                public final List<String> getAlpn() {
                    return this.alpn;
                }

                public final List<Object> getCertificates() {
                    return this.certificates;
                }

                public final String getCipherSuites() {
                    return this.cipherSuites;
                }

                public final Boolean getDisableSystemRoot() {
                    return this.disableSystemRoot;
                }

                public final Boolean getEnableSessionResumption() {
                    return this.enableSessionResumption;
                }

                public final String getFingerprint() {
                    return this.fingerprint;
                }

                public final String getMaxVersion() {
                    return this.maxVersion;
                }

                public final String getMinVersion() {
                    return this.minVersion;
                }

                public final Boolean getPreferServerCipherSuites() {
                    return this.preferServerCipherSuites;
                }

                public final String getPublicKey() {
                    return this.publicKey;
                }

                public final String getServerName() {
                    return this.serverName;
                }

                public final String getShortId() {
                    return this.shortId;
                }

                public final boolean getShow() {
                    return this.show;
                }

                public final String getSpiderX() {
                    return this.spiderX;
                }

                public int hashCode() {
                    int i = (this.allowInsecure ? 1231 : 1237) * 31;
                    String str = this.serverName;
                    int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
                    List<String> list = this.alpn;
                    int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
                    String str2 = this.minVersion;
                    int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.maxVersion;
                    int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    Boolean bool = this.preferServerCipherSuites;
                    int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
                    String str4 = this.cipherSuites;
                    int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
                    String str5 = this.fingerprint;
                    int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
                    List<Object> list2 = this.certificates;
                    int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
                    Boolean bool2 = this.disableSystemRoot;
                    int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                    Boolean bool3 = this.enableSessionResumption;
                    int iHashCode10 = (((iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31) + (this.show ? 1231 : 1237)) * 31;
                    String str6 = this.publicKey;
                    int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
                    String str7 = this.shortId;
                    int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
                    String str8 = this.spiderX;
                    return iHashCode12 + (str8 != null ? str8.hashCode() : 0);
                }

                public final void setAllowInsecure(boolean z) {
                    this.allowInsecure = z;
                }

                public final void setPublicKey(String str) {
                    this.publicKey = str;
                }

                public final void setServerName(String str) {
                    this.serverName = str;
                }

                public final void setShortId(String str) {
                    this.shortId = str;
                }

                public final void setSpiderX(String str) {
                    this.spiderX = str;
                }

                public String toString() {
                    boolean z = this.allowInsecure;
                    String str = this.serverName;
                    List<String> list = this.alpn;
                    String str2 = this.minVersion;
                    String str3 = this.maxVersion;
                    Boolean bool = this.preferServerCipherSuites;
                    String str4 = this.cipherSuites;
                    String str5 = this.fingerprint;
                    List<Object> list2 = this.certificates;
                    Boolean bool2 = this.disableSystemRoot;
                    Boolean bool3 = this.enableSessionResumption;
                    boolean z2 = this.show;
                    String str6 = this.publicKey;
                    String str7 = this.shortId;
                    String str8 = this.spiderX;
                    StringBuilder sb = new StringBuilder("TlsSettingsBean(allowInsecure=");
                    sb.append(z);
                    sb.append(", serverName=");
                    sb.append(str);
                    sb.append(", alpn=");
                    sb.append(list);
                    sb.append(", minVersion=");
                    sb.append(str2);
                    sb.append(", maxVersion=");
                    sb.append(str3);
                    sb.append(", preferServerCipherSuites=");
                    sb.append(bool);
                    sb.append(", cipherSuites=");
                    hz.H(sb, str4, ", fingerprint=", str5, ", certificates=");
                    sb.append(list2);
                    sb.append(", disableSystemRoot=");
                    sb.append(bool2);
                    sb.append(", enableSessionResumption=");
                    sb.append(bool3);
                    sb.append(", show=");
                    sb.append(z2);
                    sb.append(", publicKey=");
                    hz.H(sb, str6, ", shortId=", str7, ", spiderX=");
                    return vh.s(sb, str8, ")");
                }

                public TlsSettingsBean(boolean z, String str, List<String> list, String str2, String str3, Boolean bool, String str4, String str5, List<? extends Object> list2, Boolean bool2, Boolean bool3, boolean z2, String str6, String str7, String str8) {
                    this.allowInsecure = z;
                    this.serverName = str;
                    this.alpn = list;
                    this.minVersion = str2;
                    this.maxVersion = str3;
                    this.preferServerCipherSuites = bool;
                    this.cipherSuites = str4;
                    this.fingerprint = str5;
                    this.certificates = list2;
                    this.disableSystemRoot = bool2;
                    this.enableSessionResumption = bool3;
                    this.show = z2;
                    this.publicKey = str6;
                    this.shortId = str7;
                    this.spiderX = str8;
                }

                public TlsSettingsBean() {
                    this(false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, 32767, null);
                }
            }

            public /* synthetic */ StreamSettingsBean(String str, String str2, TcpSettingsBean tcpSettingsBean, KcpSettingsBean kcpSettingsBean, WsSettingsBean wsSettingsBean, HttpupgradeSettingsBean httpupgradeSettingsBean, XhttpSettingsBean xhttpSettingsBean, HttpSettingsBean httpSettingsBean, TlsSettingsBean tlsSettingsBean, QuicSettingBean quicSettingBean, TlsSettingsBean tlsSettingsBean2, GrpcSettingsBean grpcSettingsBean, Hy2steriaSettingsBean hy2steriaSettingsBean, Object obj, SockoptBean sockoptBean, int i, xu xuVar) {
                this((i & 1) != 0 ? "tcp" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : tcpSettingsBean, (i & 8) != 0 ? null : kcpSettingsBean, (i & 16) != 0 ? null : wsSettingsBean, (i & 32) != 0 ? null : httpupgradeSettingsBean, (i & 64) != 0 ? null : xhttpSettingsBean, (i & 128) != 0 ? null : httpSettingsBean, (i & 256) != 0 ? null : tlsSettingsBean, (i & 512) != 0 ? null : quicSettingBean, (i & 1024) != 0 ? null : tlsSettingsBean2, (i & 2048) != 0 ? null : grpcSettingsBean, (i & AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE) != 0 ? null : hy2steriaSettingsBean, (i & AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT) != 0 ? null : obj, (i & AttribFlags.SSH_FILEXFER_ATTR_UNTRANSLATED_NAME) != 0 ? null : sockoptBean);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getNetwork() {
                return this.network;
            }

            /* JADX INFO: renamed from: component10, reason: from getter */
            public final QuicSettingBean getQuicSettings() {
                return this.quicSettings;
            }

            /* JADX INFO: renamed from: component11, reason: from getter */
            public final TlsSettingsBean getRealitySettings() {
                return this.realitySettings;
            }

            /* JADX INFO: renamed from: component12, reason: from getter */
            public final GrpcSettingsBean getGrpcSettings() {
                return this.grpcSettings;
            }

            /* JADX INFO: renamed from: component13, reason: from getter */
            public final Hy2steriaSettingsBean getHy2steriaSettings() {
                return this.hy2steriaSettings;
            }

            /* JADX INFO: renamed from: component14, reason: from getter */
            public final Object getDsSettings() {
                return this.dsSettings;
            }

            /* JADX INFO: renamed from: component15, reason: from getter */
            public final SockoptBean getSockopt() {
                return this.sockopt;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getSecurity() {
                return this.security;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final TcpSettingsBean getTcpSettings() {
                return this.tcpSettings;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final KcpSettingsBean getKcpSettings() {
                return this.kcpSettings;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final WsSettingsBean getWsSettings() {
                return this.wsSettings;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            public final HttpupgradeSettingsBean getHttpupgradeSettings() {
                return this.httpupgradeSettings;
            }

            /* JADX INFO: renamed from: component7, reason: from getter */
            public final XhttpSettingsBean getXhttpSettings() {
                return this.xhttpSettings;
            }

            /* JADX INFO: renamed from: component8, reason: from getter */
            public final HttpSettingsBean getHttpSettings() {
                return this.httpSettings;
            }

            /* JADX INFO: renamed from: component9, reason: from getter */
            public final TlsSettingsBean getTlsSettings() {
                return this.tlsSettings;
            }

            public final StreamSettingsBean copy(String network, String security, TcpSettingsBean tcpSettings, KcpSettingsBean kcpSettings, WsSettingsBean wsSettings, HttpupgradeSettingsBean httpupgradeSettings, XhttpSettingsBean xhttpSettings, HttpSettingsBean httpSettings, TlsSettingsBean tlsSettings, QuicSettingBean quicSettings, TlsSettingsBean realitySettings, GrpcSettingsBean grpcSettings, Hy2steriaSettingsBean hy2steriaSettings, Object dsSettings, SockoptBean sockopt) {
                network.getClass();
                return new StreamSettingsBean(network, security, tcpSettings, kcpSettings, wsSettings, httpupgradeSettings, xhttpSettings, httpSettings, tlsSettings, quicSettings, realitySettings, grpcSettings, hy2steriaSettings, dsSettings, sockopt);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StreamSettingsBean)) {
                    return false;
                }
                StreamSettingsBean streamSettingsBean = (StreamSettingsBean) other;
                return yg0.a(this.network, streamSettingsBean.network) && yg0.a(this.security, streamSettingsBean.security) && yg0.a(this.tcpSettings, streamSettingsBean.tcpSettings) && yg0.a(this.kcpSettings, streamSettingsBean.kcpSettings) && yg0.a(this.wsSettings, streamSettingsBean.wsSettings) && yg0.a(this.httpupgradeSettings, streamSettingsBean.httpupgradeSettings) && yg0.a(this.xhttpSettings, streamSettingsBean.xhttpSettings) && yg0.a(this.httpSettings, streamSettingsBean.httpSettings) && yg0.a(this.tlsSettings, streamSettingsBean.tlsSettings) && yg0.a(this.quicSettings, streamSettingsBean.quicSettings) && yg0.a(this.realitySettings, streamSettingsBean.realitySettings) && yg0.a(this.grpcSettings, streamSettingsBean.grpcSettings) && yg0.a(this.hy2steriaSettings, streamSettingsBean.hy2steriaSettings) && yg0.a(this.dsSettings, streamSettingsBean.dsSettings) && yg0.a(this.sockopt, streamSettingsBean.sockopt);
            }

            public final Object getDsSettings() {
                return this.dsSettings;
            }

            public final GrpcSettingsBean getGrpcSettings() {
                return this.grpcSettings;
            }

            public final HttpSettingsBean getHttpSettings() {
                return this.httpSettings;
            }

            public final HttpupgradeSettingsBean getHttpupgradeSettings() {
                return this.httpupgradeSettings;
            }

            public final Hy2steriaSettingsBean getHy2steriaSettings() {
                return this.hy2steriaSettings;
            }

            public final KcpSettingsBean getKcpSettings() {
                return this.kcpSettings;
            }

            public final String getNetwork() {
                return this.network;
            }

            public final QuicSettingBean getQuicSettings() {
                return this.quicSettings;
            }

            public final TlsSettingsBean getRealitySettings() {
                return this.realitySettings;
            }

            public final String getSecurity() {
                return this.security;
            }

            public final SockoptBean getSockopt() {
                return this.sockopt;
            }

            public final TcpSettingsBean getTcpSettings() {
                return this.tcpSettings;
            }

            public final TlsSettingsBean getTlsSettings() {
                return this.tlsSettings;
            }

            public final WsSettingsBean getWsSettings() {
                return this.wsSettings;
            }

            public final XhttpSettingsBean getXhttpSettings() {
                return this.xhttpSettings;
            }

            public int hashCode() {
                int iHashCode = this.network.hashCode() * 31;
                String str = this.security;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                TcpSettingsBean tcpSettingsBean = this.tcpSettings;
                int iHashCode3 = (iHashCode2 + (tcpSettingsBean == null ? 0 : tcpSettingsBean.hashCode())) * 31;
                KcpSettingsBean kcpSettingsBean = this.kcpSettings;
                int iHashCode4 = (iHashCode3 + (kcpSettingsBean == null ? 0 : kcpSettingsBean.hashCode())) * 31;
                WsSettingsBean wsSettingsBean = this.wsSettings;
                int iHashCode5 = (iHashCode4 + (wsSettingsBean == null ? 0 : wsSettingsBean.hashCode())) * 31;
                HttpupgradeSettingsBean httpupgradeSettingsBean = this.httpupgradeSettings;
                int iHashCode6 = (iHashCode5 + (httpupgradeSettingsBean == null ? 0 : httpupgradeSettingsBean.hashCode())) * 31;
                XhttpSettingsBean xhttpSettingsBean = this.xhttpSettings;
                int iHashCode7 = (iHashCode6 + (xhttpSettingsBean == null ? 0 : xhttpSettingsBean.hashCode())) * 31;
                HttpSettingsBean httpSettingsBean = this.httpSettings;
                int iHashCode8 = (iHashCode7 + (httpSettingsBean == null ? 0 : httpSettingsBean.hashCode())) * 31;
                TlsSettingsBean tlsSettingsBean = this.tlsSettings;
                int iHashCode9 = (iHashCode8 + (tlsSettingsBean == null ? 0 : tlsSettingsBean.hashCode())) * 31;
                QuicSettingBean quicSettingBean = this.quicSettings;
                int iHashCode10 = (iHashCode9 + (quicSettingBean == null ? 0 : quicSettingBean.hashCode())) * 31;
                TlsSettingsBean tlsSettingsBean2 = this.realitySettings;
                int iHashCode11 = (iHashCode10 + (tlsSettingsBean2 == null ? 0 : tlsSettingsBean2.hashCode())) * 31;
                GrpcSettingsBean grpcSettingsBean = this.grpcSettings;
                int iHashCode12 = (iHashCode11 + (grpcSettingsBean == null ? 0 : grpcSettingsBean.hashCode())) * 31;
                Hy2steriaSettingsBean hy2steriaSettingsBean = this.hy2steriaSettings;
                int iHashCode13 = (iHashCode12 + (hy2steriaSettingsBean == null ? 0 : hy2steriaSettingsBean.hashCode())) * 31;
                Object obj = this.dsSettings;
                int iHashCode14 = (iHashCode13 + (obj == null ? 0 : obj.hashCode())) * 31;
                SockoptBean sockoptBean = this.sockopt;
                return iHashCode14 + (sockoptBean != null ? sockoptBean.hashCode() : 0);
            }

            public final void setGrpcSettings(GrpcSettingsBean grpcSettingsBean) {
                this.grpcSettings = grpcSettingsBean;
            }

            public final void setHttpSettings(HttpSettingsBean httpSettingsBean) {
                this.httpSettings = httpSettingsBean;
            }

            public final void setHttpupgradeSettings(HttpupgradeSettingsBean httpupgradeSettingsBean) {
                this.httpupgradeSettings = httpupgradeSettingsBean;
            }

            public final void setHy2steriaSettings(Hy2steriaSettingsBean hy2steriaSettingsBean) {
                this.hy2steriaSettings = hy2steriaSettingsBean;
            }

            public final void setKcpSettings(KcpSettingsBean kcpSettingsBean) {
                this.kcpSettings = kcpSettingsBean;
            }

            public final void setNetwork(String str) {
                str.getClass();
                this.network = str;
            }

            public final void setQuicSettings(QuicSettingBean quicSettingBean) {
                this.quicSettings = quicSettingBean;
            }

            public final void setRealitySettings(TlsSettingsBean tlsSettingsBean) {
                this.realitySettings = tlsSettingsBean;
            }

            public final void setSecurity(String str) {
                this.security = str;
            }

            public final void setSockopt(SockoptBean sockoptBean) {
                this.sockopt = sockoptBean;
            }

            public final void setTcpSettings(TcpSettingsBean tcpSettingsBean) {
                this.tcpSettings = tcpSettingsBean;
            }

            public final void setTlsSettings(TlsSettingsBean tlsSettingsBean) {
                this.tlsSettings = tlsSettingsBean;
            }

            public final void setWsSettings(WsSettingsBean wsSettingsBean) {
                this.wsSettings = wsSettingsBean;
            }

            public final void setXhttpSettings(XhttpSettingsBean xhttpSettingsBean) {
                this.xhttpSettings = xhttpSettingsBean;
            }

            public String toString() {
                String str = this.network;
                String str2 = this.security;
                TcpSettingsBean tcpSettingsBean = this.tcpSettings;
                KcpSettingsBean kcpSettingsBean = this.kcpSettings;
                WsSettingsBean wsSettingsBean = this.wsSettings;
                HttpupgradeSettingsBean httpupgradeSettingsBean = this.httpupgradeSettings;
                XhttpSettingsBean xhttpSettingsBean = this.xhttpSettings;
                HttpSettingsBean httpSettingsBean = this.httpSettings;
                TlsSettingsBean tlsSettingsBean = this.tlsSettings;
                QuicSettingBean quicSettingBean = this.quicSettings;
                TlsSettingsBean tlsSettingsBean2 = this.realitySettings;
                GrpcSettingsBean grpcSettingsBean = this.grpcSettings;
                Hy2steriaSettingsBean hy2steriaSettingsBean = this.hy2steriaSettings;
                Object obj = this.dsSettings;
                SockoptBean sockoptBean = this.sockopt;
                StringBuilder sbA = hz.A("StreamSettingsBean(network=", str, ", security=", str2, ", tcpSettings=");
                sbA.append(tcpSettingsBean);
                sbA.append(", kcpSettings=");
                sbA.append(kcpSettingsBean);
                sbA.append(", wsSettings=");
                sbA.append(wsSettingsBean);
                sbA.append(", httpupgradeSettings=");
                sbA.append(httpupgradeSettingsBean);
                sbA.append(", xhttpSettings=");
                sbA.append(xhttpSettingsBean);
                sbA.append(", httpSettings=");
                sbA.append(httpSettingsBean);
                sbA.append(", tlsSettings=");
                sbA.append(tlsSettingsBean);
                sbA.append(", quicSettings=");
                sbA.append(quicSettingBean);
                sbA.append(", realitySettings=");
                sbA.append(tlsSettingsBean2);
                sbA.append(", grpcSettings=");
                sbA.append(grpcSettingsBean);
                sbA.append(", hy2steriaSettings=");
                sbA.append(hy2steriaSettingsBean);
                sbA.append(", dsSettings=");
                sbA.append(obj);
                sbA.append(", sockopt=");
                sbA.append(sockoptBean);
                sbA.append(")");
                return sbA.toString();
            }

            public StreamSettingsBean(String str, String str2, TcpSettingsBean tcpSettingsBean, KcpSettingsBean kcpSettingsBean, WsSettingsBean wsSettingsBean, HttpupgradeSettingsBean httpupgradeSettingsBean, XhttpSettingsBean xhttpSettingsBean, HttpSettingsBean httpSettingsBean, TlsSettingsBean tlsSettingsBean, QuicSettingBean quicSettingBean, TlsSettingsBean tlsSettingsBean2, GrpcSettingsBean grpcSettingsBean, Hy2steriaSettingsBean hy2steriaSettingsBean, Object obj, SockoptBean sockoptBean) {
                str.getClass();
                this.network = str;
                this.security = str2;
                this.tcpSettings = tcpSettingsBean;
                this.kcpSettings = kcpSettingsBean;
                this.wsSettings = wsSettingsBean;
                this.httpupgradeSettings = httpupgradeSettingsBean;
                this.xhttpSettings = xhttpSettingsBean;
                this.httpSettings = httpSettingsBean;
                this.tlsSettings = tlsSettingsBean;
                this.quicSettings = quicSettingBean;
                this.realitySettings = tlsSettingsBean2;
                this.grpcSettings = grpcSettingsBean;
                this.hy2steriaSettings = hy2steriaSettingsBean;
                this.dsSettings = obj;
                this.sockopt = sockoptBean;
            }

            /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$QuicSettingBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "security", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "key", "header", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$QuicSettingBean$HeaderBean;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$QuicSettingBean$HeaderBean;)V", "getSecurity", "()Ljava/lang/String;", "setSecurity", "(Ljava/lang/String;)V", "getKey", "setKey", "getHeader", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$QuicSettingBean$HeaderBean;", "setHeader", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$QuicSettingBean$HeaderBean;)V", "component1", "component2", "component3", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "HeaderBean", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class QuicSettingBean {
                private HeaderBean header;
                private String key;
                private String security;

                /* JADX WARN: Multi-variable type inference failed */
                public /* synthetic */ QuicSettingBean(String str, String str2, HeaderBean headerBean, int i, xu xuVar) {
                    this((i & 1) != 0 ? "none" : str, (i & 2) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str2, (i & 4) != 0 ? new HeaderBean(null, 1, 0 == true ? 1 : 0) : headerBean);
                }

                public static /* synthetic */ QuicSettingBean copy$default(QuicSettingBean quicSettingBean, String str, String str2, HeaderBean headerBean, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = quicSettingBean.security;
                    }
                    if ((i & 2) != 0) {
                        str2 = quicSettingBean.key;
                    }
                    if ((i & 4) != 0) {
                        headerBean = quicSettingBean.header;
                    }
                    return quicSettingBean.copy(str, str2, headerBean);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getSecurity() {
                    return this.security;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getKey() {
                    return this.key;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final HeaderBean getHeader() {
                    return this.header;
                }

                public final QuicSettingBean copy(String security, String key, HeaderBean header) {
                    security.getClass();
                    key.getClass();
                    header.getClass();
                    return new QuicSettingBean(security, key, header);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof QuicSettingBean)) {
                        return false;
                    }
                    QuicSettingBean quicSettingBean = (QuicSettingBean) other;
                    return yg0.a(this.security, quicSettingBean.security) && yg0.a(this.key, quicSettingBean.key) && yg0.a(this.header, quicSettingBean.header);
                }

                public final HeaderBean getHeader() {
                    return this.header;
                }

                public final String getKey() {
                    return this.key;
                }

                public final String getSecurity() {
                    return this.security;
                }

                public int hashCode() {
                    return this.header.hashCode() + vh.c(this.security.hashCode() * 31, 31, this.key);
                }

                public final void setHeader(HeaderBean headerBean) {
                    headerBean.getClass();
                    this.header = headerBean;
                }

                public final void setKey(String str) {
                    str.getClass();
                    this.key = str;
                }

                public final void setSecurity(String str) {
                    str.getClass();
                    this.security = str;
                }

                public String toString() {
                    String str = this.security;
                    String str2 = this.key;
                    HeaderBean headerBean = this.header;
                    StringBuilder sbA = hz.A("QuicSettingBean(security=", str, ", key=", str2, ", header=");
                    sbA.append(headerBean);
                    sbA.append(")");
                    return sbA.toString();
                }

                /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
                @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$QuicSettingBean$HeaderBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "type", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "setType", "component1", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class HeaderBean {
                    private String type;

                    public /* synthetic */ HeaderBean(String str, int i, xu xuVar) {
                        this((i & 1) != 0 ? "none" : str);
                    }

                    public static /* synthetic */ HeaderBean copy$default(HeaderBean headerBean, String str, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = headerBean.type;
                        }
                        return headerBean.copy(str);
                    }

                    /* JADX INFO: renamed from: component1, reason: from getter */
                    public final String getType() {
                        return this.type;
                    }

                    public final HeaderBean copy(String type) {
                        type.getClass();
                        return new HeaderBean(type);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof HeaderBean) && yg0.a(this.type, ((HeaderBean) other).type);
                    }

                    public final String getType() {
                        return this.type;
                    }

                    public int hashCode() {
                        return this.type.hashCode();
                    }

                    public final void setType(String str) {
                        str.getClass();
                        this.type = str;
                    }

                    public String toString() {
                        return vh.m("HeaderBean(type=", this.type, ")");
                    }

                    public HeaderBean(String str) {
                        str.getClass();
                        this.type = str;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public HeaderBean() {
                        this(null, 1, 0 == true ? 1 : 0);
                    }
                }

                public QuicSettingBean(String str, String str2, HeaderBean headerBean) {
                    str.getClass();
                    str2.getClass();
                    headerBean.getClass();
                    this.security = str;
                    this.key = str2;
                    this.header = headerBean;
                }

                public QuicSettingBean() {
                    this(null, null, null, 7, null);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001'BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019JH\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019¨\u0006("}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "path", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "headers", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean$HeadersBean;", "maxEarlyData", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "useBrowserForwarding", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "acceptProxyProtocol", "<init>", "(Ljava/lang/String;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean$HeadersBean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getPath", "()Ljava/lang/String;", "setPath", "(Ljava/lang/String;)V", "getHeaders", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean$HeadersBean;", "setHeaders", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean$HeadersBean;)V", "getMaxEarlyData", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUseBrowserForwarding", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAcceptProxyProtocol", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean$HeadersBean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean;", "equals", "other", "hashCode", "toString", "HeadersBean", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class WsSettingsBean {
                private final Boolean acceptProxyProtocol;
                private HeadersBean headers;
                private final Integer maxEarlyData;
                private String path;
                private final Boolean useBrowserForwarding;

                /* JADX WARN: Multi-variable type inference failed */
                public /* synthetic */ WsSettingsBean(String str, HeadersBean headersBean, Integer num, Boolean bool, Boolean bool2, int i, xu xuVar) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new HeadersBean(null, 1, 0 == true ? 1 : 0) : headersBean, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2);
                }

                public static /* synthetic */ WsSettingsBean copy$default(WsSettingsBean wsSettingsBean, String str, HeadersBean headersBean, Integer num, Boolean bool, Boolean bool2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = wsSettingsBean.path;
                    }
                    if ((i & 2) != 0) {
                        headersBean = wsSettingsBean.headers;
                    }
                    if ((i & 4) != 0) {
                        num = wsSettingsBean.maxEarlyData;
                    }
                    if ((i & 8) != 0) {
                        bool = wsSettingsBean.useBrowserForwarding;
                    }
                    if ((i & 16) != 0) {
                        bool2 = wsSettingsBean.acceptProxyProtocol;
                    }
                    Boolean bool3 = bool2;
                    Integer num2 = num;
                    return wsSettingsBean.copy(str, headersBean, num2, bool, bool3);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getPath() {
                    return this.path;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final HeadersBean getHeaders() {
                    return this.headers;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final Integer getMaxEarlyData() {
                    return this.maxEarlyData;
                }

                /* JADX INFO: renamed from: component4, reason: from getter */
                public final Boolean getUseBrowserForwarding() {
                    return this.useBrowserForwarding;
                }

                /* JADX INFO: renamed from: component5, reason: from getter */
                public final Boolean getAcceptProxyProtocol() {
                    return this.acceptProxyProtocol;
                }

                public final WsSettingsBean copy(String path, HeadersBean headers, Integer maxEarlyData, Boolean useBrowserForwarding, Boolean acceptProxyProtocol) {
                    headers.getClass();
                    return new WsSettingsBean(path, headers, maxEarlyData, useBrowserForwarding, acceptProxyProtocol);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof WsSettingsBean)) {
                        return false;
                    }
                    WsSettingsBean wsSettingsBean = (WsSettingsBean) other;
                    return yg0.a(this.path, wsSettingsBean.path) && yg0.a(this.headers, wsSettingsBean.headers) && yg0.a(this.maxEarlyData, wsSettingsBean.maxEarlyData) && yg0.a(this.useBrowserForwarding, wsSettingsBean.useBrowserForwarding) && yg0.a(this.acceptProxyProtocol, wsSettingsBean.acceptProxyProtocol);
                }

                public final Boolean getAcceptProxyProtocol() {
                    return this.acceptProxyProtocol;
                }

                public final HeadersBean getHeaders() {
                    return this.headers;
                }

                public final Integer getMaxEarlyData() {
                    return this.maxEarlyData;
                }

                public final String getPath() {
                    return this.path;
                }

                public final Boolean getUseBrowserForwarding() {
                    return this.useBrowserForwarding;
                }

                public int hashCode() {
                    String str = this.path;
                    int iHashCode = (this.headers.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
                    Integer num = this.maxEarlyData;
                    int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                    Boolean bool = this.useBrowserForwarding;
                    int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                    Boolean bool2 = this.acceptProxyProtocol;
                    return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
                }

                public final void setHeaders(HeadersBean headersBean) {
                    headersBean.getClass();
                    this.headers = headersBean;
                }

                public final void setPath(String str) {
                    this.path = str;
                }

                public String toString() {
                    return "WsSettingsBean(path=" + this.path + ", headers=" + this.headers + ", maxEarlyData=" + this.maxEarlyData + ", useBrowserForwarding=" + this.useBrowserForwarding + ", acceptProxyProtocol=" + this.acceptProxyProtocol + ")";
                }

                /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
                @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$WsSettingsBean$HeadersBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Host", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "setHost", "component1", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class HeadersBean {
                    private String Host;

                    public /* synthetic */ HeadersBean(String str, int i, xu xuVar) {
                        this((i & 1) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str);
                    }

                    public static /* synthetic */ HeadersBean copy$default(HeadersBean headersBean, String str, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = headersBean.Host;
                        }
                        return headersBean.copy(str);
                    }

                    /* JADX INFO: renamed from: component1, reason: from getter */
                    public final String getHost() {
                        return this.Host;
                    }

                    public final HeadersBean copy(String Host) {
                        Host.getClass();
                        return new HeadersBean(Host);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof HeadersBean) && yg0.a(this.Host, ((HeadersBean) other).Host);
                    }

                    public final String getHost() {
                        return this.Host;
                    }

                    public int hashCode() {
                        return this.Host.hashCode();
                    }

                    public final void setHost(String str) {
                        str.getClass();
                        this.Host = str;
                    }

                    public String toString() {
                        return vh.m("HeadersBean(Host=", this.Host, ")");
                    }

                    public HeadersBean(String str) {
                        str.getClass();
                        this.Host = str;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public HeadersBean() {
                        this(null, 1, 0 == true ? 1 : 0);
                    }
                }

                public WsSettingsBean(String str, HeadersBean headersBean, Integer num, Boolean bool, Boolean bool2) {
                    headersBean.getClass();
                    this.path = str;
                    this.headers = headersBean;
                    this.maxEarlyData = num;
                    this.useBrowserForwarding = bool;
                    this.acceptProxyProtocol = bool2;
                }

                public WsSettingsBean() {
                    this(null, null, null, null, null, 31, null);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b,\b\u0086\b\u0018\u00002\u00020\u0001:\u00019Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003Je\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u00105\u001a\u00020\b2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0003HÖ\u0001J\t\u00108\u001a\u00020\u000eHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006:"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "mtu", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "tti", "uplinkCapacity", "downlinkCapacity", "congestion", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "readBufferSize", "writeBufferSize", "header", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean$HeaderBean;", "seed", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(IIIIZIILcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean$HeaderBean;Ljava/lang/String;)V", "getMtu", "()I", "setMtu", "(I)V", "getTti", "setTti", "getUplinkCapacity", "setUplinkCapacity", "getDownlinkCapacity", "setDownlinkCapacity", "getCongestion", "()Z", "setCongestion", "(Z)V", "getReadBufferSize", "setReadBufferSize", "getWriteBufferSize", "setWriteBufferSize", "getHeader", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean$HeaderBean;", "setHeader", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean$HeaderBean;)V", "getSeed", "()Ljava/lang/String;", "setSeed", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "HeaderBean", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class KcpSettingsBean {
                private boolean congestion;
                private int downlinkCapacity;
                private HeaderBean header;
                private int mtu;
                private int readBufferSize;
                private String seed;
                private int tti;
                private int uplinkCapacity;
                private int writeBufferSize;

                /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
                    	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
                    	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
                    	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
                    	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
                    	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
                    */
                public /* synthetic */ KcpSettingsBean(int r2, int r3, int r4, int r5, boolean r6, int r7, int r8, com.v2ray.ang.dto.V2rayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.HeaderBean r9, java.lang.String r10, int r11, defpackage.xu r12) {
                    /*
                        r1 = this;
                        r12 = r11 & 1
                        if (r12 == 0) goto L6
                        r2 = 1350(0x546, float:1.892E-42)
                    L6:
                        r12 = r11 & 2
                        if (r12 == 0) goto Lc
                        r3 = 50
                    Lc:
                        r12 = r11 & 4
                        if (r12 == 0) goto L12
                        r4 = 12
                    L12:
                        r12 = r11 & 8
                        if (r12 == 0) goto L18
                        r5 = 100
                    L18:
                        r12 = r11 & 16
                        if (r12 == 0) goto L1d
                        r6 = 0
                    L1d:
                        r12 = r11 & 32
                        r0 = 1
                        if (r12 == 0) goto L23
                        r7 = r0
                    L23:
                        r12 = r11 & 64
                        if (r12 == 0) goto L28
                        r8 = r0
                    L28:
                        r12 = r11 & 128(0x80, float:1.8E-43)
                        r0 = 0
                        if (r12 == 0) goto L33
                        com.v2ray.ang.dto.V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean$HeaderBean r9 = new com.v2ray.ang.dto.V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean$HeaderBean
                        r12 = 3
                        r9.<init>(r0, r0, r12, r0)
                    L33:
                        r11 = r11 & 256(0x100, float:3.59E-43)
                        if (r11 == 0) goto L42
                        r12 = r0
                        r10 = r8
                        r11 = r9
                        r8 = r6
                        r9 = r7
                        r6 = r4
                        r7 = r5
                        r4 = r2
                        r5 = r3
                        r3 = r1
                        goto L4c
                    L42:
                        r12 = r10
                        r11 = r9
                        r9 = r7
                        r10 = r8
                        r7 = r5
                        r8 = r6
                        r5 = r3
                        r6 = r4
                        r3 = r1
                        r4 = r2
                    L4c:
                        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.dto.V2rayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.<init>(int, int, int, int, boolean, int, int, com.v2ray.ang.dto.V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean$HeaderBean, java.lang.String, int, xu):void");
                }

                public static /* synthetic */ KcpSettingsBean copy$default(KcpSettingsBean kcpSettingsBean, int i, int i2, int i3, int i4, boolean z, int i5, int i6, HeaderBean headerBean, String str, int i7, Object obj) {
                    if ((i7 & 1) != 0) {
                        i = kcpSettingsBean.mtu;
                    }
                    if ((i7 & 2) != 0) {
                        i2 = kcpSettingsBean.tti;
                    }
                    if ((i7 & 4) != 0) {
                        i3 = kcpSettingsBean.uplinkCapacity;
                    }
                    if ((i7 & 8) != 0) {
                        i4 = kcpSettingsBean.downlinkCapacity;
                    }
                    if ((i7 & 16) != 0) {
                        z = kcpSettingsBean.congestion;
                    }
                    if ((i7 & 32) != 0) {
                        i5 = kcpSettingsBean.readBufferSize;
                    }
                    if ((i7 & 64) != 0) {
                        i6 = kcpSettingsBean.writeBufferSize;
                    }
                    if ((i7 & 128) != 0) {
                        headerBean = kcpSettingsBean.header;
                    }
                    if ((i7 & 256) != 0) {
                        str = kcpSettingsBean.seed;
                    }
                    HeaderBean headerBean2 = headerBean;
                    String str2 = str;
                    int i8 = i5;
                    int i9 = i6;
                    boolean z2 = z;
                    int i10 = i3;
                    return kcpSettingsBean.copy(i, i2, i10, i4, z2, i8, i9, headerBean2, str2);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final int getMtu() {
                    return this.mtu;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final int getTti() {
                    return this.tti;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final int getUplinkCapacity() {
                    return this.uplinkCapacity;
                }

                /* JADX INFO: renamed from: component4, reason: from getter */
                public final int getDownlinkCapacity() {
                    return this.downlinkCapacity;
                }

                /* JADX INFO: renamed from: component5, reason: from getter */
                public final boolean getCongestion() {
                    return this.congestion;
                }

                /* JADX INFO: renamed from: component6, reason: from getter */
                public final int getReadBufferSize() {
                    return this.readBufferSize;
                }

                /* JADX INFO: renamed from: component7, reason: from getter */
                public final int getWriteBufferSize() {
                    return this.writeBufferSize;
                }

                /* JADX INFO: renamed from: component8, reason: from getter */
                public final HeaderBean getHeader() {
                    return this.header;
                }

                /* JADX INFO: renamed from: component9, reason: from getter */
                public final String getSeed() {
                    return this.seed;
                }

                public final KcpSettingsBean copy(int mtu, int tti, int uplinkCapacity, int downlinkCapacity, boolean congestion, int readBufferSize, int writeBufferSize, HeaderBean header, String seed) {
                    header.getClass();
                    return new KcpSettingsBean(mtu, tti, uplinkCapacity, downlinkCapacity, congestion, readBufferSize, writeBufferSize, header, seed);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof KcpSettingsBean)) {
                        return false;
                    }
                    KcpSettingsBean kcpSettingsBean = (KcpSettingsBean) other;
                    return this.mtu == kcpSettingsBean.mtu && this.tti == kcpSettingsBean.tti && this.uplinkCapacity == kcpSettingsBean.uplinkCapacity && this.downlinkCapacity == kcpSettingsBean.downlinkCapacity && this.congestion == kcpSettingsBean.congestion && this.readBufferSize == kcpSettingsBean.readBufferSize && this.writeBufferSize == kcpSettingsBean.writeBufferSize && yg0.a(this.header, kcpSettingsBean.header) && yg0.a(this.seed, kcpSettingsBean.seed);
                }

                public final boolean getCongestion() {
                    return this.congestion;
                }

                public final int getDownlinkCapacity() {
                    return this.downlinkCapacity;
                }

                public final HeaderBean getHeader() {
                    return this.header;
                }

                public final int getMtu() {
                    return this.mtu;
                }

                public final int getReadBufferSize() {
                    return this.readBufferSize;
                }

                public final String getSeed() {
                    return this.seed;
                }

                public final int getTti() {
                    return this.tti;
                }

                public final int getUplinkCapacity() {
                    return this.uplinkCapacity;
                }

                public final int getWriteBufferSize() {
                    return this.writeBufferSize;
                }

                public int hashCode() {
                    int iHashCode = (this.header.hashCode() + (((((((((((((this.mtu * 31) + this.tti) * 31) + this.uplinkCapacity) * 31) + this.downlinkCapacity) * 31) + (this.congestion ? 1231 : 1237)) * 31) + this.readBufferSize) * 31) + this.writeBufferSize) * 31)) * 31;
                    String str = this.seed;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public final void setCongestion(boolean z) {
                    this.congestion = z;
                }

                public final void setDownlinkCapacity(int i) {
                    this.downlinkCapacity = i;
                }

                public final void setHeader(HeaderBean headerBean) {
                    headerBean.getClass();
                    this.header = headerBean;
                }

                public final void setMtu(int i) {
                    this.mtu = i;
                }

                public final void setReadBufferSize(int i) {
                    this.readBufferSize = i;
                }

                public final void setSeed(String str) {
                    this.seed = str;
                }

                public final void setTti(int i) {
                    this.tti = i;
                }

                public final void setUplinkCapacity(int i) {
                    this.uplinkCapacity = i;
                }

                public final void setWriteBufferSize(int i) {
                    this.writeBufferSize = i;
                }

                public String toString() {
                    int i = this.mtu;
                    int i2 = this.tti;
                    int i3 = this.uplinkCapacity;
                    int i4 = this.downlinkCapacity;
                    boolean z = this.congestion;
                    int i5 = this.readBufferSize;
                    int i6 = this.writeBufferSize;
                    HeaderBean headerBean = this.header;
                    String str = this.seed;
                    StringBuilder sbU = vh.u(i, "KcpSettingsBean(mtu=", i2, ", tti=", ", uplinkCapacity=");
                    ec1.M(i3, i4, ", downlinkCapacity=", ", congestion=", sbU);
                    sbU.append(z);
                    sbU.append(", readBufferSize=");
                    sbU.append(i5);
                    sbU.append(", writeBufferSize=");
                    sbU.append(i6);
                    sbU.append(", header=");
                    sbU.append(headerBean);
                    sbU.append(", seed=");
                    return vh.s(sbU, str, ")");
                }

                /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
                @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$KcpSettingsBean$HeaderBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "type", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "domain", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getDomain", "setDomain", "component1", "component2", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class HeaderBean {
                    private String domain;
                    private String type;

                    public /* synthetic */ HeaderBean(String str, String str2, int i, xu xuVar) {
                        this((i & 1) != 0 ? "none" : str, (i & 2) != 0 ? null : str2);
                    }

                    public static /* synthetic */ HeaderBean copy$default(HeaderBean headerBean, String str, String str2, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = headerBean.type;
                        }
                        if ((i & 2) != 0) {
                            str2 = headerBean.domain;
                        }
                        return headerBean.copy(str, str2);
                    }

                    /* JADX INFO: renamed from: component1, reason: from getter */
                    public final String getType() {
                        return this.type;
                    }

                    /* JADX INFO: renamed from: component2, reason: from getter */
                    public final String getDomain() {
                        return this.domain;
                    }

                    public final HeaderBean copy(String type, String domain) {
                        type.getClass();
                        return new HeaderBean(type, domain);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof HeaderBean)) {
                            return false;
                        }
                        HeaderBean headerBean = (HeaderBean) other;
                        return yg0.a(this.type, headerBean.type) && yg0.a(this.domain, headerBean.domain);
                    }

                    public final String getDomain() {
                        return this.domain;
                    }

                    public final String getType() {
                        return this.type;
                    }

                    public int hashCode() {
                        int iHashCode = this.type.hashCode() * 31;
                        String str = this.domain;
                        return iHashCode + (str == null ? 0 : str.hashCode());
                    }

                    public final void setDomain(String str) {
                        this.domain = str;
                    }

                    public final void setType(String str) {
                        str.getClass();
                        this.type = str;
                    }

                    public String toString() {
                        return ec1.L("HeaderBean(type=", this.type, ", domain=", this.domain, ")");
                    }

                    public HeaderBean(String str, String str2) {
                        str.getClass();
                        this.type = str;
                        this.domain = str2;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public HeaderBean() {
                        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                    }
                }

                public KcpSettingsBean(int i, int i2, int i3, int i4, boolean z, int i5, int i6, HeaderBean headerBean, String str) {
                    headerBean.getClass();
                    this.mtu = i;
                    this.tti = i2;
                    this.uplinkCapacity = i3;
                    this.downlinkCapacity = i4;
                    this.congestion = z;
                    this.readBufferSize = i5;
                    this.writeBufferSize = i6;
                    this.header = headerBean;
                    this.seed = str;
                }

                public KcpSettingsBean() {
                    this(0, 0, 0, 0, false, 0, 0, null, null, 511, null);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J%\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$HttpSettingsBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "host", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "path", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getHost", "()Ljava/util/List;", "setHost", "(Ljava/util/List;)V", "getPath", "()Ljava/lang/String;", "setPath", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class HttpSettingsBean {
                private List<String> host;
                private String path;

                public /* synthetic */ HttpSettingsBean(List list, String str, int i, xu xuVar) {
                    this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : str);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ HttpSettingsBean copy$default(HttpSettingsBean httpSettingsBean, List list, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        list = httpSettingsBean.host;
                    }
                    if ((i & 2) != 0) {
                        str = httpSettingsBean.path;
                    }
                    return httpSettingsBean.copy(list, str);
                }

                public final List<String> component1() {
                    return this.host;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getPath() {
                    return this.path;
                }

                public final HttpSettingsBean copy(List<String> host, String path) {
                    host.getClass();
                    return new HttpSettingsBean(host, path);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof HttpSettingsBean)) {
                        return false;
                    }
                    HttpSettingsBean httpSettingsBean = (HttpSettingsBean) other;
                    return yg0.a(this.host, httpSettingsBean.host) && yg0.a(this.path, httpSettingsBean.path);
                }

                public final List<String> getHost() {
                    return this.host;
                }

                public final String getPath() {
                    return this.path;
                }

                public int hashCode() {
                    int iHashCode = this.host.hashCode() * 31;
                    String str = this.path;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public final void setHost(List<String> list) {
                    list.getClass();
                    this.host = list;
                }

                public final void setPath(String str) {
                    this.path = str;
                }

                public String toString() {
                    return "HttpSettingsBean(host=" + this.host + ", path=" + this.path + ")";
                }

                public HttpSettingsBean(List<String> list, String str) {
                    list.getClass();
                    this.host = list;
                    this.path = str;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public HttpSettingsBean() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }
            }

            public StreamSettingsBean() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
            }

            /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J2\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$HttpupgradeSettingsBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "path", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "host", "acceptProxyProtocol", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getPath", "()Ljava/lang/String;", "setPath", "(Ljava/lang/String;)V", "getHost", "setHost", "getAcceptProxyProtocol", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$HttpupgradeSettingsBean;", "equals", "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class HttpupgradeSettingsBean {
                private final Boolean acceptProxyProtocol;
                private String host;
                private String path;

                public /* synthetic */ HttpupgradeSettingsBean(String str, String str2, Boolean bool, int i, xu xuVar) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool);
                }

                public static /* synthetic */ HttpupgradeSettingsBean copy$default(HttpupgradeSettingsBean httpupgradeSettingsBean, String str, String str2, Boolean bool, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = httpupgradeSettingsBean.path;
                    }
                    if ((i & 2) != 0) {
                        str2 = httpupgradeSettingsBean.host;
                    }
                    if ((i & 4) != 0) {
                        bool = httpupgradeSettingsBean.acceptProxyProtocol;
                    }
                    return httpupgradeSettingsBean.copy(str, str2, bool);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getPath() {
                    return this.path;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getHost() {
                    return this.host;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final Boolean getAcceptProxyProtocol() {
                    return this.acceptProxyProtocol;
                }

                public final HttpupgradeSettingsBean copy(String path, String host, Boolean acceptProxyProtocol) {
                    return new HttpupgradeSettingsBean(path, host, acceptProxyProtocol);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof HttpupgradeSettingsBean)) {
                        return false;
                    }
                    HttpupgradeSettingsBean httpupgradeSettingsBean = (HttpupgradeSettingsBean) other;
                    return yg0.a(this.path, httpupgradeSettingsBean.path) && yg0.a(this.host, httpupgradeSettingsBean.host) && yg0.a(this.acceptProxyProtocol, httpupgradeSettingsBean.acceptProxyProtocol);
                }

                public final Boolean getAcceptProxyProtocol() {
                    return this.acceptProxyProtocol;
                }

                public final String getHost() {
                    return this.host;
                }

                public final String getPath() {
                    return this.path;
                }

                public int hashCode() {
                    String str = this.path;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.host;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    Boolean bool = this.acceptProxyProtocol;
                    return iHashCode2 + (bool != null ? bool.hashCode() : 0);
                }

                public final void setHost(String str) {
                    this.host = str;
                }

                public final void setPath(String str) {
                    this.path = str;
                }

                public String toString() {
                    String str = this.path;
                    String str2 = this.host;
                    Boolean bool = this.acceptProxyProtocol;
                    StringBuilder sbA = hz.A("HttpupgradeSettingsBean(path=", str, ", host=", str2, ", acceptProxyProtocol=");
                    sbA.append(bool);
                    sbA.append(")");
                    return sbA.toString();
                }

                public HttpupgradeSettingsBean(String str, String str2, Boolean bool) {
                    this.path = str;
                    this.host = str2;
                    this.acceptProxyProtocol = bool;
                }

                public HttpupgradeSettingsBean() {
                    this(null, null, null, 7, null);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001!B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$Hy2steriaSettingsBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "password", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "use_udp_extension", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "congestion", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$Hy2steriaSettingsBean$Hy2CongestionBean;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$Hy2steriaSettingsBean$Hy2CongestionBean;)V", "getPassword", "()Ljava/lang/String;", "setPassword", "(Ljava/lang/String;)V", "getUse_udp_extension", "()Ljava/lang/Boolean;", "setUse_udp_extension", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getCongestion", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$Hy2steriaSettingsBean$Hy2CongestionBean;", "setCongestion", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$Hy2steriaSettingsBean$Hy2CongestionBean;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$Hy2steriaSettingsBean$Hy2CongestionBean;)Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$Hy2steriaSettingsBean;", "equals", "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "Hy2CongestionBean", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Hy2steriaSettingsBean {
                private Hy2CongestionBean congestion;
                private String password;
                private Boolean use_udp_extension;

                public /* synthetic */ Hy2steriaSettingsBean(String str, Boolean bool, Hy2CongestionBean hy2CongestionBean, int i, xu xuVar) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? Boolean.TRUE : bool, (i & 4) != 0 ? null : hy2CongestionBean);
                }

                public static /* synthetic */ Hy2steriaSettingsBean copy$default(Hy2steriaSettingsBean hy2steriaSettingsBean, String str, Boolean bool, Hy2CongestionBean hy2CongestionBean, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = hy2steriaSettingsBean.password;
                    }
                    if ((i & 2) != 0) {
                        bool = hy2steriaSettingsBean.use_udp_extension;
                    }
                    if ((i & 4) != 0) {
                        hy2CongestionBean = hy2steriaSettingsBean.congestion;
                    }
                    return hy2steriaSettingsBean.copy(str, bool, hy2CongestionBean);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getPassword() {
                    return this.password;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final Boolean getUse_udp_extension() {
                    return this.use_udp_extension;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final Hy2CongestionBean getCongestion() {
                    return this.congestion;
                }

                public final Hy2steriaSettingsBean copy(String password, Boolean use_udp_extension, Hy2CongestionBean congestion) {
                    return new Hy2steriaSettingsBean(password, use_udp_extension, congestion);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Hy2steriaSettingsBean)) {
                        return false;
                    }
                    Hy2steriaSettingsBean hy2steriaSettingsBean = (Hy2steriaSettingsBean) other;
                    return yg0.a(this.password, hy2steriaSettingsBean.password) && yg0.a(this.use_udp_extension, hy2steriaSettingsBean.use_udp_extension) && yg0.a(this.congestion, hy2steriaSettingsBean.congestion);
                }

                public final Hy2CongestionBean getCongestion() {
                    return this.congestion;
                }

                public final String getPassword() {
                    return this.password;
                }

                public final Boolean getUse_udp_extension() {
                    return this.use_udp_extension;
                }

                public int hashCode() {
                    String str = this.password;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    Boolean bool = this.use_udp_extension;
                    int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                    Hy2CongestionBean hy2CongestionBean = this.congestion;
                    return iHashCode2 + (hy2CongestionBean != null ? hy2CongestionBean.hashCode() : 0);
                }

                public final void setCongestion(Hy2CongestionBean hy2CongestionBean) {
                    this.congestion = hy2CongestionBean;
                }

                public final void setPassword(String str) {
                    this.password = str;
                }

                public final void setUse_udp_extension(Boolean bool) {
                    this.use_udp_extension = bool;
                }

                public String toString() {
                    return "Hy2steriaSettingsBean(password=" + this.password + ", use_udp_extension=" + this.use_udp_extension + ", congestion=" + this.congestion + ")";
                }

                /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$Hy2steriaSettingsBean$Hy2CongestionBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "type", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "up_mbps", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "down_mbps", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getUp_mbps", "()Ljava/lang/Integer;", "setUp_mbps", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDown_mbps", "setDown_mbps", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$Hy2steriaSettingsBean$Hy2CongestionBean;", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class Hy2CongestionBean {
                    private Integer down_mbps;
                    private String type;
                    private Integer up_mbps;

                    public /* synthetic */ Hy2CongestionBean(String str, Integer num, Integer num2, int i, xu xuVar) {
                        this((i & 1) != 0 ? "bbr" : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
                    }

                    public static /* synthetic */ Hy2CongestionBean copy$default(Hy2CongestionBean hy2CongestionBean, String str, Integer num, Integer num2, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = hy2CongestionBean.type;
                        }
                        if ((i & 2) != 0) {
                            num = hy2CongestionBean.up_mbps;
                        }
                        if ((i & 4) != 0) {
                            num2 = hy2CongestionBean.down_mbps;
                        }
                        return hy2CongestionBean.copy(str, num, num2);
                    }

                    /* JADX INFO: renamed from: component1, reason: from getter */
                    public final String getType() {
                        return this.type;
                    }

                    /* JADX INFO: renamed from: component2, reason: from getter */
                    public final Integer getUp_mbps() {
                        return this.up_mbps;
                    }

                    /* JADX INFO: renamed from: component3, reason: from getter */
                    public final Integer getDown_mbps() {
                        return this.down_mbps;
                    }

                    public final Hy2CongestionBean copy(String type, Integer up_mbps, Integer down_mbps) {
                        return new Hy2CongestionBean(type, up_mbps, down_mbps);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Hy2CongestionBean)) {
                            return false;
                        }
                        Hy2CongestionBean hy2CongestionBean = (Hy2CongestionBean) other;
                        return yg0.a(this.type, hy2CongestionBean.type) && yg0.a(this.up_mbps, hy2CongestionBean.up_mbps) && yg0.a(this.down_mbps, hy2CongestionBean.down_mbps);
                    }

                    public final Integer getDown_mbps() {
                        return this.down_mbps;
                    }

                    public final String getType() {
                        return this.type;
                    }

                    public final Integer getUp_mbps() {
                        return this.up_mbps;
                    }

                    public int hashCode() {
                        String str = this.type;
                        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                        Integer num = this.up_mbps;
                        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                        Integer num2 = this.down_mbps;
                        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
                    }

                    public final void setDown_mbps(Integer num) {
                        this.down_mbps = num;
                    }

                    public final void setType(String str) {
                        this.type = str;
                    }

                    public final void setUp_mbps(Integer num) {
                        this.up_mbps = num;
                    }

                    public String toString() {
                        return "Hy2CongestionBean(type=" + this.type + ", up_mbps=" + this.up_mbps + ", down_mbps=" + this.down_mbps + ")";
                    }

                    public Hy2CongestionBean(String str, Integer num, Integer num2) {
                        this.type = str;
                        this.up_mbps = num;
                        this.down_mbps = num2;
                    }

                    public Hy2CongestionBean() {
                        this(null, null, null, 7, null);
                    }
                }

                public Hy2steriaSettingsBean(String str, Boolean bool, Hy2CongestionBean hy2CongestionBean) {
                    this.password = str;
                    this.use_udp_extension = bool;
                    this.congestion = hy2CongestionBean;
                }

                public Hy2steriaSettingsBean() {
                    this(null, null, null, 7, null);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "header", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;", "acceptProxyProtocol", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;Ljava/lang/Boolean;)V", "getHeader", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;", "setHeader", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;)V", "getAcceptProxyProtocol", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;Ljava/lang/Boolean;)Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;", "equals", "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "HeaderBean", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class TcpSettingsBean {
                private final Boolean acceptProxyProtocol;
                private HeaderBean header;

                public /* synthetic */ TcpSettingsBean(HeaderBean headerBean, Boolean bool, int i, xu xuVar) {
                    this((i & 1) != 0 ? new HeaderBean(null, null, null, 7, null) : headerBean, (i & 2) != 0 ? null : bool);
                }

                public static /* synthetic */ TcpSettingsBean copy$default(TcpSettingsBean tcpSettingsBean, HeaderBean headerBean, Boolean bool, int i, Object obj) {
                    if ((i & 1) != 0) {
                        headerBean = tcpSettingsBean.header;
                    }
                    if ((i & 2) != 0) {
                        bool = tcpSettingsBean.acceptProxyProtocol;
                    }
                    return tcpSettingsBean.copy(headerBean, bool);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final HeaderBean getHeader() {
                    return this.header;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final Boolean getAcceptProxyProtocol() {
                    return this.acceptProxyProtocol;
                }

                public final TcpSettingsBean copy(HeaderBean header, Boolean acceptProxyProtocol) {
                    header.getClass();
                    return new TcpSettingsBean(header, acceptProxyProtocol);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof TcpSettingsBean)) {
                        return false;
                    }
                    TcpSettingsBean tcpSettingsBean = (TcpSettingsBean) other;
                    return yg0.a(this.header, tcpSettingsBean.header) && yg0.a(this.acceptProxyProtocol, tcpSettingsBean.acceptProxyProtocol);
                }

                public final Boolean getAcceptProxyProtocol() {
                    return this.acceptProxyProtocol;
                }

                public final HeaderBean getHeader() {
                    return this.header;
                }

                public int hashCode() {
                    int iHashCode = this.header.hashCode() * 31;
                    Boolean bool = this.acceptProxyProtocol;
                    return iHashCode + (bool == null ? 0 : bool.hashCode());
                }

                public final void setHeader(HeaderBean headerBean) {
                    headerBean.getClass();
                    this.header = headerBean;
                }

                public String toString() {
                    return "TcpSettingsBean(header=" + this.header + ", acceptProxyProtocol=" + this.acceptProxyProtocol + ")";
                }

                /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
                @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001fB)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÆ\u0003J+\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "type", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "request", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;", "response", "<init>", "(Ljava/lang/String;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;Ljava/lang/Object;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getRequest", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;", "setRequest", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;)V", "getResponse", "()Ljava/lang/Object;", "setResponse", "(Ljava/lang/Object;)V", "component1", "component2", "component3", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "RequestBean", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class HeaderBean {
                    private RequestBean request;
                    private Object response;
                    private String type;

                    public /* synthetic */ HeaderBean(String str, RequestBean requestBean, Object obj, int i, xu xuVar) {
                        this((i & 1) != 0 ? "none" : str, (i & 2) != 0 ? null : requestBean, (i & 4) != 0 ? null : obj);
                    }

                    public static /* synthetic */ HeaderBean copy$default(HeaderBean headerBean, String str, RequestBean requestBean, Object obj, int i, Object obj2) {
                        if ((i & 1) != 0) {
                            str = headerBean.type;
                        }
                        if ((i & 2) != 0) {
                            requestBean = headerBean.request;
                        }
                        if ((i & 4) != 0) {
                            obj = headerBean.response;
                        }
                        return headerBean.copy(str, requestBean, obj);
                    }

                    /* JADX INFO: renamed from: component1, reason: from getter */
                    public final String getType() {
                        return this.type;
                    }

                    /* JADX INFO: renamed from: component2, reason: from getter */
                    public final RequestBean getRequest() {
                        return this.request;
                    }

                    /* JADX INFO: renamed from: component3, reason: from getter */
                    public final Object getResponse() {
                        return this.response;
                    }

                    public final HeaderBean copy(String type, RequestBean request, Object response) {
                        type.getClass();
                        return new HeaderBean(type, request, response);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof HeaderBean)) {
                            return false;
                        }
                        HeaderBean headerBean = (HeaderBean) other;
                        return yg0.a(this.type, headerBean.type) && yg0.a(this.request, headerBean.request) && yg0.a(this.response, headerBean.response);
                    }

                    public final RequestBean getRequest() {
                        return this.request;
                    }

                    public final Object getResponse() {
                        return this.response;
                    }

                    public final String getType() {
                        return this.type;
                    }

                    public int hashCode() {
                        int iHashCode = this.type.hashCode() * 31;
                        RequestBean requestBean = this.request;
                        int iHashCode2 = (iHashCode + (requestBean == null ? 0 : requestBean.hashCode())) * 31;
                        Object obj = this.response;
                        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
                    }

                    public final void setRequest(RequestBean requestBean) {
                        this.request = requestBean;
                    }

                    public final void setResponse(Object obj) {
                        this.response = obj;
                    }

                    public final void setType(String str) {
                        str.getClass();
                        this.type = str;
                    }

                    public String toString() {
                        String str = this.type;
                        RequestBean requestBean = this.request;
                        Object obj = this.response;
                        StringBuilder sb = new StringBuilder("HeaderBean(type=");
                        sb.append(str);
                        sb.append(", request=");
                        sb.append(requestBean);
                        sb.append(", response=");
                        return vh.k(obj, ")", sb);
                    }

                    public HeaderBean(String str, RequestBean requestBean, Object obj) {
                        str.getClass();
                        this.type = str;
                        this.request = requestBean;
                        this.response = obj;
                    }

                    public HeaderBean() {
                        this(null, null, null, 7, null);
                    }

                    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
                    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001!B9\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "path", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "headers", "Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean$HeadersBean;", "version", "method", "<init>", "(Ljava/util/List;Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean$HeadersBean;Ljava/lang/String;Ljava/lang/String;)V", "getPath", "()Ljava/util/List;", "setPath", "(Ljava/util/List;)V", "getHeaders", "()Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean$HeadersBean;", "setHeaders", "(Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean$HeadersBean;)V", "getVersion", "()Ljava/lang/String;", "getMethod", "component1", "component2", "component3", "component4", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "HeadersBean", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
                    public static final /* data */ class RequestBean {
                        private HeadersBean headers;
                        private final String method;
                        private List<String> path;
                        private final String version;

                        public /* synthetic */ RequestBean(List list, HeadersBean headersBean, String str, String str2, int i, xu xuVar) {
                            this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new HeadersBean(null, null, null, null, null, 31, null) : headersBean, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public static /* synthetic */ RequestBean copy$default(RequestBean requestBean, List list, HeadersBean headersBean, String str, String str2, int i, Object obj) {
                            if ((i & 1) != 0) {
                                list = requestBean.path;
                            }
                            if ((i & 2) != 0) {
                                headersBean = requestBean.headers;
                            }
                            if ((i & 4) != 0) {
                                str = requestBean.version;
                            }
                            if ((i & 8) != 0) {
                                str2 = requestBean.method;
                            }
                            return requestBean.copy(list, headersBean, str, str2);
                        }

                        public final List<String> component1() {
                            return this.path;
                        }

                        /* JADX INFO: renamed from: component2, reason: from getter */
                        public final HeadersBean getHeaders() {
                            return this.headers;
                        }

                        /* JADX INFO: renamed from: component3, reason: from getter */
                        public final String getVersion() {
                            return this.version;
                        }

                        /* JADX INFO: renamed from: component4, reason: from getter */
                        public final String getMethod() {
                            return this.method;
                        }

                        public final RequestBean copy(List<String> path, HeadersBean headers, String version, String method) {
                            path.getClass();
                            headers.getClass();
                            return new RequestBean(path, headers, version, method);
                        }

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            if (!(other instanceof RequestBean)) {
                                return false;
                            }
                            RequestBean requestBean = (RequestBean) other;
                            return yg0.a(this.path, requestBean.path) && yg0.a(this.headers, requestBean.headers) && yg0.a(this.version, requestBean.version) && yg0.a(this.method, requestBean.method);
                        }

                        public final HeadersBean getHeaders() {
                            return this.headers;
                        }

                        public final String getMethod() {
                            return this.method;
                        }

                        public final List<String> getPath() {
                            return this.path;
                        }

                        public final String getVersion() {
                            return this.version;
                        }

                        public int hashCode() {
                            int iHashCode = (this.headers.hashCode() + (this.path.hashCode() * 31)) * 31;
                            String str = this.version;
                            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                            String str2 = this.method;
                            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                        }

                        public final void setHeaders(HeadersBean headersBean) {
                            headersBean.getClass();
                            this.headers = headersBean;
                        }

                        public final void setPath(List<String> list) {
                            list.getClass();
                            this.path = list;
                        }

                        public String toString() {
                            List<String> list = this.path;
                            HeadersBean headersBean = this.headers;
                            String str = this.version;
                            String str2 = this.method;
                            StringBuilder sb = new StringBuilder("RequestBean(path=");
                            sb.append(list);
                            sb.append(", headers=");
                            sb.append(headersBean);
                            sb.append(", version=");
                            return hz.x(sb, str, ", method=", str2, ")");
                        }

                        public RequestBean(List<String> list, HeadersBean headersBean, String str, String str2) {
                            list.getClass();
                            headersBean.getClass();
                            this.path = list;
                            this.headers = headersBean;
                            this.version = str;
                            this.method = str2;
                        }

                        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
                        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J]\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean$HeadersBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Host", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "userAgent", "acceptEncoding", "Connection", "Pragma", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getHost", "()Ljava/util/List;", "setHost", "(Ljava/util/List;)V", "getUserAgent", "getAcceptEncoding", "getConnection", "getPragma", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
                        public static final /* data */ class HeadersBean {
                            private final List<String> Connection;
                            private List<String> Host;
                            private final String Pragma;

                            @SerializedName("Accept-Encoding")
                            private final List<String> acceptEncoding;

                            @SerializedName("User-Agent")
                            private final List<String> userAgent;

                            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
                                	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
                                	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
                                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
                                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
                                	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
                                */
                            public /* synthetic */ HeadersBean(java.util.List r2, java.util.List r3, java.util.List r4, java.util.List r5, java.lang.String r6, int r7, defpackage.xu r8) {
                                /*
                                    r1 = this;
                                    r8 = r7 & 1
                                    if (r8 == 0) goto L9
                                    java.util.ArrayList r2 = new java.util.ArrayList
                                    r2.<init>()
                                L9:
                                    r8 = r7 & 2
                                    r0 = 0
                                    if (r8 == 0) goto Lf
                                    r3 = r0
                                Lf:
                                    r8 = r7 & 4
                                    if (r8 == 0) goto L14
                                    r4 = r0
                                L14:
                                    r8 = r7 & 8
                                    if (r8 == 0) goto L19
                                    r5 = r0
                                L19:
                                    r7 = r7 & 16
                                    if (r7 == 0) goto L24
                                    r8 = r0
                                    r6 = r4
                                    r7 = r5
                                    r4 = r2
                                    r5 = r3
                                    r3 = r1
                                    goto L2a
                                L24:
                                    r8 = r6
                                    r7 = r5
                                    r5 = r3
                                    r6 = r4
                                    r3 = r1
                                    r4 = r2
                                L2a:
                                    r3.<init>(r4, r5, r6, r7, r8)
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.dto.V2rayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean.HeadersBean.<init>(java.util.List, java.util.List, java.util.List, java.util.List, java.lang.String, int, xu):void");
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            public static /* synthetic */ HeadersBean copy$default(HeadersBean headersBean, List list, List list2, List list3, List list4, String str, int i, Object obj) {
                                if ((i & 1) != 0) {
                                    list = headersBean.Host;
                                }
                                if ((i & 2) != 0) {
                                    list2 = headersBean.userAgent;
                                }
                                if ((i & 4) != 0) {
                                    list3 = headersBean.acceptEncoding;
                                }
                                if ((i & 8) != 0) {
                                    list4 = headersBean.Connection;
                                }
                                if ((i & 16) != 0) {
                                    str = headersBean.Pragma;
                                }
                                String str2 = str;
                                List list5 = list3;
                                return headersBean.copy(list, list2, list5, list4, str2);
                            }

                            public final List<String> component1() {
                                return this.Host;
                            }

                            public final List<String> component2() {
                                return this.userAgent;
                            }

                            public final List<String> component3() {
                                return this.acceptEncoding;
                            }

                            public final List<String> component4() {
                                return this.Connection;
                            }

                            /* JADX INFO: renamed from: component5, reason: from getter */
                            public final String getPragma() {
                                return this.Pragma;
                            }

                            public final HeadersBean copy(List<String> Host, List<String> userAgent, List<String> acceptEncoding, List<String> Connection, String Pragma) {
                                return new HeadersBean(Host, userAgent, acceptEncoding, Connection, Pragma);
                            }

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                if (!(other instanceof HeadersBean)) {
                                    return false;
                                }
                                HeadersBean headersBean = (HeadersBean) other;
                                return yg0.a(this.Host, headersBean.Host) && yg0.a(this.userAgent, headersBean.userAgent) && yg0.a(this.acceptEncoding, headersBean.acceptEncoding) && yg0.a(this.Connection, headersBean.Connection) && yg0.a(this.Pragma, headersBean.Pragma);
                            }

                            public final List<String> getAcceptEncoding() {
                                return this.acceptEncoding;
                            }

                            public final List<String> getConnection() {
                                return this.Connection;
                            }

                            public final List<String> getHost() {
                                return this.Host;
                            }

                            public final String getPragma() {
                                return this.Pragma;
                            }

                            public final List<String> getUserAgent() {
                                return this.userAgent;
                            }

                            public int hashCode() {
                                List<String> list = this.Host;
                                int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                                List<String> list2 = this.userAgent;
                                int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
                                List<String> list3 = this.acceptEncoding;
                                int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
                                List<String> list4 = this.Connection;
                                int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
                                String str = this.Pragma;
                                return iHashCode4 + (str != null ? str.hashCode() : 0);
                            }

                            public final void setHost(List<String> list) {
                                this.Host = list;
                            }

                            public String toString() {
                                List<String> list = this.Host;
                                List<String> list2 = this.userAgent;
                                List<String> list3 = this.acceptEncoding;
                                List<String> list4 = this.Connection;
                                String str = this.Pragma;
                                StringBuilder sb = new StringBuilder("HeadersBean(Host=");
                                sb.append(list);
                                sb.append(", userAgent=");
                                sb.append(list2);
                                sb.append(", acceptEncoding=");
                                sb.append(list3);
                                sb.append(", Connection=");
                                sb.append(list4);
                                sb.append(", Pragma=");
                                return vh.s(sb, str, ")");
                            }

                            public HeadersBean(List<String> list, List<String> list2, List<String> list3, List<String> list4, String str) {
                                this.Host = list;
                                this.userAgent = list2;
                                this.acceptEncoding = list3;
                                this.Connection = list4;
                                this.Pragma = str;
                            }

                            public HeadersBean() {
                                this(null, null, null, null, null, 31, null);
                            }
                        }

                        public RequestBean() {
                            this(null, null, null, null, 15, null);
                        }
                    }
                }

                public TcpSettingsBean(HeaderBean headerBean, Boolean bool) {
                    headerBean.getClass();
                    this.header = headerBean;
                    this.acceptProxyProtocol = bool;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public TcpSettingsBean() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$XhttpSettingsBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "path", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "host", "mode", "extra", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getPath", "()Ljava/lang/String;", "setPath", "(Ljava/lang/String;)V", "getHost", "setHost", "getMode", "setMode", "getExtra", "()Ljava/lang/Object;", "setExtra", "(Ljava/lang/Object;)V", "component1", "component2", "component3", "component4", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class XhttpSettingsBean {
                private Object extra;
                private String host;
                private String mode;
                private String path;

                public /* synthetic */ XhttpSettingsBean(String str, String str2, String str3, Object obj, int i, xu xuVar) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : obj);
                }

                public static /* synthetic */ XhttpSettingsBean copy$default(XhttpSettingsBean xhttpSettingsBean, String str, String str2, String str3, Object obj, int i, Object obj2) {
                    if ((i & 1) != 0) {
                        str = xhttpSettingsBean.path;
                    }
                    if ((i & 2) != 0) {
                        str2 = xhttpSettingsBean.host;
                    }
                    if ((i & 4) != 0) {
                        str3 = xhttpSettingsBean.mode;
                    }
                    if ((i & 8) != 0) {
                        obj = xhttpSettingsBean.extra;
                    }
                    return xhttpSettingsBean.copy(str, str2, str3, obj);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getPath() {
                    return this.path;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getHost() {
                    return this.host;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final String getMode() {
                    return this.mode;
                }

                /* JADX INFO: renamed from: component4, reason: from getter */
                public final Object getExtra() {
                    return this.extra;
                }

                public final XhttpSettingsBean copy(String path, String host, String mode, Object extra) {
                    return new XhttpSettingsBean(path, host, mode, extra);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof XhttpSettingsBean)) {
                        return false;
                    }
                    XhttpSettingsBean xhttpSettingsBean = (XhttpSettingsBean) other;
                    return yg0.a(this.path, xhttpSettingsBean.path) && yg0.a(this.host, xhttpSettingsBean.host) && yg0.a(this.mode, xhttpSettingsBean.mode) && yg0.a(this.extra, xhttpSettingsBean.extra);
                }

                public final Object getExtra() {
                    return this.extra;
                }

                public final String getHost() {
                    return this.host;
                }

                public final String getMode() {
                    return this.mode;
                }

                public final String getPath() {
                    return this.path;
                }

                public int hashCode() {
                    String str = this.path;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.host;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.mode;
                    int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    Object obj = this.extra;
                    return iHashCode3 + (obj != null ? obj.hashCode() : 0);
                }

                public final void setExtra(Object obj) {
                    this.extra = obj;
                }

                public final void setHost(String str) {
                    this.host = str;
                }

                public final void setMode(String str) {
                    this.mode = str;
                }

                public final void setPath(String str) {
                    this.path = str;
                }

                public String toString() {
                    String str = this.path;
                    String str2 = this.host;
                    String str3 = this.mode;
                    Object obj = this.extra;
                    StringBuilder sbA = hz.A("XhttpSettingsBean(path=", str, ", host=", str2, ", mode=");
                    sbA.append(str3);
                    sbA.append(", extra=");
                    sbA.append(obj);
                    sbA.append(")");
                    return sbA.toString();
                }

                public XhttpSettingsBean(String str, String str2, String str3, Object obj) {
                    this.path = str;
                    this.host = str2;
                    this.mode = str3;
                    this.extra = obj;
                }

                public XhttpSettingsBean() {
                    this(null, null, null, null, 15, null);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b)\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003Jb\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u00020\bHÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001d¨\u00061"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$SockoptBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "TcpNoDelay", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "tcpKeepAliveIdle", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "tcpFastOpen", "tproxy", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "mark", "dialerProxy", "domainStrategy", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getTcpNoDelay", "()Ljava/lang/Boolean;", "setTcpNoDelay", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getTcpKeepAliveIdle", "()Ljava/lang/Integer;", "setTcpKeepAliveIdle", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTcpFastOpen", "setTcpFastOpen", "getTproxy", "()Ljava/lang/String;", "setTproxy", "(Ljava/lang/String;)V", "getMark", "setMark", "getDialerProxy", "setDialerProxy", "getDomainStrategy", "setDomainStrategy", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$SockoptBean;", "equals", "other", "hashCode", "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class SockoptBean {
                private Boolean TcpNoDelay;
                private String dialerProxy;
                private String domainStrategy;
                private Integer mark;
                private Boolean tcpFastOpen;
                private Integer tcpKeepAliveIdle;
                private String tproxy;

                public /* synthetic */ SockoptBean(Boolean bool, Integer num, Boolean bool2, String str, Integer num2, String str2, String str3, int i, xu xuVar) {
                    this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3);
                }

                public static /* synthetic */ SockoptBean copy$default(SockoptBean sockoptBean, Boolean bool, Integer num, Boolean bool2, String str, Integer num2, String str2, String str3, int i, Object obj) {
                    if ((i & 1) != 0) {
                        bool = sockoptBean.TcpNoDelay;
                    }
                    if ((i & 2) != 0) {
                        num = sockoptBean.tcpKeepAliveIdle;
                    }
                    if ((i & 4) != 0) {
                        bool2 = sockoptBean.tcpFastOpen;
                    }
                    if ((i & 8) != 0) {
                        str = sockoptBean.tproxy;
                    }
                    if ((i & 16) != 0) {
                        num2 = sockoptBean.mark;
                    }
                    if ((i & 32) != 0) {
                        str2 = sockoptBean.dialerProxy;
                    }
                    if ((i & 64) != 0) {
                        str3 = sockoptBean.domainStrategy;
                    }
                    String str4 = str2;
                    String str5 = str3;
                    Integer num3 = num2;
                    Boolean bool3 = bool2;
                    return sockoptBean.copy(bool, num, bool3, str, num3, str4, str5);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final Boolean getTcpNoDelay() {
                    return this.TcpNoDelay;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final Integer getTcpKeepAliveIdle() {
                    return this.tcpKeepAliveIdle;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final Boolean getTcpFastOpen() {
                    return this.tcpFastOpen;
                }

                /* JADX INFO: renamed from: component4, reason: from getter */
                public final String getTproxy() {
                    return this.tproxy;
                }

                /* JADX INFO: renamed from: component5, reason: from getter */
                public final Integer getMark() {
                    return this.mark;
                }

                /* JADX INFO: renamed from: component6, reason: from getter */
                public final String getDialerProxy() {
                    return this.dialerProxy;
                }

                /* JADX INFO: renamed from: component7, reason: from getter */
                public final String getDomainStrategy() {
                    return this.domainStrategy;
                }

                public final SockoptBean copy(Boolean TcpNoDelay, Integer tcpKeepAliveIdle, Boolean tcpFastOpen, String tproxy, Integer mark, String dialerProxy, String domainStrategy) {
                    return new SockoptBean(TcpNoDelay, tcpKeepAliveIdle, tcpFastOpen, tproxy, mark, dialerProxy, domainStrategy);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SockoptBean)) {
                        return false;
                    }
                    SockoptBean sockoptBean = (SockoptBean) other;
                    return yg0.a(this.TcpNoDelay, sockoptBean.TcpNoDelay) && yg0.a(this.tcpKeepAliveIdle, sockoptBean.tcpKeepAliveIdle) && yg0.a(this.tcpFastOpen, sockoptBean.tcpFastOpen) && yg0.a(this.tproxy, sockoptBean.tproxy) && yg0.a(this.mark, sockoptBean.mark) && yg0.a(this.dialerProxy, sockoptBean.dialerProxy) && yg0.a(this.domainStrategy, sockoptBean.domainStrategy);
                }

                public final String getDialerProxy() {
                    return this.dialerProxy;
                }

                public final String getDomainStrategy() {
                    return this.domainStrategy;
                }

                public final Integer getMark() {
                    return this.mark;
                }

                public final Boolean getTcpFastOpen() {
                    return this.tcpFastOpen;
                }

                public final Integer getTcpKeepAliveIdle() {
                    return this.tcpKeepAliveIdle;
                }

                public final Boolean getTcpNoDelay() {
                    return this.TcpNoDelay;
                }

                public final String getTproxy() {
                    return this.tproxy;
                }

                public int hashCode() {
                    Boolean bool = this.TcpNoDelay;
                    int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    Integer num = this.tcpKeepAliveIdle;
                    int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                    Boolean bool2 = this.tcpFastOpen;
                    int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                    String str = this.tproxy;
                    int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
                    Integer num2 = this.mark;
                    int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                    String str2 = this.dialerProxy;
                    int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.domainStrategy;
                    return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
                }

                public final void setDialerProxy(String str) {
                    this.dialerProxy = str;
                }

                public final void setDomainStrategy(String str) {
                    this.domainStrategy = str;
                }

                public final void setMark(Integer num) {
                    this.mark = num;
                }

                public final void setTcpFastOpen(Boolean bool) {
                    this.tcpFastOpen = bool;
                }

                public final void setTcpKeepAliveIdle(Integer num) {
                    this.tcpKeepAliveIdle = num;
                }

                public final void setTcpNoDelay(Boolean bool) {
                    this.TcpNoDelay = bool;
                }

                public final void setTproxy(String str) {
                    this.tproxy = str;
                }

                public String toString() {
                    Boolean bool = this.TcpNoDelay;
                    Integer num = this.tcpKeepAliveIdle;
                    Boolean bool2 = this.tcpFastOpen;
                    String str = this.tproxy;
                    Integer num2 = this.mark;
                    String str2 = this.dialerProxy;
                    String str3 = this.domainStrategy;
                    StringBuilder sb = new StringBuilder("SockoptBean(TcpNoDelay=");
                    sb.append(bool);
                    sb.append(", tcpKeepAliveIdle=");
                    sb.append(num);
                    sb.append(", tcpFastOpen=");
                    sb.append(bool2);
                    sb.append(", tproxy=");
                    sb.append(str);
                    sb.append(", mark=");
                    sb.append(num2);
                    sb.append(", dialerProxy=");
                    sb.append(str2);
                    sb.append(", domainStrategy=");
                    return vh.s(sb, str3, ")");
                }

                public SockoptBean(Boolean bool, Integer num, Boolean bool2, String str, Integer num2, String str2, String str3) {
                    this.TcpNoDelay = bool;
                    this.tcpKeepAliveIdle = num;
                    this.tcpFastOpen = bool2;
                    this.tproxy = str;
                    this.mark = num2;
                    this.dialerProxy = str2;
                    this.domainStrategy = str3;
                }

                public SockoptBean() {
                    this(null, null, null, null, null, null, null, 127, null);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018JH\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\bHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001a¨\u0006)"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$GrpcSettingsBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "serviceName", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "authority", "multiMode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "idle_timeout", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "health_check_timeout", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getServiceName", "()Ljava/lang/String;", "setServiceName", "(Ljava/lang/String;)V", "getAuthority", "setAuthority", "getMultiMode", "()Ljava/lang/Boolean;", "setMultiMode", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getIdle_timeout", "()Ljava/lang/Integer;", "setIdle_timeout", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getHealth_check_timeout", "setHealth_check_timeout", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$StreamSettingsBean$GrpcSettingsBean;", "equals", "other", "hashCode", "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class GrpcSettingsBean {
                private String authority;
                private Integer health_check_timeout;
                private Integer idle_timeout;
                private Boolean multiMode;
                private String serviceName;

                /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
                    	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
                    	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
                    	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
                    	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
                    	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
                    */
                public /* synthetic */ GrpcSettingsBean(java.lang.String r2, java.lang.String r3, java.lang.Boolean r4, java.lang.Integer r5, java.lang.Integer r6, int r7, defpackage.xu r8) {
                    /*
                        r1 = this;
                        r8 = r7 & 1
                        if (r8 == 0) goto L6
                        java.lang.String r2 = ""
                    L6:
                        r8 = r7 & 2
                        r0 = 0
                        if (r8 == 0) goto Lc
                        r3 = r0
                    Lc:
                        r8 = r7 & 4
                        if (r8 == 0) goto L11
                        r4 = r0
                    L11:
                        r8 = r7 & 8
                        if (r8 == 0) goto L16
                        r5 = r0
                    L16:
                        r7 = r7 & 16
                        if (r7 == 0) goto L21
                        r8 = r0
                        r6 = r4
                        r7 = r5
                        r4 = r2
                        r5 = r3
                        r3 = r1
                        goto L27
                    L21:
                        r8 = r6
                        r7 = r5
                        r5 = r3
                        r6 = r4
                        r3 = r1
                        r4 = r2
                    L27:
                        r3.<init>(r4, r5, r6, r7, r8)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.dto.V2rayConfig.OutboundBean.StreamSettingsBean.GrpcSettingsBean.<init>(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.Integer, int, xu):void");
                }

                public static /* synthetic */ GrpcSettingsBean copy$default(GrpcSettingsBean grpcSettingsBean, String str, String str2, Boolean bool, Integer num, Integer num2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = grpcSettingsBean.serviceName;
                    }
                    if ((i & 2) != 0) {
                        str2 = grpcSettingsBean.authority;
                    }
                    if ((i & 4) != 0) {
                        bool = grpcSettingsBean.multiMode;
                    }
                    if ((i & 8) != 0) {
                        num = grpcSettingsBean.idle_timeout;
                    }
                    if ((i & 16) != 0) {
                        num2 = grpcSettingsBean.health_check_timeout;
                    }
                    Integer num3 = num2;
                    Boolean bool2 = bool;
                    return grpcSettingsBean.copy(str, str2, bool2, num, num3);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getServiceName() {
                    return this.serviceName;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getAuthority() {
                    return this.authority;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final Boolean getMultiMode() {
                    return this.multiMode;
                }

                /* JADX INFO: renamed from: component4, reason: from getter */
                public final Integer getIdle_timeout() {
                    return this.idle_timeout;
                }

                /* JADX INFO: renamed from: component5, reason: from getter */
                public final Integer getHealth_check_timeout() {
                    return this.health_check_timeout;
                }

                public final GrpcSettingsBean copy(String serviceName, String authority, Boolean multiMode, Integer idle_timeout, Integer health_check_timeout) {
                    serviceName.getClass();
                    return new GrpcSettingsBean(serviceName, authority, multiMode, idle_timeout, health_check_timeout);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof GrpcSettingsBean)) {
                        return false;
                    }
                    GrpcSettingsBean grpcSettingsBean = (GrpcSettingsBean) other;
                    return yg0.a(this.serviceName, grpcSettingsBean.serviceName) && yg0.a(this.authority, grpcSettingsBean.authority) && yg0.a(this.multiMode, grpcSettingsBean.multiMode) && yg0.a(this.idle_timeout, grpcSettingsBean.idle_timeout) && yg0.a(this.health_check_timeout, grpcSettingsBean.health_check_timeout);
                }

                public final String getAuthority() {
                    return this.authority;
                }

                public final Integer getHealth_check_timeout() {
                    return this.health_check_timeout;
                }

                public final Integer getIdle_timeout() {
                    return this.idle_timeout;
                }

                public final Boolean getMultiMode() {
                    return this.multiMode;
                }

                public final String getServiceName() {
                    return this.serviceName;
                }

                public int hashCode() {
                    int iHashCode = this.serviceName.hashCode() * 31;
                    String str = this.authority;
                    int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                    Boolean bool = this.multiMode;
                    int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                    Integer num = this.idle_timeout;
                    int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                    Integer num2 = this.health_check_timeout;
                    return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
                }

                public final void setAuthority(String str) {
                    this.authority = str;
                }

                public final void setHealth_check_timeout(Integer num) {
                    this.health_check_timeout = num;
                }

                public final void setIdle_timeout(Integer num) {
                    this.idle_timeout = num;
                }

                public final void setMultiMode(Boolean bool) {
                    this.multiMode = bool;
                }

                public final void setServiceName(String str) {
                    str.getClass();
                    this.serviceName = str;
                }

                public String toString() {
                    String str = this.serviceName;
                    String str2 = this.authority;
                    Boolean bool = this.multiMode;
                    Integer num = this.idle_timeout;
                    Integer num2 = this.health_check_timeout;
                    StringBuilder sbA = hz.A("GrpcSettingsBean(serviceName=", str, ", authority=", str2, ", multiMode=");
                    sbA.append(bool);
                    sbA.append(", idle_timeout=");
                    sbA.append(num);
                    sbA.append(", health_check_timeout=");
                    sbA.append(num2);
                    sbA.append(")");
                    return sbA.toString();
                }

                public GrpcSettingsBean(String str, String str2, Boolean bool, Integer num, Integer num2) {
                    str.getClass();
                    this.serviceName = str;
                    this.authority = str2;
                    this.multiMode = bool;
                    this.idle_timeout = num;
                    this.health_check_timeout = num2;
                }

                public GrpcSettingsBean() {
                    this(null, null, null, null, null, 31, null);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J<\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006$"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$MuxBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "enabled", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "concurrency", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "xudpConcurrency", "xudpProxyUDP443", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getEnabled", "()Z", "setEnabled", "(Z)V", "getConcurrency", "()Ljava/lang/Integer;", "setConcurrency", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getXudpConcurrency", "setXudpConcurrency", "getXudpProxyUDP443", "()Ljava/lang/String;", "setXudpProxyUDP443", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/v2ray/ang/dto/V2rayConfig$OutboundBean$MuxBean;", "equals", "other", "hashCode", "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MuxBean {
            private Integer concurrency;
            private boolean enabled;
            private Integer xudpConcurrency;
            private String xudpProxyUDP443;

            public /* synthetic */ MuxBean(boolean z, Integer num, Integer num2, String str, int i, xu xuVar) {
                this(z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str);
            }

            public static /* synthetic */ MuxBean copy$default(MuxBean muxBean, boolean z, Integer num, Integer num2, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = muxBean.enabled;
                }
                if ((i & 2) != 0) {
                    num = muxBean.concurrency;
                }
                if ((i & 4) != 0) {
                    num2 = muxBean.xudpConcurrency;
                }
                if ((i & 8) != 0) {
                    str = muxBean.xudpProxyUDP443;
                }
                return muxBean.copy(z, num, num2, str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Integer getConcurrency() {
                return this.concurrency;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Integer getXudpConcurrency() {
                return this.xudpConcurrency;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getXudpProxyUDP443() {
                return this.xudpProxyUDP443;
            }

            public final MuxBean copy(boolean enabled, Integer concurrency, Integer xudpConcurrency, String xudpProxyUDP443) {
                return new MuxBean(enabled, concurrency, xudpConcurrency, xudpProxyUDP443);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MuxBean)) {
                    return false;
                }
                MuxBean muxBean = (MuxBean) other;
                return this.enabled == muxBean.enabled && yg0.a(this.concurrency, muxBean.concurrency) && yg0.a(this.xudpConcurrency, muxBean.xudpConcurrency) && yg0.a(this.xudpProxyUDP443, muxBean.xudpProxyUDP443);
            }

            public final Integer getConcurrency() {
                return this.concurrency;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final Integer getXudpConcurrency() {
                return this.xudpConcurrency;
            }

            public final String getXudpProxyUDP443() {
                return this.xudpProxyUDP443;
            }

            public int hashCode() {
                int i = (this.enabled ? 1231 : 1237) * 31;
                Integer num = this.concurrency;
                int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.xudpConcurrency;
                int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                String str = this.xudpProxyUDP443;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            public final void setConcurrency(Integer num) {
                this.concurrency = num;
            }

            public final void setEnabled(boolean z) {
                this.enabled = z;
            }

            public final void setXudpConcurrency(Integer num) {
                this.xudpConcurrency = num;
            }

            public final void setXudpProxyUDP443(String str) {
                this.xudpProxyUDP443 = str;
            }

            public String toString() {
                return "MuxBean(enabled=" + this.enabled + ", concurrency=" + this.concurrency + ", xudpConcurrency=" + this.xudpConcurrency + ", xudpProxyUDP443=" + this.xudpProxyUDP443 + ")";
            }

            public MuxBean(boolean z, Integer num, Integer num2, String str) {
                this.enabled = z;
                this.concurrency = num;
                this.xudpConcurrency = num2;
                this.xudpProxyUDP443 = str;
            }
        }

        public OutboundBean(String str, String str2, OutSettingsBean outSettingsBean, StreamSettingsBean streamSettingsBean, Object obj, String str3, MuxBean muxBean) {
            str.getClass();
            str2.getClass();
            this.tag = str;
            this.protocol = str2;
            this.settings = outSettingsBean;
            this.streamSettings = streamSettingsBean;
            this.proxySettings = obj;
            this.sendThrough = str3;
            this.mux = muxBean;
        }
    }

    public /* synthetic */ V2rayConfig(String str, Object obj, LogBean logBean, PolicyBean policyBean, ArrayList arrayList, ArrayList arrayList2, DnsBean dnsBean, RoutingBean routingBean, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i, xu xuVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : obj, logBean, (i & 8) != 0 ? null : policyBean, arrayList, arrayList2, (i & 64) != 0 ? null : dnsBean, routingBean, (i & 256) != 0 ? null : obj2, (i & 512) != 0 ? null : obj3, (i & 1024) != 0 ? null : obj4, (i & 2048) != 0 ? null : obj5, (i & AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE) != 0 ? null : obj6, (i & AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT) != 0 ? null : obj7, (i & AttribFlags.SSH_FILEXFER_ATTR_UNTRANSLATED_NAME) != 0 ? null : obj8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRemarks() {
        return this.remarks;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Object getTransport() {
        return this.transport;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Object getReverse() {
        return this.reverse;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Object getFakedns() {
        return this.fakedns;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Object getBrowserForwarder() {
        return this.browserForwarder;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Object getObservatory() {
        return this.observatory;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Object getBurstObservatory() {
        return this.burstObservatory;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getStats() {
        return this.stats;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LogBean getLog() {
        return this.log;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PolicyBean getPolicy() {
        return this.policy;
    }

    public final ArrayList<InboundBean> component5() {
        return this.inbounds;
    }

    public final ArrayList<OutboundBean> component6() {
        return this.outbounds;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DnsBean getDns() {
        return this.dns;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final RoutingBean getRouting() {
        return this.routing;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Object getApi() {
        return this.api;
    }

    public final V2rayConfig copy(String remarks, Object stats, LogBean log, PolicyBean policy, ArrayList<InboundBean> inbounds, ArrayList<OutboundBean> outbounds, DnsBean dns, RoutingBean routing, Object api, Object transport, Object reverse, Object fakedns, Object browserForwarder, Object observatory, Object burstObservatory) {
        log.getClass();
        inbounds.getClass();
        outbounds.getClass();
        routing.getClass();
        return new V2rayConfig(remarks, stats, log, policy, inbounds, outbounds, dns, routing, api, transport, reverse, fakedns, browserForwarder, observatory, burstObservatory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof V2rayConfig)) {
            return false;
        }
        V2rayConfig v2rayConfig = (V2rayConfig) other;
        return yg0.a(this.remarks, v2rayConfig.remarks) && yg0.a(this.stats, v2rayConfig.stats) && yg0.a(this.log, v2rayConfig.log) && yg0.a(this.policy, v2rayConfig.policy) && yg0.a(this.inbounds, v2rayConfig.inbounds) && yg0.a(this.outbounds, v2rayConfig.outbounds) && yg0.a(this.dns, v2rayConfig.dns) && yg0.a(this.routing, v2rayConfig.routing) && yg0.a(this.api, v2rayConfig.api) && yg0.a(this.transport, v2rayConfig.transport) && yg0.a(this.reverse, v2rayConfig.reverse) && yg0.a(this.fakedns, v2rayConfig.fakedns) && yg0.a(this.browserForwarder, v2rayConfig.browserForwarder) && yg0.a(this.observatory, v2rayConfig.observatory) && yg0.a(this.burstObservatory, v2rayConfig.burstObservatory);
    }

    public final List<OutboundBean> getAllProxyOutbound() {
        ArrayList<OutboundBean> arrayList = this.outbounds;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            OutboundBean outboundBean = (OutboundBean) obj;
            EnumEntries<EConfigType> entries = EConfigType.getEntries();
            if (entries == null || !entries.isEmpty()) {
                Iterator<EConfigType> it = entries.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (g.w(it.next().name(), outboundBean.getProtocol(), true)) {
                        arrayList2.add(obj);
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    public final Object getApi() {
        return this.api;
    }

    public final Object getBrowserForwarder() {
        return this.browserForwarder;
    }

    public final Object getBurstObservatory() {
        return this.burstObservatory;
    }

    public final DnsBean getDns() {
        return this.dns;
    }

    public final Object getFakedns() {
        return this.fakedns;
    }

    public final ArrayList<InboundBean> getInbounds() {
        return this.inbounds;
    }

    public final LogBean getLog() {
        return this.log;
    }

    public final Object getObservatory() {
        return this.observatory;
    }

    public final ArrayList<OutboundBean> getOutbounds() {
        return this.outbounds;
    }

    public final PolicyBean getPolicy() {
        return this.policy;
    }

    public final OutboundBean getProxyOutbound() {
        for (OutboundBean outboundBean : this.outbounds) {
            Iterator<EConfigType> it = EConfigType.getEntries().iterator();
            while (it.hasNext()) {
                if (g.w(outboundBean.getProtocol(), it.next().name(), true)) {
                    return outboundBean;
                }
            }
        }
        return null;
    }

    public final String getRemarks() {
        return this.remarks;
    }

    public final Object getReverse() {
        return this.reverse;
    }

    public final RoutingBean getRouting() {
        return this.routing;
    }

    public final Object getStats() {
        return this.stats;
    }

    public final Object getTransport() {
        return this.transport;
    }

    public int hashCode() {
        String str = this.remarks;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.stats;
        int iHashCode2 = (this.log.hashCode() + ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31)) * 31;
        PolicyBean policyBean = this.policy;
        int iHashCode3 = (this.outbounds.hashCode() + ((this.inbounds.hashCode() + ((iHashCode2 + (policyBean == null ? 0 : policyBean.hashCode())) * 31)) * 31)) * 31;
        DnsBean dnsBean = this.dns;
        int iHashCode4 = (this.routing.hashCode() + ((iHashCode3 + (dnsBean == null ? 0 : dnsBean.hashCode())) * 31)) * 31;
        Object obj2 = this.api;
        int iHashCode5 = (iHashCode4 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.transport;
        int iHashCode6 = (iHashCode5 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.reverse;
        int iHashCode7 = (iHashCode6 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.fakedns;
        int iHashCode8 = (iHashCode7 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.browserForwarder;
        int iHashCode9 = (iHashCode8 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Object obj7 = this.observatory;
        int iHashCode10 = (iHashCode9 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Object obj8 = this.burstObservatory;
        return iHashCode10 + (obj8 != null ? obj8.hashCode() : 0);
    }

    public final void setBurstObservatory(Object obj) {
        this.burstObservatory = obj;
    }

    public final void setDns(DnsBean dnsBean) {
        this.dns = dnsBean;
    }

    public final void setFakedns(Object obj) {
        this.fakedns = obj;
    }

    public final void setObservatory(Object obj) {
        this.observatory = obj;
    }

    public final void setOutbounds(ArrayList<OutboundBean> arrayList) {
        arrayList.getClass();
        this.outbounds = arrayList;
    }

    public final void setPolicy(PolicyBean policyBean) {
        this.policy = policyBean;
    }

    public final void setRemarks(String str) {
        this.remarks = str;
    }

    public final void setStats(Object obj) {
        this.stats = obj;
    }

    public String toString() {
        String str = this.remarks;
        Object obj = this.stats;
        LogBean logBean = this.log;
        PolicyBean policyBean = this.policy;
        ArrayList<InboundBean> arrayList = this.inbounds;
        ArrayList<OutboundBean> arrayList2 = this.outbounds;
        DnsBean dnsBean = this.dns;
        RoutingBean routingBean = this.routing;
        Object obj2 = this.api;
        Object obj3 = this.transport;
        Object obj4 = this.reverse;
        Object obj5 = this.fakedns;
        Object obj6 = this.browserForwarder;
        Object obj7 = this.observatory;
        Object obj8 = this.burstObservatory;
        StringBuilder sb = new StringBuilder("V2rayConfig(remarks=");
        sb.append(str);
        sb.append(", stats=");
        sb.append(obj);
        sb.append(", log=");
        sb.append(logBean);
        sb.append(", policy=");
        sb.append(policyBean);
        sb.append(", inbounds=");
        sb.append(arrayList);
        sb.append(", outbounds=");
        sb.append(arrayList2);
        sb.append(", dns=");
        sb.append(dnsBean);
        sb.append(", routing=");
        sb.append(routingBean);
        sb.append(", api=");
        sb.append(obj2);
        sb.append(", transport=");
        sb.append(obj3);
        sb.append(", reverse=");
        sb.append(obj4);
        sb.append(", fakedns=");
        sb.append(obj5);
        sb.append(", browserForwarder=");
        sb.append(obj6);
        sb.append(", observatory=");
        sb.append(obj7);
        sb.append(", burstObservatory=");
        return vh.k(obj8, ")", sb);
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001$BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0019\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$RoutingBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "domainStrategy", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "domainMatcher", "rules", "Ljava/util/ArrayList;", "Lcom/v2ray/ang/dto/V2rayConfig$RoutingBean$RulesBean;", "Lkotlin/collections/ArrayList;", "balancers", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;)V", "getDomainStrategy", "()Ljava/lang/String;", "setDomainStrategy", "(Ljava/lang/String;)V", "getDomainMatcher", "setDomainMatcher", "getRules", "()Ljava/util/ArrayList;", "setRules", "(Ljava/util/ArrayList;)V", "getBalancers", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "RulesBean", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RoutingBean {
        private final List<Object> balancers;
        private String domainMatcher;
        private String domainStrategy;
        private ArrayList<RulesBean> rules;

        public RoutingBean(String str, String str2, ArrayList<RulesBean> arrayList, List<? extends Object> list) {
            str.getClass();
            arrayList.getClass();
            this.domainStrategy = str;
            this.domainMatcher = str2;
            this.rules = arrayList;
            this.balancers = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RoutingBean copy$default(RoutingBean routingBean, String str, String str2, ArrayList arrayList, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = routingBean.domainStrategy;
            }
            if ((i & 2) != 0) {
                str2 = routingBean.domainMatcher;
            }
            if ((i & 4) != 0) {
                arrayList = routingBean.rules;
            }
            if ((i & 8) != 0) {
                list = routingBean.balancers;
            }
            return routingBean.copy(str, str2, arrayList, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDomainStrategy() {
            return this.domainStrategy;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDomainMatcher() {
            return this.domainMatcher;
        }

        public final ArrayList<RulesBean> component3() {
            return this.rules;
        }

        public final List<Object> component4() {
            return this.balancers;
        }

        public final RoutingBean copy(String domainStrategy, String domainMatcher, ArrayList<RulesBean> rules, List<? extends Object> balancers) {
            domainStrategy.getClass();
            rules.getClass();
            return new RoutingBean(domainStrategy, domainMatcher, rules, balancers);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RoutingBean)) {
                return false;
            }
            RoutingBean routingBean = (RoutingBean) other;
            return yg0.a(this.domainStrategy, routingBean.domainStrategy) && yg0.a(this.domainMatcher, routingBean.domainMatcher) && yg0.a(this.rules, routingBean.rules) && yg0.a(this.balancers, routingBean.balancers);
        }

        public final List<Object> getBalancers() {
            return this.balancers;
        }

        public final String getDomainMatcher() {
            return this.domainMatcher;
        }

        public final String getDomainStrategy() {
            return this.domainStrategy;
        }

        public final ArrayList<RulesBean> getRules() {
            return this.rules;
        }

        public int hashCode() {
            int iHashCode = this.domainStrategy.hashCode() * 31;
            String str = this.domainMatcher;
            int iHashCode2 = (this.rules.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            List<Object> list = this.balancers;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final void setDomainMatcher(String str) {
            this.domainMatcher = str;
        }

        public final void setDomainStrategy(String str) {
            str.getClass();
            this.domainStrategy = str;
        }

        public final void setRules(ArrayList<RulesBean> arrayList) {
            arrayList.getClass();
            this.rules = arrayList;
        }

        public String toString() {
            String str = this.domainStrategy;
            String str2 = this.domainMatcher;
            ArrayList<RulesBean> arrayList = this.rules;
            List<Object> list = this.balancers;
            StringBuilder sbA = hz.A("RoutingBean(domainStrategy=", str, ", domainMatcher=", str2, ", rules=");
            sbA.append(arrayList);
            sbA.append(", balancers=");
            sbA.append(list);
            sbA.append(")");
            return sbA.toString();
        }

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bç\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u001d\u00102\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006HÆ\u0003J\u001d\u00103\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\u0011\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jé\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00062\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R.\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR.\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010)\"\u0004\b,\u0010-R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0017R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0017¨\u0006F"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$RoutingBean$RulesBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "type", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ip", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "domain", "outboundTag", "balancerTag", "port", "sourcePort", "network", "source", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "user", "inboundTag", "protocol", "attrs", "domainMatcher", "<init>", "(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getIp", "()Ljava/util/ArrayList;", "setIp", "(Ljava/util/ArrayList;)V", "getDomain", "setDomain", "getOutboundTag", "setOutboundTag", "getBalancerTag", "setBalancerTag", "getPort", "setPort", "getSourcePort", "getNetwork", "getSource", "()Ljava/util/List;", "getUser", "getInboundTag", "setInboundTag", "(Ljava/util/List;)V", "getProtocol", "getAttrs", "getDomainMatcher", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RulesBean {
            private final String attrs;
            private String balancerTag;
            private ArrayList<String> domain;
            private final String domainMatcher;
            private List<String> inboundTag;
            private ArrayList<String> ip;
            private final String network;
            private String outboundTag;
            private String port;
            private final List<String> protocol;
            private final List<String> source;
            private final String sourcePort;
            private String type;
            private final List<String> user;

            public /* synthetic */ RulesBean(String str, ArrayList arrayList, ArrayList arrayList2, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, List list4, String str7, String str8, int i, xu xuVar) {
                this((i & 1) != 0 ? "field" : str, (i & 2) != 0 ? null : arrayList, (i & 4) != 0 ? null : arrayList2, (i & 8) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : list2, (i & 1024) != 0 ? null : list3, (i & 2048) != 0 ? null : list4, (i & AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE) != 0 ? null : str7, (i & AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT) != 0 ? null : str8);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getType() {
                return this.type;
            }

            public final List<String> component10() {
                return this.user;
            }

            public final List<String> component11() {
                return this.inboundTag;
            }

            public final List<String> component12() {
                return this.protocol;
            }

            /* JADX INFO: renamed from: component13, reason: from getter */
            public final String getAttrs() {
                return this.attrs;
            }

            /* JADX INFO: renamed from: component14, reason: from getter */
            public final String getDomainMatcher() {
                return this.domainMatcher;
            }

            public final ArrayList<String> component2() {
                return this.ip;
            }

            public final ArrayList<String> component3() {
                return this.domain;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getOutboundTag() {
                return this.outboundTag;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getBalancerTag() {
                return this.balancerTag;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            public final String getPort() {
                return this.port;
            }

            /* JADX INFO: renamed from: component7, reason: from getter */
            public final String getSourcePort() {
                return this.sourcePort;
            }

            /* JADX INFO: renamed from: component8, reason: from getter */
            public final String getNetwork() {
                return this.network;
            }

            public final List<String> component9() {
                return this.source;
            }

            public final RulesBean copy(String type, ArrayList<String> ip, ArrayList<String> domain, String outboundTag, String balancerTag, String port, String sourcePort, String network, List<String> source, List<String> user, List<String> inboundTag, List<String> protocol, String attrs, String domainMatcher) {
                type.getClass();
                outboundTag.getClass();
                return new RulesBean(type, ip, domain, outboundTag, balancerTag, port, sourcePort, network, source, user, inboundTag, protocol, attrs, domainMatcher);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RulesBean)) {
                    return false;
                }
                RulesBean rulesBean = (RulesBean) other;
                return yg0.a(this.type, rulesBean.type) && yg0.a(this.ip, rulesBean.ip) && yg0.a(this.domain, rulesBean.domain) && yg0.a(this.outboundTag, rulesBean.outboundTag) && yg0.a(this.balancerTag, rulesBean.balancerTag) && yg0.a(this.port, rulesBean.port) && yg0.a(this.sourcePort, rulesBean.sourcePort) && yg0.a(this.network, rulesBean.network) && yg0.a(this.source, rulesBean.source) && yg0.a(this.user, rulesBean.user) && yg0.a(this.inboundTag, rulesBean.inboundTag) && yg0.a(this.protocol, rulesBean.protocol) && yg0.a(this.attrs, rulesBean.attrs) && yg0.a(this.domainMatcher, rulesBean.domainMatcher);
            }

            public final String getAttrs() {
                return this.attrs;
            }

            public final String getBalancerTag() {
                return this.balancerTag;
            }

            public final ArrayList<String> getDomain() {
                return this.domain;
            }

            public final String getDomainMatcher() {
                return this.domainMatcher;
            }

            public final List<String> getInboundTag() {
                return this.inboundTag;
            }

            public final ArrayList<String> getIp() {
                return this.ip;
            }

            public final String getNetwork() {
                return this.network;
            }

            public final String getOutboundTag() {
                return this.outboundTag;
            }

            public final String getPort() {
                return this.port;
            }

            public final List<String> getProtocol() {
                return this.protocol;
            }

            public final List<String> getSource() {
                return this.source;
            }

            public final String getSourcePort() {
                return this.sourcePort;
            }

            public final String getType() {
                return this.type;
            }

            public final List<String> getUser() {
                return this.user;
            }

            public int hashCode() {
                int iHashCode = this.type.hashCode() * 31;
                ArrayList<String> arrayList = this.ip;
                int iHashCode2 = (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
                ArrayList<String> arrayList2 = this.domain;
                int iC = vh.c((iHashCode2 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31, 31, this.outboundTag);
                String str = this.balancerTag;
                int iHashCode3 = (iC + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.port;
                int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.sourcePort;
                int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.network;
                int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
                List<String> list = this.source;
                int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
                List<String> list2 = this.user;
                int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
                List<String> list3 = this.inboundTag;
                int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
                List<String> list4 = this.protocol;
                int iHashCode10 = (iHashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
                String str5 = this.attrs;
                int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.domainMatcher;
                return iHashCode11 + (str6 != null ? str6.hashCode() : 0);
            }

            public final void setBalancerTag(String str) {
                this.balancerTag = str;
            }

            public final void setDomain(ArrayList<String> arrayList) {
                this.domain = arrayList;
            }

            public final void setInboundTag(List<String> list) {
                this.inboundTag = list;
            }

            public final void setIp(ArrayList<String> arrayList) {
                this.ip = arrayList;
            }

            public final void setOutboundTag(String str) {
                str.getClass();
                this.outboundTag = str;
            }

            public final void setPort(String str) {
                this.port = str;
            }

            public final void setType(String str) {
                str.getClass();
                this.type = str;
            }

            public String toString() {
                String str = this.type;
                ArrayList<String> arrayList = this.ip;
                ArrayList<String> arrayList2 = this.domain;
                String str2 = this.outboundTag;
                String str3 = this.balancerTag;
                String str4 = this.port;
                String str5 = this.sourcePort;
                String str6 = this.network;
                List<String> list = this.source;
                List<String> list2 = this.user;
                List<String> list3 = this.inboundTag;
                List<String> list4 = this.protocol;
                String str7 = this.attrs;
                String str8 = this.domainMatcher;
                StringBuilder sb = new StringBuilder("RulesBean(type=");
                sb.append(str);
                sb.append(", ip=");
                sb.append(arrayList);
                sb.append(", domain=");
                sb.append(arrayList2);
                sb.append(", outboundTag=");
                sb.append(str2);
                sb.append(", balancerTag=");
                hz.H(sb, str3, ", port=", str4, ", sourcePort=");
                hz.H(sb, str5, ", network=", str6, ", source=");
                sb.append(list);
                sb.append(", user=");
                sb.append(list2);
                sb.append(", inboundTag=");
                sb.append(list3);
                sb.append(", protocol=");
                sb.append(list4);
                sb.append(", attrs=");
                return hz.x(sb, str7, ", domainMatcher=", str8, ")");
            }

            public RulesBean(String str, ArrayList<String> arrayList, ArrayList<String> arrayList2, String str2, String str3, String str4, String str5, String str6, List<String> list, List<String> list2, List<String> list3, List<String> list4, String str7, String str8) {
                str.getClass();
                str2.getClass();
                this.type = str;
                this.ip = arrayList;
                this.domain = arrayList2;
                this.outboundTag = str2;
                this.balancerTag = str3;
                this.port = str4;
                this.sourcePort = str5;
                this.network = str6;
                this.source = list;
                this.user = list2;
                this.inboundTag = list3;
                this.protocol = list4;
                this.attrs = str7;
                this.domainMatcher = str8;
            }

            public RulesBean() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }
        }

        public /* synthetic */ RoutingBean(String str, String str2, ArrayList arrayList, List list, int i, xu xuVar) {
            this(str, (i & 2) != 0 ? null : str2, arrayList, (i & 8) != 0 ? null : list);
        }
    }

    public V2rayConfig(String str, Object obj, LogBean logBean, PolicyBean policyBean, ArrayList<InboundBean> arrayList, ArrayList<OutboundBean> arrayList2, DnsBean dnsBean, RoutingBean routingBean, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        logBean.getClass();
        arrayList.getClass();
        arrayList2.getClass();
        routingBean.getClass();
        this.remarks = str;
        this.stats = obj;
        this.log = logBean;
        this.policy = policyBean;
        this.inbounds = arrayList;
        this.outbounds = arrayList2;
        this.dns = dnsBean;
        this.routing = routingBean;
        this.api = obj2;
        this.transport = obj3;
        this.reverse = obj4;
        this.fakedns = obj5;
        this.browserForwarder = obj6;
        this.observatory = obj7;
        this.burstObservatory = obj8;
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aB'\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R&\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$PolicyBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "levels", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcom/v2ray/ang/dto/V2rayConfig$PolicyBean$LevelBean;", "system", "<init>", "(Ljava/util/Map;Ljava/lang/Object;)V", "getLevels", "()Ljava/util/Map;", "setLevels", "(Ljava/util/Map;)V", "getSystem", "()Ljava/lang/Object;", "setSystem", "(Ljava/lang/Object;)V", "component1", "component2", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "LevelBean", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PolicyBean {
        private Map<String, LevelBean> levels;
        private Object system;

        public PolicyBean(Map<String, LevelBean> map, Object obj) {
            map.getClass();
            this.levels = map;
            this.system = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PolicyBean copy$default(PolicyBean policyBean, Map map, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                map = policyBean.levels;
            }
            if ((i & 2) != 0) {
                obj = policyBean.system;
            }
            return policyBean.copy(map, obj);
        }

        public final Map<String, LevelBean> component1() {
            return this.levels;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Object getSystem() {
            return this.system;
        }

        public final PolicyBean copy(Map<String, LevelBean> levels, Object system) {
            levels.getClass();
            return new PolicyBean(levels, system);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PolicyBean)) {
                return false;
            }
            PolicyBean policyBean = (PolicyBean) other;
            return yg0.a(this.levels, policyBean.levels) && yg0.a(this.system, policyBean.system);
        }

        public final Map<String, LevelBean> getLevels() {
            return this.levels;
        }

        public final Object getSystem() {
            return this.system;
        }

        public int hashCode() {
            int iHashCode = this.levels.hashCode() * 31;
            Object obj = this.system;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final void setLevels(Map<String, LevelBean> map) {
            map.getClass();
            this.levels = map;
        }

        public final void setSystem(Object obj) {
            this.system = obj;
        }

        public String toString() {
            return "PolicyBean(levels=" + this.levels + ", system=" + this.system + ")";
        }

        public /* synthetic */ PolicyBean(Map map, Object obj, int i, xu xuVar) {
            this(map, (i & 2) != 0 ? null : obj);
        }

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJb\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010¨\u0006,"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$PolicyBean$LevelBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "handshake", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "connIdle", "uplinkOnly", "downlinkOnly", "statsUserUplink", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "statsUserDownlink", "bufferSize", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getHandshake", "()Ljava/lang/Integer;", "setHandshake", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getConnIdle", "setConnIdle", "getUplinkOnly", "setUplinkOnly", "getDownlinkOnly", "setDownlinkOnly", "getStatsUserUplink", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStatsUserDownlink", "getBufferSize", "setBufferSize", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/v2ray/ang/dto/V2rayConfig$PolicyBean$LevelBean;", "equals", "other", "hashCode", "toString", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class LevelBean {
            private Integer bufferSize;
            private Integer connIdle;
            private Integer downlinkOnly;
            private Integer handshake;
            private final Boolean statsUserDownlink;
            private final Boolean statsUserUplink;
            private Integer uplinkOnly;

            public /* synthetic */ LevelBean(Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Boolean bool2, Integer num5, int i, xu xuVar) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : num5);
            }

            public static /* synthetic */ LevelBean copy$default(LevelBean levelBean, Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Boolean bool2, Integer num5, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = levelBean.handshake;
                }
                if ((i & 2) != 0) {
                    num2 = levelBean.connIdle;
                }
                if ((i & 4) != 0) {
                    num3 = levelBean.uplinkOnly;
                }
                if ((i & 8) != 0) {
                    num4 = levelBean.downlinkOnly;
                }
                if ((i & 16) != 0) {
                    bool = levelBean.statsUserUplink;
                }
                if ((i & 32) != 0) {
                    bool2 = levelBean.statsUserDownlink;
                }
                if ((i & 64) != 0) {
                    num5 = levelBean.bufferSize;
                }
                Boolean bool3 = bool2;
                Integer num6 = num5;
                Boolean bool4 = bool;
                Integer num7 = num3;
                return levelBean.copy(num, num2, num7, num4, bool4, bool3, num6);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Integer getHandshake() {
                return this.handshake;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Integer getConnIdle() {
                return this.connIdle;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Integer getUplinkOnly() {
                return this.uplinkOnly;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final Integer getDownlinkOnly() {
                return this.downlinkOnly;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final Boolean getStatsUserUplink() {
                return this.statsUserUplink;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            public final Boolean getStatsUserDownlink() {
                return this.statsUserDownlink;
            }

            /* JADX INFO: renamed from: component7, reason: from getter */
            public final Integer getBufferSize() {
                return this.bufferSize;
            }

            public final LevelBean copy(Integer handshake, Integer connIdle, Integer uplinkOnly, Integer downlinkOnly, Boolean statsUserUplink, Boolean statsUserDownlink, Integer bufferSize) {
                return new LevelBean(handshake, connIdle, uplinkOnly, downlinkOnly, statsUserUplink, statsUserDownlink, bufferSize);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LevelBean)) {
                    return false;
                }
                LevelBean levelBean = (LevelBean) other;
                return yg0.a(this.handshake, levelBean.handshake) && yg0.a(this.connIdle, levelBean.connIdle) && yg0.a(this.uplinkOnly, levelBean.uplinkOnly) && yg0.a(this.downlinkOnly, levelBean.downlinkOnly) && yg0.a(this.statsUserUplink, levelBean.statsUserUplink) && yg0.a(this.statsUserDownlink, levelBean.statsUserDownlink) && yg0.a(this.bufferSize, levelBean.bufferSize);
            }

            public final Integer getBufferSize() {
                return this.bufferSize;
            }

            public final Integer getConnIdle() {
                return this.connIdle;
            }

            public final Integer getDownlinkOnly() {
                return this.downlinkOnly;
            }

            public final Integer getHandshake() {
                return this.handshake;
            }

            public final Boolean getStatsUserDownlink() {
                return this.statsUserDownlink;
            }

            public final Boolean getStatsUserUplink() {
                return this.statsUserUplink;
            }

            public final Integer getUplinkOnly() {
                return this.uplinkOnly;
            }

            public int hashCode() {
                Integer num = this.handshake;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.connIdle;
                int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.uplinkOnly;
                int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.downlinkOnly;
                int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Boolean bool = this.statsUserUplink;
                int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.statsUserDownlink;
                int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Integer num5 = this.bufferSize;
                return iHashCode6 + (num5 != null ? num5.hashCode() : 0);
            }

            public final void setBufferSize(Integer num) {
                this.bufferSize = num;
            }

            public final void setConnIdle(Integer num) {
                this.connIdle = num;
            }

            public final void setDownlinkOnly(Integer num) {
                this.downlinkOnly = num;
            }

            public final void setHandshake(Integer num) {
                this.handshake = num;
            }

            public final void setUplinkOnly(Integer num) {
                this.uplinkOnly = num;
            }

            public String toString() {
                return "LevelBean(handshake=" + this.handshake + ", connIdle=" + this.connIdle + ", uplinkOnly=" + this.uplinkOnly + ", downlinkOnly=" + this.downlinkOnly + ", statsUserUplink=" + this.statsUserUplink + ", statsUserDownlink=" + this.statsUserDownlink + ", bufferSize=" + this.bufferSize + ")";
            }

            public LevelBean(Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Boolean bool2, Integer num5) {
                this.handshake = num;
                this.connIdle = num2;
                this.uplinkOnly = num3;
                this.downlinkOnly = num4;
                this.statsUserUplink = bool;
                this.statsUserDownlink = bool2;
                this.bufferSize = num5;
            }

            public LevelBean() {
                this(null, null, null, null, null, null, null, 127, null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0002/0B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0001HÆ\u0003Jc\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001c¨\u00061"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$InboundBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "tag", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "port", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "protocol", "listen", "settings", "sniffing", "Lcom/v2ray/ang/dto/V2rayConfig$InboundBean$SniffingBean;", "streamSettings", "allocate", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/v2ray/ang/dto/V2rayConfig$InboundBean$SniffingBean;Ljava/lang/Object;Ljava/lang/Object;)V", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "getPort", "()I", "setPort", "(I)V", "getProtocol", "setProtocol", "getListen", "setListen", "getSettings", "()Ljava/lang/Object;", "getSniffing", "()Lcom/v2ray/ang/dto/V2rayConfig$InboundBean$SniffingBean;", "getStreamSettings", "getAllocate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", "toString", "InSettingsBean", "SniffingBean", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InboundBean {
        private final Object allocate;
        private String listen;
        private int port;
        private String protocol;
        private final Object settings;
        private final SniffingBean sniffing;
        private final Object streamSettings;
        private String tag;

        public /* synthetic */ InboundBean(String str, int i, String str2, String str3, Object obj, SniffingBean sniffingBean, Object obj2, Object obj3, int i2, xu xuVar) {
            this(str, i, str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : obj, (i2 & 32) != 0 ? null : sniffingBean, (i2 & 64) != 0 ? null : obj2, (i2 & 128) != 0 ? null : obj3);
        }

        public static /* synthetic */ InboundBean copy$default(InboundBean inboundBean, String str, int i, String str2, String str3, Object obj, SniffingBean sniffingBean, Object obj2, Object obj3, int i2, Object obj4) {
            if ((i2 & 1) != 0) {
                str = inboundBean.tag;
            }
            if ((i2 & 2) != 0) {
                i = inboundBean.port;
            }
            if ((i2 & 4) != 0) {
                str2 = inboundBean.protocol;
            }
            if ((i2 & 8) != 0) {
                str3 = inboundBean.listen;
            }
            if ((i2 & 16) != 0) {
                obj = inboundBean.settings;
            }
            if ((i2 & 32) != 0) {
                sniffingBean = inboundBean.sniffing;
            }
            if ((i2 & 64) != 0) {
                obj2 = inboundBean.streamSettings;
            }
            if ((i2 & 128) != 0) {
                obj3 = inboundBean.allocate;
            }
            Object obj5 = obj2;
            Object obj6 = obj3;
            Object obj7 = obj;
            SniffingBean sniffingBean2 = sniffingBean;
            return inboundBean.copy(str, i, str2, str3, obj7, sniffingBean2, obj5, obj6);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getProtocol() {
            return this.protocol;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getListen() {
            return this.listen;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Object getSettings() {
            return this.settings;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final SniffingBean getSniffing() {
            return this.sniffing;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Object getStreamSettings() {
            return this.streamSettings;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Object getAllocate() {
            return this.allocate;
        }

        public final InboundBean copy(String tag, int port, String protocol, String listen, Object settings, SniffingBean sniffing, Object streamSettings, Object allocate) {
            tag.getClass();
            protocol.getClass();
            return new InboundBean(tag, port, protocol, listen, settings, sniffing, streamSettings, allocate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InboundBean)) {
                return false;
            }
            InboundBean inboundBean = (InboundBean) other;
            return yg0.a(this.tag, inboundBean.tag) && this.port == inboundBean.port && yg0.a(this.protocol, inboundBean.protocol) && yg0.a(this.listen, inboundBean.listen) && yg0.a(this.settings, inboundBean.settings) && yg0.a(this.sniffing, inboundBean.sniffing) && yg0.a(this.streamSettings, inboundBean.streamSettings) && yg0.a(this.allocate, inboundBean.allocate);
        }

        public final Object getAllocate() {
            return this.allocate;
        }

        public final String getListen() {
            return this.listen;
        }

        public final int getPort() {
            return this.port;
        }

        public final String getProtocol() {
            return this.protocol;
        }

        public final Object getSettings() {
            return this.settings;
        }

        public final SniffingBean getSniffing() {
            return this.sniffing;
        }

        public final Object getStreamSettings() {
            return this.streamSettings;
        }

        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            int iC = vh.c(((this.tag.hashCode() * 31) + this.port) * 31, 31, this.protocol);
            String str = this.listen;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Object obj = this.settings;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            SniffingBean sniffingBean = this.sniffing;
            int iHashCode3 = (iHashCode2 + (sniffingBean == null ? 0 : sniffingBean.hashCode())) * 31;
            Object obj2 = this.streamSettings;
            int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Object obj3 = this.allocate;
            return iHashCode4 + (obj3 != null ? obj3.hashCode() : 0);
        }

        public final void setListen(String str) {
            this.listen = str;
        }

        public final void setPort(int i) {
            this.port = i;
        }

        public final void setProtocol(String str) {
            str.getClass();
            this.protocol = str;
        }

        public final void setTag(String str) {
            str.getClass();
            this.tag = str;
        }

        public String toString() {
            String str = this.tag;
            int i = this.port;
            String str2 = this.protocol;
            String str3 = this.listen;
            Object obj = this.settings;
            SniffingBean sniffingBean = this.sniffing;
            Object obj2 = this.streamSettings;
            Object obj3 = this.allocate;
            StringBuilder sb = new StringBuilder("InboundBean(tag=");
            sb.append(str);
            sb.append(", port=");
            sb.append(i);
            sb.append(", protocol=");
            hz.H(sb, str2, ", listen=", str3, ", settings=");
            sb.append(obj);
            sb.append(", sniffing=");
            sb.append(sniffingBean);
            sb.append(", streamSettings=");
            sb.append(obj2);
            sb.append(", allocate=");
            sb.append(obj3);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013JJ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013\"\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$InboundBean$SniffingBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "enabled", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "destOverride", "Ljava/util/ArrayList;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lkotlin/collections/ArrayList;", "metadataOnly", "routeOnly", "<init>", "(ZLjava/util/ArrayList;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getEnabled", "()Z", "setEnabled", "(Z)V", "getDestOverride", "()Ljava/util/ArrayList;", "getMetadataOnly", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRouteOnly", "setRouteOnly", "(Ljava/lang/Boolean;)V", "component1", "component2", "component3", "component4", "copy", "(ZLjava/util/ArrayList;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/v2ray/ang/dto/V2rayConfig$InboundBean$SniffingBean;", "equals", "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SniffingBean {
            private final ArrayList<String> destOverride;
            private boolean enabled;
            private final Boolean metadataOnly;
            private Boolean routeOnly;

            public SniffingBean(boolean z, ArrayList<String> arrayList, Boolean bool, Boolean bool2) {
                arrayList.getClass();
                this.enabled = z;
                this.destOverride = arrayList;
                this.metadataOnly = bool;
                this.routeOnly = bool2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SniffingBean copy$default(SniffingBean sniffingBean, boolean z, ArrayList arrayList, Boolean bool, Boolean bool2, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = sniffingBean.enabled;
                }
                if ((i & 2) != 0) {
                    arrayList = sniffingBean.destOverride;
                }
                if ((i & 4) != 0) {
                    bool = sniffingBean.metadataOnly;
                }
                if ((i & 8) != 0) {
                    bool2 = sniffingBean.routeOnly;
                }
                return sniffingBean.copy(z, arrayList, bool, bool2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            public final ArrayList<String> component2() {
                return this.destOverride;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Boolean getMetadataOnly() {
                return this.metadataOnly;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final Boolean getRouteOnly() {
                return this.routeOnly;
            }

            public final SniffingBean copy(boolean enabled, ArrayList<String> destOverride, Boolean metadataOnly, Boolean routeOnly) {
                destOverride.getClass();
                return new SniffingBean(enabled, destOverride, metadataOnly, routeOnly);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SniffingBean)) {
                    return false;
                }
                SniffingBean sniffingBean = (SniffingBean) other;
                return this.enabled == sniffingBean.enabled && yg0.a(this.destOverride, sniffingBean.destOverride) && yg0.a(this.metadataOnly, sniffingBean.metadataOnly) && yg0.a(this.routeOnly, sniffingBean.routeOnly);
            }

            public final ArrayList<String> getDestOverride() {
                return this.destOverride;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final Boolean getMetadataOnly() {
                return this.metadataOnly;
            }

            public final Boolean getRouteOnly() {
                return this.routeOnly;
            }

            public int hashCode() {
                int iHashCode = (this.destOverride.hashCode() + ((this.enabled ? 1231 : 1237) * 31)) * 31;
                Boolean bool = this.metadataOnly;
                int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.routeOnly;
                return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
            }

            public final void setEnabled(boolean z) {
                this.enabled = z;
            }

            public final void setRouteOnly(Boolean bool) {
                this.routeOnly = bool;
            }

            public String toString() {
                return "SniffingBean(enabled=" + this.enabled + ", destOverride=" + this.destOverride + ", metadataOnly=" + this.metadataOnly + ", routeOnly=" + this.routeOnly + ")";
            }

            public /* synthetic */ SniffingBean(boolean z, ArrayList arrayList, Boolean bool, Boolean bool2, int i, xu xuVar) {
                this(z, arrayList, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2);
            }
        }

        public InboundBean(String str, int i, String str2, String str3, Object obj, SniffingBean sniffingBean, Object obj2, Object obj3) {
            str.getClass();
            str2.getClass();
            this.tag = str;
            this.port = i;
            this.protocol = str2;
            this.listen = str3;
            this.settings = obj;
            this.sniffing = sniffingBean;
            this.streamSettings = obj2;
            this.allocate = obj3;
        }

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006$"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$InboundBean$InSettingsBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "auth", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "udp", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "userLevel", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "address", "port", "network", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getAuth", "()Ljava/lang/String;", "getUdp", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUserLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAddress", "getPort", "getNetwork", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/v2ray/ang/dto/V2rayConfig$InboundBean$InSettingsBean;", "equals", "other", "hashCode", "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InSettingsBean {
            private final String address;
            private final String auth;
            private final String network;
            private final Integer port;
            private final Boolean udp;
            private final Integer userLevel;

            public /* synthetic */ InSettingsBean(String str, Boolean bool, Integer num, String str2, Integer num2, String str3, int i, xu xuVar) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str3);
            }

            public static /* synthetic */ InSettingsBean copy$default(InSettingsBean inSettingsBean, String str, Boolean bool, Integer num, String str2, Integer num2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = inSettingsBean.auth;
                }
                if ((i & 2) != 0) {
                    bool = inSettingsBean.udp;
                }
                if ((i & 4) != 0) {
                    num = inSettingsBean.userLevel;
                }
                if ((i & 8) != 0) {
                    str2 = inSettingsBean.address;
                }
                if ((i & 16) != 0) {
                    num2 = inSettingsBean.port;
                }
                if ((i & 32) != 0) {
                    str3 = inSettingsBean.network;
                }
                Integer num3 = num2;
                String str4 = str3;
                return inSettingsBean.copy(str, bool, num, str2, num3, str4);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getAuth() {
                return this.auth;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Boolean getUdp() {
                return this.udp;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Integer getUserLevel() {
                return this.userLevel;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getAddress() {
                return this.address;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final Integer getPort() {
                return this.port;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            public final String getNetwork() {
                return this.network;
            }

            public final InSettingsBean copy(String auth, Boolean udp, Integer userLevel, String address, Integer port, String network) {
                return new InSettingsBean(auth, udp, userLevel, address, port, network);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InSettingsBean)) {
                    return false;
                }
                InSettingsBean inSettingsBean = (InSettingsBean) other;
                return yg0.a(this.auth, inSettingsBean.auth) && yg0.a(this.udp, inSettingsBean.udp) && yg0.a(this.userLevel, inSettingsBean.userLevel) && yg0.a(this.address, inSettingsBean.address) && yg0.a(this.port, inSettingsBean.port) && yg0.a(this.network, inSettingsBean.network);
            }

            public final String getAddress() {
                return this.address;
            }

            public final String getAuth() {
                return this.auth;
            }

            public final String getNetwork() {
                return this.network;
            }

            public final Integer getPort() {
                return this.port;
            }

            public final Boolean getUdp() {
                return this.udp;
            }

            public final Integer getUserLevel() {
                return this.userLevel;
            }

            public int hashCode() {
                String str = this.auth;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Boolean bool = this.udp;
                int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                Integer num = this.userLevel;
                int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                String str2 = this.address;
                int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num2 = this.port;
                int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                String str3 = this.network;
                return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "InSettingsBean(auth=" + this.auth + ", udp=" + this.udp + ", userLevel=" + this.userLevel + ", address=" + this.address + ", port=" + this.port + ", network=" + this.network + ")";
            }

            public InSettingsBean(String str, Boolean bool, Integer num, String str2, Integer num2, String str3) {
                this.auth = str;
                this.udp = bool;
                this.userLevel = num;
                this.address = str2;
                this.port = num2;
                this.network = str3;
            }

            public InSettingsBean() {
                this(null, null, null, null, null, null, 63, null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$FakednsBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ipPool", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "poolSize", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;I)V", "getIpPool", "()Ljava/lang/String;", "setIpPool", "(Ljava/lang/String;)V", "getPoolSize", "()I", "setPoolSize", "(I)V", "component1", "component2", "copy", "equals", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "other", "hashCode", "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FakednsBean {
        private String ipPool;
        private int poolSize;

        public /* synthetic */ FakednsBean(String str, int i, int i2, xu xuVar) {
            this((i2 & 1) != 0 ? "198.18.0.0/15" : str, (i2 & 2) != 0 ? 10000 : i);
        }

        public static /* synthetic */ FakednsBean copy$default(FakednsBean fakednsBean, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = fakednsBean.ipPool;
            }
            if ((i2 & 2) != 0) {
                i = fakednsBean.poolSize;
            }
            return fakednsBean.copy(str, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getIpPool() {
            return this.ipPool;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getPoolSize() {
            return this.poolSize;
        }

        public final FakednsBean copy(String ipPool, int poolSize) {
            ipPool.getClass();
            return new FakednsBean(ipPool, poolSize);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FakednsBean)) {
                return false;
            }
            FakednsBean fakednsBean = (FakednsBean) other;
            return yg0.a(this.ipPool, fakednsBean.ipPool) && this.poolSize == fakednsBean.poolSize;
        }

        public final String getIpPool() {
            return this.ipPool;
        }

        public final int getPoolSize() {
            return this.poolSize;
        }

        public int hashCode() {
            return (this.ipPool.hashCode() * 31) + this.poolSize;
        }

        public final void setIpPool(String str) {
            str.getClass();
            this.ipPool = str;
        }

        public final void setPoolSize(int i) {
            this.poolSize = i;
        }

        public String toString() {
            return "FakednsBean(ipPool=" + this.ipPool + ", poolSize=" + this.poolSize + ")";
        }

        public FakednsBean(String str, int i) {
            str.getClass();
            this.ipPool = str;
            this.poolSize = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FakednsBean() {
            this(null, 0, 3, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$LogBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "access", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "error", "loglevel", "dnsLog", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAccess", "()Ljava/lang/String;", "getError", "getLoglevel", "setLoglevel", "(Ljava/lang/String;)V", "getDnsLog", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/v2ray/ang/dto/V2rayConfig$LogBean;", "equals", "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LogBean {
        private final String access;
        private final Boolean dnsLog;
        private final String error;
        private String loglevel;

        public /* synthetic */ LogBean(String str, String str2, String str3, Boolean bool, int i, xu xuVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool);
        }

        public static /* synthetic */ LogBean copy$default(LogBean logBean, String str, String str2, String str3, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = logBean.access;
            }
            if ((i & 2) != 0) {
                str2 = logBean.error;
            }
            if ((i & 4) != 0) {
                str3 = logBean.loglevel;
            }
            if ((i & 8) != 0) {
                bool = logBean.dnsLog;
            }
            return logBean.copy(str, str2, str3, bool);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAccess() {
            return this.access;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getLoglevel() {
            return this.loglevel;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Boolean getDnsLog() {
            return this.dnsLog;
        }

        public final LogBean copy(String access, String error, String loglevel, Boolean dnsLog) {
            return new LogBean(access, error, loglevel, dnsLog);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LogBean)) {
                return false;
            }
            LogBean logBean = (LogBean) other;
            return yg0.a(this.access, logBean.access) && yg0.a(this.error, logBean.error) && yg0.a(this.loglevel, logBean.loglevel) && yg0.a(this.dnsLog, logBean.dnsLog);
        }

        public final String getAccess() {
            return this.access;
        }

        public final Boolean getDnsLog() {
            return this.dnsLog;
        }

        public final String getError() {
            return this.error;
        }

        public final String getLoglevel() {
            return this.loglevel;
        }

        public int hashCode() {
            String str = this.access;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.error;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.loglevel;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool = this.dnsLog;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        public final void setLoglevel(String str) {
            this.loglevel = str;
        }

        public String toString() {
            String str = this.access;
            String str2 = this.error;
            String str3 = this.loglevel;
            Boolean bool = this.dnsLog;
            StringBuilder sbA = hz.A("LogBean(access=", str, ", error=", str2, ", loglevel=");
            sbA.append(str3);
            sbA.append(", dnsLog=");
            sbA.append(bool);
            sbA.append(")");
            return sbA.toString();
        }

        public LogBean(String str, String str2, String str3, Boolean bool) {
            this.access = str;
            this.error = str2;
            this.loglevel = str3;
            this.dnsLog = bool;
        }

        public LogBean() {
            this(null, null, null, null, 15, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001+Bm\u0012\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u0004\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u0004HÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jt\u0010$\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u00042\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0007HÖ\u0001R.\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018¨\u0006,"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$DnsBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "servers", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "hosts", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "clientIp", "disableCache", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "queryStrategy", "tag", "<init>", "(Ljava/util/ArrayList;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getServers", "()Ljava/util/ArrayList;", "setServers", "(Ljava/util/ArrayList;)V", "getHosts", "()Ljava/util/Map;", "setHosts", "(Ljava/util/Map;)V", "getClientIp", "()Ljava/lang/String;", "getDisableCache", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getQueryStrategy", "getTag", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/ArrayList;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/v2ray/ang/dto/V2rayConfig$DnsBean;", "equals", "other", "hashCode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toString", "ServersBean", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DnsBean {
        private final String clientIp;
        private final Boolean disableCache;
        private Map<String, ? extends Object> hosts;
        private final String queryStrategy;
        private ArrayList<Object> servers;
        private final String tag;

        public /* synthetic */ DnsBean(ArrayList arrayList, Map map, String str, Boolean bool, String str2, String str3, int i, xu xuVar) {
            this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DnsBean copy$default(DnsBean dnsBean, ArrayList arrayList, Map map, String str, Boolean bool, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                arrayList = dnsBean.servers;
            }
            if ((i & 2) != 0) {
                map = dnsBean.hosts;
            }
            if ((i & 4) != 0) {
                str = dnsBean.clientIp;
            }
            if ((i & 8) != 0) {
                bool = dnsBean.disableCache;
            }
            if ((i & 16) != 0) {
                str2 = dnsBean.queryStrategy;
            }
            if ((i & 32) != 0) {
                str3 = dnsBean.tag;
            }
            String str4 = str2;
            String str5 = str3;
            return dnsBean.copy(arrayList, map, str, bool, str4, str5);
        }

        public final ArrayList<Object> component1() {
            return this.servers;
        }

        public final Map<String, Object> component2() {
            return this.hosts;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getClientIp() {
            return this.clientIp;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Boolean getDisableCache() {
            return this.disableCache;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getQueryStrategy() {
            return this.queryStrategy;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public final DnsBean copy(ArrayList<Object> servers, Map<String, ? extends Object> hosts, String clientIp, Boolean disableCache, String queryStrategy, String tag) {
            return new DnsBean(servers, hosts, clientIp, disableCache, queryStrategy, tag);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DnsBean)) {
                return false;
            }
            DnsBean dnsBean = (DnsBean) other;
            return yg0.a(this.servers, dnsBean.servers) && yg0.a(this.hosts, dnsBean.hosts) && yg0.a(this.clientIp, dnsBean.clientIp) && yg0.a(this.disableCache, dnsBean.disableCache) && yg0.a(this.queryStrategy, dnsBean.queryStrategy) && yg0.a(this.tag, dnsBean.tag);
        }

        public final String getClientIp() {
            return this.clientIp;
        }

        public final Boolean getDisableCache() {
            return this.disableCache;
        }

        public final Map<String, Object> getHosts() {
            return this.hosts;
        }

        public final String getQueryStrategy() {
            return this.queryStrategy;
        }

        public final ArrayList<Object> getServers() {
            return this.servers;
        }

        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            ArrayList<Object> arrayList = this.servers;
            int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
            Map<String, ? extends Object> map = this.hosts;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            String str = this.clientIp;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.disableCache;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.queryStrategy;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.tag;
            return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        public final void setHosts(Map<String, ? extends Object> map) {
            this.hosts = map;
        }

        public final void setServers(ArrayList<Object> arrayList) {
            this.servers = arrayList;
        }

        public String toString() {
            ArrayList<Object> arrayList = this.servers;
            Map<String, ? extends Object> map = this.hosts;
            String str = this.clientIp;
            Boolean bool = this.disableCache;
            String str2 = this.queryStrategy;
            String str3 = this.tag;
            StringBuilder sb = new StringBuilder("DnsBean(servers=");
            sb.append(arrayList);
            sb.append(", hosts=");
            sb.append(map);
            sb.append(", clientIp=");
            sb.append(str);
            sb.append(", disableCache=");
            sb.append(bool);
            sb.append(", queryStrategy=");
            return hz.x(sb, str2, ", tag=", str3, ")");
        }

        public DnsBean(ArrayList<Object> arrayList, Map<String, ? extends Object> map, String str, Boolean bool, String str2, String str3) {
            this.servers = arrayList;
            this.hosts = map;
            this.clientIp = str;
            this.disableCache = bool;
            this.queryStrategy = str2;
            this.tag = str3;
        }

        public DnsBean() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ`\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001f¨\u0006-"}, d2 = {"Lcom/v2ray/ang/dto/V2rayConfig$DnsBean$ServersBean;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "address", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "port", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "domains", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "expectIPs", "clientIp", "skipFallback", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getPort", "()Ljava/lang/Integer;", "setPort", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDomains", "()Ljava/util/List;", "setDomains", "(Ljava/util/List;)V", "getExpectIPs", "setExpectIPs", "getClientIp", "getSkipFallback", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/v2ray/ang/dto/V2rayConfig$DnsBean$ServersBean;", "equals", "other", "hashCode", "toString", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ServersBean {
            private String address;
            private final String clientIp;
            private List<String> domains;
            private List<String> expectIPs;
            private Integer port;
            private final Boolean skipFallback;

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
                	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
                	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
                	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
                */
            public /* synthetic */ ServersBean(java.lang.String r2, java.lang.Integer r3, java.util.List r4, java.util.List r5, java.lang.String r6, java.lang.Boolean r7, int r8, defpackage.xu r9) {
                /*
                    r1 = this;
                    r9 = r8 & 1
                    if (r9 == 0) goto L6
                    java.lang.String r2 = ""
                L6:
                    r9 = r8 & 2
                    r0 = 0
                    if (r9 == 0) goto Lc
                    r3 = r0
                Lc:
                    r9 = r8 & 4
                    if (r9 == 0) goto L11
                    r4 = r0
                L11:
                    r9 = r8 & 8
                    if (r9 == 0) goto L16
                    r5 = r0
                L16:
                    r9 = r8 & 16
                    if (r9 == 0) goto L1b
                    r6 = r0
                L1b:
                    r8 = r8 & 32
                    if (r8 == 0) goto L27
                    r9 = r0
                    r7 = r5
                    r8 = r6
                    r5 = r3
                    r6 = r4
                    r3 = r1
                    r4 = r2
                    goto L2e
                L27:
                    r9 = r7
                    r8 = r6
                    r6 = r4
                    r7 = r5
                    r4 = r2
                    r5 = r3
                    r3 = r1
                L2e:
                    r3.<init>(r4, r5, r6, r7, r8, r9)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.dto.V2rayConfig.DnsBean.ServersBean.<init>(java.lang.String, java.lang.Integer, java.util.List, java.util.List, java.lang.String, java.lang.Boolean, int, xu):void");
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ServersBean copy$default(ServersBean serversBean, String str, Integer num, List list, List list2, String str2, Boolean bool, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = serversBean.address;
                }
                if ((i & 2) != 0) {
                    num = serversBean.port;
                }
                if ((i & 4) != 0) {
                    list = serversBean.domains;
                }
                if ((i & 8) != 0) {
                    list2 = serversBean.expectIPs;
                }
                if ((i & 16) != 0) {
                    str2 = serversBean.clientIp;
                }
                if ((i & 32) != 0) {
                    bool = serversBean.skipFallback;
                }
                String str3 = str2;
                Boolean bool2 = bool;
                return serversBean.copy(str, num, list, list2, str3, bool2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getAddress() {
                return this.address;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Integer getPort() {
                return this.port;
            }

            public final List<String> component3() {
                return this.domains;
            }

            public final List<String> component4() {
                return this.expectIPs;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getClientIp() {
                return this.clientIp;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            public final Boolean getSkipFallback() {
                return this.skipFallback;
            }

            public final ServersBean copy(String address, Integer port, List<String> domains, List<String> expectIPs, String clientIp, Boolean skipFallback) {
                address.getClass();
                return new ServersBean(address, port, domains, expectIPs, clientIp, skipFallback);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ServersBean)) {
                    return false;
                }
                ServersBean serversBean = (ServersBean) other;
                return yg0.a(this.address, serversBean.address) && yg0.a(this.port, serversBean.port) && yg0.a(this.domains, serversBean.domains) && yg0.a(this.expectIPs, serversBean.expectIPs) && yg0.a(this.clientIp, serversBean.clientIp) && yg0.a(this.skipFallback, serversBean.skipFallback);
            }

            public final String getAddress() {
                return this.address;
            }

            public final String getClientIp() {
                return this.clientIp;
            }

            public final List<String> getDomains() {
                return this.domains;
            }

            public final List<String> getExpectIPs() {
                return this.expectIPs;
            }

            public final Integer getPort() {
                return this.port;
            }

            public final Boolean getSkipFallback() {
                return this.skipFallback;
            }

            public int hashCode() {
                int iHashCode = this.address.hashCode() * 31;
                Integer num = this.port;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                List<String> list = this.domains;
                int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
                List<String> list2 = this.expectIPs;
                int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
                String str = this.clientIp;
                int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                Boolean bool = this.skipFallback;
                return iHashCode5 + (bool != null ? bool.hashCode() : 0);
            }

            public final void setAddress(String str) {
                str.getClass();
                this.address = str;
            }

            public final void setDomains(List<String> list) {
                this.domains = list;
            }

            public final void setExpectIPs(List<String> list) {
                this.expectIPs = list;
            }

            public final void setPort(Integer num) {
                this.port = num;
            }

            public String toString() {
                return "ServersBean(address=" + this.address + ", port=" + this.port + ", domains=" + this.domains + ", expectIPs=" + this.expectIPs + ", clientIp=" + this.clientIp + ", skipFallback=" + this.skipFallback + ")";
            }

            public ServersBean(String str, Integer num, List<String> list, List<String> list2, String str2, Boolean bool) {
                str.getClass();
                this.address = str;
                this.port = num;
                this.domains = list;
                this.expectIPs = list2;
                this.clientIp = str2;
                this.skipFallback = bool;
            }

            public ServersBean() {
                this(null, null, null, null, null, null, 63, null);
            }
        }
    }
}
