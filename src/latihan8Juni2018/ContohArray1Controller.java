/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan8Juni2018;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Pizaini
 */
public class ContohArray1Controller implements Initializable {
    @FXML
    private Button buttonTambahData;
    @FXML
    private TableView<String> tableNamaBuah;
    @FXML
    private TableColumn<String, String> kolomNamaBuah;
    @FXML
    private TextField textNamaBuah;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        kolomNamaBuah.setCellValueFactory(data -> 
                new SimpleStringProperty(data.getValue()));
    }    
    
    public void tambahData(){
        String namaBuah = textNamaBuah.getText();
        tableNamaBuah.getItems().add(namaBuah);
        //clear textfield
        textNamaBuah.clear();
    }
    
    public void hapusData(){
        int indexTerpilih = tableNamaBuah.getSelectionModel().getSelectedIndex();
        tableNamaBuah.getItems().remove(indexTerpilih);
    }
    
}
