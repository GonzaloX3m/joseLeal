package model;

import java.util.logging.Logger;

public class Venta {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    private String fecha;
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    private Cliente cliente;
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    private Usuario usuario;
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    Vivienda vivienda;

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }
    
    
    
    public Venta(String fecha,Usuario usuario, Cliente cliente) {

        this.cliente=cliente;
        this.usuario=usuario;
        this.fecha = fecha;
    }

    public Venta() {
    }

}
