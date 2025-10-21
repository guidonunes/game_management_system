package br.com.gamesystem.dao;

import br.com.gamesystem.factory.ConnectionFactory;
import br.com.gamesystem.model.Game;

import java.sql.*;
import java.util.List;

public class GameDao {
    private Connection connection;

    public GameDao() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }

    public void registerGame(Game game) {
        try {
            String sql = "INSERT INTO TB_GAMES(ID, TITLE, IS_FINISHED, PRICE) VALUES (SEQ_GAMES.nextval, ?, ?, ?)";
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setString(1, game.getTitle());
            pstm.setBoolean(2, game.isFinished());
            pstm.setDouble(3, game.getPrice());
            pstm.executeUpdate();
            System.out.println("Game registered: " + game.getTitle());
        } catch (SQLException e) {
            throw new RuntimeException("An error ocurred: " + e);
        }
    }

    public void updateGame(Game game) {
        try {
            String sql = "UPDATE TB_GAMES SET TITLE = ?, IS_FINISHED= ?, PRICE= ? WHERE ID= ?";
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setString(1, game.getTitle());
            pstm.setBoolean(2, game.isFinished());
            pstm.setDouble(3, game.getPrice());
            pstm.setInt(4, game.getId());
            pstm.executeUpdate();
            System.out.println("Game updated: " + game.getTitle());
        } catch (SQLException e) {
            throw new RuntimeException("An error ocurred: " + e);
        }
    }

    public void deleteGame(int id) {}

    public Game searchById(int id) {
        try {
            String sql = "SELECT * FROM TB_GAMES WHERE ID = ?";
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet resultSet = pstm.executeQuery();

            Game game = new  Game();

            if (resultSet.next()) {
                game.setId(resultSet.getInt("ID"));
                game.setTitle(resultSet.getString("TITLE"));
                game.setFinished(resultSet.getBoolean("IS_FINISHED"));
                game.setPrice(resultSet.getDouble("PRICE"));
            }
            return game;
        } catch (SQLException e) {
            throw new RuntimeException("An error ocurred: " + e);
        }
    }

    public List<Game> getAll() {
        return null;
    }

}
