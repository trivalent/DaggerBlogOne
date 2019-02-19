package in.co.shuklarahul.DaggerBlogOne;

import android.util.Log;

import javax.inject.Inject;

public class Watch {
    private Dial watchDial;
    private Strap watchStrap;

    @Inject
    public Watch(Dial d, Strap s) {
        this.watchDial = d;
        this.watchStrap = s;
    }

    public void printWatch() {
        Log.e("Watch", "This is a watch");
    }
}
