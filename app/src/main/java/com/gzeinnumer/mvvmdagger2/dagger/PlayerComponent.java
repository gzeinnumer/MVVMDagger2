package com.gzeinnumer.mvvmdagger2.dagger;

import com.gzeinnumer.mvvmdagger2.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ViewModelModul.class)
public interface PlayerComponent {
    void inject(MainActivity mainActivity);
}
