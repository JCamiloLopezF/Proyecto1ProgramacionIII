package org.example.proyectoprogramacion3fx.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.example.proyectoprogramacion3fx.Model.vehiculos.TipoVehiculo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class asignarCitaController implements Initializable{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField anioVehiculo_txt;

    @FXML
    private Button asignar_btn;

    @FXML
    private Text citaCreada_txt;

    @FXML
    private DatePicker fechaCita_Date;

    @FXML
    private TextField horaCita_txt;

    @FXML
    private TextField marca_txt;

    @FXML
    private TextField placa_txt;

    @FXML
    private ComboBox<?> tipoCita_comboBox;

    @FXML
    private ComboBox<TipoVehiculo> tipoVehiculo_comboBox;

    @FXML
    private Label user_txt;



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<TipoVehiculo> tipoVehiculos = FXCollections.observableArrayList(TipoVehiculo.values());
        tipoVehiculo_comboBox.setItems(tipoVehiculos);
        tipoVehiculo_comboBox.getSelectionModel();
    }
}

