package pers.dg.activitycontent.launchmode.singleTask;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import pers.dg.activitycontent.BaseActivity;
import pers.dg.activitycontent.R;

public class SingleTaskTransferActivity extends BaseActivity {

    public static void startActivity(Context context){
        context.startActivity(new Intent(context, SingleTaskTransferActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task_transfer);
    }


    public void onClick(View view) {
        SingleTaskLaunchModeActivity.startActivity(this);
    }
}
