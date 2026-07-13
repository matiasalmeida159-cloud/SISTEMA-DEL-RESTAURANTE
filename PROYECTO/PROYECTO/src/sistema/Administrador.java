package sistema;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dralm
 */
public class Administrador extends Empleado 
{

    public Administrador(String rol, String usuario, String password, String documento, String nombres, String apellidos) {
        super(rol, usuario, password, documento, nombres, apellidos);
    }
    
    
    public void gestionarEmpleados() {
        System.out.println("MÓDULO DE GESTIÓN DE EMPLEADOS");
    }
    
    public void gestionarProductos() {
        System.out.println("MÓDULO DE GESTIÓN DE PRODUCTOS");
    }
    
    public void gestionarPromociones() {
        System.out.println("MÓDULO DE COMBOS Y PROMOCIONES");
    }

    @Override
    public void login(String user, String pass) {
        System.out.println("INICIA SESIÓN ADMINISTRADOR");
    }

    @Override
    public void logout() {
        System.out.println("CIERRA SESIÓN DE ADMINISTRADOR");
    }

    @Override
    public String mostrarDatos() {
        return "DATOS DEL ADMINISTRADOR:" +
               "\n Documento: " + this.documento +
               "\n Nombres: " + this.nombres + " " + this.apellidos +
               "\n Usuario: " + this.usuario +
               "\n Rol: " + this.rol;
    }
}