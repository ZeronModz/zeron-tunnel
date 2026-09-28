package com.blacksquircle.ui.editorkit.model;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.vh;
import defpackage.xu;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.text.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/editorkit/model/UndoStack;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "Companion", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UndoStack {
    public final ArrayList a = new ArrayList();
    public int b;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/editorkit/model/UndoStack$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "MAX_SIZE", "I", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    public final TextChange a() {
        ArrayList arrayList = this.a;
        TextChange textChange = (TextChange) vh.e(arrayList, 1);
        arrayList.remove(arrayList.size() - 1);
        this.b -= textChange.b.length() + textChange.a.length();
        return textChange;
    }

    public final void b(TextChange textChange) {
        textChange.getClass();
        int length = textChange.b.length() + textChange.a.length();
        if (length >= Integer.MAX_VALUE) {
            c();
            return;
        }
        ArrayList arrayList = this.a;
        if (arrayList.size() > 0) {
            boolean z = true;
            TextChange textChange2 = (TextChange) arrayList.get(arrayList.size() - 1);
            if (textChange.b.length() == 0 && textChange.a.length() == 1 && textChange2.b.length() == 0) {
                if (textChange2.a.length() + textChange2.c != textChange.c) {
                    arrayList.add(textChange);
                } else if (a.c(textChange.a.charAt(0))) {
                    char[] charArray = textChange2.a.toCharArray();
                    charArray.getClass();
                    for (char c : charArray) {
                        if (!a.c(c)) {
                            z = false;
                        }
                    }
                    if (z) {
                        textChange2.a = textChange2.a.concat(textChange.a);
                    } else {
                        arrayList.add(textChange);
                    }
                } else if (Character.isLetterOrDigit(textChange.a.charAt(0))) {
                    char[] charArray2 = textChange2.a.toCharArray();
                    charArray2.getClass();
                    for (char c2 : charArray2) {
                        if (!Character.isLetterOrDigit(c2)) {
                            z = false;
                        }
                    }
                    if (z) {
                        textChange2.a = textChange2.a.concat(textChange.a);
                    } else {
                        arrayList.add(textChange);
                    }
                } else {
                    arrayList.add(textChange);
                }
            } else if (textChange.b.length() != 1 || textChange.a.length() > 0 || textChange2.a.length() > 0 || textChange2.c - 1 != textChange.c) {
                arrayList.add(textChange);
            } else if (a.c(textChange.b.charAt(0))) {
                char[] charArray3 = textChange2.b.toCharArray();
                charArray3.getClass();
                for (char c3 : charArray3) {
                    if (!a.c(c3)) {
                        z = false;
                    }
                }
                if (z) {
                    textChange2.b = textChange.b.concat(textChange2.b);
                    textChange2.c -= textChange.b.length();
                } else {
                    arrayList.add(textChange);
                }
            } else if (Character.isLetterOrDigit(textChange.b.charAt(0))) {
                char[] charArray4 = textChange2.b.toCharArray();
                charArray4.getClass();
                for (char c4 : charArray4) {
                    if (!Character.isLetterOrDigit(c4)) {
                        z = false;
                    }
                }
                if (z) {
                    textChange2.b = textChange.b.concat(textChange2.b);
                    textChange2.c -= textChange.b.length();
                } else {
                    arrayList.add(textChange);
                }
            } else {
                arrayList.add(textChange);
            }
        } else {
            arrayList.add(textChange);
        }
        this.b += length;
        while (this.b > Integer.MAX_VALUE && arrayList.size() > 0) {
            TextChange textChange3 = (TextChange) arrayList.get(0);
            arrayList.remove(0);
            this.b -= textChange3.b.length() + textChange3.a.length();
        }
    }

    public final void c() {
        this.b = 0;
        this.a.clear();
    }
}
