
package gui;

import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Data;
import model.TMViviendas;
import model.TipoVivienda;
import model.Usuario;
import model.Venta;
import model.Vivienda;


public class ModVenderVivienda extends javax.swing.JFrame {
    Data d;
    Usuario usuario;
    
    public ModVenderVivienda(Usuario u) {
        try {
            this.usuario=u;
            initComponents();
            setLocationRelativeTo(null);
            d = new Data();
            cargarComboBox();
            cargarClientes();
            
            tblViviendasVenta.setVisible(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModVenderVivienda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ModVenderVivienda.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoEstado = new javax.swing.ButtonGroup();
        GrupoOrdenPrecio = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cboTipoVivienda = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        rbdUsada = new javax.swing.JRadioButton();
        rbdNueva = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        bntBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblViviendasVenta = new javax.swing.JTable();
        precAsc = new javax.swing.JRadioButton();
        precDesc = new javax.swing.JRadioButton();
        cmbClientes = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        btnVender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Vender Vivienda"));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoVivienda.png"))); // NOI18N
        jLabel1.setText("Busqueda de Vivienda ");

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_Volver.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo Vivienda:");

        jLabel7.setText("Estado  Vivienda:");

        GrupoEstado.add(rbdUsada);
        rbdUsada.setText("Usada");

        GrupoEstado.add(rbdNueva);
        rbdNueva.setSelected(true);
        rbdNueva.setText("Nueva");

        jLabel6.setText("Precio:");

        bntBuscar.setText("Buscar");
        bntBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarActionPerformed(evt);
            }
        });

        tblViviendasVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblViviendasVenta.setName("tblViviendas"); // NOI18N
        tblViviendasVenta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tblViviendasVenta);

        GrupoOrdenPrecio.add(precAsc);
        precAsc.setSelected(true);
        precAsc.setText("ASC");

        GrupoOrdenPrecio.add(precDesc);
        precDesc.setText("DESC");

        cmbClientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClientesActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccion un cliente");

        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 69, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboTipoVivienda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntBuscar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(precAsc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(precDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbdNueva)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbdUsada, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnVender)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboTipoVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rbdNueva)
                    .addComponent(rbdUsada))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(precAsc)
                    .addComponent(precDesc))
                .addGap(8, 8, 8)
                .addComponent(bntBuscar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(106, 106, 106))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        FormVendedor fo = new FormVendedor(this.usuario);
        fo.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cargarClientes() throws SQLException {
        cmbClientes.removeAllItems();
        for (Cliente c : d.getClientes()) {
            cmbClientes.addItem(c);
        }
        
    }
             
     private void cargarComboBox() throws SQLException {
        cboTipoVivienda.removeAllItems();
        for (TipoVivienda tv : d.getTiposVivienda()) {
            cboTipoVivienda.addItem(tv);
        }
    }
     List<Vivienda> viviendas;
     public void cargarTabla() throws SQLException
     {
        try 
        {
            d=new Data();
            int orden=0;//
            if (precAsc.isSelected())
            orden=1;
            
            int estadoVivienda=0;
            if (rbdNueva.isSelected())
            estadoVivienda=1;
            
            TipoVivienda tipoV = (TipoVivienda) cboTipoVivienda.getSelectedItem();
            viviendas = d.buscarVivienda(orden,tipoV.getId(),estadoVivienda);
                
            TMViviendas tm = new TMViviendas(viviendas);
            tblViviendasVenta.setModel(tm);
            tblViviendasVenta.setVisible(true);
            tblViviendasVenta.updateUI();
                
           
           
        } 
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(ModEstadisticasTotales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void bntBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarActionPerformed
        try {
            cargarTabla();
            
        } catch (Exception e) 
        {
        }
        
    }//GEN-LAST:event_bntBuscarActionPerformed

    private void cmbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbClientesActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        // TODO add your handling code here:
 
        if(viviendas!=null && !viviendas.isEmpty())
        {
           
            int row=tblViviendasVenta.getSelectedRow();
            
            if(row>=0)
            {
                Cliente c = (Cliente) cmbClientes.getSelectedItem();
                if(c!=null)
                {
                        Vivienda v= viviendas.get(row);
                        Usuario u=this.usuario;
                        LocalDateTime now = LocalDateTime.now();  
                        Venta venta=new Venta();
                        venta.setCliente(c);
                        venta.setUsuario(u);
                        venta.setFecha(now.format(DateTimeFormatter.ISO_LOCAL_TIME));
                }
                else
                {
                        String titulo = "Advertencia!";
                        int tipoMensaje = JOptionPane.WARNING_MESSAGE;
                        JOptionPane.showMessageDialog(this, "Debe seleccionar el cliente al que le desea vender", titulo, tipoMensaje);
                }
               
            }
            else
            {
                String titulo = "Advertencia!";
                int tipoMensaje = JOptionPane.WARNING_MESSAGE;
                JOptionPane.showMessageDialog(this, "Debe seleccionar la vivienda que desea vender", titulo, tipoMensaje);

            }
            
            
        
        }
        else
        {
                String titulo = "Advertencia!";
                int tipoMensaje = JOptionPane.WARNING_MESSAGE;
                JOptionPane.showMessageDialog(this, "Debe buscar la vivienda que desea vender", titulo, tipoMensaje);

        
        }
        
        
    }//GEN-LAST:event_btnVenderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModVenderVivienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModVenderVivienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModVenderVivienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModVenderVivienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModVenderVivienda(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoEstado;
    private javax.swing.ButtonGroup GrupoOrdenPrecio;
    private javax.swing.JButton bntBuscar;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox cboTipoVivienda;
    private javax.swing.JComboBox cmbClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton precAsc;
    private javax.swing.JRadioButton precDesc;
    private javax.swing.JRadioButton rbdNueva;
    private javax.swing.JRadioButton rbdUsada;
    private javax.swing.JTable tblViviendasVenta;
    // End of variables declaration//GEN-END:variables
}
