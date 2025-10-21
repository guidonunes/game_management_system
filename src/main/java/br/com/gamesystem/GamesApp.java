package br.com.gamesystem;

import br.com.gamesystem.dao.GameDao;
import br.com.gamesystem.factory.ConnectionFactory;
import br.com.gamesystem.model.Game;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class GamesApp {
    public static void main(String[] args) throws SQLException {

        System.out.println("Testing connection...");
        GameDao gameDao = new GameDao();
        List<Game> allGames = gameDao.getAll();
        System.out.println("All Games: " + allGames);

//        Game bg = new Game("God of War 2", true, 399.90 );
//        bg.setId(3);
//        gameDao.updateGame(bg);

    }
}
