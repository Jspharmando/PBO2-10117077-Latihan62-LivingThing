package com.company;

/**
 * @author
 * Nama              : Joseph Armando Carvallo
 * Kelas             : PBO2
 * Nim               : 10117077
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 *                     kegiatan mahluk Hidup
 **/

public class Human extends LivingThing {
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void walk(String nama) {
        System.out.println(getNama()+" sedang berjalan");
    }
}