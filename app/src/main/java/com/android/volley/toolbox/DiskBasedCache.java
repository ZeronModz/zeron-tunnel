package com.android.volley.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.volley.Cache;
import com.android.volley.VolleyLog;
import defpackage.gy;
import defpackage.hz;
import defpackage.u7;
import defpackage.vg;
import defpackage.vh;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class DiskBasedCache implements Cache {
    public final LinkedHashMap a;
    public long b;
    public final FileSupplier c;
    public final int d;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface FileSupplier {
        File get();
    }

    public DiskBasedCache(File file, int i) {
        this.a = new LinkedHashMap(16, 0.75f, true);
        this.b = 0L;
        this.c = new a(file);
        this.d = i;
    }

    public static String b(String str) {
        int length = str.length() / 2;
        StringBuilder sbY = hz.y(String.valueOf(str.substring(0, length).hashCode()));
        sbY.append(String.valueOf(str.substring(length).hashCode()));
        return sbY.toString();
    }

    public static int e(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        u7.m();
        return 0;
    }

    public static int f(InputStream inputStream) {
        return (e(inputStream) << 24) | e(inputStream) | (e(inputStream) << 8) | (e(inputStream) << 16);
    }

    public static long g(InputStream inputStream) {
        return (((long) e(inputStream)) & 255) | ((((long) e(inputStream)) & 255) << 8) | ((((long) e(inputStream)) & 255) << 16) | ((((long) e(inputStream)) & 255) << 24) | ((((long) e(inputStream)) & 255) << 32) | ((((long) e(inputStream)) & 255) << 40) | ((((long) e(inputStream)) & 255) << 48) | ((255 & ((long) e(inputStream))) << 56);
    }

    public static String h(vg vgVar) {
        return new String(i(vgVar, g(vgVar)), "UTF-8");
    }

    public static byte[] i(vg vgVar, long j) throws IOException {
        long j2 = vgVar.b - vgVar.c;
        if (j >= 0 && j <= j2) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(vgVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sbW = vh.w(j, "streamToBytes length=", ", maxLength=");
        sbW.append(j2);
        throw new IOException(sbW.toString());
    }

    public static void j(BufferedOutputStream bufferedOutputStream, int i) {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
        bufferedOutputStream.write((i >> 16) & 255);
        bufferedOutputStream.write((i >> 24) & 255);
    }

    public static void k(BufferedOutputStream bufferedOutputStream, long j) {
        bufferedOutputStream.write((byte) j);
        bufferedOutputStream.write((byte) (j >>> 8));
        bufferedOutputStream.write((byte) (j >>> 16));
        bufferedOutputStream.write((byte) (j >>> 24));
        bufferedOutputStream.write((byte) (j >>> 32));
        bufferedOutputStream.write((byte) (j >>> 40));
        bufferedOutputStream.write((byte) (j >>> 48));
        bufferedOutputStream.write((byte) (j >>> 56));
    }

    public static void l(BufferedOutputStream bufferedOutputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        k(bufferedOutputStream, bytes.length);
        bufferedOutputStream.write(bytes, 0, bytes.length);
    }

    public final File a(String str) {
        return new File(this.c.get(), b(str));
    }

    public final void c() {
        long j = this.b;
        int i = this.d;
        if (j < i) {
            return;
        }
        if (VolleyLog.a) {
            VolleyLog.b("Pruning old cache entries.", new Object[0]);
        }
        long j2 = this.b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.a.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            gy gyVar = (gy) ((Map.Entry) it.next()).getValue();
            if (a(gyVar.b).delete()) {
                this.b -= gyVar.a;
            } else {
                String str = gyVar.b;
                VolleyLog.a("Could not delete cache entry for key=%s, filename=%s", str, b(str));
            }
            it.remove();
            i2++;
            if (this.b < i * 0.9f) {
                break;
            }
        }
        if (VolleyLog.a) {
            VolleyLog.b("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.b - j2), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    @Override // com.android.volley.Cache
    public final synchronized void clear() {
        try {
            File[] fileArrListFiles = this.c.get().listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
            this.a.clear();
            this.b = 0L;
            VolleyLog.a("Cache cleared.", new Object[0]);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d(String str, gy gyVar) {
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(str)) {
            this.b = (gyVar.a - ((gy) linkedHashMap.get(str)).a) + this.b;
        } else {
            this.b += gyVar.a;
        }
        linkedHashMap.put(str, gyVar);
    }

    @Override // com.android.volley.Cache
    public final synchronized Cache.Entry get(String str) {
        gy gyVar = (gy) this.a.get(str);
        if (gyVar == null) {
            return null;
        }
        File fileA = a(str);
        try {
            vg vgVar = new vg(new BufferedInputStream(new FileInputStream(fileA)), fileA.length(), 1);
            try {
                gy gyVarA = gy.a(vgVar);
                if (TextUtils.equals(str, gyVarA.b)) {
                    return gyVar.b(i(vgVar, vgVar.b - vgVar.c));
                }
                VolleyLog.a("%s: key=%s, found=%s", fileA.getAbsolutePath(), str, gyVarA.b);
                gy gyVar2 = (gy) this.a.remove(str);
                if (gyVar2 != null) {
                    this.b -= gyVar2.a;
                }
                return null;
            } finally {
                vgVar.close();
            }
        } catch (IOException e) {
            VolleyLog.a("%s: %s", fileA.getAbsolutePath(), e.toString());
            remove(str);
            return null;
        }
    }

    @Override // com.android.volley.Cache
    public final synchronized void initialize() {
        File file = this.c.get();
        int i = 1;
        if (!file.exists()) {
            if (!file.mkdirs()) {
                VolleyLog.a("Unable to create cache dir %s", file.getAbsolutePath());
            }
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            try {
                long length = file2.length();
                vg vgVar = new vg(new BufferedInputStream(new FileInputStream(file2)), length, i);
                try {
                    gy gyVarA = gy.a(vgVar);
                    gyVarA.a = length;
                    d(gyVarA.b, gyVarA);
                    vgVar.close();
                } catch (Throwable th) {
                    vgVar.close();
                    throw th;
                }
            } catch (IOException unused) {
                file2.delete();
            }
        }
    }

    @Override // com.android.volley.Cache
    public final synchronized void invalidate(String str, boolean z) {
        try {
            Cache.Entry entry = get(str);
            if (entry != null) {
                entry.f = 0L;
                if (z) {
                    entry.e = 0L;
                }
                put(str, entry);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.android.volley.Cache
    public final synchronized void put(String str, Cache.Entry entry) {
        BufferedOutputStream bufferedOutputStream;
        gy gyVar;
        long length = this.b + ((long) entry.a.length);
        int i = this.d;
        if (length <= i || r2.length <= i * 0.9f) {
            File fileA = a(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileA));
                gyVar = new gy(str, entry);
            } catch (IOException unused) {
                if (!fileA.delete()) {
                    VolleyLog.a("Could not clean up file %s", fileA.getAbsolutePath());
                }
                if (!this.c.get().exists()) {
                    VolleyLog.a("Re-initializing cache after external clearing.", new Object[0]);
                    this.a.clear();
                    this.b = 0L;
                    initialize();
                }
            }
            if (!gyVar.c(bufferedOutputStream)) {
                bufferedOutputStream.close();
                VolleyLog.a("Failed to write header for %s", fileA.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(entry.a);
            bufferedOutputStream.close();
            gyVar.a = fileA.length();
            d(str, gyVar);
            c();
        }
    }

    @Override // com.android.volley.Cache
    public final synchronized void remove(String str) {
        boolean zDelete = a(str).delete();
        gy gyVar = (gy) this.a.remove(str);
        if (gyVar != null) {
            this.b -= gyVar.a;
        }
        if (!zDelete) {
            VolleyLog.a("Could not delete cache entry for key=%s, filename=%s", str, b(str));
        }
    }

    public DiskBasedCache(FileSupplier fileSupplier, int i) {
        this.a = new LinkedHashMap(16, 0.75f, true);
        this.b = 0L;
        this.c = fileSupplier;
        this.d = i;
    }

    public DiskBasedCache(File file) {
        this(file, 5242880);
    }

    public DiskBasedCache(FileSupplier fileSupplier) {
        this(fileSupplier, 5242880);
    }
}
