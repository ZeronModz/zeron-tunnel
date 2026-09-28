package com.v2ray.ang.ui;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.sandok.tunnel.core.VpnProfile;
import com.trilead.ssh2.sftp.AttribFlags;
import com.v2ray.ang.Hometab;
import defpackage.if3;
import defpackage.xm;
import defpackage.yg0;
import defpackage.zq0;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Lazy;
import kotlin.Metadata;
import libv2ray.Libv2ray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/ui/ConfigFileParser;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConfigFileParser extends ComponentActivity {
    public final void d(String str) {
        Intent intent = new Intent(this, (Class<?>) Hometab.class);
        intent.setFlags(268468224);
        intent.putExtra("SAN_CONTENT", str);
        startActivity(intent);
        finish();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IOException {
        androidx.activity.c.a(this);
        super.onCreate(bundle);
        Intent intent = getIntent();
        String str = null;
        if (yg0.a(intent != null ? intent.getAction() : null, "android.intent.action.VIEW")) {
            Uri data = getIntent().getData();
            if (data == null) {
                d("invalid");
                return;
            }
            long length = 0;
            if (yg0.a(data.getScheme(), "content")) {
                Cursor cursorQuery = getContentResolver().query(data, null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        int columnIndex = cursorQuery.getColumnIndex("_size");
                        if (cursorQuery.moveToFirst() && columnIndex >= 0) {
                            length = cursorQuery.getLong(columnIndex);
                        }
                        cursorQuery.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            if3.c(cursorQuery, th);
                            throw th2;
                        }
                    }
                }
            } else {
                String path = data.getPath();
                if (path != null) {
                    File file = new File(path);
                    if (file.exists()) {
                        length = file.length();
                    }
                }
            }
            if (length > VpnProfile.MAX_EMBED_FILE_SIZE) {
                d("File too large");
                return;
            }
            try {
                InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(data);
                if (inputStreamOpenInputStream != null) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenInputStream, xm.a), AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT);
                    try {
                        String strB = kotlin.io.d.b(bufferedReader);
                        bufferedReader.close();
                        str = strB;
                    } finally {
                    }
                }
            } catch (Exception unused) {
            }
            if (str == null || str.length() == 0) {
                d("invalid");
                return;
            }
            try {
                if (Libv2ray.parseConfig(str)) {
                    Lazy lazy = zq0.a;
                    String strGv = Libv2ray.gv("Name");
                    strGv.getClass();
                    zq0.I(strGv);
                    String strGv2 = Libv2ray.gv("TunnelType");
                    strGv2.getClass();
                    zq0.H(strGv2);
                    String strGc = Libv2ray.gc();
                    strGc.getClass();
                    zq0.u().i("ConfigFile", strGc);
                    zq0.u().k("COnfigSwitch", true);
                    d("success");
                } else {
                    Hometab.n.getClass();
                    JSONObject jSONObject = new JSONObject(Hometab.Companion.a(str));
                    String string = jSONObject.getString("Name");
                    String string2 = jSONObject.getString("TunnelType");
                    Lazy lazy2 = zq0.a;
                    string.getClass();
                    zq0.I(string);
                    string2.getClass();
                    zq0.H(string2);
                    zq0.u().i("ConfigFile", str);
                    zq0.u().k("COnfigSwitch", true);
                    d("success");
                }
            } catch (Exception unused2) {
                d("invalid");
            }
        }
    }
}
