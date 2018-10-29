package com.company;

/**
 * @author
 * Nama              : Joseph Armando Carvallo
 * Kelas             : PBO2
 * Nim               : 10117077
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 *                     kegiatan mahluk Hidup
 **/

public abstract class LivingThing {
    public abstract void walk(String nama);

    public void breath(String nama){
        System.out.println(nama+" Bernafas");
    }

    public void eat(String nama){
        System.out.println(nama + " Makan");
    }
}