package com.v2ray.ang.ui;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import dev.zeron.tunnel.R;
import com.sandok.tunnel.service.OpenVPNService;
import com.v2ray.ang.ui.LogsFragment;
import com.v2ray.ang.viewmodel.MainViewModel;
import com.vpn.sandok.ultrasshservice.logger.LogItem;
import com.vpn.sandok.ultrasshservice.logger.SkStatus;
import defpackage.f20;
import defpackage.hz;
import defpackage.md0;
import defpackage.nm0;
import defpackage.om0;
import defpackage.vh;
import defpackage.yg0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/v2ray/ang/ui/LogsFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/sandok/tunnel/service/OpenVPNService$EventReceiver;", "Lcom/vpn/sandok/ultrasshservice/logger/SkStatus$LogListener;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LogsFragment extends Fragment implements OpenVPNService.EventReceiver, SkStatus.LogListener {
    public ListView Y;
    public om0 Z;
    public final ArrayList a0;
    public boolean b0;
    public boolean c0;
    public OpenVPNService d0;
    public final nm0 e0;
    public final ViewModelLazy f0;

    public LogsFragment() {
        super(R.layout.fragment_logs);
        this.a0 = new ArrayList();
        this.e0 = new nm0(this);
        this.f0 = new ViewModelLazy(Reflection.a(MainViewModel.class), new Function0<ViewModelStore>() { // from class: com.v2ray.ang.ui.LogsFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.L().getViewModelStore();
                viewModelStore.getClass();
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.v2ray.ang.ui.LogsFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return this.L().getDefaultViewModelProviderFactory();
            }
        });
    }

    public static String Y() {
        return String.format("[%s]: ", Arrays.copyOf(new Object[]{new SimpleDateFormat("hh:mm:ss a", Locale.getDefault()).format(new Date())}, 1));
    }

    @Override // androidx.fragment.app.Fragment
    public final void H(View view, Bundle bundle) {
        view.getClass();
        View viewFindViewById = view.findViewById(R.id.log_list);
        viewFindViewById.getClass();
        this.Y = (ListView) viewFindViewById;
        om0 om0Var = new om0(M(), R.layout.item_log, this.a0);
        this.Z = om0Var;
        ListView listView = this.Y;
        if (listView == null) {
            yg0.N("listView");
            throw null;
        }
        listView.setAdapter((ListAdapter) om0Var);
        if (!this.c0) {
            this.c0 = M().bindService(new Intent(M(), (Class<?>) OpenVPNService.class).setAction(OpenVPNService.ACTION_BIND), this.e0, 65);
        }
        StringBuilder sb = new StringBuilder(vh.m("<b>", Y(), "</b>\n"));
        sb.append("Running on " + Build.BRAND + "\n");
        sb.append("(" + Build.DEVICE + "\n)");
        sb.append("Android Version: " + Build.VERSION.SDK_INT + "\n");
        W(sb.toString());
        SkStatus.addLogListener(this);
        ViewModelLazy viewModelLazy = this.f0;
        final int i = 0;
        final int i2 = 1;
        ((MainViewModel) viewModelLazy.getValue()).getUpdateTestResultAction().e(l(), new md0(1, new Function1(this) { // from class: mm0
            public final /* synthetic */ LogsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i;
                mk1 mk1Var = mk1.a;
                LogsFragment logsFragment = this.b;
                String str = (String) obj;
                switch (i3) {
                    case 0:
                        logsFragment.W(LogsFragment.Y() + str);
                        break;
                    default:
                        logsFragment.W(LogsFragment.Y() + str);
                        break;
                }
                return mk1Var;
            }
        }));
        ((MainViewModel) viewModelLazy.getValue()).getLogAction().e(l(), new md0(1, new Function1(this) { // from class: mm0
            public final /* synthetic */ LogsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i2;
                mk1 mk1Var = mk1.a;
                LogsFragment logsFragment = this.b;
                String str = (String) obj;
                switch (i3) {
                    case 0:
                        logsFragment.W(LogsFragment.Y() + str);
                        break;
                    default:
                        logsFragment.W(LogsFragment.Y() + str);
                        break;
                }
                return mk1Var;
            }
        }));
    }

    public final void W(String str) {
        str.getClass();
        FragmentActivity fragmentActivityD = d();
        if (fragmentActivityD != null) {
            fragmentActivityD.runOnUiThread(new f20(22, this, str));
        }
    }

    public final void X(OpenVPNService.EventMsg eventMsg) {
        String str = eventMsg.info;
        if (str == null || kotlin.text.g.B(str)) {
            str = null;
        }
        String str2 = eventMsg.name;
        W(Y().concat(str == null ? vh.l("[OpenVPN EVENT] ", str2) : hz.v("[OpenVPN EVENT] ", str2, ": ", str)));
    }

    @Override // com.sandok.tunnel.service.OpenVPNService.EventReceiver
    public final PendingIntent get_configure_intent(int i) {
        return null;
    }

    @Override // com.sandok.tunnel.service.OpenVPNService.EventReceiver
    public final void log(OpenVPNService.LogMsg logMsg) {
        String str;
        if (logMsg == null || (str = logMsg.line) == null) {
            return;
        }
        W(str);
    }

    @Override // com.vpn.sandok.ultrasshservice.logger.SkStatus.LogListener
    public final void newLog(LogItem logItem) {
        String message;
        if (logItem == null || (message = logItem.getMessage()) == null || logItem.getLogLevel() == SkStatus.LogLevel.DEBUG) {
            return;
        }
        W(("[" + Y() + "]: ").concat(message));
    }

    @Override // com.vpn.sandok.ultrasshservice.logger.SkStatus.LogListener
    public final void onClear() {
        this.a0.clear();
        om0 om0Var = this.Z;
        if (om0Var != null) {
            om0Var.notifyDataSetChanged();
        } else {
            yg0.N("adapter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void y() {
        OpenVPNService openVPNService = this.d0;
        if (openVPNService != null) {
            openVPNService.client_detach(this);
        }
        if (this.c0) {
            M().unbindService(this.e0);
            this.c0 = false;
        }
        SkStatus.removeLogListener(this);
        this.d0 = null;
        this.D = true;
    }

    @Override // com.sandok.tunnel.service.OpenVPNService.EventReceiver
    public final void event(OpenVPNService.EventMsg eventMsg) {
    }
}
