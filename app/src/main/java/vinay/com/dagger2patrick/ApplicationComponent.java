package vinay.com.dagger2patrick;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {
        AndroidModule.class,
        AppModule.class
})
@Singleton
public interface ApplicationComponent {
    void inject(MainActivity activity);
    void inject(MainActivityFragment fragment);
}
