public class Empleado {

    private String nombre;

    private Double salario;

    private String puesto;

    public Empleado(String nombre, Double salario, String puesto){
        this.nombre = nombre;
        this.salario = salario;
        this.puesto = puesto;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Double getSalario(){
        return this.salario;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }

    public String getPuesto(){
        return this.puesto;
    }

    public void setPuesto(String puesto){
        this.puesto = puesto;
    }

}
