package com.v2ray.ang.ui;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import dev.zeron.tunnel.R;
import com.v2ray.ang.ui.LogcatActivity;
import com.v2ray.ang.ui.LogcatRecyclerAdapter;
import defpackage.b1;
import defpackage.jm0;
import defpackage.oy;
import defpackage.qf3;
import defpackage.ul1;
import defpackage.z2;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/v2ray/ang/ui/LogcatActivity;", "Lcom/v2ray/ang/ui/BaseActivity;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LogcatActivity extends BaseActivity implements SwipeRefreshLayout.OnRefreshListener {
    public static final /* synthetic */ int g = 0;
    public final Lazy c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final Lazy f;

    public LogcatActivity() {
        final int i = 0;
        this.c = kotlin.c.b(new Function0(this) { // from class: im0
            public final /* synthetic */ LogcatActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LogcatActivity logcatActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = LogcatActivity.g;
                        return z2.a(logcatActivity.getLayoutInflater());
                    default:
                        int i4 = LogcatActivity.g;
                        return new LogcatRecyclerAdapter(logcatActivity);
                }
            }
        });
        final int i2 = 1;
        this.f = kotlin.c.b(new Function0(this) { // from class: im0
            public final /* synthetic */ LogcatActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LogcatActivity logcatActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = LogcatActivity.g;
                        return z2.a(logcatActivity.getLayoutInflater());
                    default:
                        int i4 = LogcatActivity.g;
                        return new LogcatRecyclerAdapter(logcatActivity);
                }
            }
        });
    }

    public final void h(String str) {
        ArrayList arrayListS;
        String string = str != null ? kotlin.text.g.c0(str).toString() : null;
        if (string == null || string.length() == 0) {
            arrayListS = kotlin.collections.c.S(this.d);
        } else {
            ArrayList arrayList = this.d;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (kotlin.text.g.o((String) obj, string, false)) {
                    arrayList2.add(obj);
                }
            }
            arrayListS = new ArrayList(arrayList2);
        }
        this.e = arrayListS;
        ((LogcatRecyclerAdapter) this.f.getValue()).f();
    }

    public final z2 i() {
        return (z2) this.c.getValue();
    }

    @Override // com.v2ray.ang.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(i().a);
        setTitle(getString(R.string.title_logcat));
        i().b.setHasFixedSize(true);
        i().b.setLayoutManager(new LinearLayoutManager(this));
        BaseActivity.g(this, i().b, this);
        i().b.setAdapter((LogcatRecyclerAdapter) this.f.getValue());
        i().c.setOnRefreshListener(this);
        ArrayList arrayList = this.e;
        String string = getString(R.string.pull_down_to_refresh);
        string.getClass();
        arrayList.add(string);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.menu_logcat, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.search_view);
        if (menuItemFindItem != null) {
            View actionView = menuItemFindItem.getActionView();
            actionView.getClass();
            SearchView searchView = (SearchView) actionView;
            searchView.setOnQueryTextListener(new jm0(this));
            searchView.setOnCloseListener(new b1(this, 23));
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.v2ray.ang.ui.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.clear_all) {
            try {
                kotlinx.coroutines.c.d(m.a(this), oy.a, null, new LogcatActivity$clearLogcat$1(this, null), 2);
            } catch (IOException unused) {
            }
            return true;
        }
        if (itemId != R.id.copy_all) {
            return super.onOptionsItemSelected(menuItem);
        }
        Regex regex = ul1.a;
        ul1.A(this, kotlin.collections.c.w(this.e, "\n", null, null, null, 62));
        qf3.O(this);
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void onRefresh() {
        try {
            i().c.setRefreshing(true);
            kotlinx.coroutines.c.d(m.a(this), oy.a, null, new LogcatActivity$getLogcat$1(this, null), 2);
        } catch (IOException unused) {
        }
    }
}
