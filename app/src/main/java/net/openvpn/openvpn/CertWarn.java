package net.openvpn.openvpn;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog$Builder;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class CertWarn implements DialogInterface.OnCancelListener, DialogInterface.OnClickListener {
    public CertWarn(Context context, X509Certificate x509Certificate, String str) {
        a aVar = new a(this);
        try {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
            AlertController.AlertParams alertParams = alertDialog$Builder.a;
            alertParams.e = alertParams.a.getText(R.string.cert_warn_title);
            alertParams.r = c(context, x509Certificate, str);
            alertDialog$Builder.d(R.string.cert_warn_accept, this);
            alertDialog$Builder.c(R.string.cert_warn_reject, this);
            alertParams.m = this;
            alertDialog$Builder.a().show();
        } catch (Exception unused) {
            new Handler().postDelayed(aVar, 0L);
        }
    }

    public static final String b(byte[] bArr) {
        if (bArr == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < bArr.length) {
            sb.append(String.format("%02X", Byte.valueOf(bArr[i])));
            i++;
            if (i != bArr.length) {
                sb.append(':');
            }
        }
        return sb.toString();
    }

    public static View c(Context context, X509Certificate x509Certificate, String str) {
        String strB;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.cert_warn, (ViewGroup) null);
        DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(context);
        ((TextView) viewInflate.findViewById(R.id.cert_error)).setText(str);
        HashMap mapD = d(x509Certificate.getIssuerX500Principal());
        HashMap mapD2 = d(x509Certificate.getSubjectX500Principal());
        ((TextView) viewInflate.findViewById(R.id.to_common)).setText((CharSequence) mapD2.get("CN"));
        ((TextView) viewInflate.findViewById(R.id.to_org)).setText((CharSequence) mapD2.get("O"));
        ((TextView) viewInflate.findViewById(R.id.to_org_unit)).setText((CharSequence) mapD2.get("OU"));
        ((TextView) viewInflate.findViewById(R.id.by_common)).setText((CharSequence) mapD.get("CN"));
        ((TextView) viewInflate.findViewById(R.id.by_org)).setText((CharSequence) mapD.get("O"));
        ((TextView) viewInflate.findViewById(R.id.by_org_unit)).setText((CharSequence) mapD.get("OU"));
        TextView textView = (TextView) viewInflate.findViewById(R.id.serial_number);
        BigInteger serialNumber = x509Certificate.getSerialNumber();
        String strB2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        textView.setText(serialNumber == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : b(serialNumber.toByteArray()));
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.issued_on);
        Date notBefore = x509Certificate.getNotBefore();
        textView2.setText(notBefore == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : dateFormat.format(notBefore));
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.expires_on);
        Date notAfter = x509Certificate.getNotAfter();
        textView3.setText(notAfter == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : dateFormat.format(notAfter));
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.sha256_fingerprint);
        try {
            strB = b(MessageDigest.getInstance("SHA256").digest(x509Certificate.getEncoded()));
        } catch (NoSuchAlgorithmException | CertificateEncodingException unused) {
            strB = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        textView4.setText(strB);
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.sha1_fingerprint);
        try {
            strB2 = b(MessageDigest.getInstance("SHA1").digest(x509Certificate.getEncoded()));
        } catch (NoSuchAlgorithmException | CertificateEncodingException unused2) {
        }
        textView5.setText(strB2);
        return viewInflate;
    }

    public static HashMap d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        HashMap map = new HashMap();
        StringBuilder[] sbArr = {new StringBuilder(), new StringBuilder()};
        boolean z = false;
        char c = 0;
        for (int i = 0; i < name.length(); i++) {
            char cCharAt = name.charAt(i);
            if (!z && cCharAt == '\\') {
                z = true;
            } else if (!z && cCharAt == '=') {
                c = 1;
            } else if (z || cCharAt != ',') {
                StringBuilder sb = sbArr[c];
                if (sb.length() > 0 || cCharAt != ' ') {
                    sb.append(cCharAt);
                }
                z = false;
            } else {
                if (sbArr[0].length() > 0 && sbArr[1].length() > 0) {
                    map.put(sbArr[0].toString(), sbArr[1].toString());
                    sbArr[0].setLength(0);
                    sbArr[1].setLength(0);
                }
                c = 0;
            }
        }
        if (sbArr[0].length() > 0 && sbArr[1].length() > 0) {
            map.put(sbArr[0].toString(), sbArr[1].toString());
        }
        return map;
    }

    public abstract void a();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (i != -1) {
            a();
        } else {
            a();
        }
    }
}
