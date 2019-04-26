package pers.dg.activitycontent;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;

import pers.dg.activitycontent.activityflags.cleartop.FlagClearTopActivity;
import pers.dg.activitycontent.activityflags.excludefromrecents.FlagExcludeFromRecentsActivity;
import pers.dg.activitycontent.activityflags.singletop.FlagSingleTopActivity;

public class MainActivity extends AppCompatActivity {

    public static void startActivity(Context context){
        context.startActivity(new Intent(context, MainActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        CompleteLifeCycleActivity.startActivity(this);
//        OrdinaryActivity.startActivity(this);
//        NoRestartActivity.startActivity(this);
//        JumpTwoActivitiesActivity.startActivity(this);
//        DialogActivityJumpActivity.startActivity(this);
//        StandardLauchModeActivity.startActivity(this);
//        SingleTopLaunchModeActivity.startActivity(this);
//        SingleTaskLaunchModeActivity.startActivity(this);
//        SingleInstanceLaunchModeActivity.startActivity(this);
//        FlagNewTaskActivity.startActivity(this);
//        FlagSingleTopActivity.startActivity(this);
//        FlagClearTopActivity.startActivity(this);
        FlagExcludeFromRecentsActivity.startActivity(this);
        finish();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }
}
