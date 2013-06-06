package cadastroapae;

import telas.JanelaPrincipal;
import java.awt.Dimension;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Olá amiguinhos, eu sou o Dollynho! :)");
        JanelaPrincipal f = new JanelaPrincipal();
        
        // fixar o tamanho da tela (não sei se é necessário)
        Dimension d = new Dimension(800, 600);
        f.setMinimumSize(d);
        //f.setMaximumSize(d);
        f.setPreferredSize(d);
        
        f.setLocationRelativeTo(null); // centraliza a janela no meio da tela
        f.setResizable(false); // sem redimensionamento
        f.setVisible(true); // mostra janela
    }
}
