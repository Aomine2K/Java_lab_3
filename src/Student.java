public class Student {
        String imie;
        String nazwisko;
        int wiek;
        boolean czyAktywny;

        public Student(String imie,String nazwisko, int wiek, boolean czyAktywny){

         this.imie = imie;
         this.nazwisko = nazwisko;
         this.wiek = wiek;
         this.czyAktywny = czyAktywny;
        }


        public void pokazListe(){

            System.out.print("Imie:"+ imie + " " + "Nazwisko:" + nazwisko+"  "
                    + " Wiek:"+wiek+ "" + " Obecny:"+ czyAktywny);
            System.out.println();
        }
}



