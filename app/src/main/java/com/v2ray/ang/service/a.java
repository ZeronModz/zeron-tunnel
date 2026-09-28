package com.v2ray.ang.service;

import android.content.Intent;
import android.os.CountDownTimer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends CountDownTimer {
    public final /* synthetic */ CountdownService a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j, CountdownService countdownService) {
        super(j, 1000L);
        this.a = countdownService;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.a.sendBroadcast(new Intent("COUNTDOWN_FINISH"));
        CountdownService.b.getClass();
        CountdownService.c = false;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        Intent intent = new Intent("COUNTDOWN_UPDATE");
        intent.putExtra("millisLeft", j);
        this.a.sendBroadcast(intent);
    }
}
