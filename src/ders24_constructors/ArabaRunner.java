package ders24_constructors;

public class ArabaRunner {

    public static void main(String[] args) {

        Araba arb1 = new Araba();

        arb1.marka = "BMW";
        arb1.model = "İX";
        arb1.yakit = "ELEKTİRİKLİ";
        arb1.yil = 2023;
        arb1.fiyat = 300000;

        System.out.println(arb1);
    }

}
