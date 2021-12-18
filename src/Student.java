public class Student {

    /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */


    private String imie;
    private String nazwisko;
    private Integer indeks;

    Osoba osoba;
    Wydzial.WydzialEnum wydzial;

    public Student() {
        this.osoba = new Osoba(imie,nazwisko,indeks);

    }

    public Student(String imie, String nazwisko, Integer indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }



    public Student(Osoba osoba, Wydzial.WydzialEnum wydz) {
        this.osoba = osoba;
        this.wydzial = wydz;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Integer getIndeks() {
        return indeks;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setIndeks(Integer indeks) {
        this.indeks = indeks;
    }

    @Override
    public String toString() {
        return "Dane studenta: {"
                + imie + " ,Nazwisko" + nazwisko +
                ", Indeks=" + indeks +
                '}';
    }
}
