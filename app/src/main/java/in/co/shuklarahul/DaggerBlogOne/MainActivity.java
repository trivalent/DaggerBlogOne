package in.co.shuklarahul.DaggerBlogOne;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import in.co.shuklarahul.DaggerBlogOne.di.DaggerWatchComponent;
import in.co.shuklarahul.DaggerBlogOne.di.DialModule;
import in.co.shuklarahul.DaggerBlogOne.di.StrapModule;
import in.co.shuklarahul.DaggerBlogOne.di.WatchComponent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WatchComponent watchComponent = DaggerWatchComponent.builder().dialModule(
                new DialModule()).strapModule(new StrapModule()).build();

        Watch theWatch = watchComponent.getWatch();
        theWatch.printWatch();
    }
}
