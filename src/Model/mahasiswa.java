/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author mirage
 */
import TubesBeneran.RegisMurid;
import TubesBeneran.MenuAwal;
import TubesBeneran.RegisGuru;
public class mahasiswa {
    private String nama;
    private int nim;
    private int umur;
    private String pass;

    public String getNama() {
        return nama;
    }

    public int getNim() {
        return nim;
    }

    public int getUmur() {
        return umur;
    }

    public String getPass() {
        return pass;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}
