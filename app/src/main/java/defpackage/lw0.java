package defpackage;

import androidx.appcompat.widget.SearchView;
import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.dto.AppInfo;
import com.v2ray.ang.ui.PerAppProxyActivity;
import com.v2ray.ang.ui.PerAppProxyAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class lw0 implements SearchView.OnQueryTextListener {
    public final /* synthetic */ PerAppProxyActivity a;

    public lw0(PerAppProxyActivity perAppProxyActivity) {
        this.a = perAppProxyActivity;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String str) {
        if (str == null) {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        int i = PerAppProxyActivity.f;
        ArrayList arrayList = new ArrayList();
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int length = upperCase.length();
        PerAppProxyActivity perAppProxyActivity = this.a;
        List<AppInfo> list = perAppProxyActivity.e;
        if (length > 0) {
            if (list != null) {
                for (AppInfo appInfo : list) {
                    String appName = appInfo.getAppName();
                    Locale locale = Locale.ROOT;
                    String upperCase2 = appName.toUpperCase(locale);
                    upperCase2.getClass();
                    if (g.z(upperCase2, upperCase, 0, false, 6) < 0) {
                        String upperCase3 = appInfo.getPackageName().toUpperCase(locale);
                        upperCase3.getClass();
                        if (g.z(upperCase3, upperCase, 0, false, 6) >= 0) {
                        }
                    }
                    arrayList.add(appInfo);
                }
            }
        } else if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((AppInfo) it.next());
            }
        }
        PerAppProxyAdapter perAppProxyAdapter = perAppProxyActivity.d;
        perAppProxyActivity.d = new PerAppProxyAdapter(perAppProxyActivity, arrayList, perAppProxyAdapter != null ? perAppProxyAdapter.e : null);
        perAppProxyActivity.h().d.setAdapter(perAppProxyActivity.d);
        PerAppProxyAdapter perAppProxyAdapter2 = perAppProxyActivity.d;
        if (perAppProxyAdapter2 != null) {
            perAppProxyAdapter2.f();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextSubmit(String str) {
        return false;
    }
}
