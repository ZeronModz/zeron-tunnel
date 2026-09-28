package defpackage;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.Data;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkTag;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class lw extends EntityInsertionAdapter {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lw(RoomDatabase roomDatabase, int i) {
        super(roomDatabase);
        this.d = i;
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final String b() {
        switch (this.d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    @Override // androidx.room.EntityInsertionAdapter
    public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
        switch (this.d) {
            case 0:
                Dependency dependency = (Dependency) obj;
                supportSQLiteStatement.bindString(1, dependency.a);
                supportSQLiteStatement.bindString(2, dependency.b);
                break;
            case 1:
                Preference preference = (Preference) obj;
                supportSQLiteStatement.bindString(1, preference.a);
                Long l = preference.b;
                if (l != null) {
                    supportSQLiteStatement.bindLong(2, l.longValue());
                } else {
                    supportSQLiteStatement.bindNull(2);
                }
                break;
            case 2:
                supportSQLiteStatement.bindString(1, ((SystemIdInfo) obj).a);
                supportSQLiteStatement.bindLong(2, r5.b);
                supportSQLiteStatement.bindLong(3, r5.c);
                break;
            case 3:
                WorkName workName = (WorkName) obj;
                supportSQLiteStatement.bindString(1, workName.a);
                supportSQLiteStatement.bindString(2, workName.b);
                break;
            case 4:
                WorkProgress workProgress = (WorkProgress) obj;
                supportSQLiteStatement.bindString(1, workProgress.a);
                Data data = workProgress.b;
                Data.b.getClass();
                supportSQLiteStatement.bindBlob(2, Data.Companion.c(data));
                break;
            default:
                WorkTag workTag = (WorkTag) obj;
                supportSQLiteStatement.bindString(1, workTag.a);
                supportSQLiteStatement.bindString(2, workTag.b);
                break;
        }
    }
}
