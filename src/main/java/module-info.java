module hu.alkfejl {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens hu.alkfejl to javafx.fxml;
    exports hu.alkfejl;
}