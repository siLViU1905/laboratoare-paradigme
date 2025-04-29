import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Persoana> persoane= getPersons();

        export(persoane, new ExportToConsole());

        export(persoane,  list ->
                System.out.println("Lambda export")
                );
    }

    public static void export(List<Persoana> persoane, Exporter exporter)
    {
        exporter.export(persoane);
    }

    public static List<Persoana> getPersons()
    {
        List<Persoana> list= new ArrayList<>();

        list.add(new Persoana(18, "Abc", "Efg"));
        list.add(new Persoana(25, "Xyz", "Wvx"));

        return list;
    }

}