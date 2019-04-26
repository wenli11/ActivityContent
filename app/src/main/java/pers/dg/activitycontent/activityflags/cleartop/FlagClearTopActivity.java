package pers.dg.activitycontent.activityflags.cleartop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import pers.dg.activitycontent.BaseActivity;
import pers.dg.activitycontent.R;
import pers.dg.activitycontent.activityflags.singletop.FlagSingleTopTransferActivity;

/**
 * 启动 activity 时
 * 设置 flag 为 Intent.FLAG_ACTIVITY_CLEAR_TOP
 * 如果返回栈中存在本 activity 的实例，会把本 activity实例及实例顶部的所有实例都清理掉，然后创建新的本 activity 实例
 *
 * 如果返回栈中不存在本 activity 的实例，会创建新的本 activity 实例
 */
public class FlagClearTopActivity extends BaseActivity {

    public static void startActivity(Context context){
        Intent intent = new Intent(context, FlagClearTopActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag_clear_top);
        Log.e(TAG_CLASS, this.toString());
    }

    public void onClick(View view) {
        FlagSingleTopTransferActivity.startActivity(this);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e(TAG_CLASS, this.toString());
    }
}
