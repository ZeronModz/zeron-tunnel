package defpackage;

import com.google.zxing.NotFoundException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v50 {
    public static final HashMap a;
    public static final HashMap b;
    public static final HashMap c;
    public static final HashMap d;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put("00", u50.a(18));
        map.put("01", u50.a(14));
        map.put("02", u50.a(14));
        map.put("10", u50.b(20));
        map.put("11", u50.a(6));
        map.put("12", u50.a(6));
        map.put("13", u50.a(6));
        map.put("15", u50.a(6));
        map.put("16", u50.a(6));
        map.put("17", u50.a(6));
        map.put("20", u50.a(2));
        map.put("21", u50.b(20));
        hz.D(29, map, "22", 8, "30");
        map.put("37", u50.b(8));
        for (int i = 90; i <= 99; i++) {
            a.put(String.valueOf(i), u50.b(30));
        }
        HashMap map2 = new HashMap();
        b = map2;
        hz.D(28, map2, "235", 30, "240");
        hz.D(30, map2, "241", 6, "242");
        hz.D(20, map2, "243", 30, "250");
        hz.D(30, map2, "251", 30, "253");
        hz.D(20, map2, "254", 25, "255");
        hz.D(30, map2, "400", 30, "401");
        map2.put("402", u50.a(17));
        map2.put("403", u50.b(30));
        map2.put("410", u50.a(13));
        map2.put("411", u50.a(13));
        map2.put("412", u50.a(13));
        map2.put("413", u50.a(13));
        map2.put("414", u50.a(13));
        map2.put("415", u50.a(13));
        map2.put("416", u50.a(13));
        map2.put("417", u50.a(13));
        hz.D(20, map2, "420", 15, "421");
        map2.put("422", u50.a(3));
        map2.put("423", u50.b(15));
        map2.put("424", u50.a(3));
        map2.put("425", u50.b(15));
        map2.put("426", u50.a(3));
        map2.put("427", u50.b(3));
        hz.D(20, map2, "710", 20, "711");
        hz.D(20, map2, "712", 20, "713");
        map2.put("714", u50.b(20));
        map2.put("715", u50.b(20));
        c = new HashMap();
        for (int i2 = 310; i2 <= 316; i2++) {
            c.put(String.valueOf(i2), u50.a(6));
        }
        for (int i3 = 320; i3 <= 337; i3++) {
            c.put(String.valueOf(i3), u50.a(6));
        }
        for (int i4 = 340; i4 <= 357; i4++) {
            c.put(String.valueOf(i4), u50.a(6));
        }
        for (int i5 = 360; i5 <= 369; i5++) {
            c.put(String.valueOf(i5), u50.a(6));
        }
        HashMap map3 = c;
        hz.D(15, map3, "390", 18, "391");
        hz.D(15, map3, "392", 18, "393");
        map3.put("394", u50.a(4));
        map3.put("395", u50.a(6));
        map3.put("703", u50.b(30));
        map3.put("723", u50.b(30));
        HashMap map4 = new HashMap();
        d = map4;
        hz.D(35, map4, "4300", 35, "4301");
        hz.D(70, map4, "4302", 70, "4303");
        hz.D(70, map4, "4304", 70, "4305");
        map4.put("4306", u50.b(70));
        map4.put("4307", u50.a(2));
        map4.put("4308", u50.b(30));
        map4.put("4309", u50.a(20));
        hz.D(35, map4, "4310", 35, "4311");
        hz.D(70, map4, "4312", 70, "4313");
        hz.D(70, map4, "4314", 70, "4315");
        map4.put("4316", u50.b(70));
        map4.put("4317", u50.a(2));
        hz.D(20, map4, "4318", 30, "4319");
        map4.put("4320", u50.b(35));
        map4.put("4321", u50.a(1));
        map4.put("4322", u50.a(1));
        map4.put("4323", u50.a(1));
        map4.put("4324", u50.a(10));
        map4.put("4325", u50.a(10));
        map4.put("4326", u50.a(6));
        map4.put("7001", u50.a(13));
        map4.put("7002", u50.b(30));
        map4.put("7003", u50.a(10));
        hz.D(4, map4, "7004", 12, "7005");
        map4.put("7006", u50.a(6));
        map4.put("7007", u50.b(12));
        hz.D(3, map4, "7008", 10, "7009");
        hz.D(2, map4, "7010", 10, "7011");
        hz.D(20, map4, "7020", 20, "7021");
        hz.D(20, map4, "7022", 30, "7023");
        map4.put("7040", u50.a(4));
        map4.put("7240", u50.b(20));
        map4.put("8001", u50.a(14));
        map4.put("8002", u50.b(20));
        hz.D(30, map4, "8003", 30, "8004");
        map4.put("8005", u50.a(6));
        map4.put("8006", u50.a(18));
        hz.D(34, map4, "8007", 12, "8008");
        hz.D(50, map4, "8009", 30, "8010");
        hz.D(12, map4, "8011", 20, "8012");
        map4.put("8013", u50.b(25));
        map4.put("8017", u50.a(18));
        map4.put("8018", u50.a(18));
        map4.put("8019", u50.b(10));
        map4.put("8020", u50.b(25));
        map4.put("8026", u50.a(18));
        map4.put("8100", u50.a(6));
        map4.put("8101", u50.a(10));
        map4.put("8102", u50.a(2));
        map4.put("8110", u50.b(70));
        map4.put("8111", u50.a(4));
        map4.put("8112", u50.b(70));
        map4.put("8200", u50.b(70));
    }

    public static String a(String str) {
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() < 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        u50 u50Var = (u50) a.get(str.substring(0, 2));
        if (u50Var != null) {
            boolean z = u50Var.a;
            int i = u50Var.b;
            return z ? c(2, i, str) : b(2, i, str);
        }
        if (str.length() < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        String strSubstring = str.substring(0, 3);
        u50 u50Var2 = (u50) b.get(strSubstring);
        if (u50Var2 != null) {
            boolean z2 = u50Var2.a;
            int i2 = u50Var2.b;
            return z2 ? c(3, i2, str) : b(3, i2, str);
        }
        if (str.length() < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        u50 u50Var3 = (u50) c.get(strSubstring);
        if (u50Var3 != null) {
            boolean z3 = u50Var3.a;
            int i3 = u50Var3.b;
            return z3 ? c(4, i3, str) : b(4, i3, str);
        }
        u50 u50Var4 = (u50) d.get(str.substring(0, 4));
        if (u50Var4 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z4 = u50Var4.a;
        int i4 = u50Var4.b;
        return z4 ? c(4, i4, str) : b(4, i4, str);
    }

    public static String b(int i, int i2, String str) throws NotFoundException {
        if (str.length() < i) {
            throw NotFoundException.getNotFoundInstance();
        }
        String strSubstring = str.substring(0, i);
        int i3 = i2 + i;
        if (str.length() < i3) {
            throw NotFoundException.getNotFoundInstance();
        }
        String strSubstring2 = str.substring(i, i3);
        String str2 = "(" + strSubstring + ')' + strSubstring2;
        String strA = a(str.substring(i3));
        return strA == null ? str2 : str2.concat(strA);
    }

    public static String c(int i, int i2, String str) {
        String strSubstring = str.substring(0, i);
        int iMin = Math.min(str.length(), i2 + i);
        String strSubstring2 = str.substring(i, iMin);
        String str2 = "(" + strSubstring + ')' + strSubstring2;
        String strA = a(str.substring(iMin));
        return strA == null ? str2 : str2.concat(strA);
    }
}
