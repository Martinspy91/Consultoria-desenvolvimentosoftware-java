package view;

import javax.swing.JOptionPane;

public class TelaMenu extends javax.swing.JFrame {

    public TelaMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnColaboradores = new javax.swing.JButton();
        btnProjetos = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnAlocacao = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("A3 TECH - Menu");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(37, 99, 235));
        jLabel1.setText("A3 TECH - Sistema de Projetos");

        btnColaboradores.setBackground(new java.awt.Color(100, 116, 139));
        btnColaboradores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnColaboradores.setForeground(new java.awt.Color(6, 182, 212));
        btnColaboradores.setText("COLABORADORES");
        btnColaboradores.addActionListener(this::btnColaboradoresActionPerformed);

        btnProjetos.setBackground(new java.awt.Color(100, 116, 139));
        btnProjetos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProjetos.setForeground(new java.awt.Color(6, 182, 212));
        btnProjetos.setText("PROJETOS");
        btnProjetos.addActionListener(this::btnProjetosActionPerformed);

        btnClientes.setBackground(new java.awt.Color(100, 116, 139));
        btnClientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(6, 182, 212));
        btnClientes.setText("CLIENTES");
        btnClientes.addActionListener(this::btnClientesActionPerformed);

        btnAlocacao.setBackground(new java.awt.Color(100, 116, 139));
        btnAlocacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlocacao.setForeground(new java.awt.Color(6, 182, 212));
        btnAlocacao.setText("ALOCAÇÃO");
        btnAlocacao.addActionListener(this::btnAlocacaoActionPerformed);

        btnSair.setBackground(new java.awt.Color(100, 116, 139));
        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(6, 182, 212));
        btnSair.setText("SAIR");
        btnSair.addActionListener(this::btnSairActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnAlocacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProjetos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnColaboradores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(btnColaboradores)
                .addGap(18, 18, 18)
                .addComponent(btnProjetos)
                .addGap(18, 18, 18)
                .addComponent(btnClientes)
                .addGap(18, 18, 18)
                .addComponent(btnAlocacao)
                .addGap(18, 18, 18)
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnColaboradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColaboradoresActionPerformed
        new TelaColaborador().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnColaboradoresActionPerformed

    private void btnProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProjetosActionPerformed
        new TelaProjeto().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProjetosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        new TelaCliente().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnAlocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlocacaoActionPerformed
        new TelaAlocacao().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAlocacaoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int confirma = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            new TelaLogin().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnSairActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaMenu().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlocacao;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnColaboradores;
    private javax.swing.JButton btnProjetos;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
