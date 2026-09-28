package defpackage;

import android.widget.ProgressBar;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.button.MaterialButton;
import com.v2ray.ang.ui.HomeFragment;
import io.ktor.http.ContentType;
import io.ktor.http.content.OutgoingContent;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.EmptyList;
import kotlin.collections.c;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class id0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ id0(Object obj, int i, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws JSONException {
        String string;
        String string2;
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                HomeFragment homeFragment = (HomeFragment) obj4;
                ProgressBar progressBar = (ProgressBar) obj3;
                MaterialButton materialButton = (MaterialButton) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i2 = HomeFragment.f2;
                if (zBooleanValue) {
                    Lazy lazy = zq0.a;
                    zq0.u().i("CurrentVoucher", homeFragment.I1);
                    homeFragment.C0();
                } else {
                    homeFragment.C0();
                }
                progressBar.setVisibility(8);
                materialButton.setVisibility(0);
                return mk1.a;
            default:
                OutgoingContent outgoingContent = (OutgoingContent) obj4;
                Function1 function1 = (Function1) obj3;
                Function1 function12 = (Function1) obj2;
                String str = (String) obj;
                str.getClass();
                List list = le0.a;
                if (str.equals("Content-Length")) {
                    Long c = outgoingContent.getC();
                    if (c != null && (string2 = c.toString()) != null) {
                        return string2;
                    }
                } else {
                    if (!str.equals("Content-Type")) {
                        if (!str.equals("User-Agent")) {
                            List<String> all = outgoingContent.c().getAll(str);
                            if (all == null && (all = (List) function12.invoke(str)) == null) {
                                all = EmptyList.INSTANCE;
                            }
                            return c.w(all, ";", null, null, null, 62);
                        }
                        String str2 = outgoingContent.c().get("User-Agent");
                        if (str2 != null) {
                            return str2;
                        }
                        String str3 = (String) function1.invoke("User-Agent");
                        if (str3 != null) {
                            return str3;
                        }
                        Set set = io.ktor.client.engine.c.a;
                        return "ktor-client";
                    }
                    ContentType b = outgoingContent.getB();
                    if (b != null && (string = b.toString()) != null) {
                        return string;
                    }
                }
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }
}
