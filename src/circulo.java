import java.util.Locale;
import java.util.Scanner;

public class circulo {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        double pi,raio ,area;
        pi=3.14159265359;
        Scanner sc=new Scanner(System.in);

        pi=3.14159;

        System.out.print("Digite o Raio:");
        raio=sc.nextDouble();
        System.out.println("O raio e de :"+raio);
        area=pi*(Math.pow(raio,2));
        System.out.printf("O area e de: %.4f%n",area);

    }
}
