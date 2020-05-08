package io.flutter.plugins.firebasemessaging;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import static io.flutter.plugins.firebasemessaging.FlutterFirebaseMessagingService.ACTION_REMOTE_MESSAGE;
import static io.flutter.plugins.firebasemessaging.FlutterFirebaseMessagingService.EXTRA_REMOTE_MESSAGE;

public class NotificationReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent intent1 = new Intent(ACTION_REMOTE_MESSAGE);
        intent1.putExtra(EXTRA_REMOTE_MESSAGE, intent.getParcelableExtra(FlutterFirebaseMessagingService.EXTRA_REMOTE_MESSAGE));
        intent1.setComponent(new ComponentName("instasalam.org", "instasalam.org.services.NamazTrackingNotification"));
        context.sendBroadcast(intent1);
    }
}

