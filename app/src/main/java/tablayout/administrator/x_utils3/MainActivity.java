package tablayout.administrator.x_utils3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

public class MainActivity extends Activity {
    @ViewInject(R.id.btn)
    Button buttonSendNet;

    @ViewInject(R.id.image)
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x.view().inject(this);

        System.out.println("buttonsendNet"+buttonSendNet);


    }

    @Event(value = {R.id.btn,R.id.btn_post,R.id.btn_image})
    private void vtnClick(View view){

        switch (view.getId())
        {

            case R.id.btn:
                get();
                
                break;


            case R.id.btn_post:


                break;



            case R.id.btn_image:


                break;


        }
    }

    private void get() {

        RequestParams requestParams = new RequestParams("http://qhb.2dyt.com/Bwei/login");
        requestParams.addQueryStringParameter("postkey","bwei");
        requestParams.addQueryStringParameter("username","18511098888");
        requestParams.addQueryStringParameter("password","11111");

        x.http().get(requestParams, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                System.out.println("result = " + result);
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });


    }


}
