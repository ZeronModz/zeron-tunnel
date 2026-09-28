package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import dev.zeron.tunnel.R;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class lx0 implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
    public final Preference a;

    public lx0(Preference preference) {
        this.a = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.a;
        CharSequence charSequenceG = preference.g();
        if (!preference.C || TextUtils.isEmpty(charSequenceG)) {
            return;
        }
        contextMenu.setHeaderTitle(charSequenceG);
        contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.a;
        Context context = preference.a;
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        CharSequence charSequenceG = preference.g();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceG));
        Toast.makeText(context, context.getString(R.string.preference_copied, charSequenceG), 0).show();
        return true;
    }
}
