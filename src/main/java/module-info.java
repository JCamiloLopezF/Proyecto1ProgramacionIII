module org.example.proyectoprogramacion3fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.proyectoprogramacion3fx to javafx.fxml;
    exports org.example.proyectoprogramacion3fx;
    exports org.example.proyectoprogramacion3fx.mvc;

    opens org.example.proyectoprogramacion3fx.Model;
    exports org.example.proyectoprogramacion3fx.Model;

    opens org.example.proyectoprogramacion3fx.Controller;
    exports org.example.proyectoprogramacion3fx.Controller;
}