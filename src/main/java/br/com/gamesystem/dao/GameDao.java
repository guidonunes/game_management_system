package br.com.gamesystem.dao;

import br.com.gamesystem.factory.ConnectionFactory;
import br.com.gamesystem.model.Game;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class GameDao {
    private Connection connection;

    public GameDao() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }

    public void registerGame(Game game) {}

    public void updateGame(Game game) {}

    public void deleteGame(int id) {}

    public Game searchById(int id) {
        return null;
    }

    public List<Game> getAll() {
        return null;
    }

}
