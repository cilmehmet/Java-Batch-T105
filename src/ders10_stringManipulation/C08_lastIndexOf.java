package ders10_stringManipulation;

public class C08_lastIndexOf {

    public static void main(String[] args) {

        String str = "Java hafiften beyin yakiyor";

        str.lastIndexOf("a");

        System.out.println(str.lastIndexOf("a"));

        System.out.println(str.lastIndexOf('e'));

        System.out.println(str.lastIndexOf("Java"));

        System.out.println(str.lastIndexOf("java"));

        System.out.println(str.lastIndexOf("e",14));

    }
}
