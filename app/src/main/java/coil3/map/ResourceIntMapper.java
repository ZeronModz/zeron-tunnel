package coil3.map;

import android.content.res.Resources;
import coil3.Uri;
import coil3.request.Options;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.n8;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcoil3/map/ResourceIntMapper;", "Lcoil3/map/Mapper;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcoil3/Uri;", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResourceIntMapper implements Mapper<Integer, Uri> {
    @Override // coil3.map.Mapper
    public final Uri map(Integer num, Options options) {
        int iIntValue = num.intValue();
        try {
            if (options.a.getResources().getResourceEntryName(iIntValue) == null) {
                return null;
            }
            return n8.z("android.resource://" + options.a.getPackageName() + '/' + iIntValue);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
