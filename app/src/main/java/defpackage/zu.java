package defpackage;

import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.io.path.CopyActionContext;
import kotlin.io.path.CopyActionResult;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zu implements CopyActionContext {
    public static final zu a = new zu();

    @Override // kotlin.io.path.CopyActionContext
    public final CopyActionResult copyToIgnoringExistingDirectory(Path path, Path path2, boolean z) {
        path.getClass();
        path2.getClass();
        LinkOption[] linkOptionArr = ok0.a;
        LinkOption[] linkOptionArr2 = z ? ok0.b : ok0.a;
        LinkOption[] linkOptionArr3 = (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length);
        if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr3, linkOptionArr3.length)) || !Files.isDirectory(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            CopyOption[] copyOptionArr = (CopyOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length);
            Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)).getClass();
        }
        return CopyActionResult.CONTINUE;
    }
}
