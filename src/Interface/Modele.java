package Interface;
import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;

import static java.lang.System.exit;

public class Modele {

    public Connection seConnecter(String url, String user, String password) throws SQLException{
        java.sql.Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
        }

        catch(ClassNotFoundException e){
            System.out.println("Erreur lors des chargements" + e.getMessage());
            exit(0);
        }
        return conn;
    }

    public ResultSet traiterRequete(String req) throws SQLException{
        Statement stmt =null;
        java.sql.Connection connexion = null;
        ResultSet result = null;
        try{
            String url = "jdbc:mysql://localhost:3306/bddgraph";
            String user = "root";
            String password = "";
            connexion = this.seConnecter(url, user, password);
            stmt =(Statement) connexion.createStatement();
            result = stmt.executeQuery(req);
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    public void RempliCombo3(JComboBox<String> combo, String req)throws SQLException{
        Statement stmt = null;
        java.sql.Connection connexion = null;

        try{
            String url = "jdbc:mysql://localhost:3306/bddgraph";
            String user = "root";
            String password = "";

            connexion = this.seConnecter(url, user, password);
            stmt = (Statement) connexion.createStatement();
            ResultSet result = stmt.executeQuery(req);

            while(result.next()){
                combo.addItem(result.getString(1));
            }
            connexion.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public int verifLogin(String req) throws SQLException{
        Statement stmt = null;
        java.sql.Connection connexion = null;
        int nombre = 0;

        try{
            String url = "jdbc:mysql://localhost:3306/bddgraph";
            String user = "root";
            String password = "";

            System.out.println(nombre);
            connexion =  this.seConnecter(url, user, password);

            stmt = connexion.createStatement();
            ResultSet result = stmt.executeQuery(req);

            while(result.next()){
                nombre = result.getInt(1);

            }
        }
        catch (SQLException e){
            System.out.println("Connexion erreur");

        }
        return nombre;
    }

}