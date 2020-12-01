/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;
import java.sql.*;

/**
 *
 * @author user
 */
public class Miniproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
    String url="jdbc:oracle:thin:@localhost:1521:xe";
    String user="preetham";
    String pwd="Preetham";
    Class.forName("oracle.jdbc.OracleDriver");
    Connection con=DriverManager.getConnection(url,user,pwd);
    }
    
}
