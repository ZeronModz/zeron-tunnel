package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataBufferIterator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.SingleRefDataBufferIterator;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v implements DataBuffer {
    public final DataHolder a;

    public v(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    @Override // com.google.android.gms.common.data.DataBuffer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        release();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final int getCount() {
        DataHolder dataHolder = this.a;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.h;
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final Bundle getMetadata() {
        DataHolder dataHolder = this.a;
        if (dataHolder == null) {
            return null;
        }
        return dataHolder.f;
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final boolean isClosed() {
        boolean z;
        DataHolder dataHolder = this.a;
        if (dataHolder == null) {
            return true;
        }
        synchronized (dataHolder) {
            z = dataHolder.i;
        }
        return z;
    }

    @Override // com.google.android.gms.common.data.DataBuffer, java.lang.Iterable
    public final Iterator iterator() {
        return new DataBufferIterator(this);
    }

    @Override // com.google.android.gms.common.data.DataBuffer, com.google.android.gms.common.api.Releasable
    public final void release() {
        DataHolder dataHolder = this.a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final Iterator singleRefIterator() {
        return new SingleRefDataBufferIterator(this);
    }
}
