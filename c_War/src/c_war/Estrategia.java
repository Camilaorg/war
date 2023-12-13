package c_war;
public class Estrategia {
    private int id;
    private String descripcion;
    
    public Estrategia(int id, String descripcion){
        this.id = id;
        this.descripcion = descripcion;
    }
        
    public int getId(){return id;}
    public String getDescripcion(){return descripcion;}
    public void setId(int id){this.id = id;}
    public void setDescripcion(String descripcion){this.descripcion = descripcion;}
}
