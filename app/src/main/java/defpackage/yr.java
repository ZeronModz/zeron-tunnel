package defpackage;

import androidx.lifecycle.Observer;
import androidx.lifecycle.d;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yr implements Observer, FunctionAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ yr(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter) || ((d) function1) != ((FunctionAdapter) obj).getFunctionDelegate()) {
                }
                break;
            default:
                if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter) || ((zz0) function1) != ((FunctionAdapter) obj).getFunctionDelegate()) {
                }
                break;
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                return (d) function1;
            default:
                return (zz0) function1;
        }
    }

    public final int hashCode() {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                return ((d) function1).hashCode();
            default:
                return ((zz0) function1).hashCode();
        }
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                ((d) function1).invoke(obj);
                break;
            default:
                ((zz0) function1).invoke(obj);
                break;
        }
    }
}
