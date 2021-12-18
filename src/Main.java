import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */
        Punkt punktA = new Punkt(7);
        punktA.toString();
        System.out.println(punktA.toString());

        Punkt punkt = new Punkt(1,2,3);
        punktA.toString();
        System.out.println(punktA.toString());

        punktA.setpX(4);
        punktA.toString();
        System.out.println(punktA.toString());

        System.out.printf("pX = %d \n", punktA.getpX());
        System.out.printf("x = %d , y = %d , pX = %d\n", punkt.getpX(), punkt.getpY(), punkt.getpX());
        System.out.println("Suma punktuA: " + punktA.Suma() + "\n");
        System.out.println("Suma punktu: " + punkt.Suma() + "\n");
        System.out.println("Roznica punktuA: " + punktA.Roznica() + "\n");
        System.out.println("Roznica punktu: " + punkt.Roznica() + "\n");
    }
}