package com.mundodedafne.apps.serviceafterdevice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BroadcastManager extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if(action.equalsIgnoreCase("BOOT_ACTION")){
            //The application has been booted, you can do whatever you want
        }
    }
}
