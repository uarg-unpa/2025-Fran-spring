package PRACTICA;

import java.util.Scanner;

class ColaNombres {
    private String[] elementos;
    private int frente, fin, cantidad;
    private final int MAX = 10;

    public ColaNombres() {
        elementos = new String[MAX];
        frente = 0;
        fin = -1;
        cantidad = 0;
    }

    public boolean estaVacia() {
        return cantidad == 0;
    }

    public boolean estaLlena() {
        return cantidad == MAX;
    }

    public void encolar(String nombre) {
        if (!estaLlena()) {
            fin = (fin + 1) % MAX;
            elementos[fin] = nombre;
            cantidad++;
        } else {
            System.out.println("La cola está llena. No se puede encolar más nombres.");
        }
    }

    public String desencolar() {
        if (!estaVacia()) {
            String primero = elementos[frente];
            frente = (frente + 1) % MAX;
            cantidad--;
            return primero;
        } else {
            System.out.println("La cola está vacía. No se puede desencolar.");
            return null;
        }
    }

    public String peek() {
        if (!estaVacia()) {
            return elementos[frente];
        } else {
            System.out.println("La cola está vacía. No hay frente.");
            return null;
        }
    }

    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("[cola vacía]");
        } else {
            System.out.print("Cola circular: ");
            for (int i = 0; i < cantidad; i++) {
                int indice = (frente + i) % MAX;
                System.out.print(elementos[indice] + " ");
            }
            System.out.println();
        }
    }
}

public class MainColaNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaNombres cola = new ColaNombres();
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("=== MENÚ COLA DE NOMBRES ===");
            System.out.println("1. Encolar nombre");
            System.out.println("2. Desencolar nombre");
            System.out.println("3. Ver nombre en frente (peek)");
            System.out.println("4. Mostrar cola");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("Ingrese un nombre: ");
                String nombre = sc.nextLine();
                cola.encolar(nombre);
            } else if (opcion == 2) {
                String quitado = cola.desencolar();
                if (quitado != null) {
                    System.out.println("Nombre desencolado: " + quitado);
                }
            } else if (opcion == 3) {
                String frente = cola.peek();
                if (frente != null) {
                    System.out.println("Nombre al frente: " + frente);
                }
            } else if (opcion == 4) {
                cola.mostrarCola();
            } else if (opcion == 5) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida.");
            }
        }
        sc.close();
    }
}
