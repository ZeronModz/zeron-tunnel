package com.blacksquircle.ui.editorkit.plugin.shortcuts;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

 
 
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/blacksquircle/ui/editorkit/plugin/shortcuts/Shortcut;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ctrl", "shift", "alt", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "keyCode", "<init>", "(ZZZI)V", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final   class Shortcut {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public Shortcut(boolean z, boolean z2, boolean z3, int i) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shortcut)) {
            return false;
        }
        Shortcut shortcut = (Shortcut) obj;
        return this.a == shortcut.a && this.b == shortcut.b && this.c == shortcut.c && this.d == shortcut.d;
    }

     
     
     
     
     
     
     
     
     
     
    public final int hashCode() {
        boolean z = this.a;
        int r1 = z ? 1 : 0;
        if (z) {
            r1 = 1;
        }
        int i = r1 * 31;
        boolean z2 = this.b;
        int r2 = z2 ? 1 : 0;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.c;
        return ((i2 + (z3 ? 1 : 0)) * 31) + this.d;
    }

    public final String toString() {
        return "Shortcut(ctrl=" + this.a + ", shift=" + this.b + ", alt=" + this.c + ", keyCode=" + this.d + ")";
    }
}
