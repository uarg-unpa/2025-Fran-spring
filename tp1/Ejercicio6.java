package tp1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("== Forma 1: tres variables ==");
        System.out.print("Ingrese num1: ");
        int num1 = scan.nextInt();
        System.out.print("Ingrese num2: ");
        int num2 = scan.nextInt();
        System.out.print("Ingrese num3: ");
        int num3 = scan.nextInt();

        int suma = num1 + num2 + num3;
        int producto = num1 * num2 * num3;

        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + producto);

        System.out.println("\n== Forma 2: una sola variable ==");
        suma = 0;
        producto = 1;
        int cont = 1;

        while (cont <= 3) {
            System.out.print("Ingrese número " + cont + ": ");
            int num = scan.nextInt();
            suma += num;
            producto *= num;
            cont++;
        }

        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + producto);

        scan.close();
    }
}
