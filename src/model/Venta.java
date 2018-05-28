package model;

import java.util.logging.Logger;

public class Venta {

    private String fecha;

    public Venta(String fecha) {

        this.fecha = fecha;
    }

    public Venta() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
