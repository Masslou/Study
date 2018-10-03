package classwork.cw9;

import java.util.ArrayList;
import java.util.List;

public class Collect {
    public static void main(String[] args) {


        List <String> planets = new ArrayList<>();

        planets.removeIf(e -> planets.equals(e));
    }
}
