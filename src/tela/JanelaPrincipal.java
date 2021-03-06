/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import java.awt.event.WindowEvent;
import java.util.Iterator;
import modelo.*;

/**
 *
 * @author kanibal
 */
public class JanelaPrincipal extends javax.swing.JFrame
{

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        menuBar = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuItemLogin = new javax.swing.JMenuItem();
        menuItemExit = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuAjuda = new javax.swing.JMenu();
        menuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Cadastro APAE");
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });

        menuArquivo.setText("Arquivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Cadastrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuArquivo.add(jMenuItem1);

        menuItemLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        menuItemLogin.setText("Fazer login");
        menuItemLogin.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menuItemLoginActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemLogin);

        menuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        menuItemExit.setText("Sair");
        menuItemExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menuItemExitActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemExit);

        menuBar.add(menuArquivo);

        jMenu1.setText("Temp");
        menuBar.add(jMenu1);

        menuAjuda.setText("Ajuda");

        menuItemSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuItemSobre.setText("Sobre");
        menuAjuda.add(menuItemSobre);

        menuBar.add(menuAjuda);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemLoginActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuItemLoginActionPerformed
    {//GEN-HEADEREND:event_menuItemLoginActionPerformed
        JanelaLogin jLogin = new JanelaLogin();
        this.add(jLogin);
        jLogin.setVisible(true);
    }//GEN-LAST:event_menuItemLoginActionPerformed

    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuItemExitActionPerformed
    {//GEN-HEADEREND:event_menuItemExitActionPerformed
        //this.dispose();
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_menuItemExitActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem1ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem1ActionPerformed
        // Passos:
        //  1. Leia as informações da tela.
        //  2. Crie um novo objeto.
        //  3.Atribua as informações lidas no objeto criado.
        //  4. Chame o AppService do Objeto referenciado.
        //  5. Informe que 'everything went better than expected' :)
        //
        //  Em caso de erros, jogue uma exceção de Aplicação (pois há um erro lógico, e não físico)
        
        Paciente umPaciente = new Paciente("Paula", "Avenida Rio Branco", "2571.9541", new java.util.Date(), "Setor A", "TDAH");
        if ((new servico.PacienteAppService().inclui(umPaciente)) >= 0)
        {
            System.out.println("everything went better than expected");
            
            for (Iterator it = new util.BDUtil().getConnection().getListaDePacientes().iterator(); it.hasNext();)
            {
                Object object = it.next();
                System.out.println(object.toString());
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        System.out.println("Salvando as configurações...");
        if (new util.BDUtil().salvar())
        {
            System.out.println("Fechando App...");
        } else
        {
            System.out.println("Um erro estranho ocorreu. [Mysterious M]");
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        System.out.println("Bem vindo! :)");
        System.out.println("Carregando configurações...");
        if (new util.BDUtil().carregar())
        {
            System.out.println("Configurações carregadas!");
        } else
        {
            // Primeira vez que rodou e/ou não possui banco de dados
            System.out.println("Nenhuma configuração foi carregada pois, aparentemente, esta é sua primeira vez.");
            //System.out.println("Verifique suas configurações!");
        }
    }//GEN-LAST:event_formWindowOpened
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[])
//    {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try
//        {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
//            {
//                if ("Nimbus".equals(info.getName()))
//                {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex)
//        {
//            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex)
//        {
//            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex)
//        {
//            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex)
//        {
//            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable()
//        {
//            public void run()
//            {
//                new JanelaPrincipal().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemLogin;
    private javax.swing.JMenuItem menuItemSobre;
    // End of variables declaration//GEN-END:variables
}
