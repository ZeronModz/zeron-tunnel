package defpackage;

import androidx.datastore.preferences.protobuf.DescriptorProtos$Edition;
import androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions$VerificationState;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSet$EnumType;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSet$FieldPresence;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSet$JsonFormat;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSet$MessageEncoding;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSet$RepeatedFieldEncoding;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSet$Utf8Validation;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProto$Label;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProto$Type;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$CType;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$JSType;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$OptionRetention;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$OptionTargetType;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptions$OptimizeMode;
import androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$Annotation$Semantic;
import androidx.datastore.preferences.protobuf.DescriptorProtos$MethodOptions$IdempotencyLevel;
import androidx.datastore.preferences.protobuf.Field$Cardinality;
import androidx.datastore.preferences.protobuf.Field$Kind;
import androidx.datastore.preferences.protobuf.Internal$EnumVerifier;
import androidx.datastore.preferences.protobuf.JavaFeaturesProto$JavaFeatures$Utf8Validation;
import androidx.datastore.preferences.protobuf.NullValue;
import androidx.datastore.preferences.protobuf.Syntax;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pw implements Internal$EnumVerifier {
    public static final pw b = new pw(0);
    public static final pw c = new pw(1);
    public static final pw d = new pw(2);
    public static final pw e = new pw(3);
    public static final pw f = new pw(4);
    public static final pw g = new pw(5);
    public static final pw h = new pw(6);
    public static final pw i = new pw(7);
    public static final pw j = new pw(8);
    public static final pw k = new pw(9);
    public static final pw l = new pw(10);
    public static final pw m = new pw(11);
    public static final pw n = new pw(12);
    public static final pw o = new pw(13);
    public static final pw p = new pw(14);
    public static final pw q = new pw(15);
    public static final pw r = new pw(16);
    public static final pw s = new pw(17);
    public static final pw t = new pw(18);
    public static final pw u = new pw(19);
    public static final pw v = new pw(20);
    public static final pw w = new pw(21);
    public final /* synthetic */ int a;

    public /* synthetic */ pw(int i2) {
        this.a = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumVerifier
    public final boolean isInRange(int i2) {
        switch (this.a) {
            case 0:
                if (DescriptorProtos$Edition.forNumber(i2) != null) {
                }
                break;
            case 1:
                if (DescriptorProtos$ExtensionRangeOptions$VerificationState.forNumber(i2) != null) {
                }
                break;
            case 2:
                if (DescriptorProtos$FeatureSet$EnumType.forNumber(i2) != null) {
                }
                break;
            case 3:
                if (DescriptorProtos$FeatureSet$FieldPresence.forNumber(i2) != null) {
                }
                break;
            case 4:
                if (DescriptorProtos$FeatureSet$JsonFormat.forNumber(i2) != null) {
                }
                break;
            case 5:
                if (DescriptorProtos$FeatureSet$MessageEncoding.forNumber(i2) != null) {
                }
                break;
            case 6:
                if (DescriptorProtos$FeatureSet$RepeatedFieldEncoding.forNumber(i2) != null) {
                }
                break;
            case 7:
                if (DescriptorProtos$FeatureSet$Utf8Validation.forNumber(i2) != null) {
                }
                break;
            case 8:
                if (DescriptorProtos$FieldDescriptorProto$Label.forNumber(i2) != null) {
                }
                break;
            case 9:
                if (DescriptorProtos$FieldDescriptorProto$Type.forNumber(i2) != null) {
                }
                break;
            case 10:
                if (DescriptorProtos$FieldOptions$CType.forNumber(i2) != null) {
                }
                break;
            case 11:
                if (DescriptorProtos$FieldOptions$JSType.forNumber(i2) != null) {
                }
                break;
            case 12:
                if (DescriptorProtos$FieldOptions$OptionRetention.forNumber(i2) != null) {
                }
                break;
            case 13:
                if (DescriptorProtos$FieldOptions$OptionTargetType.forNumber(i2) != null) {
                }
                break;
            case 14:
                if (DescriptorProtos$FileOptions$OptimizeMode.forNumber(i2) != null) {
                }
                break;
            case 15:
                if (DescriptorProtos$GeneratedCodeInfo$Annotation$Semantic.forNumber(i2) != null) {
                }
                break;
            case 16:
                if (DescriptorProtos$MethodOptions$IdempotencyLevel.forNumber(i2) != null) {
                }
                break;
            case 17:
                if (Field$Cardinality.forNumber(i2) != null) {
                }
                break;
            case 18:
                if (Field$Kind.forNumber(i2) != null) {
                }
                break;
            case 19:
                if (JavaFeaturesProto$JavaFeatures$Utf8Validation.forNumber(i2) != null) {
                }
                break;
            case 20:
                if (NullValue.forNumber(i2) != null) {
                }
                break;
            default:
                if (Syntax.forNumber(i2) != null) {
                }
                break;
        }
        return false;
    }
}
