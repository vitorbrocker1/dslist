package com.vitorbrocker.dslist.crontollers;

import com.vitorbrocker.dslist.dto.GameMinDTO;
import com.vitorbrocker.dslist.entities.Game;
import com.vitorbrocker.dslist.repositories.GameRepository;
import com.vitorbrocker.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
