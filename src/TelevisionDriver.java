/*
Ryan Chien
Period 4
Inheritance
TelevisionDriver
 */

import java.util.ArrayList;

public class TelevisionDriver {
    public static void main(String[] args) {
        // create television array
        ArrayList<Television> tvs = new ArrayList<Television>();
        // create and add each television type
        Television regularTv = new Television("box", 19.99);
        tvs.add(regularTv);
        Plasma plasmaTv = new Plasma("flat screen", 99.99);
        tvs.add(plasmaTv);
        DLP dlpTv = new DLP("wide screen", 74.99);
        tvs.add(dlpTv);
        LCD lcdTv = new LCD("desk monitor", 49.99);
        tvs.add(lcdTv);
        LED ledTv = new LED("tall screen", 74.99);
        tvs.add(ledTv);
        // run toString() of each tv
        for (Television tv : tvs) {
            System.out.println(tv.toString());
        }
    }
}
