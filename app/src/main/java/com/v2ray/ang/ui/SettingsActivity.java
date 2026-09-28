package com.v2ray.ang.ui;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.preference.CheckBoxPreference;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.PeriodicWorkRequest;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.multiprocess.RemoteWorkManagerClient;
import dev.zeron.tunnel.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.v2ray.ang.AngApplication;
import com.v2ray.ang.service.SubscriptionUpdater$UpdateTask;
import com.v2ray.ang.ui.SettingsActivity;
import com.v2ray.ang.viewmodel.SettingsViewModel;
import defpackage.i71;
import defpackage.oi;
import defpackage.u21;
import defpackage.u7;
import defpackage.ul1;
import defpackage.w21;
import defpackage.y21;
import defpackage.yg0;
import defpackage.zq0;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/v2ray/ang/ui/SettingsActivity;", "Lcom/v2ray/ang/ui/BaseActivity;", "<init>", "()V", "Landroid/view/View;", "view", "Lmk1;", "onModeHelpClicked", "(Landroid/view/View;)V", "SettingsFragment", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SettingsActivity extends BaseActivity {
    public final ViewModelLazy c;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/ui/SettingsActivity$SettingsFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SettingsFragment extends PreferenceFragmentCompat {
        public final Lazy A0;
        public final Lazy B0;
        public final Lazy C0;
        public final Lazy g0;
        public final Lazy h0;
        public final Lazy i0;
        public final Lazy j0;
        public final Lazy k0;
        public final Lazy l0;
        public final Lazy m0;
        public final Lazy n0;
        public final Lazy o0;
        public final Lazy p0;
        public final Lazy q0;
        public final Lazy r0;
        public final Lazy s0;
        public final Lazy t0;
        public final Lazy u0;
        public final Lazy v0;
        public final Lazy w0;
        public final Lazy x0;
        public final Lazy y0;
        public final Lazy z0;

        public SettingsFragment() {
            final int i = 0;
            this.g0 = kotlin.c.b(new Function0(this) { // from class: j71
                public final /* synthetic */ SettingsActivity.SettingsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i2 = i;
                    SettingsActivity.SettingsFragment settingsFragment = this.b;
                    switch (i2) {
                        case 0:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_per_app_proxy");
                        case 1:
                            return (ListPreference) settingsFragment.findPreference("pref_mux_xudp_quic");
                        case 2:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fragment_enabled");
                        case 3:
                            return (ListPreference) settingsFragment.findPreference("pref_fragment_packets");
                        case 4:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_length");
                        case 5:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_interval");
                        case 6:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_auto_update_subscription");
                        case 7:
                            return (EditTextPreference) settingsFragment.findPreference("pref_auto_update_interval");
                        case 8:
                            return (EditTextPreference) settingsFragment.findPreference("pref_socks_port");
                        case 9:
                            return (EditTextPreference) settingsFragment.findPreference("pref_remote_dns");
                        case 10:
                            return (EditTextPreference) settingsFragment.findPreference("pref_domestic_dns");
                        case 11:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_local_dns_enabled");
                        case 12:
                            return (EditTextPreference) settingsFragment.findPreference("pref_dns_hosts");
                        case 13:
                            return (EditTextPreference) settingsFragment.findPreference("pref_delay_test_url");
                        case 14:
                            return (ListPreference) settingsFragment.findPreference("pref_mode");
                        case 15:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fake_dns_enabled");
                        case 16:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_append_http_proxy");
                        case 17:
                            return (EditTextPreference) settingsFragment.findPreference("pref_local_dns_port");
                        case 18:
                            return (EditTextPreference) settingsFragment.findPreference("pref_vpn_dns");
                        case 19:
                            return (ListPreference) settingsFragment.findPreference("pref_vpn_bypass_lan");
                        case 20:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_mux_enabled");
                        case 21:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_concurrency");
                        default:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_xudp_concurrency");
                    }
                }
            });
            final int i2 = 11;
            this.h0 = kotlin.c.b(new Function0(this) { // from class: j71
                public final /* synthetic */ SettingsActivity.SettingsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i2;
                    SettingsActivity.SettingsFragment settingsFragment = this.b;
                    switch (i22) {
                        case 0:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_per_app_proxy");
                        case 1:
                            return (ListPreference) settingsFragment.findPreference("pref_mux_xudp_quic");
                        case 2:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fragment_enabled");
                        case 3:
                            return (ListPreference) settingsFragment.findPreference("pref_fragment_packets");
                        case 4:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_length");
                        case 5:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_interval");
                        case 6:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_auto_update_subscription");
                        case 7:
                            return (EditTextPreference) settingsFragment.findPreference("pref_auto_update_interval");
                        case 8:
                            return (EditTextPreference) settingsFragment.findPreference("pref_socks_port");
                        case 9:
                            return (EditTextPreference) settingsFragment.findPreference("pref_remote_dns");
                        case 10:
                            return (EditTextPreference) settingsFragment.findPreference("pref_domestic_dns");
                        case 11:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_local_dns_enabled");
                        case 12:
                            return (EditTextPreference) settingsFragment.findPreference("pref_dns_hosts");
                        case 13:
                            return (EditTextPreference) settingsFragment.findPreference("pref_delay_test_url");
                        case 14:
                            return (ListPreference) settingsFragment.findPreference("pref_mode");
                        case 15:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fake_dns_enabled");
                        case 16:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_append_http_proxy");
                        case 17:
                            return (EditTextPreference) settingsFragment.findPreference("pref_local_dns_port");
                        case 18:
                            return (EditTextPreference) settingsFragment.findPreference("pref_vpn_dns");
                        case 19:
                            return (ListPreference) settingsFragment.findPreference("pref_vpn_bypass_lan");
                        case 20:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_mux_enabled");
                        case 21:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_concurrency");
                        default:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_xudp_concurrency");
                    }
                }
            });
            final int i3 = 15;
            this.i0 = kotlin.c.b(new Function0(this) { // from class: j71
                public final /* synthetic */ SettingsActivity.SettingsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i3;
                    SettingsActivity.SettingsFragment settingsFragment = this.b;
                    switch (i22) {
                        case 0:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_per_app_proxy");
                        case 1:
                            return (ListPreference) settingsFragment.findPreference("pref_mux_xudp_quic");
                        case 2:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fragment_enabled");
                        case 3:
                            return (ListPreference) settingsFragment.findPreference("pref_fragment_packets");
                        case 4:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_length");
                        case 5:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_interval");
                        case 6:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_auto_update_subscription");
                        case 7:
                            return (EditTextPreference) settingsFragment.findPreference("pref_auto_update_interval");
                        case 8:
                            return (EditTextPreference) settingsFragment.findPreference("pref_socks_port");
                        case 9:
                            return (EditTextPreference) settingsFragment.findPreference("pref_remote_dns");
                        case 10:
                            return (EditTextPreference) settingsFragment.findPreference("pref_domestic_dns");
                        case 11:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_local_dns_enabled");
                        case 12:
                            return (EditTextPreference) settingsFragment.findPreference("pref_dns_hosts");
                        case 13:
                            return (EditTextPreference) settingsFragment.findPreference("pref_delay_test_url");
                        case 14:
                            return (ListPreference) settingsFragment.findPreference("pref_mode");
                        case 15:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fake_dns_enabled");
                        case 16:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_append_http_proxy");
                        case 17:
                            return (EditTextPreference) settingsFragment.findPreference("pref_local_dns_port");
                        case 18:
                            return (EditTextPreference) settingsFragment.findPreference("pref_vpn_dns");
                        case 19:
                            return (ListPreference) settingsFragment.findPreference("pref_vpn_bypass_lan");
                        case 20:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_mux_enabled");
                        case 21:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_concurrency");
                        default:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_xudp_concurrency");
                    }
                }
            });
            final int i4 = 16;
            this.j0 = kotlin.c.b(new Function0(this) { // from class: j71
                public final /* synthetic */ SettingsActivity.SettingsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i4;
                    SettingsActivity.SettingsFragment settingsFragment = this.b;
                    switch (i22) {
                        case 0:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_per_app_proxy");
                        case 1:
                            return (ListPreference) settingsFragment.findPreference("pref_mux_xudp_quic");
                        case 2:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fragment_enabled");
                        case 3:
                            return (ListPreference) settingsFragment.findPreference("pref_fragment_packets");
                        case 4:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_length");
                        case 5:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_interval");
                        case 6:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_auto_update_subscription");
                        case 7:
                            return (EditTextPreference) settingsFragment.findPreference("pref_auto_update_interval");
                        case 8:
                            return (EditTextPreference) settingsFragment.findPreference("pref_socks_port");
                        case 9:
                            return (EditTextPreference) settingsFragment.findPreference("pref_remote_dns");
                        case 10:
                            return (EditTextPreference) settingsFragment.findPreference("pref_domestic_dns");
                        case 11:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_local_dns_enabled");
                        case 12:
                            return (EditTextPreference) settingsFragment.findPreference("pref_dns_hosts");
                        case 13:
                            return (EditTextPreference) settingsFragment.findPreference("pref_delay_test_url");
                        case 14:
                            return (ListPreference) settingsFragment.findPreference("pref_mode");
                        case 15:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fake_dns_enabled");
                        case 16:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_append_http_proxy");
                        case 17:
                            return (EditTextPreference) settingsFragment.findPreference("pref_local_dns_port");
                        case 18:
                            return (EditTextPreference) settingsFragment.findPreference("pref_vpn_dns");
                        case 19:
                            return (ListPreference) settingsFragment.findPreference("pref_vpn_bypass_lan");
                        case 20:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_mux_enabled");
                        case 21:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_concurrency");
                        default:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_xudp_concurrency");
                    }
                }
            });
            final int i5 = 17;
            this.k0 = kotlin.c.b(new Function0(this) { // from class: j71
                public final /* synthetic */ SettingsActivity.SettingsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i5;
                    SettingsActivity.SettingsFragment settingsFragment = this.b;
                    switch (i22) {
                        case 0:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_per_app_proxy");
                        case 1:
                            return (ListPreference) settingsFragment.findPreference("pref_mux_xudp_quic");
                        case 2:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fragment_enabled");
                        case 3:
                            return (ListPreference) settingsFragment.findPreference("pref_fragment_packets");
                        case 4:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_length");
                        case 5:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_interval");
                        case 6:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_auto_update_subscription");
                        case 7:
                            return (EditTextPreference) settingsFragment.findPreference("pref_auto_update_interval");
                        case 8:
                            return (EditTextPreference) settingsFragment.findPreference("pref_socks_port");
                        case 9:
                            return (EditTextPreference) settingsFragment.findPreference("pref_remote_dns");
                        case 10:
                            return (EditTextPreference) settingsFragment.findPreference("pref_domestic_dns");
                        case 11:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_local_dns_enabled");
                        case 12:
                            return (EditTextPreference) settingsFragment.findPreference("pref_dns_hosts");
                        case 13:
                            return (EditTextPreference) settingsFragment.findPreference("pref_delay_test_url");
                        case 14:
                            return (ListPreference) settingsFragment.findPreference("pref_mode");
                        case 15:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fake_dns_enabled");
                        case 16:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_append_http_proxy");
                        case 17:
                            return (EditTextPreference) settingsFragment.findPreference("pref_local_dns_port");
                        case 18:
                            return (EditTextPreference) settingsFragment.findPreference("pref_vpn_dns");
                        case 19:
                            return (ListPreference) settingsFragment.findPreference("pref_vpn_bypass_lan");
                        case 20:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_mux_enabled");
                        case 21:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_concurrency");
                        default:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_xudp_concurrency");
                    }
                }
            });
            final int i6 = 18;
            this.l0 = kotlin.c.b(new Function0(this) { // from class: j71
                public final /* synthetic */ SettingsActivity.SettingsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i6;
                    SettingsActivity.SettingsFragment settingsFragment = this.b;
                    switch (i22) {
                        case 0:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_per_app_proxy");
                        case 1:
                            return (ListPreference) settingsFragment.findPreference("pref_mux_xudp_quic");
                        case 2:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fragment_enabled");
                        case 3:
                            return (ListPreference) settingsFragment.findPreference("pref_fragment_packets");
                        case 4:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_length");
                        case 5:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_interval");
                        case 6:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_auto_update_subscription");
                        case 7:
                            return (EditTextPreference) settingsFragment.findPreference("pref_auto_update_interval");
                        case 8:
                            return (EditTextPreference) settingsFragment.findPreference("pref_socks_port");
                        case 9:
                            return (EditTextPreference) settingsFragment.findPreference("pref_remote_dns");
                        case 10:
                            return (EditTextPreference) settingsFragment.findPreference("pref_domestic_dns");
                        case 11:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_local_dns_enabled");
                        case 12:
                            return (EditTextPreference) settingsFragment.findPreference("pref_dns_hosts");
                        case 13:
                            return (EditTextPreference) settingsFragment.findPreference("pref_delay_test_url");
                        case 14:
                            return (ListPreference) settingsFragment.findPreference("pref_mode");
                        case 15:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fake_dns_enabled");
                        case 16:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_append_http_proxy");
                        case 17:
                            return (EditTextPreference) settingsFragment.findPreference("pref_local_dns_port");
                        case 18:
                            return (EditTextPreference) settingsFragment.findPreference("pref_vpn_dns");
                        case 19:
                            return (ListPreference) settingsFragment.findPreference("pref_vpn_bypass_lan");
                        case 20:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_mux_enabled");
                        case 21:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_concurrency");
                        default:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_xudp_concurrency");
                    }
                }
            });
            final int i7 = 19;
            this.m0 = kotlin.c.b(new Function0(this) { // from class: j71
                public final /* synthetic */ SettingsActivity.SettingsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i7;
                    SettingsActivity.SettingsFragment settingsFragment = this.b;
                    switch (i22) {
                        case 0:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_per_app_proxy");
                        case 1:
                            return (ListPreference) settingsFragment.findPreference("pref_mux_xudp_quic");
                        case 2:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fragment_enabled");
                        case 3:
                            return (ListPreference) settingsFragment.findPreference("pref_fragment_packets");
                        case 4:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_length");
                        case 5:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_interval");
                        case 6:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_auto_update_subscription");
                        case 7:
                            return (EditTextPreference) settingsFragment.findPreference("pref_auto_update_interval");
                        case 8:
                            return (EditTextPreference) settingsFragment.findPreference("pref_socks_port");
                        case 9:
                            return (EditTextPreference) settingsFragment.findPreference("pref_remote_dns");
                        case 10:
                            return (EditTextPreference) settingsFragment.findPreference("pref_domestic_dns");
                        case 11:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_local_dns_enabled");
                        case 12:
                            return (EditTextPreference) settingsFragment.findPreference("pref_dns_hosts");
                        case 13:
                            return (EditTextPreference) settingsFragment.findPreference("pref_delay_test_url");
                        case 14:
                            return (ListPreference) settingsFragment.findPreference("pref_mode");
                        case 15:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fake_dns_enabled");
                        case 16:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_append_http_proxy");
                        case 17:
                            return (EditTextPreference) settingsFragment.findPreference("pref_local_dns_port");
                        case 18:
                            return (EditTextPreference) settingsFragment.findPreference("pref_vpn_dns");
                        case 19:
                            return (ListPreference) settingsFragment.findPreference("pref_vpn_bypass_lan");
                        case 20:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_mux_enabled");
                        case 21:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_concurrency");
                        default:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_xudp_concurrency");
                    }
                }
            });
            final int i8 = 20;
            this.n0 = kotlin.c.b(new Function0(this) { // from class: j71
                public final /* synthetic */ SettingsActivity.SettingsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i8;
                    SettingsActivity.SettingsFragment settingsFragment = this.b;
                    switch (i22) {
                        case 0:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_per_app_proxy");
                        case 1:
                            return (ListPreference) settingsFragment.findPreference("pref_mux_xudp_quic");
                        case 2:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fragment_enabled");
                        case 3:
                            return (ListPreference) settingsFragment.findPreference("pref_fragment_packets");
                        case 4:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_length");
                        case 5:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_interval");
                        case 6:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_auto_update_subscription");
                        case 7:
                            return (EditTextPreference) settingsFragment.findPreference("pref_auto_update_interval");
                        case 8:
                            return (EditTextPreference) settingsFragment.findPreference("pref_socks_port");
                        case 9:
                            return (EditTextPreference) settingsFragment.findPreference("pref_remote_dns");
                        case 10:
                            return (EditTextPreference) settingsFragment.findPreference("pref_domestic_dns");
                        case 11:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_local_dns_enabled");
                        case 12:
                            return (EditTextPreference) settingsFragment.findPreference("pref_dns_hosts");
                        case 13:
                            return (EditTextPreference) settingsFragment.findPreference("pref_delay_test_url");
                        case 14:
                            return (ListPreference) settingsFragment.findPreference("pref_mode");
                        case 15:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fake_dns_enabled");
                        case 16:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_append_http_proxy");
                        case 17:
                            return (EditTextPreference) settingsFragment.findPreference("pref_local_dns_port");
                        case 18:
                            return (EditTextPreference) settingsFragment.findPreference("pref_vpn_dns");
                        case 19:
                            return (ListPreference) settingsFragment.findPreference("pref_vpn_bypass_lan");
                        case 20:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_mux_enabled");
                        case 21:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_concurrency");
                        default:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_xudp_concurrency");
                    }
                }
            });
            final int i9 = 21;
            this.o0 = kotlin.c.b(new Function0(this) { // from class: j71
                public final /* synthetic */ SettingsActivity.SettingsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i9;
                    SettingsActivity.SettingsFragment settingsFragment = this.b;
                    switch (i22) {
                        case 0:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_per_app_proxy");
                        case 1:
                            return (ListPreference) settingsFragment.findPreference("pref_mux_xudp_quic");
                        case 2:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fragment_enabled");
                        case 3:
                            return (ListPreference) settingsFragment.findPreference("pref_fragment_packets");
                        case 4:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_length");
                        case 5:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_interval");
                        case 6:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_auto_update_subscription");
                        case 7:
                            return (EditTextPreference) settingsFragment.findPreference("pref_auto_update_interval");
                        case 8:
                            return (EditTextPreference) settingsFragment.findPreference("pref_socks_port");
                        case 9:
                            return (EditTextPreference) settingsFragment.findPreference("pref_remote_dns");
                        case 10:
                            return (EditTextPreference) settingsFragment.findPreference("pref_domestic_dns");
                        case 11:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_local_dns_enabled");
                        case 12:
                            return (EditTextPreference) settingsFragment.findPreference("pref_dns_hosts");
                        case 13:
                            return (EditTextPreference) settingsFragment.findPreference("pref_delay_test_url");
                        case 14:
                            return (ListPreference) settingsFragment.findPreference("pref_mode");
                        case 15:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fake_dns_enabled");
                        case 16:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_append_http_proxy");
                        case 17:
                            return (EditTextPreference) settingsFragment.findPreference("pref_local_dns_port");
                        case 18:
                            return (EditTextPreference) settingsFragment.findPreference("pref_vpn_dns");
                        case 19:
                            return (ListPreference) settingsFragment.findPreference("pref_vpn_bypass_lan");
                        case 20:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_mux_enabled");
                        case 21:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_concurrency");
                        default:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_xudp_concurrency");
                    }
                }
            });
            final int i10 = 22;
            this.p0 = kotlin.c.b(new Function0(this) { // from class: j71
                public final /* synthetic */ SettingsActivity.SettingsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i10;
                    SettingsActivity.SettingsFragment settingsFragment = this.b;
                    switch (i22) {
                        case 0:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_per_app_proxy");
                        case 1:
                            return (ListPreference) settingsFragment.findPreference("pref_mux_xudp_quic");
                        case 2:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fragment_enabled");
                        case 3:
                            return (ListPreference) settingsFragment.findPreference("pref_fragment_packets");
                        case 4:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_length");
                        case 5:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_interval");
                        case 6:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_auto_update_subscription");
                        case 7:
                            return (EditTextPreference) settingsFragment.findPreference("pref_auto_update_interval");
                        case 8:
                            return (EditTextPreference) settingsFragment.findPreference("pref_socks_port");
                        case 9:
                            return (EditTextPreference) settingsFragment.findPreference("pref_remote_dns");
                        case 10:
                            return (EditTextPreference) settingsFragment.findPreference("pref_domestic_dns");
                        case 11:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_local_dns_enabled");
                        case 12:
                            return (EditTextPreference) settingsFragment.findPreference("pref_dns_hosts");
                        case 13:
                            return (EditTextPreference) settingsFragment.findPreference("pref_delay_test_url");
                        case 14:
                            return (ListPreference) settingsFragment.findPreference("pref_mode");
                        case 15:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fake_dns_enabled");
                        case 16:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_append_http_proxy");
                        case 17:
                            return (EditTextPreference) settingsFragment.findPreference("pref_local_dns_port");
                        case 18:
                            return (EditTextPreference) settingsFragment.findPreference("pref_vpn_dns");
                        case 19:
                            return (ListPreference) settingsFragment.findPreference("pref_vpn_bypass_lan");
                        case 20:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_mux_enabled");
                        case 21:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_concurrency");
                        default:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_xudp_concurrency");
                    }
                }
            });
            final int i11 = 1;
            this.q0 = kotlin.c.b(new Function0(this) { // from class: j71
                public final /* synthetic */ SettingsActivity.SettingsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i11;
                    SettingsActivity.SettingsFragment settingsFragment = this.b;
                    switch (i22) {
                        case 0:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_per_app_proxy");
                        case 1:
                            return (ListPreference) settingsFragment.findPreference("pref_mux_xudp_quic");
                        case 2:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fragment_enabled");
                        case 3:
                            return (ListPreference) settingsFragment.findPreference("pref_fragment_packets");
                        case 4:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_length");
                        case 5:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_interval");
                        case 6:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_auto_update_subscription");
                        case 7:
                            return (EditTextPreference) settingsFragment.findPreference("pref_auto_update_interval");
                        case 8:
                            return (EditTextPreference) settingsFragment.findPreference("pref_socks_port");
                        case 9:
                            return (EditTextPreference) settingsFragment.findPreference("pref_remote_dns");
                        case 10:
                            return (EditTextPreference) settingsFragment.findPreference("pref_domestic_dns");
                        case 11:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_local_dns_enabled");
                        case 12:
                            return (EditTextPreference) settingsFragment.findPreference("pref_dns_hosts");
                        case 13:
                            return (EditTextPreference) settingsFragment.findPreference("pref_delay_test_url");
                        case 14:
                            return (ListPreference) settingsFragment.findPreference("pref_mode");
                        case 15:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fake_dns_enabled");
                        case 16:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_append_http_proxy");
                        case 17:
                            return (EditTextPreference) settingsFragment.findPreference("pref_local_dns_port");
                        case 18:
                            return (EditTextPreference) settingsFragment.findPreference("pref_vpn_dns");
                        case 19:
                            return (ListPreference) settingsFragment.findPreference("pref_vpn_bypass_lan");
                        case 20:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_mux_enabled");
                        case 21:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_concurrency");
                        default:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_xudp_concurrency");
                    }
                }
            });
            final int i12 = 2;
            this.r0 = kotlin.c.b(new Function0(this) { // from class: j71
                public final /* synthetic */ SettingsActivity.SettingsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i12;
                    SettingsActivity.SettingsFragment settingsFragment = this.b;
                    switch (i22) {
                        case 0:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_per_app_proxy");
                        case 1:
                            return (ListPreference) settingsFragment.findPreference("pref_mux_xudp_quic");
                        case 2:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fragment_enabled");
                        case 3:
                            return (ListPreference) settingsFragment.findPreference("pref_fragment_packets");
                        case 4:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_length");
                        case 5:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_interval");
                        case 6:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_auto_update_subscription");
                        case 7:
                            return (EditTextPreference) settingsFragment.findPreference("pref_auto_update_interval");
                        case 8:
                            return (EditTextPreference) settingsFragment.findPreference("pref_socks_port");
                        case 9:
                            return (EditTextPreference) settingsFragment.findPreference("pref_remote_dns");
                        case 10:
                            return (EditTextPreference) settingsFragment.findPreference("pref_domestic_dns");
                        case 11:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_local_dns_enabled");
                        case 12:
                            return (EditTextPreference) settingsFragment.findPreference("pref_dns_hosts");
                        case 13:
                            return (EditTextPreference) settingsFragment.findPreference("pref_delay_test_url");
                        case 14:
                            return (ListPreference) settingsFragment.findPreference("pref_mode");
                        case 15:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fake_dns_enabled");
                        case 16:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_append_http_proxy");
                        case 17:
                            return (EditTextPreference) settingsFragment.findPreference("pref_local_dns_port");
                        case 18:
                            return (EditTextPreference) settingsFragment.findPreference("pref_vpn_dns");
                        case 19:
                            return (ListPreference) settingsFragment.findPreference("pref_vpn_bypass_lan");
                        case 20:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_mux_enabled");
                        case 21:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_concurrency");
                        default:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_xudp_concurrency");
                    }
                }
            });
            final int i13 = 3;
            this.s0 = kotlin.c.b(new Function0(this) { // from class: j71
                public final /* synthetic */ SettingsActivity.SettingsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i13;
                    SettingsActivity.SettingsFragment settingsFragment = this.b;
                    switch (i22) {
                        case 0:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_per_app_proxy");
                        case 1:
                            return (ListPreference) settingsFragment.findPreference("pref_mux_xudp_quic");
                        case 2:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fragment_enabled");
                        case 3:
                            return (ListPreference) settingsFragment.findPreference("pref_fragment_packets");
                        case 4:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_length");
                        case 5:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_interval");
                        case 6:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_auto_update_subscription");
                        case 7:
                            return (EditTextPreference) settingsFragment.findPreference("pref_auto_update_interval");
                        case 8:
                            return (EditTextPreference) settingsFragment.findPreference("pref_socks_port");
                        case 9:
                            return (EditTextPreference) settingsFragment.findPreference("pref_remote_dns");
                        case 10:
                            return (EditTextPreference) settingsFragment.findPreference("pref_domestic_dns");
                        case 11:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_local_dns_enabled");
                        case 12:
                            return (EditTextPreference) settingsFragment.findPreference("pref_dns_hosts");
                        case 13:
                            return (EditTextPreference) settingsFragment.findPreference("pref_delay_test_url");
                        case 14:
                            return (ListPreference) settingsFragment.findPreference("pref_mode");
                        case 15:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fake_dns_enabled");
                        case 16:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_append_http_proxy");
                        case 17:
                            return (EditTextPreference) settingsFragment.findPreference("pref_local_dns_port");
                        case 18:
                            return (EditTextPreference) settingsFragment.findPreference("pref_vpn_dns");
                        case 19:
                            return (ListPreference) settingsFragment.findPreference("pref_vpn_bypass_lan");
                        case 20:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_mux_enabled");
                        case 21:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_concurrency");
                        default:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_xudp_concurrency");
                    }
                }
            });
            final int i14 = 4;
            this.t0 = kotlin.c.b(new Function0(this) { // from class: j71
                public final /* synthetic */ SettingsActivity.SettingsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i14;
                    SettingsActivity.SettingsFragment settingsFragment = this.b;
                    switch (i22) {
                        case 0:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_per_app_proxy");
                        case 1:
                            return (ListPreference) settingsFragment.findPreference("pref_mux_xudp_quic");
                        case 2:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fragment_enabled");
                        case 3:
                            return (ListPreference) settingsFragment.findPreference("pref_fragment_packets");
                        case 4:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_length");
                        case 5:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_interval");
                        case 6:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_auto_update_subscription");
                        case 7:
                            return (EditTextPreference) settingsFragment.findPreference("pref_auto_update_interval");
                        case 8:
                            return (EditTextPreference) settingsFragment.findPreference("pref_socks_port");
                        case 9:
                            return (EditTextPreference) settingsFragment.findPreference("pref_remote_dns");
                        case 10:
                            return (EditTextPreference) settingsFragment.findPreference("pref_domestic_dns");
                        case 11:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_local_dns_enabled");
                        case 12:
                            return (EditTextPreference) settingsFragment.findPreference("pref_dns_hosts");
                        case 13:
                            return (EditTextPreference) settingsFragment.findPreference("pref_delay_test_url");
                        case 14:
                            return (ListPreference) settingsFragment.findPreference("pref_mode");
                        case 15:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fake_dns_enabled");
                        case 16:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_append_http_proxy");
                        case 17:
                            return (EditTextPreference) settingsFragment.findPreference("pref_local_dns_port");
                        case 18:
                            return (EditTextPreference) settingsFragment.findPreference("pref_vpn_dns");
                        case 19:
                            return (ListPreference) settingsFragment.findPreference("pref_vpn_bypass_lan");
                        case 20:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_mux_enabled");
                        case 21:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_concurrency");
                        default:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_xudp_concurrency");
                    }
                }
            });
            final int i15 = 5;
            this.u0 = kotlin.c.b(new Function0(this) { // from class: j71
                public final /* synthetic */ SettingsActivity.SettingsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i15;
                    SettingsActivity.SettingsFragment settingsFragment = this.b;
                    switch (i22) {
                        case 0:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_per_app_proxy");
                        case 1:
                            return (ListPreference) settingsFragment.findPreference("pref_mux_xudp_quic");
                        case 2:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fragment_enabled");
                        case 3:
                            return (ListPreference) settingsFragment.findPreference("pref_fragment_packets");
                        case 4:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_length");
                        case 5:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_interval");
                        case 6:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_auto_update_subscription");
                        case 7:
                            return (EditTextPreference) settingsFragment.findPreference("pref_auto_update_interval");
                        case 8:
                            return (EditTextPreference) settingsFragment.findPreference("pref_socks_port");
                        case 9:
                            return (EditTextPreference) settingsFragment.findPreference("pref_remote_dns");
                        case 10:
                            return (EditTextPreference) settingsFragment.findPreference("pref_domestic_dns");
                        case 11:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_local_dns_enabled");
                        case 12:
                            return (EditTextPreference) settingsFragment.findPreference("pref_dns_hosts");
                        case 13:
                            return (EditTextPreference) settingsFragment.findPreference("pref_delay_test_url");
                        case 14:
                            return (ListPreference) settingsFragment.findPreference("pref_mode");
                        case 15:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fake_dns_enabled");
                        case 16:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_append_http_proxy");
                        case 17:
                            return (EditTextPreference) settingsFragment.findPreference("pref_local_dns_port");
                        case 18:
                            return (EditTextPreference) settingsFragment.findPreference("pref_vpn_dns");
                        case 19:
                            return (ListPreference) settingsFragment.findPreference("pref_vpn_bypass_lan");
                        case 20:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_mux_enabled");
                        case 21:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_concurrency");
                        default:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_xudp_concurrency");
                    }
                }
            });
            final int i16 = 6;
            this.v0 = kotlin.c.b(new Function0(this) { // from class: j71
                public final /* synthetic */ SettingsActivity.SettingsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i16;
                    SettingsActivity.SettingsFragment settingsFragment = this.b;
                    switch (i22) {
                        case 0:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_per_app_proxy");
                        case 1:
                            return (ListPreference) settingsFragment.findPreference("pref_mux_xudp_quic");
                        case 2:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fragment_enabled");
                        case 3:
                            return (ListPreference) settingsFragment.findPreference("pref_fragment_packets");
                        case 4:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_length");
                        case 5:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_interval");
                        case 6:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_auto_update_subscription");
                        case 7:
                            return (EditTextPreference) settingsFragment.findPreference("pref_auto_update_interval");
                        case 8:
                            return (EditTextPreference) settingsFragment.findPreference("pref_socks_port");
                        case 9:
                            return (EditTextPreference) settingsFragment.findPreference("pref_remote_dns");
                        case 10:
                            return (EditTextPreference) settingsFragment.findPreference("pref_domestic_dns");
                        case 11:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_local_dns_enabled");
                        case 12:
                            return (EditTextPreference) settingsFragment.findPreference("pref_dns_hosts");
                        case 13:
                            return (EditTextPreference) settingsFragment.findPreference("pref_delay_test_url");
                        case 14:
                            return (ListPreference) settingsFragment.findPreference("pref_mode");
                        case 15:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fake_dns_enabled");
                        case 16:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_append_http_proxy");
                        case 17:
                            return (EditTextPreference) settingsFragment.findPreference("pref_local_dns_port");
                        case 18:
                            return (EditTextPreference) settingsFragment.findPreference("pref_vpn_dns");
                        case 19:
                            return (ListPreference) settingsFragment.findPreference("pref_vpn_bypass_lan");
                        case 20:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_mux_enabled");
                        case 21:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_concurrency");
                        default:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_xudp_concurrency");
                    }
                }
            });
            final int i17 = 7;
            this.w0 = kotlin.c.b(new Function0(this) { // from class: j71
                public final /* synthetic */ SettingsActivity.SettingsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i17;
                    SettingsActivity.SettingsFragment settingsFragment = this.b;
                    switch (i22) {
                        case 0:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_per_app_proxy");
                        case 1:
                            return (ListPreference) settingsFragment.findPreference("pref_mux_xudp_quic");
                        case 2:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fragment_enabled");
                        case 3:
                            return (ListPreference) settingsFragment.findPreference("pref_fragment_packets");
                        case 4:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_length");
                        case 5:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_interval");
                        case 6:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_auto_update_subscription");
                        case 7:
                            return (EditTextPreference) settingsFragment.findPreference("pref_auto_update_interval");
                        case 8:
                            return (EditTextPreference) settingsFragment.findPreference("pref_socks_port");
                        case 9:
                            return (EditTextPreference) settingsFragment.findPreference("pref_remote_dns");
                        case 10:
                            return (EditTextPreference) settingsFragment.findPreference("pref_domestic_dns");
                        case 11:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_local_dns_enabled");
                        case 12:
                            return (EditTextPreference) settingsFragment.findPreference("pref_dns_hosts");
                        case 13:
                            return (EditTextPreference) settingsFragment.findPreference("pref_delay_test_url");
                        case 14:
                            return (ListPreference) settingsFragment.findPreference("pref_mode");
                        case 15:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fake_dns_enabled");
                        case 16:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_append_http_proxy");
                        case 17:
                            return (EditTextPreference) settingsFragment.findPreference("pref_local_dns_port");
                        case 18:
                            return (EditTextPreference) settingsFragment.findPreference("pref_vpn_dns");
                        case 19:
                            return (ListPreference) settingsFragment.findPreference("pref_vpn_bypass_lan");
                        case 20:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_mux_enabled");
                        case 21:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_concurrency");
                        default:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_xudp_concurrency");
                    }
                }
            });
            final int i18 = 8;
            this.x0 = kotlin.c.b(new Function0(this) { // from class: j71
                public final /* synthetic */ SettingsActivity.SettingsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i18;
                    SettingsActivity.SettingsFragment settingsFragment = this.b;
                    switch (i22) {
                        case 0:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_per_app_proxy");
                        case 1:
                            return (ListPreference) settingsFragment.findPreference("pref_mux_xudp_quic");
                        case 2:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fragment_enabled");
                        case 3:
                            return (ListPreference) settingsFragment.findPreference("pref_fragment_packets");
                        case 4:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_length");
                        case 5:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_interval");
                        case 6:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_auto_update_subscription");
                        case 7:
                            return (EditTextPreference) settingsFragment.findPreference("pref_auto_update_interval");
                        case 8:
                            return (EditTextPreference) settingsFragment.findPreference("pref_socks_port");
                        case 9:
                            return (EditTextPreference) settingsFragment.findPreference("pref_remote_dns");
                        case 10:
                            return (EditTextPreference) settingsFragment.findPreference("pref_domestic_dns");
                        case 11:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_local_dns_enabled");
                        case 12:
                            return (EditTextPreference) settingsFragment.findPreference("pref_dns_hosts");
                        case 13:
                            return (EditTextPreference) settingsFragment.findPreference("pref_delay_test_url");
                        case 14:
                            return (ListPreference) settingsFragment.findPreference("pref_mode");
                        case 15:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fake_dns_enabled");
                        case 16:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_append_http_proxy");
                        case 17:
                            return (EditTextPreference) settingsFragment.findPreference("pref_local_dns_port");
                        case 18:
                            return (EditTextPreference) settingsFragment.findPreference("pref_vpn_dns");
                        case 19:
                            return (ListPreference) settingsFragment.findPreference("pref_vpn_bypass_lan");
                        case 20:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_mux_enabled");
                        case 21:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_concurrency");
                        default:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_xudp_concurrency");
                    }
                }
            });
            final int i19 = 9;
            this.y0 = kotlin.c.b(new Function0(this) { // from class: j71
                public final /* synthetic */ SettingsActivity.SettingsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i19;
                    SettingsActivity.SettingsFragment settingsFragment = this.b;
                    switch (i22) {
                        case 0:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_per_app_proxy");
                        case 1:
                            return (ListPreference) settingsFragment.findPreference("pref_mux_xudp_quic");
                        case 2:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fragment_enabled");
                        case 3:
                            return (ListPreference) settingsFragment.findPreference("pref_fragment_packets");
                        case 4:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_length");
                        case 5:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_interval");
                        case 6:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_auto_update_subscription");
                        case 7:
                            return (EditTextPreference) settingsFragment.findPreference("pref_auto_update_interval");
                        case 8:
                            return (EditTextPreference) settingsFragment.findPreference("pref_socks_port");
                        case 9:
                            return (EditTextPreference) settingsFragment.findPreference("pref_remote_dns");
                        case 10:
                            return (EditTextPreference) settingsFragment.findPreference("pref_domestic_dns");
                        case 11:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_local_dns_enabled");
                        case 12:
                            return (EditTextPreference) settingsFragment.findPreference("pref_dns_hosts");
                        case 13:
                            return (EditTextPreference) settingsFragment.findPreference("pref_delay_test_url");
                        case 14:
                            return (ListPreference) settingsFragment.findPreference("pref_mode");
                        case 15:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fake_dns_enabled");
                        case 16:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_append_http_proxy");
                        case 17:
                            return (EditTextPreference) settingsFragment.findPreference("pref_local_dns_port");
                        case 18:
                            return (EditTextPreference) settingsFragment.findPreference("pref_vpn_dns");
                        case 19:
                            return (ListPreference) settingsFragment.findPreference("pref_vpn_bypass_lan");
                        case 20:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_mux_enabled");
                        case 21:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_concurrency");
                        default:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_xudp_concurrency");
                    }
                }
            });
            final int i20 = 10;
            this.z0 = kotlin.c.b(new Function0(this) { // from class: j71
                public final /* synthetic */ SettingsActivity.SettingsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i20;
                    SettingsActivity.SettingsFragment settingsFragment = this.b;
                    switch (i22) {
                        case 0:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_per_app_proxy");
                        case 1:
                            return (ListPreference) settingsFragment.findPreference("pref_mux_xudp_quic");
                        case 2:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fragment_enabled");
                        case 3:
                            return (ListPreference) settingsFragment.findPreference("pref_fragment_packets");
                        case 4:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_length");
                        case 5:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_interval");
                        case 6:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_auto_update_subscription");
                        case 7:
                            return (EditTextPreference) settingsFragment.findPreference("pref_auto_update_interval");
                        case 8:
                            return (EditTextPreference) settingsFragment.findPreference("pref_socks_port");
                        case 9:
                            return (EditTextPreference) settingsFragment.findPreference("pref_remote_dns");
                        case 10:
                            return (EditTextPreference) settingsFragment.findPreference("pref_domestic_dns");
                        case 11:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_local_dns_enabled");
                        case 12:
                            return (EditTextPreference) settingsFragment.findPreference("pref_dns_hosts");
                        case 13:
                            return (EditTextPreference) settingsFragment.findPreference("pref_delay_test_url");
                        case 14:
                            return (ListPreference) settingsFragment.findPreference("pref_mode");
                        case 15:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fake_dns_enabled");
                        case 16:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_append_http_proxy");
                        case 17:
                            return (EditTextPreference) settingsFragment.findPreference("pref_local_dns_port");
                        case 18:
                            return (EditTextPreference) settingsFragment.findPreference("pref_vpn_dns");
                        case 19:
                            return (ListPreference) settingsFragment.findPreference("pref_vpn_bypass_lan");
                        case 20:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_mux_enabled");
                        case 21:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_concurrency");
                        default:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_xudp_concurrency");
                    }
                }
            });
            final int i21 = 12;
            this.A0 = kotlin.c.b(new Function0(this) { // from class: j71
                public final /* synthetic */ SettingsActivity.SettingsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i21;
                    SettingsActivity.SettingsFragment settingsFragment = this.b;
                    switch (i22) {
                        case 0:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_per_app_proxy");
                        case 1:
                            return (ListPreference) settingsFragment.findPreference("pref_mux_xudp_quic");
                        case 2:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fragment_enabled");
                        case 3:
                            return (ListPreference) settingsFragment.findPreference("pref_fragment_packets");
                        case 4:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_length");
                        case 5:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_interval");
                        case 6:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_auto_update_subscription");
                        case 7:
                            return (EditTextPreference) settingsFragment.findPreference("pref_auto_update_interval");
                        case 8:
                            return (EditTextPreference) settingsFragment.findPreference("pref_socks_port");
                        case 9:
                            return (EditTextPreference) settingsFragment.findPreference("pref_remote_dns");
                        case 10:
                            return (EditTextPreference) settingsFragment.findPreference("pref_domestic_dns");
                        case 11:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_local_dns_enabled");
                        case 12:
                            return (EditTextPreference) settingsFragment.findPreference("pref_dns_hosts");
                        case 13:
                            return (EditTextPreference) settingsFragment.findPreference("pref_delay_test_url");
                        case 14:
                            return (ListPreference) settingsFragment.findPreference("pref_mode");
                        case 15:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fake_dns_enabled");
                        case 16:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_append_http_proxy");
                        case 17:
                            return (EditTextPreference) settingsFragment.findPreference("pref_local_dns_port");
                        case 18:
                            return (EditTextPreference) settingsFragment.findPreference("pref_vpn_dns");
                        case 19:
                            return (ListPreference) settingsFragment.findPreference("pref_vpn_bypass_lan");
                        case 20:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_mux_enabled");
                        case 21:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_concurrency");
                        default:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_xudp_concurrency");
                    }
                }
            });
            final int i22 = 13;
            this.B0 = kotlin.c.b(new Function0(this) { // from class: j71
                public final /* synthetic */ SettingsActivity.SettingsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i222 = i22;
                    SettingsActivity.SettingsFragment settingsFragment = this.b;
                    switch (i222) {
                        case 0:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_per_app_proxy");
                        case 1:
                            return (ListPreference) settingsFragment.findPreference("pref_mux_xudp_quic");
                        case 2:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fragment_enabled");
                        case 3:
                            return (ListPreference) settingsFragment.findPreference("pref_fragment_packets");
                        case 4:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_length");
                        case 5:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_interval");
                        case 6:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_auto_update_subscription");
                        case 7:
                            return (EditTextPreference) settingsFragment.findPreference("pref_auto_update_interval");
                        case 8:
                            return (EditTextPreference) settingsFragment.findPreference("pref_socks_port");
                        case 9:
                            return (EditTextPreference) settingsFragment.findPreference("pref_remote_dns");
                        case 10:
                            return (EditTextPreference) settingsFragment.findPreference("pref_domestic_dns");
                        case 11:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_local_dns_enabled");
                        case 12:
                            return (EditTextPreference) settingsFragment.findPreference("pref_dns_hosts");
                        case 13:
                            return (EditTextPreference) settingsFragment.findPreference("pref_delay_test_url");
                        case 14:
                            return (ListPreference) settingsFragment.findPreference("pref_mode");
                        case 15:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fake_dns_enabled");
                        case 16:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_append_http_proxy");
                        case 17:
                            return (EditTextPreference) settingsFragment.findPreference("pref_local_dns_port");
                        case 18:
                            return (EditTextPreference) settingsFragment.findPreference("pref_vpn_dns");
                        case 19:
                            return (ListPreference) settingsFragment.findPreference("pref_vpn_bypass_lan");
                        case 20:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_mux_enabled");
                        case 21:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_concurrency");
                        default:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_xudp_concurrency");
                    }
                }
            });
            final int i23 = 14;
            this.C0 = kotlin.c.b(new Function0(this) { // from class: j71
                public final /* synthetic */ SettingsActivity.SettingsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i222 = i23;
                    SettingsActivity.SettingsFragment settingsFragment = this.b;
                    switch (i222) {
                        case 0:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_per_app_proxy");
                        case 1:
                            return (ListPreference) settingsFragment.findPreference("pref_mux_xudp_quic");
                        case 2:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fragment_enabled");
                        case 3:
                            return (ListPreference) settingsFragment.findPreference("pref_fragment_packets");
                        case 4:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_length");
                        case 5:
                            return (EditTextPreference) settingsFragment.findPreference("pref_fragment_interval");
                        case 6:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_auto_update_subscription");
                        case 7:
                            return (EditTextPreference) settingsFragment.findPreference("pref_auto_update_interval");
                        case 8:
                            return (EditTextPreference) settingsFragment.findPreference("pref_socks_port");
                        case 9:
                            return (EditTextPreference) settingsFragment.findPreference("pref_remote_dns");
                        case 10:
                            return (EditTextPreference) settingsFragment.findPreference("pref_domestic_dns");
                        case 11:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_local_dns_enabled");
                        case 12:
                            return (EditTextPreference) settingsFragment.findPreference("pref_dns_hosts");
                        case 13:
                            return (EditTextPreference) settingsFragment.findPreference("pref_delay_test_url");
                        case 14:
                            return (ListPreference) settingsFragment.findPreference("pref_mode");
                        case 15:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_fake_dns_enabled");
                        case 16:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_append_http_proxy");
                        case 17:
                            return (EditTextPreference) settingsFragment.findPreference("pref_local_dns_port");
                        case 18:
                            return (EditTextPreference) settingsFragment.findPreference("pref_vpn_dns");
                        case 19:
                            return (ListPreference) settingsFragment.findPreference("pref_vpn_bypass_lan");
                        case 20:
                            return (CheckBoxPreference) settingsFragment.findPreference("pref_mux_enabled");
                        case 21:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_concurrency");
                        default:
                            return (EditTextPreference) settingsFragment.findPreference("pref_mux_xudp_concurrency");
                    }
                }
            });
        }

        public static void Y(long j) {
            AngApplication.c.getClass();
            AngApplication angApplication = AngApplication.d;
            if (angApplication == null) {
                yg0.N("application");
                throw null;
            }
            RemoteWorkManagerClient remoteWorkManagerClient = (RemoteWorkManagerClient) w21.a(angApplication);
            SerialExecutor serialExecutor = remoteWorkManagerClient.c;
            ListenableFuture listenableFutureC = remoteWorkManagerClient.c(new y21());
            oi oiVar = RemoteWorkManagerClient.i;
            androidx.work.multiprocess.f.c(listenableFutureC, oiVar, serialExecutor);
            ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy = ExistingPeriodicWorkPolicy.REPLACE;
            TimeUnit timeUnit = TimeUnit.MINUTES;
            PeriodicWorkRequest.Builder builder = new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) SubscriptionUpdater$UpdateTask.class, j, timeUnit);
            timeUnit.getClass();
            builder.b.g = timeUnit.toMillis(j);
            if (Long.MAX_VALUE - System.currentTimeMillis() > builder.b.g) {
                androidx.work.multiprocess.f.c(remoteWorkManagerClient.c(new u21((PeriodicWorkRequest) builder.a(), 1)), oiVar, serialExecutor);
            } else {
                u7.r("The given initial delay is too large and will cause an overflow!");
            }
        }

        @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
        public final void F() {
            ListPreference listPreference;
            super.F();
            Lazy lazy = zq0.a;
            d0(zq0.z().e("pref_mode", "VPN"));
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.h0.getValue();
            if (checkBoxPreference != null) {
                checkBoxPreference.A(zq0.z().b("pref_local_dns_enabled", false));
            }
            CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) this.i0.getValue();
            if (checkBoxPreference2 != null) {
                checkBoxPreference2.A(zq0.z().b("pref_fake_dns_enabled", false));
            }
            CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) this.j0.getValue();
            if (checkBoxPreference3 != null) {
                checkBoxPreference3.A(zq0.z().b("pref_append_http_proxy", false));
            }
            EditTextPreference editTextPreferenceA0 = a0();
            if (editTextPreferenceA0 != null) {
                editTextPreferenceA0.x(zq0.z().e("pref_local_dns_port", "10853"));
            }
            EditTextPreference editTextPreferenceB0 = b0();
            if (editTextPreferenceB0 != null) {
                editTextPreferenceB0.x(zq0.z().e("pref_vpn_dns", "1.1.1.1"));
            }
            e0(zq0.z().b("pref_mux_enabled", false));
            CheckBoxPreference checkBoxPreference4 = (CheckBoxPreference) this.n0.getValue();
            if (checkBoxPreference4 != null) {
                checkBoxPreference4.A(zq0.z().b("pref_mux_enabled", false));
            }
            Lazy lazy2 = this.o0;
            EditTextPreference editTextPreference = (EditTextPreference) lazy2.getValue();
            if (editTextPreference != null) {
                editTextPreference.x(zq0.z().e("pref_mux_concurrency", "8"));
            }
            Lazy lazy3 = this.p0;
            EditTextPreference editTextPreference2 = (EditTextPreference) lazy3.getValue();
            if (editTextPreference2 != null) {
                editTextPreference2.x(zq0.z().e("pref_mux_xudp_concurrency", "8"));
            }
            c0(zq0.z().b("pref_fragment_enabled", false));
            CheckBoxPreference checkBoxPreference5 = (CheckBoxPreference) this.r0.getValue();
            if (checkBoxPreference5 != null) {
                checkBoxPreference5.A(zq0.z().b("pref_fragment_enabled", false));
            }
            ListPreference listPreference2 = (ListPreference) this.s0.getValue();
            if (listPreference2 != null) {
                listPreference2.x(zq0.z().e("pref_fragment_packets", "tlshello"));
            }
            Lazy lazy4 = this.t0;
            EditTextPreference editTextPreference3 = (EditTextPreference) lazy4.getValue();
            if (editTextPreference3 != null) {
                editTextPreference3.x(zq0.z().e("pref_fragment_length", "50-100"));
            }
            Lazy lazy5 = this.u0;
            EditTextPreference editTextPreference4 = (EditTextPreference) lazy5.getValue();
            if (editTextPreference4 != null) {
                editTextPreference4.x(zq0.z().e("pref_fragment_interval", "10-20"));
            }
            CheckBoxPreference checkBoxPreference6 = (CheckBoxPreference) this.v0.getValue();
            if (checkBoxPreference6 != null) {
                checkBoxPreference6.A(zq0.z().b("pref_auto_update_subscription", false));
            }
            EditTextPreference editTextPreferenceZ = Z();
            if (editTextPreferenceZ != null) {
                editTextPreferenceZ.x(zq0.z().e("pref_auto_update_interval", "1440"));
            }
            EditTextPreference editTextPreferenceZ2 = Z();
            if (editTextPreferenceZ2 != null) {
                editTextPreferenceZ2.v(zq0.z().b("pref_auto_update_subscription", false));
            }
            Lazy lazy6 = this.x0;
            EditTextPreference editTextPreference5 = (EditTextPreference) lazy6.getValue();
            if (editTextPreference5 != null) {
                editTextPreference5.x(zq0.z().e("pref_socks_port", "10808"));
            }
            Lazy lazy7 = this.y0;
            EditTextPreference editTextPreference6 = (EditTextPreference) lazy7.getValue();
            if (editTextPreference6 != null) {
                editTextPreference6.x(zq0.z().e("pref_remote_dns", "1.1.1.1"));
            }
            Lazy lazy8 = this.z0;
            EditTextPreference editTextPreference7 = (EditTextPreference) lazy8.getValue();
            if (editTextPreference7 != null) {
                editTextPreference7.x(zq0.z().e("pref_domestic_dns", "223.5.5.5"));
            }
            EditTextPreference editTextPreference8 = (EditTextPreference) this.A0.getValue();
            if (editTextPreference8 != null) {
                editTextPreference8.x(zq0.z().d("pref_dns_hosts"));
            }
            Lazy lazy9 = this.B0;
            EditTextPreference editTextPreference9 = (EditTextPreference) lazy9.getValue();
            if (editTextPreference9 != null) {
                editTextPreference9.x(zq0.z().e("pref_delay_test_url", "https://www.gstatic.com/generate_204"));
            }
            for (EditTextPreference editTextPreference10 : kotlin.collections.c.A(a0(), b0(), (EditTextPreference) lazy2.getValue(), (EditTextPreference) lazy3.getValue(), (EditTextPreference) lazy4.getValue(), (EditTextPreference) lazy5.getValue(), Z(), (EditTextPreference) lazy6.getValue(), (EditTextPreference) lazy7.getValue(), (EditTextPreference) lazy8.getValue(), (EditTextPreference) lazy9.getValue())) {
                if (editTextPreference10 != null) {
                    editTextPreference10.A(String.valueOf(editTextPreference10.g()));
                }
            }
            for (String str : kotlin.collections.c.z("pref_sniffing_enabled")) {
                CheckBoxPreference checkBoxPreference7 = (CheckBoxPreference) findPreference(str);
                if (checkBoxPreference7 != null) {
                    Lazy lazy10 = zq0.a;
                    str.getClass();
                    checkBoxPreference7.A(zq0.z().b(str, true));
                }
            }
            for (String str2 : kotlin.collections.c.A("pref_route_only_enabled", "pref_is_booted", "pref_bypass_apps", "pref_speed_enabled", "pref_confirm_remove", "pref_start_scan_immediate", "pref_double_column_display", "pref_prefer_ipv6", "pref_proxy_sharing_enabled", "pref_allow_insecure")) {
                CheckBoxPreference checkBoxPreference8 = (CheckBoxPreference) findPreference(str2);
                if (checkBoxPreference8 != null) {
                    Lazy lazy11 = zq0.a;
                    str2.getClass();
                    checkBoxPreference8.A(zq0.z().b(str2, false));
                }
            }
            for (String str3 : kotlin.collections.c.A("pref_vpn_bypass_lan", "pref_routing_domain_strategy", "pref_mux_xudp_quic", "pref_fragment_packets", "pref_language", "pref_ui_mode_night", "pref_core_loglevel", "pref_mode")) {
                Lazy lazy12 = zq0.a;
                str3.getClass();
                if (zq0.z().d(str3) != null && (listPreference = (ListPreference) findPreference(str3)) != null) {
                    listPreference.B(zq0.z().d(str3));
                }
            }
        }

        @Override // androidx.preference.PreferenceFragmentCompat
        public final void X() {
            W();
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.g0.getValue();
            if (checkBoxPreference != null) {
                checkBoxPreference.f = new i71(this, 0);
            }
            CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) this.h0.getValue();
            if (checkBoxPreference2 != null) {
                checkBoxPreference2.e = new i71(this, 1);
            }
            EditTextPreference editTextPreferenceA0 = a0();
            if (editTextPreferenceA0 != null) {
                editTextPreferenceA0.e = new i71(this, 2);
            }
            EditTextPreference editTextPreferenceB0 = b0();
            if (editTextPreferenceB0 != null) {
                editTextPreferenceB0.e = new i71(this, 3);
            }
            CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) this.n0.getValue();
            if (checkBoxPreference3 != null) {
                checkBoxPreference3.e = new i71(this, 4);
            }
            EditTextPreference editTextPreference = (EditTextPreference) this.o0.getValue();
            if (editTextPreference != null) {
                editTextPreference.e = new i71(this, 5);
            }
            EditTextPreference editTextPreference2 = (EditTextPreference) this.p0.getValue();
            if (editTextPreference2 != null) {
                editTextPreference2.e = new i71(this, 6);
            }
            CheckBoxPreference checkBoxPreference4 = (CheckBoxPreference) this.r0.getValue();
            if (checkBoxPreference4 != null) {
                checkBoxPreference4.e = new i71(this, 7);
            }
            ListPreference listPreference = (ListPreference) this.s0.getValue();
            if (listPreference != null) {
                listPreference.e = new i71(this, 8);
            }
            EditTextPreference editTextPreference3 = (EditTextPreference) this.t0.getValue();
            if (editTextPreference3 != null) {
                editTextPreference3.e = new i71(this, 9);
            }
            EditTextPreference editTextPreference4 = (EditTextPreference) this.u0.getValue();
            if (editTextPreference4 != null) {
                editTextPreference4.e = new i71(this, 10);
            }
            CheckBoxPreference checkBoxPreference5 = (CheckBoxPreference) this.v0.getValue();
            if (checkBoxPreference5 != null) {
                checkBoxPreference5.e = new i71(this, 11);
            }
            EditTextPreference editTextPreferenceZ = Z();
            if (editTextPreferenceZ != null) {
                editTextPreferenceZ.e = new i71(this, 12);
            }
            EditTextPreference editTextPreference5 = (EditTextPreference) this.x0.getValue();
            if (editTextPreference5 != null) {
                editTextPreference5.e = new i71(this, 13);
            }
            EditTextPreference editTextPreference6 = (EditTextPreference) this.y0.getValue();
            if (editTextPreference6 != null) {
                editTextPreference6.e = new i71(this, 14);
            }
            EditTextPreference editTextPreference7 = (EditTextPreference) this.z0.getValue();
            if (editTextPreference7 != null) {
                editTextPreference7.e = new i71(this, 15);
            }
            EditTextPreference editTextPreference8 = (EditTextPreference) this.A0.getValue();
            if (editTextPreference8 != null) {
                editTextPreference8.e = new i71(this, 16);
            }
            EditTextPreference editTextPreference9 = (EditTextPreference) this.B0.getValue();
            if (editTextPreference9 != null) {
                editTextPreference9.e = new i71(this, 17);
            }
            Lazy lazy = this.C0;
            ListPreference listPreference2 = (ListPreference) lazy.getValue();
            if (listPreference2 != null) {
                listPreference2.e = new i71(this, 18);
            }
            ListPreference listPreference3 = (ListPreference) lazy.getValue();
            if (listPreference3 != null) {
                listPreference3.S = R.layout.preference_with_help_link;
            }
        }

        public final EditTextPreference Z() {
            return (EditTextPreference) this.w0.getValue();
        }

        public final EditTextPreference a0() {
            return (EditTextPreference) this.k0.getValue();
        }

        public final EditTextPreference b0() {
            return (EditTextPreference) this.l0.getValue();
        }

        public final void c0(boolean z) {
            Lazy lazy = this.s0;
            ListPreference listPreference = (ListPreference) lazy.getValue();
            if (listPreference != null) {
                listPreference.v(z);
            }
            Lazy lazy2 = this.t0;
            EditTextPreference editTextPreference = (EditTextPreference) lazy2.getValue();
            if (editTextPreference != null) {
                editTextPreference.v(z);
            }
            Lazy lazy3 = this.u0;
            EditTextPreference editTextPreference2 = (EditTextPreference) lazy3.getValue();
            if (editTextPreference2 != null) {
                editTextPreference2.v(z);
            }
            if (z) {
                Lazy lazy4 = zq0.a;
                String strE = zq0.z().e("pref_fragment_packets", "tlshello");
                ListPreference listPreference2 = (ListPreference) lazy.getValue();
                if (listPreference2 != null) {
                    listPreference2.x(String.valueOf(strE));
                }
                String strE2 = zq0.z().e("pref_fragment_length", "50-100");
                EditTextPreference editTextPreference3 = (EditTextPreference) lazy2.getValue();
                if (editTextPreference3 != null) {
                    editTextPreference3.x(String.valueOf(strE2));
                }
                String strE3 = zq0.z().e("pref_fragment_interval", "10-20");
                EditTextPreference editTextPreference4 = (EditTextPreference) lazy3.getValue();
                if (editTextPreference4 != null) {
                    editTextPreference4.x(String.valueOf(strE3));
                }
            }
        }

        public final void d0(String str) {
            boolean zA = yg0.a(str, "VPN");
            Lazy lazy = this.g0;
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) lazy.getValue();
            if (checkBoxPreference != null) {
                checkBoxPreference.v(zA);
            }
            CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) lazy.getValue();
            if (checkBoxPreference2 != null) {
                Lazy lazy2 = zq0.a;
                checkBoxPreference2.A(zq0.z().b("pref_per_app_proxy", false));
            }
            CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) this.h0.getValue();
            if (checkBoxPreference3 != null) {
                checkBoxPreference3.v(zA);
            }
            Lazy lazy3 = this.i0;
            CheckBoxPreference checkBoxPreference4 = (CheckBoxPreference) lazy3.getValue();
            if (checkBoxPreference4 != null) {
                checkBoxPreference4.v(zA);
            }
            CheckBoxPreference checkBoxPreference5 = (CheckBoxPreference) this.j0.getValue();
            if (checkBoxPreference5 != null) {
                checkBoxPreference5.v(zA);
            }
            EditTextPreference editTextPreferenceA0 = a0();
            if (editTextPreferenceA0 != null) {
                editTextPreferenceA0.v(zA);
            }
            EditTextPreference editTextPreferenceB0 = b0();
            if (editTextPreferenceB0 != null) {
                editTextPreferenceB0.v(zA);
            }
            ListPreference listPreference = (ListPreference) this.m0.getValue();
            if (listPreference != null) {
                listPreference.v(zA);
            }
            if (zA) {
                Lazy lazy4 = zq0.a;
                boolean zB = zq0.z().b("pref_local_dns_enabled", false);
                CheckBoxPreference checkBoxPreference6 = (CheckBoxPreference) lazy3.getValue();
                if (checkBoxPreference6 != null) {
                    checkBoxPreference6.v(zB);
                }
                EditTextPreference editTextPreferenceA02 = a0();
                if (editTextPreferenceA02 != null) {
                    editTextPreferenceA02.v(zB);
                }
                EditTextPreference editTextPreferenceB02 = b0();
                if (editTextPreferenceB02 != null) {
                    editTextPreferenceB02.v(!zB);
                }
            }
        }

        public final void e0(boolean z) {
            Integer numA0;
            Lazy lazy = this.o0;
            EditTextPreference editTextPreference = (EditTextPreference) lazy.getValue();
            if (editTextPreference != null) {
                editTextPreference.v(z);
            }
            EditTextPreference editTextPreference2 = (EditTextPreference) this.p0.getValue();
            if (editTextPreference2 != null) {
                editTextPreference2.v(z);
            }
            ListPreference listPreference = (ListPreference) this.q0.getValue();
            if (listPreference != null) {
                listPreference.v(z);
            }
            if (z) {
                Lazy lazy2 = zq0.a;
                String strE = zq0.z().e("pref_mux_concurrency", "8");
                int iIntValue = (strE == null || (numA0 = kotlin.text.g.a0(strE)) == null) ? 8 : numA0.intValue();
                EditTextPreference editTextPreference3 = (EditTextPreference) lazy.getValue();
                if (editTextPreference3 != null) {
                    editTextPreference3.x(String.valueOf(iIntValue));
                }
                f0(zq0.z().e("pref_mux_xudp_concurrency", "8"));
            }
        }

        public final void f0(String str) {
            Lazy lazy = this.q0;
            if (str == null) {
                ListPreference listPreference = (ListPreference) lazy.getValue();
                if (listPreference != null) {
                    listPreference.v(true);
                    return;
                }
                return;
            }
            Integer numA0 = kotlin.text.g.a0(str);
            int iIntValue = numA0 != null ? numA0.intValue() : 8;
            EditTextPreference editTextPreference = (EditTextPreference) this.p0.getValue();
            if (editTextPreference != null) {
                editTextPreference.x(String.valueOf(iIntValue));
            }
            ListPreference listPreference2 = (ListPreference) lazy.getValue();
            if (listPreference2 != null) {
                listPreference2.v(iIntValue >= 0);
            }
        }
    }

    public SettingsActivity() {
        final Function0 function0 = null;
        this.c = new ViewModelLazy(Reflection.a(SettingsViewModel.class), new Function0<ViewModelStore>() { // from class: com.v2ray.ang.ui.SettingsActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.v2ray.ang.ui.SettingsActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.v2ray.ang.ui.SettingsActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    @Override // com.v2ray.ang.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_settings);
        setTitle(getString(R.string.title_settings));
        ((SettingsViewModel) this.c.getValue()).startListenPreferenceChange();
    }

    public final void onModeHelpClicked(View view) {
        view.getClass();
        Regex regex = ul1.a;
        ul1.x(this, "https://github.com/2dust/v2rayNG/wiki/Mode");
    }
}
