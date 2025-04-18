import java.util.Locale;
import java.util.Scanner;

public class excefor2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        double a,b,c,pond;

        for (int i = 0; i < n; i++) {
                System.out.println("Enter number a: ");
                a = sc.nextDouble();
                System.out.println("Enter number b: ");
                b = sc.nextDouble();
                System.out.println("Enter number c: ");
                c = sc.nextDouble();
                pond=((a*2)+(b*3)+(c*5))/(2+3+5);
                System.out.printf("resultado: %.1f\n",pond);

        }

    }
}
