import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Persoana> list = Persoana.read("nume.txt");

        list.sort(new Comparator<Persoana>() {
            @Override
            public int compare(Persoana o1, Persoana o2) {
                return o1.getNume().compareTo(o2.getNume());
            }
        });

        for (Persoana persoana : list)
            System.out.println(persoana);

        Persoana.write(list,"out.txt");

    }

}
