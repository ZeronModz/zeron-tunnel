package defpackage;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListPopupWindow;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.m;
import com.v2ray.ang.adapter.ServerStatusAdapter;
import com.v2ray.ang.ui.ServerStatusVIew;
import com.v2ray.ang.ui.UserAssetActivity;
import defpackage.oy;
import defpackage.zq0;
import java.io.File;
import java.io.Serializable;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.c;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p61 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppCompatActivity b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p61(AppCompatActivity appCompatActivity, Serializable serializable, Object obj, int i) {
        this.a = i;
        this.b = appCompatActivity;
        this.c = serializable;
        this.d = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.d;
        Serializable serializable = this.c;
        AppCompatActivity appCompatActivity = this.b;
        switch (i) {
            case 0:
                final ServerStatusVIew serverStatusVIew = (ServerStatusVIew) appCompatActivity;
                final Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) serializable;
                final ServerStatusAdapter serverStatusAdapter = (ServerStatusAdapter) obj;
                int i2 = ServerStatusVIew.c;
                final List listA = c.A("OVPN", "SSH", "DNSTT", "UDP Hysteria", "V2ray");
                final ListPopupWindow listPopupWindow = new ListPopupWindow(serverStatusVIew);
                listPopupWindow.setAnchorView(view);
                listPopupWindow.setAdapter(new ArrayAdapter(serverStatusVIew, R.layout.simple_list_item_1, listA));
                listPopupWindow.setModal(true);
                listPopupWindow.setHorizontalOffset(-view.getWidth());
                listPopupWindow.setWidth(-2);
                listPopupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: q61
                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v10, types: [T, java.util.List] */
                    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.util.List] */
                    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.util.List] */
                    /* JADX WARN: Type inference failed for: r1v7, types: [T, java.util.List] */
                    /* JADX WARN: Type inference failed for: r1v8, types: [T, java.util.List] */
                    /* JADX WARN: Type inference failed for: r1v9, types: [T, java.util.List] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public final void onItemClick(AdapterView adapterView, View view2, int i3, long j) {
                        int i4 = ServerStatusVIew.c;
                        String str = (String) listA.get(i3);
                        int iHashCode = str.hashCode();
                        Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                        ServerStatusVIew serverStatusVIew2 = serverStatusVIew;
                        ServerStatusAdapter serverStatusAdapter2 = serverStatusAdapter;
                        switch (iHashCode) {
                            case -46999946:
                                if (str.equals("UDP Hysteria")) {
                                    ?? G = serverStatusVIew2.g(str);
                                    ref$ObjectRef2.element = G;
                                    serverStatusAdapter2.u(G);
                                }
                                break;
                            case 82408:
                                if (str.equals("SSH")) {
                                    ?? G2 = serverStatusVIew2.g(str);
                                    ref$ObjectRef2.element = G2;
                                    serverStatusAdapter2.u(G2);
                                }
                                break;
                            case 2438693:
                                if (str.equals("OVPN")) {
                                    ?? G3 = serverStatusVIew2.g(str);
                                    ref$ObjectRef2.element = G3;
                                    serverStatusAdapter2.u(G3);
                                }
                                break;
                            case 65205577:
                                if (str.equals("DNSTT")) {
                                    ?? G4 = serverStatusVIew2.g(str);
                                    ref$ObjectRef2.element = G4;
                                    serverStatusAdapter2.u(G4);
                                }
                                break;
                            case 81025038:
                                if (str.equals("V2ray")) {
                                    ?? G5 = serverStatusVIew2.g(str);
                                    ref$ObjectRef2.element = G5;
                                    serverStatusAdapter2.u(G5);
                                }
                                break;
                            case 1404911586:
                                if (str.equals("V2ray GCP")) {
                                    ?? G6 = serverStatusVIew2.g(str);
                                    ref$ObjectRef2.element = G6;
                                    serverStatusAdapter2.u(G6);
                                }
                                break;
                        }
                        listPopupWindow.dismiss();
                    }
                });
                listPopupWindow.show();
                break;
            default:
                final UserAssetActivity userAssetActivity = (UserAssetActivity) appCompatActivity;
                final File file = (File) serializable;
                final Pair pair = (Pair) obj;
                new AlertDialog.Builder(userAssetActivity).setMessage(dev.zeron.tunnel.R.string.del_config_comfirm).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.v2ray.ang.ui.j
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        File file2 = file;
                        if (file2 != null) {
                            file2.delete();
                        }
                        Lazy lazy = zq0.a;
                        String str = (String) pair.getFirst();
                        str.getClass();
                        zq0.r().o(str);
                        UserAssetActivity userAssetActivity2 = userAssetActivity;
                        userAssetActivity2.getClass();
                        kotlinx.coroutines.c.d(m.a(userAssetActivity2), oy.a, null, new UserAssetActivity$initAssets$1(userAssetActivity2, null), 2);
                    }
                }).setNegativeButton(R.string.cancel, new k(9)).show();
                break;
        }
    }
}
