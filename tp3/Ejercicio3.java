package tp3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase: ");
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        java.util.Stack<Character> pila = new java.util.Stack<>();
        for(char c: arr) pila.push(c);
        StringBuilder rev = new StringBuilder();
        while(!pila.isEmpty()) rev.append(pila.pop());
        System.out.println("Invertida: " + rev.toString());
        sc.close();
    }
}
