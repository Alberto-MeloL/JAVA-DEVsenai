import javax.swing.JFrame;

public class JanelaPrincipal extends JFrame{
    public JanelaPrincipal() {
        super("Projeto");
        //add JtabbedPane a janela Principal
        this.add(new JanelaAbas());
        //set Frame
        this.pack();
        this.setDefaultCloseOperation(2);
        this.setVisible(true);
    }
    
}

