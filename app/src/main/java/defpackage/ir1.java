package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.c;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ir1 extends RoomOpenHelper.Delegate {
    public final /* synthetic */ WorkDatabase_Impl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir1(WorkDatabase_Impl workDatabase_Impl) {
        super(23);
        this.b = workDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenHelper.Delegate
    public final void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase = frameworkSQLiteDatabase.a;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
    }

    @Override // androidx.room.RoomOpenHelper.Delegate
    public final void b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase = frameworkSQLiteDatabase.a;
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Dependency`");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkTag`");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkName`");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Preference`");
        int i = WorkDatabase_Impl.x;
        List list = this.b.g;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((RoomDatabase.Callback) it.next()).getClass();
            }
        }
    }

    @Override // androidx.room.RoomOpenHelper.Delegate
    public final void c(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        int i = WorkDatabase_Impl.x;
        List list = this.b.g;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((RoomDatabase.Callback) it.next()).getClass();
            }
        }
    }

    @Override // androidx.room.RoomOpenHelper.Delegate
    public final void d(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        WorkDatabase_Impl workDatabase_Impl = this.b;
        int i = WorkDatabase_Impl.x;
        workDatabase_Impl.a = frameworkSQLiteDatabase;
        frameworkSQLiteDatabase.a.execSQL("PRAGMA foreign_keys = ON");
        InvalidationTracker invalidationTracker = this.b.e;
        invalidationTracker.getClass();
        synchronized (invalidationTracker.n) {
            if (!invalidationTracker.h) {
                frameworkSQLiteDatabase.a.execSQL("PRAGMA temp_store = MEMORY;");
                frameworkSQLiteDatabase.a.execSQL("PRAGMA recursive_triggers='ON';");
                frameworkSQLiteDatabase.a.execSQL("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                invalidationTracker.g(frameworkSQLiteDatabase);
                invalidationTracker.i = frameworkSQLiteDatabase.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                invalidationTracker.h = true;
            }
        }
        List list = this.b.g;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((RoomDatabase.Callback) it.next()).a(frameworkSQLiteDatabase);
            }
        }
    }

    @Override // androidx.room.RoomOpenHelper.Delegate
    public final void f(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws IOException {
        ListBuilder listBuilderM = c.m();
        Cursor cursorQuery = frameworkSQLiteDatabase.query("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorQuery.moveToNext()) {
            try {
                listBuilderM.add(cursorQuery.getString(0));
            } finally {
            }
        }
        cursorQuery.close();
        for (String str : listBuilderM.build()) {
            str.getClass();
            if (g.R(str, "room_fts_content_sync_", false)) {
                frameworkSQLiteDatabase.a.execSQL("DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    @Override // androidx.room.RoomOpenHelper.Delegate
    public final RoomOpenHelper.ValidationResult g(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws IOException {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 1, null, 1));
        map.put("prerequisite_id", new TableInfo.Column("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new TableInfo.Index("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new TableInfo.Index("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        TableInfo tableInfo = new TableInfo("Dependency", map, hashSet, hashSet2);
        TableInfo tableInfoA = TableInfo.a(frameworkSQLiteDatabase, "Dependency");
        if (!tableInfo.equals(tableInfoA)) {
            return new RoomOpenHelper.ValidationResult(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfoA);
        }
        HashMap map2 = new HashMap(32);
        map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map2.put("state", new TableInfo.Column("state", "INTEGER", true, 0, null, 1));
        map2.put("worker_class_name", new TableInfo.Column("worker_class_name", "TEXT", true, 0, null, 1));
        map2.put("input_merger_class_name", new TableInfo.Column("input_merger_class_name", "TEXT", true, 0, null, 1));
        map2.put("input", new TableInfo.Column("input", "BLOB", true, 0, null, 1));
        map2.put("output", new TableInfo.Column("output", "BLOB", true, 0, null, 1));
        map2.put("initial_delay", new TableInfo.Column("initial_delay", "INTEGER", true, 0, null, 1));
        map2.put("interval_duration", new TableInfo.Column("interval_duration", "INTEGER", true, 0, null, 1));
        map2.put("flex_duration", new TableInfo.Column("flex_duration", "INTEGER", true, 0, null, 1));
        map2.put("run_attempt_count", new TableInfo.Column("run_attempt_count", "INTEGER", true, 0, null, 1));
        map2.put("backoff_policy", new TableInfo.Column("backoff_policy", "INTEGER", true, 0, null, 1));
        map2.put("backoff_delay_duration", new TableInfo.Column("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        map2.put("last_enqueue_time", new TableInfo.Column("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        map2.put("minimum_retention_duration", new TableInfo.Column("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        map2.put("schedule_requested_at", new TableInfo.Column("schedule_requested_at", "INTEGER", true, 0, null, 1));
        map2.put("run_in_foreground", new TableInfo.Column("run_in_foreground", "INTEGER", true, 0, null, 1));
        map2.put("out_of_quota_policy", new TableInfo.Column("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        map2.put("period_count", new TableInfo.Column("period_count", "INTEGER", true, 0, "0", 1));
        map2.put("generation", new TableInfo.Column("generation", "INTEGER", true, 0, "0", 1));
        map2.put("next_schedule_time_override", new TableInfo.Column("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        map2.put("next_schedule_time_override_generation", new TableInfo.Column("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        map2.put("stop_reason", new TableInfo.Column("stop_reason", "INTEGER", true, 0, "-256", 1));
        map2.put("trace_tag", new TableInfo.Column("trace_tag", "TEXT", false, 0, null, 1));
        map2.put("required_network_type", new TableInfo.Column("required_network_type", "INTEGER", true, 0, null, 1));
        map2.put("required_network_request", new TableInfo.Column("required_network_request", "BLOB", true, 0, "x''", 1));
        map2.put("requires_charging", new TableInfo.Column("requires_charging", "INTEGER", true, 0, null, 1));
        map2.put("requires_device_idle", new TableInfo.Column("requires_device_idle", "INTEGER", true, 0, null, 1));
        map2.put("requires_battery_not_low", new TableInfo.Column("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        map2.put("requires_storage_not_low", new TableInfo.Column("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        map2.put("trigger_content_update_delay", new TableInfo.Column("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        map2.put("trigger_max_content_delay", new TableInfo.Column("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        map2.put("content_uri_triggers", new TableInfo.Column("content_uri_triggers", "BLOB", true, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new TableInfo.Index("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new TableInfo.Index("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        TableInfo tableInfo2 = new TableInfo("WorkSpec", map2, hashSet3, hashSet4);
        TableInfo tableInfoA2 = TableInfo.a(frameworkSQLiteDatabase, "WorkSpec");
        if (!tableInfo2.equals(tableInfoA2)) {
            return new RoomOpenHelper.ValidationResult(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + tableInfo2 + "\n Found:\n" + tableInfoA2);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new TableInfo.Column("tag", "TEXT", true, 1, null, 1));
        map3.put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new TableInfo.Index("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        TableInfo tableInfo3 = new TableInfo("WorkTag", map3, hashSet5, hashSet6);
        TableInfo tableInfoA3 = TableInfo.a(frameworkSQLiteDatabase, "WorkTag");
        if (!tableInfo3.equals(tableInfoA3)) {
            return new RoomOpenHelper.ValidationResult(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfoA3);
        }
        HashMap map4 = new HashMap(3);
        map4.put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 1, null, 1));
        map4.put("generation", new TableInfo.Column("generation", "INTEGER", true, 2, "0", 1));
        map4.put("system_id", new TableInfo.Column("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        TableInfo tableInfo4 = new TableInfo("SystemIdInfo", map4, hashSet7, new HashSet(0));
        TableInfo tableInfoA4 = TableInfo.a(frameworkSQLiteDatabase, "SystemIdInfo");
        if (!tableInfo4.equals(tableInfoA4)) {
            return new RoomOpenHelper.ValidationResult(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + tableInfo4 + "\n Found:\n" + tableInfoA4);
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new TableInfo.Column("name", "TEXT", true, 1, null, 1));
        map5.put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new TableInfo.Index("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        TableInfo tableInfo5 = new TableInfo("WorkName", map5, hashSet8, hashSet9);
        TableInfo tableInfoA5 = TableInfo.a(frameworkSQLiteDatabase, "WorkName");
        if (!tableInfo5.equals(tableInfoA5)) {
            return new RoomOpenHelper.ValidationResult(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfoA5);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 1, null, 1));
        map6.put("progress", new TableInfo.Column("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        TableInfo tableInfo6 = new TableInfo("WorkProgress", map6, hashSet10, new HashSet(0));
        TableInfo tableInfoA6 = TableInfo.a(frameworkSQLiteDatabase, "WorkProgress");
        if (!tableInfo6.equals(tableInfoA6)) {
            return new RoomOpenHelper.ValidationResult(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + tableInfo6 + "\n Found:\n" + tableInfoA6);
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
        map7.put("long_value", new TableInfo.Column("long_value", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo7 = new TableInfo("Preference", map7, new HashSet(0), new HashSet(0));
        TableInfo tableInfoA7 = TableInfo.a(frameworkSQLiteDatabase, "Preference");
        if (tableInfo7.equals(tableInfoA7)) {
            return new RoomOpenHelper.ValidationResult(true, null);
        }
        return new RoomOpenHelper.ValidationResult(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfoA7);
    }

    @Override // androidx.room.RoomOpenHelper.Delegate
    public final void e(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
    }
}
