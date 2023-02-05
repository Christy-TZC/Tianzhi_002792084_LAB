/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Model.Application;

/**
 *
 * @author tianzhichen
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    Application application;
    
    public MainJFrame() {
        initComponents();
        
        this.application = new Application();
    }
    
   
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        ControlJPanel = new javax.swing.JPanel();
        createObservation = new javax.swing.JButton();
        viewVitalBtn = new javax.swing.JButton();
        medCatalogBtn = new javax.swing.JButton();
        assginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createObservation.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        createObservation.setText("Create Observation");
        createObservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createObservationActionPerformed(evt);
            }
        });

        viewVitalBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        viewVitalBtn.setText("View Vital Sign History");
        viewVitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVitalBtnActionPerformed(evt);
            }
        });

        medCatalogBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        medCatalogBtn.setText("Medicine Catalog");
        medCatalogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medCatalogBtnActionPerformed(evt);
            }
        });

        assginBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        assginBtn.setText("Assign Medicine");
        assginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlJPanelLayout = new javax.swing.GroupLayout(ControlJPanel);
        ControlJPanel.setLayout(ControlJPanelLayout);
        ControlJPanelLayout.setHorizontalGroup(
            ControlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlJPanelLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(ControlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(viewVitalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createObservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(medCatalogBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(assginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        ControlJPanelLayout.setVerticalGroup(
            ControlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlJPanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(createObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(viewVitalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(medCatalogBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(assginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(ControlJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createObservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createObservationActionPerformed
        // TODO add your handling code here:
        
        jSplitPane1.setRightComponent(new CreateJPanel(this.application));
    }//GEN-LAST:event_createObservationActionPerformed

    private void viewVitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVitalBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new ViewJPanel(this.application));
    }//GEN-LAST:event_viewVitalBtnActionPerformed

    private void medCatalogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medCatalogBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new CatalogJPanel(this.application));
    }//GEN-LAST:event_medCatalogBtnActionPerformed

    private void assginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assginBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new MedicineAssignJPanel(this.application));
    }//GEN-LAST:event_assginBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlJPanel;
    private javax.swing.JButton assginBtn;
    private javax.swing.JButton createObservation;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton medCatalogBtn;
    private javax.swing.JButton viewVitalBtn;
    // End of variables declaration//GEN-END:variables
}
