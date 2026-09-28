package com.sandok.tunnel.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import defpackage.p60;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ProfileManager {
    private static final String LAST_CONNECTED_PROFILE = "lastConnectedProfile";
    private static final String PREFS_NAME = "VPNList";
    private static ProfileManager instance;
    private static VpnProfile mLastConnectedVpn;
    private static VpnProfile tmpprofile;
    private HashMap<String, VpnProfile> profiles = new HashMap<>();

    private ProfileManager() {
    }

    private static void checkInstance(Context context) {
        if (instance == null) {
            ProfileManager profileManager = new ProfileManager();
            instance = profileManager;
            profileManager.loadVPNList(context);
        }
    }

    public static VpnProfile get(Context context, String str, int i, int i2) {
        checkInstance(context);
        VpnProfile vpnProfile = get(str);
        int i3 = 0;
        while (true) {
            if (vpnProfile != null && vpnProfile.mVersion >= i) {
                break;
            }
            int i4 = i3 + 1;
            if (i3 >= i2) {
                break;
            }
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            instance.loadVPNList(context);
            vpnProfile = get(str);
            i3 = i4;
        }
        return vpnProfile;
    }

    public static VpnProfile getAlwaysOnVPN(Context context) {
        checkInstance(context);
        return get(PreferenceManager.getDefaultSharedPreferences(context).getString("alwaysOnVpn", null));
    }

    public static synchronized ProfileManager getInstance(Context context) {
        checkInstance(context);
        return instance;
    }

    public static VpnProfile getLastConnectedProfile(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString(LAST_CONNECTED_PROFILE, null);
        if (string != null) {
            return get(context, string);
        }
        return null;
    }

    public static VpnProfile getLastConnectedVpn() {
        return mLastConnectedVpn;
    }

    public static boolean isTempProfile() {
        return mLastConnectedVpn == tmpprofile;
    }

    private void loadVPNList(Context context) {
        this.profiles = new HashMap<>();
        Set<String> stringSet = context.getSharedPreferences(PREFS_NAME, 0).getStringSet("vpnlist", null);
        if (stringSet == null) {
            stringSet = new HashSet<>();
        }
        Iterator<String> it = stringSet.iterator();
        while (it.hasNext()) {
            try {
                VpnProfile vpnProfile = (VpnProfile) new ObjectInputStream(context.openFileInput(it.next() + ".vp")).readObject();
                if (vpnProfile != null && vpnProfile.mName != null && vpnProfile.getUUID() != null) {
                    vpnProfile.upgradeProfile();
                    this.profiles.put(vpnProfile.getUUID().toString(), vpnProfile);
                }
            } catch (IOException | ClassNotFoundException unused) {
            }
        }
    }

    private void saveProfile(Context context, VpnProfile vpnProfile, boolean z) {
        if (z) {
            vpnProfile.mVersion++;
        }
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(context.openFileOutput(vpnProfile.getUUID().toString() + ".vp", 0));
            objectOutputStream.writeObject(vpnProfile);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            p60.l(e);
        }
    }

    public static void setConnectedVpnProfile(Context context, VpnProfile vpnProfile) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.putString(LAST_CONNECTED_PROFILE, vpnProfile.getUUIDString());
        editorEdit.apply();
        mLastConnectedVpn = vpnProfile;
    }

    public static void setConntectedVpnProfileDisconnected(Context context) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.putString(LAST_CONNECTED_PROFILE, null);
        editorEdit.apply();
    }

    public static void setTemporaryProfile(VpnProfile vpnProfile) {
        tmpprofile = vpnProfile;
    }

    public static void updateLRU(Context context, VpnProfile vpnProfile) {
        vpnProfile.mLastUsed = System.currentTimeMillis();
        getInstance(context).saveProfile(context, vpnProfile, false);
    }

    public void addProfile(VpnProfile vpnProfile) {
        this.profiles.put(vpnProfile.getUUID().toString(), vpnProfile);
    }

    public VpnProfile getProfileByName(String str) {
        for (VpnProfile vpnProfile : this.profiles.values()) {
            if (vpnProfile.getName().equals(str)) {
                return vpnProfile;
            }
        }
        return null;
    }

    public Collection<VpnProfile> getProfiles() {
        return this.profiles.values();
    }

    public void removeProfile(Context context, VpnProfile vpnProfile) {
        String string = vpnProfile.getUUID().toString();
        this.profiles.remove(string);
        saveProfileList(context);
        context.deleteFile(string + ".vp");
        if (mLastConnectedVpn == vpnProfile) {
            mLastConnectedVpn = null;
        }
    }

    public void saveProfileList(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putStringSet("vpnlist", this.profiles.keySet());
        editorEdit.putInt("counter", sharedPreferences.getInt("counter", 0) + 1);
        editorEdit.apply();
    }

    public static VpnProfile get(Context context, String str) {
        return get(context, str, 0, 10);
    }

    private static VpnProfile get(String str) {
        VpnProfile vpnProfile = tmpprofile;
        if (vpnProfile != null && vpnProfile.getUUIDString().equals(str)) {
            return tmpprofile;
        }
        ProfileManager profileManager = instance;
        if (profileManager == null) {
            return null;
        }
        return profileManager.profiles.get(str);
    }

    public void saveProfile(Context context, VpnProfile vpnProfile) {
        saveProfile(context, vpnProfile, true);
    }
}
