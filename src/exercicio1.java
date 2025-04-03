import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int num;

        System.out.print("Digite um numero: ");
        num = sc.nextInt();

        if (num <0){
            System.out.println("negativo");
        }
        else {
            System.out.println("Positvo");
        }
        sc.close();
    }
}
