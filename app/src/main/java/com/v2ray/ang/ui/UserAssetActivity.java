package com.v2ray.ang.ui;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dev.zeron.tunnel.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.v2ray.ang.AppConfig;
import com.v2ray.ang.dto.AssetUrlItem;
import com.v2ray.ang.ui.UserAssetActivity;
import defpackage.gh0;
import defpackage.hv;
import defpackage.hz;
import defpackage.i60;
import defpackage.if3;
import defpackage.io0;
import defpackage.l02;
import defpackage.l3;
import defpackage.lv;
import defpackage.mn;
import defpackage.mu;
import defpackage.oy;
import defpackage.p61;
import defpackage.qf3;
import defpackage.tb1;
import defpackage.ul1;
import defpackage.yg0;
import defpackage.zq0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;

 
 
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/v2ray/ang/ui/UserAssetActivity;", "Lcom/v2ray/ang/ui/BaseActivity;", "<init>", "()V", "UserAssetAdapter", "UserAssetViewHolder", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UserAssetActivity extends BaseActivity {
    public static final   int j = 0;
    public final Lazy c;
    public final Lazy d;
    public final String[] e = {"geosite.dat", "geoip.dat"};
    public final ActivityResultLauncher f;
    public final ActivityResultLauncher g;
    public final ActivityResultLauncher h;
    public final ActivityResultLauncher i;

     
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/v2ray/ang/ui/UserAssetActivity$UserAssetAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/v2ray/ang/ui/UserAssetActivity$UserAssetViewHolder;", "<init>", "(Lcom/v2ray/ang/ui/UserAssetActivity;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class UserAssetAdapter extends RecyclerView.Adapter<UserAssetViewHolder> {
        public UserAssetAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int c() {
            Lazy lazy = zq0.a;
            List listB = zq0.b();
            int i = UserAssetActivity.j;
            return UserAssetActivity.this.h(listB).size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void k(RecyclerView.ViewHolder viewHolder, int i) {
            gh0 gh0Var = ((UserAssetViewHolder) viewHolder).u;
            Lazy lazy = zq0.a;
            List listB = zq0.b();
            int i2 = UserAssetActivity.j;
            UserAssetActivity userAssetActivity = UserAssetActivity.this;
            Pair pair = (Pair) kotlin.collections.c.u(i, userAssetActivity.h(listB));
            if (pair == null) {
                return;
            }
            File[] fileArrListFiles = ((File) userAssetActivity.d.getValue()).listFiles();
            File file = null;
            if (fileArrListFiles != null) {
                int length = fileArrListFiles.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    File file2 = fileArrListFiles[i3];
                    if (yg0.a(file2.getName(), ((AssetUrlItem) pair.getSecond()).getRemarks())) {
                        file = file2;
                        break;
                    }
                    i3++;
                }
            }
            TextView textView = gh0Var.b;
            LinearLayout linearLayout = gh0Var.d;
            TextView textView2 = gh0Var.c;
            textView.setText(((AssetUrlItem) pair.getSecond()).getRemarks());
            int i4 = 2;
            if (file != null) {
                DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(2, 2);
                textView2.setText(qf3.J(file.length()) + "  •  " + dateTimeInstance.format(new Date(file.lastModified())));
            } else {
                textView2.setText(userAssetActivity.getString(R.string.msg_file_not_found));
            }
            if (yg0.a(((AssetUrlItem) pair.getSecond()).getLocked(), Boolean.TRUE)) {
                linearLayout.setVisibility(8);
            } else {
                linearLayout.setVisibility(yg0.a(((AssetUrlItem) pair.getSecond()).getUrl(), "file") ? 8 : 0);
            }
            linearLayout.setOnClickListener(new tb1(i4, userAssetActivity, pair));
            gh0Var.e.setOnClickListener(new p61(userAssetActivity, file, pair, 1));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder m(ViewGroup viewGroup, int i) {
            viewGroup.getClass();
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recycler_user_asset, viewGroup, false);
            int i2 = R.id.asset_name;
            TextView textView = (TextView) l02.n(R.id.asset_name, viewInflate);
            if (textView != null) {
                i2 = R.id.asset_properties;
                TextView textView2 = (TextView) l02.n(R.id.asset_properties, viewInflate);
                if (textView2 != null) {
                    i2 = R.id.layout_edit;
                    LinearLayout linearLayout = (LinearLayout) l02.n(R.id.layout_edit, viewInflate);
                    if (linearLayout != null) {
                        i2 = R.id.layout_remove;
                        LinearLayout linearLayout2 = (LinearLayout) l02.n(R.id.layout_remove, viewInflate);
                        if (linearLayout2 != null) {
                            return new UserAssetViewHolder(new gh0((LinearLayout) viewInflate, textView, textView2, linearLayout, linearLayout2));
                        }
                    }
                }
            }
            io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
            return null;
        }
    }

     
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/v2ray/ang/ui/UserAssetActivity$UserAssetViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lgh0;", "itemUserAssetBinding", "<init>", "(Lgh0;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UserAssetViewHolder extends RecyclerView.ViewHolder {
        public final gh0 u;

         
        public UserAssetViewHolder(gh0 gh0Var) {
            super(gh0Var.a);
            gh0Var.getClass();
            this.u = gh0Var;
        }
    }

    public UserAssetActivity() {
        final int i = 0;
        this.c = kotlin.c.b(new Function0(this) { // from class: ll1
            public final   UserAssetActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                UserAssetActivity userAssetActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = UserAssetActivity.j;
                        View viewInflate = userAssetActivity.getLayoutInflater().inflate(R.layout.activity_user_asset, (ViewGroup) null, false);
                        int i4 = R.id.layout_geo_files_sources;
                        LinearLayout linearLayout = (LinearLayout) l02.n(R.id.layout_geo_files_sources, viewInflate);
                        if (linearLayout != null) {
                            i4 = R.id.main_content;
                            if (((NestedScrollView) l02.n(R.id.main_content, viewInflate)) != null) {
                                i4 = R.id.pb_waiting;
                                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) l02.n(R.id.pb_waiting, viewInflate);
                                if (linearProgressIndicator != null) {
                                    i4 = R.id.recycler_view;
                                    RecyclerView recyclerView = (RecyclerView) l02.n(R.id.recycler_view, viewInflate);
                                    if (recyclerView != null) {
                                        i4 = R.id.tv_geo_files_sources_summary;
                                        TextView textView = (TextView) l02.n(R.id.tv_geo_files_sources_summary, viewInflate);
                                        if (textView != null) {
                                            return new l3((RelativeLayout) viewInflate, linearLayout, linearProgressIndicator, recyclerView, textView);
                                        }
                                    }
                                }
                            }
                        }
                        io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                        return null;
                    default:
                        int i5 = UserAssetActivity.j;
                        Regex regex = ul1.a;
                        return new File(ul1.E(userAssetActivity));
                }
            }
        });
        final int i2 = 1;
        this.d = kotlin.c.b(new Function0(this) { // from class: ll1
            public final   UserAssetActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                UserAssetActivity userAssetActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = UserAssetActivity.j;
                        View viewInflate = userAssetActivity.getLayoutInflater().inflate(R.layout.activity_user_asset, (ViewGroup) null, false);
                        int i4 = R.id.layout_geo_files_sources;
                        LinearLayout linearLayout = (LinearLayout) l02.n(R.id.layout_geo_files_sources, viewInflate);
                        if (linearLayout != null) {
                            i4 = R.id.main_content;
                            if (((NestedScrollView) l02.n(R.id.main_content, viewInflate)) != null) {
                                i4 = R.id.pb_waiting;
                                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) l02.n(R.id.pb_waiting, viewInflate);
                                if (linearProgressIndicator != null) {
                                    i4 = R.id.recycler_view;
                                    RecyclerView recyclerView = (RecyclerView) l02.n(R.id.recycler_view, viewInflate);
                                    if (recyclerView != null) {
                                        i4 = R.id.tv_geo_files_sources_summary;
                                        TextView textView = (TextView) l02.n(R.id.tv_geo_files_sources_summary, viewInflate);
                                        if (textView != null) {
                                            return new l3((RelativeLayout) viewInflate, linearLayout, linearProgressIndicator, recyclerView, textView);
                                        }
                                    }
                                }
                            }
                        }
                        io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                        return null;
                    default:
                        int i5 = UserAssetActivity.j;
                        Regex regex = ul1.a;
                        return new File(ul1.E(userAssetActivity));
                }
            }
        });
        this.f = registerForActivityResult(new ActivityResultContracts$RequestPermission(), new ActivityResultCallback(this) { // from class: ml1
            public final   UserAssetActivity b;

            {
                this.b = this;
            }

             
             
            @Override // androidx.activity.result.ActivityResultCallback
             
            public final void onActivityResult(java.lang.Object r14) {
                 
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ml1.onActivityResult(java.lang.Object):void");
            }
        });
        this.g = registerForActivityResult(new ActivityResultContracts$RequestPermission(), new ActivityResultCallback(this) { // from class: ml1
            public final   UserAssetActivity b;

            {
                this.b = this;
            }

             
             
            @Override // androidx.activity.result.ActivityResultCallback
             
            public final void onActivityResult(java.lang.Object r14) {
                 
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ml1.onActivityResult(java.lang.Object):void");
            }
        });
        final int i3 = 2;
        this.h = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback(this) { // from class: ml1
            public final   UserAssetActivity b;

            {
                this.b = this;
            }

             
             
            @Override // androidx.activity.result.ActivityResultCallback
             
            public final void onActivityResult(java.lang.Object r14) {
                 
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ml1.onActivityResult(java.lang.Object):void");
            }
        });
        final int i4 = 3;
        this.i = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback(this) { // from class: ml1
            public final   UserAssetActivity b;

            {
                this.b = this;
            }

             
             
            @Override // androidx.activity.result.ActivityResultCallback
             
            public final void onActivityResult(java.lang.Object r14) {
                 
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ml1.onActivityResult(java.lang.Object):void");
            }
        });
    }

    public final ArrayList h(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList();
        for (String str : this.e) {
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (yg0.a(((AssetUrlItem) ((Pair) it.next()).getSecond()).getRemarks(), str)) {
                        break;
                    }
                }
                arrayList2.add(str);
            } else {
                arrayList2.add(str);
            }
        }
        for (String str2 : arrayList2) {
            Regex regex = ul1.a;
            String strO = ul1.o();
            String strD = zq0.z().d("pref_geo_files_sources");
            if (strD == null) {
                AppConfig.a.getClass();
                strD = (String) kotlin.collections.c.r(AppConfig.j);
            }
            arrayList.add(new Pair(strO, new AssetUrlItem(str2, qf3.d(String.format("https://github.com/%s/releases/latest/download", Arrays.copyOf(new Object[]{strD}, 1)), str2), 0L, 0L, Boolean.TRUE, 12, null)));
        }
        return kotlin.collections.c.C(list, arrayList);
    }

    public final String i(Uri uri) throws IOException {
        File file = (File) this.d.getValue();
        String strL = l(uri);
        if (strL == null) {
            strL = uri.toString();
            strL.getClass();
        }
        File file2 = new File(file, strL);
        InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(uri);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            if (inputStreamOpenInputStream != null) {
                try {
                    mu.h(inputStreamOpenInputStream, fileOutputStream);
                } finally {
                }
            }
            qf3.O(this);
            m();
            fileOutputStream.close();
            if3.c(inputStreamOpenInputStream, null);
            String path = file2.getPath();
            path.getClass();
            return path;
        } finally {
        }
    }

    public final boolean j(AssetUrlItem assetUrlItem, int i) {
        Lazy lazy = this.d;
        File file = new File((File) lazy.getValue(), hz.t(assetUrlItem.getRemarks(), "_temp"));
        File file2 = new File((File) lazy.getValue(), assetUrlItem.getRemarks());
        assetUrlItem.getRemarks();
        assetUrlItem.getUrl();
        HttpURLConnection httpURLConnectionA = i60.a(assetUrlItem.getUrl(), i, 15000, 15000, true);
        try {
            if (httpURLConnectionA == null) {
                return false;
            }
            InputStream inputStream = httpURLConnectionA.getInputStream();
            if (httpURLConnectionA.getResponseCode() == 200) {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    inputStream.getClass();
                    mu.h(inputStream, fileOutputStream);
                    fileOutputStream.close();
                    file.renameTo(file2);
                } finally {
                }
            }
            return true;
        } catch (Exception unused) {
            assetUrlItem.getRemarks();
            return false;
        } finally {
            httpURLConnectionA.disconnect();
        }
    }

    public final l3 k() {
        return (l3) this.c.getValue();
    }

    public final String l(Uri uri) {
        try {
            Cursor cursorQuery = getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery != null) {
                String string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name")) : null;
                cursorQuery.close();
                return string;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final void m() {
        RecyclerView.Adapter adapter = k().d.getAdapter();
        if (adapter != null) {
            adapter.f();
        }
    }

    @Override // com.v2ray.ang.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(k().a);
        setTitle(getString(R.string.title_user_asset_setting));
        k().d.setHasFixedSize(true);
        k().d.setLayoutManager(new LinearLayoutManager(this));
        BaseActivity.g(this, k().d, this);
        k().d.setAdapter(new UserAssetAdapter());
        TextView textView = k().e;
        String strD = zq0.z().d("pref_geo_files_sources");
        if (strD == null) {
            AppConfig.a.getClass();
            strD = (String) kotlin.collections.c.r(AppConfig.j);
        }
        textView.setText(strD);
        k().b.setOnClickListener(new mn(this, 13));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.menu_asset, menu);
        return super.onCreateOptionsMenu(menu);
    }

     
     
     
    @Override // com.v2ray.ang.ui.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        switch (menuItem.getItemId()) {
            case R.id.add_file  :
                this.f.a(Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_IMAGES" : "android.permission.READ_EXTERNAL_STORAGE");
                return true;
            case R.id.add_qrcode  :
                this.g.a("android.permission.CAMERA");
                return true;
            case R.id.add_url  :
                startActivity(new Intent(this, (Class<?>) UserAssetUrlActivity.class));
                return true;
            case R.id.download_file  :
                k().c.d();
                qf3.K(this, R.string.msg_downloading_content);
                Regex regex = ul1.a;
                Lazy lazy = zq0.a;
                int iY = ul1.y(Integer.parseInt("10808"), zq0.z().d("pref_socks_port"));
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                List B = zq0.b();
                ref$ObjectRef.element = B;
                ref$ObjectRef.element = h(B);
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplA = m.a(this);
                lv lvVar = oy.a;
                kotlinx.coroutines.c.d(lifecycleCoroutineScopeImplA, hv.c, null, new UserAssetActivity$downloadGeoFiles$1(ref$ObjectRef, this, iY, ref$IntRef, null), 2);
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        m();
    }
}
