package com.v2ray.ang.ui;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.webkit.Profile;
import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.dto.ProfileItem;
import defpackage.k3;
import defpackage.l8;
import defpackage.zq0;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/ui/TaskerActivity;", "Lcom/v2ray/ang/ui/BaseActivity;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaskerActivity extends BaseActivity {
    public static final /* synthetic */ int g = 0;
    public ListView d;
    public final Lazy c = kotlin.c.b(new l8(this, 22));
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    @Override // com.v2ray.ang.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ListView listView;
        super.onCreate(bundle);
        Lazy lazy = this.c;
        setContentView(((k3) lazy.getValue()).a);
        ArrayList arrayList = this.e;
        arrayList.add(Profile.DEFAULT_PROFILE_NAME);
        ArrayList arrayList2 = this.f;
        arrayList2.add(Profile.DEFAULT_PROFILE_NAME);
        Lazy lazy2 = zq0.a;
        for (String str : zq0.f()) {
            Lazy lazy3 = zq0.a;
            ProfileItem profileItemE = zq0.e(str);
            if (profileItemE != null) {
                arrayList.add(profileItemE.getRemarks());
                arrayList2.add(str);
            }
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.simple_list_item_single_choice, arrayList);
        View viewFindViewById = findViewById(dev.zeron.tunnel.R.id.listview);
        viewFindViewById.getClass();
        ListView listView2 = (ListView) viewFindViewById;
        this.d = listView2;
        listView2.setAdapter((ListAdapter) arrayAdapter);
        try {
            Intent intent = getIntent();
            Bundle bundleExtra = intent != null ? intent.getBundleExtra("com.twofortyfouram.locale.intent.extra.BUNDLE") : null;
            Boolean boolValueOf = bundleExtra != null ? Boolean.valueOf(bundleExtra.getBoolean("tasker_extra_bundle_switch", false)) : null;
            String string = bundleExtra != null ? bundleExtra.getString("tasker_extra_bundle_guid", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED) : null;
            if (boolValueOf != null && !TextUtils.isEmpty(string)) {
                ((k3) lazy.getValue()).b.setChecked(boolValueOf.booleanValue());
                int iIndexOf = arrayList2.indexOf(String.valueOf(string));
                if (iIndexOf < 0 || (listView = this.d) == null) {
                    return;
                }
                listView.setItemChecked(iIndexOf, true);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(dev.zeron.tunnel.R.menu.action_server, menu);
        MenuItem menuItemFindItem = menu.findItem(dev.zeron.tunnel.R.id.del_config);
        if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(false);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.v2ray.ang.ui.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId != dev.zeron.tunnel.R.id.del_config) {
            if (itemId != dev.zeron.tunnel.R.id.save_config) {
                return super.onOptionsItemSelected(menuItem);
            }
            ListView listView = this.d;
            Integer numValueOf = listView != null ? Integer.valueOf(listView.getCheckedItemPosition()) : null;
            if (numValueOf != null && numValueOf.intValue() >= 0) {
                Bundle bundle = new Bundle();
                Lazy lazy = this.c;
                bundle.putBoolean("tasker_extra_bundle_switch", ((k3) lazy.getValue()).b.isChecked());
                bundle.putString("tasker_extra_bundle_guid", (String) this.f.get(numValueOf.intValue()));
                Intent intent = new Intent();
                Object obj = this.e.get(numValueOf.intValue());
                obj.getClass();
                String str = (String) obj;
                String strConcat = ((k3) lazy.getValue()).b.isChecked() ? "Start ".concat(str) : "Stop ".concat(str);
                intent.putExtra("com.twofortyfouram.locale.intent.extra.BUNDLE", bundle);
                intent.putExtra("com.twofortyfouram.locale.intent.extra.BLURB", strConcat);
                setResult(-1, intent);
                finish();
            }
        }
        return true;
    }
}
