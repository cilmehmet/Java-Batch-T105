package ders25_staticKeyword;

public class AHemsire {

    String hastaneIsmi = "Yildiz Hastanesi";
    String hastaneAdresi = "Cankaya / Ankara";
    String bashekim = "Dr. Mehmet ÇİL";

    String personelIsim="Isim belirtilmedi";
    String personelAdresi="Adres belirtilmedi";
    String personelTelefon="Telefon belirtilmedi";

    @Override
    public String toString() {
        return "AHemsire{" +
                "hastaneIsmi='" + hastaneIsmi + '\'' +
                ", hastaneAdresi='" + hastaneAdresi + '\'' +
                ", bashekim='" + bashekim + '\'' +
                ", personelIsim='" + personelIsim + '\'' +
                ", personelAdresi='" + personelAdresi + '\'' +
                ", personelTelefon='" + personelTelefon + '\'' +
                '}';
    }
}
