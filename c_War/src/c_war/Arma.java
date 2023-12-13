package c_war;
public class Arma {
    private int id;
    private String nombre;
    private int daño;
    public Arma(int id, String nombre, int daño){
        this.id = id;
        this.nombre = nombre;
        this.daño = daño;
    }
     
    public int getId(){return id;}
    public int getDaño(){return daño;}
    public void setId(int id){this.id = id;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setDaño(int daño){this.daño = daño;}
}
