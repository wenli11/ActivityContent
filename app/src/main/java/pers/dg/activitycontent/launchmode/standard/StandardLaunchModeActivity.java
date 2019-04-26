package pers.dg.activitycontent.launchmode.standard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import pers.dg.activitycontent.BaseActivity;
import pers.dg.activitycontent.R;

/**
 * 启动方式设置为 standard 时
 * 重新启动的 activity 是新的实例
 */

public class StandardLaunchModeActivity extends BaseActivity {

    public static void startActivity(Context context){
        context.startActivity(new Intent(context, StandardLaunchModeActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard_launch_mode);

        Log.e(TAG_CLASS, this.toString());
    }

    public void onClick(View view) {
        startActivity(this);
    }
}
