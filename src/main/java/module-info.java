module com.example.javafx_w5_assignment2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;

    opens com.example.javafx_w5_assignment2 to javafx.fxml;
    exports com.example.javafx_w5_assignment2;
}