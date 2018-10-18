package application.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


public class Input_fkmController implements Initializable {
    
       @FXML
    private JFXComboBox<?> cbTsf;

    @FXML
    private JFXTimePicker tfJamVisit;

    @FXML
    private JFXComboBox<?> cbTindakan;

    @FXML
    private JFXComboBox<?> cbHasilKunj;

    @FXML
    private JFXTextField tfNoLogFkm;

    @FXML
    private JFXTextField tfSnTerpasang;

    @FXML
    private JFXTextField tfSimTerpasang;

    @FXML
    private JFXTextField tfSnLama;

    @FXML
    private JFXTextField tfSimLama;

    @FXML
    private JFXComboBox<?> cbPaperroll;

    @FXML
    private JFXTextField cbQtyPaperroll;

    @FXML
    private JFXTextField tfPicName;

    @FXML
    private JFXTextField tfTlpPic;

    @FXML
    private JFXTextArea taRemarks;

    @FXML
    private JFXDatePicker tfTglVisit;

    @FXML
    private JFXButton btnSaveFkm;

    @FXML
    private JFXButton btnCancelFkm;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
