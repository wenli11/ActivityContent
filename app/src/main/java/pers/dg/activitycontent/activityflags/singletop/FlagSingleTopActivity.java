package pers.dg.activitycontent.activityflags.singletop;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import pers.dg.activitycontent.BaseActivity;
import pers.dg.activitycontent.R;
import pers.dg.activitycontent.launchmode.singletop.SingleTopLaunchModeActivity;
import pers.dg.activitycontent.launchmode.singletop.SingleTopTransferActivity;

/**
 * 启动该 activity 时
 * 设置 flag 为 Intent.FLAG_ACTIVITY_SINGLE_TOP
 * 结果与设置 launchmode 为 singletop 相同
 * 返回栈最顶部的 activity 实例是本 activity 时，再次启动本 activity 时，使用的仍然时本实例
 *
 * 返回栈最顶部的 activity 实例不是本 activity 时，再次启动本 activity 时，使用的是新创建的实例
 * 点击返回时，会先返回中转的 activity
 *
 * 设置 flag 优先级低于 launchmode
 */
public class FlagSingleTopActivity extends BaseActivity {

    public static void startActivity(Context context){
        Intent intent = new Intent(context, SingleTopLaunchModeActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag_single_top);

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
                FlagSingleTopTransferActivity.startActivity(this);
                break;
        }
    }
}
