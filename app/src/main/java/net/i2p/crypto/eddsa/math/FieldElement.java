package net.i2p.crypto.eddsa.math;

import defpackage.u7;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class FieldElement implements Serializable {
    private static final long serialVersionUID = 1239527465875676L;
    protected final Field f;

    public FieldElement(Field field) {
        if (field != null) {
            this.f = field;
        } else {
            u7.r("field cannot be null");
            throw null;
        }
    }

    public abstract FieldElement add(FieldElement fieldElement);

    public FieldElement addOne() {
        return add(this.f.ONE);
    }

    public abstract FieldElement cmov(FieldElement fieldElement, int i);

    public FieldElement divide(FieldElement fieldElement) {
        return multiply(fieldElement.invert());
    }

    public abstract FieldElement invert();

    public boolean isNegative() {
        return this.f.getEncoding().isNegative(this);
    }

    public abstract boolean isNonZero();

    public abstract FieldElement multiply(FieldElement fieldElement);

    public abstract FieldElement negate();

    public abstract FieldElement pow22523();

    public abstract FieldElement square();

    public abstract FieldElement squareAndDouble();

    public abstract FieldElement subtract(FieldElement fieldElement);

    public FieldElement subtractOne() {
        return subtract(this.f.ONE);
    }

    public byte[] toByteArray() {
        return this.f.getEncoding().encode(this);
    }
}
