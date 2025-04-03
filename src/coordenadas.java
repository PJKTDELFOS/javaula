import java.util.Scanner;

public class coordenadas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x,y;

        System.out.print("DIGITE A PRIMEIRA COORDENADA: ");
        x = sc.nextDouble();
        System.out.print("DIGITE A SEGUNDA COORDENADA: ");
        y = sc.nextDouble();
        while (x!=0 && y!=0){
            if (x>0 && y>0){
                System.out.println("primeiro quadrante: ");
            }
            else if (x>0 && y<0){
                System.out.println("quarto quadrante: ");
            }
            else if (x<0 && y>0){
                System.out.println("segundo quadrante: ");
            }
            else if (x<0 && y<0){
                System.out.println("terceiro quadrante: ");

            }
            System.out.print("DIGITE A PRIMEIRA COORDENADA: ");
            x = sc.nextDouble();
            System.out.print("DIGITE A SEGUNDA COORDENADA: ");
            y = sc.nextDouble();


        }
        System.out.print("coordenada nula: ");
    }
}
