package gui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Data;
import model.TipoVivienda;
import model.Usuario;
import model.Vivienda;

public class ModViviendas extends javax.swing.JFrame {

    Data d;
    private int nueva;
    Usuario usuario;
    public ModViviendas(Usuario u) {
        try {
            this.usuario=u;
            initComponents();
            init();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModViviendas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ModViviendas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumRol = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCantPiezas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantBanos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnCasa = new javax.swing.JButton();
        rbdNueva = new javax.swing.JRadioButton();
        rbdUsada = new javax.swing.JRadioButton();
        btnVolver = new javax.swing.JButton();
        cboTipoVivienda = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Creacion de Viviendas"));

        jLabel1.setText("Numero rol:");

        jLabel2.setText("Direccion:");

        jLabel3.setText("Cantidad de Piezas:");

        jLabel4.setText("Cantidad de Baños:");

        jLabel5.setText("Tipo Vivienda:");

        jLabel6.setText("Precio:");

        jLabel7.setText("Estado  Vivienda:");

        btnCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Crear_Casa.png"))); // NOI18N
        btnCasa.setText("Crear Vivienda");
        btnCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbdNueva);
        rbdNueva.setSelected(true);
        rbdNueva.setText("Nueva");

        buttonGroup1.add(rbdUsada);
        rbdUsada.setText("Usada");

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_Volver.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(btnCasa, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbdNueva)
                                .addGap(48, 48, 48)
                                .addComponent(rbdUsada, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(txtCantBanos)
                            .addComponent(txtCantPiezas)
                            .addComponent(txtDireccion)
                            .addComponent(txtNumRol)
                            .addComponent(cboTipoVivienda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCantPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantBanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboTipoVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rbdNueva)
                    .addComponent(rbdUsada))
                .addGap(18, 18, 18)
                .addComponent(btnCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasaActionPerformed
        try {
            Vivienda v = new Vivienda();
            TipoVivienda tipoV;
            
            String NumRol=txtNumRol.getText().trim();
            String Dir=txtDireccion.getText().trim();
            String CantPiezas=txtCantPiezas.getText().trim();
            String CantBaños=txtCantBanos.getText().trim();
            String Precio =txtPrecio.getText().trim();
            String mensaje="";
            if(NumRol.length()<=0)
                mensaje="El campo num rol es obligatorio";
            
            if(Dir.length()<=0)
                mensaje+="\t\n"+"La direccion es obligatoria";
            
            if(CantPiezas.length()<=0 || (!CantPiezas.matches("^[-+]?\\d+(\\d+)?$")))
                mensaje+="\t\n"+"La cantidad de piezas debe ser numerica";
            
            if(CantBaños.length()<=0 || (!CantBaños.matches("^[-+]?\\d+(\\d+)?$")))
                mensaje+="\t\n"+"La cantidad de baños debe ser numerica";
            
            if(Precio.length()<=0 || (!Precio.matches("^[-+]?\\d+(\\.\\d+)?$")))
                mensaje+="\t\n"+"El precio debe ser flotante";
            
            if(mensaje.length()==0)
            {
            
                v.setNum_rol(txtNumRol.getText());
                v.setDireccion(txtDireccion.getText());
                v.setCant_piezas(Integer.parseInt(txtCantPiezas.getText()));
                v.setCant_banos(Integer.parseInt(txtCantBanos.getText()));
                tipoV = (TipoVivienda) cboTipoVivienda.getSelectedItem();
                v.setPrecio(Float.parseFloat(txtPrecio.getText()));

                if (rbdNueva.isSelected()) {
                    v.setNueva(1);
                } else {
                    v.setNueva(0);
                }

                d.registrarVivienda(v,tipoV);
                JOptionPane.showMessageDialog(this, "Casa Creada!");
                limpiarForm();
            
            }
            else
            {
                String titulo = "Advertencia!";
                int tipoMensaje = JOptionPane.WARNING_MESSAGE;
                JOptionPane.showMessageDialog(this, mensaje, titulo, tipoMensaje);
            
            }
        
            
        } catch (SQLException ex) {
            Logger.getLogger(ModViviendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCasaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        FormAdmin fo = new FormAdmin(this.usuario);
        fo.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModViviendas(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCasa;
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cboTipoVivienda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbdNueva;
    private javax.swing.JRadioButton rbdUsada;
    private javax.swing.JTextField txtCantBanos;
    private javax.swing.JTextField txtCantPiezas;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNumRol;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    private void init() throws ClassNotFoundException, SQLException {
        d = new Data();
        setLocationRelativeTo(null);
        cargarComboBox();
        limpiarForm();
    }

    private void cargarComboBox() throws SQLException {
        cboTipoVivienda.removeAllItems();
        for (TipoVivienda tv : d.getTiposVivienda()) {
            cboTipoVivienda.addItem(tv);
        }
    }

    private void limpiarForm() {
        txtCantBanos.setText("");
        txtNumRol.setText("");
        txtCantPiezas.setText("");
        txtPrecio.setText("");
        cboTipoVivienda.setSelectedIndex(0);
        txtDireccion.setText("");
        txtNumRol.requestFocus();
    }

}
