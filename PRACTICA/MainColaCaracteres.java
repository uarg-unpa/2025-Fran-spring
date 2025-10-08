package PRACTICA;

import java.util.Scanner;

class ColaCaracteres {
    private char[] elementos;
    private int finalCola;
    private final int MAX = 10;

    public ColaCaracteres() {
        elementos = new char[MAX];
        finalCola = 0;
    }

    public boolean estaVacia() {
        return finalCola == 0;
    }

    public boolean estaLlena() {
        return finalCola == MAX;
    }

    public void encolar(char c) {
        if (!estaLlena()) {
            elementos[finalCola] = c;
            finalCola++;
        } else {
            System.out.println("La cola está llena. No se puede encolar más elementos.");
        }
    }

    public char desencolar() {
        if (!estaVacia()) {
            char primero = elementos[0];
            for (int i = 0; i < finalCola - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            finalCola--;
            return primero;
        } else {
            System.out.println("La cola está vacía. No se puede desencolar.");
            return '\0';
        }
    }

    public char peek() {
        if (!estaVacia()) {
            return elementos[0];
        } else {
            System.out.println("La cola está vacía. No hay frente.");
            return '\0';
        }
    }

    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("[cola vacía]");
        } else {
            System.out.print("Cola: ");
            for (int i = 0; i < finalCola; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }
}

public class MainColaCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaCaracteres cola = new ColaCaracteres();
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("=== MENÚ COLA DE CARACTERES ===");
            System.out.println("1. Encolar carácter");
            System.out.println("2. Desencolar carácter");
            System.out.println("3. Ver carácter en frente (peek)");
            System.out.println("4. Mostrar cola");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese un solo carácter: ");
                String entrada = sc.next();

                if (entrada.length() == 1) {
                    char comando = entrada.charAt(0);
                    cola.encolar(comando);
                } else {
                    System.out.println("Error: debe ingresar solo un carácter.");
                }

            } else if (opcion == 2) {
                char quitado = cola.desencolar();
                if (quitado != '\0') {
                    System.out.println("Comando desencolado: " + quitado);
                }

            } else if (opcion == 3) {
                char frente = cola.peek();
                if (frente != '\0') {
                    System.out.println("Comando al frente: " + frente);
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
