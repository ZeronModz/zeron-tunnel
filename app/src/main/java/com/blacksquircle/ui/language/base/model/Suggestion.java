package com.blacksquircle.ui.language.base.model;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/blacksquircle/ui/language/base/model/Suggestion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcom/blacksquircle/ui/language/base/model/Suggestion$Type;", "type", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "text", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "returnType", "<init>", "(Lcom/blacksquircle/ui/language/base/model/Suggestion$Type;Ljava/lang/CharSequence;Ljava/lang/String;)V", "Type", "language-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Suggestion {
    public final Type a;
    public final CharSequence b;
    public final String c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/blacksquircle/ui/language/base/model/Suggestion$Type;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "value", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FIELD", "METHOD", "WORD", "NONE", "language-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private final String value;
        public static final Type FIELD = new Type("FIELD", 0, "v");
        public static final Type METHOD = new Type("METHOD", 1, "m");
        public static final Type WORD = new Type("WORD", 2, "w");
        public static final Type NONE = new Type("NONE", 3, "none");

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{FIELD, METHOD, WORD, NONE};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = a.a(typeArr$values);
        }

        private Type(String str, int i, String str2) {
            this.value = str2;
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    public Suggestion(Type type, CharSequence charSequence, String str) {
        type.getClass();
        charSequence.getClass();
        str.getClass();
        this.a = type;
        this.b = charSequence;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Suggestion)) {
            return false;
        }
        Suggestion suggestion = (Suggestion) obj;
        return this.a == suggestion.a && this.b.equals(suggestion.b) && this.c.equals(suggestion.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return this.b.toString();
    }
}
