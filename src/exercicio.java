import java.util.Locale;
import java.util.Scanner;

public class exercicio {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int x , y;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero x: ");
        x=sc.nextInt();
        System.out.print("Digite um numero y: ");
        y=sc.nextInt();

        int soma = x+y;

        System.out.println("a soma dos numeros x e y e: "+soma);



    }
}
