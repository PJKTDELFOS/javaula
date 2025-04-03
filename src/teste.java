import java.util.Locale;
import java.util.Scanner;

public class teste {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner =new Scanner(System.in);
        System.out.print("Digite um numero: ");

        int numero=scanner.nextInt();
        System.out.println();

        System.out.print("digite um Float: ");
        float numerod=scanner.nextFloat();

        System.out.println();

        System.out.print("digite um char: ");
        char carac=scanner.next().charAt(0);

        System.out.println();

        System.out.print("Digite um double com 4 casas decimais: ");
        double numerodouble=scanner.nextDouble();

        scanner.nextLine();

        System.out.print("escreva uma frase: ");
        String frase=scanner.nextLine();

        System.out.print("Digite um numero inteiro: ");
        int a =scanner.nextInt();

        System.out.print("digite outro numero inteiro:  ");

        int b= scanner.nextInt();;

        int soma=a+b;



        System.out.println("\nValores inseridos: ");
        System.out.println("Numero inteiro:  "+ numero);
        System.out.printf("Numero Float: %.2f\n ",numerod);// nao usar concatenaçao nesse caso de  formatação
        System.out.println("Caracter: "+carac);
        System.out.printf("Numero double: %.4f\n",numerodouble);
        System.out.println("frase: "+frase);
        System.out.println("o numero a  digitado foi:"+a);
        System.out.println("o numero b digitado foi:"+b);
        System.out.println("a soma dos numeros foi:"+soma);



        scanner.close();



    }
}
