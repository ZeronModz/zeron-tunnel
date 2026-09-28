package com.sandok.tunnel.core;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.Character;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Hashtable;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.util.io.pem.PemObject;
import org.spongycastle.util.io.pem.PemReader;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class X509Utils {
    public static String getCertificateFriendlyName(X509Certificate x509Certificate) {
        String name;
        X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
        byte[] encoded = subjectX500Principal.getEncoded();
        try {
            Class<?> cls = Class.forName("com.android.org.bouncycastle.asn1.x509.X509Name");
            Method method = cls.getMethod("getInstance", Object.class);
            Hashtable hashtable = (Hashtable) cls.getField("DefaultSymbols").get(cls);
            if (!hashtable.containsKey("1.2.840.113549.1.9.1")) {
                hashtable.put("1.2.840.113549.1.9.1", "eMail");
            }
            name = (String) cls.getMethod("toString", Boolean.TYPE, Hashtable.class).invoke(method.invoke(cls, encoded), Boolean.TRUE, hashtable);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            name = null;
        }
        if (name == null) {
            name = subjectX500Principal.getName();
        }
        String[] strArrSplit = name.split(",");
        for (int i = 0; i < strArrSplit.length; i++) {
            String str = strArrSplit[i];
            if (str.startsWith("1.2.840.113549.1.9.1=#16")) {
                strArrSplit[i] = "email=" + ia5decode(str.replace("1.2.840.113549.1.9.1=#16", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
            }
        }
        return TextUtils.join(",", strArrSplit);
    }

    public static String getCertificateValidityString(X509Certificate x509Certificate, Resources resources) {
        try {
            x509Certificate.checkValidity();
            long time = x509Certificate.getNotAfter().getTime() - new Date().getTime();
            return time > 7776000000L ? resources.getString(R.string.months_left, Long.valueOf(getMonthsDifference(r0, r8))) : time > 259200000 ? resources.getString(R.string.days_left, Long.valueOf(time / 86400000)) : resources.getString(R.string.hours_left, Long.valueOf(time / 3600000));
        } catch (CertificateExpiredException unused) {
            return "EXPIRED: ";
        } catch (CertificateNotYetValidException unused2) {
            return "NOT YET VALID: ";
        }
    }

    public static Certificate[] getCertificatesFromFile(String str) throws CertificateException, FileNotFoundException {
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        Vector vector = new Vector();
        if (!VpnProfile.isEmbedded(str)) {
            return new Certificate[]{certificateFactory.generateCertificate(new FileInputStream(str))};
        }
        int iIndexOf = str.indexOf("-----BEGIN CERTIFICATE-----");
        do {
            int iMax = Math.max(0, iIndexOf);
            vector.add(certificateFactory.generateCertificate(new ByteArrayInputStream(str.substring(iMax).getBytes())));
            iIndexOf = str.indexOf("-----BEGIN CERTIFICATE-----", iMax + 1);
        } while (iIndexOf > 0);
        return (Certificate[]) vector.toArray(new Certificate[vector.size()]);
    }

    public static int getMonthsDifference(Date date, Date date2) {
        return ((date2.getMonth() + (date2.getYear() * 12)) - (date.getMonth() + (date.getYear() * 12))) + 1;
    }

    private static String ia5decode(String str) {
        String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        for (int i = 1; i < str.length(); i += 2) {
            String strSubstring = str.substring(i - 1, i + 1);
            char c = (char) Integer.parseInt(strSubstring, 16);
            if (isPrintableChar(c)) {
                str2 = str2 + c;
            } else if (i != 1 || (c != 18 && c != 27)) {
                str2 = str2 + "\\x" + strSubstring;
            }
        }
        return str2;
    }

    public static boolean isPrintableChar(char c) {
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(c);
        return (Character.isISOControl(c) || unicodeBlockOf == null || unicodeBlockOf == Character.UnicodeBlock.SPECIALS) ? false : true;
    }

    public static PemObject readPemObjectFromFile(String str) throws IOException {
        PemReader pemReader = new PemReader(VpnProfile.isEmbedded(str) ? new StringReader(VpnProfile.getEmbeddedContent(str)) : new FileReader(new File(str)));
        PemObject pemObject = pemReader.readPemObject();
        pemReader.close();
        return pemObject;
    }

    public static String getCertificateFriendlyName(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            X509Certificate x509Certificate = (X509Certificate) getCertificatesFromFile(str)[0];
            return getCertificateValidityString(x509Certificate, context.getResources()) + getCertificateFriendlyName(x509Certificate);
        } catch (Exception unused) {
            return null;
        }
    }
}
