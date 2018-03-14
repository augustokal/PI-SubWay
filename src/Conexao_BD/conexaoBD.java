/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao_BD;

import com.sun.corba.se.spi.orbutil.fsm.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Augusto Kalel
 */
public class conexaoBD {

    public static Connection conectar() throws Exception {

        String url = "jdbc:postgresql://localhost:5432/Banco_Subway";
        String usuario = "postgres";
        String senha = "admin";

        Class.forName("org.postgresql.Driver");
        System.out.println("Conexão realizada com sucesso.");
        return DriverManager.getConnection(url, usuario, senha);

    }
}
