package com.vitorbrocker.dslist.repositories;

import com.vitorbrocker.dslist.entities.Game;
import com.vitorbrocker.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
