import java.util.Locale;
import java.util.Scanner;

public class exerciciosenha
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int senha, erros=3, senhasistema=1999;

        while (erros>0)
        {
            System.out.print("Digite sua senha: ");
            senha = sc.nextInt();
            if(senha==senhasistema)
            {
                System.out.println("acesso ao sistema!");
                break;
            }
            else{
                erros--;
                if (erros==0)
                {
                    System.out.println("Sistema bloqueado por erros!");
                }
                else
                {
                    System.out.println("tentativas restantes!"+erros);
                }
            }

        }


    }


}
