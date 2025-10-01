package PRACTICA;

public class PilaEnteros {
    private int[] elementos; // Array para almacenar los elementos
    private int cima;
    private final int MAX = 10; // Capacidad máxima de la pila

    // Constructor: inicializa el array y la cima
    public PilaEnteros() {
        elementos = new int[MAX];
        cima = -1; // Completar: inicializar cima
    }

   public boolean estaVacia() {
    // Completar: devolver true si cima indica que la pila está vacía
    if (cima == -1) {
        return true;
    } else {
        return false;
    }
    }

   public boolean estaLlena() {
    // Completar: devolver true si cima está en el límite del array
    if (cima == MAX - 1) {
        return true;
    } else {
        return false;
    }
    }

    // Agrega un elemento en la cima (push)
    public void meter(int elem) {
    // Completar: incrementar cima y asignar el elemento
    if (estaLlena()) {
        System.out.println("No se puede meter, la pila está llena.");
    } else {
        cima = cima + 1;
        elementos[cima] = elem;
    }
}
    // Saca y devuelve el elemento de la cima (pop)
public int sacar() {
    // Completar: guardar el elemento de la cima, decrementar cima y devolverlo
    if (estaVacia()) {
        System.out.println("No se puede sacar, la pila está vacía.");
        return -1; // valor de error
    } else {
        int elem = elementos[cima];
        cima = cima - 1;
        return elem;
        }
    }
}