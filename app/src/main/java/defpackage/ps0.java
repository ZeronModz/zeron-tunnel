package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ps0 {
    public static final Pattern i = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final Pattern c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final Pattern g;
    public final String h;

    public ps0(String str, String str2, String str3) throws Throwable {
        Throwable th;
        int i2;
        int i3;
        Throwable th2 = null;
        this.c = null;
        int i4 = 0;
        this.d = false;
        this.e = false;
        this.g = null;
        this.f = str2;
        this.h = str3;
        int i5 = 1;
        if (str != null) {
            Uri uri = Uri.parse(str);
            boolean z = uri.getQuery() != null;
            this.e = z;
            StringBuilder sb = new StringBuilder("^");
            if (!i.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern patternCompile = Pattern.compile("\\{(.+?)\\}");
            if (z) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    a(str.substring(0, matcher.start()), sb, patternCompile);
                }
                this.d = false;
                for (String str4 : uri.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = uri.getQueryParameter(str4);
                    Matcher matcher2 = patternCompile.matcher(queryParameter);
                    os0 os0Var = new os0();
                    Throwable th3 = th2;
                    os0Var.b = new ArrayList();
                    int iEnd = i4;
                    while (matcher2.find()) {
                        os0Var.b.add(matcher2.group(i5));
                        sb2.append(Pattern.quote(queryParameter.substring(iEnd, matcher2.start())));
                        sb2.append("(.+?)?");
                        iEnd = matcher2.end();
                        i5 = i5;
                        i4 = i4;
                    }
                    int i6 = i4;
                    int i7 = i5;
                    if (iEnd < queryParameter.length()) {
                        sb2.append(Pattern.quote(queryParameter.substring(iEnd)));
                    }
                    os0Var.a = sb2.toString().replace(".*", "\\E.*\\Q");
                    this.b.put(str4, os0Var);
                    i5 = i7;
                    th2 = th3;
                    i4 = i6;
                }
                th = th2;
                i2 = i4;
                i3 = i5;
            } else {
                th = null;
                i2 = 0;
                i3 = 1;
                this.d = a(str, sb, patternCompile);
            }
            this.c = Pattern.compile(sb.toString().replace(".*", "\\E.*\\Q"), 2);
        } else {
            th = null;
            i2 = 0;
            i3 = 1;
        }
        if (str3 != null) {
            if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
                u7.r(vh.m("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
                throw th;
            }
            String[] strArrSplit = str3.split("/", -1);
            this.g = Pattern.compile(ec1.L("^(", strArrSplit[i2], "|[*]+)/(", strArrSplit[i3], "|[*]+)$").replace("*|[*]", "[\\s\\S]"));
        }
    }

    public final boolean a(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !str.contains(".*");
        int iEnd = 0;
        while (matcher.find()) {
            this.a.add(matcher.group(1));
            sb.append(Pattern.quote(str.substring(iEnd, matcher.start())));
            sb.append("(.+?)");
            iEnd = matcher.end();
            z = false;
        }
        if (iEnd < str.length()) {
            sb.append(Pattern.quote(str.substring(iEnd)));
        }
        sb.append("($|(\\?(.)*))");
        return z;
    }
}
