package ders27_immutableClasses_DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class C07_PeriodOf {

    public static void main(String[] args) {

        // Dogumunuzdan bu gune nekadar zaman gecmistir ?

        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunu = LocalDate.of(1997,02,17);

        Period gecenSure = Period.between(dogumGunu,bugun);

        System.out.println(gecenSure);

        System.out.println(gecenSure.getYears());
    }
}
