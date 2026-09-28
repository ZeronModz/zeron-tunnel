package com.sandok.tunnel.utils;

import android.net.TrafficStats;
import android.os.SystemClock;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.vh;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class StatisticsGraphData {
    private static StatisticsGraphData statisticData;
    private DataTransferStats m_dataTransferStats = new DataTransferStats();
    private boolean m_displayDataTransferStats = false;

    private StatisticsGraphData() {
    }

    public static synchronized StatisticsGraphData getStatisticData() {
        StatisticsGraphData statisticsGraphData;
        statisticsGraphData = statisticData;
        if (statisticsGraphData == null) {
            statisticsGraphData = new StatisticsGraphData();
            statisticData = statisticsGraphData;
        }
        return statisticsGraphData;
    }

    public synchronized DataTransferStats getDataTransferStats() {
        return this.m_dataTransferStats;
    }

    public synchronized boolean getDisplayDataTransferStats() {
        return this.m_displayDataTransferStats;
    }

    public synchronized void setDisplayDataTransferStats(boolean z) {
        this.m_displayDataTransferStats = z;
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public class DataTransferStats {
        public static final long FAST_BUCKET_PERIOD_MILLISECONDS = 1000;
        public static final int MAX_BUCKETS = 288;
        public static final long SLOW_BUCKET_PERIOD_MILLISECONDS = 300000;
        private long mLastReceived;
        private long mLastSent;
        private long mReceived;
        private long mSent;
        private long m_connectedTime;
        private ArrayList<Bucket> m_fastBuckets;
        private long m_fastBucketsLastStartTime;
        private boolean m_isConnected;
        private ArrayList<Bucket> m_slowBuckets;
        private long m_slowBucketsLastStartTime;
        private long m_totalBytesSent = 0;
        private long m_totalBytesReceived = 0;

        public DataTransferStats() {
            stop();
        }

        private void addReceivedToBuckets(long j) {
            ((Bucket) vh.e(this.m_slowBuckets, 1)).m_bytesReceived += j;
            ((Bucket) vh.e(this.m_fastBuckets, 1)).m_bytesReceived += j;
        }

        private void addSentToBuckets(long j) {
            ((Bucket) vh.e(this.m_slowBuckets, 1)).m_bytesSent += j;
            ((Bucket) vh.e(this.m_fastBuckets, 1)).m_bytesSent += j;
        }

        private long bucketStartTime(long j, long j2) {
            return (j / j2) * j2;
        }

        private ArrayList<Long> getReceivedSeries(ArrayList<Bucket> arrayList) {
            ArrayList<Long> arrayList2 = new ArrayList<>();
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList2.add(Long.valueOf(arrayList.get(i).m_bytesReceived));
            }
            return arrayList2;
        }

        private ArrayList<Long> getSentSeries(ArrayList<Bucket> arrayList) {
            ArrayList<Long> arrayList2 = new ArrayList<>();
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList2.add(Long.valueOf(arrayList.get(i).m_bytesSent));
            }
            return arrayList2;
        }

        private void manageBuckets() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.m_slowBucketsLastStartTime;
            if (j >= 300000) {
                shiftBuckets(j, 300000L, this.m_slowBuckets);
                this.m_slowBucketsLastStartTime = bucketStartTime(jElapsedRealtime, 300000L);
            }
            long j2 = jElapsedRealtime - this.m_fastBucketsLastStartTime;
            if (j2 >= 1000) {
                shiftBuckets(j2, 1000L, this.m_fastBuckets);
                this.m_fastBucketsLastStartTime = bucketStartTime(jElapsedRealtime, 1000L);
            }
        }

        private ArrayList<Bucket> newBuckets() {
            ArrayList<Bucket> arrayList = new ArrayList<>();
            int i = 0;
            for (int i2 = 0; i2 < 288; i2++) {
                arrayList.add(new Bucket(this, i));
            }
            return arrayList;
        }

        private void resetBytesTransferred() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.m_slowBucketsLastStartTime = bucketStartTime(jElapsedRealtime, 300000L);
            this.m_slowBuckets = newBuckets();
            this.m_fastBucketsLastStartTime = bucketStartTime(jElapsedRealtime, 1000L);
            this.m_fastBuckets = newBuckets();
        }

        private void shiftBuckets(long j, long j2, ArrayList<Bucket> arrayList) {
            int i = 0;
            for (int i2 = 0; i2 < (j / j2) + 1; i2++) {
                arrayList.add(arrayList.size(), new Bucket(this, i));
                if (arrayList.size() >= 288) {
                    arrayList.remove(0);
                }
            }
        }

        public synchronized void addBytesReceived(long j) {
            this.m_totalBytesReceived += j;
            manageBuckets();
            addReceivedToBuckets(j);
        }

        public synchronized void addBytesSent(long j) {
            this.m_totalBytesSent += j;
            manageBuckets();
            addSentToBuckets(j);
        }

        public String byteCountNoDisplaySize(long j, boolean z) {
            int i = z ? 1000 : 1024;
            DecimalFormat decimalFormat = new DecimalFormat("0.0");
            if (j < i) {
                return String.valueOf(decimalFormat.format(j / 1024.0d));
            }
            double d = j;
            double d2 = i;
            int iLog = (int) (Math.log(d) / Math.log(d2));
            (z ? "kMGTPE" : "KMGTPE").charAt(iLog - 1);
            return String.format("%.1f", Double.valueOf(d / Math.pow(d2, iLog)));
        }

        public String byteCountToDisplaySize(long j, boolean z) {
            int i = z ? 1000 : 1024;
            if (j < i) {
                return j + " B";
            }
            double d = j;
            double d2 = i;
            int iLog = (int) (Math.log(d) / Math.log(d2));
            StringBuilder sb = new StringBuilder();
            sb.append((z ? "kMGTPE" : "KMGTPE").charAt(iLog - 1));
            sb.append(z ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : "i");
            return String.format("%.1f %sB", Double.valueOf(d / Math.pow(d2, iLog)), sb.toString());
        }

        public String elapsedTimeToDisplay(long j) {
            long j2 = j / 3600000;
            TimeUnit timeUnit = TimeUnit.HOURS;
            long millis = (j - timeUnit.toMillis(j2)) / 60000;
            return String.format("%02dh %02dm %02ds", Long.valueOf(j2), Long.valueOf(millis), Long.valueOf(((j - timeUnit.toMillis(j2)) - TimeUnit.MINUTES.toMillis(millis)) / 1000));
        }

        public synchronized long getBytesReceived() {
            long j;
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            j = totalRxBytes - this.mLastReceived;
            this.mReceived = j;
            this.mLastReceived = totalRxBytes;
            return j;
        }

        public synchronized long getBytesSent() {
            long j;
            long totalTxBytes = TrafficStats.getTotalTxBytes();
            j = totalTxBytes - this.mLastSent;
            this.mSent = j;
            this.mLastSent = totalTxBytes;
            return j;
        }

        public synchronized long getElapsedTime() {
            return SystemClock.elapsedRealtime() - this.m_connectedTime;
        }

        public synchronized ArrayList<Long> getFastReceivedSeries() {
            manageBuckets();
            return getReceivedSeries(this.m_fastBuckets);
        }

        public synchronized ArrayList<Long> getFastSentSeries() {
            manageBuckets();
            return getSentSeries(this.m_fastBuckets);
        }

        public synchronized ArrayList<Long> getSlowReceivedSeries() {
            manageBuckets();
            return getReceivedSeries(this.m_slowBuckets);
        }

        public synchronized ArrayList<Long> getSlowSentSeries() {
            manageBuckets();
            return getSentSeries(this.m_slowBuckets);
        }

        public synchronized long getTotalBytesReceived() {
            return this.m_totalBytesReceived;
        }

        public synchronized long getTotalBytesSent() {
            return this.m_totalBytesSent;
        }

        public synchronized boolean isConnected() {
            return this.m_isConnected;
        }

        public long render_byteCount(Long l, boolean z) {
            int i = z ? 1000 : 1024;
            if (l.longValue() < i) {
                return l.longValue();
            }
            return (long) (l.longValue() / Math.pow(i, (int) (Math.log(l.longValue()) / Math.log(r2))));
        }

        public synchronized void startConnected() {
            this.m_isConnected = true;
            this.m_connectedTime = SystemClock.elapsedRealtime();
        }

        public synchronized void startSession() {
            resetBytesTransferred();
        }

        public synchronized void stop() {
            this.m_isConnected = false;
            this.m_connectedTime = 0L;
            resetBytesTransferred();
        }

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        public class Bucket {
            public long m_bytesReceived;
            public long m_bytesSent;

            private Bucket() {
                this.m_bytesSent = 0L;
                this.m_bytesReceived = 0L;
            }

            public /* synthetic */ Bucket(DataTransferStats dataTransferStats, int i) {
                this();
            }
        }
    }
}
