import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class ExportToFile implements Exporter{
    private String filepath;

    public ExportToFile(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public void export(List<Persoana> persoane) {
        try {
            PrintWriter printWriter = new PrintWriter(filepath);

            for (Persoana persoana : persoane)
                printWriter.println(persoana);

            printWriter.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
