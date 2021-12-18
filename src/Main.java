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
        Student[] tablica;

        tablica = new Student[3];

        tablica[0] = new Student("Adam","Kowalski",22,true);

        tablica[1] = new Student("Janko","Muzykant",21,true);

        tablica[2] = new Student("Marek","Polak",26,false);


        System.out.println("Aktualna lista:");

        for(int i=0; i<tablica.length; i++)
        {
            tablica[i].pokazListe();
        }

    }



}
