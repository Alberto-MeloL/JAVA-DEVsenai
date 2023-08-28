import javax.swing.*;
import java.awt.*;
public class ExemploFlowLayout {
   public ExemploFlowLayout() {
    super();
    JFrame janela1 = new JFrame();
    FlowLayout flow = new FlowLayout();
    janela1.setLayout(flow);
    JLabel texto1 = new JLabel("Informe o número de botões");
    JTextField painel1 = new JTextField("Insira o número de colunas");
    JButton botao1 = new JButton("Enviar");
    janela1.add(texto1);
    janela1.add(painel1);
    janela1.add(botao1);
    janela1.setDefaultCloseOperation(2);
    janela1.pack();
    janela1.setVisible(true);
   
   } 
}
