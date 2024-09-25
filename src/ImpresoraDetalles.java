public class ImpresoraDetalles implements ImpresoraDetallesI {

    public void imprimirDetalles(Empleado empleado){

        System.out.println("Empleado: " + empleado.getNombre());
        System.out.println("Salario: " + empleado.getSalario());
        System.out.println("Puesto: " + empleado.getPuesto());
    }
}
