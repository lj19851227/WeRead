package cn.read.di.module;

import android.app.Activity;
import android.content.Context;


import cn.read.di.scope.ContextLife;
import cn.read.di.scope.PerActivity;
import dagger.Module;
import dagger.Provides;

/**
 * Created by lw on 2017/1/19.
 */
@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @PerActivity
    @ContextLife("Activity")
    public Context ProvideActivityContext() {
        return mActivity;
    }

    @Provides
    @PerActivity
    public Activity ProvideActivity() {
        return mActivity;
    }
}
