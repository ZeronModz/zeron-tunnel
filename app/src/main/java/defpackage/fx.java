package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder;
import androidx.datastore.preferences.protobuf.k1;
import androidx.datastore.preferences.protobuf.y1;
import java.util.DesugarCollections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fx extends y1 implements DescriptorProtos$SourceCodeInfo$LocationOrBuilder {
    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final String getLeadingComments() {
        return ((k1) this.b).getLeadingComments();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final ByteString getLeadingCommentsBytes() {
        return ((k1) this.b).getLeadingCommentsBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final String getLeadingDetachedComments(int i) {
        return ((k1) this.b).getLeadingDetachedComments(i);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final ByteString getLeadingDetachedCommentsBytes(int i) {
        return ((k1) this.b).getLeadingDetachedCommentsBytes(i);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final int getLeadingDetachedCommentsCount() {
        return ((k1) this.b).getLeadingDetachedCommentsCount();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final List getLeadingDetachedCommentsList() {
        return DesugarCollections.unmodifiableList(((k1) this.b).getLeadingDetachedCommentsList());
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final int getPath(int i) {
        return ((k1) this.b).getPath(i);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final int getPathCount() {
        return ((k1) this.b).getPathCount();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final List getPathList() {
        return DesugarCollections.unmodifiableList(((k1) this.b).getPathList());
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final int getSpan(int i) {
        return ((k1) this.b).getSpan(i);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final int getSpanCount() {
        return ((k1) this.b).getSpanCount();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final List getSpanList() {
        return DesugarCollections.unmodifiableList(((k1) this.b).getSpanList());
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final String getTrailingComments() {
        return ((k1) this.b).getTrailingComments();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final ByteString getTrailingCommentsBytes() {
        return ((k1) this.b).getTrailingCommentsBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final boolean hasLeadingComments() {
        return ((k1) this.b).hasLeadingComments();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
    public final boolean hasTrailingComments() {
        return ((k1) this.b).hasTrailingComments();
    }
}
