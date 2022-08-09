/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Base;

/**
 *
 * @author juan_dav.ortega
 */
public class Productos extends Base {

    private String nombreProducto;
    private int cantidadProducto;
    private double valorProducto;

    public Productos() {
    }

    public Productos(String nombreProducto, int cantidadProducto, double valorProducto) {
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.valorProducto = valorProducto;
    }

    
    /**
     * Get the value of valorProducto
     *
     * @return the value of valorProducto
     */
    public double getValorProducto() {
        return valorProducto;
    }

    /**
     * Set the value of valorProducto
     *
     * @param valorProducto new value of valorProducto
     */
    public void setValorProducto(double valorProducto) {
        this.valorProducto = valorProducto;
    }


    /**
     * Get the value of cantidadProducto
     *
     * @return the value of cantidadProducto
     */
    public int getCantidadProducto() {
        return cantidadProducto;
    }

    /**
     * Set the value of cantidadProducto
     *
     * @param cantidadProducto new value of cantidadProducto
     */
    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

        
    /**
     * Get the value of nombreProducto
     *
     * @return the value of nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Set the value of nombreProducto
     *
     * @param nombreProducto new value of nombreProducto
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    
    @Override
    public Base copy() {
        return new Productos(nombreProducto, cantidadProducto, valorProducto);
    }

    @Override
    public String toString() {
        return "Nombre= " + nombreProducto + ", Cantidad= " + cantidadProducto + ", Valor= " + valorProducto + "\n" ;
    }
    
    
}
