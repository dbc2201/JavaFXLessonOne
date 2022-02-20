module io.github.dbc.javafxlessonone {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.github.dbc.javafxlessonone to javafx.fxml;
    exports io.github.dbc.javafxlessonone;
    exports io.github.dbc.javafxlessonone.controller;
    opens io.github.dbc.javafxlessonone.controller to javafx.fxml;
}