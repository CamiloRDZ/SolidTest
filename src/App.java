public class App {
    public static void main(String[] args) throws Exception {
        
        // Llamando la clase empleado para crear un nuevo empleado
        Empleado empleado = new Empleado("Juan Perez", 1200.00, "Director");

        // llamado a la clase para aumentar salario
        Salario salario = new Salario();
        salario.aumentarSalario(empleado, 50);

        // Se llama a la clase MostrarDetalles para mostrar los datos del empleado
        MostrarDetalles detalles = new MostrarDetalles();
        detalles.imprimirDetalles(empleado);
        
    }
}
