package pers.dg.activitycontent.launchmode.singleinstance;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import pers.dg.activitycontent.BaseActivity;
import pers.dg.activitycontent.R;
import pers.dg.activitycontent.launchmode.singleTask.SingleTaskLaunchModeActivity;
import pers.dg.activitycontent.launchmode.singletop.SingleTopLaunchModeActivity;

/**
 * 启动方式为 singleinstance 时
 * 在返回栈中存在本 activity 实例时，再次启动本 activity 时，启动的依然是本实例
 * （只是将本 activity 的实例放在返回栈的顶部，在此过程中已经存在的 activity 实例顺序不发生变化）
 * （启动任何其他任务栈的 activity 时，都会将该 activity 所在的任务栈放在返回栈的顶部）
 *
 *
 * 查看任务栈信息
 * 执行 adb shell dumpsys activity
 * 搜索 Running activities，找到属于自己项目的任务信息
 *
 * 如果出现 adb 不能使用的情况
 * 进入 sdk 目录下 platform-tools 文件夹
 */

public class SingleInstanceLaunchModeActivity extends BaseActivity {

    public static void startActivity(Context context){
        context.startActivity(new Intent(context, SingleInstanceLaunchModeActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance_launch_mode);

        Log.e(TAG_CLASS, this.toString());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        Log.e(TAG_CLASS, this.toString());
    }

    public void onClick(View view) {
        SingleInstanceTransferActivity.startActivity(this);
    }
}
