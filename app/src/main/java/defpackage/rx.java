package defpackage;

import androidx.work.Logger;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkTagDao;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rx {
    public static final /* synthetic */ int a = 0;

    static {
        Logger.b("DiagnosticsWrkr");
    }

    public static final String a(WorkNameDao workNameDao, WorkTagDao workTagDao, SystemIdInfoDao systemIdInfoDao, List list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WorkSpec workSpec = (WorkSpec) it.next();
            WorkGenerationalId workGenerationalIdW = if3.w(workSpec);
            String str = workSpec.a;
            SystemIdInfo systemIdInfo = systemIdInfoDao.getSystemIdInfo(workGenerationalIdW);
            Integer numValueOf = systemIdInfo != null ? Integer.valueOf(systemIdInfo.c) : null;
            String strW = c.w(workNameDao.getNamesForWorkSpecId(str), ",", null, null, null, 62);
            String strW2 = c.w(workTagDao.getTagsForWorkSpecId(str), ",", null, null, null, 62);
            StringBuilder sbX = vh.x("\n", str, "\t ");
            sbX.append(workSpec.c);
            sbX.append("\t ");
            sbX.append(numValueOf);
            sbX.append("\t ");
            sbX.append(workSpec.b.name());
            sbX.append("\t ");
            sbX.append(strW);
            sbX.append("\t ");
            sbX.append(strW2);
            sbX.append('\t');
            sb.append(sbX.toString());
        }
        return sb.toString();
    }
}
