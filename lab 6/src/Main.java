public class Main
{
    public static void main(String[] args)
    {
        Calculator calculator =new Calculator();

        calculator.adunare(7);
        calculator.inmultire(2);

        System.out.println(calculator.getResult());

        AdvancedCalculator advancedCalculator = new AdvancedCalculator();

        advancedCalculator.adunare(8);
        advancedCalculator.radical();
        advancedCalculator.exponent(1.53);

        System.out.println(advancedCalculator.getResult());

        System.out.println(
                new Calculator(3)
                        .scadere(2)
                        .inmultire(2)
                        .getResult()
        );
    }
}
