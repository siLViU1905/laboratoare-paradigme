import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("text.txt");
        Scanner scan = null;

        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Map<Persoana, Integer> map = new HashMap<>();
        while (scan.hasNext())
        {
           Persoana persoana = new Persoana(scan.next(),scan.next());
           if(map.containsKey(persoana))
              map.put(persoana,  map.get(persoana)+1);
           else
               map.put(persoana, 1);
        }

        for (Map.Entry<Persoana, Integer> entry : map.entrySet())
            if(entry.getValue()>=3)
                System.out.println(entry.getKey());
    }
}
