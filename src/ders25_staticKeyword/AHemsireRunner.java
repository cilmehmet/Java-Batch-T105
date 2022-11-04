package ders25_staticKeyword;

public class AHemsireRunner {

    public static void main(String[] args) {

        AHemsire h1 = new AHemsire();
        h1.personelIsim="Burak";
        h1.personelAdresi="Hatay";
        h1.personelTelefon="1234567890";
        System.out.println(h1);

        AHemsire h2 = new AHemsire();
        h2.personelIsim="Burak";
        h2.personelAdresi="Hatay";
        h2.personelTelefon="1234567890";
        h2.bashekim="Mehmet ÇİL";

        System.out.println("h1" + h1);
        System.out.println("h2" + h2);

        AHemsire h3 = new AHemsire();
        System.out.println("h3 : " + h3);
    }
}
