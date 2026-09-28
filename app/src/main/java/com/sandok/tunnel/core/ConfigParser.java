package com.sandok.tunnel.core;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.util.Pair;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ec1;
import defpackage.hz;
import defpackage.vh;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ConfigParser {
    public static final String CONVERTED_PROFILE = "converted Profile";
    private String auth_user_pass_file;
    private HashMap<String, Vector<Vector<String>>> options = new HashMap<>();
    private HashMap<String, Vector<String>> meta = new HashMap<>();
    final String[] unsupportedOptions = {"config", "tls-server"};
    final String[] ignoreOptions = {"tls-client", "askpass", "auth-nocache", "up", "down", "route-up", "ipchange", "route-up", "route-pre-down", "auth-user-pass-verify", "block-outside-dns", "dhcp-release", "dhcp-renew", "dh", "group", "allow-recursive-routing", "ip-win32", "management-hold", "management", "management-client", "management-query-remote", "management-query-passwords", "management-query-proxy", "management-external-key", "management-forget-disconnect", "management-signal", "management-log-cache", "management-up-down", "management-client-user", "management-client-group", "pause-exit", "plugin", "machine-readable-output", "persist-key", "push", "register-dns", "route-delay", "route-gateway", "route-metric", "route-method", "status", "script-security", "show-net-up", "suppress-timestamps", "tmp-dir", "tun-ipv6", "topology", "user", "win-sys"};
    final String[][] ignoreOptionsWithArg = {new String[]{"setenv", "IV_GUI_VER"}, new String[]{"setenv", "IV_OPENVPN_GUI_VERSION"}, new String[]{"engine", "dynamic"}, new String[]{"setenv", "CLIENT_CERT"}};
    final String[] connectionOptions = {"local", "remote", TypedValues.Custom.S_FLOAT, "port", "connect-retry", "connect-timeout", "connect-retry-max", "link-mtu", "tun-mtu", "tun-mtu-extra", "fragment", "mtu-disc", "local-port", "remote-port", "bind", "nobind", "proto", "http-proxy", "http-proxy-retry", "http-proxy-timeout", "http-proxy-option", "socks-proxy", "socks-proxy-retry", "explicit-exit-notify", "mssfix"};

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class ConfigParseError extends Exception {
        private static final long serialVersionUID = -60;

        public ConfigParseError(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public enum linestate {
        initial,
        readin_single_quote,
        reading_quoted,
        reading_unquoted,
        done
    }

    private void checkIgnoreAndInvalidOptions(VpnProfile vpnProfile) throws ConfigParseError {
        for (String str : this.unsupportedOptions) {
            if (this.options.containsKey(str)) {
                throw new ConfigParseError(vh.m("Unsupported Option ", str, " encountered in config file. Aborting"));
            }
        }
        for (String str2 : this.ignoreOptions) {
            this.options.remove(str2);
        }
        if (this.options.size() > 0) {
            vpnProfile.mCustomConfigOptions = "# These options found in the config file do not map to config settings:\n" + vpnProfile.mCustomConfigOptions;
            Iterator<Vector<Vector<String>>> it = this.options.values().iterator();
            while (it.hasNext()) {
                vpnProfile.mCustomConfigOptions += getOptionStrings(it.next());
            }
            vpnProfile.mUseCustomConfig = true;
        }
    }

    private void checkRedirectParameters(VpnProfile vpnProfile, Vector<Vector<String>> vector) {
        for (Vector<String> vector2 : vector) {
            for (int i = 1; i < vector2.size(); i++) {
                if (vector2.get(i).equals("block-local")) {
                    vpnProfile.mAllowLocalLAN = false;
                } else if (vector2.get(i).equals("unblock-local")) {
                    vpnProfile.mAllowLocalLAN = true;
                }
            }
        }
    }

    private void checkinlinefile(Vector<String> vector, BufferedReader bufferedReader) throws ConfigParseError, IOException {
        String strTrim = vector.get(0).trim();
        if (!strTrim.startsWith("<") || !strTrim.endsWith(">")) {
            return;
        }
        String strSubstring = strTrim.substring(1, strTrim.length() - 1);
        String strM = vh.m("</", strSubstring, ">");
        String strSubstring2 = VpnProfile.INLINE_TAG;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                throw new ConfigParseError(ec1.L("No endtag </", strSubstring, "> for starttag <", strSubstring, "> found"));
            }
            if (line.trim().equals(strM)) {
                if (strSubstring2.endsWith("\n")) {
                    strSubstring2 = strSubstring2.substring(0, strSubstring2.length() - 1);
                }
                vector.clear();
                vector.add(strSubstring);
                vector.add(strSubstring2);
                return;
            }
            strSubstring2 = strSubstring2.concat(line).concat("\n");
        }
    }

    private void fixup(VpnProfile vpnProfile) {
        if (vpnProfile.mRemoteCN.equals(vpnProfile.mServerName)) {
            vpnProfile.mRemoteCN = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    private Vector<Vector<String>> getAllOption(String str, int i, int i2) throws ConfigParseError {
        Vector<Vector<String>> vector = this.options.get(str);
        if (vector == null) {
            return null;
        }
        for (Vector<String> vector2 : vector) {
            if (vector2.size() < i + 1 || vector2.size() > i2 + 1) {
                throw new ConfigParseError(String.format(Locale.getDefault(), "Option %s has %d parameters, expected between %d and %d", str, Integer.valueOf(vector2.size() - 1), Integer.valueOf(i), Integer.valueOf(i2)));
            }
        }
        this.options.remove(str);
        return vector;
    }

    private Vector<String> getOption(String str, int i, int i2) throws ConfigParseError {
        Vector<Vector<String>> allOption = getAllOption(str, i, i2);
        if (allOption == null) {
            return null;
        }
        return allOption.lastElement();
    }

    private String getOptionStrings(Vector<Vector<String>> vector) {
        String strT = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        for (Vector<String> vector2 : vector) {
            if (!ignoreThisOption(vector2)) {
                if (vector2.size() == 2 && ("extra-certs".equals(vector2.get(0)) || "http-proxy-user-pass".equals(vector2.get(0)))) {
                    StringBuilder sbY = hz.y(strT);
                    sbY.append(VpnProfile.insertFileData(vector2.get(0), vector2.get(1)));
                    strT = sbY.toString();
                } else {
                    for (String str : vector2) {
                        StringBuilder sbY2 = hz.y(strT);
                        sbY2.append(VpnProfile.openVpnEscape(str));
                        sbY2.append(" ");
                        strT = sbY2.toString();
                    }
                    strT = hz.t(strT, "\n");
                }
            }
        }
        return strT;
    }

    private boolean isUdpProto(String str) throws ConfigParseError {
        if (str.equals("udp") || str.equals("udp6")) {
            return true;
        }
        if (str.equals("tcp-client") || str.equals("tcp") || str.equals("tcp6") || str.endsWith("tcp6-client")) {
            return false;
        }
        throw new ConfigParseError("Unsupported option to --proto ".concat(str));
    }

    private Pair<Connection, Connection[]> parseConnection(String str, Connection connection) throws ConfigParseError, IOException {
        ConfigParser configParser = new ConfigParser();
        configParser.parseConfig(new StringReader(str.substring(10)));
        return configParser.parseConnectionOptions(connection);
    }

    private Pair<Connection, Connection[]> parseConnectionOptions(Connection connection) throws ConfigParseError {
        Connection connectionM15clone;
        if (connection != null) {
            try {
                connectionM15clone = connection.m15clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            connectionM15clone = new Connection();
        }
        Vector<String> option = getOption("port", 1, 1);
        if (option != null) {
            connectionM15clone.mServerPort = option.get(1);
        }
        Vector<String> option2 = getOption("rport", 1, 1);
        if (option2 != null) {
            connectionM15clone.mServerPort = option2.get(1);
        }
        Vector<String> option3 = getOption("proto", 1, 1);
        if (option3 != null) {
            connectionM15clone.mUseUdp = isUdpProto(option3.get(1));
        }
        Vector<String> option4 = getOption("connect-timeout", 1, 1);
        int i = 0;
        if (option4 != null) {
            try {
                connectionM15clone.mConnectTimeout = Integer.parseInt(option4.get(1));
            } catch (NumberFormatException e2) {
                throw new ConfigParseError(String.format("Argument to connect-timeout (%s) must to be an integer: %s", option4.get(1), e2.getLocalizedMessage()));
            }
        }
        Vector<Vector<String>> allOption = getAllOption("remote", 1, 3);
        if (connection != null) {
            Iterator<Vector<Vector<String>>> it = this.options.values().iterator();
            while (it.hasNext()) {
                connectionM15clone.mCustomConfiguration += getOptionStrings(it.next());
            }
            if (!TextUtils.isEmpty(connectionM15clone.mCustomConfiguration)) {
                connectionM15clone.mUseCustomConfig = true;
            }
        }
        if (allOption == null) {
            allOption = new Vector<>();
        }
        Connection[] connectionArr = new Connection[allOption.size()];
        for (Vector<String> vector : allOption) {
            try {
                connectionArr[i] = connectionM15clone.m15clone();
            } catch (CloneNotSupportedException e3) {
                e3.printStackTrace();
            }
            int size = vector.size();
            if (size == 2) {
                connectionArr[i].mServerName = vector.get(1);
            } else {
                if (size != 3) {
                    if (size == 4) {
                        connectionArr[i].mUseUdp = isUdpProto(vector.get(3));
                    }
                }
                connectionArr[i].mServerPort = vector.get(2);
                connectionArr[i].mServerName = vector.get(1);
            }
            i++;
        }
        return new Pair<>(connectionM15clone, connectionArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0057 A[PHI: r1
      0x0057: PHI (r1v9 com.sandok.tunnel.core.ConfigParser$linestate) = 
      (r1v2 com.sandok.tunnel.core.ConfigParser$linestate)
      (r1v2 com.sandok.tunnel.core.ConfigParser$linestate)
      (r1v2 com.sandok.tunnel.core.ConfigParser$linestate)
      (r1v2 com.sandok.tunnel.core.ConfigParser$linestate)
      (r1v2 com.sandok.tunnel.core.ConfigParser$linestate)
      (r1v12 com.sandok.tunnel.core.ConfigParser$linestate)
     binds: [B:46:0x0077, B:41:0x006c, B:42:0x006e, B:35:0x005d, B:37:0x0063, B:31:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0088 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Vector<java.lang.String> parseline(java.lang.String r15) throws com.sandok.tunnel.core.ConfigParser.ConfigParseError {
        /*
            r14 = this;
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            int r1 = r15.length()
            if (r1 != 0) goto Ld
            goto Lb8
        Ld:
            com.sandok.tunnel.core.ConfigParser$linestate r1 = com.sandok.tunnel.core.ConfigParser.linestate.initial
            java.lang.String r2 = ""
            r3 = 0
            r7 = r2
            r4 = r3
            r5 = r4
            r6 = r5
        L16:
            int r8 = r15.length()
            if (r4 >= r8) goto L21
            char r8 = r15.charAt(r4)
            goto L22
        L21:
            r8 = r3
        L22:
            r9 = 92
            if (r5 != 0) goto L2f
            if (r8 != r9) goto L2f
            com.sandok.tunnel.core.ConfigParser$linestate r10 = com.sandok.tunnel.core.ConfigParser.linestate.readin_single_quote
            if (r1 == r10) goto L2f
            r5 = 1
            goto L9f
        L2f:
            com.sandok.tunnel.core.ConfigParser$linestate r10 = com.sandok.tunnel.core.ConfigParser.linestate.initial
            r11 = 39
            r12 = 34
            if (r1 != r10) goto L59
            boolean r13 = r14.space(r8)
            if (r13 != 0) goto L7b
            r1 = 59
            if (r8 == r1) goto Lb8
            r1 = 35
            if (r8 != r1) goto L47
            goto Lb8
        L47:
            if (r5 != 0) goto L4e
            if (r8 != r12) goto L4e
            com.sandok.tunnel.core.ConfigParser$linestate r1 = com.sandok.tunnel.core.ConfigParser.linestate.reading_quoted
            goto L7b
        L4e:
            if (r5 != 0) goto L55
            if (r8 != r11) goto L55
            com.sandok.tunnel.core.ConfigParser$linestate r1 = com.sandok.tunnel.core.ConfigParser.linestate.readin_single_quote
            goto L7b
        L55:
            com.sandok.tunnel.core.ConfigParser$linestate r1 = com.sandok.tunnel.core.ConfigParser.linestate.reading_unquoted
        L57:
            r6 = r8
            goto L7b
        L59:
            com.sandok.tunnel.core.ConfigParser$linestate r13 = com.sandok.tunnel.core.ConfigParser.linestate.reading_unquoted
            if (r1 != r13) goto L68
            if (r5 != 0) goto L57
            boolean r11 = r14.space(r8)
            if (r11 == 0) goto L57
            com.sandok.tunnel.core.ConfigParser$linestate r1 = com.sandok.tunnel.core.ConfigParser.linestate.done
            goto L7b
        L68:
            com.sandok.tunnel.core.ConfigParser$linestate r13 = com.sandok.tunnel.core.ConfigParser.linestate.reading_quoted
            if (r1 != r13) goto L73
            if (r5 != 0) goto L57
            if (r8 != r12) goto L57
            com.sandok.tunnel.core.ConfigParser$linestate r1 = com.sandok.tunnel.core.ConfigParser.linestate.done
            goto L7b
        L73:
            com.sandok.tunnel.core.ConfigParser$linestate r13 = com.sandok.tunnel.core.ConfigParser.linestate.readin_single_quote
            if (r1 != r13) goto L7b
            if (r8 != r11) goto L57
            com.sandok.tunnel.core.ConfigParser$linestate r1 = com.sandok.tunnel.core.ConfigParser.linestate.done
        L7b:
            com.sandok.tunnel.core.ConfigParser$linestate r8 = com.sandok.tunnel.core.ConfigParser.linestate.done
            if (r1 != r8) goto L85
            r0.add(r7)
            r7 = r2
            r6 = r3
            goto L86
        L85:
            r10 = r1
        L86:
            if (r5 == 0) goto L9d
            if (r6 == 0) goto L9d
            if (r6 == r9) goto L9d
            if (r6 == r12) goto L9d
            boolean r1 = r14.space(r6)
            if (r1 == 0) goto L95
            goto L9d
        L95:
            com.sandok.tunnel.core.ConfigParser$ConfigParseError r14 = new com.sandok.tunnel.core.ConfigParser$ConfigParseError
            java.lang.String r15 = "Options warning: Bad backslash ('\\') usage"
            r14.<init>(r15)
            throw r14
        L9d:
            r5 = r3
            r1 = r10
        L9f:
            if (r6 == 0) goto Lb0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r6)
            java.lang.String r7 = r8.toString()
        Lb0:
            int r8 = r4 + 1
            int r9 = r15.length()
            if (r4 < r9) goto Lb9
        Lb8:
            return r0
        Lb9:
            r4 = r8
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sandok.tunnel.core.ConfigParser.parseline(java.lang.String):java.util.Vector");
    }

    private Vector<String> parsemeta(String str) {
        String[] strArrSplit = str.split("#\\sOVPN_ACCESS_SERVER_", 2)[1].split("=", 2);
        Vector<String> vector = new Vector<>();
        Collections.addAll(vector, strArrSplit);
        return vector;
    }

    private boolean space(char c) {
        return Character.isWhitespace(c) || c == 0;
    }

    public static void useEmbbedUserAuth(VpnProfile vpnProfile, String str) {
        String[] strArrSplit = VpnProfile.getEmbeddedContent(str).split("\n");
        if (strArrSplit.length >= 2) {
            vpnProfile.mUsername = strArrSplit[0];
            vpnProfile.mPassword = strArrSplit[1];
        }
    }

    public VpnProfile convertProfile() throws ConfigParseError, IOException {
        boolean z;
        boolean z2;
        VpnProfile vpnProfile = new VpnProfile(CONVERTED_PROFILE);
        vpnProfile.clearDefaults();
        if (this.options.containsKey("client") || this.options.containsKey("pull")) {
            vpnProfile.mUsePull = true;
            this.options.remove("pull");
            this.options.remove("client");
        }
        Vector<String> option = getOption("secret", 1, 2);
        int i = 3;
        if (option != null) {
            vpnProfile.mAuthenticationType = 4;
            vpnProfile.mUseTLSAuth = true;
            vpnProfile.mTLSAuthFilename = option.get(1);
            if (option.size() == 3) {
                vpnProfile.mTLSAuthDirection = option.get(2);
            }
            z = false;
        } else {
            z = true;
        }
        Vector<Vector<String>> allOption = getAllOption("route", 1, 4);
        String strS = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (allOption != null) {
            String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            String str2 = str;
            for (Vector<String> vector : allOption) {
                String str3 = vector.size() >= i ? vector.get(2) : "255.255.255.255";
                String str4 = vector.size() >= 4 ? vector.get(i) : "vpn_gateway";
                try {
                    CIDRIP cidrip = new CIDRIP(vector.get(1), str3);
                    if (str4.equals("net_gateway")) {
                        str2 = str2 + cidrip.toString() + " ";
                    } else {
                        str = str + cidrip.toString() + " ";
                    }
                    i = 3;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new ConfigParseError(vh.l("Could not parse netmask of route ", str3));
                } catch (NumberFormatException unused2) {
                    throw new ConfigParseError(vh.l("Could not parse netmask of route ", str3));
                }
            }
            vpnProfile.mCustomRoutes = str;
            vpnProfile.mExcludedRoutes = str2;
        }
        Vector<Vector<String>> allOption2 = getAllOption("route-ipv6", 1, 4);
        if (allOption2 != null) {
            Iterator<Vector<String>> it = allOption2.iterator();
            while (it.hasNext()) {
                strS = vh.s(new StringBuilder(strS), it.next().get(1), " ");
            }
            vpnProfile.mCustomRoutesv6 = strS;
        }
        if (getOption("route-nopull", 1, 1) != null) {
            vpnProfile.mRoutenopull = true;
        }
        Vector<Vector<String>> allOption3 = getAllOption("tls-auth", 1, 2);
        if (allOption3 != null) {
            for (Vector<String> vector2 : allOption3) {
                if (vector2 != null) {
                    if (!vector2.get(1).equals("[inline]")) {
                        vpnProfile.mTLSAuthFilename = vector2.get(1);
                        vpnProfile.mUseTLSAuth = true;
                    }
                    if (vector2.size() == 3) {
                        vpnProfile.mTLSAuthDirection = vector2.get(2);
                    }
                }
            }
        }
        Vector<String> option2 = getOption("key-direction", 1, 1);
        if (option2 != null) {
            vpnProfile.mTLSAuthDirection = option2.get(1);
        }
        Vector<String> option3 = getOption("tls-crypt", 1, 1);
        if (option3 != null) {
            vpnProfile.mUseTLSAuth = true;
            vpnProfile.mTLSAuthFilename = option3.get(1);
            vpnProfile.mTLSAuthDirection = "tls-crypt";
        }
        Vector<Vector<String>> allOption4 = getAllOption("redirect-gateway", 0, 5);
        if (allOption4 != null) {
            vpnProfile.mUseDefaultRoute = true;
            checkRedirectParameters(vpnProfile, allOption4);
        }
        Vector<Vector<String>> allOption5 = getAllOption("redirect-private", 0, 5);
        if (allOption5 != null) {
            checkRedirectParameters(vpnProfile, allOption5);
        }
        Vector<String> option4 = getOption("dev", 1, 1);
        Vector<String> option5 = getOption("dev-type", 1, 1);
        if ((option5 == null || !option5.get(1).equals("tun")) && ((option4 == null || !option4.get(1).startsWith("tun")) && !(option5 == null && option4 == null))) {
            throw new ConfigParseError("Sorry. Only tun mode is supported. See the FAQ for more detail");
        }
        Vector<String> option6 = getOption("mssfix", 0, 1);
        if (option6 != null) {
            if (option6.size() >= 2) {
                try {
                    vpnProfile.mMssFix = Integer.parseInt(option6.get(1));
                } catch (NumberFormatException unused3) {
                    throw new ConfigParseError("Argument to --mssfix has to be an integer");
                }
            } else {
                vpnProfile.mMssFix = 1450;
            }
        }
        Vector<String> option7 = getOption("mode", 1, 1);
        if (option7 != null && !option7.get(1).equals("p2p")) {
            throw new ConfigParseError("Invalid mode for --mode specified, need p2p");
        }
        Vector<Vector<String>> allOption6 = getAllOption("dhcp-option", 2, 2);
        if (allOption6 != null) {
            for (Vector<String> vector3 : allOption6) {
                String str5 = vector3.get(1);
                String str6 = vector3.get(2);
                if (str5.equals("DOMAIN")) {
                    vpnProfile.mSearchDomain = vector3.get(2);
                } else if (str5.equals("DNS")) {
                    vpnProfile.mOverrideDNS = true;
                    if (vpnProfile.mDNS1.equals(VpnProfile.DEFAULT_DNS1)) {
                        vpnProfile.mDNS1 = str6;
                    } else {
                        vpnProfile.mDNS2 = str6;
                    }
                }
            }
        }
        Vector<String> option8 = getOption("ifconfig", 2, 2);
        if (option8 != null) {
            try {
                vpnProfile.mIPv4Address = new CIDRIP(option8.get(1), option8.get(2)).toString();
            } catch (NumberFormatException e) {
                throw new ConfigParseError("Could not pase ifconfig IP address: " + e.getLocalizedMessage());
            }
        }
        if (getOption("remote-random-hostname", 0, 0) != null) {
            vpnProfile.mUseRandomHostname = true;
        }
        if (getOption(TypedValues.Custom.S_FLOAT, 0, 0) != null) {
            vpnProfile.mUseFloat = true;
        }
        if (getOption("comp-lzo", 0, 1) != null) {
            vpnProfile.mUseLzo = true;
        }
        Vector<String> option9 = getOption("cipher", 1, 1);
        if (option9 != null) {
            vpnProfile.mCipher = option9.get(1);
        }
        Vector<String> option10 = getOption("auth", 1, 1);
        if (option10 != null) {
            vpnProfile.mAuth = option10.get(1);
        }
        Vector<String> option11 = getOption("ca", 1, 1);
        if (option11 != null) {
            vpnProfile.mCaFilename = option11.get(1);
        }
        Vector<String> option12 = getOption("cert", 1, 1);
        if (option12 != null) {
            vpnProfile.mClientCertFilename = option12.get(1);
            vpnProfile.mAuthenticationType = 0;
            z = false;
        }
        Vector<String> option13 = getOption("key", 1, 1);
        if (option13 != null) {
            vpnProfile.mClientKeyFilename = option13.get(1);
        }
        Vector<String> option14 = getOption("pkcs12", 1, 1);
        if (option14 != null) {
            vpnProfile.mPKCS12Filename = option14.get(1);
            vpnProfile.mAuthenticationType = 2;
            z = false;
        }
        if (getOption("cryptoapicert", 1, 1) != null) {
            vpnProfile.mAuthenticationType = 2;
            z = false;
        }
        Vector<String> option15 = getOption("compat-names", 1, 2);
        Vector<String> option16 = getOption("no-name-remapping", 1, 1);
        Vector<String> option17 = getOption("tls-remote", 1, 1);
        if (option17 != null) {
            vpnProfile.mRemoteCN = option17.get(1);
            vpnProfile.mCheckRemoteCN = true;
            vpnProfile.mX509AuthType = 0;
            if ((option15 != null && option15.size() > 2) || option16 != null) {
                vpnProfile.mX509AuthType = 1;
            }
        }
        Vector<String> option18 = getOption("verify-x509-name", 1, 2);
        if (option18 != null) {
            vpnProfile.mRemoteCN = option18.get(1);
            vpnProfile.mCheckRemoteCN = true;
            if (option18.size() <= 2) {
                vpnProfile.mX509AuthType = 2;
            } else if (option18.get(2).equals("name")) {
                vpnProfile.mX509AuthType = 3;
            } else if (option18.get(2).equals("subject")) {
                vpnProfile.mX509AuthType = 2;
            } else {
                if (!option18.get(2).equals("name-prefix")) {
                    throw new ConfigParseError("Unknown parameter to verify-x509-name: " + option18.get(2));
                }
                vpnProfile.mX509AuthType = 4;
            }
        }
        Vector<String> option19 = getOption("x509-username-field", 1, 1);
        if (option19 != null) {
            vpnProfile.mx509UsernameField = option19.get(1);
        }
        Vector<String> option20 = getOption("verb", 1, 1);
        if (option20 != null) {
            vpnProfile.mVerb = option20.get(1);
        }
        if (getOption("nobind", 0, 0) != null) {
            vpnProfile.mNobind = true;
        }
        if (getOption("persist-tun", 0, 0) != null) {
            vpnProfile.mPersistTun = true;
        }
        if (getOption("push-peer-info", 0, 0) != null) {
            vpnProfile.mPushPeerInfo = true;
        }
        Vector<String> option21 = getOption("connect-retry", 1, 2);
        if (option21 != null) {
            vpnProfile.mConnectRetry = option21.get(1);
            if (option21.size() > 2) {
                vpnProfile.mConnectRetryMaxTime = option21.get(2);
            }
        }
        Vector<String> option22 = getOption("connect-retry-max", 1, 1);
        if (option22 != null) {
            vpnProfile.mConnectRetryMax = option22.get(1);
        }
        Vector<Vector<String>> allOption7 = getAllOption("remote-cert-tls", 1, 1);
        if (allOption7 != null) {
            if (allOption7.get(0).get(1).equals("server")) {
                vpnProfile.mExpectTLSCert = true;
            } else {
                this.options.put("remotetls", allOption7);
            }
        }
        Vector<String> option23 = getOption("auth-user-pass", 0, 1);
        if (option23 != null) {
            if (z) {
                vpnProfile.mAuthenticationType = 3;
            } else {
                int i2 = vpnProfile.mAuthenticationType;
                if (i2 == 0) {
                    vpnProfile.mAuthenticationType = 5;
                } else if (i2 == 2) {
                    vpnProfile.mAuthenticationType = 7;
                }
            }
            if (option23.size() > 1) {
                if (!option23.get(1).startsWith(VpnProfile.INLINE_TAG)) {
                    this.auth_user_pass_file = option23.get(1);
                }
                vpnProfile.mUsername = null;
                useEmbbedUserAuth(vpnProfile, option23.get(1));
            }
        }
        Vector<String> option24 = getOption("crl-verify", 1, 2);
        if (option24 != null) {
            if (option24.size() == 3 && option24.get(2).equals("dir")) {
                vpnProfile.mCustomConfigOptions += TextUtils.join(" ", option24) + "\n";
            } else {
                vpnProfile.mCrlFilename = option24.get(1);
            }
        }
        Pair<Connection, Connection[]> connectionOptions = parseConnectionOptions(null);
        vpnProfile.mConnections = (Connection[]) connectionOptions.b;
        Vector<Vector<String>> allOption8 = getAllOption("connection", 1, 1);
        if (vpnProfile.mConnections.length > 0 && allOption8 != null) {
            throw new ConfigParseError("Using a <connection> block and --remote is not allowed.");
        }
        if (allOption8 != null) {
            vpnProfile.mConnections = new Connection[allOption8.size()];
            Iterator<Vector<String>> it2 = allOption8.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                Object obj = parseConnection(it2.next().get(1), (Connection) connectionOptions.a).b;
                if (((Connection[]) obj).length != 1) {
                    throw new ConfigParseError("A <connection> block must have exactly one remote");
                }
                vpnProfile.mConnections[i3] = ((Connection[]) obj)[0];
                i3++;
            }
        }
        if (getOption("remote-random", 0, 0) != null) {
            vpnProfile.mRemoteRandom = true;
        }
        Vector<String> option25 = getOption("proto-force", 1, 1);
        if (option25 != null) {
            String str7 = option25.get(1);
            if (str7.equals("udp")) {
                z2 = true;
            } else {
                if (!str7.equals("tcp")) {
                    throw new ConfigParseError(vh.m("Unknown protocol ", str7, " in proto-force"));
                }
                z2 = false;
            }
            for (Connection connection : vpnProfile.mConnections) {
                if (connection.mUseUdp == z2) {
                    connection.mEnabled = false;
                }
            }
        }
        Vector<String> vector4 = this.meta.get("FRIENDLY_NAME");
        if (vector4 != null && vector4.size() > 1) {
            vpnProfile.mName = vector4.get(1);
        }
        Vector<String> vector5 = this.meta.get("USERNAME");
        if (vector5 != null && vector5.size() > 1) {
            vpnProfile.mUsername = vector5.get(1);
        }
        checkIgnoreAndInvalidOptions(vpnProfile);
        fixup(vpnProfile);
        return vpnProfile;
    }

    public String getAuthUserPassFile() {
        return this.auth_user_pass_file;
    }

    public boolean ignoreThisOption(Vector<String> vector) {
        for (String[] strArr : this.ignoreOptionsWithArg) {
            if (vector.size() >= strArr.length) {
                boolean z = true;
                for (int i = 0; i < strArr.length; i++) {
                    if (!strArr[i].equals(vector.get(i))) {
                        z = false;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public void parseConfig(Reader reader) throws ConfigParseError, IOException {
        HashMap map = new HashMap();
        map.put("server-poll-timeout", "timeout-connect");
        BufferedReader bufferedReader = new BufferedReader(reader);
        int i = 0;
        while (true) {
            try {
                String line = bufferedReader.readLine();
                i++;
                if (line == null) {
                    return;
                }
                if (i == 1) {
                    if (line.startsWith("PK\u0003\u0004") || line.startsWith("PK\u0007\u00008")) {
                        break;
                    } else if (line.startsWith("\ufeff")) {
                        line = line.substring(1);
                    }
                }
                if (line.startsWith("# OVPN_ACCESS_SERVER_")) {
                    Vector<String> vector = parsemeta(line);
                    this.meta.put(vector.get(0), vector);
                } else {
                    Vector<String> vector2 = parseline(line);
                    if (vector2.size() != 0) {
                        if (vector2.get(0).startsWith("--")) {
                            vector2.set(0, vector2.get(0).substring(2));
                        }
                        checkinlinefile(vector2, bufferedReader);
                        String str = vector2.get(0);
                        if (map.get(str) != null) {
                            str = (String) map.get(str);
                        }
                        if (!this.options.containsKey(str)) {
                            this.options.put(str, new Vector<>());
                        }
                        this.options.get(str).add(vector2);
                    }
                }
            } catch (OutOfMemoryError e) {
                throw new ConfigParseError("File too large to parse: " + e.getLocalizedMessage());
            }
        }
        throw new ConfigParseError("Input looks like a ZIP Archive. Import is only possible for OpenVPN config files (.ovpn/.conf)");
    }
}
