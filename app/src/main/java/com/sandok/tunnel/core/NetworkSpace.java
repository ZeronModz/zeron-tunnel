package com.sandok.tunnel.core;

import defpackage.hz;
import java.math.BigInteger;
import java.net.Inet6Address;
import java.util.Collection;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class NetworkSpace {
    TreeSet<ipAddress> mIpAddresses = new TreeSet<>();

    public void addIP(CIDRIP cidrip, boolean z) {
        this.mIpAddresses.add(new ipAddress(cidrip, z));
    }

    public void addIPSplit(CIDRIP cidrip, boolean z) {
        for (ipAddress ipaddress : new ipAddress(cidrip, z).split()) {
            this.mIpAddresses.add(ipaddress);
        }
    }

    public void addIPv6(Inet6Address inet6Address, int i, boolean z) {
        this.mIpAddresses.add(new ipAddress(inet6Address, i, z));
    }

    public void clear() {
        this.mIpAddresses.clear();
    }

    public TreeSet<ipAddress> generateIPList() {
        PriorityQueue priorityQueue = new PriorityQueue((SortedSet) this.mIpAddresses);
        TreeSet<ipAddress> treeSet = new TreeSet<>();
        ipAddress ipaddress = (ipAddress) priorityQueue.poll();
        if (ipaddress != null) {
            while (ipaddress != null) {
                ipAddress ipaddress2 = (ipAddress) priorityQueue.poll();
                if (ipaddress2 == null || ipaddress.getLastAddress().compareTo(ipaddress2.getFirstAddress()) == -1) {
                    treeSet.add(ipaddress);
                    ipaddress = ipaddress2;
                } else if (!ipaddress.getFirstAddress().equals(ipaddress2.getFirstAddress()) || ipaddress.networkMask < ipaddress2.networkMask) {
                    if (ipaddress.included != ipaddress2.included) {
                        ipAddress[] ipaddressArrSplit = ipaddress.split();
                        ipAddress ipaddress3 = ipaddressArrSplit[1];
                        if (ipaddress3.networkMask == ipaddress2.networkMask) {
                            priorityQueue.add(ipaddress2);
                        } else {
                            priorityQueue.add(ipaddress3);
                            priorityQueue.add(ipaddress2);
                        }
                        ipaddress = ipaddressArrSplit[0];
                    }
                } else if (ipaddress.included == ipaddress2.included) {
                    ipaddress = ipaddress2;
                } else {
                    ipAddress[] ipaddressArrSplit2 = ipaddress2.split();
                    if (!priorityQueue.contains(ipaddressArrSplit2[1])) {
                        priorityQueue.add(ipaddressArrSplit2[1]);
                    }
                    if (!ipaddressArrSplit2[0].getLastAddress().equals(ipaddress.getLastAddress()) && !priorityQueue.contains(ipaddressArrSplit2[0])) {
                        priorityQueue.add(ipaddressArrSplit2[0]);
                    }
                }
            }
        }
        return treeSet;
    }

    public Collection<ipAddress> getNetworks(boolean z) {
        Vector vector = new Vector();
        for (ipAddress ipaddress : this.mIpAddresses) {
            if (ipaddress.included == z) {
                vector.add(ipaddress);
            }
        }
        return vector;
    }

    public Collection<ipAddress> getPositiveIPList() {
        TreeSet<ipAddress> treeSetGenerateIPList = generateIPList();
        Vector vector = new Vector();
        for (ipAddress ipaddress : treeSetGenerateIPList) {
            if (ipaddress.included) {
                vector.add(ipaddress);
            }
        }
        return vector;
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class ipAddress implements Comparable<ipAddress> {
        private BigInteger firstAddress;
        private boolean included;
        private boolean isV4;
        private BigInteger lastAddress;
        private BigInteger netAddress;
        public int networkMask;

        public ipAddress(Inet6Address inet6Address, int i, boolean z) {
            this.networkMask = i;
            this.included = z;
            this.netAddress = BigInteger.ZERO;
            int length = inet6Address.getAddress().length;
            int i2 = 128;
            for (int i3 = 0; i3 < length; i3++) {
                i2 -= 8;
                this.netAddress = this.netAddress.add(BigInteger.valueOf(r6[i3] & 255).shiftLeft(i2));
            }
        }

        private BigInteger getMaskedAddress(boolean z) {
            BigInteger bit = this.netAddress;
            boolean z2 = this.isV4;
            int i = this.networkMask;
            int i2 = z2 ? 32 - i : 128 - i;
            for (int i3 = 0; i3 < i2; i3++) {
                bit = z ? bit.setBit(i3) : bit.clearBit(i3);
            }
            return bit;
        }

        @Override // java.lang.Comparable
        public int compareTo(ipAddress ipaddress) {
            int iCompareTo = getFirstAddress().compareTo(ipaddress.getFirstAddress());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int i = this.networkMask;
            int i2 = ipaddress.networkMask;
            if (i > i2) {
                return -1;
            }
            return i2 == i ? 0 : 1;
        }

        public boolean containsNet(ipAddress ipaddress) {
            BigInteger firstAddress = getFirstAddress();
            BigInteger lastAddress = getLastAddress();
            return (firstAddress.compareTo(ipaddress.getFirstAddress()) != 1) && (lastAddress.compareTo(ipaddress.getLastAddress()) != -1);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ipAddress)) {
                return this == obj;
            }
            ipAddress ipaddress = (ipAddress) obj;
            return this.networkMask == ipaddress.networkMask && ipaddress.getFirstAddress().equals(getFirstAddress());
        }

        public BigInteger getFirstAddress() {
            BigInteger bigInteger = this.firstAddress;
            if (bigInteger != null) {
                return bigInteger;
            }
            BigInteger maskedAddress = getMaskedAddress(false);
            this.firstAddress = maskedAddress;
            return maskedAddress;
        }

        public String getIPv4Address() {
            long jLongValue = this.netAddress.longValue();
            Locale locale = Locale.US;
            StringBuilder sb = new StringBuilder();
            sb.append((jLongValue >> 24) % 256);
            sb.append(".");
            sb.append((jLongValue >> 16) % 256);
            hz.G(sb, ".", (jLongValue >> 8) % 256, ".");
            sb.append(jLongValue % 256);
            return sb.toString();
        }

        public String getIPv6Address() {
            BigInteger bigIntegerShiftRight = this.netAddress;
            String str = null;
            boolean z = true;
            while (bigIntegerShiftRight.compareTo(BigInteger.ZERO) == 1) {
                long jLongValue = bigIntegerShiftRight.mod(BigInteger.valueOf(65536L)).longValue();
                if (str != null || jLongValue != 0) {
                    if (str == null && !z) {
                        str = ":";
                    }
                    str = z ? String.format(Locale.US, "%x", Long.valueOf(jLongValue), str) : String.format(Locale.US, "%x:%s", Long.valueOf(jLongValue), str);
                }
                bigIntegerShiftRight = bigIntegerShiftRight.shiftRight(16);
                z = false;
            }
            return str == null ? "::" : str;
        }

        public BigInteger getLastAddress() {
            BigInteger bigInteger = this.lastAddress;
            if (bigInteger != null) {
                return bigInteger;
            }
            BigInteger maskedAddress = getMaskedAddress(true);
            this.lastAddress = maskedAddress;
            return maskedAddress;
        }

        public ipAddress[] split() {
            ipAddress ipaddress = new ipAddress(getFirstAddress(), this.networkMask + 1, this.included, this.isV4);
            return new ipAddress[]{ipaddress, new ipAddress(ipaddress.getLastAddress().add(BigInteger.ONE), this.networkMask + 1, this.included, this.isV4)};
        }

        public String toString() {
            if (this.isV4) {
                Locale locale = Locale.US;
                return getIPv4Address() + "/" + this.networkMask;
            }
            Locale locale2 = Locale.US;
            return getIPv6Address() + "/" + this.networkMask;
        }

        public ipAddress(CIDRIP cidrip, boolean z) {
            this.included = z;
            this.netAddress = BigInteger.valueOf(cidrip.getInt());
            this.networkMask = cidrip.len;
            this.isV4 = true;
        }

        public ipAddress(BigInteger bigInteger, int i, boolean z, boolean z2) {
            this.netAddress = bigInteger;
            this.networkMask = i;
            this.included = z;
            this.isV4 = z2;
        }
    }
}
