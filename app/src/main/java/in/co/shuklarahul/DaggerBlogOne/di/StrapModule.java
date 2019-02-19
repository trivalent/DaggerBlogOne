package in.co.shuklarahul.DaggerBlogOne.di;

import dagger.Module;
import dagger.Provides;
import in.co.shuklarahul.DaggerBlogOne.Strap;

@Module
public class StrapModule {
    @Provides
    public Strap provideStrap() {
        return new Strap();
    }
}
