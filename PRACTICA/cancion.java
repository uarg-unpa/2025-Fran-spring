package PRACTICA;

import java.util.Scanner;

// clase cancion
public class cancion {
    private String nombre; 
    private String autor; 
    private double duracion;
    private albumGen albumGen;

    //constructor
    public cancion(String nombre, String autor, double duracion, albumGen albumGen) {
        this.nombre = nombre;
        this.autor = autor;
        this.duracion = duracion; 
        this.albumGen = albumGen;
    }

        //getter y setter
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getAutor() {
            return autor;
        }
        public void setAutor(String autor) {
            this.autor = autor;
        }   
        public double getDuracion() {
            return duracion;
        }
        public void setDuracion(double duracion) {
            this.duracion = duracion;
        }
        public albumGen getAlbumGen() {
            return albumGen;    
        }
        public void setAlbumGen (albumGen albunGen) {
            this.albumGen = albumGen;
        }

        //metodo esLargo
        public boolean esLargo() {
            if (this.duracion > 4.0){
                return true;
            } else {
                return false;
            }            
        }

            //metodo cambiarNombre
            public void cambiarNombre (String nuevoNombre) {
                this.nombre = nuevoNombre;
            }

                //metodo compararArt
                public boolean compararArt () {
                    if (this.autor.equals("duki")){
                        return true;
                    } else {
                        return false;
                    }
                }

                    //metoto toString
                     public String toString(){
                        return "cancion (nombre: " + nombre + ", autor: " + autor + ", duracion: " + duracion + ",album y genero" + albumGen + ")" ;
                     }

                        //creacion de objeto
                     
                        public static void main(String args[]) { 

                            //invocar escaner
                            Scanner sc = new Scanner (System.in);
                            
                            //crear nuevo album
                            System.out.println("ingrese nombre del album");
                            String album = sc.nextLine();
                            sc.nextLine();

                            System.out.println("ingrese genero del album");
                            String genero = sc.nextLine();
                            sc.nextLine();

                            albumGen a1 = new albumGen (album, genero);
                            System.out.println(a1);

                            //crear nueva cancion
                                System.out.println("ingrese nombre de la cancion");
                                String nombre = sc.nextLine();
                                sc.nextLine();

                                    System.out.println("ingrese autor de la cancion");
                                    String autor = sc.nextLine();
                                    sc.nextLine();

                                        System.out.println("ingrese duracion de la cancion");
                                        double duracion = sc.nextDouble();
                                        sc.nextLine();

                                                    cancion c1 = new cancion (nombre, autor, duracion, a1);

                                                        System.out.println(c1);
                                                        System.out.println("la cancion es larga? " + c1.esLargo());
                                                        System.out.println("el autor es duki? " + c1.compararArt());

                                                        //cambiar nombre
                                                        System.out.println("el nuevo nombre de la cancion es");
                                                        c1.cambiarNombre(sc.nextLine());
                                                        sc.nextLine();

                                                        System.out.println(c1);

                                                            sc.close();
                                                    }
}