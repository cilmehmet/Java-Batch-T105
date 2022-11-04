package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08_KullaniciyaListOlusturtma {

    public static void main(String[] args) {

        // Soru 2- Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.

        System.out.println(listeOlustur());
    }

    public static List<String> listeOlustur (){

        List<String> isimler = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        String girilenİsim = "";

        while (girilenİsim.equalsIgnoreCase("q")){

            System.out.println("Lutfen listeye eklemek için isim giriniz." +
                    "/nBitirmek icin q'a basınız.");

            girilenİsim = scan.nextLine();

            if (!girilenİsim.equalsIgnoreCase("q")){
                isimler.add(girilenİsim);
            }
        }
        return isimler;
    }
}
