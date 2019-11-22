package com.gzeinnumer.mvvmdagger2.dagger;

import androidx.lifecycle.MutableLiveData;

import com.gzeinnumer.mvvmdagger2.Player;

import javax.inject.Inject;

public class PlayerRepository {
    private MutableLiveData<Player> playerMutableLiveData = new MutableLiveData<>();

    private Player player;

    @Inject
    public PlayerRepository(Player player) {
        this.player = player;
    }

    public MutableLiveData<Player> getPlayerMutableLiveData() {
        playerMutableLiveData.setValue(player);
        return playerMutableLiveData;
    }
}
