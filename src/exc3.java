import java.util.Scanner;

public class exc3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  a,b,resto;

        System.out.println("Digite o primeiro valor: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = sc.nextInt();

        if ((a % b==0 || b%a==0) && (a%2==0) ) {
            System.out.println("multiplos e a e par");
        }
        else if ((a % b==0 || b%a==0) && (a%2!=0) ) {
            System.out.println("multiplos e a e impar");
        }
        else if ((a % b!=0 || b%a!=0) && (a%2==0) ) {
            System.out.println("  nao multiplos e a e par");
        }
        else if ((a % b!=0 || b%a!=0) && (a%2!=0) ) {
            System.out.println(" nao multiplos e a e impar");
        }


        sc.close();


    }
}
