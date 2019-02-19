package in.co.shuklarahul.DaggerBlogOne.di;

import dagger.Component;
import in.co.shuklarahul.DaggerBlogOne.Watch;

@Component(modules = {DialModule.class, StrapModule.class})
public interface WatchComponent {
    Watch getWatch();
}
