package in.co.shuklarahul.DaggerBlogOne.di;

import dagger.Module;
import dagger.Provides;
import in.co.shuklarahul.DaggerBlogOne.Dial;

@Module
public class DialModule {
    @Provides
    public Dial provideDial() {
        return new Dial();
    }
}
