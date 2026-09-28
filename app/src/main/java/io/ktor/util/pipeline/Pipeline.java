package io.ktor.util.pipeline;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import defpackage.tw0;
import defpackage.yg0;
import io.ktor.util.Attributes;
import io.ktor.util.a;
import io.ktor.util.pipeline.PipelinePhaseRelation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bBb\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012O\u0010\u0011\u001aK\u0012G\u0012E\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000f¢\u0006\u0002\b\u00100\n¢\u0006\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/ktor/util/pipeline/Pipeline;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "TSubject", "TContext", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/util/pipeline/PipelinePhase;", "phases", "<init>", "([Lio/ktor/util/pipeline/PipelinePhase;)V", TypedValues.CycleType.S_WAVE_PHASE, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lkotlin/Function3;", "Lio/ktor/util/pipeline/PipelineContext;", "Lkotlin/coroutines/Continuation;", "Lmk1;", "Lio/ktor/util/pipeline/PipelineInterceptor;", "Lkotlin/ExtensionFunctionType;", "interceptors", "(Lio/ktor/util/pipeline/PipelinePhase;Ljava/util/List;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class Pipeline<TSubject, TContext> {
    public final Attributes a;
    public final ArrayList b;
    public int c;
    public boolean d;
    public PipelinePhase e;
    private volatile /* synthetic */ Object interceptors$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pipeline(PipelinePhase pipelinePhase, List<? extends Function3<? super PipelineContext<TSubject, TContext>, ? super TSubject, ? super Continuation<? super mk1>, ? extends Object>> list) {
        this(pipelinePhase);
        pipelinePhase.getClass();
        list.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            g(pipelinePhase, (Function3) it.next());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r13, java.lang.Object r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r12 = this;
            kotlin.coroutines.CoroutineContext r0 = r15.getD()
            java.lang.Object r1 = r12.interceptors$delegate
            java.util.List r1 = (java.util.List) r1
            r2 = 1
            if (r1 != 0) goto L94
            int r1 = r12.c
            r3 = 0
            r4 = 0
            if (r1 != 0) goto L1b
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
            r12.interceptors$delegate = r1
            r12.d = r3
            r12.e = r4
            goto L94
        L1b:
            java.util.ArrayList r5 = r12.b
            if (r1 != r2) goto L4f
            int r1 = kotlin.collections.c.t(r5)
            if (r1 < 0) goto L4f
            r6 = r3
        L26:
            java.lang.Object r7 = r5.get(r6)
            boolean r8 = r7 instanceof io.ktor.util.pipeline.PhaseContent
            if (r8 == 0) goto L31
            io.ktor.util.pipeline.PhaseContent r7 = (io.ktor.util.pipeline.PhaseContent) r7
            goto L32
        L31:
            r7 = r4
        L32:
            if (r7 != 0) goto L35
            goto L4a
        L35:
            java.util.List r8 = r7.c
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L4a
            java.util.List r1 = r7.c
            r7.d = r2
            r12.interceptors$delegate = r1
            r12.d = r3
            io.ktor.util.pipeline.PipelinePhase r1 = r7.a
            r12.e = r1
            goto L94
        L4a:
            if (r6 == r1) goto L4f
            int r6 = r6 + 1
            goto L26
        L4f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r6 = kotlin.collections.c.t(r5)
            if (r6 < 0) goto L8e
            r7 = r3
        L5b:
            java.lang.Object r8 = r5.get(r7)
            boolean r9 = r8 instanceof io.ktor.util.pipeline.PhaseContent
            if (r9 == 0) goto L66
            io.ktor.util.pipeline.PhaseContent r8 = (io.ktor.util.pipeline.PhaseContent) r8
            goto L67
        L66:
            r8 = r4
        L67:
            if (r8 != 0) goto L6a
            goto L89
        L6a:
            java.util.List r8 = r8.c
            int r9 = r1.size()
            int r10 = r8.size()
            int r10 = r10 + r9
            r1.ensureCapacity(r10)
            int r9 = r8.size()
            r10 = r3
        L7d:
            if (r10 >= r9) goto L89
            java.lang.Object r11 = r8.get(r10)
            r1.add(r11)
            int r10 = r10 + 1
            goto L7d
        L89:
            if (r7 == r6) goto L8e
            int r7 = r7 + 1
            goto L5b
        L8e:
            r12.interceptors$delegate = r1
            r12.d = r3
            r12.e = r4
        L94:
            r12.d = r2
            java.lang.Object r1 = r12.interceptors$delegate
            java.util.List r1 = (java.util.List) r1
            r1.getClass()
            boolean r12 = r12.d()
            r13.getClass()
            r14.getClass()
            r0.getClass()
            boolean r2 = defpackage.sw0.a
            if (r2 != 0) goto Lb7
            if (r12 == 0) goto Lb1
            goto Lb7
        Lb1:
            io.ktor.util.pipeline.SuspendFunctionGun r12 = new io.ktor.util.pipeline.SuspendFunctionGun
            r12.<init>(r14, r13, r1)
            goto Lbc
        Lb7:
            io.ktor.util.pipeline.DebugPipelineContext r12 = new io.ktor.util.pipeline.DebugPipelineContext
            r12.<init>(r13, r1, r14, r0)
        Lbc:
            java.lang.Object r12 = r12.a(r14, r15)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.pipeline.Pipeline.a(java.lang.Object, java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final PhaseContent b(PipelinePhase pipelinePhase) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == pipelinePhase) {
                PhaseContent phaseContent = new PhaseContent(pipelinePhase, tw0.a);
                arrayList.set(i, phaseContent);
                return phaseContent;
            }
            if (obj instanceof PhaseContent) {
                PhaseContent phaseContent2 = (PhaseContent) obj;
                if (phaseContent2.a == pipelinePhase) {
                    return phaseContent2;
                }
            }
        }
        return null;
    }

    public final int c(PipelinePhase pipelinePhase) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == pipelinePhase || ((obj instanceof PhaseContent) && ((PhaseContent) obj).a == pipelinePhase)) {
                return i;
            }
        }
        return -1;
    }

    public boolean d() {
        return false;
    }

    public final boolean e(PipelinePhase pipelinePhase) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == pipelinePhase) {
                return true;
            }
            if ((obj instanceof PhaseContent) && ((PhaseContent) obj).a == pipelinePhase) {
                return true;
            }
        }
        return false;
    }

    public final void f(PipelinePhase pipelinePhase, PipelinePhase pipelinePhase2) throws InvalidPhaseException {
        PipelinePhaseRelation pipelinePhaseRelation;
        PipelinePhase pipelinePhase3;
        pipelinePhase.getClass();
        if (e(pipelinePhase2)) {
            return;
        }
        int iC = c(pipelinePhase);
        if (iC == -1) {
            throw new InvalidPhaseException("Phase " + pipelinePhase + " was not registered for this pipeline");
        }
        int i = iC + 1;
        ArrayList arrayList = this.b;
        int iT = c.t(arrayList);
        if (i <= iT) {
            while (true) {
                Object obj = arrayList.get(i);
                PhaseContent phaseContent = obj instanceof PhaseContent ? (PhaseContent) obj : null;
                if (phaseContent != null && (pipelinePhaseRelation = phaseContent.b) != null) {
                    PipelinePhaseRelation.After after = pipelinePhaseRelation instanceof PipelinePhaseRelation.After ? (PipelinePhaseRelation.After) pipelinePhaseRelation : null;
                    if (after != null && (pipelinePhase3 = after.a) != null && pipelinePhase3 == pipelinePhase) {
                        iC = i;
                    }
                    if (i == iT) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    break;
                }
            }
        }
        arrayList.add(iC + 1, new PhaseContent(pipelinePhase2, new PipelinePhaseRelation.After(pipelinePhase)));
    }

    public final void g(PipelinePhase pipelinePhase, Function3 function3) {
        pipelinePhase.getClass();
        function3.getClass();
        PhaseContent phaseContentB = b(pipelinePhase);
        if (phaseContentB == null) {
            throw new InvalidPhaseException("Phase " + pipelinePhase + " was not registered for this pipeline");
        }
        List list = (List) this.interceptors$delegate;
        if (!this.b.isEmpty() && list != null && !this.d && (!(list instanceof KMappedMarker) || (list instanceof KMutableList))) {
            if (yg0.a(this.e, pipelinePhase)) {
                list.add(function3);
            } else if (pipelinePhase == c.x(this.b) || c(pipelinePhase) == c.t(this.b)) {
                PhaseContent phaseContentB2 = b(pipelinePhase);
                phaseContentB2.getClass();
                if (phaseContentB2.d) {
                    phaseContentB2.c = c.S(phaseContentB2.c);
                    phaseContentB2.d = false;
                }
                phaseContentB2.c.add(function3);
                list.add(function3);
            }
            this.c++;
            return;
        }
        if (phaseContentB.d) {
            phaseContentB.c = c.S(phaseContentB.c);
            phaseContentB.d = false;
        }
        phaseContentB.c.add(function3);
        this.c++;
        this.interceptors$delegate = null;
        this.d = false;
        this.e = null;
    }

    public Pipeline(PipelinePhase... pipelinePhaseArr) {
        pipelinePhaseArr.getClass();
        this.a = a.a();
        this.b = c.B(Arrays.copyOf(pipelinePhaseArr, pipelinePhaseArr.length));
        this.interceptors$delegate = null;
    }
}
