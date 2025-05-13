import java.util.ArrayList;
import java.util.List;

public class ExporterBuilder {
    private ExportConfig config;
    private List<Persoana> list;

    public ExporterBuilder() {
        config = null;
        list = null;
    }

    public void setConfig(ExportConfig config) {
        this.config = new ExportConfig(config.getFilename());
    }

    public void setList(List<Persoana> list) {
        this.list = new ArrayList<>(list);
    }

    public Exporter getExporter(){
        return new Exporter(config, list);
    }
}
