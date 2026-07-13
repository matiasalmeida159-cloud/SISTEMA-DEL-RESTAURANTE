/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

/**
 *
 * @author Stiv
 */
public class Pedido {
    private int numeroCorrelativo;
    private String tipoEntrega;
    private String estado;
    private Producto[] listaProductos;
    private ComboEspecial[] listaCombos;
    private double recargosRuta;
    private double subtotal;
    private double igv;
    private double total;
    private Repartidor repartidorAsignado; 
    private int contProductos = 0;
    private int contCombos = 0;
    private String nombreCajero;
    private String nombreRepartidor;

    public Pedido(int numeroCorrelativo, String tipoEntrega) {
    this.numeroCorrelativo = numeroCorrelativo;
    this.tipoEntrega = tipoEntrega;
    this.estado = "En Cocina";
    this.listaProductos = new Producto[50];
    this.listaCombos = new ComboEspecial[3];
    this.recargosRuta = 0.0;
}
    public void agregarProducto(Producto p) {
    if(contProductos < listaProductos.length) {
        listaProductos[contProductos] = p;
        contProductos++;
    }
}

public void agregarCombo(ComboEspecial c) {
    if(contCombos < listaCombos.length) {
        listaCombos[contCombos] = c;
        contCombos++;
    }
}

    public boolean validarStockSimulado() {
        for (int i = 0; i < contProductos; i++) {
        if (listaProductos[i].getStockDisponible() <= 0) {
            return false; 
        }
    }
    return true;
    }

    public void calcularCuenta() {
        double sumaPrecios = 0;

    for (int i = 0; i < contProductos; i++) {
        sumaPrecios += listaProductos[i].getPrecioBase();
    }
    for (int i = 0; i < contCombos; i++) {
        sumaPrecios += listaCombos[i].getPrecioPromocional();
    }

   
    double totalConRecargos = sumaPrecios + this.recargosRuta;

    this.subtotal = totalConRecargos;
    this.igv = this.subtotal * 0.18;
    this.total = this.subtotal + this.igv;
    }

    public void emitirComprobante(String tipo) {
        calcularCuenta(); 
        System.out.println("=== " + tipo.toUpperCase() + " DE VENTA ===");
        System.out.println("Pedido N°: " + numeroCorrelativo);
        System.out.println("Estado: " + estado);
        
        System.out.println("Subtotal: S/ " + String.format("%.2f", subtotal));
        System.out.println("IGV (18%): S/ " + String.format("%.2f", igv));
        System.out.println("Recargos Ruta: S/ " + String.format("%.2f", recargosRuta));
        System.out.println("TOTAL A PAGAR: S/ " + String.format("%.2f", total));
    }

    public int getNumeroCorrelativo() {
        return numeroCorrelativo;
    }

    public void setNumeroCorrelativo(int numeroCorrelativo) {
        this.numeroCorrelativo = numeroCorrelativo;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Producto[] getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(Producto[] listaProductos) {
        this.listaProductos = listaProductos;
    }

    public ComboEspecial[] getListaCombos() {
        return listaCombos;
    }

    public void setListaCombos(ComboEspecial[] listaCombos) {
        this.listaCombos = listaCombos;
    }

    public double getRecargosRuta() {
        return recargosRuta;
    }

    public void setRecargosRuta(double recargosRuta) {
        this.recargosRuta = recargosRuta;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Repartidor getRepartidorAsignado() {
        return repartidorAsignado;
    }

    public void setRepartidorAsignado(Repartidor repartidorAsignado) {
        this.repartidorAsignado = repartidorAsignado;
    }

    public int getContProductos() {
        return contProductos;
    }

    public void setContProductos(int contProductos) {
        this.contProductos = contProductos;
    }

    public int getContCombos() {
        return contCombos;
    }

    public void setContCombos(int contCombos) {
        this.contCombos = contCombos;
    }

    public String getNombreCajero() {
        return nombreCajero;
    }

    public void setNombreCajero(String nombreCajero) {
        this.nombreCajero = nombreCajero;
    }

    public String getNombreRepartidor() {
        return nombreRepartidor;
    }

    public void setNombreRepartidor(String nombreRepartidor) {
        this.nombreRepartidor = nombreRepartidor;
    }
    
    
    
    
}