package yo;

public class DigitsPrinter {
    public static void main (String[] args) {
        int n = 13569;
        int n1 = 24;
        int n2 = 987654321;
        System.out.println (n / 10000 % 10 );
        System.out.println (n / 1000 % 10 );
        System.out.println (n / 100 % 10 );
        System.out.println (n / 10 % 10 );
        System.out.println (n % 10 );
        System.out.println ("____________________");
        System.out.println (n1 / 10000 % 10 );
        System.out.println (n1 / 1000 % 10 );
        System.out.println (n1 / 100 % 10 );
        System.out.println (n1 / 10 % 10 );
        System.out.println (n1 % 10);
        System.out.println ("____________________");
        System.out.println (n2 % 10 );
        System.out.println (n2 / 10 % 10 );
        System.out.println (n2 / 100 % 10 );
        System.out.println (n2 / 1000 % 10 );
        System.out.println (n2 /10000 % 10);
    }
}
