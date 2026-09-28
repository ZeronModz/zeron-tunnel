package defpackage;

import androidx.datastore.preferences.protobuf.WireFormat$FieldType;
import androidx.datastore.preferences.protobuf.WireFormat$JavaType;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class w50 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[WireFormat$FieldType.values().length];
        b = iArr;
        try {
            iArr[WireFormat$FieldType.DOUBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[WireFormat$FieldType.FLOAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[WireFormat$FieldType.INT64.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[WireFormat$FieldType.UINT64.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            b[WireFormat$FieldType.INT32.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            b[WireFormat$FieldType.FIXED64.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            b[WireFormat$FieldType.FIXED32.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            b[WireFormat$FieldType.BOOL.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            b[WireFormat$FieldType.GROUP.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            b[WireFormat$FieldType.MESSAGE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            b[WireFormat$FieldType.STRING.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            b[WireFormat$FieldType.BYTES.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            b[WireFormat$FieldType.UINT32.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            b[WireFormat$FieldType.SFIXED32.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            b[WireFormat$FieldType.SFIXED64.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            b[WireFormat$FieldType.SINT32.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            b[WireFormat$FieldType.SINT64.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            b[WireFormat$FieldType.ENUM.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        int[] iArr2 = new int[WireFormat$JavaType.values().length];
        a = iArr2;
        try {
            iArr2[WireFormat$JavaType.INT.ordinal()] = 1;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            a[WireFormat$JavaType.LONG.ordinal()] = 2;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            a[WireFormat$JavaType.FLOAT.ordinal()] = 3;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            a[WireFormat$JavaType.DOUBLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            a[WireFormat$JavaType.BOOLEAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            a[WireFormat$JavaType.STRING.ordinal()] = 6;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            a[WireFormat$JavaType.BYTE_STRING.ordinal()] = 7;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            a[WireFormat$JavaType.ENUM.ordinal()] = 8;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            a[WireFormat$JavaType.MESSAGE.ordinal()] = 9;
        } catch (NoSuchFieldError unused27) {
        }
    }
}
