package com.vpn.sandok.ultrasshservice.logger;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.Parcelable;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.vpn.sandok.ultrasshservice.logger.SkStatus;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Locale;
import java.util.UnknownFormatConversionException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class LogItem implements Parcelable {
    public static final Parcelable.Creator<LogItem> CREATOR = new Parcelable.Creator<LogItem>() { // from class: com.vpn.sandok.ultrasshservice.logger.LogItem.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LogItem createFromParcel(Parcel parcel) {
            return new LogItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LogItem[] newArray(int i) {
            return new LogItem[i];
        }
    };
    private long logtime;
    private Object[] mArgs;
    SkStatus.LogLevel mLevel;
    private String mMessage;
    private int mResourceId;
    private int mVerbosityLevel;

    public LogItem(Parcel parcel) {
        this.mArgs = null;
        this.mMessage = null;
        this.mLevel = SkStatus.LogLevel.INFO;
        this.logtime = System.currentTimeMillis();
        this.mVerbosityLevel = -1;
        this.mArgs = parcel.readArray(Object.class.getClassLoader());
        this.mMessage = parcel.readString();
        this.mResourceId = parcel.readInt();
        this.mLevel = SkStatus.LogLevel.getEnumByValue(parcel.readInt());
        this.logtime = parcel.readLong();
    }

    private String getAppInfoString(Context context) {
        String str;
        context.getPackageManager();
        String str2 = "error getting package signature";
        try {
            X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray()));
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(x509Certificate.getEncoded());
            byte[] bArrDigest = messageDigest.digest();
            str2 = (Arrays.equals(bArrDigest, SkStatus.oficialkey) || Arrays.equals(bArrDigest, SkStatus.oficialdebugkey)) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : " ";
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            str = String.format("%s Build %d", packageInfo.versionName, Integer.valueOf(packageInfo.versionCode));
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException unused) {
            str = "error getting version";
        }
        return context.getString(R.string.app_mobile_info, str, str2);
    }

    public static String join(CharSequence charSequence, Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : objArr) {
            if (z) {
                z = false;
            } else {
                sb.append(charSequence);
            }
            sb.append(obj);
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SkStatus.LogLevel getLogLevel() {
        return this.mLevel;
    }

    public long getLogtime() {
        return this.logtime;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public String getString(Context context) {
        try {
            String str = this.mMessage;
            if (str != null) {
                return str;
            }
            if (context != null) {
                int i = this.mResourceId;
                if (i == R.string.app_mobile_info) {
                    return getAppInfoString(context);
                }
                Object[] objArr = this.mArgs;
                return objArr == null ? context.getString(i) : context.getString(i, objArr);
            }
            Locale locale = Locale.ENGLISH;
            String str2 = "Log (no context) resid " + this.mResourceId;
            if (this.mArgs == null) {
                return str2;
            }
            return str2 + join("|", this.mArgs);
        } catch (FormatFlagsConversionMismatchException e) {
            if (context == null) {
                throw e;
            }
            throw new FormatFlagsConversionMismatchException(e.getLocalizedMessage() + getString(null), e.getConversion());
        } catch (UnknownFormatConversionException e2) {
            if (context == null) {
                throw e2;
            }
            throw new UnknownFormatConversionException(e2.getLocalizedMessage() + getString(null));
        }
    }

    public int getVerbosityLevel() {
        int i = this.mVerbosityLevel;
        return i == -1 ? this.mLevel.getInt() : i;
    }

    public String toString() {
        return getString(null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeArray(this.mArgs);
        parcel.writeString(this.mMessage);
        parcel.writeInt(this.mResourceId);
        parcel.writeInt(this.mLevel.getInt());
        parcel.writeLong(this.logtime);
    }

    public LogItem(SkStatus.LogLevel logLevel, int i, String str) {
        this.mArgs = null;
        this.mMessage = null;
        this.mLevel = SkStatus.LogLevel.INFO;
        this.logtime = System.currentTimeMillis();
        this.mLevel = logLevel;
        this.mMessage = str;
        this.mVerbosityLevel = i;
    }

    public LogItem(SkStatus.LogLevel logLevel, int i, Object... objArr) {
        this.mArgs = null;
        this.mMessage = null;
        this.mLevel = SkStatus.LogLevel.INFO;
        this.logtime = System.currentTimeMillis();
        this.mVerbosityLevel = -1;
        this.mLevel = logLevel;
        this.mResourceId = i;
        this.mArgs = objArr;
    }

    public LogItem(SkStatus.LogLevel logLevel, String str) {
        this.mArgs = null;
        this.mMessage = null;
        this.mLevel = SkStatus.LogLevel.INFO;
        this.logtime = System.currentTimeMillis();
        this.mVerbosityLevel = -1;
        this.mLevel = logLevel;
        this.mMessage = str;
    }

    public LogItem(SkStatus.LogLevel logLevel, int i) {
        this.mArgs = null;
        this.mMessage = null;
        this.mLevel = SkStatus.LogLevel.INFO;
        this.logtime = System.currentTimeMillis();
        this.mVerbosityLevel = -1;
        this.mResourceId = i;
        this.mLevel = logLevel;
    }

    public LogItem(int i, Object... objArr) {
        this.mArgs = null;
        this.mMessage = null;
        this.mLevel = SkStatus.LogLevel.INFO;
        this.logtime = System.currentTimeMillis();
        this.mVerbosityLevel = -1;
        this.mResourceId = i;
        this.mArgs = objArr;
    }
}
