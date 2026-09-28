package defpackage;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzarh;
import com.google.android.gms.internal.ads.zzarq;
import com.google.android.gms.internal.ads.zzasu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

 
 
public final class yy1 {
    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

     
     
     
     
     
     
    public yy1(String str, zzarh zzarhVar) {
        String str2 = zzarhVar.b;
        long j = zzarhVar.c;
        long j2 = zzarhVar.d;
        long j3 = zzarhVar.e;
        long j4 = zzarhVar.f;
        List arrayList = zzarhVar.h;
        if (arrayList == 0) {
            Map map = zzarhVar.g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzarq((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }

    public static yy1 a(vg vgVar) throws IOException {
        if (zzasu.e(vgVar) != 538247942) {
            throw new IOException();
        }
        String strI = zzasu.i(vgVar);
        String strI2 = zzasu.i(vgVar);
        long jG = zzasu.g(vgVar);
        long jG2 = zzasu.g(vgVar);
        long jG3 = zzasu.g(vgVar);
        long jG4 = zzasu.g(vgVar);
        int iE = zzasu.e(vgVar);
        if (iE < 0) {
            p60.f(vh.i(iE, "readHeaderList size=", new StringBuilder(String.valueOf(iE).length() + 20)));
            return null;
        }
        List arrayList = iE == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < iE; i++) {
            arrayList.add(new zzarq(zzasu.i(vgVar).intern(), zzasu.i(vgVar).intern()));
        }
        return new yy1(strI, strI2, jG, jG2, jG3, jG4, arrayList);
    }

    public yy1(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = true == RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }
}
