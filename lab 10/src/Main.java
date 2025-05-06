import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = getNames();
       //1
        names.stream()
                .filter((name) -> name.length() > 4)
                .forEach((nume) -> System.out.println(nume));

        //2
        names.stream()
                .map((nume) -> nume.length())
                .forEach((lungime) -> System.out.println(lungime));

        //3
         System.out.println(names.stream()
                .reduce("", (acumulator, nume) -> acumulator + nume + ", "));

        //4
         System.out.println(names.stream()
                 .filter((nume) -> nume.length() < 5)
                 .map((nume) -> nume.toLowerCase())
                 .reduce("", (acumulator, nume) -> acumulator + nume + " "));
    }

    private static List<String> getNames()
    {
        return Arrays.asList(
                "Alex",
                "Vasile",
                "Ion"
        );
    }
}