package tablayout.administrator.x_utils3;

import android.app.Application;

import org.xutils.x;

/**
 * Created by Administrator on 2017/5/8.
 */

public class IAppliction extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        x.Ext.init(this);
    x.Ext.setDebug(BuildConfig.DEBUG);
        // 是否输出debug 日志 开启debug 会影响性能
    }
}
