package org.example.proyectoprogramacion3fx.mvc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button asignar_btn;

    @FXML
    private TextField añoVehiculo_txt;

    @FXML
    private Text citaCreada_txt;

    @FXML
    private DatePicker fechaCita_Date;

    @FXML
    private TextField horaCita_txt;

    @FXML
    private ComboBox<?> marcaVehiculo_comboBox;

    @FXML
    private TextField placa_txt;

    @FXML
    private ComboBox<?> tipoCita_comboBox;

    @FXML
    private ComboBox<?> tipoVehiculo_comboBox;

    @FXML
    private Label user_txt;

    @FXML
    void initialize() {
        assert asignar_btn != null : "fx:id=\"asignar_btn\" was not injected: check your FXML file 'asignarCita.fxml'.";
        assert anioVehiculo_txt != null : "fx:id=\"añoVehiculo_txt\" was not injected: check your FXML file 'asignarCita.fxml'.";
        assert citaCreada_txt != null : "fx:id=\"citaCreada_txt\" was not injected: check your FXML file 'asignarCita.fxml'.";
        assert fechaCita_Date != null : "fx:id=\"fechaCita_Date\" was not injected: check your FXML file 'asignarCita.fxml'.";
        assert horaCita_txt != null : "fx:id=\"horaCita_txt\" was not injected: check your FXML file 'asignarCita.fxml'.";
        assert marcaVehiculo_comboBox != null : "fx:id=\"marcaVehiculo_comboBox\" was not injected: check your FXML file 'asignarCita.fxml'.";
        assert placa_txt != null : "fx:id=\"placa_txt\" was not injected: check your FXML file 'asignarCita.fxml'.";
        assert tipoCita_comboBox != null : "fx:id=\"tipoCita_comboBox\" was not injected: check your FXML file 'asignarCita.fxml'.";
        assert tipoVehiculo_comboBox != null : "fx:id=\"tipoVehiculo_comboBox\" was not injected: check your FXML file 'asignarCita.fxml'.";
        assert user_txt != null : "fx:id=\"user_txt\" was not injected: check your FXML file 'asignarCita.fxml'.";

    }

}