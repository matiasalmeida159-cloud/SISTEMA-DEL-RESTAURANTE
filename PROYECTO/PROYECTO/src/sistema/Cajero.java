package sistema;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dralm
 */
public class Cajero extends Empleado 
{

    public Cajero(String rol, String usuario, String password, String documento, String nombres, String apellidos) {
        super(rol, usuario, password, documento, nombres, apellidos);
    }
    
    

    public void gestionarClientes() {
        System.out.println("GESTIÓN DE CLIENTES");
    }
    
    public void registrarPedido() {
        System.out.println("SE REGISTRA EL PEDIDO");
    }
    
    public void cambiarEstadoPedido() {
        System.out.println("SE ACTUALIZA EL ESTADO DEL PEDIDO");
    }

    @Override
    public void login(String user, String pass) {
        System.out.println("INICIAR SESIÓN DE CAJERO");
    }

    @Override
    public void logout() {
        System.out.println("CERRAR SESIÓN DE CAJERO");
    }

    @Override
    public String mostrarDatos() {
        return "DATOS DEL CAJERO:" +
               "\n Documento: " + this.documento +
               "\n Nombres: " + this.nombres + " " + this.apellidos +
               "\n Usuario: " + this.usuario +
               "\n Rol: " + this.rol;
    }
}
