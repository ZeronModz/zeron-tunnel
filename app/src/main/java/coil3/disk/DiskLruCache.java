package coil3.disk;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.b60;
import defpackage.hv;
import defpackage.hy;
import defpackage.jy;
import defpackage.lv;
import defpackage.oy;
import defpackage.p60;
import defpackage.t;
import defpackage.u7;
import defpackage.vh;
import defpackage.xu;
import defpackage.yg0;
import defpackage.zr;
import defpackage.zu0;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.Regex;
import kotlin.text.g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.c;
import kotlinx.coroutines.internal.ContextScope;
import okio.FileSystem;
import okio.Path;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.f;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0010\u0011\u0012\u0013B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcoil3/disk/DiskLruCache;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lokio/FileSystem;", "fileSystem", "Lokio/Path;", "directory", "Lkotlin/coroutines/CoroutineContext;", "cleanupCoroutineContext", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "maxSize", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "appVersion", "valueCount", "<init>", "(Lokio/FileSystem;Lokio/Path;Lkotlin/coroutines/CoroutineContext;JII)V", "Snapshot", "Editor", "Entry", "Companion", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiskLruCache implements AutoCloseable {
    public static final Regex t;
    public final Path a;
    public final long b;
    public final int c;
    public final int d;
    public final Path e;
    public final Path f;
    public final Path g;
    public final LinkedHashMap h;
    public final ContextScope i;
    public final Object j;
    public long k;
    public int l;
    public RealBufferedSink m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final jy s;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcoil3/disk/DiskLruCache$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "CLEAN", "Ljava/lang/String;", "DIRTY", "REMOVE", "READ", "Lkotlin/text/Regex;", "LEGAL_KEY_PATTERN", "Lkotlin/text/Regex;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcoil3/disk/DiskLruCache$Editor;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcoil3/disk/DiskLruCache$Entry;", "Lcoil3/disk/DiskLruCache;", "entry", "<init>", "(Lcoil3/disk/DiskLruCache;Lcoil3/disk/DiskLruCache$Entry;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Editor {
        public final Entry a;
        public boolean b;
        public final boolean[] c;

        public Editor(Entry entry) {
            this.a = entry;
            this.c = new boolean[DiskLruCache.this.d];
        }

        public final void a(boolean z) {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache.j) {
                try {
                    if (this.b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (yg0.a(this.a.g, this)) {
                        diskLruCache.a(this, z);
                    }
                    this.b = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final Path b(int i) {
            Path path;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache.j) {
                if (this.b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.c[i] = true;
                Object obj = this.a.d.get(i);
                jy jyVar = diskLruCache.s;
                Path path2 = (Path) obj;
                if (!jyVar.g(path2)) {
                    try {
                        jyVar.n(path2, false).close();
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused) {
                    }
                }
                path = (Path) obj;
            }
            return path;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcoil3/disk/DiskLruCache$Entry;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "key", "<init>", "(Lcoil3/disk/DiskLruCache;Ljava/lang/String;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Entry {
        public final String a;
        public final long[] b;
        public final ArrayList c;
        public final ArrayList d;
        public boolean e;
        public boolean f;
        public Editor g;
        public int h;

        public Entry(String str) {
            this.a = str;
            this.b = new long[DiskLruCache.this.d];
            this.c = new ArrayList(DiskLruCache.this.d);
            this.d = new ArrayList(DiskLruCache.this.d);
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int i = DiskLruCache.this.d;
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(i2);
                this.c.add(DiskLruCache.this.a.e(sb.toString()));
                sb.append(".tmp");
                this.d.add(DiskLruCache.this.a.e(sb.toString()));
                sb.setLength(length);
            }
        }

        public final Snapshot a() {
            if (!this.e || this.g != null || this.f) {
                return null;
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                DiskLruCache diskLruCache = DiskLruCache.this;
                if (i >= size) {
                    this.h++;
                    return diskLruCache.new Snapshot(this);
                }
                if (!diskLruCache.s.g((Path) arrayList.get(i))) {
                    try {
                        diskLruCache.j(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
                i++;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcoil3/disk/DiskLruCache$Snapshot;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lcoil3/disk/DiskLruCache$Entry;", "Lcoil3/disk/DiskLruCache;", "entry", "<init>", "(Lcoil3/disk/DiskLruCache;Lcoil3/disk/DiskLruCache$Entry;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Snapshot implements AutoCloseable {
        public final Entry a;
        public boolean b;

        public Snapshot(Entry entry) {
            this.a = entry;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            if (this.b) {
                return;
            }
            this.b = true;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache.j) {
                Entry entry = this.a;
                int i = entry.h - 1;
                entry.h = i;
                if (i == 0 && entry.f) {
                    diskLruCache.j(entry);
                }
            }
        }
    }

    static {
        new Companion(null);
        t = new Regex("[a-z0-9_-]{1,120}");
    }

    public DiskLruCache(FileSystem fileSystem, Path path, CoroutineContext coroutineContext, long j, int i, int i2) {
        this.a = path;
        this.b = j;
        this.c = i;
        this.d = i2;
        if (j <= 0) {
            u7.r("maxSize <= 0");
            throw null;
        }
        if (i2 <= 0) {
            u7.r("valueCount <= 0");
            throw null;
        }
        this.e = path.e("journal");
        this.f = path.e("journal.tmp");
        this.g = path.e("journal.bkp");
        this.h = new LinkedHashMap(0, 0.75f, true);
        CoroutineContext coroutineContextPlus = coroutineContext.plus(kotlinx.coroutines.a.c());
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) coroutineContext.get(CoroutineDispatcher.b);
        if (coroutineDispatcher == null) {
            lv lvVar = oy.a;
            coroutineDispatcher = hv.c;
        }
        this.i = zr.a(coroutineContextPlus.plus(coroutineDispatcher.d(1)));
        this.j = new Object();
        this.s = new jy(fileSystem);
    }

    public static void l(String str) {
        if (t.matches(str)) {
            return;
        }
        zu0.e(vh.f('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x011d A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0010, B:10:0x0014, B:12:0x0019, B:14:0x001f, B:16:0x002f, B:22:0x003a, B:24:0x003f, B:27:0x0059, B:35:0x0075, B:37:0x0083, B:39:0x008a, B:28:0x005d, B:30:0x006b, B:31:0x006f, B:34:0x0074, B:43:0x00ac, B:45:0x00b3, B:48:0x00b8, B:50:0x00c9, B:53:0x00ce, B:58:0x0109, B:60:0x0114, B:64:0x011d, B:54:0x00e6, B:56:0x00fb, B:57:0x0106, B:40:0x0097, B:42:0x009c, B:67:0x0122, B:68:0x0129), top: B:72:0x0003, inners: #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(coil3.disk.DiskLruCache.Editor r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.disk.DiskLruCache.a(coil3.disk.DiskLruCache$Editor, boolean):void");
    }

    public final Editor b(String str) {
        synchronized (this.j) {
            if (this.p) {
                throw new IllegalStateException("cache is closed");
            }
            l(str);
            d();
            Entry entry = (Entry) this.h.get(str);
            if ((entry != null ? entry.g : null) != null) {
                return null;
            }
            if (entry != null && entry.h != 0) {
                return null;
            }
            if (!this.q && !this.r) {
                RealBufferedSink realBufferedSink = this.m;
                realBufferedSink.getClass();
                realBufferedSink.writeUtf8("DIRTY");
                realBufferedSink.writeByte(32);
                realBufferedSink.writeUtf8(str);
                realBufferedSink.writeByte(10);
                realBufferedSink.flush();
                if (this.n) {
                    return null;
                }
                if (entry == null) {
                    entry = new Entry(str);
                    this.h.put(str, entry);
                }
                Editor editor = new Editor(entry);
                entry.g = editor;
                return editor;
            }
            e();
            return null;
        }
    }

    public final Snapshot c(String str) {
        Snapshot snapshotA;
        synchronized (this.j) {
            if (this.p) {
                throw new IllegalStateException("cache is closed");
            }
            l(str);
            d();
            Entry entry = (Entry) this.h.get(str);
            if (entry != null && (snapshotA = entry.a()) != null) {
                boolean z = true;
                this.l++;
                RealBufferedSink realBufferedSink = this.m;
                realBufferedSink.getClass();
                realBufferedSink.writeUtf8("READ");
                realBufferedSink.writeByte(32);
                realBufferedSink.writeUtf8(str);
                realBufferedSink.writeByte(10);
                realBufferedSink.flush();
                if (this.l < 2000) {
                    z = false;
                }
                if (z) {
                    e();
                }
                return snapshotA;
            }
            return null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.j) {
            try {
                if (this.o && !this.p) {
                    for (Entry entry : (Entry[]) this.h.values().toArray(new Entry[0])) {
                        Editor editor = entry.g;
                        if (editor != null) {
                            Entry entry2 = editor.a;
                            if (yg0.a(entry2.g, editor)) {
                                entry2.f = true;
                            }
                        }
                    }
                    k();
                    zr.b(this.i, null);
                    RealBufferedSink realBufferedSink = this.m;
                    realBufferedSink.getClass();
                    realBufferedSink.close();
                    this.m = null;
                    this.p = true;
                    return;
                }
                this.p = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.j) {
            try {
                if (this.o) {
                    return;
                }
                this.s.f(this.f);
                if (this.s.g(this.g)) {
                    boolean zG = this.s.g(this.e);
                    jy jyVar = this.s;
                    Path path = this.g;
                    if (zG) {
                        jyVar.f(path);
                    } else {
                        jyVar.b(path, this.e);
                    }
                }
                if (this.s.g(this.e)) {
                    try {
                        h();
                        g();
                        this.o = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            b60.a(this.a, this.s);
                            this.p = false;
                            m();
                            this.o = true;
                        } catch (Throwable th) {
                            this.p = false;
                            throw th;
                        }
                    }
                }
                m();
                this.o = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        c.d(this.i, null, null, new DiskLruCache$launchCleanup$1(this, null), 3);
    }

    public final RealBufferedSink f() {
        jy jyVar = this.s;
        jyVar.getClass();
        Path path = this.e;
        path.getClass();
        return new RealBufferedSink(new FaultHidingSink(jyVar.c.a(path), new t(this, 4)));
    }

    public final void g() {
        Iterator it = this.h.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            Editor editor = entry.g;
            int i = this.d;
            int i2 = 0;
            if (editor == null) {
                while (i2 < i) {
                    j += entry.b[i2];
                    i2++;
                }
            } else {
                entry.g = null;
                while (i2 < i) {
                    Path path = (Path) entry.c.get(i2);
                    jy jyVar = this.s;
                    jyVar.f(path);
                    jyVar.f((Path) entry.d.get(i2));
                    i2++;
                }
                it.remove();
            }
        }
        this.k = j;
    }

    public final void h() throws Throwable {
        RealBufferedSource realBufferedSourceB = f.b(this.s.o(this.e));
        try {
            String utf8LineStrict = realBufferedSourceB.readUtf8LineStrict(Long.MAX_VALUE);
            String utf8LineStrict2 = realBufferedSourceB.readUtf8LineStrict(Long.MAX_VALUE);
            String utf8LineStrict3 = realBufferedSourceB.readUtf8LineStrict(Long.MAX_VALUE);
            String utf8LineStrict4 = realBufferedSourceB.readUtf8LineStrict(Long.MAX_VALUE);
            String utf8LineStrict5 = realBufferedSourceB.readUtf8LineStrict(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(utf8LineStrict) || !"1".equals(utf8LineStrict2) || !yg0.a(String.valueOf(this.c), utf8LineStrict3) || !yg0.a(String.valueOf(this.d), utf8LineStrict4) || utf8LineStrict5.length() > 0) {
                throw new IOException("unexpected journal header: [" + utf8LineStrict + ", " + utf8LineStrict2 + ", " + utf8LineStrict3 + ", " + utf8LineStrict4 + ", " + utf8LineStrict5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    i(realBufferedSourceB.readUtf8LineStrict(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.l = i - this.h.size();
                    if (realBufferedSourceB.exhausted()) {
                        this.m = f();
                    } else {
                        m();
                    }
                    try {
                        realBufferedSourceB.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                realBufferedSourceB.close();
            } catch (Throwable th3) {
                b.a(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public final void i(String str) throws IOException {
        String strSubstring;
        int iY = g.y(str, ' ', 0, 6);
        if (iY == -1) {
            p60.f("unexpected journal line: ".concat(str));
            return;
        }
        int i = iY + 1;
        int iY2 = g.y(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.h;
        if (iY2 == -1) {
            strSubstring = str.substring(i);
            if (iY == 6 && g.R(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iY2);
        }
        Object entry = linkedHashMap.get(strSubstring);
        if (entry == null) {
            entry = new Entry(strSubstring);
            linkedHashMap.put(strSubstring, entry);
        }
        Entry entry2 = (Entry) entry;
        if (iY2 == -1 || iY != 5 || !g.R(str, "CLEAN", false)) {
            if (iY2 == -1 && iY == 5 && g.R(str, "DIRTY", false)) {
                entry2.g = new Editor(entry2);
                return;
            } else {
                if (iY2 == -1 && iY == 4 && g.R(str, "READ", false)) {
                    return;
                }
                p60.f("unexpected journal line: ".concat(str));
                return;
            }
        }
        List listP = g.P(new char[]{' '}, str.substring(iY2 + 1));
        entry2.e = true;
        entry2.g = null;
        if (listP.size() != DiskLruCache.this.d) {
            hy.e(listP, "unexpected journal line: ");
            return;
        }
        try {
            int size = listP.size();
            for (int i2 = 0; i2 < size; i2++) {
                entry2.b[i2] = Long.parseLong((String) listP.get(i2));
            }
        } catch (NumberFormatException unused) {
            hy.e(listP, "unexpected journal line: ");
        }
    }

    public final void j(Entry entry) {
        RealBufferedSink realBufferedSink;
        int i = entry.h;
        String str = entry.a;
        if (i > 0 && (realBufferedSink = this.m) != null) {
            realBufferedSink.writeUtf8("DIRTY");
            realBufferedSink.writeByte(32);
            realBufferedSink.writeUtf8(str);
            realBufferedSink.writeByte(10);
            realBufferedSink.flush();
        }
        if (entry.h > 0 || entry.g != null) {
            entry.f = true;
            return;
        }
        for (int i2 = 0; i2 < this.d; i2++) {
            this.s.f((Path) entry.c.get(i2));
            long j = this.k;
            long[] jArr = entry.b;
            this.k = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.l++;
        RealBufferedSink realBufferedSink2 = this.m;
        if (realBufferedSink2 != null) {
            realBufferedSink2.writeUtf8("REMOVE");
            realBufferedSink2.writeByte(32);
            realBufferedSink2.writeUtf8(str);
            realBufferedSink2.writeByte(10);
            realBufferedSink2.flush();
        }
        this.h.remove(str);
        if (this.l >= 2000) {
            e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        j(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            r4 = this;
        L0:
            long r0 = r4.k
            long r2 = r4.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.h
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            coil3.disk.DiskLruCache$Entry r1 = (coil3.disk.DiskLruCache.Entry) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.j(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.disk.DiskLruCache.k():void");
    }

    public final void m() {
        synchronized (this.j) {
            try {
                RealBufferedSink realBufferedSink = this.m;
                if (realBufferedSink != null) {
                    realBufferedSink.close();
                }
                Sink sinkN = this.s.n(this.f, false);
                sinkN.getClass();
                RealBufferedSink realBufferedSink2 = new RealBufferedSink(sinkN);
                try {
                    realBufferedSink2.writeUtf8("libcore.io.DiskLruCache");
                    realBufferedSink2.writeByte(10);
                    realBufferedSink2.writeUtf8("1");
                    realBufferedSink2.writeByte(10);
                    realBufferedSink2.writeDecimalLong(this.c);
                    realBufferedSink2.writeByte(10);
                    realBufferedSink2.writeDecimalLong(this.d);
                    realBufferedSink2.writeByte(10);
                    realBufferedSink2.writeByte(10);
                    for (Entry entry : this.h.values()) {
                        if (entry.g != null) {
                            realBufferedSink2.writeUtf8("DIRTY");
                            realBufferedSink2.writeByte(32);
                            realBufferedSink2.writeUtf8(entry.a);
                            realBufferedSink2.writeByte(10);
                        } else {
                            realBufferedSink2.writeUtf8("CLEAN");
                            realBufferedSink2.writeByte(32);
                            realBufferedSink2.writeUtf8(entry.a);
                            for (long j : entry.b) {
                                realBufferedSink2.writeByte(32);
                                realBufferedSink2.writeDecimalLong(j);
                            }
                            realBufferedSink2.writeByte(10);
                        }
                    }
                    try {
                        realBufferedSink2.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        realBufferedSink2.close();
                    } catch (Throwable th3) {
                        b.a(th, th3);
                    }
                }
                if (th != null) {
                    throw th;
                }
                boolean zG = this.s.g(this.e);
                jy jyVar = this.s;
                if (zG) {
                    jyVar.b(this.e, this.g);
                    this.s.b(this.f, this.e);
                    this.s.f(this.g);
                } else {
                    jyVar.b(this.f, this.e);
                }
                this.m = f();
                this.l = 0;
                this.n = false;
                this.r = false;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
