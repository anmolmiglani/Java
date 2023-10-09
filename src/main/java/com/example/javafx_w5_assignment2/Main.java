package com.example.javafx_w5_assignment2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleDoubleProperty;

import java.util.List;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Initialize DBUtility with your database connection details
        DBUtility dbUtility = new DBUtility("jdbc:mysql://15.222.122.223/~Anmol200534220", "Anmol200534220", "m20uVb_161");

        // Retrieve all video games from the database
        List<VideoGame> videoGames = dbUtility.getAllVideoGames();

        // Close the database connection when done
        dbUtility.close();

        // Create a TableView to display the data
        TableView<VideoGame> tableView = new TableView<>();

        // Define TableColumn instances for each attribute
        TableColumn<VideoGame, Integer> idColumn = new TableColumn<>("ID");
        idColumn.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getId()).asObject());

        TableColumn<VideoGame, String> titleColumn = new TableColumn<>("Title");
        titleColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTitle()));

        TableColumn<VideoGame, String> genreColumn = new TableColumn<>("Genre");
        genreColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getGenre()));

        TableColumn<VideoGame, Integer> releaseYearColumn = new TableColumn<>("Release Year");
        releaseYearColumn.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getReleaseYear()).asObject());

        TableColumn<VideoGame, Double> salesMillionsColumn = new TableColumn<>("Sales (Millions)");
        salesMillionsColumn.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().getSalesMillions()).asObject());

        // Add TableColumn instances to the TableView
        tableView.getColumns().addAll(idColumn, titleColumn, genreColumn, releaseYearColumn, salesMillionsColumn);

        // Populate the TableView with data
        tableView.getItems().addAll(videoGames);

        // Create a VBox to hold the TableView
        VBox root = new VBox(tableView);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Video Games");
        primaryStage.show();
    }
}
