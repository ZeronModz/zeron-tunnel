package com.vpn.sandok.ultrasshservice.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog$Builder;
import dev.zeron.tunnel.R;
import defpackage.k5;
import defpackage.x2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class FileUtils {
    private static final String TAG = "FileUtils";

    public static void copiarArquivo(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                inputStream.close();
                outputStream.close();
                return;
            }
            outputStream.write(bArr, 0, i);
        }
    }

    public static boolean isExternalStorageReadable() {
        String externalStorageState = Environment.getExternalStorageState();
        return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
    }

    public static boolean isExternalStorageWritable() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    private static void promptForPermissionsDialog(Context context, String str, DialogInterface.OnClickListener onClickListener) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        AlertController.AlertParams alertParams = alertDialog$Builder.a;
        alertParams.g = str;
        alertDialog$Builder.e(context.getString(R.string.ok), onClickListener);
        alertParams.j = context.getString(R.string.cr_cancel);
        alertParams.k = null;
        alertDialog$Builder.a().show();
    }

    public static String readFromRaw(Context context, int i) {
        Scanner scannerUseDelimiter = new Scanner(context.getResources().openRawResource(i), "UTF-8").useDelimiter("\\A");
        StringBuilder sb = new StringBuilder();
        while (scannerUseDelimiter.hasNext()) {
            sb.append(scannerUseDelimiter.next());
        }
        scannerUseDelimiter.close();
        return sb.toString();
    }

    public static String readTextFile(File file) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return sb.toString();
                }
                sb.append(line + "\n");
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static void requestForPermissionExternalStorage(final Activity activity) {
        boolean zShouldShowRequestPermissionRationale;
        if (k5.a(activity, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            int i = Build.VERSION.SDK_INT;
            boolean zShouldShowRequestPermissionRationale2 = false;
            if (i >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", "android.permission.WRITE_EXTERNAL_STORAGE")) {
                if (i < 32 && i == 31) {
                    try {
                        zShouldShowRequestPermissionRationale = ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), "android.permission.WRITE_EXTERNAL_STORAGE")).booleanValue();
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        zShouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE");
                    }
                    zShouldShowRequestPermissionRationale2 = zShouldShowRequestPermissionRationale;
                } else {
                    zShouldShowRequestPermissionRationale2 = activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE");
                }
            }
            if (zShouldShowRequestPermissionRationale2) {
                promptForPermissionsDialog(activity, activity.getString(R.string.error_request_permission), new DialogInterface.OnClickListener() { // from class: com.vpn.sandok.ultrasshservice.util.FileUtils.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        x2.N(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 100);
                    }
                });
            } else {
                x2.N(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 100);
            }
        }
    }

    public static boolean saveTextFile(File file, String str) {
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file, false);
            fileWriter.write(str);
            fileWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
