package com.v2ray.ang.helper;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\u0005\u0006\u0004\u0003\u0002¨\u0006\b"}, d2 = {"Lcom/v2ray/ang/helper/Protocol;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "com/v2ray/ang/helper/e", "com/v2ray/ang/helper/d", "com/v2ray/ang/helper/c", "com/v2ray/ang/helper/a", "com/v2ray/ang/helper/b", "Companion", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class Protocol {
    public static final Companion a = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/v2ray/ang/helper/Protocol$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }

        public static Protocol a(String str) {
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -1020724598) {
                    if (iHashCode != -46999946) {
                        if (iHashCode == 81025038 && str.equals("V2ray")) {
                            return e.b;
                        }
                    } else if (str.equals("UDP Hysteria")) {
                        return b.b;
                    }
                } else if (str.equals("Slow DNS")) {
                    return a.b;
                }
            }
            return c.b;
        }
    }

    public Protocol(String str, xu xuVar) {
    }
}
