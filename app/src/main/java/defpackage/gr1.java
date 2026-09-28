package defpackage;

import android.content.Context;
import androidx.work.Logger;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gr1 {
    public static final void a(Context context) {
        Map mapD;
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            Logger loggerA = Logger.a();
            String[] strArr = hr1.a;
            loggerA.getClass();
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            File file = new File(noBackupFilesDir, "androidx.work.workdb");
            String[] strArr2 = hr1.a;
            int iC = d.c(strArr2.length);
            if (iC < 16) {
                iC = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iC);
            for (String str : strArr2) {
                Pair pair = new Pair(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            Pair pair2 = new Pair(databasePath2, file);
            if (linkedHashMap.isEmpty()) {
                mapD = d.d(pair2);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(pair2.getFirst(), pair2.getSecond());
                mapD = linkedHashMap2;
            }
            for (Map.Entry entry : mapD.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        Logger loggerA2 = Logger.a();
                        String[] strArr3 = hr1.a;
                        file3.toString();
                        loggerA2.getClass();
                    }
                    if (file2.renameTo(file3)) {
                        file2.toString();
                        file3.toString();
                    } else {
                        file2.toString();
                        file3.toString();
                    }
                    Logger loggerA3 = Logger.a();
                    String[] strArr4 = hr1.a;
                    loggerA3.getClass();
                }
            }
        }
    }
}
