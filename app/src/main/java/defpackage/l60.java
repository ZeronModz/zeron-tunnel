package defpackage;

import android.text.TextUtils;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.c;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.local.b;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ l60(c cVar, boolean z, int i) {
        this.a = i;
        this.b = cVar;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PersistedInstallationEntry persistedInstallationEntryH;
        switch (this.a) {
            case 0:
                this.b.b(this.c);
                return;
            default:
                c cVar = this.b;
                boolean z = this.c;
                PersistedInstallationEntry persistedInstallationEntryD = cVar.d();
                try {
                    if (persistedInstallationEntryD.f() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR) {
                        persistedInstallationEntryH = cVar.h(persistedInstallationEntryD);
                    } else if (persistedInstallationEntryD.f() == PersistedInstallation.RegistrationStatus.UNREGISTERED) {
                        persistedInstallationEntryH = cVar.h(persistedInstallationEntryD);
                    } else {
                        if (!z && !cVar.d.a(persistedInstallationEntryD)) {
                            return;
                        }
                        persistedInstallationEntryH = cVar.c(persistedInstallationEntryD);
                    }
                    cVar.e(persistedInstallationEntryH);
                    synchronized (cVar) {
                        if (cVar.j.size() != 0 && !TextUtils.equals(((b) persistedInstallationEntryD).b, ((b) persistedInstallationEntryH).b)) {
                            Iterator it = cVar.j.iterator();
                            while (it.hasNext()) {
                                ((FidListener) it.next()).onFidChanged(((b) persistedInstallationEntryH).b);
                            }
                        }
                        break;
                    }
                    if (persistedInstallationEntryH.f() == PersistedInstallation.RegistrationStatus.REGISTERED) {
                        cVar.k(((b) persistedInstallationEntryH).b);
                    }
                    if (persistedInstallationEntryH.f() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR) {
                        cVar.i(new FirebaseInstallationsException(FirebaseInstallationsException.Status.BAD_CONFIG));
                        return;
                    } else if (persistedInstallationEntryH.f() == PersistedInstallation.RegistrationStatus.NOT_GENERATED || persistedInstallationEntryH.f() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
                        cVar.i(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        cVar.j(persistedInstallationEntryH);
                        return;
                    }
                } catch (FirebaseInstallationsException e) {
                    cVar.i(e);
                    return;
                }
        }
    }
}
