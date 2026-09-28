package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzgru;
import com.google.android.gms.internal.ads.zzpq;
import com.google.android.gms.internal.ads.zzvm;
import com.google.android.gms.internal.ads.zzxc;
import com.google.android.gms.internal.ads.zzxd;
import com.google.android.gms.internal.measurement.p0;
import com.google.android.gms.internal.measurement.zzju;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ic3 implements zzgru, zzju, OnTokenCanceledListener, zzxc {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ic3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public static ic3 a(byte[] bArr) {
        return new ic3(hc3.a(bArr), 0);
    }

    public static ic3 b(int i) {
        return new ic3(hc3.a(u73.a(i)), 0);
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public void onCanceled() {
        ((TaskCompletionSource) this.b).a.s();
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ Object mo10zza() {
        Map map;
        Cursor cursorQuery;
        Map map2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                return (ob2) obj;
            default:
                p0 p0Var = (p0) obj;
                ContentResolver contentResolver = p0Var.a;
                Uri uri = p0Var.b;
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        return Collections.EMPTY_MAP;
                    }
                    try {
                        cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, p0.j, null, null, null);
                    } catch (RemoteException unused) {
                        map = Collections.EMPTY_MAP;
                    }
                    try {
                        if (cursorQuery == null) {
                            map = Collections.EMPTY_MAP;
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            return map;
                        }
                        int count = cursorQuery.getCount();
                        if (count == 0) {
                            map2 = Collections.EMPTY_MAP;
                        } else {
                            Map arrayMap = count <= 256 ? new ArrayMap(count) : new HashMap(count, 1.0f);
                            while (cursorQuery.moveToNext()) {
                                arrayMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
                            }
                            if (cursorQuery.isAfterLast()) {
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                                return arrayMap;
                            }
                            map2 = Collections.EMPTY_MAP;
                        }
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map2;
                    } finally {
                    }
                } catch (Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxc
    public /* synthetic */ zzxd zza(zzpq zzpqVar) {
        return new zzvm((zzafa) this.b);
    }
}
