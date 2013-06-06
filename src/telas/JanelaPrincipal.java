/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

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
        menuItemLogin = new javax.swing.JMenuItem();
        menuItemExit = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Cadastro APAE");

        menuArquivo.setText("Arquivo");

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
        this.dispose();
    }//GEN-LAST:event_menuItemExitActionPerformed

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
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemLogin;
    private javax.swing.JMenuItem menuItemSobre;
    // End of variables declaration//GEN-END:variables
}
