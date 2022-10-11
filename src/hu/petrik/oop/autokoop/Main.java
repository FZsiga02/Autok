package hu.petrik.oop.autokoop;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Auto> autok = new ArrayList<>();

    public static void main(String[] args) {
        Porsche porsche1 = new Porsche(100);
        Tesla tesla1 = new Tesla(90);

        Auto auto = new Auto() {
            @Override
            public void gyorsul() {
            }

            @Override
            public double getSebesseg() {
                return 0;
            }
        };

        autok.add(porsche1);
        autok.add(tesla1);

        for (Auto a: autok){
            System.out.println(a.getSebesseg());
            a.gyorsul();
            System.out.println(a.getSebesseg());

        }


    }
}
