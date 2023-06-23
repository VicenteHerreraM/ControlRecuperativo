
import java.util.ArrayList;
import java.util.Scanner;


public class Atleta {
    private static int contador = 0; 
    private int identificador; 
    private double tiempo;
    private static String selección = "Chile";
    private static double tiempoEquipo;
    private String nombre;
    private ArrayList<Atleta> atletas = new ArrayList(); 

    public Atleta(int identificador, double tiempo, String nombre) {
        this.identificador = identificador;
        this.tiempo = tiempo;
        this.nombre = nombre;
    }
    
    public Atleta(String nombre, double tiempo) {
        contador++;
        this.identificador=contador;
        
   
    }
    
    public Atleta() {
    
}

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Atleta.contador = contador;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public static String getSelección() {
        return selección;
    }

    public static void setSelección(String selección) {
        Atleta.selección = selección;
    }

    public static double getTiempoEquipo() {
        return tiempoEquipo;
    }

    public static void setTiempoEquipo(double tiempoEquipo) {
        Atleta.tiempoEquipo = tiempoEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Atleta> getAtletas() {
        return atletas;
    }

    public void setAtletas(ArrayList<Atleta> atletas) {
        this.atletas = atletas;
    }
   
    public void mostrarEquipo(ArrayList<Atleta> atletas){
        String id = null;
        int i;
        double cont = 0;
        System.out.println("Seleccion = "+selección);
        
        for(i = 0 ; i < atletas.size() ; i++){
            System.out.println("Identificador del atleta = "+atletas.get(i).getIdentificador());
            System.out.println("Nombre del atleta = "+atletas.get(i).getNombre());
            System.out.println("Tiempo del atleta = "+atletas.get(i).getTiempo());
            cont += atletas.get(i).getTiempo();
            }
        
        System.out.println("Tiempo del equipo = "+cont);
        }
    
    
    
    
    }
    
    

