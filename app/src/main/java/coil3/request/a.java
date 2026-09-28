package coil3.request;

import coil3.Extras;
import coil3.size.Size;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.cy;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Extras.Key a = new Extras.Key(EmptyList.INSTANCE);
    public static final Extras.Key b = new Extras.Key(new Size(new cy(AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE), new cy(AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE)));
    public static final Extras.Key c = new Extras.Key(Boolean.FALSE);
    public static final Extras.Key d = new Extras.Key(Boolean.TRUE);
}
