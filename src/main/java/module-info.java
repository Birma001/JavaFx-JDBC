module com.example.loginjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.loginjavafx to javafx.fxml;
    exports com.example.loginjavafx;
}