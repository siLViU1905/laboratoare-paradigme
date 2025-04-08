import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void adunare() {
        Calculator calculator = new Calculator(43);

        calculator.adunare(-3);

        assertEquals(40.0,calculator.getResult());
    }

    @org.junit.jupiter.api.Test
    void scadere() {
        Calculator calculator = new Calculator(1.0);

        calculator.scadere(-6.0);

        assertEquals(7.0, calculator.getResult());
    }

    @org.junit.jupiter.api.Test
    void inmultire() {
        Calculator calculator = new Calculator();

        calculator.inmultire(5.0);

        assertEquals(0.0,calculator.getResult());
    }

    @org.junit.jupiter.api.Test
    void impartire() {
        Calculator calculator = new Calculator(3.0);

       calculator.impartire(2.0);

       assertEquals(1.5,calculator.getResult());
    }
}