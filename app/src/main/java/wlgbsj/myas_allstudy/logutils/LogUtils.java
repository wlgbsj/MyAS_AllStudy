package wlgbsj.myas_allstudy.logutils;

import android.util.Log;

/**
 * Created by att on 2017/2/22.
 */

public class LogUtils {
    private static final int VERBOSE = 1;
    private static final int DEBUG = 2;
    private static final int INFO = 3;
    private static final int WARN = 4;
    private static final int ERROR = 5;
    private static final int NOTHING = 6;
    private static final int LEVER = VERBOSE;   //修改LEVER的值  可以控制 测试版本上线版本 日志是否打印

    public static void v(String tag, String msg) {
        if (LEVER <= VERBOSE) {
            Log.v(tag, msg);
        }
    }
    public static void d(String tag, String msg) {
        if (LEVER <= DEBUG) {
            Log.d(tag, msg);
        }
    }
    public static void i(String tag, String msg) {
        if (LEVER <= INFO) {
            Log.i(tag, msg);
        }
    }
    public static void w(String tag, String msg) {
        if (LEVER <= WARN) {
            Log.w(tag, msg);
        }
    }
    public static void e(String tag, String msg) {
        if (LEVER <= ERROR) {
            Log.e(tag, msg);
        }
    }
}
