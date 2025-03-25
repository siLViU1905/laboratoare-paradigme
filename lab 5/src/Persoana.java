import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Persoana
{
    private String prenume,nume;
    private int varsta;

    public Persoana(String prenume, String nume, int varsta)
    {
        this.prenume = prenume;
        this.nume = nume;
        this.varsta=varsta;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public static List<Persoana> read(String fileName)
    {
        File file = new File(fileName);
        Scanner scan = null;
        try
        {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Persoana> list = new ArrayList<>();
        while(scan.hasNext())
            list.add(new Persoana(scan.next(),scan.next(),scan.nextInt()));
        return list;
    }

    public static void write(List<Persoana> list, String fileName)
    {
        try(FileWriter fileWriter = new FileWriter(fileName))
        {
            PrintWriter out = new PrintWriter(fileWriter);
            for (Persoana persoana : list)
                out.println(persoana);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public String toString()
    {
        return prenume + " " + nume + " " + Integer.toString(varsta);
    }
}
