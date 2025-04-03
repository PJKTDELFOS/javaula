import java.util.Scanner;

public class combustivel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// posso inicializar a  variavel direto na declaração
        int gasolina = 1, etanol = 2, diesel = 3, encerrar = 4, acao = 0, contgas, contetanol, contdiesel;

        contgas = 0;
        contetanol = 0;
        contdiesel = 0;
        while (!(acao == encerrar)) {
            System.out.print("Digite a Açao: ");
            acao = sc.nextInt();


            if (acao == gasolina) {
                contgas++;
                System.out.println("Gasolina: " + contgas);
            } else if (acao == diesel) {
                contdiesel++;
                System.out.println("Diesel: " + contdiesel);

            } else if (acao == etanol) {
                contetanol++;
                System.out.println("Etanol: " + contetanol);

            }
            if ((acao != encerrar && acao != gasolina && acao != etanol && acao != diesel)) {
                System.out.println("digite uma opção correta 1-gasolina,2-etanol,3-diesel,4-encerrar!");
            }

        }
        System.out.println("contador de gasolina: " + contgas);
        System.out.println("contador de etanol: " + contetanol);
        System.out.println("contador de diesel: " + contdiesel);

    }
}



