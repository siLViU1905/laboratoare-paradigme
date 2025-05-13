import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExportConfig config1 = new ExportConfig("f1.txt");
        ExportConfig config2 = new ExportConfig("f2.txt");

        ExporterBuilder exporterBuilder = new ExporterBuilder();

        exporterBuilder.setConfig(config1);

        List<Persoana> persoane = new ArrayList<>();

        persoane.add(new Persoana("Alex", "Pop"));
        persoane.add(new Persoana("Vasile", "Ion"));

        exporterBuilder.setList(persoane);

        Exporter exporter1 = exporterBuilder.getExporter();

        persoane.add(new Persoana("Ion", "Abc"));

        exporterBuilder.setList(persoane);

        Exporter exporter2 = exporterBuilder.getExporter();

        exporter1.export();

        exporter2.export();
    }
}