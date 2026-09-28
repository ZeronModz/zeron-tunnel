package defpackage;

import androidx.webkit.internal.ConditionallySupportedFeature;
import java.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.chromium.support_lib_boundary.util.Features;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class vp1 {
    public static final p5 a;
    public static final p5 b;
    public static final p5 c;
    public static final p5 d;
    public static final p5 e;
    public static final p5 f;
    public static final p5 g;
    public static final p5 h;
    public static final p5 i;
    public static final p5 j;
    public static final p5 k;
    public static final up1 l;
    public static final p5 m;

    static {
        new p5(Features.VISUAL_STATE_CALLBACK, Features.VISUAL_STATE_CALLBACK, 0);
        new p5(Features.OFF_SCREEN_PRERASTER, Features.OFF_SCREEN_PRERASTER, 0);
        new p5(Features.SAFE_BROWSING_ENABLE, Features.SAFE_BROWSING_ENABLE, 3);
        new p5(Features.DISABLED_ACTION_MODE_MENU_ITEMS, Features.DISABLED_ACTION_MODE_MENU_ITEMS, 1);
        new p5(Features.START_SAFE_BROWSING, Features.START_SAFE_BROWSING, 4);
        new p5(Features.SAFE_BROWSING_WHITELIST, Features.SAFE_BROWSING_WHITELIST, 4);
        new p5(Features.SAFE_BROWSING_WHITELIST, Features.SAFE_BROWSING_ALLOWLIST, 4);
        new p5(Features.SAFE_BROWSING_ALLOWLIST, Features.SAFE_BROWSING_WHITELIST, 4);
        new p5(Features.SAFE_BROWSING_ALLOWLIST, Features.SAFE_BROWSING_ALLOWLIST, 4);
        new p5(Features.SAFE_BROWSING_PRIVACY_POLICY_URL, Features.SAFE_BROWSING_PRIVACY_POLICY_URL, 4);
        a = new p5(Features.SERVICE_WORKER_BASIC_USAGE, Features.SERVICE_WORKER_BASIC_USAGE, 1);
        new p5(Features.SERVICE_WORKER_CACHE_MODE, Features.SERVICE_WORKER_CACHE_MODE, 1);
        new p5(Features.SERVICE_WORKER_CONTENT_ACCESS, Features.SERVICE_WORKER_CONTENT_ACCESS, 1);
        new p5(Features.SERVICE_WORKER_FILE_ACCESS, Features.SERVICE_WORKER_FILE_ACCESS, 1);
        new p5(Features.SERVICE_WORKER_BLOCK_NETWORK_LOADS, Features.SERVICE_WORKER_BLOCK_NETWORK_LOADS, 1);
        new p5(Features.SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST, Features.SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST, 1);
        new p5(Features.RECEIVE_WEB_RESOURCE_ERROR, Features.RECEIVE_WEB_RESOURCE_ERROR, 0);
        new p5(Features.RECEIVE_HTTP_ERROR, Features.RECEIVE_HTTP_ERROR, 0);
        new p5(Features.SHOULD_OVERRIDE_WITH_REDIRECTS, Features.SHOULD_OVERRIDE_WITH_REDIRECTS, 1);
        new p5(Features.SAFE_BROWSING_HIT, Features.SAFE_BROWSING_HIT, 4);
        new p5(Features.WEB_RESOURCE_REQUEST_IS_REDIRECT, Features.WEB_RESOURCE_REQUEST_IS_REDIRECT, 1);
        b = new p5(Features.WEB_RESOURCE_ERROR_GET_DESCRIPTION, Features.WEB_RESOURCE_ERROR_GET_DESCRIPTION, 0);
        c = new p5(Features.WEB_RESOURCE_ERROR_GET_CODE, Features.WEB_RESOURCE_ERROR_GET_CODE, 0);
        new p5(Features.SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY, Features.SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY, 4);
        new p5(Features.SAFE_BROWSING_RESPONSE_PROCEED, Features.SAFE_BROWSING_RESPONSE_PROCEED, 4);
        d = new p5(Features.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL, Features.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL, 4);
        new p5(Features.WEB_MESSAGE_PORT_POST_MESSAGE, Features.WEB_MESSAGE_PORT_POST_MESSAGE, 0);
        new p5(Features.WEB_MESSAGE_PORT_CLOSE, Features.WEB_MESSAGE_PORT_CLOSE, 0);
        e = new p5(Features.WEB_MESSAGE_ARRAY_BUFFER, Features.WEB_MESSAGE_ARRAY_BUFFER, 2);
        new p5(Features.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK, Features.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK, 0);
        new p5(Features.CREATE_WEB_MESSAGE_CHANNEL, Features.CREATE_WEB_MESSAGE_CHANNEL, 0);
        new p5(Features.POST_WEB_MESSAGE, Features.POST_WEB_MESSAGE, 0);
        new p5(Features.WEB_MESSAGE_CALLBACK_ON_MESSAGE, Features.WEB_MESSAGE_CALLBACK_ON_MESSAGE, 0);
        f = new p5(Features.GET_WEB_VIEW_CLIENT, Features.GET_WEB_VIEW_CLIENT, 3);
        new p5(Features.GET_WEB_CHROME_CLIENT, Features.GET_WEB_CHROME_CLIENT, 3);
        new p5(Features.GET_WEB_VIEW_RENDERER, Features.GET_WEB_VIEW_RENDERER, 6);
        new p5(Features.WEB_VIEW_RENDERER_TERMINATE, Features.WEB_VIEW_RENDERER_TERMINATE, 6);
        g = new p5(Features.TRACING_CONTROLLER_BASIC_USAGE, Features.TRACING_CONTROLLER_BASIC_USAGE, 5);
        new ca1();
        new ca1();
        new p5(Features.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE, Features.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE, 6);
        new tp1();
        new p5("PROXY_OVERRIDE", Features.PROXY_OVERRIDE, 2);
        h = new p5("MULTI_PROCESS", Features.MULTI_PROCESS_QUERY, 2);
        new p5(Features.FORCE_DARK, Features.FORCE_DARK, 6);
        new p5("FORCE_DARK_STRATEGY", Features.FORCE_DARK_BEHAVIOR, 2);
        i = new p5(Features.WEB_MESSAGE_LISTENER, Features.WEB_MESSAGE_LISTENER, 2);
        j = new p5("DOCUMENT_START_SCRIPT", Features.DOCUMENT_START_SCRIPT, 2);
        new p5(Features.PROXY_OVERRIDE_REVERSE_BYPASS, Features.PROXY_OVERRIDE_REVERSE_BYPASS, 2);
        k = new p5(Features.GET_VARIATIONS_HEADER, Features.GET_VARIATIONS_HEADER, 2);
        new p5(Features.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY, Features.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY, 2);
        new p5(Features.GET_COOKIE_INFO, Features.GET_COOKIE_INFO, 2);
        new p5(Features.REQUESTED_WITH_HEADER_ALLOW_LIST, Features.REQUESTED_WITH_HEADER_ALLOW_LIST, 2);
        new p5(Features.USER_AGENT_METADATA, Features.USER_AGENT_METADATA, 2);
        l = new up1(Features.MULTI_PROFILE, Features.MULTI_PROFILE, 2);
        new p5("ATTRIBUTION_REGISTRATION_BEHAVIOR", Features.ATTRIBUTION_BEHAVIOR, 2);
        new p5("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", Features.WEBVIEW_MEDIA_INTEGRITY_API_STATUS, 2);
        m = new p5(Features.MUTE_AUDIO, Features.MUTE_AUDIO, 2);
        new p5(Features.WEB_AUTHENTICATION, Features.WEB_AUTHENTICATION, 2);
        new p5("SPECULATIVE_LOADING_STATUS", Features.SPECULATIVE_LOADING, 2);
        new p5(Features.BACK_FORWARD_CACHE, Features.BACK_FORWARD_CACHE, 2);
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean b(String str) {
        Set<ConditionallySupportedFeature> setUnmodifiableSet = DesugarCollections.unmodifiableSet(q5.c);
        HashSet hashSet = new HashSet();
        for (ConditionallySupportedFeature conditionallySupportedFeature : setUnmodifiableSet) {
            if (conditionallySupportedFeature.getPublicFeatureName().equals(str)) {
                hashSet.add(conditionallySupportedFeature);
            }
        }
        if (hashSet.isEmpty()) {
            s31.f("Unknown feature ".concat(str));
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((ConditionallySupportedFeature) it.next()).isSupported()) {
                return true;
            }
        }
        return false;
    }
}
