package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.work.impl.model.WorkSpecDao_Impl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class or1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RoomSQLiteQuery b;
    public final /* synthetic */ WorkSpecDao_Impl c;

    public /* synthetic */ or1(WorkSpecDao_Impl workSpecDao_Impl, RoomSQLiteQuery roomSQLiteQuery, int i) {
        this.a = i;
        this.c = workSpecDao_Impl;
        this.b = roomSQLiteQuery;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        Cursor cursorA;
        Boolean boolValueOf;
        int i = this.a;
        RoomSQLiteQuery roomSQLiteQuery = this.b;
        WorkSpecDao_Impl workSpecDao_Impl = this.c;
        switch (i) {
            case 0:
                RoomDatabase roomDatabase = workSpecDao_Impl.a;
                roomDatabase.c();
                try {
                    cursorA = zt.a(roomDatabase, roomSQLiteQuery, false);
                    try {
                        ArrayList arrayList = new ArrayList(cursorA.getCount());
                        while (cursorA.moveToNext()) {
                            arrayList.add(cursorA.getString(0));
                        }
                        roomDatabase.o();
                        return arrayList;
                    } finally {
                    }
                } finally {
                    roomDatabase.f();
                }
            case 1:
                cursorA = zt.a(workSpecDao_Impl.a, roomSQLiteQuery, false);
                try {
                    if (cursorA.moveToFirst()) {
                        boolValueOf = Boolean.valueOf(cursorA.getInt(0) != 0);
                    } else {
                        boolValueOf = Boolean.FALSE;
                    }
                    return boolValueOf;
                } finally {
                }
            default:
                cursorA = zt.a(workSpecDao_Impl.a, roomSQLiteQuery, false);
                try {
                    Long lValueOf = null;
                    if (cursorA.moveToFirst() && !cursorA.isNull(0)) {
                        lValueOf = Long.valueOf(cursorA.getLong(0));
                        break;
                    }
                    return lValueOf;
                } finally {
                    cursorA.close();
                }
        }
    }

    public final void finalize() {
        int i = this.a;
        RoomSQLiteQuery roomSQLiteQuery = this.b;
        switch (i) {
            case 0:
                roomSQLiteQuery.release();
                break;
            case 1:
                roomSQLiteQuery.release();
                break;
            default:
                roomSQLiteQuery.release();
                break;
        }
    }
}
