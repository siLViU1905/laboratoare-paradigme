public class Persoana
{
    public String nume;
    public String prenume;

    public Persoana(String prenume, String nume)
    {
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    public int hashCode()
    {
        return nume.hashCode() ^ prenume.hashCode();
    }

    @Override
    public boolean equals(Object o)
    {
        String str = nume+prenume;
        Persoana other=(Persoana)o;
        String str2 = other.nume+other.prenume;
        return str.equals(str2);
    }

    @Override
    public String toString()
    {
       return prenume + " " + nume;
    }
}
