package GUILayout.src;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class ExemploGridLayout extends JFrame{//transformando a classe em uma janela
    public ExemploGridLayout() {
        super("Janela Principal");

        //Um JPanel
        JPanel painel = new JPanel();
        this.add(painel);
        //modificar o Layout do painel(JPanel) flow-> Grid
        GridLayout grid = new GridLayout(4, 4); //16
        painel.setLayout(grid);
        String valores[] = {"7","8","9","x","4","5","6","-","3","2","1","+","/","0",".","="};
        //Add dos componentes ao JPanel
        for (int i = 0; i < valores.length; i++) {//O painel ele readequa, o frame nao, ele sobrepoe
            painel.add(new JButton(""+valores[i]));
        }
        
        //set do frame
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
