package pers.dg.activitycontent.activityflags.singletop;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import pers.dg.activitycontent.R;
import pers.dg.activitycontent.activityflags.cleartop.FlagClearTopActivity;

public class FlagSingleTopTransferActivity extends AppCompatActivity {

    public static void startActivity(Context context){
        context.startActivity(new Intent(context, FlagSingleTopTransferActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag_single_top_transfer);
    }

    public void onClick(View view) {
        FlagSingleTopActivity.startActivity(this);
    }
}
