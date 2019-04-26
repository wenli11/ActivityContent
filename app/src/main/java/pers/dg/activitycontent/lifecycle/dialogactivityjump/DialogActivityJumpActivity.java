package pers.dg.activitycontent.lifecycle.dialogactivityjump;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import pers.dg.activitycontent.BaseActivity;
import pers.dg.activitycontent.R;
import pers.dg.activitycontent.lifecycle.jumptwoactivities.TargetActivity;

/**
 * 当前 activity 条转 dialog 形式的 activity
 * 创建
 * onCreate --》onStart --》onResume
 * 跳转 dialog activity
 * onPause
 *
 * dialog activity 返回当前 activity
 * onResume
 *
 * 显示 普通的 dialog 时，生命周期没有变化
 */
public class DialogActivityJumpActivity extends BaseActivity {

    public static void startActivity(Context context){
        context.startActivity(new Intent(context, DialogActivityJumpActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_jump);
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
        switch (view.getId()){
            case R.id.jump:
                DialogTargetActivity.startActivity(this);
                break;
            case R.id.dialog:
                new AlertDialog.Builder(this)
                        .setTitle("测试")
                        .setMessage("测试显示 dialog 时，activity 的生命周期变化")
                        .create()
                        .show();
                Log.e(TAG_CLASS, "dialog 已展示");
                break;
        }
    }
}
