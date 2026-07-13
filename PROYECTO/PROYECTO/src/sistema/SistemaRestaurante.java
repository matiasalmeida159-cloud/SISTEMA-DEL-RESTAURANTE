/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

/**
 *
 * @author Stiv
 */

public class SistemaRestaurante {
    private Empleado[] listaEmpleados;
    private Producto[] listaProductos;
    private Cliente[] listaClientes;
    private Pedido[] listaPedidos;
    private int contEmp = 0;
    private int contProd = 0;
    private int contCli = 0;
    private int contPed = 0;

    public SistemaRestaurante() {
        this.listaEmpleados = new Empleado[100];
        this.listaProductos = new Producto[100];
        this.listaClientes = new Cliente[100];
        this.listaPedidos = new Pedido[100];
    }
    
    public void registrarEmpleado(Empleado e) {
    if(contEmp < listaEmpleados.length) 
        { 
        listaEmpleados[contEmp++] = e; 
        }
    }
    public void registrarProducto(Producto p) {
        if(contProd < listaProductos.length) 
        { 
            listaProductos[contProd++] = p; 
        }
    }
    public void registrarCliente(Cliente c) {
        if(contCli < listaClientes.length) 
        { 
            listaClientes[contCli++] = c; 
        }
    }
    public void registrarPedido(Pedido p) {
        if(contPed < listaPedidos.length) 
        { 
            listaPedidos[contPed++] = p; 
        }
    }
    
    
    public boolean loginSistema(String user, String pass) {
        for (int i = 0; i < contEmp; i++) {
            if (listaEmpleados[i].getUsuario().equals(user) && listaEmpleados[i].getPassword().equals(pass)) 
            {
               
                return true; 
            }
        }
        return false;
    }

    public void genRepProd() {
        System.out.println("=== REPORTE DE PRODUCTIVIDAD DEL PERSONAL ===");
        for (int i = 0; i < contPed; i++) {
            Pedido p = listaPedidos[i];
            if (p != null) {
                System.out.println("Pedido N° " + p.getNumeroCorrelativo() + 
                                   " | Atendido por Cajero: " + p.getNombreCajero() + 
                                   " | Entregado por: " + (p.getNombreRepartidor() != null ? p.getNombreRepartidor() : "Recojo en tienda"));
            }
        }
    }

    public void generarReporteIngresos(String fechaInicio, String fechaFin) {
        double ingresosMenu = 0;
        double ingresosCombos = 0;

        for (int i = 0; i < contPed; i++) {
            Pedido p = listaPedidos[i];
            if (p != null && p.getEstado().equals("Entregado")) { 
                // Usar el contador real en vez de .length evita evaluar celdas vacías nulas
                for(int j = 0; j < p.getContProductos(); j++) {
                    if(p.getListaProductos()[j] != null) {
                        ingresosMenu += p.getListaProductos()[j].getPrecioBase();
                    }
                }
                
                for(int k = 0; k < p.getContCombos(); k++) {
                    if(p.getListaCombos()[k] != null) {
                        ingresosCombos += p.getListaCombos()[k].getPrecioPromocional();
                    }
                }
            }
        }
        System.out.println("Ingresos Menú Regular: S/ " + ingresosMenu);
        System.out.println("Ingresos Combos Promocionales: S/ " + ingresosCombos);
        System.out.println("Total Ventas: S/ " + (ingresosMenu + ingresosCombos));
    }
}