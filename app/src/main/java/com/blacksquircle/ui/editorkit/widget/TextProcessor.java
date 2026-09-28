package com.blacksquircle.ui.editorkit.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin;
import com.blacksquircle.ui.editorkit.plugin.base.PluginContainer;
import com.blacksquircle.ui.editorkit.plugin.base.PluginSupplier;
import com.blacksquircle.ui.editorkit.widget.internal.SyntaxHighlightEditText;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001eB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/blacksquircle/ui/editorkit/widget/TextProcessor;", "Lcom/blacksquircle/ui/editorkit/widget/internal/SyntaxHighlightEditText;", "Lcom/blacksquircle/ui/editorkit/plugin/base/PluginContainer;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "getFreezesText", "()Z", "freezesText", "Lmk1;", "setFreezesText", "(Z)V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "text", "setTextContent", "(Ljava/lang/CharSequence;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "size", "setTextSize", "(F)V", "Landroid/graphics/Typeface;", "tf", "setTypeface", "(Landroid/graphics/Typeface;)V", "Companion", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class TextProcessor extends SyntaxHighlightEditText implements PluginContainer {
    public final HashSet C;
    public boolean D;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/editorkit/widget/TextProcessor$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "TAG", "Ljava/lang/String;", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextProcessor(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.C = new HashSet();
        this.D = true;
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.LineNumbersEditText
    public final void b(int i, int i2) {
        super.b(i, i2);
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ((EditorPlugin) it.next()).getClass();
        }
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.SyntaxHighlightEditText, com.blacksquircle.ui.editorkit.widget.internal.LineNumbersEditText
    public final void c(Editable editable) {
        super.c(editable);
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ((EditorPlugin) it.next()).a();
        }
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.SyntaxHighlightEditText, com.blacksquircle.ui.editorkit.widget.internal.UndoRedoEditText, com.blacksquircle.ui.editorkit.widget.internal.LineNumbersEditText
    public final void d(int i, int i2, int i3, CharSequence charSequence) {
        super.d(i, i2, i3, charSequence);
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ((EditorPlugin) it.next()).getClass();
        }
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.SyntaxHighlightEditText, com.blacksquircle.ui.editorkit.widget.internal.UndoRedoEditText, com.blacksquircle.ui.editorkit.widget.internal.LineNumbersEditText
    public final void e(int i, int i2, int i3, CharSequence charSequence) {
        super.e(i, i2, i3, charSequence);
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ((EditorPlugin) it.next()).k(i, i3, charSequence);
        }
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.LineNumbersEditText
    public final void f(int i, int i2, int i3) {
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ((EditorPlugin) it.next()).m(i, i2, i3);
        }
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.PluginContainer
    public final EditorPlugin findPlugin(String str) {
        Object next;
        str.getClass();
        Iterator it = this.C.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((EditorPlugin) next).a.equals(str)) {
                break;
            }
        }
        if (next instanceof EditorPlugin) {
            return (EditorPlugin) next;
        }
        return null;
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.LineNumbersEditText
    public final void g(int i) {
        super.g(i);
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ((EditorPlugin) it.next()).n(i);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean getFreezesText() {
        return this.D;
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.PluginContainer
    public final boolean hasPlugin(String str) {
        str.getClass();
        HashSet hashSet = this.C;
        if (hashSet != null && hashSet.isEmpty()) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((EditorPlugin) it.next()).a.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.SyntaxHighlightEditText
    public final void i() {
        super.i();
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ((EditorPlugin) it.next()).e(getColorScheme());
        }
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.PluginContainer
    public final void installPlugin(EditorPlugin editorPlugin) {
        editorPlugin.getClass();
        if (hasPlugin(editorPlugin.a)) {
            editorPlugin.toString();
        } else {
            this.C.add(editorPlugin);
            editorPlugin.d(this);
        }
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.SyntaxHighlightEditText
    public final void j() {
        k();
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ((EditorPlugin) it.next()).h(getLanguage());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        HashSet hashSet = this.C;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((EditorPlugin) it.next()).b(canvas);
        }
        super.onDraw(canvas);
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            ((EditorPlugin) it2.next()).g(canvas);
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ((EditorPlugin) it.next()).getClass();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ((EditorPlugin) it.next()).getClass();
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ((EditorPlugin) it.next()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ((EditorPlugin) it.next()).getClass();
        }
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.SyntaxHighlightEditText, com.blacksquircle.ui.editorkit.widget.internal.ScrollableEditText, android.widget.TextView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ((EditorPlugin) it.next()).getClass();
        }
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (getLayout() != null) {
            Iterator it = this.C.iterator();
            while (it.hasNext()) {
                ((EditorPlugin) it.next()).i(i, i2);
            }
        }
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.SyntaxHighlightEditText, com.blacksquircle.ui.editorkit.widget.internal.ScrollableEditText, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ((EditorPlugin) it.next()).j(i, i2);
        }
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.ScrollableEditText, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            if (((EditorPlugin) it.next()).l(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.PluginContainer
    public final void plugins(PluginSupplier pluginSupplier) {
        pluginSupplier.getClass();
        LinkedHashSet linkedHashSet = pluginSupplier.a;
        HashSet hashSet = this.C;
        hashSet.getClass();
        linkedHashSet.getClass();
        LinkedHashSet linkedHashSetT = c.T(hashSet);
        c.i(linkedHashSetT, linkedHashSet);
        LinkedHashSet linkedHashSetT2 = c.T(linkedHashSetT);
        linkedHashSetT2.retainAll(linkedHashSet);
        LinkedHashSet linkedHashSetT3 = c.T(linkedHashSetT);
        linkedHashSetT3.removeAll(linkedHashSetT2);
        Iterator it = linkedHashSetT3.iterator();
        while (it.hasNext()) {
            uninstallPlugin(((EditorPlugin) it.next()).a);
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            installPlugin((EditorPlugin) it2.next());
        }
    }

    @Override // android.widget.TextView
    public void setFreezesText(boolean freezesText) {
        super.setFreezesText(freezesText);
        this.D = freezesText;
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.SyntaxHighlightEditText, com.blacksquircle.ui.editorkit.widget.internal.UndoRedoEditText, com.blacksquircle.ui.editorkit.widget.internal.LineNumbersEditText
    public void setTextContent(CharSequence text) {
        text.getClass();
        super.setTextContent(text);
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ((EditorPlugin) it.next()).o(text);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(float size) {
        super.setTextSize(size);
        if (getLayout() != null) {
            Iterator it = this.C.iterator();
            while (it.hasNext()) {
                ((EditorPlugin) it.next()).p(size);
            }
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface tf) {
        super.setTypeface(tf);
        if (getLayout() != null) {
            Iterator it = this.C.iterator();
            while (it.hasNext()) {
                ((EditorPlugin) it.next()).q(tf);
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        super.showDropDown();
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ((EditorPlugin) it.next()).r();
        }
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.PluginContainer
    public final void uninstallPlugin(String str) {
        EditorPlugin editorPluginFindPlugin;
        str.getClass();
        if (!hasPlugin(str) || (editorPluginFindPlugin = findPlugin(str)) == null) {
            return;
        }
        this.C.remove(editorPluginFindPlugin);
        editorPluginFindPlugin.f(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextProcessor(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ TextProcessor(Context context, AttributeSet attributeSet, int i, int i2, xu xuVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.autoCompleteTextViewStyle : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextProcessor(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
