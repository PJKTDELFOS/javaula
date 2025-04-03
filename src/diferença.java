import java.util.Locale;
import java.util.Scanner;

public class diferença {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        int x,y,w,z,produto1,produto2,diferenca;

        System.out.print("Digite x:");
        x=sc.nextInt();
        System.out.print("Digite y:");
        y=sc.nextInt();
        System.out.print("Digite w:");
        w=sc.nextInt();
        System.out.print("Digite z:");
        z=sc.nextInt();
        produto1=x*y;
        System.out.println("a soma de x e y=" + produto1);
        produto2=w*z;
        System.out.println("a soma de w e z=" + produto2);
        diferenca=produto1-produto2;
        System.out.println("a diferenca=" + diferenca);

        sc.close();


    }
}
