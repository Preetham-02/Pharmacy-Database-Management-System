/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

/**
 *
 * @author user
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        pwd1 = new javax.swing.JPasswordField();
        cpwd = new javax.swing.JPasswordField();
        usr = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1500, 1000));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton3.setText("Check");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(230, 340, 100, 23);

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 300, 150, 23);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(310, 300, 150, 23);

        jTextField2.setEditable(false);
        jTextField2.setText("User_Name");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(130, 140, 125, 30);

        jTextField3.setEditable(false);
        jTextField3.setText("Password");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(130, 190, 125, 30);

        jTextField4.setEditable(false);
        jTextField4.setText("Confirm Password");
        getContentPane().add(jTextField4);
        jTextField4.setBounds(130, 240, 125, 30);
        getContentPane().add(pwd1);
        pwd1.setBounds(310, 180, 143, 40);

        cpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpwdActionPerformed(evt);
            }
        });
        getContentPane().add(cpwd);
        cpwd.setBounds(310, 230, 143, 40);
        getContentPane().add(usr);
        usr.setBounds(310, 130, 143, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/Images/register.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 560, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpwdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String url="jdbc:oracle:thin:@localhost:1521:XE";
        String user="preetham";
        String pwd="Preetham";
        
        String us=new String();
        String pass=new String();
        String cp=new String();
        
        us=usr.getText();
        pass=pwd1.getText();
        cp=cpwd.getText();
        if(us.equals("")||pass.equals("")||cp.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter data in the all the fields");
        }
        else{
            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection(url, user, pwd);
                Statement st=con.createStatement();
                String s="select * from register where user_name='"+us+"'";
                ResultSet rs=st.executeQuery(s);
                if(rs.next())
                {
                    JOptionPane.showMessageDialog(null, "User already Existed");
                }
                else
                {
                    Statement st_new=con.createStatement();
                    if(pass.equals(cp))
                    {
                        String ins="insert into register values('"+us+"','"+pass+"','"+cp+"')";
                        int rc=st_new.executeUpdate(ins);
                        JOptionPane.showMessageDialog(null, "Register Successful");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "password and confirm password does not match");
                    }
                }
            }catch(Exception e){}}
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Login().setVisible(true);  
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String url="jdbc:oracle:thin:@localhost:1521:XE";
        String user="preetham";
        String pwd="Preetham";
        
        String us=new String();
        
        us=usr.getText();  
        if(us.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter data in the all the fields");
        }
        else{
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection(url, user, pwd);
            Statement st=con.createStatement();
            String s="select * from register where user_name='"+us+"'";
           
            ResultSet rs=st.executeQuery(s);
            if(rs.next())
                {
                    JOptionPane.showMessageDialog(null, "User already Existed");
                }
            else
                JOptionPane.showMessageDialog(null, "User yet to be registered");

        }
        catch(Exception e)
        {
            //JOptionPane.showMessageDialog(null, "User already Existed");
            System.out.println(e);
        }
                }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cpwd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPasswordField pwd1;
    private javax.swing.JTextField usr;
    // End of variables declaration//GEN-END:variables
}