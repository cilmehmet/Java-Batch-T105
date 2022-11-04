package ders10_stringManipulation;

import java.util.Scanner;

public class C07_soru {

    public static void main(String[] args) {

       /*
         Kullanicidan bir cumle ve bir metin alin
         cumlede metnin durumuna gore
         1- cumle metni icermiyor
         2- cumle metni sadece 1 kere iceriyor
         3- cumle metni birden fazla iceriyor
         seceneklerinden uygun olani yazdirin
       */

        String cumle = "Java cok guzeldir cok.";
        String metin = "cok";

        if (!cumle.contains("metn")) {
            ;
            System.out.println("cumle metni icermiyor");
        }else {
            int ilkIndex = cumle.indexOf(metin);

            int ikinciIndex = cumle.indexOf(metin, ilkIndex+1);

            if (ikinciIndex==(-1)){
                System.out.println("cumle metmi sadece 1 kere iceriyor");
            }else {
                System.out.println("cumle metni birden fazla iceriyor");
            }
        }
    }
}
