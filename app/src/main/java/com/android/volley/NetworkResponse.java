package com.android.volley;

import java.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

 
 
public class NetworkResponse {
    public final byte[] a;
    public final Map b;
    public final List c;
    public final boolean d;

     
     
     
     
     
     
    @Deprecated
    public NetworkResponse(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        List arrayList;
        if (map == null) {
            arrayList = null;
        } else if (map.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new Header(entry.getKey(), entry.getValue()));
            }
        }
        this(bArr, map, (List) arrayList, z);
    }

    public NetworkResponse(byte[] bArr) {
        this(200, bArr, false, 0L, (List<Header>) Collections.EMPTY_LIST);
    }

    @Deprecated
    public NetworkResponse(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }

    public NetworkResponse(byte[] bArr, Map map, List list, boolean z) {
        this.a = bArr;
        this.b = map;
        if (list == null) {
            this.c = null;
        } else {
            this.c = DesugarCollections.unmodifiableList(list);
        }
        this.d = z;
    }

     
     
     
     
     
     
    public NetworkResponse(int i, byte[] bArr, boolean z, long j, List<Header> list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (Header header : list) {
                treeMap.put(header.a, header.b);
            }
        }
        this(bArr, (Map) treeMap, list, z);
    }

    @Deprecated
    public NetworkResponse(int i, byte[] bArr, Map<String, String> map, boolean z) {
        this(i, bArr, map, z, 0L);
    }
}
