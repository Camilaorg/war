package c_war;
public class Unidad {
    private int id;
    private String nombre;
    private int salud;
    
    public Unidad(int id, String nombre, int salud){
        this.id = id;
        this.nombre = nombre;
        this.salud = salud;
    }
    public void moverse(){
        System.out.println(nombre + " se está moviendo.");
    }
    public void atacar(){
        System.out.println(nombre + " está atacando.");
    }
        
    public int getId(){return id;}
    public String getNombre(){ return nombre;}
    public int getSalud(){return salud;}
    public void setId(int id){this.id = id;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setSalud(int salud){this.salud = salud;}
    
    
}
