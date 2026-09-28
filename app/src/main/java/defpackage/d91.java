package defpackage;

import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.dto.EConfigType;
import com.v2ray.ang.dto.ProfileItem;
import com.v2ray.ang.fmt.FmtBase;
import java.net.URI;
import java.util.List;
import kotlin.collections.c;
import kotlin.text.Regex;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d91 extends FmtBase {
    public static final d91 a = new d91();

    public final ProfileItem e(String str) {
        str.getClass();
        ProfileItem profileItemCreate = ProfileItem.INSTANCE.create(EConfigType.SOCKS);
        Regex regex = ul1.a;
        URI uri = new URI(ul1.e(str));
        if (qf3.n(uri).length() == 0 || uri.getPort() <= 0) {
            return null;
        }
        String fragment = uri.getFragment();
        if (fragment == null) {
            fragment = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        String strC = ul1.C(fragment);
        if (strC.length() == 0) {
            strC = "none";
        }
        profileItemCreate.setRemarks(strC);
        profileItemCreate.setServer(qf3.n(uri));
        profileItemCreate.setServerPort(String.valueOf(uri.getPort()));
        String userInfo = uri.getUserInfo();
        if (userInfo != null && userInfo.length() != 0) {
            List listO = g.O(ul1.b(uri.getUserInfo()), new String[]{":"}, 2);
            if (listO.size() == 2) {
                profileItemCreate.setUsername((String) c.r(listO));
                profileItemCreate.setPassword((String) c.x(listO));
            }
        }
        return profileItemCreate;
    }

    public final String f(ProfileItem profileItem) {
        String str = ":";
        if (qf3.C(profileItem.getUsername())) {
            str = profileItem.getUsername() + ":" + profileItem.getPassword();
        }
        Regex regex = ul1.a;
        return FmtBase.d(profileItem, ul1.c(str), null);
    }
}
