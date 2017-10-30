package com.notificationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    NotificationUtil util;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        util = new NotificationUtil(MainActivity.this);
    }

    int i = 0;

    public void showNotification(View view) {
        try {
            if (i == 0) util.postBarNotification();
            else if (i == 1) util.postDownloadNotification();
            else if (i == 2) util.postBigTextNotification();
            else if (i == 3) util.postBigPictureNotification();
            else if (i == 4) util.postInboxNotification();
            else if (i == 5) util.postCustomNotification();
            else {
                util.cancelAllNotification();
                i = -1;
            }
            i++;
        } catch (Exception e) {
        }
    }
}
