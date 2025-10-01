package tp1;

public class Ejercicio2 {
    public static void main(String[] args) {
        int A = 5, B = 3, X;
        double C = 7.5, D = 2.0, Y;


        System.out.println("X = A / B -> " + (X = A / B));
        System.out.println("X = (int)(A*D)/(int)(C/A) -> " + (X = (int)(A * D) / (int)(C / A)));
        System.out.println("Y = A / B -> " + (Y = A / B));
        System.out.println("Y = (double)(A/B) -> " + (Y = (double)(A / B)));
        System.out.println("Y = (double)A*D/(int)C -> " + (Y = (double)A * D / (int)C));
        System.out.println("Y = (double)A*D -> " + (Y = (double)A * D));
        System.out.println("Y = (double)(A*D)/(C*(int)D) -> " + (Y = (double)(A * D) / (C * (int)D)));
        System.out.println("Y = A*(int)D -> " + (Y = A * (int)D));
        System.out.println("Y = (int)(A*(int)D) -> " + (Y = (int)(A * (int)D)));
    }
}