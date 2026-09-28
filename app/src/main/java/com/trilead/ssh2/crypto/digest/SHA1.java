package com.trilead.ssh2.crypto.digest;

import defpackage.vh;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class SHA1 implements Digest {
    private int H0;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private long currentLen;
    private int currentPos;
    private final int[] w = new int[80];

    public SHA1() {
        reset();
    }

    private final void perform() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.w;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
        }
        int i3 = this.H0;
        int i4 = this.H1;
        int i5 = this.H2;
        int i6 = this.H3;
        int i7 = this.H4;
        int i8 = ((i3 << 5) | (i3 >>> 27)) + ((i4 & i5) | ((~i4) & i6));
        int[] iArr2 = this.w;
        int iB = vh.b(i8, iArr2[0], 1518500249, i7);
        int i9 = (i4 << 30) | (i4 >>> 2);
        int iB2 = vh.b(((iB << 5) | (iB >>> 27)) + ((i3 & i9) | ((~i3) & i5)), iArr2[1], 1518500249, i6);
        int i10 = (i3 << 30) | (i3 >>> 2);
        int iB3 = vh.b(((iB2 << 5) | (iB2 >>> 27)) + (((~iB) & i9) | (iB & i10)), iArr2[2], 1518500249, i5);
        int i11 = (iB >>> 2) | (iB << 30);
        int iB4 = vh.b(((iB3 << 5) | (iB3 >>> 27)) + ((iB2 & i11) | ((~iB2) & i10)), iArr2[3], 1518500249, i9);
        int i12 = (iB2 << 30) | (iB2 >>> 2);
        int iB5 = vh.b(((iB4 << 5) | (iB4 >>> 27)) + (((~iB3) & i11) | (iB3 & i12)), iArr2[4], 1518500249, i10);
        int i13 = (iB3 << 30) | (iB3 >>> 2);
        int iB6 = vh.b(((iB5 << 5) | (iB5 >>> 27)) + ((iB4 & i13) | ((~iB4) & i12)), iArr2[5], 1518500249, i11);
        int i14 = (iB4 >>> 2) | (iB4 << 30);
        int iB7 = vh.b(((iB6 << 5) | (iB6 >>> 27)) + ((iB5 & i14) | ((~iB5) & i13)), iArr2[6], 1518500249, i12);
        int i15 = (iB5 >>> 2) | (iB5 << 30);
        int iB8 = vh.b(((iB7 << 5) | (iB7 >>> 27)) + ((iB6 & i15) | ((~iB6) & i14)), iArr2[7], 1518500249, i13);
        int i16 = (iB6 >>> 2) | (iB6 << 30);
        int iB9 = vh.b(((iB8 << 5) | (iB8 >>> 27)) + ((iB7 & i16) | ((~iB7) & i15)), iArr2[8], 1518500249, i14);
        int i17 = (iB7 >>> 2) | (iB7 << 30);
        int iB10 = vh.b(((iB9 << 5) | (iB9 >>> 27)) + ((iB8 & i17) | ((~iB8) & i16)), iArr2[9], 1518500249, i15);
        int i18 = (iB8 >>> 2) | (iB8 << 30);
        int iB11 = vh.b(((iB10 << 5) | (iB10 >>> 27)) + ((iB9 & i18) | ((~iB9) & i17)), iArr2[10], 1518500249, i16);
        int i19 = (iB9 >>> 2) | (iB9 << 30);
        int iB12 = vh.b(((iB11 << 5) | (iB11 >>> 27)) + ((iB10 & i19) | ((~iB10) & i18)), iArr2[11], 1518500249, i17);
        int i20 = (iB10 >>> 2) | (iB10 << 30);
        int iB13 = vh.b(((iB12 << 5) | (iB12 >>> 27)) + ((iB11 & i20) | ((~iB11) & i19)), iArr2[12], 1518500249, i18);
        int i21 = (iB11 >>> 2) | (iB11 << 30);
        int iB14 = vh.b(((iB13 << 5) | (iB13 >>> 27)) + ((iB12 & i21) | ((~iB12) & i20)), iArr2[13], 1518500249, i19);
        int i22 = (iB12 >>> 2) | (iB12 << 30);
        int iB15 = vh.b(((iB14 << 5) | (iB14 >>> 27)) + ((iB13 & i22) | ((~iB13) & i21)), iArr2[14], 1518500249, i20);
        int i23 = (iB13 >>> 2) | (iB13 << 30);
        int iB16 = vh.b(((iB15 << 5) | (iB15 >>> 27)) + ((iB14 & i23) | ((~iB14) & i22)), iArr2[15], 1518500249, i21);
        int i24 = (iB14 >>> 2) | (iB14 << 30);
        int iB17 = vh.b(((iB16 << 5) | (iB16 >>> 27)) + ((iB15 & i24) | ((~iB15) & i23)), iArr2[16], 1518500249, i22);
        int i25 = (iB15 >>> 2) | (iB15 << 30);
        int iB18 = vh.b(((iB17 << 5) | (iB17 >>> 27)) + ((iB16 & i25) | ((~iB16) & i24)), iArr2[17], 1518500249, i23);
        int i26 = (iB16 >>> 2) | (iB16 << 30);
        int iB19 = vh.b(((iB18 << 5) | (iB18 >>> 27)) + ((iB17 & i26) | ((~iB17) & i25)), iArr2[18], 1518500249, i24);
        int i27 = (iB17 >>> 2) | (iB17 << 30);
        int iB20 = vh.b(((iB19 << 5) | (iB19 >>> 27)) + ((iB18 & i27) | ((~iB18) & i26)), iArr2[19], 1518500249, i25);
        int i28 = (iB18 << 30) | (iB18 >>> 2);
        int iB21 = vh.b(((iB20 << 5) | (iB20 >>> 27)) + ((iB19 ^ i28) ^ i27), iArr2[20], 1859775393, i26);
        int i29 = (iB19 >>> 2) | (iB19 << 30);
        int iB22 = vh.b(((iB21 << 5) | (iB21 >>> 27)) + ((iB20 ^ i29) ^ i28), iArr2[21], 1859775393, i27);
        int i30 = (iB20 >>> 2) | (iB20 << 30);
        int iB23 = vh.b(((iB22 << 5) | (iB22 >>> 27)) + ((iB21 ^ i30) ^ i29), iArr2[22], 1859775393, i28);
        int i31 = (iB21 >>> 2) | (iB21 << 30);
        int iB24 = vh.b(((iB23 << 5) | (iB23 >>> 27)) + ((iB22 ^ i31) ^ i30), iArr2[23], 1859775393, i29);
        int i32 = (iB22 >>> 2) | (iB22 << 30);
        int iB25 = vh.b(((iB24 << 5) | (iB24 >>> 27)) + ((iB23 ^ i32) ^ i31), iArr2[24], 1859775393, i30);
        int i33 = (iB23 >>> 2) | (iB23 << 30);
        int iB26 = vh.b(((iB25 << 5) | (iB25 >>> 27)) + ((iB24 ^ i33) ^ i32), iArr2[25], 1859775393, i31);
        int i34 = (iB24 >>> 2) | (iB24 << 30);
        int iB27 = vh.b(((iB26 << 5) | (iB26 >>> 27)) + ((iB25 ^ i34) ^ i33), iArr2[26], 1859775393, i32);
        int i35 = (iB25 >>> 2) | (iB25 << 30);
        int iB28 = vh.b(((iB27 << 5) | (iB27 >>> 27)) + ((iB26 ^ i35) ^ i34), iArr2[27], 1859775393, i33);
        int i36 = (iB26 >>> 2) | (iB26 << 30);
        int iB29 = vh.b(((iB28 << 5) | (iB28 >>> 27)) + ((iB27 ^ i36) ^ i35), iArr2[28], 1859775393, i34);
        int i37 = (iB27 >>> 2) | (iB27 << 30);
        int iB30 = vh.b(((iB29 << 5) | (iB29 >>> 27)) + ((iB28 ^ i37) ^ i36), iArr2[29], 1859775393, i35);
        int i38 = (iB28 >>> 2) | (iB28 << 30);
        int iB31 = vh.b(((iB30 << 5) | (iB30 >>> 27)) + ((iB29 ^ i38) ^ i37), iArr2[30], 1859775393, i36);
        int i39 = (iB29 >>> 2) | (iB29 << 30);
        int iB32 = vh.b(((iB31 << 5) | (iB31 >>> 27)) + ((iB30 ^ i39) ^ i38), iArr2[31], 1859775393, i37);
        int i40 = (iB30 >>> 2) | (iB30 << 30);
        int iB33 = vh.b(((iB32 << 5) | (iB32 >>> 27)) + ((iB31 ^ i40) ^ i39), iArr2[32], 1859775393, i38);
        int i41 = (iB31 >>> 2) | (iB31 << 30);
        int iB34 = vh.b(((iB33 << 5) | (iB33 >>> 27)) + ((iB32 ^ i41) ^ i40), iArr2[33], 1859775393, i39);
        int i42 = (iB32 >>> 2) | (iB32 << 30);
        int iB35 = vh.b(((iB34 << 5) | (iB34 >>> 27)) + ((iB33 ^ i42) ^ i41), iArr2[34], 1859775393, i40);
        int i43 = (iB33 >>> 2) | (iB33 << 30);
        int iB36 = vh.b(((iB35 << 5) | (iB35 >>> 27)) + ((iB34 ^ i43) ^ i42), iArr2[35], 1859775393, i41);
        int i44 = (iB34 >>> 2) | (iB34 << 30);
        int iB37 = vh.b(((iB36 << 5) | (iB36 >>> 27)) + ((iB35 ^ i44) ^ i43), iArr2[36], 1859775393, i42);
        int i45 = (iB35 >>> 2) | (iB35 << 30);
        int iB38 = vh.b(((iB37 << 5) | (iB37 >>> 27)) + ((iB36 ^ i45) ^ i44), iArr2[37], 1859775393, i43);
        int i46 = (iB36 >>> 2) | (iB36 << 30);
        int iB39 = vh.b(((iB38 << 5) | (iB38 >>> 27)) + ((iB37 ^ i46) ^ i45), iArr2[38], 1859775393, i44);
        int i47 = (iB37 >>> 2) | (iB37 << 30);
        int iB40 = vh.b(((iB39 << 5) | (iB39 >>> 27)) + ((iB38 ^ i47) ^ i46), iArr2[39], 1859775393, i45);
        int i48 = (iB38 >>> 2) | (iB38 << 30);
        int iB41 = vh.b(((iB40 << 5) | (iB40 >>> 27)) + (((i48 | i47) & iB39) | (i48 & i47)), iArr2[40], -1894007588, i46);
        int i49 = (iB39 >>> 2) | (iB39 << 30);
        int iB42 = vh.b(((iB41 << 5) | (iB41 >>> 27)) + (((i49 | i48) & iB40) | (i49 & i48)), iArr2[41], -1894007588, i47);
        int i50 = (iB40 >>> 2) | (iB40 << 30);
        int iB43 = vh.b(((iB42 << 5) | (iB42 >>> 27)) + (((i50 | i49) & iB41) | (i50 & i49)), iArr2[42], -1894007588, i48);
        int i51 = (iB41 >>> 2) | (iB41 << 30);
        int iB44 = vh.b(((iB43 << 5) | (iB43 >>> 27)) + (((i51 | i50) & iB42) | (i51 & i50)), iArr2[43], -1894007588, i49);
        int i52 = (iB42 >>> 2) | (iB42 << 30);
        int iB45 = vh.b(((iB44 << 5) | (iB44 >>> 27)) + (((i52 | i51) & iB43) | (i52 & i51)), iArr2[44], -1894007588, i50);
        int i53 = (iB43 >>> 2) | (iB43 << 30);
        int iB46 = vh.b(((iB45 << 5) | (iB45 >>> 27)) + (((i53 | i52) & iB44) | (i53 & i52)), iArr2[45], -1894007588, i51);
        int i54 = (iB44 >>> 2) | (iB44 << 30);
        int iB47 = vh.b(((iB46 << 5) | (iB46 >>> 27)) + (((i54 | i53) & iB45) | (i54 & i53)), iArr2[46], -1894007588, i52);
        int i55 = (iB45 >>> 2) | (iB45 << 30);
        int iB48 = vh.b(((iB47 << 5) | (iB47 >>> 27)) + (((i55 | i54) & iB46) | (i55 & i54)), iArr2[47], -1894007588, i53);
        int i56 = (iB46 >>> 2) | (iB46 << 30);
        int iB49 = vh.b(((iB48 << 5) | (iB48 >>> 27)) + (((i56 | i55) & iB47) | (i56 & i55)), iArr2[48], -1894007588, i54);
        int i57 = (iB47 >>> 2) | (iB47 << 30);
        int iB50 = vh.b(((iB49 << 5) | (iB49 >>> 27)) + (((i57 | i56) & iB48) | (i57 & i56)), iArr2[49], -1894007588, i55);
        int i58 = (iB48 >>> 2) | (iB48 << 30);
        int iB51 = vh.b(((iB50 << 5) | (iB50 >>> 27)) + (((i58 | i57) & iB49) | (i58 & i57)), iArr2[50], -1894007588, i56);
        int i59 = (iB49 >>> 2) | (iB49 << 30);
        int iB52 = vh.b(((iB51 << 5) | (iB51 >>> 27)) + (((i59 | i58) & iB50) | (i59 & i58)), iArr2[51], -1894007588, i57);
        int i60 = (iB50 >>> 2) | (iB50 << 30);
        int iB53 = vh.b(((iB52 << 5) | (iB52 >>> 27)) + (((i60 | i59) & iB51) | (i60 & i59)), iArr2[52], -1894007588, i58);
        int i61 = (iB51 >>> 2) | (iB51 << 30);
        int iB54 = vh.b(((iB53 << 5) | (iB53 >>> 27)) + (((i61 | i60) & iB52) | (i61 & i60)), iArr2[53], -1894007588, i59);
        int i62 = (iB52 >>> 2) | (iB52 << 30);
        int iB55 = vh.b(((iB54 << 5) | (iB54 >>> 27)) + (((i62 | i61) & iB53) | (i62 & i61)), iArr2[54], -1894007588, i60);
        int i63 = (iB53 >>> 2) | (iB53 << 30);
        int i64 = (((i61 + ((iB55 << 5) | (iB55 >>> 27))) + (((i63 | i62) & iB54) | (i63 & i62))) + iArr2[55]) - 1894007588;
        int i65 = (iB54 >>> 2) | (iB54 << 30);
        int iB56 = vh.b(((i64 << 5) | (i64 >>> 27)) + (((i65 | i63) & iB55) | (i65 & i63)), iArr2[56], -1894007588, i62);
        int i66 = (iB55 >>> 2) | (iB55 << 30);
        int iB57 = vh.b(((iB56 << 5) | (iB56 >>> 27)) + (((i66 | i65) & i64) | (i66 & i65)), iArr2[57], -1894007588, i63);
        int i67 = (i64 >>> 2) | (i64 << 30);
        int iB58 = vh.b(((iB57 << 5) | (iB57 >>> 27)) + (((i67 | i66) & iB56) | (i67 & i66)), iArr2[58], -1894007588, i65);
        int i68 = (iB56 >>> 2) | (iB56 << 30);
        int iB59 = vh.b(((iB58 << 5) | (iB58 >>> 27)) + (((i68 | i67) & iB57) | (i68 & i67)), iArr2[59], -1894007588, i66);
        int i69 = (iB57 >>> 2) | (iB57 << 30);
        int iB60 = vh.b(((iB59 << 5) | (iB59 >>> 27)) + ((iB58 ^ i69) ^ i68), iArr2[60], -899497514, i67);
        int i70 = (iB58 >>> 2) | (iB58 << 30);
        int iB61 = vh.b(((iB60 << 5) | (iB60 >>> 27)) + ((iB59 ^ i70) ^ i69), iArr2[61], -899497514, i68);
        int i71 = (iB59 >>> 2) | (iB59 << 30);
        int iB62 = vh.b(((iB61 << 5) | (iB61 >>> 27)) + ((iB60 ^ i71) ^ i70), iArr2[62], -899497514, i69);
        int i72 = (iB60 >>> 2) | (iB60 << 30);
        int iB63 = vh.b(((iB62 << 5) | (iB62 >>> 27)) + ((iB61 ^ i72) ^ i71), iArr2[63], -899497514, i70);
        int i73 = (iB61 >>> 2) | (iB61 << 30);
        int iB64 = vh.b(((iB63 << 5) | (iB63 >>> 27)) + ((iB62 ^ i73) ^ i72), iArr2[64], -899497514, i71);
        int i74 = (iB62 >>> 2) | (iB62 << 30);
        int iB65 = vh.b(((iB64 << 5) | (iB64 >>> 27)) + ((iB63 ^ i74) ^ i73), iArr2[65], -899497514, i72);
        int i75 = (iB63 >>> 2) | (iB63 << 30);
        int iB66 = vh.b(((iB65 << 5) | (iB65 >>> 27)) + ((iB64 ^ i75) ^ i74), iArr2[66], -899497514, i73);
        int i76 = (iB64 >>> 2) | (iB64 << 30);
        int iB67 = vh.b(((iB66 << 5) | (iB66 >>> 27)) + ((iB65 ^ i76) ^ i75), iArr2[67], -899497514, i74);
        int i77 = (iB65 >>> 2) | (iB65 << 30);
        int iB68 = vh.b(((iB67 << 5) | (iB67 >>> 27)) + ((iB66 ^ i77) ^ i76), iArr2[68], -899497514, i75);
        int i78 = (iB66 >>> 2) | (iB66 << 30);
        int iB69 = vh.b(((iB68 << 5) | (iB68 >>> 27)) + ((iB67 ^ i78) ^ i77), iArr2[69], -899497514, i76);
        int i79 = (iB67 >>> 2) | (iB67 << 30);
        int iB70 = vh.b(((iB69 << 5) | (iB69 >>> 27)) + ((iB68 ^ i79) ^ i78), iArr2[70], -899497514, i77);
        int i80 = (iB68 >>> 2) | (iB68 << 30);
        int iB71 = vh.b(((iB70 << 5) | (iB70 >>> 27)) + ((iB69 ^ i80) ^ i79), iArr2[71], -899497514, i78);
        int i81 = (iB69 >>> 2) | (iB69 << 30);
        int iB72 = vh.b(((iB71 << 5) | (iB71 >>> 27)) + ((iB70 ^ i81) ^ i80), iArr2[72], -899497514, i79);
        int i82 = (iB70 >>> 2) | (iB70 << 30);
        int iB73 = vh.b(((iB72 << 5) | (iB72 >>> 27)) + ((iB71 ^ i82) ^ i81), iArr2[73], -899497514, i80);
        int i83 = (iB71 >>> 2) | (iB71 << 30);
        int iB74 = vh.b(((iB73 << 5) | (iB73 >>> 27)) + ((iB72 ^ i83) ^ i82), iArr2[74], -899497514, i81);
        int i84 = (iB72 >>> 2) | (iB72 << 30);
        int iB75 = vh.b(((iB74 << 5) | (iB74 >>> 27)) + ((iB73 ^ i84) ^ i83), iArr2[75], -899497514, i82);
        int i85 = (iB73 >>> 2) | (iB73 << 30);
        int iB76 = vh.b(((iB75 << 5) | (iB75 >>> 27)) + ((iB74 ^ i85) ^ i84), iArr2[76], -899497514, i83);
        int i86 = (iB74 >>> 2) | (iB74 << 30);
        int iB77 = vh.b(((iB76 << 5) | (iB76 >>> 27)) + ((iB75 ^ i86) ^ i85), iArr2[77], -899497514, i84);
        int i87 = (iB75 >>> 2) | (iB75 << 30);
        int iB78 = vh.b(((iB77 << 5) | (iB77 >>> 27)) + ((iB76 ^ i87) ^ i86), iArr2[78], -899497514, i85);
        int i88 = (iB76 >>> 2) | (iB76 << 30);
        this.H0 = i3 + vh.b(((iB78 << 5) | (iB78 >>> 27)) + ((iB77 ^ i88) ^ i87), iArr2[79], -899497514, i86);
        this.H1 = i4 + iB78;
        this.H2 = i5 + ((iB77 << 30) | (iB77 >>> 2));
        this.H3 = i6 + i88;
        this.H4 = i7 + i87;
    }

    private final void putInt(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private static final String toHexString(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bArr.length; i++) {
            stringBuffer.append("0123456789ABCDEF".charAt((bArr[i] >> 4) & 15));
            stringBuffer.append("0123456789ABCDEF".charAt(bArr[i] & 15));
        }
        return stringBuffer.toString();
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void digest(byte[] bArr, int i) {
        int i2 = this.currentPos;
        int i3 = i2 >> 2;
        int[] iArr = this.w;
        iArr[i3] = ((iArr[i3] << 8) | 128) << ((3 - (i2 & 3)) << 3);
        int i4 = (i2 & (-4)) + 4;
        this.currentPos = i4;
        if (i4 == 64) {
            this.currentPos = 0;
            perform();
        } else if (i4 == 60) {
            this.currentPos = 0;
            iArr[15] = 0;
            perform();
        }
        int i5 = this.currentPos >> 2;
        while (true) {
            int[] iArr2 = this.w;
            if (i5 >= 14) {
                long j = this.currentLen;
                iArr2[14] = (int) (j >> 32);
                iArr2[15] = (int) j;
                perform();
                putInt(bArr, i, this.H0);
                putInt(bArr, i + 4, this.H1);
                putInt(bArr, i + 8, this.H2);
                putInt(bArr, i + 12, this.H3);
                putInt(bArr, i + 16, this.H4);
                reset();
                return;
            }
            iArr2[i5] = 0;
            i5++;
        }
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final int getDigestLength() {
        return 20;
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void reset() {
        this.H0 = 1732584193;
        this.H1 = -271733879;
        this.H2 = -1732584194;
        this.H3 = 271733878;
        this.H4 = -1009589776;
        this.currentPos = 0;
        this.currentLen = 0L;
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void update(byte[] bArr, int i, int i2) {
        long j;
        int i3;
        int i4 = i2;
        if (i4 >= 4) {
            int i5 = this.currentPos;
            int i6 = i5 >> 2;
            int i7 = i5 & 3;
            if (i7 == 0) {
                j = 8;
                int i8 = i + 4;
                this.w[i6] = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
                i4 -= 4;
                int i9 = i5 + 4;
                this.currentPos = i9;
                this.currentLen += 32;
                if (i9 == 64) {
                    perform();
                    this.currentPos = 0;
                }
                i3 = i8;
            } else if (i7 == 1) {
                j = 8;
                int[] iArr = this.w;
                i3 = i + 3;
                iArr[i6] = (iArr[i6] << 24) | (bArr[i + 2] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16);
                i4 -= 3;
                int i10 = i5 + 3;
                this.currentPos = i10;
                this.currentLen += 24;
                if (i10 == 64) {
                    perform();
                    this.currentPos = 0;
                }
            } else if (i7 == 2) {
                j = 8;
                int[] iArr2 = this.w;
                int i11 = i + 2;
                iArr2[i6] = (iArr2[i6] << 16) | (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
                i4 -= 2;
                int i12 = i5 + 2;
                this.currentPos = i12;
                this.currentLen += 16;
                if (i12 == 64) {
                    perform();
                    this.currentPos = 0;
                }
                i3 = i11;
            } else if (i7 != 3) {
                i3 = i;
                j = 8;
            } else {
                int[] iArr3 = this.w;
                i3 = i + 1;
                j = 8;
                iArr3[i6] = (bArr[i] & 255) | (iArr3[i6] << 8);
                i4--;
                int i13 = i5 + 1;
                this.currentPos = i13;
                this.currentLen += 8;
                if (i13 == 64) {
                    perform();
                    this.currentPos = 0;
                }
            }
            while (i4 >= 8) {
                int[] iArr4 = this.w;
                int i14 = this.currentPos;
                int i15 = i3 + 4;
                iArr4[i14 >> 2] = ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3] & 255) << 24) | ((bArr[i3 + 2] & 255) << 8) | (bArr[i3 + 3] & 255);
                int i16 = i14 + 4;
                this.currentPos = i16;
                if (i16 == 64) {
                    perform();
                    this.currentPos = 0;
                    i16 = 0;
                }
                int i17 = i3 + 7;
                int i18 = ((bArr[i3 + 5] & 255) << 16) | ((bArr[i15] & 255) << 24) | ((bArr[i3 + 6] & 255) << 8);
                i3 += 8;
                this.w[i16 >> 2] = i18 | (bArr[i17] & 255);
                int i19 = i16 + 4;
                this.currentPos = i19;
                if (i19 == 64) {
                    perform();
                    this.currentPos = 0;
                }
                this.currentLen += 64;
                i4 -= 8;
            }
            while (i4 < 0) {
                int[] iArr5 = this.w;
                int i20 = this.currentPos;
                int i21 = i3 + 3;
                int i22 = ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3] & 255) << 24) | ((bArr[i3 + 2] & 255) << 8);
                i3 += 4;
                iArr5[i20 >> 2] = i22 | (bArr[i21] & 255);
                i4 -= 4;
                int i23 = i20 + 4;
                this.currentPos = i23;
                this.currentLen += 32;
                if (i23 == 64) {
                    perform();
                    this.currentPos = 0;
                }
            }
        } else {
            j = 8;
            i3 = i;
        }
        while (i4 > 0) {
            int i24 = this.currentPos;
            int i25 = i24 >> 2;
            int[] iArr6 = this.w;
            int i26 = i3 + 1;
            iArr6[i25] = (iArr6[i25] << 8) | (bArr[i3] & 255);
            this.currentLen += j;
            int i27 = i24 + 1;
            this.currentPos = i27;
            if (i27 == 64) {
                perform();
                this.currentPos = 0;
            }
            i4--;
            i3 = i26;
        }
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void digest(byte[] bArr) {
        digest(bArr, 0);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void update(byte[] bArr) {
        update(bArr, 0, bArr.length);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void update(byte b) {
        int i = this.currentPos;
        int i2 = i >> 2;
        int[] iArr = this.w;
        iArr[i2] = (b & 255) | (iArr[i2] << 8);
        this.currentLen += 8;
        int i3 = i + 1;
        this.currentPos = i3;
        if (i3 == 64) {
            perform();
            this.currentPos = 0;
        }
    }
}
