/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan02;

/**
 *
 * @author Pizaini
 */
public class Nasabah {
    private String nama;
    private String nomorRekening;
    private boolean jenisKelamin;

    public Nasabah() {
    }

    public Nasabah(String nama, String nomorRekening, boolean jenisKelamin) {
        this.nama = nama;
        this.nomorRekening = nomorRekening;
        this.jenisKelamin = jenisKelamin;
    }    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public void setNomorRekening(String rek) {
        this.nomorRekening = rek;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
}
