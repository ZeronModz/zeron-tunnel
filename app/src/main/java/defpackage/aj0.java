package defpackage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.InstanceCreator;
import com.google.gson.reflect.TypeToken;
import java.util.Objects;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class aj0 {
    public static final Gson a = new Gson();

    public static Object a(Class cls, String str) {
        str.getClass();
        Gson gson = a;
        gson.getClass();
        return gson.c(str, new TypeToken(cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String b(Object obj) {
        zh1 zh1Var;
        zh1 zh1Var2 = null;
        if (obj == null) {
            return null;
        }
        GsonBuilder gsonBuilder = new GsonBuilder();
        t80 t80Var = t80.e;
        Objects.requireNonNull(t80Var);
        gsonBuilder.j = t80Var;
        gsonBuilder.i = false;
        TypeToken<Double> typeToken = new TypeToken<Double>() { // from class: com.v2ray.ang.util.JsonUtil$toJsonPretty$gsonPre$1
        };
        zi0 zi0Var = new zi0();
        Type type = typeToken.b;
        Objects.requireNonNull(type);
        if (type == Object.class) {
            p60.e(type, "Cannot override built-in adapter for ");
            return null;
        }
        boolean z = zi0Var instanceof InstanceCreator;
        HashMap map = gsonBuilder.d;
        if (z) {
            map.put(type, (InstanceCreator) zi0Var);
        }
        TypeToken typeToken2 = new TypeToken(type);
        xg1 xg1Var = new xg1(zi0Var, typeToken2, typeToken2.b == typeToken2.a);
        ArrayList arrayList = gsonBuilder.e;
        arrayList.add(xg1Var);
        int size = arrayList.size();
        ArrayList arrayList2 = gsonBuilder.f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z2 = u91.a;
        int i = gsonBuilder.g;
        int i2 = gsonBuilder.h;
        if (i != 2 || i2 != 2) {
            dv dvVar = new dv(cv.b, i, i2);
            zh1 zh1Var3 = ki1.a;
            zh1 zh1Var4 = new zh1(Date.class, dvVar, 0);
            if (z2) {
                t91 t91Var = u91.c;
                t91Var.getClass();
                zh1 zh1Var5 = new zh1(t91Var.a, new dv(t91Var, i, i2), 0);
                t91 t91Var2 = u91.b;
                t91Var2.getClass();
                zh1Var = new zh1(t91Var2.a, new dv(t91Var2, i, i2), 0);
                zh1Var2 = zh1Var5;
            } else {
                zh1Var = null;
            }
            arrayList3.add(zh1Var4);
            if (z2) {
                arrayList3.add(zh1Var2);
                arrayList3.add(zh1Var);
            }
        }
        return new Gson(gsonBuilder.a, gsonBuilder.c, new HashMap(map), gsonBuilder.i, gsonBuilder.j, gsonBuilder.k, gsonBuilder.b, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, gsonBuilder.l, gsonBuilder.m, new ArrayList(gsonBuilder.n)).g(obj);
    }
}
