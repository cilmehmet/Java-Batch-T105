package ders10_stringManipulation;

public class C06_indexOf {

    public static void main(String[] args) {

        String str = "Ahmet hoca ile hersey clear";

        System.out.println(str.indexOf("a"));

        System.out.println(str.indexOf("c"));

        System.out.println(str.indexOf("hersey"));

        System.out.println(str.indexOf("e" , 9));

        System.out.println(str.indexOf("e" , 14));

        int ilkcindex = str.indexOf("c");

        System.out.println(str.indexOf("c" ,ilkcindex+1));



    }
}
