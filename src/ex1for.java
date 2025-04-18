import java.util.Scanner;

public class ex1for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Digite um numero: ");
        x = sc.nextInt();

        for(int i=1;i<=x;i++){
            if (i%2!=0){
                System.out.println("numero"+i);
            }
        }
    }

}
