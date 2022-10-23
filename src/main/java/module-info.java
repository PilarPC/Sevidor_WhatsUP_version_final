module com.example.sevidor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sevidor to javafx.fxml;
    exports com.example.sevidor;
}