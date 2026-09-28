package net.openvpn.openvpn;

import java.text.SimpleDateFormat;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class XMLRPC {

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface Serializable {
        Object getSerializable();
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class Tag {
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class XMLRPCFault extends XMLRPCException {
        private int faultCode;
        private String faultString;

        public XMLRPCFault(String str, int i) {
            super("XMLRPC Fault: " + str + " [code " + i + "]");
            this.faultString = str;
            this.faultCode = i;
        }

        public int getFaultCode() {
            return this.faultCode;
        }

        public String getFaultString() {
            return this.faultString;
        }
    }

    static {
        new SimpleDateFormat("yyyyMMdd'T'HH:mm:ss");
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class XMLRPCException extends Exception {
        public XMLRPCException(Exception exc) {
            super(exc);
        }

        public XMLRPCException(String str) {
            super(str);
        }
    }
}
