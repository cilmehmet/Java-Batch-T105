package ders13_nestedForLoop_method0lusturma;

import java.util.Scanner;

public class C08_MethodOlusturma {

    public static void main(String[] args) {

        // Kullanicidan 2 sayi alip, bunlarin toplamini yazdiran bir method olusturun.

        isteToplaYazdir();
    }

    public static void isteToplaYazdir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz.");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        System.out.println("Girilen sayilarin toplami."+ (sayi1 + sayi2));

    }
}
