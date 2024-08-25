package org.example.proyectoprogramacion3fx;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import org.example.proyectoprogramacion3fx.Model.TallerAutomotriz;
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
    private Button cancelar_btn;

    @FXML
    private Button verCitas_btn;

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
    private Label costo_txt;

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

    TallerAutomotriz taller = new TallerAutomotriz();

    @FXML
    void asignar_btn(ActionEvent event){
        String placa = placa_txt.getText();
        String marca = marca_txt.getText();
        String anio = anioVehiculo_txt.getText();
        String hora = horaCita_txt.getText();
        LocalDate fecha = fechaCita_Date.getValue();
        String tipoVehiculo = tipoVehiculo_comboBox.getSelectionModel().getSelectedItem().toString();
        TipoVehiculo tipoVehiculoOMG = tipoVehiculo_comboBox.getSelectionModel().getSelectedItem();
        String tipoCita = tipoCita_comboBox.getSelectionModel().getSelectedItem().toString();
        TipoCita tipoCitaOMG = tipoCita_comboBox.getSelectionModel().getSelectedItem();
        citaCreada_txt.setText("La cita del vehiculo con placa " + placa + " se le asignó para el día " + fecha + " a las " + hora +" para " + tipoCita);
        
        double costo = taller.calcularPrecio(tipoCitaOMG, tipoVehiculoOMG);
        String costoStr = Double.toString(costo);
        costo_txt.setText("Costo: " + costoStr);

        taller.gestorCita.crearCita(placa, marca, anio, fecha, hora, tipoVehiculo, tipoCita);

        placa_txt.setText("");
        marca_txt.setText("");
        anioVehiculo_txt.setText("");
        horaCita_txt.setText("");
        tipoCita_comboBox.setValue(null);
        tipoVehiculo_comboBox.setValue(null);
        fechaCita_Date.setValue(null);
        tipoVehiculo_comboBox.getSelectionModel().getSelectedItem().toString();
        tipoCita = tipoCita_comboBox.getSelectionModel().getSelectedItem().toString();
    }

    @FXML
    void cancelar_btn(ActionEvent event){
        String placa = placa_txt.getText();
        LocalDate fecha = fechaCita_Date.getValue();
        citaCreada_txt.setText(taller.gestorCita.cancelarCita(fecha, placa));

        placa_txt.setText("");
        marca_txt.setText("");
        anioVehiculo_txt.setText("");
        horaCita_txt.setText("");
        tipoCita_comboBox.setValue(null);
        tipoVehiculo_comboBox.setValue(null);
        fechaCita_Date.setValue(null);
        tipoVehiculo_comboBox.getSelectionModel().getSelectedItem().toString();
        tipoCita_comboBox.getSelectionModel().getSelectedItem().toString();
    }

    @FXML
    void verCitas_btn(ActionEvent event){
        String placa = placa_txt.getText();
        String listaCitas = taller.gestorCita.listarCitas(placa);
        citaCreada_txt.setText(listaCitas);

        placa_txt.setText("");
        marca_txt.setText("");
        anioVehiculo_txt.setText("");
        horaCita_txt.setText("");
        tipoCita_comboBox.setValue(null);
        tipoVehiculo_comboBox.setValue(null);
        fechaCita_Date.setValue(null);
        tipoVehiculo_comboBox.getSelectionModel().getSelectedItem().toString();
        tipoCita_comboBox.getSelectionModel().getSelectedItem().toString();
    }









    /*@FXML
    void crearCita(ActionEvent event) {
        String placa = placa_txt.getText();
        String marca = marca_txt.getText();
        String anio = anioVehiculo_txt.getText();
        String hora = horaCita_txt.getText();
        LocalDate fecha = fechaCita_Date.getValue();
        String tipoVehiculo = tipoVehiculo_comboBox.getSelectionModel().getSelectedItem().toString();
        String tipoCita = tipoCita_comboBox.getSelectionModel().getSelectedItem().toString();

        gestorCita.crearCita()

        placa_txt.clear();
        marca_txt.clear();
        anioVehiculo_txt.clear();
        horaCita_txt.clear();
        fechaCita_Date.setValue(null);
        tipoVehiculo_comboBox.getSelectionModel().clearSelection();
        tipoCita_comboBox.getSelectionModel().clearSelection();

        citaCreada_txt.setText("Cita creada con éxito.");
    }*/

}

