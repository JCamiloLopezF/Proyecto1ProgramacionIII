module org.example.proyectoprogramacion3fx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;


    opens org.example.proyectoprogramacion3fx to javafx.fxml;
    exports org.example.proyectoprogramacion3fx;

    opens org.example.proyectoprogramacion3fx.Model;
    exports org.example.proyectoprogramacion3fx.Model;
}