package defpackage;

import android.database.Cursor;
import android.os.Build;
import kotlin.collections.b;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rs {
    public static final int a(Cursor cursor, String str) {
        cursor.getClass();
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        columnNames.getClass();
        String strConcat = ".".concat(str);
        String strF = vh.f('`', ".", str);
        int length = columnNames.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str2 = columnNames[i];
            int i3 = i2 + 1;
            if (str2.length() >= str.length() + 2 && (g.u(str2, strConcat, false) || (str2.charAt(0) == '`' && g.u(str2, strF, false)))) {
                return i2;
            }
            i++;
            i2 = i3;
        }
        return -1;
    }

    public static final int b(Cursor cursor, String str) {
        String strS;
        cursor.getClass();
        int iA = a(cursor, str);
        if (iA >= 0) {
            return iA;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            columnNames.getClass();
            strS = b.s(columnNames, 63);
        } catch (Exception unused) {
            strS = "unknown";
        }
        u7.r(hz.v("column '", str, "' does not exist. Available columns: ", strS));
        return 0;
    }
}
