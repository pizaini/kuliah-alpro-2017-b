/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan8Juni2018;

import bubblesort.BubbleSort;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableIntegerArray;
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
    private TableView<String> tableTidakTerurut, tableTerurut;
    @FXML
    private TableColumn<String, String> kolomTidakTerurut1, kolomTerurutTerurut1;
    @FXML
    private TextField textNamaBuah;
    @FXML
    private Button buttonUrutkan;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        kolomTidakTerurut1.setCellValueFactory(data -> 
                new SimpleStringProperty(data.getValue()));
        kolomTerurutTerurut1.setCellValueFactory(data -> 
                new SimpleStringProperty(data.getValue()));
    }    
    
    public void tambahData(){
        String namaBuah = textNamaBuah.getText();
        tableTidakTerurut.getItems().add(namaBuah);
        //clear textfield
        textNamaBuah.clear();
    }
    
    public void hapusData(){
        int indexTerpilih = tableTidakTerurut.getSelectionModel().getSelectedIndex();
        tableTidakTerurut.getItems().remove(indexTerpilih);
    }
    
    public void urutkan(){
        //ambil data dari table yang tidak terurut
        ObservableList<String> items = tableTidakTerurut.getItems();
        //konversi observeable list ke String[]
        String[] arrayString = items.toArray(new String[items.size()]);
      
       //konversi arrays string menjadi array int
       int[] arrayInt2 = Arrays.stream(arrayString).mapToInt(Integer::parseInt).toArray();

       //urutkan dengan bubble sort
        BubbleSort bubbleSort = new BubbleSort(arrayInt2);
        int[] terurutAscending = bubbleSort.menaik();
       //koversi ke string array
       String[] arrayTerurutString = 
               Arrays.stream(terurutAscending).mapToObj(String::valueOf).toArray(String[]::new);
       
       //tampilkan ke table yang sudah terurut
       tableTerurut.getItems().setAll(arrayTerurutString);
        
    }
    
    public void urutkanMenurun(){
        //ambil data dari table yang tidak terurut
        ObservableList<String> items = tableTidakTerurut.getItems();
        //konversi observeable list ke String[]
        String[] arrayString = items.toArray(new String[items.size()]);
       //konversi arrays string menjadi array int
       int[] arrayInt2 = Arrays.stream(arrayString).mapToInt(Integer::parseInt).toArray();
       //urutkan dengan bubble sort
        BubbleSort bubbleSort = new BubbleSort(arrayInt2);
        int[] terurutDescending = bubbleSort.menurun();
       //koversi ke string array
       String[] arrayTerurutString = 
               Arrays.stream(terurutDescending).mapToObj(String::valueOf).toArray(String[]::new);
       //tampilkan ke table yang sudah terurut
       tableTerurut.getItems().setAll(arrayTerurutString);
        
    }
    
    
    
}
