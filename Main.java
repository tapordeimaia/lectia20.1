import auto.Auto;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Auto> autoSet = new HashSet<>();
        Auto auto1 = new Auto(0, "BMW", "Series3");
        Auto auto2 = new Auto(0, "BMW", "Series3");
        autoSet.add(auto1);
        autoSet.add(auto2);
        System.out.println(autoSet);
    }
}