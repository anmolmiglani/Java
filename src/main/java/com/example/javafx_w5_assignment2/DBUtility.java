package com.example.javafx_w5_assignment2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBUtility {
    private Connection connection;

    public DBUtility(String dbUrl, String dbUsername, String dbPassword) {
        try {
            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<VideoGame> getAllVideoGames() {
        List<VideoGame> videoGames = new ArrayList<>();

        try {
            String query = "SELECT * FROM video_games";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String title = resultSet.getString("Game_Title");
                String genre = resultSet.getString("Genre");
                int releaseYear = resultSet.getInt("Release_Year");
                double salesMillions = resultSet.getDouble("Sales_Millions");

                VideoGame game = new VideoGame(id, title, genre, releaseYear, salesMillions);
                videoGames.add(game);
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return videoGames;
    }

    public void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
