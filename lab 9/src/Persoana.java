import java.util.ArrayList;
import java.util.List;

public class Persoana {
    private String nume;
    private String prenume;
    private int varsta;

    public Persoana()
    {
        varsta = 0;
    }

    public Persoana(int varsta, String prenume, String nume) {
        this.varsta = varsta;
        this.prenume = prenume;
        this.nume = nume;
    }

    public String getPrenume()
    {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                '}';
    }

}
