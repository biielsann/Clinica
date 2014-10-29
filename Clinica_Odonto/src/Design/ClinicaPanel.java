/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

/**
 *
 * @author LucasPc
 */
public class ClinicaPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClinicaPanel
     */
    public ClinicaPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        ConsultasPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jBtAddConsulta = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        ClientesPanel = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        GerenciaPanel = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        ConsultasPanel.setBackground(new java.awt.Color(255, 255, 255));

        jBtAddConsulta.setText("Adicionar Consulta");
        jBtAddConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAddConsultaActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        jButton4.setText("Pesquisar");

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout ConsultasPanelLayout = new javax.swing.GroupLayout(ConsultasPanel);
        ConsultasPanel.setLayout(ConsultasPanelLayout);
        ConsultasPanelLayout.setHorizontalGroup(
            ConsultasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConsultasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(ConsultasPanelLayout.createSequentialGroup()
                        .addComponent(jBtAddConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ConsultasPanelLayout.setVerticalGroup(
            ConsultasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConsultasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ConsultasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(ConsultasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addComponent(jSeparator5))
                    .addComponent(jBtAddConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultas", ConsultasPanel);

        ClientesPanel.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setText("Adicionar Cliente");

        javax.swing.GroupLayout ClientesPanelLayout = new javax.swing.GroupLayout(ClientesPanel);
        ClientesPanel.setLayout(ClientesPanelLayout);
        ClientesPanelLayout.setHorizontalGroup(
            ClientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(ClientesPanelLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 360, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ClientesPanelLayout.setVerticalGroup(
            ClientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Clientes", ClientesPanel);

        GerenciaPanel.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setText("Adicionar Dentista");

        jButton5.setText("Adicionar Funcionario");

        javax.swing.GroupLayout GerenciaPanelLayout = new javax.swing.GroupLayout(GerenciaPanel);
        GerenciaPanel.setLayout(GerenciaPanelLayout);
        GerenciaPanelLayout.setHorizontalGroup(
            GerenciaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GerenciaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GerenciaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addGroup(GerenciaPanelLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(0, 213, Short.MAX_VALUE)))
                .addContainerGap())
        );
        GerenciaPanelLayout.setVerticalGroup(
            GerenciaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GerenciaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GerenciaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Gerenciar", GerenciaPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtAddConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAddConsultaActionPerformed
                 //private void jBtAddConsultaActionPerformed(java.awt.event.ActionEvent evt) {                                               
            ConsultaPanel c = new ConsultaPanel();
            this.jTabbedPane1.setVisible(false);
            c.setSize(767, 466);
            c.setVisible(true);
            this.add(c);
            
    }//GEN-LAST:event_jBtAddConsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ClientesPanel;
    private javax.swing.JPanel ConsultasPanel;
    private javax.swing.JPanel GerenciaPanel;
    private javax.swing.JButton jBtAddConsulta;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}