package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_remove {

    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            sayilar.add(arr[i]);
        }

        sayilar.remove(2);
        System.out.println(sayilar);
        sayilar.remove(5);
        System.out.println(sayilar);

        /*
         Listemiz integer'lardan olusuyorsa
         biz int bir deger yazdigiizda hep index kabul ettiginden
         istedigimiz elementi obje olarak girip sildirmek icin
         onceden tanimlamamiz gerekir
         */

        Integer silinecewkObje = 4;
        sayilar.remove(silinecewkObje);
        System.out.println(sayilar);

        // tum 3'leri sildirin

        silinecewkObje = 3;

        while (sayilar.contains(silinecewkObje)) {
            sayilar.remove(silinecewkObje);
        }
        System.out.println(sayilar);

        silinecewkObje = 10;
        System.out.println(sayilar.remove(silinecewkObje));


        sayilar.remove(20);
    }
}
