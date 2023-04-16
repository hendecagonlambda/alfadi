package org.hendecagonlambda.level;

import android.app.Application;

import org.hendecagonlambda.level.util.PreferenceHelper;

public class LevelApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        PreferenceHelper.initPrefs(this);
    }
}
