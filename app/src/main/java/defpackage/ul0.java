package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.preference.PreferenceFragment;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceGroupAdapter;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ul0 extends Handler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public ul0(PreferenceFragment preferenceFragment) {
        this.a = 1;
        this.b = preferenceFragment;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        y6[] y6VarArr;
        switch (this.a) {
            case 0:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                wl0 wl0Var = (wl0) this.b;
                while (true) {
                    synchronized (((HashMap) wl0Var.c)) {
                        try {
                            size = ((ArrayList) wl0Var.e).size();
                            if (size <= 0) {
                                return;
                            }
                            y6VarArr = new y6[size];
                            ((ArrayList) wl0Var.e).toArray(y6VarArr);
                            ((ArrayList) wl0Var.e).clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    for (int i = 0; i < size; i++) {
                        y6 y6Var = y6VarArr[i];
                        int size2 = ((ArrayList) y6Var.c).size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            vl0 vl0Var = (vl0) ((ArrayList) y6Var.c).get(i2);
                            if (!vl0Var.d) {
                                vl0Var.b.onReceive((Context) wl0Var.b, (Intent) y6Var.b);
                            }
                        }
                    }
                }
                break;
            case 1:
                if (message.what != 1) {
                    return;
                }
                PreferenceFragment preferenceFragment = (PreferenceFragment) this.b;
                PreferenceScreen preferenceScreen = preferenceFragment.b.g;
                if (preferenceScreen != null) {
                    preferenceFragment.c.setAdapter(new PreferenceGroupAdapter(preferenceScreen));
                    preferenceScreen.k();
                    return;
                }
                return;
            default:
                if (message.what != 1) {
                    return;
                }
                PreferenceFragmentCompat preferenceFragmentCompat = (PreferenceFragmentCompat) this.b;
                PreferenceScreen preferenceScreen2 = preferenceFragmentCompat.Z.g;
                if (preferenceScreen2 != null) {
                    preferenceFragmentCompat.a0.setAdapter(new PreferenceGroupAdapter(preferenceScreen2));
                    preferenceScreen2.k();
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ul0(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }
}
