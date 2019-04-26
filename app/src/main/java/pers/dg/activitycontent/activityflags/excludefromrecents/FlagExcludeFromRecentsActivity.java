package pers.dg.activitycontent.activityflags.excludefromrecents;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pers.dg.activitycontent.R;
import pers.dg.activitycontent.activityflags.cleartop.FlagClearTopActivity;

/**
 * 启动 activity 时
 * 设置 flag 为 Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS
 * 作用是为了在最近任务中不显示本应用（即：点击任务键时，不显示本应用）
 * 现在没有发挥作用
 *
 * 只有在入口 activity 的配置信息中设置 android:excludeFromRecents="true" 才会发挥作用
 */

public class FlagExcludeFromRecentsActivity extends AppCompatActivity {

    public static void startActivity(Context context){
        Intent intent = new Intent(context, FlagExcludeFromRecentsActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag_exclude_from_recents);
    }
}
