package com.vitorbrocker.dslist.repositories;


import com.vitorbrocker.dslist.entities.GameList;
import com.vitorbrocker.dslist.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
