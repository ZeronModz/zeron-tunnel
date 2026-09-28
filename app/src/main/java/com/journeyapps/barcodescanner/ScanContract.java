package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.contract.ActivityResultContract;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.z41;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class ScanContract extends ActivityResultContract<ScanOptions, z41> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent a(Context context, Object obj) {
        ScanOptions scanOptions = (ScanOptions) obj;
        scanOptions.getClass();
        Class<CaptureActivity> cls = scanOptions.b;
        if (cls == null) {
            cls = CaptureActivity.class;
            scanOptions.b = cls;
        }
        Intent intent = new Intent(context, cls);
        intent.setAction("com.google.zxing.client.android.SCAN");
        intent.addFlags(67108864);
        intent.addFlags(524288);
        for (Map.Entry entry : scanOptions.a.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                intent.putExtra(str, (Integer) value);
            } else if (value instanceof Long) {
                intent.putExtra(str, (Long) value);
            } else if (value instanceof Boolean) {
                intent.putExtra(str, (Boolean) value);
            } else if (value instanceof Double) {
                intent.putExtra(str, (Double) value);
            } else if (value instanceof Float) {
                intent.putExtra(str, (Float) value);
            } else if (value instanceof Bundle) {
                intent.putExtra(str, (Bundle) value);
            } else if (value instanceof int[]) {
                intent.putExtra(str, (int[]) value);
            } else if (value instanceof long[]) {
                intent.putExtra(str, (long[]) value);
            } else if (value instanceof boolean[]) {
                intent.putExtra(str, (boolean[]) value);
            } else if (value instanceof double[]) {
                intent.putExtra(str, (double[]) value);
            } else if (value instanceof float[]) {
                intent.putExtra(str, (float[]) value);
            } else if (value instanceof String[]) {
                intent.putExtra(str, (String[]) value);
            } else {
                intent.putExtra(str, value.toString());
            }
        }
        return intent;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object c(int i, Intent intent) {
        if (i != -1) {
            return new z41(null, null, null, null, null, null, intent);
        }
        String stringExtra = intent.getStringExtra("SCAN_RESULT");
        String stringExtra2 = intent.getStringExtra("SCAN_RESULT_FORMAT");
        byte[] byteArrayExtra = intent.getByteArrayExtra("SCAN_RESULT_BYTES");
        int intExtra = intent.getIntExtra("SCAN_RESULT_ORIENTATION", AttribFlags.SSH_FILEXFER_ATTR_EXTENDED);
        return new z41(stringExtra, stringExtra2, byteArrayExtra, intExtra == Integer.MIN_VALUE ? null : Integer.valueOf(intExtra), intent.getStringExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL"), intent.getStringExtra("SCAN_RESULT_IMAGE_PATH"), intent);
    }
}
