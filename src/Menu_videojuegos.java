public class Menu_videojuegos {
    public static void main(String[] args) {
        //Creación de las instancias de la clase Videojuegos
        Videojuegos juego1 = new Videojuegos("God of war",2018,"Acción","Un solo jugador");
        Videojuegos juego2 = new Videojuegos("Call of duty",2017,"Shuter","uno y multi player");
        Videojuegos juego3 = new Videojuegos("Oulast",2012,"Horror","Un player");
        Videojuegos juego4 = new Videojuegos("Dead by Dylight",2016,"Horro","Multi player");
        Videojuegos juego5 = new Videojuegos("Resident Evil ",1995,"SurvivalHorro","Un solo player");

        //Impreción de los atributos de cada instancia
        juego1.imprimir();
        juego2.imprimir();
        juego3.imprimir();
        juego4.imprimir();
        juego5.imprimir();
    }
}
