package defpackage;

import com.android.volley.Cache;
import com.android.volley.Header;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.ByteArrayPool;
import com.android.volley.toolbox.PoolingByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lt0 {
    public static NetworkResponse a(Request request, long j, List list) {
        Cache.Entry entry = request.k;
        if (entry == null) {
            return new NetworkResponse(304, (byte[]) null, true, j, (List<Header>) list);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(((Header) it.next()).a);
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List list2 = entry.h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (Header header : entry.h) {
                    if (!treeSet.contains(header.a)) {
                        arrayList.add(header);
                    }
                }
            }
        } else if (!entry.g.isEmpty()) {
            for (Map.Entry entry2 : entry.g.entrySet()) {
                if (!treeSet.contains(entry2.getKey())) {
                    arrayList.add(new Header((String) entry2.getKey(), (String) entry2.getValue()));
                }
            }
        }
        return new NetworkResponse(304, entry.a, true, j, (List<Header>) arrayList);
    }

    public static byte[] b(InputStream inputStream, int i, ByteArrayPool byteArrayPool) throws Throwable {
        byte[] bArrA;
        PoolingByteArrayOutputStream poolingByteArrayOutputStream = new PoolingByteArrayOutputStream(byteArrayPool, i);
        try {
            bArrA = byteArrayPool.a(1024);
            while (true) {
                try {
                    int i2 = inputStream.read(bArrA);
                    if (i2 == -1) {
                        break;
                    }
                    poolingByteArrayOutputStream.write(bArrA, 0, i2);
                } catch (Throwable th) {
                    th = th;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        VolleyLog.b("Error occurred when closing InputStream", new Object[0]);
                    }
                    byteArrayPool.b(bArrA);
                    poolingByteArrayOutputStream.close();
                    throw th;
                }
            }
            byte[] byteArray = poolingByteArrayOutputStream.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                VolleyLog.b("Error occurred when closing InputStream", new Object[0]);
            }
            byteArrayPool.b(bArrA);
            poolingByteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArrA = null;
        }
    }
}
