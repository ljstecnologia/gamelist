package com.ljstecnologia.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ljstecnologia.gamelist.dto.GameMinDTO;
import com.ljstecnologia.gamelist.entities.Game;
import com.ljstecnologia.gamelist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gamerepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gamerepository.findAll();
	//	List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
	// A linha acima está mais didatica, salvando o resultado do stream em dto mas podemos fazer da jeito abaixo. 
		
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
