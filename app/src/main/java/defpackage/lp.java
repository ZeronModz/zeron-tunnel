package defpackage;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.internal.SavedStateHandleImpl;
import androidx.savedstate.SavedStateRegistry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lp implements SavedStateRegistry.SavedStateProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lp(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle saveState() {
        Pair[] pairArr;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ComponentActivity.b((ComponentActivity) obj);
            case 1:
                return ((FragmentManager) obj).X();
            default:
                SavedStateHandleImpl savedStateHandleImpl = (SavedStateHandleImpl) obj;
                for (Map.Entry entry : d.i(savedStateHandleImpl.d).entrySet()) {
                    savedStateHandleImpl.a(((MutableStateFlow) entry.getValue()).getValue(), (String) entry.getKey());
                }
                for (Map.Entry entry2 : d.i(savedStateHandleImpl.b).entrySet()) {
                    savedStateHandleImpl.a(((SavedStateRegistry.SavedStateProvider) entry2.getValue()).saveState(), (String) entry2.getKey());
                }
                LinkedHashMap linkedHashMap = savedStateHandleImpl.a;
                if (linkedHashMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        arrayList.add(new Pair((String) entry3.getKey(), entry3.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                return kf2.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    }
}
