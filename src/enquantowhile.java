import java.util.Locale;
import java.util.Scanner;

public class enquantowhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, soma;

         System.out.print("Digite um numero: ");
         x = sc.nextInt();

         soma=0;
         while (x!=0)
         {
             soma +=x;
             System.out.print("Digite um numero: ");
             x = sc.nextInt();
         }
            System.out.println("o valor da soma e:"+soma);

         sc.close();

    }
}
