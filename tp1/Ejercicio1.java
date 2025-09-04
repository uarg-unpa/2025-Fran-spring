package tp1;

public class Ejercicio1 {
    public static void main(String[] args) {
        int A = 5, B = 3, R1;
        double C = 2.5, D = 2.0, R2;


        System.out.println("R1 = A / B -> " + (R1 = A / B));
        System.out.println("R2 = A / C -> " + (R2 = A / C));
        System.out.println("R2 = A * D -> " + (R2 = A * D));
        System.out.println("R1 = A * (int)D -> " + (R1 = A * (int)D));
        System.out.println("R1 = (int)(C * D) -> " + (R1 = (int)(C * D)));
        System.out.println("A++ -> " + (A++));
        System.out.println("A final -> " + A);
        B = A++;
        System.out.println("B = A++ -> B=" + B + ", A=" + A);
    }
}