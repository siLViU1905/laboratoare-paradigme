import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 15; i++)
            lista.add(rand.nextInt(10));

        for (int i = 0; i < 15; i++)
            System.out.println(lista.get(i));

        Set<String> set=new HashSet<>();

        set.add("TEST1");
        set.add("TEST2");
        for(String elemente:set)
            System.out.println(elemente);

    }
}
