package com.example.litepaltest;

import android.app.Application;
import android.content.Context;

import org.litepal.exceptions.GlobalException;

/**
 * Created by wlgbsj on 2017/5/9  9:58.
 */

public class LitePalApplication extends Application {

    /**
     * Global application context.
     */
    private static Context sContext;

    /**
     * Construct of LitePalApplication. Initialize application context.
     */
    public LitePalApplication() {
        sContext = this;
    }

    /**
     * Initialize to make LitePal ready to work. If you didn't configure LitePalApplication
     * in the AndroidManifest.xml, make sure you call this method as soon as possible. In
     * Application's onCreate() method will be fine.
     *
     * @param context
     * 		Application context.
     */
    public static void initialize(Context context) {
        sContext = context;
    }

    /**
     * Get the global application context.
     *
     * @return Application context.
     * @throws org.litepal.exceptions.GlobalException
     */
    public static Context getContext() {
        if (sContext == null) {
            throw new GlobalException(GlobalException.APPLICATION_CONTEXT_IS_NULL);
        }
        return sContext;
    }

}
