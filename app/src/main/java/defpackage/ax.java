package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$Annotation$Semantic;
import androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder;
import androidx.datastore.preferences.protobuf.y0;
import androidx.datastore.preferences.protobuf.y1;
import java.util.DesugarCollections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ax extends y1 implements DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder {
    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final int getBegin() {
        return ((y0) this.b).getBegin();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final int getEnd() {
        return ((y0) this.b).getEnd();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final int getPath(int i) {
        return ((y0) this.b).getPath(i);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final int getPathCount() {
        return ((y0) this.b).getPathCount();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final List getPathList() {
        return DesugarCollections.unmodifiableList(((y0) this.b).getPathList());
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final DescriptorProtos$GeneratedCodeInfo$Annotation$Semantic getSemantic() {
        return ((y0) this.b).getSemantic();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final String getSourceFile() {
        return ((y0) this.b).getSourceFile();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final ByteString getSourceFileBytes() {
        return ((y0) this.b).getSourceFileBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final boolean hasBegin() {
        return ((y0) this.b).hasBegin();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final boolean hasEnd() {
        return ((y0) this.b).hasEnd();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final boolean hasSemantic() {
        return ((y0) this.b).hasSemantic();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
    public final boolean hasSourceFile() {
        return ((y0) this.b).hasSourceFile();
    }
}
