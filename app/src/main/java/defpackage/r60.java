package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.zxing.WriterException;
import com.google.zxing.common.ECIEncoderSet;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.encoder.MinimalEncoder$VersionSize;
import com.google.zxing.qrcode.encoder.a;
import com.google.zxing.qrcode.encoder.b;
import com.google.zxing.qrcode.encoder.c;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r60 {
    public boolean a;
    public final Object b;
    public Object c;
    public final Object d;

    public r60(String str, Charset charset, boolean z, ErrorCorrectionLevel errorCorrectionLevel) {
        this.b = str;
        this.a = z;
        this.c = new ECIEncoderSet(str, charset, -1);
        this.d = errorCorrectionLevel;
    }

    public static void a(uq0[][][] uq0VarArr, int i, uq0 uq0Var) {
        uq0[] uq0VarArr2 = uq0VarArr[i + uq0Var.d][uq0Var.c];
        Mode mode = uq0Var.a;
        char c = 0;
        if (mode != null) {
            int i2 = b.b[mode.ordinal()];
            char c2 = 1;
            if (i2 != 1) {
                c = 2;
                if (i2 != 2) {
                    c2 = 3;
                    if (i2 != 3) {
                        if (i2 != 4) {
                            zu0.g(mode, "Illegal mode ");
                            return;
                        }
                        c = c2;
                    }
                } else {
                    c = c2;
                }
            }
        }
        uq0 uq0Var2 = uq0VarArr2[c];
        if (uq0Var2 == null || uq0Var2.f > uq0Var.f) {
            uq0VarArr2[c] = uq0Var;
        }
    }

    public static boolean c(Mode mode, char c) {
        int i = b.b[mode.ordinal()];
        if (i == 1) {
            return a.c(String.valueOf(c));
        }
        if (i == 2) {
            if ((c < '`' ? a.a[c] : -1) == -1) {
                return false;
            }
        } else if (i != 3) {
            if (i != 4) {
                return false;
            }
        } else if (c < '0' || c > '9') {
            return false;
        }
        return true;
    }

    public static jm1 e(MinimalEncoder$VersionSize minimalEncoder$VersionSize) {
        int i = b.a[minimalEncoder$VersionSize.ordinal()];
        return i != 1 ? i != 2 ? jm1.c(40) : jm1.c(26) : jm1.c(9);
    }

    public void b(jm1 jm1Var, uq0[][][] uq0VarArr, int i, uq0 uq0Var) {
        int i2;
        String str = (String) this.b;
        ECIEncoderSet eCIEncoderSet = (ECIEncoderSet) this.c;
        int length = eCIEncoderSet.a.length;
        int i3 = eCIEncoderSet.b;
        if (i3 < 0 || !eCIEncoderSet.a(str.charAt(i), i3)) {
            i3 = 0;
        } else {
            length = i3 + 1;
        }
        int i4 = length;
        for (int i5 = i3; i5 < i4; i5++) {
            if (eCIEncoderSet.a(str.charAt(i), i5)) {
                a(uq0VarArr, i, new uq0(this, Mode.BYTE, i, i5, 1, uq0Var, jm1Var));
            }
        }
        Mode mode = Mode.KANJI;
        if (c(mode, str.charAt(i))) {
            a(uq0VarArr, i, new uq0(this, mode, i, 0, 1, uq0Var, jm1Var));
        }
        int length2 = str.length();
        Mode mode2 = Mode.ALPHANUMERIC;
        int i6 = 2;
        if (c(mode2, str.charAt(i))) {
            int i7 = i + 1;
            a(uq0VarArr, i, new uq0(this, mode2, i, 0, (i7 >= length2 || !c(mode2, str.charAt(i7))) ? 1 : 2, uq0Var, jm1Var));
        }
        Mode mode3 = Mode.NUMERIC;
        if (c(mode3, str.charAt(i))) {
            int i8 = i + 1;
            if (i8 >= length2 || !c(mode3, str.charAt(i8))) {
                i2 = 1;
            } else {
                int i9 = i + 2;
                if (i9 < length2 && c(mode3, str.charAt(i9))) {
                    i6 = 3;
                }
                i2 = i6;
            }
            a(uq0VarArr, i, new uq0(this, mode3, i, 0, i2, uq0Var, jm1Var));
        }
    }

    public c d(jm1 jm1Var) throws WriterException {
        int i;
        String str = (String) this.b;
        int length = str.length();
        CharsetEncoder[] charsetEncoderArr = ((ECIEncoderSet) this.c).a;
        uq0[][][] uq0VarArr = (uq0[][][]) Array.newInstance((Class<?>) uq0.class, length + 1, charsetEncoderArr.length, 4);
        b(jm1Var, uq0VarArr, 0, null);
        for (int i2 = 1; i2 <= length; i2++) {
            for (int i3 = 0; i3 < charsetEncoderArr.length; i3++) {
                for (int i4 = 0; i4 < 4; i4++) {
                    uq0 uq0Var = uq0VarArr[i2][i3][i4];
                    if (uq0Var != null && i2 < length) {
                        b(jm1Var, uq0VarArr, i2, uq0Var);
                    }
                }
            }
        }
        int i5 = -1;
        int i6 = Integer.MAX_VALUE;
        int i7 = -1;
        for (int i8 = 0; i8 < charsetEncoderArr.length; i8++) {
            for (int i9 = 0; i9 < 4; i9++) {
                uq0 uq0Var2 = uq0VarArr[length][i8][i9];
                if (uq0Var2 != null && (i = uq0Var2.f) < i6) {
                    i5 = i8;
                    i7 = i9;
                    i6 = i;
                }
            }
        }
        if (i5 >= 0) {
            return new c(this, jm1Var, uq0VarArr[length][i5][i7]);
        }
        throw new WriterException(vh.m("Internal error: failed to encode \"", str, "\""));
    }

    public synchronized void f() {
        try {
            if (this.a) {
                return;
            }
            Boolean boolH = h();
            this.c = boolH;
            if (boolH == null) {
                ((Subscriber) this.b).subscribe(DataCollectionDefaultChange.class, new EventHandler() { // from class: q60
                    @Override // com.google.firebase.events.EventHandler
                    public final void handle(Event event) {
                        r60 r60Var = this.a;
                        if (r60Var.g()) {
                            ((FirebaseMessaging) r60Var.d).j();
                        }
                    }
                });
            }
            this.a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean g() {
        Boolean bool;
        try {
            f();
            bool = (Boolean) this.c;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.d).a.g();
    }

    public Boolean h() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        com.google.firebase.a aVar = ((FirebaseMessaging) this.d).a;
        aVar.a();
        Context context = aVar.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public r60(FirebaseMessaging firebaseMessaging, Subscriber subscriber) {
        this.d = firebaseMessaging;
        this.b = subscriber;
    }
}
