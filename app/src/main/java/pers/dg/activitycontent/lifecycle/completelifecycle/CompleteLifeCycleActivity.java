package pers.dg.activitycontent.lifecycle.completelifecycle;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import pers.dg.activitycontent.BaseActivity;
import pers.dg.activitycontent.R;

/**
 * activity 完成的生命周期
 *
 * 创建过程
 * onCreate
 * 当Activity第一次被创建的时候调用此方法
 * onStart
 * 当Activity被显示到屏幕上的时候调用此方法.
 * onResume
 * 当此Activity能够被操作之前,也就是能够获得用户的焦点之前调用此方法.
 *
 * 销毁过程
 * onPause
 * Activity失去焦点之前调用此方法（如：被其他activity覆盖或遮挡）
 * onStop
 * Activity不可见之前调用此方法（如：被其他activity完全遮挡住）
 * onDestroy
 * Activity被销毁之前调用此方法.或者是调用finish()方法结束Activity的时候调用此方法.
 *
 * onRestart
 * 当Activity执行了 onPause、onStop 之后，再次显示的时候，调用此方法（然后执行onStart、onResume）
 *
 *
 * 点击返回按钮或者 home 键可以根据日志查看执行结果
 * 创建
 * onCreate --》onStart --》onResume
 * 返回键
 * onPause --》onStop --》onDestroy
 * 重新进入
 * onCreate --》onStart --》onResume
 *
 * 创建
 * onCreate --》onStart --》onResume
 * Home 键
 * onRestart --》onStart --》onResume
 * onPause --》onStop
 * 重新进入
 */

public class CompleteLifeCycleActivity extends BaseActivity {

    public static void startActivity(Context context){
        context.startActivity(new Intent(context, CompleteLifeCycleActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_life_cycle);
        Log.e(TAG_CLASS, "onCreate 执行");
        registerHomeKeyReceiver(this);
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
        unregisterHomeKeyReceiver(this);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG_CLASS, "onRestart 执行");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode){
            case KeyEvent.KEYCODE_BACK:
                Log.e(TAG_CLASS, "点击了返回按钮");
                break;
            case KeyEvent.KEYCODE_HOME:
                //必须通过广播进行监听，此方法中检测不到，并且没有办法禁止 home 键
                Log.e(TAG_CLASS, "点击了 Home 键");
                break;
        }
        return super.onKeyDown(keyCode, event);
    }

    //自定义的广播接收者
    private HomeWatcherReceiver mHomeKeyReceiver = null;

    //注册广播接收者，监听Home键
    private void registerHomeKeyReceiver(Context context) {
        mHomeKeyReceiver = new HomeWatcherReceiver();
        IntentFilter homeFilter = new IntentFilter(Intent.ACTION_CLOSE_SYSTEM_DIALOGS);
        context.registerReceiver(mHomeKeyReceiver, homeFilter);
    }

    //取消监听广播接收者
    private void unregisterHomeKeyReceiver(Context context) {
        if (null != mHomeKeyReceiver) {
            context.unregisterReceiver(mHomeKeyReceiver);
        }
    }
}
