package com.example.notificationtest;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sendNotice = (Button) findViewById(R.id.send_notice);
        sendNotice.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.send_notice:
                Intent intent = new Intent(this, NotificationActivity.class);
                PendingIntent pi = PendingIntent.getActivity(this, 0, intent, 0);
                NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                Notification notification = new NotificationCompat.Builder(this)
                        .setContentTitle("This is content title")
                        .setContentText("This is content text")
                        .setWhen(System.currentTimeMillis())  //通知的时间
                        .setSmallIcon(R.mipmap.ic_launcher)        //通知的小图标
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))//通知的大图标
                        .setContentIntent(pi)  // 通知的跳转intent
                 //       .setAutoCancel(true)//表明点击通知会自动取消
                //        .setSound(Uri.fromFile(new File("/system/media/audio/ringtones/Luna.ogg")))  //音频属性
                        .setVibrate(new long[]{0, 1000, 1000, 1000})    // 震动属性  静止时长 震动时长 静止时长。。。。 这个表示通知来 立马震动1s再停止1s然后再震动1s  还需要申请震动的权限
                        .setLights(Color.GREEN, 100000, 10000)  //颜色  亮起起的时长 暗去的时长
                 //       .setDefaults(NotificationCompat.DEFAULT_ALL) //默认的方式
                        .setStyle(new NotificationCompat.BigTextStyle().bigText("Learn how to build notifications, send and sync data, and use voice actions. Get the official Android IDE and developer tools to build apps for Android."))
                        .setStyle(new NotificationCompat.BigPictureStyle().bigPicture(BitmapFactory.decodeResource(getResources(), R.drawable.big_image)))//设置长文本或者图片。。。
                       .setPriority(NotificationCompat.PRIORITY_MAX)   //设置通知的重要程度
                        .build();
                manager.notify(1, notification);

               // manager.cancel(1);//这样是一种过后取消通知的方法
                break;
            default:
                break;
        }
    }

}
