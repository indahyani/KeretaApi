import javax.swing.*;
import java.awt.*;


public class viewlogin extends JFrame {


    JPanel panel = new JPanel();


    JLabel lLogin = new JLabel("LOGIN");
    JLabel lUsername = new JLabel("Username : ");
    JLabel lPassword = new JLabel("Password : ");


    JTextField tfUsername = new JTextField();
    JPasswordField tfPassword = new JPasswordField();


    JButton bLogin = new JButton("Login");
    JButton bDaftar = new JButton("Sign Up");
    JButton bExit = new JButton("Exit");


    public viewlogin(){
        setDefaultCloseOperation(3);
        setLocation(350, 100);
        setResizable(false);
        setVisible(false);
        setLayout(null);
        setSize(600, 500);
        setTitle("LOGIN PERPUSTAKAAN");


        panel.setBounds(0,0,600,500);
        panel.setBackground(Color.pink);
        panel.setBorder(BorderFactory.createLineBorder(Color.red));
        panel.setVisible(true);
        panel.setLayout(null);
        add(panel);


        lLogin.setBounds(300,100,100,20);
        lLogin.setVisible(true);
        lUsername.setBounds(180,200,90,20);
        lUsername.setVisible(true);
        lPassword.setBounds(180,250,90,20);
        lPassword.setVisible(true);
        tfUsername.setBounds(250,200,150,20);
        tfUsername.setVisible(true);
        tfPassword.setBounds(250,250,150,20);
        tfPassword.setVisible(true);
        bLogin.setBounds(190,350,100,20);
        bLogin.setVisible(true);
        bDaftar.setBounds(310,350,100,20);
        bDaftar.setVisible(true);
        bExit.setBounds(460, 20, 100, 20);
        bExit.setVisible(true);
        bExit.setBackground(Color.red);


        panel.add(lLogin);
        panel.add(lUsername);
        panel.add(lPassword);
        panel.add(tfUsername);
        panel.add(tfPassword);
        panel.add(bLogin);
        panel.add(bDaftar);
        panel.add(bExit);
    }


    public String getUsername() {
        return tfUsername.getText();
    }


    public String getPassword(){
        return tfPassword.getText();
    }
}
