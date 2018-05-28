package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Data {

    private final Conexion con;
    private String query;
    private ResultSet rs;
    private List<Vivienda> viviendas;
    private List<Venta> listaVentas;

    public Data() throws ClassNotFoundException, SQLException {
        con = new Conexion("localhost", "Prueba_2", "root", "");
    }

    public void registrarUsuarioAdmin(Usuario nuevo) throws SQLException {
        query = ("INSERT INTO usuario VALUES(null,'" + nuevo.getRun() + "','Administrador','1',DEFAULT);");
        con.ejecutar(query);
    }

    public int validarUsuario(String run) throws SQLException {
        int validador = 0;
        String sql = "SELECT COUNT(*) FROM usuario WHERE run = '" + run + "'";
        if (con.ejecutarSelect(sql).next()) {
            validador = con.rs.getInt(1);
        }
        con.close();
        return validador;
    }

    public Usuario getUsuarioSesion(String run) throws SQLException {
        Usuario u = new Usuario();

        String sql = "SELECT run,nombre,fk_tipoUsu FROM usuario WHERE run = '" + run + "'";

        if (con.ejecutarSelect(sql).next()) {
            u.setRun(con.rs.getString(1));
            u.setNombre(con.rs.getString(2));
            u.setTipoUsuario(con.rs.getInt(3));
        }
        return u;
    }

    public void registrarUsuarioVendedor(Usuario nuevo) throws SQLException {
        query = ("INSERT INTO usuario VALUES(null,'" + nuevo.getRun() + "','" + nuevo.getNombre() + "','2',DEFAULT);");
        con.ejecutar(query);
    }

    public void registrarVivienda(Vivienda nueva,TipoVivienda tv) throws SQLException {
        query = ("INSERT INTO vivienda VALUES('" + nueva.getNum_rol() + "',"
                + "'" + nueva.getDireccion() + "',"
                + "'" + nueva.getCant_banos() + "',"
                + "'" + nueva.getCant_piezas() + "',"
                + tv.getId()+","
                + "'" + nueva.getPrecio() + "',"
                + "'" + nueva.getNueva() + "',DEFAULT);");

        con.ejecutar(query);

    }

    public void registrarCliente(Cliente nuevo) throws SQLException {
        query = ("INSERT INTO cliente Values('" + nuevo.getRun() + "',"
                + "'" + nuevo.getNombre() + "',"
                + "'" + nuevo.getSueldo() + "',DEFAULT)");

        con.ejecutar(query);
    }

    public List<Vivienda> cargarlistaVivienda() throws SQLException {
        query = "SELECT * FROM vivienda";

        viviendas = new ArrayList<>();

        Vivienda v;

        rs = con.ejecutarSelect(query);
        while (rs.next()) {
            v = new Vivienda();

            v.setNum_rol(rs.getString(1));
            v.setDireccion(rs.getString(2));
            v.setCant_piezas(rs.getInt(3));
            v.setCant_banos(rs.getInt(4));
            v.setPrecio(rs.getInt(5));
            v.setTipoVivienda(rs.getInt(6));
            v.setNueva(rs.getInt(7));

            viviendas.add(v);
        }

        con.close();
        return viviendas;
    }

    public List<Venta> getListaVentas() throws SQLException {
        query = "SELECT * FROM venta";

        listaVentas = new ArrayList<>();

        Venta v;

        rs = con.ejecutarSelect(query);
        while (rs.next()) {
            v = new Venta();

            v.setFecha(rs.getString(1));

            listaVentas.add(v);

        }
        con.close();
        return listaVentas;
    }

    public void restaurarSistema(String fecha) throws SQLException {
        con.ejecutar("CALL pr_restaurar('" + fecha + "')");
        con.close();
    }

    public void creaPuntoRestauracion() throws SQLException {
        con.ejecutar("INSERT INTO restauracion VALUES(NULL,DEFAULT);");
        con.close();
    }

    public ResultSet getPuntosRest() throws SQLException {
        ResultSet aux_rs;
        String sql = "SELECT fecha FROM restauracion";
        aux_rs = con.ejecutarSelect(sql);
        return aux_rs;
    }

    public void registrarVentas() throws SQLException {
        query = "";

        con.ejecutar(query);

    }

    public List<TipoVivienda> getTiposVivienda() throws SQLException {
        List<TipoVivienda> tiposVivienda = new ArrayList<>();
        TipoVivienda tv;
        String sql = "SELECT * FROM tipoVivienda;";
        while(con.ejecutarSelect(sql).next()){
            tv = new TipoVivienda();
            tv.setId(con.rs.getInt(1));
            tv.setTipo(con.rs.getString(2));
            tiposVivienda.add(tv);
        }
        con.close();
        return tiposVivienda;
    }

}
