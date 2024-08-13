module org.example.proyectoprogramacion3fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.proyectoprogramacion3fx to javafx.fxml;
    exports org.example.proyectoprogramacion3fx;
}