public class AdvancedCalculator extends Calculator
{
    public AdvancedCalculator()
    {
        super();
    }

    public AdvancedCalculator(double x)
    {
        super(x);
    }

    public void radical()
    {
        if(rezultat>=0.0)
        rezultat = Math.sqrt(rezultat);
        else
            throw new RuntimeException("Numar negativ");
    }

    public void exponent(double x)
    {
        rezultat = Math.pow(rezultat,x);
    }
}
