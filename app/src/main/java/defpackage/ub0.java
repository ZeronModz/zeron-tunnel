package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.zaj;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ub0 extends b implements Api.Client, zaj {
    public final Set a;
    public final Account b;

    /* JADX WARN: Illegal instructions before constructor call */
    public ub0(Context context, Looper looper, int i, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        g gVarA = GmsClientSupervisor.a(context);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.d;
        yg0.m(connectionCallbacks);
        yg0.m(onConnectionFailedListener);
        int i2 = 17;
        super(context, looper, gVarA, googleApiAvailability, i, new jx2(connectionCallbacks, i2), new nx2(onConnectionFailedListener, i2), clientSettings.g);
        this.b = clientSettings.a;
        Set set = clientSettings.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                u7.p("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.a = set;
    }

    @Override // com.google.android.gms.common.internal.b
    public final Account getAccount() {
        return this.b;
    }

    @Override // com.google.android.gms.common.internal.b
    public final Executor getBindServiceExecutor() {
        return null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.internal.b
    public final Set getScopes() {
        return this.a;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final Set getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.a : Collections.EMPTY_SET;
    }
}
