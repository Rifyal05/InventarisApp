/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventarisapp.Generic;

/**
 *
 * @author rifial
 */
public class DataInventaris {

    private String namaBarang;
    private int jumlah;
    private double hargaSatuan;
    private double totalAset;

    public DataInventaris(String namaBarang, int jumlah, double hargaSatuan, double totalAset) {
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.hargaSatuan = hargaSatuan;
        this.totalAset = totalAset;
    }

    public String toCSVString() {
        return this.namaBarang + "," + this.jumlah + "," + this.hargaSatuan + "," + this.totalAset;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    public double getTotalAset() {
        return totalAset;
    }
}
