package net.openvpn.openvpn;

import com.sandok.tunnel.service.OpenVPNService;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class OpenVPNClientThread extends ClientAPI_OpenVPNClient implements Runnable {
    public boolean a = false;
    public ClientAPI_Status b;
    public OpenVPNService c;
    public Thread d;
    public TunBuilder e;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class ConnectCalledTwice extends RuntimeException {
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface EventReceiver {
        void done(ClientAPI_Status clientAPI_Status);

        void event(ClientAPI_Event clientAPI_Event);

        void external_pki_cert_request(ClientAPI_ExternalPKICertRequest clientAPI_ExternalPKICertRequest);

        void external_pki_sign_request(ClientAPI_ExternalPKISignRequest clientAPI_ExternalPKISignRequest);

        void log(ClientAPI_LogInfo clientAPI_LogInfo);

        boolean pause_on_connection_timeout();

        boolean socket_protect(int i);

        TunBuilder tun_builder_new();
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface TunBuilder {
        boolean tun_builder_add_address(String str, int i, String str2, boolean z, boolean z2);

        boolean tun_builder_add_dns_server(String str, boolean z);

        boolean tun_builder_add_route(String str, int i, boolean z);

        boolean tun_builder_add_search_domain(String str);

        int tun_builder_establish();

        boolean tun_builder_exclude_route(String str, int i, boolean z);

        boolean tun_builder_reroute_gw(boolean z, boolean z2, long j);

        boolean tun_builder_set_mtu(int i);

        boolean tun_builder_set_remote_address(String str, boolean z);

        boolean tun_builder_set_session_name(String str);

        void tun_builder_teardown(boolean z);
    }

    public OpenVPNClientThread() {
        int iStats_n = ClientAPI_OpenVPNClient.stats_n();
        for (int i = 0; i < iStats_n; i++) {
            String strStats_name = ClientAPI_OpenVPNClient.stats_name(i);
            strStats_name.equals("BYTES_IN");
            strStats_name.equals("BYTES_OUT");
        }
    }

    public static boolean a(TunBuilder tunBuilder, DnsOptions_DomainsList dnsOptions_DomainsList) {
        String strDnsDomain_domain_get;
        boolean zTun_builder_add_search_domain = true;
        for (DnsDomain dnsDomain : dnsOptions_DomainsList) {
            if (dnsDomain != null && (strDnsDomain_domain_get = ovpncliJNI.DnsDomain_domain_get(dnsDomain.a, dnsDomain)) != null && !strDnsDomain_domain_get.isEmpty()) {
                zTun_builder_add_search_domain &= tunBuilder.tun_builder_add_search_domain(strDnsDomain_domain_get);
            }
        }
        return zTun_builder_add_search_domain;
    }

    public final void b(ClientAPI_Status clientAPI_Status) {
        OpenVPNService openVPNService;
        synchronized (this) {
            openVPNService = this.c;
            if (openVPNService != null) {
                this.b = clientAPI_Status;
                this.c = null;
                this.e = null;
                this.d = null;
            }
        }
        if (openVPNService != null) {
            openVPNService.done(this.b);
        }
    }

    @Override // net.openvpn.openvpn.ClientAPI_OpenVPNClient
    public final void event(ClientAPI_Event clientAPI_Event) {
        OpenVPNService openVPNService = this.c;
        if (openVPNService != null) {
            openVPNService.event(clientAPI_Event);
        }
    }

    @Override // net.openvpn.openvpn.ClientAPI_OpenVPNClient
    public final void external_pki_cert_request(ClientAPI_ExternalPKICertRequest clientAPI_ExternalPKICertRequest) {
        OpenVPNService openVPNService = this.c;
        if (openVPNService != null) {
            openVPNService.external_pki_cert_request(clientAPI_ExternalPKICertRequest);
        }
    }

    @Override // net.openvpn.openvpn.ClientAPI_OpenVPNClient
    public final void external_pki_sign_request(ClientAPI_ExternalPKISignRequest clientAPI_ExternalPKISignRequest) {
        OpenVPNService openVPNService = this.c;
        if (openVPNService != null) {
            openVPNService.external_pki_sign_request(clientAPI_ExternalPKISignRequest);
        }
    }

    @Override // net.openvpn.openvpn.ClientAPI_OpenVPNClient, net.openvpn.openvpn.LogReceiverSwigInterface
    public final void log(ClientAPI_LogInfo clientAPI_LogInfo) {
        OpenVPNService openVPNService = this.c;
        if (openVPNService != null) {
            openVPNService.log(clientAPI_LogInfo);
        }
    }

    @Override // net.openvpn.openvpn.ClientAPI_OpenVPNClient
    public final boolean pause_on_connection_timeout() {
        OpenVPNService openVPNService = this.c;
        if (openVPNService != null) {
            return openVPNService.pause_on_connection_timeout();
        }
        return false;
    }

    @Override // net.openvpn.openvpn.ClientAPI_OpenVPNClient
    public final boolean remote_override_enabled() {
        return false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b(super.connect());
    }

    @Override // net.openvpn.openvpn.ClientAPI_TunBuilderBase
    public final boolean tun_builder_add_address(String str, int i, String str2, boolean z, boolean z2) {
        TunBuilder tunBuilder = this.e;
        if (tunBuilder != null) {
            return tunBuilder.tun_builder_add_address(str, i, str2, z, z2);
        }
        return false;
    }

    @Override // net.openvpn.openvpn.ClientAPI_TunBuilderBase
    public final boolean tun_builder_add_route(String str, int i, int i2, boolean z) {
        TunBuilder tunBuilder = this.e;
        if (tunBuilder != null) {
            return tunBuilder.tun_builder_add_route(str, i, z);
        }
        return false;
    }

    @Override // net.openvpn.openvpn.ClientAPI_TunBuilderBase
    public final int tun_builder_establish() {
        TunBuilder tunBuilder = this.e;
        if (tunBuilder != null) {
            return tunBuilder.tun_builder_establish();
        }
        return -1;
    }

    @Override // net.openvpn.openvpn.ClientAPI_TunBuilderBase
    public final boolean tun_builder_exclude_route(String str, int i, int i2, boolean z) {
        TunBuilder tunBuilder = this.e;
        if (tunBuilder != null) {
            return tunBuilder.tun_builder_exclude_route(str, i, z);
        }
        return false;
    }

    @Override // net.openvpn.openvpn.ClientAPI_TunBuilderBase
    public final ClientAPI_StringVec tun_builder_get_local_networks(boolean z) {
        return new ClientAPI_StringVec();
    }

    @Override // net.openvpn.openvpn.ClientAPI_TunBuilderBase
    public final boolean tun_builder_new() {
        OpenVPNService openVPNService = this.c;
        if (openVPNService == null) {
            return false;
        }
        TunBuilder tunBuilderTun_builder_new = openVPNService.tun_builder_new();
        this.e = tunBuilderTun_builder_new;
        return tunBuilderTun_builder_new != null;
    }

    @Override // net.openvpn.openvpn.ClientAPI_TunBuilderBase
    public final boolean tun_builder_reroute_gw(boolean z, boolean z2, long j) {
        TunBuilder tunBuilder = this.e;
        if (tunBuilder != null) {
            return tunBuilder.tun_builder_reroute_gw(z, z2, j);
        }
        return false;
    }

    @Override // net.openvpn.openvpn.ClientAPI_TunBuilderBase
    public final boolean tun_builder_set_allow_family(int i, boolean z) {
        return true;
    }

    @Override // net.openvpn.openvpn.ClientAPI_TunBuilderBase
    public final boolean tun_builder_set_allow_local_dns(boolean z) {
        return true;
    }

    @Override // net.openvpn.openvpn.ClientAPI_TunBuilderBase
    public final boolean tun_builder_set_dns_options(DnsOptions dnsOptions) {
        String strDnsAddress_address_get;
        TunBuilder tunBuilder = this.e;
        if (tunBuilder == null || dnsOptions == null) {
            return false;
        }
        long jDnsOptions_servers_get = ovpncliJNI.DnsOptions_servers_get(dnsOptions.a, dnsOptions);
        DnsOptions_ServersMap dnsOptions_ServersMap = jDnsOptions_servers_get == 0 ? null : new DnsOptions_ServersMap(jDnsOptions_servers_get, false);
        boolean zA = true;
        if (dnsOptions_ServersMap != null) {
            Iterator it = ((HashSet) dnsOptions_ServersMap.entrySet()).iterator();
            while (it.hasNext()) {
                DnsServer dnsServer = (DnsServer) ((Map.Entry) it.next()).getValue();
                if (dnsServer != null) {
                    long jDnsServer_addresses_get = ovpncliJNI.DnsServer_addresses_get(dnsServer.a, dnsServer);
                    DnsOptions_AddressList dnsOptions_AddressList = jDnsServer_addresses_get == 0 ? null : new DnsOptions_AddressList(jDnsServer_addresses_get, false);
                    if (dnsOptions_AddressList != null) {
                        for (DnsAddress dnsAddress : dnsOptions_AddressList) {
                            if (dnsAddress != null && (strDnsAddress_address_get = ovpncliJNI.DnsAddress_address_get(dnsAddress.a, dnsAddress)) != null && !strDnsAddress_address_get.isEmpty()) {
                                zA &= tunBuilder.tun_builder_add_dns_server(strDnsAddress_address_get, strDnsAddress_address_get.contains(":"));
                            }
                        }
                    }
                    long jDnsServer_domains_get = ovpncliJNI.DnsServer_domains_get(dnsServer.a, dnsServer);
                    DnsOptions_DomainsList dnsOptions_DomainsList = jDnsServer_domains_get == 0 ? null : new DnsOptions_DomainsList(jDnsServer_domains_get, false);
                    if (dnsOptions_DomainsList != null) {
                        zA &= a(tunBuilder, dnsOptions_DomainsList);
                    }
                }
            }
        }
        long jDnsOptions_search_domains_get = ovpncliJNI.DnsOptions_search_domains_get(dnsOptions.a, dnsOptions);
        DnsOptions_DomainsList dnsOptions_DomainsList2 = jDnsOptions_search_domains_get != 0 ? new DnsOptions_DomainsList(jDnsOptions_search_domains_get, false) : null;
        return dnsOptions_DomainsList2 != null ? a(tunBuilder, dnsOptions_DomainsList2) & zA : zA;
    }

    @Override // net.openvpn.openvpn.ClientAPI_TunBuilderBase
    public final boolean tun_builder_set_mtu(int i) {
        TunBuilder tunBuilder = this.e;
        if (tunBuilder != null) {
            return tunBuilder.tun_builder_set_mtu(i);
        }
        return false;
    }

    @Override // net.openvpn.openvpn.ClientAPI_TunBuilderBase
    public final boolean tun_builder_set_remote_address(String str, boolean z) {
        TunBuilder tunBuilder = this.e;
        if (tunBuilder != null) {
            return tunBuilder.tun_builder_set_remote_address(str, z);
        }
        return false;
    }

    @Override // net.openvpn.openvpn.ClientAPI_TunBuilderBase
    public final boolean tun_builder_set_session_name(String str) {
        TunBuilder tunBuilder = this.e;
        if (tunBuilder != null) {
            return tunBuilder.tun_builder_set_session_name(str);
        }
        return false;
    }

    @Override // net.openvpn.openvpn.ClientAPI_TunBuilderBase
    public final void tun_builder_teardown(boolean z) {
        TunBuilder tunBuilder = this.e;
        if (tunBuilder != null) {
            tunBuilder.tun_builder_teardown(z);
        }
    }

    @Override // net.openvpn.openvpn.ClientAPI_OpenVPNClient
    public final void acc_event(ClientAPI_AppCustomControlMessageEvent clientAPI_AppCustomControlMessageEvent) {
    }

    @Override // net.openvpn.openvpn.ClientAPI_OpenVPNClient
    public final void remote_override(ClientAPI_RemoteOverride clientAPI_RemoteOverride) {
    }
}
