package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Colaborador;
import model.Projeto;
import model.Alocacao;
import java.util.List;

public class TelaAlocacao extends javax.swing.JFrame {

    public TelaAlocacao() {
        initComponents();
        carregarColaboradoresNoCombo();
        carregarProjetosNoCombo();
        lerTXT();
    }

    // ── Lê colaboradores via model e preenche o combo ─────
    private void carregarColaboradoresNoCombo() {
        cbColaborador.removeAllItems();
        List<Colaborador> lista = Colaborador.lerTodos();   // model lê colaboradores.txt
        for (Colaborador c : lista) {
            cbColaborador.addItem(c.getNome());
        }
    }

    // ── Lê projetos via model e preenche o combo ──────────
    private void carregarProjetosNoCombo() {
        cbProjeto.removeAllItems();
        List<Projeto> lista = Projeto.lerTodos();           // model lê projetos.txt
        for (Projeto p : lista) {
            cbProjeto.addItem(p.getNomeProjeto());
        }
    }

    // ── Lê alocações via model e preenche a tabela ────────
    private void lerTXT() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaAlocacao.getModel();
        modelo.setRowCount(0);
        List<Alocacao> lista = Alocacao.lerTodos();         // model lê alocacoes.txt
        for (Alocacao a : lista) {
            modelo.addRow(new Object[]{
                a.getColaborador().getNome(),
                a.getProjeto().getNomeProjeto(),
                a.getFuncao(),
                a.getHoras()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbColaborador = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbProjeto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtFuncao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHoras = new javax.swing.JTextField();
        btnAlocar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAlocacao = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("A3 TECH - Alocação");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(37, 99, 235));
        jLabel1.setText("ALOCAÇÃO DE COLABORADORES");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(6, 182, 212));
        jLabel2.setText("Colaborador ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(6, 182, 212));
        jLabel3.setText("Projeto  ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(6, 182, 212));
        jLabel4.setText("Função  ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(6, 182, 212));
        jLabel5.setText("Horas ");

        btnAlocar.setBackground(new java.awt.Color(100, 116, 139));
        btnAlocar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlocar.setForeground(new java.awt.Color(6, 182, 212));
        btnAlocar.setText("Alocar");
        btnAlocar.addActionListener(this::btnAlocarActionPerformed);

        btnConsultar.setBackground(new java.awt.Color(100, 116, 139));
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(6, 182, 212));
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(this::btnConsultarActionPerformed);

        btnVoltar.setBackground(new java.awt.Color(100, 116, 139));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(6, 182, 212));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(this::btnVoltarActionPerformed);

        tabelaAlocacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {"Colaborador", "Projeto", "Função", "Horas"}
        ));
        tabelaAlocacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAlocacaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAlocacao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(25, 25, 25))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlocar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbProjeto, 0, 154, Short.MAX_VALUE)
                                    .addComponent(cbColaborador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFuncao)
                                    .addComponent(txtHoras))
                                .addGap(126, 126, 126))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btnConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVoltar)
                                .addGap(35, 35, 35))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAlocar)
                            .addComponent(btnConsultar)
                            .addComponent(btnVoltar))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlocarActionPerformed
        if (cbColaborador.getItemCount() == 0 || cbProjeto.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Cadastre colaboradores e projetos antes!");
            return;
        }
        if (txtFuncao.getText().trim().isEmpty() || txtHoras.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha a função e as horas!");
            return;
        }

        String nomeColaborador = cbColaborador.getSelectedItem().toString();
        String nomeProjeto     = cbProjeto.getSelectedItem().toString();
        String funcao          = txtFuncao.getText().trim();
        String horas           = txtHoras.getText().trim();

        // Instancia os objetos na tela (view)
        Colaborador colaborador = new Colaborador(nomeColaborador, "", 0, "");
        Projeto     projeto     = new Projeto(nomeProjeto, "");
        Alocacao    alocacao    = new Alocacao(colaborador, projeto, funcao, horas);

        // Delega a gravação ao model
        try {
            alocacao.salvarTXT();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e.getMessage());
            return;
        }

        lerTXT();
        JOptionPane.showMessageDialog(null, "Colaborador alocado com sucesso!");

        txtFuncao.setText("");
        txtHoras.setText("");
    }//GEN-LAST:event_btnAlocarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        if (cbColaborador.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum colaborador disponível!");
            return;
        }
        String nomeColaborador = cbColaborador.getSelectedItem().toString();
        boolean encontrou = false;
        DefaultTableModel modelo = (DefaultTableModel) tabelaAlocacao.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            Object valor = modelo.getValueAt(i, 0);
            if (valor != null && valor.toString().equals(nomeColaborador)) {
                tabelaAlocacao.setRowSelectionInterval(i, i);
                cbProjeto.setSelectedItem(modelo.getValueAt(i, 1).toString());
                txtFuncao.setText(modelo.getValueAt(i, 2).toString());
                txtHoras.setText(modelo.getValueAt(i, 3).toString());
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            JOptionPane.showMessageDialog(null, "Nenhuma alocação encontrada para: " + nomeColaborador);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void tabelaAlocacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAlocacaoMouseClicked
        int linha = tabelaAlocacao.getSelectedRow();
        if (linha < 0) return;
        cbColaborador.setSelectedItem(tabelaAlocacao.getValueAt(linha, 0).toString());
        cbProjeto.setSelectedItem(tabelaAlocacao.getValueAt(linha, 1).toString());
        txtFuncao.setText(tabelaAlocacao.getValueAt(linha, 2).toString());
        txtHoras.setText(tabelaAlocacao.getValueAt(linha, 3).toString());
    }//GEN-LAST:event_tabelaAlocacaoMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new TelaMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaAlocacao().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlocar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbColaborador;
    private javax.swing.JComboBox<String> cbProjeto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaAlocacao;
    private javax.swing.JTextField txtFuncao;
    private javax.swing.JTextField txtHoras;
    // End of variables declaration//GEN-END:variables
}
