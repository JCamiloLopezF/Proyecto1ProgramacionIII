package org.example.proyectoprogramacion3fx;

import java.net.URL;
import java.util.ResourceBundle;

import org.example.proyectoprogramacion3fx.Model.citas.TipoCita;
import org.example.proyectoprogramacion3fx.Model.vehiculos.TipoVehiculo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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
    private ComboBox<TipoCita> tipoCita_comboBox;

    @FXML
    private ComboBox<TipoVehiculo> tipoVehiculo_comboBox;

    @FXML
    private Label user_txt;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<TipoVehiculo> tipoVehiculos = FXCollections.observableArrayList(TipoVehiculo.values());
        tipoVehiculo_comboBox.setItems(tipoVehiculos);
        tipoVehiculo_comboBox.getSelectionModel();

        ObservableList<TipoCita> tiposCita = FXCollections.observableArrayList(TipoCita.values());
        tipoCita_comboBox.setItems(tiposCita);
        tipoCita_comboBox.getSelectionModel();

    }

    @FXML
    void asignar_btn(ActionEvent event){
        String placa = placa_txt.getText();
        String marca = marca_txt.getText();
        String anio = anioVehiculo_txt.getText();
        String hora = horaCita_txt.getText();
        String fecha = fechaCita_Date.getValue().toString();
        String tipoVehiculo = tipoVehiculo_comboBox.getSelectionModel().getSelectedItem().toString();
        String tipoCita = tipoCita_comboBox.getSelectionModel().getSelectedItem().toString();
        citaCreada_txt.setText("La cita del vehiculo con placa " + placa + " se le asignó la cita el día " + fecha + " a las " + hora +" para " + tipoCita);
    }
}

