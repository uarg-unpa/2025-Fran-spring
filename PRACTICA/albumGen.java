package PRACTICA;

//creacion de clase albumGen
public class albumGen {
    private String genero;
    private String album;


    //Constructor
    public albumGen(String genero, String album){
        this.genero = genero;
        this.album = album;
    }

    //Getters y setters

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }

    
    //toString 

    public String toString (){
        return "(Genero: " + genero + ",album: " + album + ")" ;
    }
}