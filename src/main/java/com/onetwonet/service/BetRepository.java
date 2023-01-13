package com.onetwonet.service;

import com.onetwonet.jpa.model.Bet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BetRepository extends JpaRepository<Bet, Long> {
    //    @Query("SELECT u FROM bets u WHERE u.game = ?1")
//    List<Bet> findByGame(String game);
    @Query(value = "SELECT * FROM bets u WHERE u.game = :game",
            nativeQuery = true)
    List<Bet> findByGame(@Param("game") String game);


    @Query(value = "SELECT * FROM bets u WHERE u.client_id = :clientId",
            nativeQuery = true)
    List<Bet> findByClientId(String clientId);
    @Query(value = "SELECT * FROM bets u WHERE u.date = :date",
            nativeQuery = true)
    List<Bet> findByDate(String date);

}
