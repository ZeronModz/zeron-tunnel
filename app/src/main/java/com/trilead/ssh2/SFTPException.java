package com.trilead.ssh2;

import com.trilead.ssh2.sftp.ErrorCodes;
import defpackage.hz;
import defpackage.vh;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class SFTPException extends IOException {
    private static final long serialVersionUID = 578654644222421811L;
    private final int sftpErrorCode;
    private final String sftpErrorMessage;

    public SFTPException(String str, int i) {
        super(constructMessage(str, i));
        this.sftpErrorMessage = str;
        this.sftpErrorCode = i;
    }

    private static String constructMessage(String str, int i) {
        String[] description = ErrorCodes.getDescription(i);
        if (description == null) {
            return hz.t(str, " (UNKNOW SFTP ERROR CODE)");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (");
        sb.append(description[0]);
        sb.append(": ");
        return vh.s(sb, description[1], ")");
    }

    public int getServerErrorCode() {
        return this.sftpErrorCode;
    }

    public String getServerErrorCodeSymbol() {
        String[] description = ErrorCodes.getDescription(this.sftpErrorCode);
        if (description != null) {
            return description[0];
        }
        return "UNKNOW SFTP ERROR CODE " + this.sftpErrorCode;
    }

    public String getServerErrorCodeVerbose() {
        String[] description = ErrorCodes.getDescription(this.sftpErrorCode);
        if (description != null) {
            return description[1];
        }
        return hz.q(this.sftpErrorCode, " is unknown.", new StringBuilder("The error code "));
    }

    public String getServerErrorMessage() {
        return this.sftpErrorMessage;
    }
}
