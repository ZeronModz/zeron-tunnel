package com.v2ray.ang.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.recyclerview.widget.RecyclerView;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.helper.CustomDividerItemDecoration;
import com.v2ray.ang.util.MyContextWrapper;
import defpackage.l71;
import defpackage.n8;
import defpackage.u7;
import defpackage.ul1;
import defpackage.xu;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0002\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/v2ray/ang/ui/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/view/View;", "view", "Lmk1;", "setContentView", "(Landroid/view/View;)V", "Companion", "EpkiPost", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class BaseActivity extends AppCompatActivity {
    public static final Companion b = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/v2ray/ang/ui/BaseActivity$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bd\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/v2ray/ang/ui/BaseActivity$EpkiPost;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "str", "Lmk1;", "post_dispatch", "(Ljava/lang/String;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface EpkiPost {
        void post_dispatch(String str);
    }

    public static void g(BaseActivity baseActivity, RecyclerView recyclerView, BaseActivity baseActivity2) {
        Drawable drawable = baseActivity2.getDrawable(R.drawable.custom_divider);
        if (drawable != null) {
            recyclerView.h(new CustomDividerItemDecoration(drawable, 1));
        } else {
            u7.r("Drawable resource not found");
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        MyContextWrapper.Companion companion = MyContextWrapper.a;
        if (context == null) {
            return;
        }
        Locale localeB = l71.b();
        companion.getClass();
        super.attachBaseContext(MyContextWrapper.Companion.a(context, localeB));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        androidx.activity.c.a(this);
        super.onCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.m(true);
        }
        Regex regex = ul1.a;
        if ((getResources().getConfiguration().uiMode & 48) != 16) {
            return;
        }
        new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView());
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getC().c();
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        n8.c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        n8.c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        n8.c(this);
    }
}
