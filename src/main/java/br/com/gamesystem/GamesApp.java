package br.com.gamesystem;

import br.com.gamesystem.factory.ConnectionFactory;
import br.com.gamesystem.model.Game;

import java.sql.Connection;
import java.sql.SQLException;

public class GamesApp {
    public static void main(String[] args) {

        System.out.println("Testing connection...");
        try {
            Connection connection = ConnectionFactory.getConnection();
            System.out.println("Success!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
