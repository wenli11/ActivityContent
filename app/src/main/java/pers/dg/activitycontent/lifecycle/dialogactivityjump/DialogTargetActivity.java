package pers.dg.activitycontent.lifecycle.dialogactivityjump;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import pers.dg.activitycontent.BaseActivity;
import pers.dg.activitycontent.R;
import pers.dg.activitycontent.lifecycle.jumptwoactivities.TargetActivity;

/**
 * 当其他 activity 跳转到本 dialog activity
 * 创建
 * onCreate --》onStart --》onResume
 *
 * 点击返回或其他方法关闭本activity
 * onPause
 * 要返回到的 activity 显示完成后
 * onStop --》onDestroy
 */
public class DialogTargetActivity extends BaseActivity {

    public static void startActivity(Context context){
        context.startActivity(new Intent(context, DialogTargetActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_target);
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
}
