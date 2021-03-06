/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.controle_tabela;
import static dao.controle_tabela.salvar_para_arquivo;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Darian
 */
public class cadastroaluno extends javax.swing.JFrame {

    /**
     * Creates new form cadastroaluno
     */
    
    private String nomeCompleto;
    private String turma;
    private String idAluno;
    
    
    public cadastroaluno() {
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

        jPanel1 = new javax.swing.JPanel();
        CL = new javax.swing.JLabel();
        nomeL = new javax.swing.JLabel();
        nomeltxt = new javax.swing.JTextField();
        editoratxt = new javax.swing.JLabel();
        turmatxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        bntsl = new javax.swing.JButton();
        bntlmpdd = new javax.swing.JButton();
        sairbnt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bntat = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        cadastroRealizado = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setTitle("Cadastrar Aluno");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        CL.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        CL.setText("CADASTRAR ALUNO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(CL, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CL, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 710, 70));

        nomeL.setText("Nome completo");
        getContentPane().add(nomeL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));
        getContentPane().add(nomeltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 570, -1));

        editoratxt.setText("Turma / curso");
        getContentPane().add(editoratxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));
        getContentPane().add(turmatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 570, -1));

        jLabel3.setText("ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));
        getContentPane().add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 570, -1));

        bntsl.setForeground(new java.awt.Color(2, 138, 153));
        bntsl.setText("SALVAR");
        bntsl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntslActionPerformed(evt);
            }
        });
        getContentPane().add(bntsl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 160, -1));

        bntlmpdd.setForeground(new java.awt.Color(2, 138, 153));
        bntlmpdd.setText("LIMPAR DADOS");
        bntlmpdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntlmpddActionPerformed(evt);
            }
        });
        getContentPane().add(bntlmpdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 160, -1));

        sairbnt.setForeground(new java.awt.Color(2, 138, 153));
        sairbnt.setText("SAIR");
        sairbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairbntActionPerformed(evt);
            }
        });
        getContentPane().add(sairbnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Darian\\Downloads\\LOGO EP 3.png")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(460, 330));
        jLabel1.setMinimumSize(new java.awt.Dimension(460, 330));
        jLabel1.setPreferredSize(new java.awt.Dimension(460, 330));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 520, 440));

        bntat.setForeground(new java.awt.Color(2, 138, 153));
        bntat.setText("ATUALIZAR");
        getContentPane().add(bntat, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 100, -1));

        cadastroRealizado.setText("Tabela");
        cadastroRealizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroRealizadoActionPerformed(evt);
            }
        });

        jMenuItem1.setText("cadastroRealizado");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        cadastroRealizado.add(jMenuItem1);

        jMenuItem2.setText("cadastrarlivro");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        cadastroRealizado.add(jMenuItem2);

        jMenuBar1.add(cadastroRealizado);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairbntActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_sairbntActionPerformed

    private void cadastroRealizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroRealizadoActionPerformed
        cadastroRealizado cadastro = new cadastroRealizado(); 
        cadastro.setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_cadastroRealizadoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        cadastroRealizado cadastro = new cadastroRealizado(); 
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void bntlmpddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntlmpddActionPerformed
 limpardados("");        // TODO add your handling code here:
    }//GEN-LAST:event_bntlmpddActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         cadastrarlivro cadastro = new cadastrarlivro(); 
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void bntslActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntslActionPerformed
        try {
            // TODO add your handling code here:
            salvarDados();
            JOptionPane.showMessageDialog(null, "Documentos salvos com sucesso :>");
        } catch (IOException ex) {
            Logger.getLogger(cadastroaluno.class.getName()).log(Level.SEVERE, null, ex);
            
            
            
        }
    }//GEN-LAST:event_bntslActionPerformed

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
            java.util.logging.Logger.getLogger(cadastroaluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroaluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroaluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroaluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroaluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CL;
    private javax.swing.JButton bntat;
    private javax.swing.JButton bntlmpdd;
    private javax.swing.JButton bntsl;
    private javax.swing.JMenu cadastroRealizado;
    private javax.swing.JLabel editoratxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nomeL;
    private javax.swing.JTextField nomeltxt;
    private javax.swing.JButton sairbnt;
    private javax.swing.JTextField turmatxt;
    // End of variables declaration//GEN-END:variables

    
    public void salvarDados() throws IOException{
        
        nomeCompleto = nomeltxt.getText();
        turma = turmatxt.getText();
        idAluno = idTxt.getText();
        
        
        String textoSalvar = idAluno + " ; " + nomeCompleto + " ; " + turma;
        
        System.out.println(textoSalvar);
        salvar_para_arquivo(textoSalvar, "db/dbalunos.txt");
     }  
    
    
    
    // idAluno ; nomeCompleto ; turma
    
    private void limpardados(String string) {
        idTxt.setText("");
        turmatxt.setText("");
        nomeltxt.setText("");
    }
}
