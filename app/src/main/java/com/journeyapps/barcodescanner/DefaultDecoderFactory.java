package com.journeyapps.barcodescanner;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class DefaultDecoderFactory implements DecoderFactory {
    public final Collection a;
    public final Map b;
    public final String c;
    public final int d;

    public DefaultDecoderFactory(Collection<BarcodeFormat> collection, Map<DecodeHintType, ?> map, String str, int i) {
        this.a = collection;
        this.b = map;
        this.c = str;
        this.d = i;
    }

    @Override // com.journeyapps.barcodescanner.DecoderFactory
    public final Decoder createDecoder(Map map) {
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        enumMap.putAll(map);
        Map map2 = this.b;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        Collection collection = this.a;
        if (collection != null) {
            enumMap.put(DecodeHintType.POSSIBLE_FORMATS, collection);
        }
        String str = this.c;
        if (str != null) {
            enumMap.put(DecodeHintType.CHARACTER_SET, str);
        }
        MultiFormatReader multiFormatReader = new MultiFormatReader();
        multiFormatReader.b(enumMap);
        int i = this.d;
        return i != 0 ? i != 1 ? i != 2 ? new Decoder(multiFormatReader) : new MixedDecoder(multiFormatReader) : new InvertedDecoder(multiFormatReader) : new Decoder(multiFormatReader);
    }

    public DefaultDecoderFactory(Collection<BarcodeFormat> collection) {
        this.a = collection;
    }

    public DefaultDecoderFactory() {
    }
}
