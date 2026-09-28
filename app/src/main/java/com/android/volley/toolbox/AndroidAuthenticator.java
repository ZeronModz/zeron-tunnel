package com.android.volley.toolbox;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.volley.AuthFailureError;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class AndroidAuthenticator implements Authenticator {
    public final AccountManager a;
    public final Account b;
    public final String c;
    public final boolean d;

    public AndroidAuthenticator(Context context, Account account, String str, boolean z) {
        this.a = AccountManager.get(context);
        this.b = account;
        this.c = str;
        this.d = z;
    }

    @Override // com.android.volley.toolbox.Authenticator
    public final String getAuthToken() throws AuthFailureError {
        String string;
        AccountManagerFuture<Bundle> authToken = this.a.getAuthToken(this.b, this.c, this.d, null, null);
        try {
            Bundle result = authToken.getResult();
            if (!authToken.isDone() || authToken.isCancelled()) {
                string = null;
            } else {
                if (result.containsKey("intent")) {
                    throw new AuthFailureError((Intent) result.getParcelable("intent"));
                }
                string = result.getString("authtoken");
            }
            if (string != null) {
                return string;
            }
            throw new AuthFailureError("Got null auth token for type: " + this.c);
        } catch (Exception e) {
            throw new AuthFailureError("Error while retrieving auth token", e);
        }
    }

    @Override // com.android.volley.toolbox.Authenticator
    public final void invalidateAuthToken(String str) {
        this.a.invalidateAuthToken(this.b.type, str);
    }

    public AndroidAuthenticator(Context context, Account account, String str) {
        this(context, account, str, false);
    }
}
