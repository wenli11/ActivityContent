package pers.dg.activitycontent.launchmode.singleTask;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import pers.dg.activitycontent.BaseActivity;
import pers.dg.activitycontent.R;

/**
 * 启动方式为 singletask 时
 * 在返回栈中存在本 activity 的实例，再次启动本 activity 时，会再次调用已存在的实例，并把顶部的实例清理掉
 * （即：点返回的时候，会直接返回第一次跳转本 activity 的地方，第二次或第 n 次跳转本 activity 的位置都不会显示）
 */
public class SingleTaskLaunchModeActivity extends BaseActivity {

    public static void startActivity(Context context){
        context.startActivity(new Intent(context, SingleTaskLaunchModeActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task_launch_mode);

        Log.e(TAG_CLASS, this.toString());
    }

    public void onClick(View view) {
        SingleTaskTransferActivity.startActivity(this);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e(TAG_CLASS, this.toString());
    }
}
