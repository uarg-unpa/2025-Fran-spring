package tp2;

class Alumno {
    private String nombre;
    private String apellido;
    private int legajo;

    public Alumno(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public void mostrarDatos() {
        System.out.println("Alumno: " + nombre + " " + apellido + " (Legajo: " + legajo + ")");
    }
}

class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void leer() {
        System.out.println("Leyendo \"" + titulo + "\" de " + autor);
    }
}

class Cancion {
    private String titulo;
    private String artista;

    public Cancion(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public void reproducir() {
        System.out.println("Reproduciendo canción: " + titulo + " - " + artista);
    }
}

class Mascota {
    private String nombre;
    private String especie;

    public Mascota(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public void jugar() {
        System.out.println(nombre + " está jugando.");
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Cristian", "Castillo", 14609421);
        Libro l1 = new Libro("Impostor Syndrome", "IDW Publishing");
        Cancion c1 = new Cancion("Enter Sandman", "Metallica");
        Mascota m1 = new Mascota("Rocky", "Perro");

        a1.mostrarDatos();
        l1.leer();
        c1.reproducir();
        m1.jugar();
    }
}
