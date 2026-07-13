package sistema;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dralm
 */
public class Repartidor extends Empleado 
{
    private String unidadTransporte;
    private String estadoVehiculo;
    private boolean disponible;

    public Repartidor(String unidadTransporte, String estadoVehiculo, boolean disponible, String rol, String usuario, String password, String documento, String nombres, String apellidos) {
        super(rol, usuario, password, documento, nombres, apellidos);
        this.unidadTransporte = unidadTransporte;
        this.estadoVehiculo = estadoVehiculo;
        this.disponible = disponible;
    }

    

    public String getUnidadTransporte() {
        return this.unidadTransporte;
    }

    public void setUnidadTransporte(String unidadTransporte) {
        this.unidadTransporte = unidadTransporte;
    }

    public String getEstadoVehiculo() {
        return this.estadoVehiculo;
    }

    public void setEstadoVehiculo(String estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void reportIncid(Pedido pedido, double monto) {
        if (pedido != null && (pedido.getEstado().equals("En Camino") || pedido.getEstado().equals("En Cocina"))) { 
            double recargoActual = pedido.getRecargosRuta();
            pedido.setRecargosRuta(recargoActual + monto);
            pedido.calcularCuenta(); // Esto actualiza el subtotal, igv y total en tiempo real
            System.out.println("Incidencia registrada. Nuevo recargo en ruta: S/ " + pedido.getRecargosRuta());
        } else {
            System.out.println("No se puede registrar incidencia. El pedido no está activo o es nulo.");
        }
    }

    public void registrarEntrega(Pedido pedido) {
        if (pedido != null) {
            pedido.setEstado("Entregado");
            this.disponible = true; // El repartidor vuelve a estar libre
            System.out.println("ENTREGA REGISTRADA. Pedido N° " + pedido.getNumeroCorrelativo() + " cambiado a ENTREGADO.");
        }
    }

    @Override
    public void login(String user, String pass) {
        System.out.println("INICIAR SESIÓN DE REPARTIDOR");
    }

    @Override
    public void logout() {
        System.out.println("CERRAR SESIÓN DE REPARTIDOR");
    }

    @Override
    public String mostrarDatos() {
        return """
               DATOS DEL REPARTIDOR:
                Documento: """ + this.documento +
               "\n Nombres: " + this.nombres + " " + this.apellidos +
               "\n Usuario: " + this.usuario +
               "\n Rol: " + this.rol +
               "\n Unidad de Transporte: " + this.unidadTransporte + 
               "\n Estado del Vehículo: " + this.estadoVehiculo + 
               "\n Disponible: " + this.disponible;
    }
}