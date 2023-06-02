public class Videojuegos {
        //Inicializacion de varibles 
        String nombre;
        int anio_estreno;
        String genero;
        String modojuego;

        //Constructor donde se inicializa cada variable de cada atributo
        public Videojuegos(String nombre, int anio_estreno, String genero, String modojuego) {
        this.nombre = nombre;
        this.anio_estreno = anio_estreno;
        this.genero = genero;
        this.modojuego = modojuego;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio_estreno() {
        return anio_estreno;
    }

    public void setAnio_estreno(int anio_estreno) {
        this.anio_estreno = anio_estreno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getModojuego() {
        return modojuego;
    }

    public void setModojuego(String modojuego) {
        this.modojuego = modojuego;
    }
    public void imprimir(){
        System.out.println("\n"+getNombre());
        System.out.println(getGenero());
        System.out.println(getAnio_estreno());
        System.out.println(getModojuego());
    }
}
