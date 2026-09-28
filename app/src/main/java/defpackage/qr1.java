package defpackage;

import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.impl.model.WorkSpec;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qr1 extends EntityDeletionOrUpdateAdapter {
    @Override // androidx.room.SharedSQLiteStatement
    public final String b() {
        return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
    }

    public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
        WorkSpec workSpec = (WorkSpec) obj;
        supportSQLiteStatement.bindString(1, workSpec.a);
        supportSQLiteStatement.bindLong(2, sr1.k(workSpec.b));
        supportSQLiteStatement.bindString(3, workSpec.c);
        supportSQLiteStatement.bindString(4, workSpec.d);
        Data data = workSpec.e;
        Data.b.getClass();
        supportSQLiteStatement.bindBlob(5, Data.Companion.c(data));
        supportSQLiteStatement.bindBlob(6, Data.Companion.c(workSpec.f));
        supportSQLiteStatement.bindLong(7, workSpec.g);
        supportSQLiteStatement.bindLong(8, workSpec.h);
        supportSQLiteStatement.bindLong(9, workSpec.i);
        supportSQLiteStatement.bindLong(10, workSpec.k);
        supportSQLiteStatement.bindLong(11, sr1.a(workSpec.l));
        supportSQLiteStatement.bindLong(12, workSpec.m);
        supportSQLiteStatement.bindLong(13, workSpec.n);
        supportSQLiteStatement.bindLong(14, workSpec.o);
        supportSQLiteStatement.bindLong(15, workSpec.p);
        supportSQLiteStatement.bindLong(16, workSpec.q ? 1L : 0L);
        supportSQLiteStatement.bindLong(17, sr1.i(workSpec.r));
        supportSQLiteStatement.bindLong(18, workSpec.s);
        supportSQLiteStatement.bindLong(19, workSpec.t);
        supportSQLiteStatement.bindLong(20, workSpec.u);
        supportSQLiteStatement.bindLong(21, workSpec.v);
        supportSQLiteStatement.bindLong(22, workSpec.w);
        String str = workSpec.x;
        if (str == null) {
            supportSQLiteStatement.bindNull(23);
        } else {
            supportSQLiteStatement.bindString(23, str);
        }
        Constraints constraints = workSpec.j;
        supportSQLiteStatement.bindLong(24, sr1.h(constraints.a));
        supportSQLiteStatement.bindBlob(25, sr1.c(constraints.b));
        supportSQLiteStatement.bindLong(26, constraints.c ? 1L : 0L);
        supportSQLiteStatement.bindLong(27, constraints.d ? 1L : 0L);
        supportSQLiteStatement.bindLong(28, constraints.e ? 1L : 0L);
        supportSQLiteStatement.bindLong(29, constraints.f ? 1L : 0L);
        supportSQLiteStatement.bindLong(30, constraints.g);
        supportSQLiteStatement.bindLong(31, constraints.h);
        supportSQLiteStatement.bindBlob(32, sr1.j(constraints.i));
        supportSQLiteStatement.bindString(33, workSpec.a);
    }
}
