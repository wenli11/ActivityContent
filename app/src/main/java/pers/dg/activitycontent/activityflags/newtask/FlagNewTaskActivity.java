package pers.dg.activitycontent.activityflags.newtask;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import pers.dg.activitycontent.BaseActivity;
import pers.dg.activitycontent.R;

/**
 * 启动该 activity 时
 * 设置 flag 为 Intent.FLAG_ACTIVITY_NEW_TASK
 * 结果与设置 launchmode 为 standard 相同
 * 每次启动本 activity 时，都会创建新的实例
 *
 * 设置 flag 优先级低于 launchmodu
 */

public class FlagNewTaskActivity extends BaseActivity {

    public static void startActivity(Context context){
        Intent intent = new Intent(context, FlagNewTaskActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag_new_task);

        Log.e(TAG_CLASS, this.toString());
    }

    public void onClick(View view) {
        startActivity(this);
    }
}
