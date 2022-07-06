package com.milestone_4_cricket_player_app.cricketplayercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.milestone_4_cricket_player_app.model.CricketPlayer;
import com.milestone_4_cricket_player_app.service.CricketPlayerService;

//this is my controller file

@RestController
public class CricketPlayerController {
	
	@Autowired
	private CricketPlayerService cps;

	public CricketPlayerController(CricketPlayerService cps) {
		super();
		this.cps = cps;
	}
	
	
	@GetMapping("/cricketplayers")
	public java.util.List<CricketPlayer> getAllCricketPlayers(){
		return (java.util.List<CricketPlayer>) this.cps.getAllCricketPlayers();
	}
	
	@GetMapping("/cricketplayers/{id}")
	public CricketPlayer getCricketPlayerById(@PathVariable("id") String id) {
		return this.cps.getCricketPlayerById(Long.parseLong(id));
	}
	
	@PostMapping("/cricketplayers")
	public ResponseEntity<CricketPlayer> saveCricketPlayer(@RequestBody CricketPlayer cp){
		return new ResponseEntity<CricketPlayer>(cps.saveCricketPlayer(cp),HttpStatus.CREATED);
	}
		
		@DeleteMapping("/cricketplayers/{id}")
		public ResponseEntity<HttpStatus> deleteCricketPlayerById(@PathVariable String id) {
			try {
				this.cps.deleteCricketPlayerById(Long.parseLong(id));
				return new ResponseEntity<>(HttpStatus.OK);
			}
			catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		
	}
	

}
