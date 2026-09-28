package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a1;
import androidx.viewpager2.widget.ViewPager2;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.v2ray.ang.TabFragment;
import com.v2ray.ang.adapter.NetworkAdapter;
import com.v2ray.ang.ui.HomeFragment;
import com.v2ray.ang.viewmodel.ConfigData;
import com.v2ray.ang.viewmodel.NetworkList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1;
import kotlin.collections.c;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.b;
import kotlin.text.Regex;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yc0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ HomeFragment b;

    public /* synthetic */ yc0(HomeFragment homeFragment, int i) {
        this.a = i;
        this.b = homeFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String whatsApp;
        String facebook;
        Window window;
        Window window2;
        int i = this.a;
        int i2 = 1;
        int i3 = 0;
        HomeFragment homeFragment = this.b;
        switch (i) {
            case 0:
                int i4 = HomeFragment.f2;
                homeFragment.i0(null);
                return;
            case 1:
                int i5 = HomeFragment.f2;
                ConfigData configValue = homeFragment.e0().getConfigValue();
                whatsApp = configValue != null ? configValue.getWhatsApp() : null;
                if (whatsApp == null || whatsApp.length() == 0) {
                    qf3.N(homeFragment.M(), "No WhatsApp link configured");
                    return;
                }
                Uri uri = Uri.parse(g.c0(whatsApp).toString());
                try {
                    homeFragment.U(new Intent("android.intent.action.VIEW", g.o(whatsApp, "chat.whatsapp.com", false) ? Uri.parse(g.M(whatsApp, "https://", "whatsapp://")) : g.o(whatsApp, "wa.me", false) ? Uri.parse(g.M(whatsApp, "https://wa.me/", "whatsapp://send?phone=")) : uri));
                    return;
                } catch (ActivityNotFoundException unused) {
                    homeFragment.U(new Intent("android.intent.action.VIEW", uri));
                    return;
                }
            case 2:
                int i6 = HomeFragment.f2;
                ConfigData configValue2 = homeFragment.e0().getConfigValue();
                whatsApp = configValue2 != null ? configValue2.getFacebook() : null;
                if (whatsApp == null || whatsApp.length() == 0) {
                    qf3.N(homeFragment.M(), "No Facebook Link");
                    return;
                }
                ConfigData configValue3 = homeFragment.e0().getConfigValue();
                if (configValue3 == null || (facebook = configValue3.getFacebook()) == null) {
                    return;
                }
                g.V(facebook, "/");
                Uri uri2 = Uri.parse("fb://facewebmodal/f?href=".concat(facebook));
                Uri uri3 = Uri.parse(facebook);
                try {
                    homeFragment.U(new Intent("android.intent.action.VIEW", uri2));
                    return;
                } catch (ActivityNotFoundException unused2) {
                    homeFragment.U(new Intent("android.intent.action.VIEW", uri3));
                    return;
                }
            case 3:
                int i7 = HomeFragment.f2;
                homeFragment.i0("@vpnprous_bot");
                return;
            case 4:
                int i8 = HomeFragment.f2;
                HomeFragment.D0(homeFragment, homeFragment.L(), true);
                return;
            case 5:
                int i9 = HomeFragment.f2;
                homeFragment.x0();
                return;
            case 6:
                int i10 = HomeFragment.f2;
                Lazy lazy = zq0.a;
                if (zq0.t()) {
                    qf3.N(homeFragment.M(), "Turn off use config first!!");
                    return;
                }
                Regex regex = ul1.a;
                Pair pairH = ul1.h(homeFragment.M());
                String strK = ul1.k((String) pairH.getFirst());
                List list = homeFragment.H0;
                if (list == null) {
                    yg0.N("networkList");
                    throw null;
                }
                List listF = b.f(new FilteringSequence(new CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1(list), true, new t(strK, 6)));
                int i11 = -1;
                if (!listF.isEmpty()) {
                    View viewInflate = LayoutInflater.from(homeFragment.M()).inflate(R.layout.dialog_tabs, (ViewGroup) null);
                    TabLayout tabLayout = (TabLayout) viewInflate.findViewById(R.id.tabLayout);
                    ViewPager2 viewPager2 = (ViewPager2) viewInflate.findViewById(R.id.viewPager);
                    SearchView searchView = (SearchView) viewInflate.findViewById(R.id.searchView);
                    searchView.getClass();
                    EditText editText = (EditText) searchView.findViewById(R.id.search_src_text);
                    int color = homeFragment.M().getColor(R.color.colorAccent);
                    editText.setTextColor(color);
                    editText.setHintTextColor(color);
                    sd0 sd0Var = new sd0(homeFragment);
                    TabFragment.Companion companion = TabFragment.e0;
                    ArrayList arrayList = new ArrayList(listF);
                    companion.getClass();
                    TabFragment tabFragment = new TabFragment();
                    tabFragment.a0 = arrayList;
                    tabFragment.b0 = true;
                    tabFragment.c0 = sd0Var;
                    List list2 = homeFragment.H0;
                    if (list2 == null) {
                        yg0.N("networkList");
                        throw null;
                    }
                    ArrayList arrayList2 = new ArrayList(list2);
                    TabFragment tabFragment2 = new TabFragment();
                    tabFragment2.a0 = arrayList2;
                    tabFragment2.b0 = true;
                    tabFragment2.c0 = sd0Var;
                    List listA = c.A(tabFragment, tabFragment2);
                    List listA2 = c.A("Recommended", "All Country");
                    viewPager2.setAdapter(new qd0(homeFragment, listA));
                    viewPager2.setOffscreenPageLimit(1);
                    new TabLayoutMediator(tabLayout, viewPager2, new b1(listA2, 19)).a();
                    searchView.setOnQueryTextListener(new rd0(tabFragment, tabFragment2));
                    MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(homeFragment.M(), R.style.FullScreenDialog);
                    materialAlertDialogBuilder.a.r = viewInflate;
                    androidx.appcompat.app.g gVarA = materialAlertDialogBuilder.a();
                    homeFragment.I0 = gVarA;
                    gVarA.show();
                    androidx.appcompat.app.g gVar = homeFragment.I0;
                    if (gVar == null || (window = gVar.getWindow()) == null) {
                        return;
                    }
                    window.setLayout(-1, -1);
                    window.setBackgroundDrawable(new ColorDrawable(0));
                    return;
                }
                View viewInflate2 = homeFragment.g().inflate(R.layout.network_list, (ViewGroup) null);
                MaterialAlertDialogBuilder materialAlertDialogBuilder2 = new MaterialAlertDialogBuilder(homeFragment.M(), R.style.FullScreenDialog);
                materialAlertDialogBuilder2.a.r = viewInflate2;
                androidx.appcompat.app.g gVarA2 = materialAlertDialogBuilder2.a();
                homeFragment.I0 = gVarA2;
                gVarA2.show();
                androidx.appcompat.app.g gVar2 = homeFragment.I0;
                if (gVar2 != null && (window2 = gVar2.getWindow()) != null) {
                    window2.setLayout(-1, -1);
                    window2.setBackgroundDrawable(new ColorDrawable(0));
                }
                SearchView searchView2 = (SearchView) viewInflate2.findViewById(R.id.svNetwork);
                searchView2.getClass();
                EditText editText2 = (EditText) searchView2.findViewById(R.id.search_src_text);
                int color2 = homeFragment.M().getColor(R.color.textColor);
                editText2.setTextColor(color2);
                editText2.setHintTextColor(color2);
                NetworkAdapter networkAdapter = new NetworkAdapter(homeFragment.M(), new ArrayList(), homeFragment);
                RecyclerView recyclerView = (RecyclerView) viewInflate2.findViewById(R.id.rvNetwork);
                recyclerView.setLayoutManager(new LinearLayoutManager(homeFragment.M()));
                recyclerView.setAdapter(networkAdapter);
                recyclerView.setHasFixedSize(true);
                recyclerView.setItemViewCacheSize(20);
                a1 a1VarA = recyclerView.getRecycledViewPool().a(0);
                a1VarA.b = 25;
                ArrayList arrayList3 = a1VarA.a;
                while (arrayList3.size() > 25) {
                    arrayList3.remove(arrayList3.size() - 1);
                }
                List list3 = homeFragment.H0;
                if (list3 == null) {
                    yg0.N("networkList");
                    throw null;
                }
                networkAdapter.f.b(list3);
                List list4 = homeFragment.H0;
                if (list4 == null) {
                    yg0.N("networkList");
                    throw null;
                }
                Iterator it = list4.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String name = ((NetworkList) it.next()).getName();
                        Lazy lazy2 = zq0.a;
                        if (yg0.a(name, zq0.C())) {
                            i11 = i3;
                        } else {
                            i3++;
                        }
                    }
                }
                if (i11 >= 0) {
                    recyclerView.h0(i11);
                }
                searchView2.clearFocus();
                searchView2.setOnQueryTextListener(new pd0(homeFragment, networkAdapter));
                return;
            default:
                int i12 = HomeFragment.f2;
                if (!homeFragment.W()) {
                    qf3.L(homeFragment.M(), "Ads are not available yet");
                    return;
                }
                if (homeFragment.o1 == null) {
                    homeFragment.o0();
                    return;
                }
                ConfigData configValue4 = homeFragment.e0().getConfigValue();
                configValue4.getClass();
                if (!configValue4.isTimerOn()) {
                    RewardedAd rewardedAd = homeFragment.o1;
                    if (rewardedAd != null) {
                        rewardedAd.setFullScreenContentCallback(new td0(homeFragment, i3));
                    }
                    RewardedAd rewardedAd2 = homeFragment.o1;
                    if (rewardedAd2 != null) {
                        rewardedAd2.show(homeFragment.L(), new ad0(homeFragment));
                        return;
                    }
                    return;
                }
                MaterialAlertDialogBuilder materialAlertDialogBuilder3 = new MaterialAlertDialogBuilder(homeFragment.L());
                AlertController.AlertParams alertParams = materialAlertDialogBuilder3.a;
                alertParams.e = "Adding Time";
                alertParams.g = hz.p(homeFragment.w1, "Watch advertisement to receive:\n\n• ", " additional hours.\n\nYou must watch the advertisement to completion to receive the reward.");
                materialAlertDialogBuilder3.h("Watch", new zc0(homeFragment, i3));
                materialAlertDialogBuilder3.g("Cancel", new zc0(homeFragment, i2));
                androidx.appcompat.app.g gVarA3 = materialAlertDialogBuilder3.a();
                homeFragment.I0 = gVarA3;
                gVarA3.show();
                return;
        }
    }
}
