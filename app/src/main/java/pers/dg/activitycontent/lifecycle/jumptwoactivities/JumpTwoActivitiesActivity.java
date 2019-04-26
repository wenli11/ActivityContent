package pers.dg.activitycontent.lifecycle.jumptwoactivities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import pers.dg.activitycontent.BaseActivity;
import pers.dg.activitycontent.R;

/**
 * 当前 activity 跳转其他 activity
 * 创建
 * onCreate --》onStart --》onResume
 * 点击跳转
 * onPause
 * 当目标 activity 显示完成后
 * onStop
 *
 * 当从目标 activity 返回后
 * onRestart --》onStart --》onResume
 */

public class JumpTwoActivitiesActivity extends BaseActivity {

    public static void startActivity(Context context){
        context.startActivity(new Intent(context, JumpTwoActivitiesActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump_two_activities);
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
        TargetActivity.startActivity(this);
    }
}
