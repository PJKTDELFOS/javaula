import java.util.Scanner;

public class exc2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Insira um numero: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.print("par");
        }
        else{
            System.out.print("impar");
        }
        sc.close();
    }
}
