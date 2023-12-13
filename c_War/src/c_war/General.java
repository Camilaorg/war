package c_war;
public class General {
    private int id;
    private String nombre;
    private int experiencia;
    
    public General(int id, String nombre, int experiencia){
        this.id = id;
        this.nombre = nombre;
        this.experiencia = experiencia;
    }
    public void dirigirUnidades(){
        System.out.println(nombre + " está dirigiendo las unidades.");
    }
         
    public int getId(){return id;}
    public String getNombre(){return nombre;}
    public int getExperiencia(){return experiencia;}
    public void setId (int id){this.id = id;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setExperiencia(int experiencia){this.experiencia = experiencia;}
}
