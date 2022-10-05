package hu.petrik.sokszogoop;

import java.util.ArrayList;
import java.util.Random;

public class Sokszogek {
    private static ArrayList<Sokszog> list = new ArrayList<>();

    public Sokszogek() {
        Random rnd = new Random();
        Random random = new Random();
        int szam = rnd.nextInt(3) + 1;
        int randomLista = rnd.nextInt(8) + 1;

        for (int i = 0; i < randomLista; i++) {
            if (szam == 1) {
                list.add(new Teglalap());
            } else if (szam == 2) {
                list.add(new Haromszog());
            } else {
                list.add(new Paralelogramma());
            }
        }


    }
    // Osszead Terulet


}


