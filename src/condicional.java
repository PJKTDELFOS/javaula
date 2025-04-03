import java.util.Locale;
import java.util.Scanner;

public class condicional
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.print("Introduzca hora: ");
        hora = sc.nextInt();

        if (hora >= 0 && hora <= 12)
        {
            System.out.print("BOm dia ");
        }
        else if (hora >= 12 && hora <= 18)
        {
            System.out.print("boa tarde ");
        }
        else if (hora >18){
            System.out.print("boa noite ");
    }

    }

}
