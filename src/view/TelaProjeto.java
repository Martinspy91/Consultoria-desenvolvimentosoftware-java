package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Projeto;
import java.util.List;

public class TelaProjeto extends javax.swing.JFrame {

    public TelaProjeto() {
        initComponents();
        carregarProjetos();
        carregarClientesNoCombo();
        lerTXT();
    }

    // ── Popula combo de tipos de projeto ──────────────────
    public void carregarProjetos() {
        cbProjeto.removeAllItems();
        cbProjeto.addItem("Desenvolvimento de Sites");
        cbProjeto.addItem("Desenvolvimento Mobile");
        cbProjeto.addItem("Sistema Desktop");
        cbProjeto.addItem("Banco de Dados");
        cbProjeto.addItem("Consultoria TI");
    }

    // ── Lê clientes via model e preenche o combo ──────────
    public void carregarClientesNoCombo() {
        cbCliente.removeAllItems();
        List<Cliente> lista = Cliente.lerTodos();           // model lê clientes.txt
        for (Cliente c : lista) {
            cbCliente.addItem(c.getNome());
        }
    }

    // ── Lê projetos via model e preenche a tabela ─────────
    private void lerTXT() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaProjetos.getModel();
        modelo.setRowCount(0);
        List<Projeto> lista = Projeto.lerTodos();           // model lê projetos.txt
        for (Projeto p : lista) {
            modelo.addRow(new Object[]{ p.getNomeProjeto(), p.getNomeCliente() });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnVincular = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnAvancar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProjetos = new javax.swing.JTable();
        cbProjeto = new javax.swing.JComboBox<>();
        cbCliente = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("A3 TECH - Projetos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(37, 99, 235));
        jLabel2.setText("CADASTRO DE PROJETOS");

        btnVincular.setBackground(new java.awt.Color(100, 116, 139));
        btnVincular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVincular.setForeground(new java.awt.Color(6, 182, 212));
        btnVincular.setText("Vincular");
        btnVincular.addActionListener(this::btnVincularActionPerformed);

        btnVoltar.setBackground(new java.awt.Color(100, 116, 139));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(6, 182, 212));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(this::btnVoltarActionPerformed);

        btnAvancar.setBackground(new java.awt.Color(100, 116, 139));
        btnAvancar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAvancar.setForeground(new java.awt.Color(6, 182, 212));
        btnAvancar.setText("Avançar");
        btnAvancar.addActionListener(this::btnAvancarActionPerformed);

        tabelaProjetos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {"Projeto", "Cliente"}
        ));
        tabelaProjetos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProjetosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProjetos);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(6, 182, 212));
        jLabel3.setText("Projeto");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(6, 182, 212));
        jLabel4.setText("Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbProjeto, 0, 102, Short.MAX_VALUE)
                                    .addComponent(cbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVincular)
                                .addGap(77, 77, 77)
                                .addComponent(btnVoltar)
                                .addGap(79, 79, 79)
                                .addComponent(btnAvancar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2)))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(572, 572, 572)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnVincular)
                                    .addComponent(btnVoltar)
                                    .addComponent(btnAvancar))))))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new TelaMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        new TelaAlocacao().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void btnVincularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVincularActionPerformed
        if (cbCliente.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Cadastre um cliente primeiro!");
            return;
        }

        String nomeProjeto = cbProjeto.getSelectedItem().toString();
        String nomeCliente = cbCliente.getSelectedItem().toString();

        // Instancia o objeto na tela (view)
        Projeto projeto = new Projeto(nomeProjeto, nomeCliente);

        // Delega a gravação ao model
        try {
            projeto.salvarTXT();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e.getMessage());
            return;
        }

        lerTXT();
        JOptionPane.showMessageDialog(null, "Projeto vinculado com sucesso!");
    }//GEN-LAST:event_btnVincularActionPerformed

    private void tabelaProjetosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProjetosMouseClicked
        int linha = tabelaProjetos.getSelectedRow();
        if (linha < 0) return;
        cbProjeto.setSelectedItem(tabelaProjetos.getValueAt(linha, 0).toString());
        cbCliente.setSelectedItem(tabelaProjetos.getValueAt(linha, 1).toString());
    }//GEN-LAST:event_tabelaProjetosMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaProjeto().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnVincular;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbCliente;
    private javax.swing.JComboBox<String> cbProjeto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProjetos;
    // End of variables declaration//GEN-END:variables
}
