package com.notificationtest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * 类描述：
 * 创建人：swallow.li
 * 创建时间：
 * Email: swallow.li@kemai.cn
 * 修改备注：
 */
public class buttonBrodcast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String str = intent.getStringExtra("btn");
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }
}
