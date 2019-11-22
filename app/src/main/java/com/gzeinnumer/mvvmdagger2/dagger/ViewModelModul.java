package com.gzeinnumer.mvvmdagger2.dagger;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.gzeinnumer.mvvmdagger2.Player;
import com.gzeinnumer.mvvmdagger2.ViewModelKey;
import com.gzeinnumer.mvvmdagger2.dagger.PlayerViewModel;
import com.gzeinnumer.mvvmdagger2.dagger.ViewModelFactory;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModul {
    @Binds
    @IntoMap
    @ViewModelKey(PlayerViewModel.class)
    abstract ViewModel bindPlayerViewModule(PlayerViewModel playerViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);

    @Provides
    static Player player(){
        return new Player();
    }
}
