package kostka;

import java.util.Random;

public class main {
    public static void main(String[] args) {

        Random random = new Random();
        int rzut = random.nextInt(6);
        rzut += 1;
        System.out.println("Wyrzuciles: " + rzut);
        grafika kostka = new grafika();

        if(rzut == 1){
            kostka.jeden();
        }
        else if(rzut == 2){
            kostka.dwa();
        }
        else if(rzut == 3){
            kostka.trzy();
        }
        else if(rzut == 4){
            kostka.cztery();
        }
        else if(rzut == 5){
            kostka.piec();
        }
        else if(rzut == 6){
            kostka.szesc();
        }
    }
}
