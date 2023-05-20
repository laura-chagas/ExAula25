package ExercicioUm;

import ExercicioUm.Azul;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Azul blueColor = new Azul(1);


        System.out.println("DIGITE 1");
        int decisao1 = scan.nextInt();

        while (decisao1 == 1) {

            System.out.println("A tonalidade da cor vai de 1 a 4");
            System.out.println("---------------------------------");
            System.out.println("A COR " + blueColor.getCor() + " ESTÁ NO TOM " + blueColor.getTonalidade());
            System.out.println("---------------------------------");
            System.out.println("Você deseja: \n1 - MAIS ESCURO \n2 - MAIS CLARO");
            int decisao2 = scan.nextInt();

            switch (decisao2) {
                case 1:
                    blueColor.tornarMaisEscuro();
                    break;
                case 2:
                    blueColor.tornarMaisClaro();
                    break;
                default:
                    System.out.println("ERROR");
                    System.exit(0);
            }

            System.out.println("Digite: \n1- Para trocar o tom \n2 - Para encerrar ");
            decisao1 = scan.nextInt();
            System.out.println("---------------------------------");
        }
    }
}