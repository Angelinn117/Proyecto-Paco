package examendiagnostico;

import java.util.LinkedList;

public class Producto {

    //Variables
    private int codigoProducto, stockProducto, idFarmacia;
    private String nombreProducto, fechaVencimientoProducto;

    private LinkedList<Producto> listaDeProductosEspecifica;
    //Checar con calma lo de hacer que cada farmacia tenga su propia lista de productos.

    //Método constructor
    public Producto(int codigoProducto, int stockProducto, String nombreProducto, String fechaVencimientoProducto, int idFarmacia) {
        this.codigoProducto = codigoProducto;
        this.stockProducto = stockProducto;
        this.nombreProducto = nombreProducto;
        this.fechaVencimientoProducto = fechaVencimientoProducto;
        this.idFarmacia = idFarmacia;
    }

    //Métodos Getters y Setters
    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getFechaVencimientoProducto() {
        return fechaVencimientoProducto;
    }

    public void setFechaVencimientoProducto(String fechaVencimientoProducto) {
        this.fechaVencimientoProducto = fechaVencimientoProducto;
    }

    public int getIdFarmacia() {
        return idFarmacia;
    }

    public void setIdFarmacia(int idFarmacia) {
        this.idFarmacia = idFarmacia;
    }
    
    

}
