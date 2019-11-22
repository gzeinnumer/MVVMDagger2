package com.gzeinnumer.mvvmdagger2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;

import com.gzeinnumer.mvvmdagger2.dagger.PlayerComponent;
import com.gzeinnumer.mvvmdagger2.dagger.PlayerViewModel;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivityZein";

    @Inject
    ViewModelProvider.Factory viewModelFactor;

    private PlayerViewModel playerViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PlayerComponent playerComponent = DaggerPlayerComponent.create();

        playerComponent.inject(this);

        playerViewModel = ViewModelProviders.of(this, viewModelFactor).get(PlayerViewModel.class);

        playerViewModel.getPlayerMutableLiveData().observe(this, new Observer<Player>() {
            @Override
            public void onChanged(Player player) {
                Log.d(TAG, "onChanged: "+player.getName()+player.getClub()+player.getPosition());
            }
        });
    }
}
