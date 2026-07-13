/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

/**
 *
 * @author MAJO
 */
public class Prueba {
    
    public static void main(String[] args) {
        Producto papas = new Producto("Papas fritas", 8.0);
        Producto gaseosa = new Producto("Gaseosa", 5.0);
        Producto hamburguesa = new Producto("Hamburguesa", 15.0);

        ComboEspecial comboFamiliar = new ComboEspecial("Combo Familiar");
        comboFamiliar.agregar(papas);
        comboFamiliar.agregar(gaseosa);
        comboFamiliar.agregar(hamburguesa);

        System.out.println(comboFamiliar.getNombreCombo() + ": S/ " + comboFamiliar.calcularPrecio());
        // (8 + 5 + 15) = 28 -> menos 10% = 25.2
    }
    
}
