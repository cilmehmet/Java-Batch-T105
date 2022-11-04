package ders03_datacastingWrapperClass;

import java.util.Scanner;

public class C03_DataCasting {

    public static void main(String[] args) {

        // Kullanicidan bir tamsayi alin
        // Kullanici kac girerse girsin
        // konsolda -128 ile +127 arasinda bir sonuc yazdiracak
        // kod yaziniz

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz");

        int girilensayi= scan.nextInt();

        byte donisensayi= (byte)girilensayi;

        System.out.println("girilensayi" + girilensayi + "'nin donusmus hali : " + donisensayi );

    }
}
