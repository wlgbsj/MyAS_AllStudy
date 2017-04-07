package wlgbsj.myas_allstudy.AlertDialog;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;

public class AlarmService extends Service {
    public AlarmService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                //执行耗时的逻辑型操作
            }
        }).start();
        AlarmManager  alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        int anHour = 60*60*1000;
        long tiggerAtTime = SystemClock.elapsedRealtime() +anHour;
        Intent i = new Intent(this,AlarmService.class);
        PendingIntent pendingIntent = PendingIntent.getService(this,0,i,0);
        alarmManager.set(AlarmManager.ELAPSED_REALTIME,tiggerAtTime,pendingIntent);
        return super.onStartCommand(intent, flags, startId);
    }
}
