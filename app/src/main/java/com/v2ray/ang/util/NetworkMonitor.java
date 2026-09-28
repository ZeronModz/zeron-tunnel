package com.v2ray.ang.util;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Process;
import dev.zeron.tunnel.R;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import defpackage.bn0;
import defpackage.it0;
import defpackage.lv;
import defpackage.oy;
import defpackage.xu;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.c;
import kotlinx.coroutines.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/v2ray/ang/util/NetworkMonitor;", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/content/Context;", "context", "Lcom/github/mikephil/charting/charts/LineChart;", "chart", "<init>", "(Landroid/content/Context;Lcom/github/mikephil/charting/charts/LineChart;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NetworkMonitor implements CoroutineScope {
    public final Context a;
    public final LineChart b;
    public float c;
    public final ArrayList d;
    public final ArrayList e;
    public long f;
    public long g;
    public final JobImpl h;
    public final int i;
    public long j;
    public long k;
    public long l;
    public long m;

    public NetworkMonitor(Context context, LineChart lineChart) {
        context.getClass();
        this.a = context;
        this.b = lineChart;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = TrafficStats.getTotalRxBytes();
        this.g = TrafficStats.getTotalTxBytes();
        this.h = g.a();
        if (lineChart != null) {
            Description description = lineChart.getDescription();
            if (description != null) {
                description.a = false;
            }
            lineChart.setTouchEnabled(false);
            lineChart.setDrawGridBackground(false);
            XAxis xAxis = lineChart.getXAxis();
            if (xAxis != null) {
                xAxis.B = -45.0f;
            }
            YAxis axisRight = lineChart.getAxisRight();
            if (axisRight != null) {
                axisRight.a = false;
            }
            Legend legend = lineChart.getLegend();
            if (legend != null) {
                legend.a = false;
            }
            XAxis xAxis2 = lineChart.getXAxis();
            xAxis2.a = false;
            xAxis2.q = false;
            xAxis2.o = false;
            xAxis2.p = false;
            xAxis2.C = XAxis.XAxisPosition.BOTTOM;
            YAxis axisLeft = lineChart.getAxisLeft();
            axisLeft.e = context.getColor(R.color.textColor);
            axisLeft.v = true;
            axisLeft.x = 0.0f;
            axisLeft.y = Math.abs(axisLeft.w - 0.0f);
            axisLeft.f = new it0();
            axisLeft.o = false;
        }
        int iMyUid = Process.myUid();
        this.i = iMyUid;
        this.j = TrafficStats.getUidRxBytes(iMyUid);
        this.k = TrafficStats.getUidTxBytes(iMyUid);
    }

    public static void a(NetworkMonitor networkMonitor) {
        c.d(networkMonitor, null, null, new NetworkMonitor$startMonitoring$1(networkMonitor, 1000L, null), 3);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public final CoroutineContext getI() {
        lv lvVar = oy.a;
        MainCoroutineDispatcher mainCoroutineDispatcher = bn0.a;
        mainCoroutineDispatcher.getClass();
        return kotlin.coroutines.b.d(this.h, mainCoroutineDispatcher);
    }

    public /* synthetic */ NetworkMonitor(Context context, LineChart lineChart, int i, xu xuVar) {
        this(context, (i & 2) != 0 ? null : lineChart);
    }
}
