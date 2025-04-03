import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double y=10.3657887845;
        Scanner sc = new Scanner(System.in);//entrada de dados
        String x;
        x=sc.next();
        // para digitar primeiro criar a atribuiçao de entrada
        //definir a  variavel que vai receber o dado
        //atribuir por meio de sc.next() a entrada para variavel
        //para inteiro usar nextInt()


        System.out.println("Voce Digitou: " + x);
        System.out.println("ola mundoi!");
        System.out.println(x);
        System.out.printf("%.4f",y);
        System.out.println();
        System.out.printf("%.4f",y);
    }
}

