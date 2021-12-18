import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */


        Student student1 = new Student();
        student1.imie = "adam";
        student1.nazwisko = "jeden";
        student1.wiek = 22;
        student1.czyAktywny = true;

        Student student2 = new Student();
        student2.imie = "adam";
        student2.nazwisko = "jeden";
        student2.wiek = 22;
        student2.czyAktywny = true;

        Student student3 = new Student();
        student3.imie = "adam";
        student3.nazwisko = "jeden";
        student3.wiek = 22;
        student3.czyAktywny = true;

    }



}
