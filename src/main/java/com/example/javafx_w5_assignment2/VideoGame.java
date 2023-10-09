package com.example.javafx_w5_assignment2;

import javafx.beans.property.*;

public class VideoGame {
    private final IntegerProperty id = new SimpleIntegerProperty();
    private final StringProperty title = new SimpleStringProperty();
    private final StringProperty genre = new SimpleStringProperty();
    private final IntegerProperty releaseYear = new SimpleIntegerProperty();
    private final DoubleProperty salesMillions = new SimpleDoubleProperty();

    public VideoGame(int id, String title, String genre, int releaseYear, double salesMillions) {
        setId(id);
        setTitle(title);
        setGenre(genre);
        setReleaseYear(releaseYear);
        setSalesMillions(salesMillions);
    }

    // Getter and setter methods for ID property
    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public IntegerProperty idProperty() {
        return id;
    }

    // Getter and setter methods for Title property
    public String getTitle() {
        return title.get();
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public StringProperty titleProperty() {
        return title;
    }

    // Getter and setter methods for Genre property
    public String getGenre() {
        return genre.get();
    }

    public void setGenre(String genre) {
        this.genre.set(genre);
    }

    public StringProperty genreProperty() {
        return genre;
    }

    // Getter and setter methods for ReleaseYear property
    public int getReleaseYear() {
        return releaseYear.get();
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear.set(releaseYear);
    }

    public IntegerProperty releaseYearProperty() {
        return releaseYear;
    }

    // Getter and setter methods for SalesMillions property
    public double getSalesMillions() {
        return salesMillions.get();
    }

    public void setSalesMillions(double salesMillions) {
        this.salesMillions.set(salesMillions);
    }

    public DoubleProperty salesMillionsProperty() {
        return salesMillions;
    }

    // You may define getter methods for other fields as well if needed

    // Rest of your VideoGame class...
}
