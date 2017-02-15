package wlgbsj.myas_allstudy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import wlgbsj.myas_allstudy.AlertDialog.AlertDialogTest;
import wlgbsj.myas_allstudy.AlertDialog.DialogTheme;
import wlgbsj.myas_allstudy.AlertDialog.ProgressDialogTest;
import wlgbsj.myas_allstudy.PopupWindow.PopupWindowTest;
import wlgbsj.myas_allstudy.notification.NotificationTestActivity;

public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*// 去掉窗口标题
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // 全屏显示
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // 获取窗口管理器

        WindowManager windowManager = getWindowManager();
        Display display = windowManager.getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        // 获得屏幕宽和高
        display.getMetrics(metrics);*/

        setContentView(R.layout.activity_main);
        // findViewById(R.id.NotificationTest).setOnClickListener(this);

        if (savedInstanceState != null) {
            String date = savedInstanceState.getString("str");
            Log.d(TAG, "onCreate: "+ date);
        }
    }

    @Override
    protected void onResume() {

        super.onResume();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.a11:

                break;
            case R.id.a12:

                break;
            default:
        }
        return true;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String str = "122";
        outState.putString("str", str);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.NotificationTest:
                startActivity(new Intent(MainActivity.this, NotificationTestActivity.class));
                break;
            case R.id.AlertDialogTest:
                startActivity(new Intent(MainActivity.this, AlertDialogTest.class));
                break;
            case R.id.DialogTheme:
                startActivity(new Intent(MainActivity.this, DialogTheme.class));
                break;
            case R.id.PopupWindowTest:
                startActivity(new Intent(MainActivity.this, PopupWindowTest.class));
                break;
            case R.id.ProgressDialogTest:
                startActivity(new Intent(MainActivity.this, ProgressDialogTest.class));
                break;


        }
    }
}
