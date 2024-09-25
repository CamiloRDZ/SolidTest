public class App {

    private Empleado empleado;
    private GestorSalario gestorSalario;
    private ImpresoraDetalles impresoraDetalles;

    public App (Empleado empleado, GestorSalario gestorSalario, ImpresoraDetalles impresoraDetalles){
        this.empleado = empleado;
        this.gestorSalario = gestorSalario;
        this.impresoraDetalles = impresoraDetalles;
    }
    public static void main(String[] args) throws Exception {

        App app = new App(
            new Empleado("Juan Perez", 1200.00, "Director"),
            new GestorSalario(),
            new ImpresoraDetalles());
        
        // Se llama a la clase GestorSalario y se le pasa el empleado y el porcentaje de aumento
        app.gestorSalario.aumentarSalario(app.empleado, 50);

        // Se llama a la clase ImpresoraDetalles para mostrar los datos del empleado
        app.impresoraDetalles.imprimirDetalles(app.empleado);
        
    }
}
