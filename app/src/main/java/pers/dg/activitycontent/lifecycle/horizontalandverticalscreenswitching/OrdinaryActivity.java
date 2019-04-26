package pers.dg.activitycontent.lifecycle.horizontalandverticalscreenswitching;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import pers.dg.activitycontent.BaseActivity;
import pers.dg.activitycontent.R;
import pers.dg.activitycontent.lifecycle.completelifecycle.CompleteLifeCycleActivity;

/**
 * 普通横竖屏切换（不进行任何设置）时的生命周期
 * 创建
 * onCreate --》onStart --》onResume
 * 横竖屏切换
 * onPause --》onStop --》onDestroy --》onCreate --》onStart --》onResume
 */

public class OrdinaryActivity extends BaseActivity {

    public static void startActivity(Context context){
        context.startActivity(new Intent(context, OrdinaryActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordinary);
        Log.e(TAG_CLASS, "onCreate 执行");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG_CLASS, "onStart 执行");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG_CLASS, "onResume 执行");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG_CLASS, "onPause 执行");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG_CLASS, "onStop 执行");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG_CLASS, "onDestroy 执行");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG_CLASS, "onRestart 执行");
    }

    public void onClick(View view) {
        int mCurrentOrientation = getResources().getConfiguration().orientation;

        if(mCurrentOrientation == Configuration.ORIENTATION_PORTRAIT) {
            Log.e(TAG_CLASS, "竖屏 --》横屏");
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }else if(mCurrentOrientation == Configuration.ORIENTATION_LANDSCAPE){
            Log.e(TAG_CLASS, "横屏 --》竖屏");
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
    }

    /**
     * 横竖屏切换时调用
     * @param newConfig
     */
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e(TAG_CLASS, "屏幕方向发生改变");
    }
}
