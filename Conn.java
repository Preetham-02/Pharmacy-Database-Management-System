package miniproject;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;


import javax.swing.JOptionPane;
public class Conn{
   public static Connection connectdb() {
    try{
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","preetham","Preetham");
        return con;
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    return null;
}
  public static void main(String args[]){
      new Login().setVisible(true);
  }


}

