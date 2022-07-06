package com.milestone_4_cricket_player_app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//this is my entity class

@Entity // This annotation is used for defining it as an Entity
@Table(name="cricketplayer") // it is used to make it as table as employee.
public class CricketPlayer {

			
			@Id // it define as primary key  // auto generated values for id unique 
			private long id;
			
			@Column(name="name", nullable = false)  // it is used to define it as a column
			private String name;
			
			@Column(name="run_scored")
			private int runScored;
			
			@Column(name="playertype")
			private String playerType;

			public long getId() {
				return id;
			}

			public void setId(long id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getRunScored() {
				return runScored;
			}

			public void setRunScored(int runScored) {
				this.runScored = runScored;
			}

			public String getPlayerType() {
				return playerType;
			}

			public void setPlayerType(String playerType) {
				this.playerType = playerType;
			}

	
		}
