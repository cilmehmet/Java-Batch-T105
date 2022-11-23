package ders43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {

    public static void main(String[] args) {

        Deque<String> dq1 = new LinkedList<>();

        dq1.add("K");
        dq1.add("B");
        dq1.addLast("F");
        dq1.addFirst("A");

        System.out.println(dq1.getFirst());
        System.out.println(dq1.getLast());

        System.out.println(dq1.remove());
        System.out.println(dq1.poll());
        System.out.println(dq1.removeLast());
        System.out.println(dq1.remove());

        // dq1.remove();
        System.out.println(dq1.poll());
        // bos deque olmasina ragmen exception firlatmaz, eleman silemedigi icin bize null dondurur.

        dq1.add("K");
        dq1.add("B");

        dq1.push("F");

        // deque'in basina eleman ekler.
        // eger deque ile ilgili sinirlendirma varsa ve yer kalmadisa
        // illegalStateException verir.

        System.out.println("pop : " + dq1.pop());
        // F ile elementi siler ve bize dondurur removeFrist() ile ayni islemi yapar.

        System.out.println(dq1.peek());
        // ilk elementi silmeden bize dondurur. Bos deque'de calisirsa null döner.
        System.out.println(dq1.peekFirst());
        System.out.println(dq1.peekLast());

        System.out.println(dq1.offer("C"));
        System.out.println(dq1.offerFirst("M"));

        System.out.println(dq1);
    }
}