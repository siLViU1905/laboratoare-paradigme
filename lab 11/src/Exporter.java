import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Exporter {
    final ExportConfig config;
    final List<Persoana> list;

    public Exporter(ExportConfig config, List<Persoana> list) {
        this.config = new ExportConfig(config.getFilename());
        this.list = new ArrayList<>(list);
    }

    public List<Persoana> getList() {
        return list;
    }

    public void export() {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new File(config.getFilename()));
            for (Persoana persoana : list)
                writer.println(persoana);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            writer.close();
        }
    }
}
