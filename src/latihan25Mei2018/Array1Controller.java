/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan25Mei2018;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author Pizaini
 */
public class Array1Controller implements Initializable {
    @FXML
    private ComboBox<String> comboBox;
    
    private final String[] nama = new String[]{"Nama1", "Nama2", "Nama3", "Nama4", "Nama5"};
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboBox.getItems().addAll(this.nama);
    }    
    
    public void selectComboBox(){
        String comString = comboBox.getSelectionModel().getSelectedItem();
        System.out.println("Nama " +comString);
    }
    
}
