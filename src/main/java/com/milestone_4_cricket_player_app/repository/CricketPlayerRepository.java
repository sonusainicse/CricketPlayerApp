package com.milestone_4_cricket_player_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milestone_4_cricket_player_app.model.CricketPlayer;

public interface CricketPlayerRepository extends JpaRepository<CricketPlayer, Long>{

}
