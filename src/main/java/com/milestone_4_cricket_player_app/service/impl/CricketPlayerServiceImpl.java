package com.milestone_4_cricket_player_app.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.milestone_4_cricket_player_app.model.CricketPlayer;
import com.milestone_4_cricket_player_app.repository.CricketPlayerRepository;
import com.milestone_4_cricket_player_app.service.CricketPlayerService;

@Service
public class CricketPlayerServiceImpl implements CricketPlayerService{
	
	
	private CricketPlayerRepository cpr;
	

	public CricketPlayerServiceImpl(CricketPlayerRepository cpr) {
		super();
		this.cpr = cpr;
	}

	@Override
	public CricketPlayer saveCricketPlayer(CricketPlayer cp) {
		return cpr.save(cp);
	}

	@Override
	public List<CricketPlayer> getAllCricketPlayers() {
		return cpr.findAll();
	}

	@Override
	public CricketPlayer getCricketPlayerById(long id) {
		java.util.Optional<CricketPlayer> optional = cpr.findById(id);
		CricketPlayer cp = null;
		if (optional.isPresent()) {
			cp = optional.get();
		} else {
			throw new RuntimeException(" Cricket Player not found for id :: " + id);
		}
		return cp;
	}

	@Override
	public void deleteCricketPlayerById(long id) {
		this.cpr.deleteById(id);
		
	}

}
