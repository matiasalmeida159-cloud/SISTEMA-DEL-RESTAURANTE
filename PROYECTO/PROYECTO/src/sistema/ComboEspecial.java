/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MAJO
 */
public class ComboEspecial implements ItemMenu{
    
    private String nombreCombo;
    private List<ItemMenu> items = new ArrayList<>();
    private double precioPromocional = 0; 
    private double desc = 0.10;

    public ComboEspecial(String nombreCombo) {
        this.nombreCombo = nombreCombo;
        
    }
    
    public void agregar(ItemMenu item)
    {
        items.add(item);
        actualizarPrecio();
    }
    
    public void eliminar(ItemMenu item)
    {
        items.remove(item);
        actualizarPrecio();
    }

    public String getNombreCombo() {
        return nombreCombo;
    }

    public void setNombreCombo(String nombreCombo) {
        this.nombreCombo = nombreCombo;
    }
    
    private void actualizarPrecio()
    {
        double total = 0;
        for(ItemMenu item: items) //ese es un for each, es lo mismo que recorrer con i
        {
            total += item.calcularPrecio();
        }
        this.precioPromocional = total * (1-desc);
    }
    

    @Override
    public double calcularPrecio() {
        return precioPromocional;
    }
    public double getPrecioPromocional() {
        return this.precioPromocional;
    }
    
}
