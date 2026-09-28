package defpackage;

import com.google.firebase.sessions.FirebaseSessions;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.SessionFirelogPublisher;
import com.google.firebase.sessions.SessionGenerator;
import com.google.firebase.sessions.SharedSessionRepository;
import com.google.firebase.sessions.dagger.internal.Provider;
import com.google.firebase.sessions.settings.SessionsSettings;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class au implements FirebaseSessionsComponent {
    public y1 a;
    public y1 b;
    public Provider c;
    public Provider d;
    public y1 e;
    public Provider f;
    public y1 g;
    public Provider h;
    public y1 i;
    public Provider j;
    public Provider k;
    public Provider l;
    public Provider m;
    public Provider n;
    public Provider o;
    public Provider p;
    public Provider q;
    public Provider r;
    public Provider s;
    public Provider t;
    public Provider u;
    public Provider v;
    public Provider w;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.sessions.FirebaseSessionsComponent
    public final FirebaseSessions getFirebaseSessions() {
        return (FirebaseSessions) this.w.get();
    }

    @Override // com.google.firebase.sessions.FirebaseSessionsComponent
    public final SessionFirelogPublisher getSessionFirelogPublisher() {
        return (SessionFirelogPublisher) this.q.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.sessions.FirebaseSessionsComponent
    public final SessionGenerator getSessionGenerator() {
        return (SessionGenerator) this.o.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.sessions.FirebaseSessionsComponent
    public final SessionsSettings getSessionsSettings() {
        return (SessionsSettings) this.m.get();
    }

    @Override // com.google.firebase.sessions.FirebaseSessionsComponent
    public final SharedSessionRepository getSharedSessionRepository() {
        return (SharedSessionRepository) this.u.get();
    }
}
