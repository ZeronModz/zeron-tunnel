package io.ktor.util.internal;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final Object a = new Symbol("CONDITION_FALSE");
    public static final Object b = null;
    public static final Object c;

    static {
        new Symbol("ALREADY_REMOVED");
        new Symbol("LIST_EMPTY");
        new Symbol("REMOVE_PREPARED");
        c = new Symbol("NO_DECISION");
    }

    public static final LockFreeLinkedListNode a(Object obj) {
        obj.getClass();
        Removed removed = obj instanceof Removed ? (Removed) obj : null;
        return removed != null ? removed.a : (LockFreeLinkedListNode) obj;
    }
}
