package pers.dg.activitycontent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import pers.dg.activitycontent.launchmode.singleTask.SingleTaskTransferActivity;

public class BaseActivity extends AppCompatActivity {

    public static final String TAG_CLASS = BaseActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}
