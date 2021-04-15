

public class Monumento
{
    private String nombre;
    private int fecha;
    private String ciudad;
    private double altura;
    
    public Monumento(String nombre, int fecha, String ciudad, double altura){
        this.nombre = nombre;
        this.fecha = fecha;
        this.ciudad = ciudad;
        this.altura = altura;
    }
    
    public Monumento(){
       nombre = "Torre Eiffel";
       fecha = 1889;
       ciudad = "París";
       altura = 300;
    }
    
    public String conmemorar(){
        String conmemorar;
        conmemorar = "hecho historico";
        return conmemorar;
    }
    
    public String simbolizar(){
        String simbolizar;
        simbolizar = "un país";
        return simbolizar;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getFecha(){
        return fecha;
    }
    
    public String getCiudad(){
        return ciudad;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setFecha(int fecha){
        this.fecha = fecha;
    }
    
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
}
