package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            Statement s;
            String usuario = "postgres";
            String senha = "postgres";
            String url = "jdbc:postgresql://localhost:5432/postgres";
            // se fosse outro banco seria mysql://localhost ou ip/nomde banco de dados
            Connection c = DriverManager.getConnection(url, usuario, senha);// sempre a mesma ordem
            //banco de redundancia

            //tem baixar o drive

            //dall
            s = c.createStatement();
            s.executeQuery("INSERT INTO CONTATO VALUES('2', 'Albertoo', 'alberto@gmail.com')");

            c.close();//fecha a conexão
        } catch (Exception e) {
System.out.println("Erro"  +  e.getLocalizedMessage());        }
    }
}
