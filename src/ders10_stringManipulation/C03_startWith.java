package ders10_stringManipulation;

public class C03_startWith {

    public static void main(String[] args) {

        String str = "mantı acarken java ogrenilmiz";

        System.out.println(str.startsWith("manti"));

        System.out.println(str.startsWith("m"));

        System.out.println(str.startsWith("mantı acarken java ogrenilmiz"));

        System.out.println(str.startsWith(""));

        System.out.println(str.startsWith("acarken", 6));

        System.out.println(str.startsWith("manti",0));
    }
}
