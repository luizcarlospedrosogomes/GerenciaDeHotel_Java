/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author LuizCarlos
 */
public class Banco {

    Connection con;
    String url = "jdbc:postgresql://127.0.0.1:5432/LOO_projeto";
    String usuario = "postgres";
    String senha = "sa";
    ResultSet dados;
    Statement sessao;

    public Banco() throws ClassNotFoundException, SQLException {
        conectar();
    }

    public void conectar() throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");
        con = DriverManager.getConnection(url, usuario, senha);
        

    }

    public ResultSet consulta(String sql) throws SQLException, ClassNotFoundException {
        this.sessao = con.createStatement();
        dados = sessao.executeQuery(sql);

        return dados;
    }


    public boolean status() {
        if (this.con != null) {
            return true;
        } else {
            return false;
        }
    }

}
