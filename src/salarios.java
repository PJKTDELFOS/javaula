import java.util.Locale;
import java.util.Scanner;

public class salarios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // tem que vir de cara , acima de tudo
        Scanner sc=new Scanner(System.in);
        int codigo;
        double horastrabalhadas, salariohora,salario;

        System.out.print("Codigo do funcionario: ");
        codigo=sc.nextInt();
        sc.nextLine();
        System.out.print("Digite as horas trabalhadas: ");
        horastrabalhadas=sc.nextDouble();
        System.out.print("Digite as salario:/hora ");
        salariohora=sc.nextDouble();
        salario=horastrabalhadas*salariohora;
        System.out.printf("O Funcionario: %d Trabalhou %.2f horas, pelo salario hora de R$  %.2f, totalizando um salario" +
                "de R$ %.2f", codigo,horastrabalhadas,salariohora,salario);

        sc.close();


    }
}
