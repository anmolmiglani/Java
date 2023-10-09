package com.example.javafx_w5_assignment2;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.List;

public class MainController {
    @FXML
    private TableView<VideoGame> tableView;

    @FXML
    private TableColumn<VideoGame, Integer> idColumn;

    @FXML
    private TableColumn<VideoGame, String> titleColumn;

    @FXML
    private TableColumn<VideoGame, String> genreColumn;

    @FXML
    private TableColumn<VideoGame, Integer> releaseYearColumn;

    @FXML
    private TableColumn<VideoGame, Double> salesMillionsColumn;

    public void initialize() {
        // Initialize DBUtility with your database connection details
        DBUtility dbUtility = new DBUtility("jdbc:mysql://localhost:3306/videogamedb", "root", "1234");

        // Retrieve all video games from the database
        List<VideoGame> videoGames = dbUtility.getAllVideoGames();

        // Close the database connection when done
        dbUtility.close();

        // Bind columns to data properties
        idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
        titleColumn.setCellValueFactory(cellData -> cellData.getValue().titleProperty());
        genreColumn.setCellValueFactory(cellData -> cellData.getValue().genreProperty());
        releaseYearColumn.setCellValueFactory(cellData -> cellData.getValue().releaseYearProperty().asObject());
        salesMillionsColumn.setCellValueFactory(cellData -> cellData.getValue().salesMillionsProperty().asObject());

        // Populate the TableView with data
        tableView.getItems().addAll(videoGames);
    }
}
