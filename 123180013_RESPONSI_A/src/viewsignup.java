import javax.swing.*;
import java.awt.*;


public class viewsignup extends JFrame {


    JPanel panel = new JPanel();


    JLabel lTitle = new JLabel("SIGN UP");
    JLabel lUsername = new JLabel("Username  : ");
    JLabel lPassword = new JLabel("Password  : ");


    JTextField tfUsername = new JTextField();
    JTextField tfPassword = new JTextField();


    JButton bDaftar = new JButton("Daftar");
    JButton bBatal = new JButton("Batal");
    JButton bExit = new JButton("Exit");


    public viewsignup () {
        setDefaultCloseOperation(3);
        setLocation(350, 100);
        setResizable(false);
        setVisible(false);
        setLayout(null);
        setSize(600, 500);
        setTitle("PERPUSTAKAAN");


        panel.setBounds(0,0,600,500);
        panel.setBackground(Color.yellow);
        panel.setBorder(BorderFactory.createLineBorder(Color.white));
        panel.setVisible(true);
        panel.setLayout(null);
        add(panel);


        lTitle.setBounds(300,100,100,20);
        lTitle.setVisible(true);
        lUsername.setBounds(180,200,90,20);
        lUsername.setVisible(true);
        lPassword.setBounds(180,250,90,20);
        lPassword.setVisible(true);
        tfUsername.setBounds(250,200,150,20);
        tfUsername.setVisible(true);
        tfPassword.setBounds(250,250,150,20);
        tfPassword.setVisible(true);
        bDaftar.setBounds(190,350,100,20);
        bDaftar.setVisible(true);
        bBatal.setBounds(310,350,100,20);
        bBatal.setVisible(true);
        bExit.setBounds(460, 20, 100, 20);
        bExit.setVisible(true);
        bExit.setBackground(Color.red);


        panel.add(lTitle);
        panel.add(lUsername);
        panel.add(lPassword);
        panel.add(tfUsername);
        panel.add(tfPassword);
        panel.add(bDaftar);
        panel.add(bBatal);
        panel.add(bExit);
    }


    public String getUsername() {
        return tfUsername.getText();
    }


    public String getPassword(){
        return tfPassword.getText();
    }
}
