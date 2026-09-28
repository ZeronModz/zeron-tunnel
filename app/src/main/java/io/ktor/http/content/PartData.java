package io.ktor.http.content;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import defpackage.xu;
import defpackage.yq0;
import io.ktor.http.ContentDisposition;
import io.ktor.http.ContentType;
import io.ktor.http.HeaderValue;
import io.ktor.http.HeaderValueWithParameters;
import io.ktor.http.Headers;
import io.ktor.http.b;
import io.ktor.http.content.PartData;
import io.ktor.utils.io.ByteReadChannel;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.c;
import kotlin.jvm.functions.Function0;
import kotlinx.io.Source;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lio/ktor/http/content/PartData;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "FormItem", "FileItem", "BinaryItem", "BinaryChannelItem", "Lio/ktor/http/content/PartData$BinaryChannelItem;", "Lio/ktor/http/content/PartData$BinaryItem;", "Lio/ktor/http/content/PartData$FileItem;", "Lio/ktor/http/content/PartData$FormItem;", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PartData {
    public final Function0 a;
    public final Headers b;
    public final Lazy c;
    public final Lazy d;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/http/content/PartData$BinaryChannelItem;", "Lio/ktor/http/content/PartData;", "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "provider", "Lio/ktor/http/Headers;", "partHeaders", "<init>", "(Lkotlin/jvm/functions/Function0;Lio/ktor/http/Headers;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BinaryChannelItem extends PartData {
        public final Function0 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BinaryChannelItem(Function0<? extends ByteReadChannel> function0, Headers headers) {
            super(new yq0(10), headers, null);
            function0.getClass();
            headers.getClass();
            this.e = function0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/http/content/PartData$BinaryItem;", "Lio/ktor/http/content/PartData;", "Lkotlin/Function0;", "Lkotlinx/io/Source;", "Lio/ktor/utils/io/core/Input;", "provider", "Lmk1;", "dispose", "Lio/ktor/http/Headers;", "partHeaders", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lio/ktor/http/Headers;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BinaryItem extends PartData {
        public final Function0 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BinaryItem(Function0<? extends Source> function0, Function0<mk1> function02, Headers headers) {
            super(function02, headers, null);
            function0.getClass();
            function02.getClass();
            headers.getClass();
            this.e = function0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/http/content/PartData$FileItem;", "Lio/ktor/http/content/PartData;", "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "provider", "Lmk1;", "dispose", "Lio/ktor/http/Headers;", "partHeaders", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lio/ktor/http/Headers;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FileItem extends PartData {
        public final Function0 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileItem(Function0<? extends ByteReadChannel> function0, Function0<mk1> function02, Headers headers) {
            super(function02, headers, null);
            function0.getClass();
            function02.getClass();
            headers.getClass();
            this.e = function0;
            ContentDisposition contentDisposition = (ContentDisposition) this.c.getValue();
            if (contentDisposition != null) {
                contentDisposition.a("filename");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/http/content/PartData$FormItem;", "Lio/ktor/http/content/PartData;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "value", "Lkotlin/Function0;", "Lmk1;", "dispose", "Lio/ktor/http/Headers;", "partHeaders", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lio/ktor/http/Headers;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FormItem extends PartData {
        public final String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FormItem(String str, Function0<mk1> function0, Headers headers) {
            super(function0, headers, null);
            str.getClass();
            function0.getClass();
            headers.getClass();
            this.e = str;
        }
    }

    public PartData(Function0 function0, Headers headers, xu xuVar) {
        this.a = function0;
        this.b = headers;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i = 0;
        this.c = c.a(lazyThreadSafetyMode, new Function0(this) { // from class: fw0
            public final /* synthetic */ PartData b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PartData partData = this.b;
                switch (i2) {
                    case 0:
                        Headers headers2 = partData.b;
                        List list = le0.a;
                        String str = headers2.get("Content-Disposition");
                        if (str == null) {
                            return null;
                        }
                        ContentDisposition.d.getClass();
                        int i3 = HeaderValueWithParameters.c;
                        HeaderValue headerValue = (HeaderValue) kotlin.collections.c.x(b.a(str));
                        return new ContentDisposition(headerValue.a, headerValue.b);
                    default:
                        Headers headers3 = partData.b;
                        List list2 = le0.a;
                        String str2 = headers3.get("Content-Type");
                        if (str2 == null) {
                            return null;
                        }
                        ContentType.f.getClass();
                        return ContentType.Companion.a(str2);
                }
            }
        });
        final int i2 = 1;
        this.d = c.a(lazyThreadSafetyMode, new Function0(this) { // from class: fw0
            public final /* synthetic */ PartData b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PartData partData = this.b;
                switch (i22) {
                    case 0:
                        Headers headers2 = partData.b;
                        List list = le0.a;
                        String str = headers2.get("Content-Disposition");
                        if (str == null) {
                            return null;
                        }
                        ContentDisposition.d.getClass();
                        int i3 = HeaderValueWithParameters.c;
                        HeaderValue headerValue = (HeaderValue) kotlin.collections.c.x(b.a(str));
                        return new ContentDisposition(headerValue.a, headerValue.b);
                    default:
                        Headers headers3 = partData.b;
                        List list2 = le0.a;
                        String str2 = headers3.get("Content-Type");
                        if (str2 == null) {
                            return null;
                        }
                        ContentType.f.getClass();
                        return ContentType.Companion.a(str2);
                }
            }
        });
    }
}
