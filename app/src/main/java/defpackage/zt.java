package defpackage;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zt {
    public static final Cursor a(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, boolean z) throws IOException {
        roomDatabase.getClass();
        supportSQLiteQuery.getClass();
        Cursor cursorL = roomDatabase.l(supportSQLiteQuery);
        if (z && (cursorL instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorL;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(cursorL.getColumnNames(), cursorL.getCount());
                    while (cursorL.moveToNext()) {
                        Object[] objArr = new Object[cursorL.getColumnCount()];
                        int columnCount = cursorL.getColumnCount();
                        for (int i = 0; i < columnCount; i++) {
                            int type = cursorL.getType(i);
                            if (type == 0) {
                                objArr[i] = null;
                            } else if (type == 1) {
                                objArr[i] = Long.valueOf(cursorL.getLong(i));
                            } else if (type == 2) {
                                objArr[i] = Double.valueOf(cursorL.getDouble(i));
                            } else if (type == 3) {
                                objArr[i] = cursorL.getString(i);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i] = cursorL.getBlob(i);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    cursorL.close();
                    return matrixCursor;
                } finally {
                }
            }
        }
        return cursorL;
    }

    public static final int b(File file) throws IOException {
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i = byteBufferAllocate.getInt();
            channel.close();
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if3.c(channel, th);
                throw th2;
            }
        }
    }
}
