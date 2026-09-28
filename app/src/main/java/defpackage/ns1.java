package defpackage;

import android.os.Parcelable;
import android.view.View;
import androidx.constraintlayout.core.SolverVariable;
import androidx.core.view.h;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.internal.ads.c7;
import com.google.android.gms.internal.ads.zzaaa;
import com.google.android.gms.internal.ads.zzanq;
import com.google.android.gms.internal.ads.zzfro;
import java.util.Comparator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ns1 implements Comparator {
    public static final /* synthetic */ ns1 b = new ns1(0);
    public static final /* synthetic */ ns1 c = new ns1(13);
    public static final /* synthetic */ ns1 d = new ns1(14);
    public static final /* synthetic */ ns1 e = new ns1(15);
    public static final /* synthetic */ ns1 f = new ns1(16);
    public static final /* synthetic */ ns1 g = new ns1(19);
    public static final /* synthetic */ ns1 h = new ns1(21);
    public static final /* synthetic */ ns1 i = new ns1(22);
    public static final /* synthetic */ ns1 j = new ns1(23);
    public static final /* synthetic */ ns1 k = new ns1(24);
    public final /* synthetic */ int a;

    public /* synthetic */ ns1(int i2) {
        this.a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Feature feature = (Feature) obj;
                Feature feature2 = (Feature) obj2;
                Parcelable.Creator<ApiFeatureRequest> creator = ApiFeatureRequest.CREATOR;
                return !feature.a.equals(feature2.a) ? feature.a.compareTo(feature2.a) : (feature.a() > feature2.a() ? 1 : (feature.a() == feature2.a() ? 0 : -1));
            case 1:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 2:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            case 3:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int iMin = Math.min(str.length(), str2.length());
                int i2 = 4;
                while (true) {
                    if (i2 >= iMin) {
                        int length = str.length();
                        int length2 = str2.length();
                        if (length == length2) {
                            return 0;
                        }
                        if (length >= length2) {
                            return 1;
                        }
                    } else {
                        char cCharAt = str.charAt(i2);
                        char cCharAt2 = str2.charAt(i2);
                        if (cCharAt == cCharAt2) {
                            i2++;
                        } else if (yg0.q(cCharAt, cCharAt2) >= 0) {
                            return 1;
                        }
                    }
                }
                return -1;
            case 4:
                WeakHashMap weakHashMap = h.a;
                float fH = cn1.h((View) obj);
                float fH2 = cn1.h((View) obj2);
                if (fH > fH2) {
                    return -1;
                }
                return fH < fH2 ? 1 : 0;
            case 5:
                return ((xx) obj).a - ((xx) obj2).a;
            case 6:
                jb0 jb0Var = (jb0) obj;
                jb0 jb0Var2 = (jb0) obj2;
                RecyclerView recyclerView = jb0Var.d;
                if ((recyclerView == null) == (jb0Var2.d == null)) {
                    boolean z = jb0Var.a;
                    if (z == jb0Var2.a) {
                        int i3 = jb0Var2.b - jb0Var.b;
                        if (i3 != 0) {
                            return i3;
                        }
                        int i4 = jb0Var.c - jb0Var2.c;
                        if (i4 != 0) {
                            return i4;
                        }
                        return 0;
                    }
                    if (!z) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 7:
                return ((da1) obj).d - ((da1) obj2).d;
            case 8:
                return Integer.compare(((hj0) obj).a, ((hj0) obj2).a);
            case 9:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 10:
                return ((SolverVariable) obj).c - ((SolverVariable) obj2).c;
            case 11:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 12:
                return ((wn1) obj).b - ((wn1) obj2).b;
            case 13:
                return Float.compare(((iv1) obj).c, ((iv1) obj2).c);
            case 14:
                return ((iv1) obj).a - ((iv1) obj2).a;
            case 15:
                return Integer.compare(((iy1) obj).a.b, ((iy1) obj2).a.b);
            case 16:
                return Long.compare(((zzanq) obj).b, ((zzanq) obj2).b);
            case 17:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            case 18:
                o12 o12Var = (o12) obj;
                o12 o12Var2 = (o12) obj2;
                int i5 = o12Var.c - o12Var2.c;
                return i5 != 0 ? i5 : Long.compare(o12Var.a, o12Var2.a);
            case 19:
                zzfro zzfroVar = (zzfro) obj2;
                zzfro zzfroVar2 = (zzfro) obj;
                int iCompare = Double.compare(zzfroVar.e, zzfroVar2.e);
                return iCompare == 0 ? Long.compare(zzfroVar2.b, zzfroVar.b) : iCompare;
            case 20:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 21:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 22:
                List list = RequestConfiguration.zza;
                return list.indexOf((String) obj) - list.indexOf((String) obj2);
            case 23:
                return ((yk3) obj2).i - ((yk3) obj).i;
            default:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj;
                c7 c7Var = zzaaa.k;
                if (num2.intValue() == -1) {
                    return num.intValue() == -1 ? 0 : -1;
                }
                if (num.intValue() == -1) {
                    return 1;
                }
                return num2.intValue() - num.intValue();
        }
    }
}
