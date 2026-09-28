package defpackage;

import com.android.volley.Cache;
import com.android.volley.Header;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.DiskBasedCache;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.DesugarCollections;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

 
 
public final class gy {
    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

     
     
     
     
     
     
    public gy(String str, Cache.Entry entry) {
        String str2 = entry.b;
        long j = entry.c;
        long j2 = entry.d;
        long j3 = entry.e;
        long j4 = entry.f;
        List arrayList = entry.h;
        if (arrayList == null) {
            Map map = entry.g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry2 : map.entrySet()) {
                arrayList.add(new Header((String) entry2.getKey(), (String) entry2.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }

    public static gy a(vg vgVar) throws IOException {
        if (DiskBasedCache.f(vgVar) != 538247942) {
            throw new IOException();
        }
        String strH = DiskBasedCache.h(vgVar);
        String strH2 = DiskBasedCache.h(vgVar);
        long jG = DiskBasedCache.g(vgVar);
        long jG2 = DiskBasedCache.g(vgVar);
        long jG3 = DiskBasedCache.g(vgVar);
        long jG4 = DiskBasedCache.g(vgVar);
        int iF = DiskBasedCache.f(vgVar);
        if (iF < 0) {
            p60.f(hz.o(iF, "readHeaderList size="));
            return null;
        }
        List arrayList = iF == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < iF; i++) {
            arrayList.add(new Header(DiskBasedCache.h(vgVar).intern(), DiskBasedCache.h(vgVar).intern()));
        }
        return new gy(strH, strH2, jG, jG2, jG3, jG4, arrayList);
    }

    public final Cache.Entry b(byte[] bArr) {
        Cache.Entry entry = new Cache.Entry();
        entry.a = bArr;
        entry.b = this.c;
        entry.c = this.d;
        entry.d = this.e;
        entry.e = this.f;
        entry.f = this.g;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        List<Header> list = this.h;
        for (Header header : list) {
            treeMap.put(header.a, header.b);
        }
        entry.g = treeMap;
        entry.h = DesugarCollections.unmodifiableList(list);
        return entry;
    }

    public final boolean c(BufferedOutputStream bufferedOutputStream) {
        try {
            DiskBasedCache.j(bufferedOutputStream, 538247942);
            DiskBasedCache.l(bufferedOutputStream, this.b);
            String str = this.c;
            if (str == null) {
                str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            DiskBasedCache.l(bufferedOutputStream, str);
            DiskBasedCache.k(bufferedOutputStream, this.d);
            DiskBasedCache.k(bufferedOutputStream, this.e);
            DiskBasedCache.k(bufferedOutputStream, this.f);
            DiskBasedCache.k(bufferedOutputStream, this.g);
            List<Header> list = this.h;
            if (list != null) {
                DiskBasedCache.j(bufferedOutputStream, list.size());
                for (Header header : list) {
                    DiskBasedCache.l(bufferedOutputStream, header.a);
                    DiskBasedCache.l(bufferedOutputStream, header.b);
                }
            } else {
                DiskBasedCache.j(bufferedOutputStream, 0);
            }
            bufferedOutputStream.flush();
            return true;
        } catch (IOException e) {
            VolleyLog.a("%s", e.toString());
            return false;
        }
    }

    public gy(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }
}
