
package model;


public class Vivienda {
    private String num_rol;
    private String direccion;
    private int cant_piezas;
    private int cant_banos;
    private int tipoVivienda;
    private int precio;
    private int nueva;

    public Vivienda(String num_rol, String direccion, int cant_piezas, int cant_banos, int tipoVivienda, int precio, int nueva) {
        this.num_rol = num_rol;
        this.direccion = direccion;
        this.cant_piezas = cant_piezas;
        this.cant_banos = cant_banos;
        this.tipoVivienda = tipoVivienda;
        this.precio = precio;
        this.nueva = nueva;
    }

   

    public Vivienda() {
    }

    public String getNum_rol() {
        return num_rol;
    }

    public void setNum_rol(String num_rol) {
        this.num_rol = num_rol;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCant_piezas() {
        return cant_piezas;
    }

    public void setCant_piezas(int cant_piezas) {
        this.cant_piezas = cant_piezas;
    }

    public int getCant_banos() {
        return cant_banos;
    }

    public void setCant_banos(int cant_banos) {
        this.cant_banos = cant_banos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNueva() {
        return nueva;
    }

    public void setNueva(int nueva) {
        this.nueva = nueva;
    }

    public int getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(int tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }
    public String getTipoViviendaString(){
        String tipoViviendaString = "";
        switch(getTipoVivienda()){
            case 1:
                tipoViviendaString = "Departamento";
                break;
            case 2:
                tipoViviendaString = "Casa";
                break;
                default:
                    throw new AssertionError();
        }
        return tipoViviendaString;
    }

    @Override
    public String toString() {
        return "Vivienda{" + "num_rol=" + num_rol + ", direccion=" + direccion + ", cant_piezas=" + cant_piezas + ", cant_banos=" + cant_banos + ", tipoVivienda=" + tipoVivienda + ", precio=" + precio + ", nueva=" + nueva + '}';
    }
    
    
    
}
