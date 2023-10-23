package ListaDeExercicios.src;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TeclaDig {

    JFrame frame = new JFrame();

    public TeclaDig() {

        JPanel principal = new JPanel(new GridLayout(4, 1));

        JLabel teclaDig = new JLabel("Última tecla digitada:");
        JTextField exibirTecla = new JTextField(10);

        JLabel rotulo = new JLabel("Digite:");
        JTextField digite = new JTextField(10);

        JTextField exibirTexto = new JTextField(10);

        JTextField exibirTextoEspelhado = new JTextField(10);

        principal.add(teclaDig);
        principal.add(exibirTecla);
        principal.add(rotulo);
        principal.add(digite);
        principal.add(exibirTexto);
        principal.add(exibirTextoEspelhado);//att lista

        frame.add(principal);
        frame.setBounds(500, 500, 500, 500);
        frame.setVisible(true);
        exibirTecla.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                char typedKey = e.getKeyChar();
                exibirTecla.setText("Letra Digitada:"+ typedKey);
            }

            @Override
            public void keyPressed(KeyEvent e) {

                throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
                throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
            }
            
        });
    }
    public void run(){
        frame.setVisible(true);
    }
}
// ´pasta arq .java, vai para jdk cria um .class na pasta bin gera .jar que e lido por jvm
// turin.com
//mvc