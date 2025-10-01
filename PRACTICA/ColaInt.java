package PRACTICA;

public class ColaInt {

    private int[] elementos; 
    private int frente;
    private int fin;
    private final int MAX = 10; 

    public ColaInt() {
        elementos = new int[MAX];
        frente = 0; 
        fin = 0;   
    }

    public boolean estaVacia() {
        if (frente == fin) {
            return true;
        } else {
            return false;
        }
    }

    public boolean estaLlena() {
        if (fin == MAX) {
            return true;
        } else {
            return false;
        }
    }

    public void meter(int elem) {
        if (estaLlena()) {
            System.out.println("No se puede meter, la cola está llena.");
        } else {
            elementos[fin] = elem;
            fin++;
        }
    }

    public int desencolar() {
        int aux = elementos[frente];
        for (int i = 0; i < fin - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        fin--;
        return aux;
    }

    public int peek() {
        return elementos[frente];
    }

    public int cantidad() {
        return fin - frente;
    }
}
