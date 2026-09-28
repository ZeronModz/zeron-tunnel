package defpackage;

import com.v2ray.ang.dto.EConfigType;
import com.v2ray.ang.dto.ProfileItem;
import com.v2ray.ang.dto.V2rayConfig;
import com.v2ray.ang.fmt.FmtBase;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class vs extends FmtBase {
    public static final vs a = new vs();

    public final ProfileItem e(String str) {
        str.getClass();
        ProfileItem profileItemCreate = ProfileItem.INSTANCE.create(EConfigType.CUSTOM);
        V2rayConfig v2rayConfig = (V2rayConfig) aj0.a(V2rayConfig.class, str);
        V2rayConfig.OutboundBean proxyOutbound = v2rayConfig.getProxyOutbound();
        String remarks = v2rayConfig.getRemarks();
        if (remarks == null) {
            remarks = String.valueOf(System.currentTimeMillis());
        }
        profileItemCreate.setRemarks(remarks);
        profileItemCreate.setServer(proxyOutbound != null ? proxyOutbound.getServerAddress() : null);
        profileItemCreate.setServerPort(String.valueOf(proxyOutbound != null ? proxyOutbound.getServerPort() : null));
        return profileItemCreate;
    }
}
