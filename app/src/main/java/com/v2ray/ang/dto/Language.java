package com.v2ray.ang.dto;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import defpackage.yg0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/v2ray/ang/dto/Language;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "code", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "AUTO", "ENGLISH", "CHINA", "TRADITIONAL_CHINESE", "VIETNAMESE", "RUSSIAN", "PERSIAN", "ARABIC", "BANGLA", "BAKHTIARI", "Companion", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Language {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Language[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String code;
    public static final Language AUTO = new Language("AUTO", 0, "auto");
    public static final Language ENGLISH = new Language("ENGLISH", 1, "en");
    public static final Language CHINA = new Language("CHINA", 2, "zh-rCN");
    public static final Language TRADITIONAL_CHINESE = new Language("TRADITIONAL_CHINESE", 3, "zh-rTW");
    public static final Language VIETNAMESE = new Language("VIETNAMESE", 4, "vi");
    public static final Language RUSSIAN = new Language("RUSSIAN", 5, "ru");
    public static final Language PERSIAN = new Language("PERSIAN", 6, "fa");
    public static final Language ARABIC = new Language("ARABIC", 7, "ar");
    public static final Language BANGLA = new Language("BANGLA", 8, "bn");
    public static final Language BAKHTIARI = new Language("BAKHTIARI", 9, "bqi-rIR");

    private static final /* synthetic */ Language[] $values() {
        return new Language[]{AUTO, ENGLISH, CHINA, TRADITIONAL_CHINESE, VIETNAMESE, RUSSIAN, PERSIAN, ARABIC, BANGLA, BAKHTIARI};
    }

    static {
        Language[] languageArr$values = $values();
        $VALUES = languageArr$values;
        $ENTRIES = a.a(languageArr$values);
        INSTANCE = new Companion(null);
    }

    private Language(String str, int i, String str2) {
        this.code = str2;
    }

    public static EnumEntries<Language> getEntries() {
        return $ENTRIES;
    }

    public static Language valueOf(String str) {
        return (Language) Enum.valueOf(Language.class, str);
    }

    public static Language[] values() {
        return (Language[]) $VALUES.clone();
    }

    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/v2ray/ang/dto/Language$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "fromCode", "Lcom/v2ray/ang/dto/Language;", "code", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(xu xuVar) {
            this();
        }

        public final Language fromCode(String code) {
            Language next;
            code.getClass();
            Iterator<Language> it = Language.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (yg0.a(next.getCode(), code)) {
                    break;
                }
            }
            Language language = next;
            return language == null ? Language.AUTO : language;
        }

        private Companion() {
        }
    }
}
