import java.util.*;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class Carros {
  //Atributos
  String Marca;
  String Modelo;
  String Ano;
  String Cor;

  //construtor
public Carros(String marca, String modelo, String ano, String cor) {
    Marca = marca;
    Modelo = modelo;
    Ano = ano;
    Cor = cor;
}

//contrutor vazio
    public Carros(){}

    //get and set
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public String getAno() {
        return Ano;
    }
    public void setAno(String ano) {
        Ano = ano;
    }
    public String getCor() {
        return Cor;
    }
    public void setCor(String cor) {
        Cor = cor;
    }

    
 
}
