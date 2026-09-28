package com.blacksquircle.ui.editorkit.widget.internal;

import android.R;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.util.AttributeSet;
import com.blacksquircle.ui.editorkit.model.ColorScheme;
import com.blacksquircle.ui.editorkit.model.ErrorSpan;
import com.blacksquircle.ui.editorkit.model.FindResult;
import com.blacksquircle.ui.editorkit.model.FindResultSpan;
import com.blacksquircle.ui.editorkit.model.StyleSpan;
import com.blacksquircle.ui.editorkit.model.SyntaxHighlightSpan;
import com.blacksquircle.ui.editorkit.model.TabWidthSpan;
import com.blacksquircle.ui.editorkit.utils.StylingTask;
import com.blacksquircle.ui.editorkit.widget.internal.SyntaxHighlightEditText;
import com.blacksquircle.ui.language.base.Language;
import com.blacksquircle.ui.language.base.model.SyntaxHighlightResult;
import com.blacksquircle.ui.language.base.styler.LanguageStyler;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.gd1;
import defpackage.j60;
import defpackage.k5;
import defpackage.mk1;
import defpackage.n8;
import defpackage.p60;
import defpackage.t00;
import defpackage.xu;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R.\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00100\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u0011¨\u00061"}, d2 = {"Lcom/blacksquircle/ui/editorkit/widget/internal/SyntaxHighlightEditText;", "Lcom/blacksquircle/ui/editorkit/widget/internal/UndoRedoEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "text", "Lmk1;", "setTextContent", "(Ljava/lang/CharSequence;)V", "lineNumber", "setErrorLine", "(I)V", "Lcom/blacksquircle/ui/language/base/Language;", "value", "q", "Lcom/blacksquircle/ui/language/base/Language;", "getLanguage", "()Lcom/blacksquircle/ui/language/base/Language;", "setLanguage", "(Lcom/blacksquircle/ui/language/base/Language;)V", "language", "Lcom/blacksquircle/ui/editorkit/model/ColorScheme;", "r", "Lcom/blacksquircle/ui/editorkit/model/ColorScheme;", "getColorScheme", "()Lcom/blacksquircle/ui/editorkit/model/ColorScheme;", "setColorScheme", "(Lcom/blacksquircle/ui/editorkit/model/ColorScheme;)V", "colorScheme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "s", "Z", "getUseSpacesInsteadOfTabs", "()Z", "setUseSpacesInsteadOfTabs", "(Z)V", "useSpacesInsteadOfTabs", "t", "I", "getTabWidth", "()I", "setTabWidth", "tabWidth", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class SyntaxHighlightEditText extends UndoRedoEditText {
    public static final /* synthetic */ int B = 0;
    public boolean A;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public Language language;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public ColorScheme colorScheme;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public boolean useSpacesInsteadOfTabs;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public int tabWidth;
    public final ArrayList u;
    public final ArrayList v;
    public StyleSpan w;
    public StylingTask x;
    public int y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyntaxHighlightEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.colorScheme = t00.a;
        this.useSpacesInsteadOfTabs = true;
        this.tabWidth = 4;
        this.u = new ArrayList();
        this.v = new ArrayList();
        setFilters(new InputFilter[]{new InputFilter() { // from class: fd1
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                int i6 = SyntaxHighlightEditText.B;
                if (i3 - i2 != 1 || i2 >= charSequence.length() || i4 >= spanned.length() || charSequence.charAt(i2) != '\t') {
                    return charSequence;
                }
                SyntaxHighlightEditText syntaxHighlightEditText = this.a;
                return syntaxHighlightEditText.useSpacesInsteadOfTabs ? g.L(syntaxHighlightEditText.tabWidth, " ") : "\t";
            }
        }});
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.LineNumbersEditText
    public void c(Editable editable) {
        if (!this.z) {
            int selectionStart = getSelectionStart();
            int i = this.y;
            for (SyntaxHighlightResult syntaxHighlightResult : this.u) {
                int i2 = syntaxHighlightResult.b;
                if (i2 >= selectionStart) {
                    syntaxHighlightResult.b = i2 + i;
                }
                int i3 = syntaxHighlightResult.c;
                if (i3 >= selectionStart) {
                    syntaxHighlightResult.c = i3 + i;
                }
            }
            for (FindResult findResult : this.v) {
                int i4 = findResult.a;
                if (i4 > selectionStart) {
                    findResult.a = i4 + i;
                }
                int i5 = findResult.b;
                if (i5 >= selectionStart) {
                    findResult.b = i5 + i;
                }
            }
            if (this.A) {
                Editable text = getText();
                text.getClass();
                for (ErrorSpan errorSpan : (ErrorSpan[]) text.getSpans(0, getText().length(), ErrorSpan.class)) {
                    getText().removeSpan(errorSpan);
                }
                this.A = false;
            }
        }
        this.y = 0;
        k();
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.UndoRedoEditText, com.blacksquircle.ui.editorkit.widget.internal.LineNumbersEditText
    public void d(int i, int i2, int i3, CharSequence charSequence) {
        this.y -= i2;
        StylingTask stylingTask = this.x;
        if (stylingTask != null) {
            stylingTask.d.shutdown();
        }
        this.x = null;
        if (!this.z) {
            super.d(i, i2, i3, charSequence);
        }
        a();
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.UndoRedoEditText, com.blacksquircle.ui.editorkit.widget.internal.LineNumbersEditText
    public void e(int i, int i2, int i3, CharSequence charSequence) {
        this.y += i3;
        if (this.z) {
            return;
        }
        super.e(i, i2, i3, charSequence);
    }

    public final ColorScheme getColorScheme() {
        return this.colorScheme;
    }

    public final Language getLanguage() {
        return this.language;
    }

    public final int getTabWidth() {
        return this.tabWidth;
    }

    public final boolean getUseSpacesInsteadOfTabs() {
        return this.useSpacesInsteadOfTabs;
    }

    public void i() {
        this.w = new StyleSpan(this.colorScheme.k, false, false, false, false, 30, null);
        setTextColor(this.colorScheme.a);
        k5.F(this, this.colorScheme.b);
        setBackgroundColor(this.colorScheme.c);
        setHighlightColor(this.colorScheme.i);
    }

    public void j() {
        k();
    }

    public final void k() {
        StylingTask stylingTask = this.x;
        if (stylingTask != null) {
            stylingTask.d.shutdown();
        }
        this.x = null;
        StylingTask stylingTask2 = new StylingTask(new Function0<List<? extends SyntaxHighlightResult>>() { // from class: com.blacksquircle.ui.editorkit.widget.internal.SyntaxHighlightEditText$syntaxHighlight$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends SyntaxHighlightResult> invoke() {
                LanguageStyler styler;
                List<SyntaxHighlightResult> listExecute;
                Language language = this.this$0.getLanguage();
                return (language == null || (styler = language.getStyler()) == null || (listExecute = styler.execute(this.this$0.getStructure())) == null) ? EmptyList.INSTANCE : listExecute;
            }
        }, new Function1<List<? extends SyntaxHighlightResult>, mk1>() { // from class: com.blacksquircle.ui.editorkit.widget.internal.SyntaxHighlightEditText$syntaxHighlight$2
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<SyntaxHighlightResult> list) {
                list.getClass();
                this.this$0.u.clear();
                this.this$0.u.addAll(list);
                this.this$0.l();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ mk1 invoke(List<? extends SyntaxHighlightResult> list) {
                invoke2((List<SyntaxHighlightResult>) list);
                return mk1.a;
            }
        });
        this.x = stylingTask2;
        stylingTask2.d.execute(new j60(stylingTask2, 22));
    }

    public final void l() {
        int i;
        if (getLayout() != null) {
            int lineStart = getLayout().getLineStart(n8.s(this));
            int lineEnd = getLayout().getLineEnd(n8.n(this));
            this.z = true;
            Editable text = getText();
            text.getClass();
            for (SyntaxHighlightSpan syntaxHighlightSpan : (SyntaxHighlightSpan[]) text.getSpans(0, getText().length(), SyntaxHighlightSpan.class)) {
                getText().removeSpan(syntaxHighlightSpan);
            }
            for (SyntaxHighlightResult syntaxHighlightResult : this.u) {
                boolean z = syntaxHighlightResult.b >= 0 && syntaxHighlightResult.c <= getText().length();
                int i2 = syntaxHighlightResult.b;
                int i3 = syntaxHighlightResult.c;
                boolean z2 = i2 <= i3;
                boolean z3 = (lineStart <= i2 && i2 <= lineEnd) || (i2 <= lineEnd && i3 >= lineStart);
                if (z && z2 && z3) {
                    Editable text2 = getText();
                    switch (gd1.a[syntaxHighlightResult.a.ordinal()]) {
                        case 1:
                            i = this.colorScheme.m;
                            break;
                        case 2:
                            i = this.colorScheme.n;
                            break;
                        case 3:
                            i = this.colorScheme.o;
                            break;
                        case 4:
                            i = this.colorScheme.p;
                            break;
                        case 5:
                            i = this.colorScheme.q;
                            break;
                        case 6:
                            i = this.colorScheme.r;
                            break;
                        case 7:
                            i = this.colorScheme.s;
                            break;
                        case 8:
                            i = this.colorScheme.t;
                            break;
                        case 9:
                            i = this.colorScheme.u;
                            break;
                        case 10:
                            i = this.colorScheme.v;
                            break;
                        case 11:
                            i = this.colorScheme.w;
                            break;
                        case 12:
                            i = this.colorScheme.x;
                            break;
                        case 13:
                            i = this.colorScheme.y;
                            break;
                        case 14:
                            i = this.colorScheme.z;
                            break;
                        case 15:
                            i = this.colorScheme.A;
                            break;
                        default:
                            p60.b();
                            return;
                    }
                    SyntaxHighlightSpan syntaxHighlightSpan2 = new SyntaxHighlightSpan(new StyleSpan(i, false, false, false, false, 30, null));
                    int i4 = syntaxHighlightResult.b;
                    if (i4 < lineStart) {
                        i4 = lineStart;
                    }
                    int i5 = syntaxHighlightResult.c;
                    if (i5 > lineEnd) {
                        i5 = lineEnd;
                    }
                    text2.setSpan(syntaxHighlightSpan2, i4, i5, 33);
                }
            }
            this.z = false;
            Editable text3 = getText();
            text3.getClass();
            for (FindResultSpan findResultSpan : (FindResultSpan[]) text3.getSpans(0, getText().length(), FindResultSpan.class)) {
                getText().removeSpan(findResultSpan);
            }
            StyleSpan styleSpan = this.w;
            if (styleSpan != null) {
                for (FindResult findResult : this.v) {
                    boolean z4 = findResult.a >= 0 && findResult.b <= getText().length();
                    int i6 = findResult.a;
                    int i7 = findResult.b;
                    boolean z5 = i6 <= i7;
                    boolean z6 = (lineStart <= i6 && i6 <= lineEnd) || (i6 <= lineEnd && i7 >= lineStart);
                    if (z4 && z5 && z6) {
                        Editable text4 = getText();
                        FindResultSpan findResultSpan2 = new FindResultSpan(styleSpan);
                        int i8 = findResult.a;
                        if (i8 < lineStart) {
                            i8 = lineStart;
                        }
                        int i9 = findResult.b;
                        if (i9 > lineEnd) {
                            i9 = lineEnd;
                        }
                        text4.setSpan(findResultSpan2, i8, i9, 33);
                    }
                }
            }
            if (!this.useSpacesInsteadOfTabs) {
                Editable text5 = getText();
                text5.getClass();
                for (TabWidthSpan tabWidthSpan : (TabWidthSpan[]) text5.getSpans(0, getText().length(), TabWidthSpan.class)) {
                    getText().removeSpan(tabWidthSpan);
                }
                Matcher matcher = Pattern.compile("\t").matcher(getText().subSequence(lineStart, lineEnd));
                while (matcher.find()) {
                    int iStart = matcher.start() + lineStart;
                    int iEnd = matcher.end() + lineStart;
                    if (iStart >= 0 && iEnd <= getText().length()) {
                        getText().setSpan(new TabWidthSpan(this.tabWidth), iStart, iEnd, 18);
                    }
                }
            }
            postInvalidate();
        }
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.ScrollableEditText, android.widget.TextView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        l();
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.ScrollableEditText, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        l();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public final void setColorScheme(ColorScheme colorScheme) {
        colorScheme.getClass();
        this.colorScheme = colorScheme;
        i();
    }

    public final void setErrorLine(int lineNumber) {
        if (lineNumber > 0) {
            int i = lineNumber - 1;
            int iB = getStructure().b(i);
            int iA = getStructure().a(i);
            if (iB >= getText().length() || iA >= getText().length() || iB <= -1 || iA <= -1) {
                return;
            }
            this.A = true;
            getText().setSpan(new ErrorSpan(0.0f, 0.0f, 0, 7, null), iB, iA, 33);
        }
    }

    public final void setLanguage(Language language) {
        this.language = language;
        j();
    }

    public final void setTabWidth(int i) {
        this.tabWidth = i;
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.UndoRedoEditText, com.blacksquircle.ui.editorkit.widget.internal.LineNumbersEditText
    public void setTextContent(CharSequence text) {
        text.getClass();
        this.u.clear();
        this.v.clear();
        super.setTextContent(text);
        k();
    }

    public final void setUseSpacesInsteadOfTabs(boolean z) {
        this.useSpacesInsteadOfTabs = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SyntaxHighlightEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ SyntaxHighlightEditText(Context context, AttributeSet attributeSet, int i, int i2, xu xuVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.autoCompleteTextViewStyle : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SyntaxHighlightEditText(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
