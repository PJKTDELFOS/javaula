import java.util.Scanner;

public class aulafor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int soma=0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
           soma=soma+x;
            System.out.println("dentro do for"+soma);

        }
        System.out.println("fora do for"+soma);


        sc.close();
    }
}
