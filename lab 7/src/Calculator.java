
    public class Calculator
    {
        protected double rezultat;

        public Calculator()
        {
            rezultat = 0;
        }

        public Calculator(double x)
        {
            rezultat = x;
        }


        public  Calculator adunare(double numar)
        {
                rezultat += numar;
                return this;
        }

        public  Calculator scadere(double numar)
        {
                rezultat-=numar;
                return this;
        }


        public  Calculator inmultire(double numar)
        {
                rezultat*=numar;
                return this;
        }


        public Calculator  impartire(double numar)
        {
          if (numar == 0.0)
              throw new ArithmeticException("Impartire la 0");
            rezultat /= numar;
            return this;
        }


        public double getResult()
        {
            return rezultat;
        }
    }

