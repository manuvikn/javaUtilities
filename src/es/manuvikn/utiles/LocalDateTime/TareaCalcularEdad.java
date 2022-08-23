package es.manuvikn.utiles.LocalDateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class TareaCalcularEdad {

    public static void main(String[] args) {

        LocalDate ldt = LocalDate.of(2001, Month.MAY, 17);
        Period p = Period.between(ldt, LocalDate.now());

        System.out.printf("Han pasado %s años desde que naciste", p.getYears());

    }
}
