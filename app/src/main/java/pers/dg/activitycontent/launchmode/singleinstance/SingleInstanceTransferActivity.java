package pers.dg.activitycontent.launchmode.singleinstance;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import pers.dg.activitycontent.MainActivity;
import pers.dg.activitycontent.R;

public class SingleInstanceTransferActivity extends AppCompatActivity {

    public static void startActivity(Context context){
        context.startActivity(new Intent(context, SingleInstanceTransferActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance_transfer);
    }

    public void onClick(View view) {
        MainActivity.startActivity(this);
//        SingleInstanceLaunchModeActivity.startActivity(this);
    }
}
