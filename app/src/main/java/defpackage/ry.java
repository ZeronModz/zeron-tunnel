package defpackage;

import java.util.Map;
import net.openvpn.openvpn.DnsOptions_ServersMap;
import net.openvpn.openvpn.DnsServer;
import net.openvpn.openvpn.ovpncliJNI;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ry implements Map.Entry {
    public DnsOptions_ServersMap.Iterator a;
    public final /* synthetic */ DnsOptions_ServersMap b;

    public ry(DnsOptions_ServersMap dnsOptions_ServersMap) {
        this.b = dnsOptions_ServersMap;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        DnsOptions_ServersMap.Iterator iterator = this.a;
        return Integer.valueOf(ovpncliJNI.DnsOptions_ServersMap_Iterator_getKey(iterator.a, iterator));
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.a.a();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        DnsServer dnsServer = (DnsServer) obj;
        DnsServer dnsServerA = this.a.a();
        DnsOptions_ServersMap.Iterator iterator = this.a;
        ovpncliJNI.DnsOptions_ServersMap_Iterator_setValue(iterator.a, iterator, dnsServer == null ? 0L : dnsServer.a, dnsServer);
        return dnsServerA;
    }
}
