/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

/**
 *
 * @author MAJO
 */
public class Producto implements ItemMenu{
    
    protected String codigo, nombre, categoria;
    protected double precioBase;
    protected int stockDisponible;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public Producto() {
    }

    public Producto(String codigo, String nombre, String categoria, double precioBase, int stockDisponible) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precioBase = precioBase;
        this.stockDisponible = stockDisponible;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    @Override
    public double calcularPrecio() {
        return this.precioBase;
    }
    

    
}
