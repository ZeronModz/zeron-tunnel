package com.v2ray.ang.handler;

import com.v2ray.ang.dto.GitHubRelease;
import defpackage.hv;
import defpackage.lv;
import defpackage.oy;
import defpackage.u7;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.text.g;
import kotlinx.coroutines.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static Object a(boolean z, Continuation continuation) {
        lv lvVar = oy.a;
        return c.e(hv.c, new UpdateCheckerManager$checkForUpdate$2(z, null), continuation);
    }

    public static int b(String str) {
        List listO = g.O(str, new String[]{"."}, 6);
        List listO2 = g.O("v1.0.8.8", new String[]{"."}, 6);
        int iMax = Math.max(listO.size(), listO2.size());
        int i = 0;
        while (i < iMax) {
            int i2 = i < listO.size() ? Integer.parseInt((String) listO.get(i)) : 0;
            int i3 = i < listO2.size() ? Integer.parseInt((String) listO2.get(i)) : 0;
            if (i2 != i3) {
                return i2 - i3;
            }
            i++;
        }
        return 0;
    }

    public static String c(GitHubRelease gitHubRelease, String str) {
        Object next;
        String browserDownloadUrl;
        Iterator<T> it = gitHubRelease.getAssets().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (g.o(((GitHubRelease.Asset) next).getName(), str, false)) {
                break;
            }
        }
        GitHubRelease.Asset asset = (GitHubRelease.Asset) next;
        if (asset != null && (browserDownloadUrl = asset.getBrowserDownloadUrl()) != null) {
            return browserDownloadUrl;
        }
        GitHubRelease.Asset asset2 = (GitHubRelease.Asset) kotlin.collections.c.s(gitHubRelease.getAssets());
        if (asset2 != null) {
            return asset2.getBrowserDownloadUrl();
        }
        u7.p("No compatible APK found");
        return null;
    }
}
