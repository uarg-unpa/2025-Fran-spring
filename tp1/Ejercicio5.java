package tp1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el día (L, M, I, J, V, S, D): ");
        char dia = scan.next().toUpperCase().charAt(0);

        switch (dia) {
            case 'M':
            case 'I':
            case 'J':
                System.out.println("HOY TENGO RESOLUCION");
                break;
            case 'V':
            case 'S':
            case 'D':
            case 'L':
                System.out.println("Hoy no hay resolución.");
                break;
            default:
                System.out.println("Día inválido.");
                break;
        }

        scan.close();
    }
}
