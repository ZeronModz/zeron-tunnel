package io.ktor.client.plugins.cache;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/client/plugins/cache/ValidateStatus;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;I)V", "ShouldValidate", "ShouldNotValidate", "ShouldWarn", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidateStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ValidateStatus[] $VALUES;
    public static final ValidateStatus ShouldValidate = new ValidateStatus("ShouldValidate", 0);
    public static final ValidateStatus ShouldNotValidate = new ValidateStatus("ShouldNotValidate", 1);
    public static final ValidateStatus ShouldWarn = new ValidateStatus("ShouldWarn", 2);

    private static final /* synthetic */ ValidateStatus[] $values() {
        return new ValidateStatus[]{ShouldValidate, ShouldNotValidate, ShouldWarn};
    }

    static {
        ValidateStatus[] validateStatusArr$values = $values();
        $VALUES = validateStatusArr$values;
        $ENTRIES = kotlin.enums.a.a(validateStatusArr$values);
    }

    private ValidateStatus(String str, int i) {
    }

    public static EnumEntries<ValidateStatus> getEntries() {
        return $ENTRIES;
    }

    public static ValidateStatus valueOf(String str) {
        return (ValidateStatus) Enum.valueOf(ValidateStatus.class, str);
    }

    public static ValidateStatus[] values() {
        return (ValidateStatus[]) $VALUES.clone();
    }
}
