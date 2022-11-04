package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        // kullanicidan ismini alip buyuk harfle yazdirin

        // 1. adim : scan objesi olusturun
        Scanner scan = new Scanner(System.in);

        //2. adim : kullaniciya ne istediginizi yazdirma
        System.out.println("Lutfen isminizi giriniz");

        //3.adim : kullanicidan istedigimiz bilginin turune uygun bir variable olusturup
        //                    scanner method'larindan uygun olanini kullanarak alinan degeri
        //                    variable'a atayalim

        String kullaniciİsmi= scan.next();

        System.out.println(kullaniciİsmi.toUpperCase());


            }
}
