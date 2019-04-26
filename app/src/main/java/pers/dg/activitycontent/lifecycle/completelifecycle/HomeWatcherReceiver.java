package pers.dg.activitycontent.lifecycle.completelifecycle;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class HomeWatcherReceiver extends BroadcastReceiver {

    private static final String LOG_TAG = " TAG HomeReceiver";

    private static final String SYSTEM_DIALOG_REASON_KEY = "reason";
    //action内的某些reason
    private static final String SYSTEM_DIALOG_REASON_HOME_KEY = "homekey";//按下home键

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();

        if (action.equals(Intent.ACTION_CLOSE_SYSTEM_DIALOGS)) {

            String reason = intent.getStringExtra(SYSTEM_DIALOG_REASON_KEY);


            if (SYSTEM_DIALOG_REASON_HOME_KEY.equals(reason)) { // 短按Home键
                Log.i(LOG_TAG, "homekey");
            }
        }
    }
}
