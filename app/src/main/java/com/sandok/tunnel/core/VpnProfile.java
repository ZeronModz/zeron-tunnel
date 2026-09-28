package com.sandok.tunnel.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.security.KeyChain;
import android.security.KeyChainException;
import android.text.TextUtils;
import android.util.Base64;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hz;
import defpackage.vh;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.UUID;
import java.util.Vector;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.spongycastle.util.io.pem.PemObject;
import org.spongycastle.util.io.pem.PemWriter;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class VpnProfile implements Serializable, Cloneable {
    public static final int CURRENT_PROFILE_VERSION = 6;
    public static String DEFAULT_DNS1 = "8.8.8.8";
    public static String DEFAULT_DNS2 = "8.8.4.4";
    public static final int DEFAULT_MSSFIX_SIZE = 1280;
    public static final String DISPLAYNAME_TAG = "[[NAME]]";
    public static final String EXTRA_PROFILEUUID = "de.blinkt.openvpn.profileUUID";
    public static final String INLINE_TAG = "[[INLINE]]";
    public static final int MAXLOGLEVEL = 4;
    public static final transient long MAX_EMBED_FILE_SIZE = 2097152;
    public static final int TYPE_CERTIFICATES = 0;
    public static final int TYPE_KEYSTORE = 2;
    public static final int TYPE_PKCS12 = 1;
    public static final int TYPE_STATICKEYS = 4;
    public static final int TYPE_USERPASS = 3;
    public static final int TYPE_USERPASS_CERTIFICATES = 5;
    public static final int TYPE_USERPASS_KEYSTORE = 7;
    public static final int TYPE_USERPASS_PKCS12 = 6;
    public static final int X509_VERIFY_TLSREMOTE = 0;
    public static final int X509_VERIFY_TLSREMOTE_COMPAT_NOREMAPPING = 1;
    public static final int X509_VERIFY_TLSREMOTE_DN = 2;
    public static final int X509_VERIFY_TLSREMOTE_RDN = 3;
    public static final int X509_VERIFY_TLSREMOTE_RDN_PREFIX = 4;
    public static final boolean mIsOpenVPN22 = false;
    private static final long serialVersionUID = 7085688938959334563L;
    public String mAlias;
    public boolean mAllowLocalLAN;
    public String mCaFilename;
    public String mClientCertFilename;
    public String mClientKeyFilename;
    public Connection[] mConnections;
    public String mCrlFilename;
    public String mCustomRoutes;
    public String mExcludedRoutes;
    public String mExcludedRoutesv6;
    public String mIPv4Address;
    public String mIPv6Address;
    public String mName;
    public String mPKCS12Filename;
    public String mPKCS12Password;
    private transient PrivateKey mPrivateKey;
    public String mProfileCreator;
    public String mTLSAuthFilename;
    public transient boolean profileDeleted = false;
    public int mAuthenticationType = 2;
    public String mTLSAuthDirection = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public boolean mUseLzo = true;
    public boolean mUseTLSAuth = false;
    public String mDNS1 = DEFAULT_DNS1;
    public String mDNS2 = DEFAULT_DNS2;
    public boolean mOverrideDNS = false;
    public String mSearchDomain = "blinkt.de";
    public boolean mUseDefaultRoute = true;
    public boolean mUsePull = true;
    public boolean mCheckRemoteCN = true;
    public boolean mExpectTLSCert = false;
    public String mRemoteCN = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public String mPassword = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public String mUsername = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public boolean mRoutenopull = false;
    public boolean mUseRandomHostname = false;
    public boolean mUseFloat = false;
    public boolean mUseCustomConfig = false;
    public String mCustomConfigOptions = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public String mVerb = "1";
    public String mCipher = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public boolean mNobind = false;
    public boolean mUseDefaultRoutev6 = true;
    public String mCustomRoutesv6 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public String mKeyPassword = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public boolean mPersistTun = false;
    public String mConnectRetryMax = "-1";
    public String mConnectRetry = "2";
    public String mConnectRetryMaxTime = "300";
    public boolean mUserEditable = true;
    public String mAuth = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public int mX509AuthType = 3;
    public String mx509UsernameField = null;
    public int mMssFix = 0;
    public boolean mRemoteRandom = false;
    public HashSet<String> mAllowedAppsVpn = new HashSet<>();
    public boolean mAllowedAppsVpnAreDisallowed = true;
    public boolean mPushPeerInfo = false;
    public int mVersion = 0;
    public String mServerName = "openvpn.example.com";
    public String mServerPort = "1194";
    public boolean mUseUdp = true;
    private UUID mUuid = UUID.randomUUID();
    private int mProfileVersion = 6;
    public long mLastUsed = System.currentTimeMillis();

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public class NoCertReturnedException extends Exception {
        public NoCertReturnedException(String str) {
            super(str);
        }
    }

    public VpnProfile(String str) {
        this.mConnections = new Connection[0];
        this.mName = str;
        this.mConnections = new Connection[]{new Connection()};
    }

    private String cidrToIPAndNetmask(String str) {
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length == 1) {
            strArrSplit = str.concat("/32").split("/");
        }
        if (strArrSplit.length != 2) {
            return null;
        }
        try {
            int i = Integer.parseInt(strArrSplit[1]);
            if (i >= 0 && i <= 32) {
                long j = 4294967295L << (32 - i);
                Locale locale = Locale.ENGLISH;
                StringBuilder sb = new StringBuilder();
                sb.append((4278190080L & j) >> 24);
                sb.append(".");
                sb.append((16711680 & j) >> 16);
                hz.G(sb, ".", (65280 & j) >> 8, ".");
                sb.append(j & 255);
                return vh.t(new StringBuilder(), strArrSplit[0], "  ", sb.toString());
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    private Collection<String> getCustomRoutes(String str) {
        Vector vector = new Vector();
        if (str != null) {
            for (String str2 : str.split("[\n \t]")) {
                if (!str2.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
                    String strCidrToIPAndNetmask = cidrToIPAndNetmask(str2);
                    if (strCidrToIPAndNetmask == null) {
                        break;
                    }
                    vector.add(strCidrToIPAndNetmask);
                }
            }
        }
        return vector;
    }

    private Collection<String> getCustomRoutesv6(String str) {
        Vector vector = new Vector();
        if (str != null) {
            for (String str2 : str.split("[\n \t]")) {
                if (!str2.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
                    vector.add(str2);
                }
            }
        }
        return vector;
    }

    public static String getDisplayName(String str) {
        return str.substring(8, str.indexOf(INLINE_TAG));
    }

    public static String getEmbeddedContent(String str) {
        return !str.contains(INLINE_TAG) ? str : str.substring(str.indexOf(INLINE_TAG) + 10);
    }

    public static String insertFileData(String str, String str2) {
        if (str2 == null) {
            return hz.t(str, " file missing in config profile\n");
        }
        if (isEmbedded(str2)) {
            String embeddedContent = getEmbeddedContent(str2);
            Locale locale = Locale.ENGLISH;
            return vh.s(hz.A("<", str, ">\n", embeddedContent, "\n</"), str, ">\n");
        }
        Locale locale2 = Locale.ENGLISH;
        return str + " " + openVpnEscape(str2) + "\n";
    }

    public static boolean isEmbedded(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(INLINE_TAG) || str.startsWith(DISPLAYNAME_TAG);
    }

    private void moveOptionsToConnection() {
        this.mConnections = new Connection[1];
        Connection connection = new Connection();
        connection.mServerName = this.mServerName;
        connection.mServerPort = this.mServerPort;
        connection.mUseUdp = this.mUseUdp;
        connection.mCustomConfiguration = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.mConnections[0] = connection;
    }

    public static String openVpnEscape(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n");
        return (!strReplace.equals(str) || strReplace.contains(" ") || strReplace.contains("#") || strReplace.contains(";") || strReplace.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) ? vh.f('\"', "\"", strReplace) : str;
    }

    public void checkForRestart(final Context context) {
        int i = this.mAuthenticationType;
        if ((i == 2 || i == 7) && this.mPrivateKey == null) {
            new Thread(new Runnable() { // from class: com.sandok.tunnel.core.VpnProfile.1
                @Override // java.lang.Runnable
                public void run() {
                    VpnProfile.this.getKeyStoreCertificates(context);
                }
            }).start();
        }
    }

    public int checkProfile(Context context) {
        String str;
        int i = this.mAuthenticationType;
        if (i == 2 || i == 7) {
            if (this.mAlias == null) {
                return R.string.no_keystore_cert_selected;
            }
        } else if ((i == 0 || i == 5) && TextUtils.isEmpty(this.mCaFilename)) {
            return R.string.no_ca_cert_selected;
        }
        if (this.mCheckRemoteCN && this.mX509AuthType == 0) {
            return R.string.deprecated_tls_remote;
        }
        if ((!this.mUsePull || this.mAuthenticationType == 4) && ((str = this.mIPv4Address) == null || cidrToIPAndNetmask(str) == null)) {
            return R.string.ipv4_format_error;
        }
        if (!this.mUseDefaultRoute) {
            if (!TextUtils.isEmpty(this.mCustomRoutes) && getCustomRoutes(this.mCustomRoutes).size() == 0) {
                return R.string.custom_route_format_error;
            }
            if (!TextUtils.isEmpty(this.mExcludedRoutes) && getCustomRoutes(this.mExcludedRoutes).size() == 0) {
                return R.string.custom_route_format_error;
            }
        }
        if (this.mUseTLSAuth && TextUtils.isEmpty(this.mTLSAuthFilename)) {
            return R.string.missing_tlsauth;
        }
        int i2 = this.mAuthenticationType;
        if ((i2 == 5 || i2 == 0) && (TextUtils.isEmpty(this.mClientCertFilename) || TextUtils.isEmpty(this.mClientKeyFilename))) {
            return R.string.missing_certificates;
        }
        int i3 = this.mAuthenticationType;
        if ((i3 == 0 || i3 == 5) && TextUtils.isEmpty(this.mCaFilename)) {
            return R.string.missing_ca_certificate;
        }
        boolean z = true;
        for (Connection connection : this.mConnections) {
            if (connection.mEnabled) {
                z = false;
            }
        }
        return z ? R.string.remote_no_server_selected : R.string.no_error_found;
    }

    public void clearDefaults() {
        this.mServerName = "unknown";
        this.mUsePull = false;
        this.mUseLzo = false;
        this.mUseDefaultRoute = false;
        this.mUseDefaultRoutev6 = false;
        this.mExpectTLSCert = false;
        this.mCheckRemoteCN = false;
        this.mPersistTun = false;
        this.mAllowLocalLAN = true;
        this.mPushPeerInfo = false;
        this.mMssFix = 0;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public VpnProfile m16clone() throws CloneNotSupportedException {
        VpnProfile vpnProfile = (VpnProfile) super.clone();
        vpnProfile.mUuid = UUID.randomUUID();
        vpnProfile.mConnections = new Connection[this.mConnections.length];
        Connection[] connectionArr = this.mConnections;
        int length = connectionArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            vpnProfile.mConnections[i2] = connectionArr[i].m15clone();
            i++;
            i2++;
        }
        vpnProfile.mAllowedAppsVpn = (HashSet) this.mAllowedAppsVpn.clone();
        return vpnProfile;
    }

    public VpnProfile copy(String str) {
        try {
            VpnProfile vpnProfileM16clone = m16clone();
            vpnProfileM16clone.mName = str;
            return vpnProfileM16clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof VpnProfile) {
            return this.mUuid.equals(((VpnProfile) obj).mUuid);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getConfigFile(android.content.Context r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 1438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sandok.tunnel.core.VpnProfile.getConfigFile(android.content.Context, boolean):java.lang.String");
    }

    public synchronized String[] getKeyStoreCertificates(Context context, int i) {
        String string;
        String string2;
        String str;
        try {
            Context applicationContext = context.getApplicationContext();
            try {
                try {
                    this.mPrivateKey = KeyChain.getPrivateKey(applicationContext, this.mAlias);
                    X509Certificate[] certificateChain = KeyChain.getCertificateChain(applicationContext, this.mAlias);
                    if (certificateChain == null) {
                        throw new NoCertReturnedException("No certificate returned from Keystore");
                    }
                    if (certificateChain.length > 1 || !TextUtils.isEmpty(this.mCaFilename)) {
                        StringWriter stringWriter = new StringWriter();
                        PemWriter pemWriter = new PemWriter(stringWriter);
                        for (int i2 = 1; i2 < certificateChain.length; i2++) {
                            pemWriter.writeObject(new PemObject("CERTIFICATE", certificateChain[i2].getEncoded()));
                        }
                        pemWriter.close();
                        string = stringWriter.toString();
                    } else {
                        string = null;
                    }
                    if (TextUtils.isEmpty(this.mCaFilename)) {
                        string2 = null;
                    } else {
                        try {
                            Certificate[] certificatesFromFile = X509Utils.getCertificatesFromFile(this.mCaFilename);
                            StringWriter stringWriter2 = new StringWriter();
                            PemWriter pemWriter2 = new PemWriter(stringWriter2);
                            for (Certificate certificate : certificatesFromFile) {
                                pemWriter2.writeObject(new PemObject("CERTIFICATE", certificate.getEncoded()));
                            }
                            pemWriter2.close();
                            string2 = stringWriter2.toString();
                        } catch (Exception unused) {
                            string2 = null;
                        }
                    }
                    StringWriter stringWriter3 = new StringWriter();
                    if (certificateChain.length >= 1) {
                        X509Certificate x509Certificate = certificateChain[0];
                        PemWriter pemWriter3 = new PemWriter(stringWriter3);
                        pemWriter3.writeObject(new PemObject("CERTIFICATE", x509Certificate.getEncoded()));
                        pemWriter3.close();
                    }
                    String string3 = stringWriter3.toString();
                    if (string2 == null) {
                        str = null;
                    } else {
                        String str2 = string2;
                        str = string;
                        string = str2;
                    }
                    return new String[]{string, str, string3};
                } catch (AssertionError unused2) {
                    if (i == 0) {
                        return null;
                    }
                    try {
                        Thread.sleep(3000L);
                    } catch (InterruptedException unused3) {
                    }
                    return getKeyStoreCertificates(applicationContext, i - 1);
                }
            } catch (KeyChainException e) {
                e = e;
                e.printStackTrace();
                return null;
            } catch (NoCertReturnedException e2) {
                e = e2;
                e.printStackTrace();
                return null;
            } catch (IOException e3) {
                e = e3;
                e.printStackTrace();
                return null;
            } catch (IllegalArgumentException e4) {
                e = e4;
                e.printStackTrace();
                return null;
            } catch (InterruptedException e5) {
                e = e5;
                e.printStackTrace();
                return null;
            } catch (CertificateException e6) {
                e = e6;
                e.printStackTrace();
                return null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public PrivateKey getKeystoreKey() {
        return this.mPrivateKey;
    }

    public String getName() {
        String str = this.mName;
        return str == null ? "No profile name" : str;
    }

    public String getPasswordAuth() {
        String authPassword = PasswordCache.getAuthPassword(this.mUuid, true);
        return authPassword != null ? authPassword : this.mPassword;
    }

    public String getPasswordPrivateKey() {
        String pKCS12orCertificatePassword = PasswordCache.getPKCS12orCertificatePassword(this.mUuid, true);
        if (pKCS12orCertificatePassword != null) {
            return pKCS12orCertificatePassword;
        }
        int i = this.mAuthenticationType;
        if (i != 0) {
            if (i != 1) {
                if (i != 5) {
                    if (i != 6) {
                        return null;
                    }
                }
            }
            return this.mPKCS12Password;
        }
        return this.mKeyPassword;
    }

    public String getSignedData(String str) {
        PrivateKey keystoreKey = getKeystoreKey();
        byte[] bArrDecode = Base64.decode(str, 0);
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
            cipher.init(1, keystoreKey);
            return Base64.encodeToString(cipher.doFinal(bArrDecode), 2);
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            return null;
        }
    }

    public UUID getUUID() {
        return this.mUuid;
    }

    public String getUUIDString() {
        return this.mUuid.toString();
    }

    public String getVersionEnvString(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "unknown";
        }
        Locale locale = Locale.US;
        return context.getPackageName() + " " + str;
    }

    public boolean isUserPWAuth() {
        int i = this.mAuthenticationType;
        return i == 3 || i == 5 || i == 6 || i == 7;
    }

    public int needUserPWInput(String str, String str2) {
        String str3;
        int i = this.mAuthenticationType;
        if ((i == 1 || i == 6) && (((str3 = this.mPKCS12Password) == null || str3.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) && str == null)) {
            return R.string.pkcs12_file_encryption_key;
        }
        int i2 = this.mAuthenticationType;
        if ((i2 == 0 || i2 == 5) && requireTLSKeyPassword() && TextUtils.isEmpty(this.mKeyPassword) && str == null) {
            return R.string.private_key_password;
        }
        if (!isUserPWAuth()) {
            return 0;
        }
        if (TextUtils.isEmpty(this.mUsername)) {
            return R.string.password;
        }
        if (TextUtils.isEmpty(this.mPassword) && str2 == null) {
            return R.string.password;
        }
        return 0;
    }

    public boolean requireTLSKeyPassword() {
        String str;
        if (TextUtils.isEmpty(this.mClientKeyFilename)) {
            return false;
        }
        if (isEmbedded(this.mClientKeyFilename)) {
            str = this.mClientKeyFilename;
        } else {
            char[] cArr = new char[2048];
            try {
                FileReader fileReader = new FileReader(this.mClientKeyFilename);
                String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                for (int i = fileReader.read(cArr); i > 0; i = fileReader.read(cArr)) {
                    str2 = str2 + new String(cArr, 0, i);
                }
                fileReader.close();
                str = str2;
            } catch (FileNotFoundException | IOException unused) {
            }
        }
        return str.contains("Proc-Type: 4,ENCRYPTED") || str.contains("-----BEGIN ENCRYPTED PRIVATE KEY-----");
    }

    public String toString() {
        return this.mName;
    }

    public void upgradeProfile() {
        int i = this.mProfileVersion;
        if (i < 2) {
            this.mAllowLocalLAN = false;
        }
        if (i < 4) {
            moveOptionsToConnection();
            this.mAllowedAppsVpnAreDisallowed = true;
        }
        if (this.mAllowedAppsVpn == null) {
            this.mAllowedAppsVpn = new HashSet<>();
        }
        if (this.mConnections == null) {
            this.mConnections = new Connection[0];
        }
        if (this.mProfileVersion < 6 && TextUtils.isEmpty(this.mProfileCreator)) {
            this.mUserEditable = true;
        }
        this.mProfileVersion = 6;
    }

    public String[] getKeyStoreCertificates(Context context) {
        return getKeyStoreCertificates(context, 5);
    }
}
