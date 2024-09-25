public class Salario {

    public void aumentarSalario(Empleado empleado, int porcentaje){
        Double aumento = empleado.getSalario() + ((empleado.getSalario() * porcentaje) / 100);
        empleado.setSalario(aumento);
    }
}
