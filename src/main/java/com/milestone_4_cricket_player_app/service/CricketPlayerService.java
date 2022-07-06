package com.milestone_4_cricket_player_app.service;

import java.util.List;

import com.milestone_4_cricket_player_app.model.CricketPlayer;


public interface CricketPlayerService {
	
	CricketPlayer saveCricketPlayer(CricketPlayer cp);
	
	List<CricketPlayer> getAllCricketPlayers();
	
	CricketPlayer getCricketPlayerById(long id);
	
	void deleteCricketPlayerById(long id);

}
