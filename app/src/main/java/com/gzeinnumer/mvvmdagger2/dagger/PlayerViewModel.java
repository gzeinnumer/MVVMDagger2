package com.gzeinnumer.mvvmdagger2.dagger;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.gzeinnumer.mvvmdagger2.Player;
import com.gzeinnumer.mvvmdagger2.dagger.PlayerRepository;

import javax.inject.Inject;

public class PlayerViewModel extends ViewModel {
    private MutableLiveData<Player> playerMutableLiveData = new MutableLiveData<>();
    private Player player;
    PlayerRepository playerRepository;

    @Inject
    public PlayerViewModel(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
        player = new Player("Zein", "GZNClubs", "Keeper");
        //set value
        playerRepository = new PlayerRepository(player);
        //get value
        playerMutableLiveData = playerRepository.getPlayerMutableLiveData();
    }

    public MutableLiveData<Player> getPlayerMutableLiveData() {
        return playerMutableLiveData;
    }


}

