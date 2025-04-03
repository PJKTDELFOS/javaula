import java.util.Locale;
import java.util.Scanner;

public class excs5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double codigo, precounitario, precototal;
        int qtde;


        System.out.print("Digite o Codigo do produto: ");
        codigo = sc.nextDouble();

        if (codigo == 1) {
            precounitario = 4.50;
            System.out.print("Voce escolheu cachoro quente R$:" + precounitario + "\n");
            System.out.print("Quantidade:");
            qtde = sc.nextInt();
            precototal = precounitario * qtde;
            System.out.print("Valor total R$: " + precototal);

        } else if (codigo == 2) {
            precounitario = 3.85;
            System.out.print("Voce escolheu x-egg R$:" + precounitario + "\n");
            System.out.print("Quantidade:");
            qtde = sc.nextInt();
            precototal = precounitario * qtde;
            System.out.print("Valor total R$: " + precototal);

        } else if (codigo == 3) {
            precounitario = 4.00;
            System.out.print("Voce escolheu xsalada R$:" + precounitario + "\n");
            System.out.print("Quantidade:");
            qtde = sc.nextInt();
            precototal = precounitario * qtde;
            System.out.print("Valor total R$: " + precototal);
        } else if (codigo == 4) {
            precounitario = 4.75;
            System.out.print("Voce escolheu pudim R$:" + precounitario + "\n");
            System.out.print("Quantidade:");
            qtde = sc.nextInt();
            precototal = precounitario * qtde;
            System.out.print("Valor total R$: " + precototal);

        } else if (codigo == 5) {
            precounitario = 5.65;
            System.out.print("Voce escolheu xbancon R$:" + precounitario + "\n");
            System.out.print("Quantidade:");
            qtde = sc.nextInt();
            precototal = precounitario * qtde;
            System.out.print("Valor total R$: " + precototal);
        }
        sc.close();
    }
}
