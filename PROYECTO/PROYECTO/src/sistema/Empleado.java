package sistema;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dralm
 */
public abstract class Empleado extends Persona implements Autenticable 
{
    protected String rol;
    protected String usuario;
    protected String password;

    public Empleado(String rol, String usuario, String password, String documento, String nombres, String apellidos) {
        super(documento, nombres, apellidos);
        this.rol = rol;
        this.usuario = usuario;
        this.password = password;
    }

    public String getRol() {
        return this.rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public abstract String mostrarDatos();
}
