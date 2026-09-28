package com.vpn.sandok.ultrasshservice.tunnel.vpn;

import defpackage.hz;
import defpackage.zg1;
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
    TreeSet<IpAddress> mIpAddresses = new TreeSet<>();

    public static void assertTrue(boolean z) {
        if (z) {
            return;
        }
        zg1.h();
    }

    public void addIP(CIDRIP cidrip, boolean z) {
        this.mIpAddresses.add(new IpAddress(cidrip, z));
    }

    public void addIPSplit(CIDRIP cidrip, boolean z) {
        for (IpAddress ipAddress : new IpAddress(cidrip, z).split()) {
            this.mIpAddresses.add(ipAddress);
        }
    }

    public void addIPv6(Inet6Address inet6Address, int i, boolean z) {
        this.mIpAddresses.add(new IpAddress(inet6Address, i, z));
    }

    public void clear() {
        this.mIpAddresses.clear();
    }

    public TreeSet<IpAddress> generateIPList() {
        PriorityQueue priorityQueue = new PriorityQueue((SortedSet) this.mIpAddresses);
        TreeSet<IpAddress> treeSet = new TreeSet<>();
        IpAddress ipAddress = (IpAddress) priorityQueue.poll();
        if (ipAddress != null) {
            while (ipAddress != null) {
                IpAddress ipAddress2 = (IpAddress) priorityQueue.poll();
                if (ipAddress2 == null || ipAddress.getLastAddress().compareTo(ipAddress2.getFirstAddress()) == -1) {
                    treeSet.add(ipAddress);
                    ipAddress = ipAddress2;
                } else if (!ipAddress.getFirstAddress().equals(ipAddress2.getFirstAddress()) || ipAddress.networkMask < ipAddress2.networkMask) {
                    if (ipAddress.included != ipAddress2.included) {
                        IpAddress[] ipAddressArrSplit = ipAddress.split();
                        IpAddress ipAddress3 = ipAddressArrSplit[1];
                        if (ipAddress3.networkMask == ipAddress2.networkMask) {
                            priorityQueue.add(ipAddress2);
                        } else {
                            priorityQueue.add(ipAddress3);
                            priorityQueue.add(ipAddress2);
                        }
                        ipAddress = ipAddressArrSplit[0];
                    }
                } else if (ipAddress.included == ipAddress2.included) {
                    ipAddress = ipAddress2;
                } else {
                    IpAddress[] ipAddressArrSplit2 = ipAddress2.split();
                    if (!priorityQueue.contains(ipAddressArrSplit2[1])) {
                        priorityQueue.add(ipAddressArrSplit2[1]);
                    }
                    if (!ipAddressArrSplit2[0].getLastAddress().equals(ipAddress.getLastAddress()) && !priorityQueue.contains(ipAddressArrSplit2[0])) {
                        priorityQueue.add(ipAddressArrSplit2[0]);
                    }
                }
            }
        }
        return treeSet;
    }

    public Collection<IpAddress> getNetworks(boolean z) {
        Vector vector = new Vector();
        for (IpAddress ipAddress : this.mIpAddresses) {
            if (ipAddress.included == z) {
                vector.add(ipAddress);
            }
        }
        return vector;
    }

    public Collection<IpAddress> getPositiveIPList() {
        TreeSet<IpAddress> treeSetGenerateIPList = generateIPList();
        Vector vector = new Vector();
        for (IpAddress ipAddress : treeSetGenerateIPList) {
            if (ipAddress.included) {
                vector.add(ipAddress);
            }
        }
        return vector;
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class IpAddress implements Comparable<IpAddress> {
        private BigInteger firstAddress;
        private boolean included;
        private boolean isV4;
        private BigInteger lastAddress;
        private BigInteger netAddress;
        public int networkMask;

        public IpAddress(Inet6Address inet6Address, int i, boolean z) {
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
        public int compareTo(IpAddress ipAddress) {
            int iCompareTo = getFirstAddress().compareTo(ipAddress.getFirstAddress());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int i = this.networkMask;
            int i2 = ipAddress.networkMask;
            if (i > i2) {
                return -1;
            }
            return i2 == i ? 0 : 1;
        }

        public boolean containsNet(IpAddress ipAddress) {
            BigInteger firstAddress = getFirstAddress();
            BigInteger lastAddress = getLastAddress();
            return (firstAddress.compareTo(ipAddress.getFirstAddress()) != 1) && (lastAddress.compareTo(ipAddress.getLastAddress()) != -1);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof IpAddress)) {
                return this == obj;
            }
            IpAddress ipAddress = (IpAddress) obj;
            return this.networkMask == ipAddress.networkMask && ipAddress.getFirstAddress().equals(getFirstAddress());
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

        public IpAddress[] split() {
            IpAddress ipAddress = new IpAddress(getFirstAddress(), this.networkMask + 1, this.included, this.isV4);
            return new IpAddress[]{ipAddress, new IpAddress(ipAddress.getLastAddress().add(BigInteger.ONE), this.networkMask + 1, this.included, this.isV4)};
        }

        public String toString() {
            if (this.isV4) {
                Locale locale = Locale.US;
                return getIPv4Address() + "/" + this.networkMask;
            }
            Locale locale2 = Locale.US;
            return getIPv6Address() + "/" + this.networkMask;
        }

        public IpAddress(CIDRIP cidrip, boolean z) {
            this.included = z;
            this.netAddress = BigInteger.valueOf(cidrip.getInt());
            this.networkMask = cidrip.len;
            this.isV4 = true;
        }

        public IpAddress(BigInteger bigInteger, int i, boolean z, boolean z2) {
            this.netAddress = bigInteger;
            this.networkMask = i;
            this.included = z;
            this.isV4 = z2;
        }
    }
}
