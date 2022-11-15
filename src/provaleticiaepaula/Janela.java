/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package provaleticiaepaula;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Leticia Emily de Oliveira e Paula Karoline Baleeiro Prado
 */
public class Janela extends javax.swing.JFrame {
    private Vector <Cliente> vetor;
    private int i;
    private boolean emedicao;
    
    public Janela() {
        initComponents();
        
        vetor = new Vector <Cliente>();
        i = 0;
        habilitarCampos(false);
        chave.setVisible(false);
        emedicao = false;
        mensagem.setEditable(false);
        
        btEditar.setEnabled(false);
        btExcluir.setEnabled(false);
        btInserir.setEnabled(true);
        btPesquisar.setEnabled(true);
        btSalvar.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        login = new javax.swing.JTextField();
        senha = new javax.swing.JTextField();
        quantidade = new javax.swing.JTextField();
        btInserir = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        chave = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        mensagem = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("PMingLiU", 0, 18)); // NOI18N
        jLabel1.setText("CADASTRO DE CLIENTES");

        jLabel2.setText("Id");

        jLabel3.setText("Nome");

        jLabel4.setText("Telefone");

        jLabel5.setText("Login");

        jLabel6.setText("Senha");

        jLabel7.setText("Quantidade de Compras");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });

        quantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantidadeKeyTyped(evt);
            }
        });

        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        chave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                chaveKeyTyped(evt);
            }
        });

        mensagem.setColumns(20);
        mensagem.setRows(5);
        jScrollPane1.setViewportView(mensagem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel8))
                                                .addGap(6, 6, 6))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(103, 103, 103)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nome)
                                    .addComponent(telefone)
                                    .addComponent(login)
                                    .addComponent(senha, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chave))))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInserir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir)
                        .addGap(20, 20, 20)
                        .addComponent(btPesquisar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        limparCampos();
        habilitarCampos(true);
        this.id.requestFocus();
        emedicao = false;
        
        btEditar.setEnabled(false);
        btExcluir.setEnabled(false);
        btInserir.setEnabled(false);
        btPesquisar.setEnabled(false);
        btSalvar.setEnabled(true);
        mensagem.setText("");
        
    }//GEN-LAST:event_btInserirActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        /*Cliente cliente = null;
        try{
        if(!emedicao){
        cliente = new Cliente(id.getText(),
                                      nome.getText(),
                                      login.getText(),
                                      quantidade.getText(),
                                      senha.getText(),
                                      telefone.getText());
                vetor.add(cliente);
        }else
            vetor.setElementAt(cliente, Integer.parseInt(chave.getText()));
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erro, Insira o telefone apenas com números (##)#####-####");
        
        telefone.setText("");
        
    }   */
        
        try{        
       Cliente cliente;
            cliente = new Cliente((id.getText()),
                    nome.getText(),
                    telefone.getText(),
                    login.getText(),
                    senha.getText(),
                    quantidade.getText());
        if(!emedicao)
            vetor.add(cliente);
        else
            vetor.setElementAt(cliente, Integer.parseInt(chave.getText()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro, Insira todos os campos");
        }
        
        imprimeRelatorio();
        habilitarCampos(false);
        
        btEditar.setEnabled(false);
        btExcluir.setEnabled(false);
        btInserir.setEnabled(true);
        btPesquisar.setEnabled(true);
        btSalvar.setEnabled(false);
        limparCampos();
        
        
        
    }//GEN-LAST:event_btSalvarActionPerformed

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        char c =evt.getKeyChar();
        if(!Character.isDigit(c))
        evt.consume();
    }//GEN-LAST:event_idKeyTyped

    private void quantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadeKeyTyped
        char c =evt.getKeyChar();
        if(!Character.isDigit(c))
        evt.consume();
    }//GEN-LAST:event_quantidadeKeyTyped

    private void chaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chaveKeyTyped
        char c =evt.getKeyChar();
        if(!Character.isDigit(c))
        evt.consume();
    }//GEN-LAST:event_chaveKeyTyped

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        
        btEditar.setEnabled(false);
        btExcluir.setEnabled(false);
        btInserir.setEnabled(false);
        btSalvar.setEnabled(false);
        btPesquisar.setEnabled(true);
        if (btPesquisar.getText().equals("Pesquisar")){
            chave.setVisible(true);
            chave.setText("");
            chave.requestFocus();
            btPesquisar.setText("Localizar");
            mensagem.setText("");
        }else{
            mensagem.setText(filtraDados());
            btPesquisar.setText("Pesquisar");
            chave.setVisible(false);
            if(!mensagem.getText().isEmpty()){
                btExcluir.setEnabled(true);
                btEditar.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(null, "Registro não encontrado", "Erro", JOptionPane.ERROR_MESSAGE) ;
            }
            
        btEditar.setEnabled(true);
        btExcluir.setEnabled(true);
        btInserir.setEnabled(true);
        btSalvar.setEnabled(false);
        btPesquisar.setEnabled(true);
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        this.nome.setText(vetor.get(Integer.parseInt(chave.getText())).getNome());
        this.telefone.setText(vetor.get(Integer.parseInt(chave.getText())).getTelefone());
        this.senha.setText(vetor.get(Integer.parseInt(chave.getText())).getSenha());
        this.login.setText(vetor.get(Integer.parseInt(chave.getText())).getLogin());
        this.id.setText(String.valueOf(vetor.get(Integer.parseInt(chave.getText())).getId()));
        this.quantidade.setText(String.valueOf(vetor.get(Integer.parseInt(chave.getText())).getQuantidadedecompras()));
        habilitarCampos(true);
        emedicao = true;
        
        btEditar.setEnabled(false);
        btExcluir.setEnabled(true);
        btInserir.setEnabled(false);
        btSalvar.setEnabled(true);
        btPesquisar.setEnabled(false);
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
       int confirma = JOptionPane.showConfirmDialog(null, "Confirma exclusão?", "Excluir", JOptionPane.YES_NO_CANCEL_OPTION);
        if (confirma ==0){
            vetor.remove(Integer.parseInt(chave.getText()));
       
        btEditar.setEnabled(false);
        btExcluir.setEnabled(false);
        btInserir.setEnabled(true);
        btSalvar.setEnabled(false);
        btPesquisar.setEnabled(true);
        limparCampos();
        imprimeRelatorio();        
        
        }
    }//GEN-LAST:event_btExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }
    
    public String filtraDados(){
        try{
        return chave.getText()+" - "+vetor.get(Integer.parseInt(chave.getText())).toString();
        } catch (Exception e){
            return "";
        }
    }
    
    //
  
    
    
    //função para imprimir mensagem
    private void imprimeRelatorio(){
        String retorno = "";
        for(int i=0;i<vetor.size();i++)
            retorno += i + "-" + vetor.get(i).toString()+"\n";
        mensagem.setText(retorno);
    }

    //função para limpar campos
    private void limparCampos(){
        this.login.setText("");
        this.nome.setText("");
        this.quantidade.setText("");
        this.senha.setText("");
        this.telefone.setText("");
        this.id.setText("");
       
    }
    
    //função habilitar campo
    private void habilitarCampos(boolean opcao){
        this.login.setEditable(opcao);
        this.nome.setEditable(opcao);
        this.quantidade.setEditable(opcao);
        this.senha.setEditable(opcao);
        this.telefone.setEditable(opcao);
        this.id.setEditable(opcao); 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField chave;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField login;
    private javax.swing.JTextArea mensagem;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField quantidade;
    private javax.swing.JTextField senha;
    private javax.swing.JTextField telefone;
    // End of variables declaration//GEN-END:variables
}
