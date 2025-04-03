import java.util.Scanner;

public class exccio4 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
         int horainicial,horafinal,duracao;

         System.out.print("Digite a hora do começo: ");
         horainicial = sc.nextInt();
         System.out.print("Digite a hora do final: ");
         horafinal = sc.nextInt();

         if (horainicial < horafinal) {
             duracao = horafinal - horainicial;
         }
         else{
             duracao = 24-horainicial + horafinal;
         }

         System.out.printf("O jogo teve a duração de : %d horas\n", duracao);


    }
}
