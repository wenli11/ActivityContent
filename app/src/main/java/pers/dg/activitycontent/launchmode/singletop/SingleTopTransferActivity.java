package pers.dg.activitycontent.launchmode.singletop;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import pers.dg.activitycontent.R;

/**
 * singletop 启动方式启动 activity 的中转 activity
 * 为了使 singletop 启动方式启动的 activity 不处于返回栈顶部
 */
public class SingleTopTransferActivity extends AppCompatActivity {

    public static void startActivity(Context context){
        context.startActivity(new Intent(context, SingleTopTransferActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_top_transfer);
    }

    public void onClick(View view) {
        SingleTopLaunchModeActivity.startActivity(this);
    }
}
