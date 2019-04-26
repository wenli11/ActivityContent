package pers.dg.activitycontent.launchmode.singletop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import pers.dg.activitycontent.BaseActivity;
import pers.dg.activitycontent.R;

/**
 * 启动方式设置为 singletop 时
 * 如果返回栈最顶部的 activity 是本 activity，再次启动本 activity 时，仍然是当前实例
 *
 * 如果返回栈最顶部的 activity 不是本 activity，再次启动本 activity 时，是新的实例
 * 点击返回时，先返回中转 activity，继续点击返回，返回本 activity
 *
 * 如果是使用当前实例，接受传值需要在 onNewIntent 方法中执行
 */
public class SingleTopLaunchModeActivity extends BaseActivity {

    public static void startActivity(Context context){
        context.startActivity(new Intent(context, SingleTopLaunchModeActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_top_launch_mode);

        Log.e(TAG_CLASS, this.toString());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        Log.e(TAG_CLASS, this.toString());
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.oneself:
                startActivity(this);
                break;
            case R.id.other:
                SingleTopTransferActivity.startActivity(this);
                break;
        }
    }
}
