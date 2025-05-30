package com.ljstecnologia.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ljstecnologia.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
	

}
