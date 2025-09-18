package tp1; 

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A, B, C, aux;

        System.out.print("Ingrese A: ");
        A = scan.nextInt();
        System.out.print("Ingrese B: ");
        B = scan.nextInt();
        System.out.print("Ingrese C: ");
        C = scan.nextInt();

        aux = C;   
        B = A;     
        C = A;
        A = aux;

        System.out.println("Ahora B=" + B + ", C=" + C + ", A=" + A);
        scan.close();
    }
}
