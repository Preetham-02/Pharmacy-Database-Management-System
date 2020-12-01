
import javax.swing.*;
import java.*;
import java.awt.*;
import java.awt.event.*;
public class login222 extends JFrame implements ActionListener {
    JTextField jt2,jpt2;
    login222()
    {
        setSize(400,400);
         setLayout(new FlowLayout());
         setTitle("login");
        
        setLayout(new BorderLayout());
        
        JLabel jb1=new JLabel("Pharmacy");
        add(jb1,BorderLayout.NORTH);
        JPanel jp=new JPanel(new GridLayout(3,2));
        JLabel jbl1=new JLabel("user name");
        jp.add(jbl1);
        JTextField jt1=new JTextField(20);
        jp.add(jt1);
        JLabel jl2=new JLabel("password");
        jp.add(jl2);
        jpt2=new JPasswordField(20);
        jp.add(jpt2);
        JButton jbu1=new JButton("submit");
        jp.add(jbu1);
        jbu1.addActionListener(this);
        JButton jbu2=new JButton("cancel");
        jp.add(jbu2);
        jbu2.addActionListener(this);
        add(jp, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }    
    public static void main(String args[])
    {
        new login222();
    }
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getActionCommand().equals("submit"))
        {
        new NextFrame();
        }
        else
        {
           jt2.setText(" ");
           jpt2.setText("");
        }
    }

    private static class NextFrame {

        public NextFrame() {
        }
    }
}