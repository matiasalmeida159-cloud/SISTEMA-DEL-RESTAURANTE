package sistema;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dralm
 */
public class Cliente extends Persona 
{
    private String direccionEntrega;
    private String telefono;
    private String ruc;          
    private String razonSocial;   

    public Cliente(String direccionEntrega, String telefono, String documento, String nombres, String apellidos) { //persona naturalxd
        super(documento, nombres, apellidos);
        this.direccionEntrega = direccionEntrega;
        this.telefono = telefono;
    }
    public Cliente(String direccionEntrega, String telefono, String ruc, String razonSocial) { //empresa
        super(ruc, razonSocial, "");
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.direccionEntrega = direccionEntrega;
        this.telefono = telefono;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

   

    public String getDireccionEntrega() {
        return this.direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String mostrarDatos() {
        return "DATOS DEL CLIENTE:v" +
               "\n Documento: " + this.documento +
               "\n Nombres: " + this.nombres + " " + this.apellidos +
               "\n Dirección de entrega: " + this.direccionEntrega +
               "\n Teléfono: " + this.telefono;
    }
}