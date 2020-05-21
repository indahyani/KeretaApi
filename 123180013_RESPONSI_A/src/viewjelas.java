import javax.swing.*;
import java.awt.*;


public class viewjelas extends JFrame {


    JPanel panel = new JPanel();


    JLabel lTitle = new JLabel("PERPUSTAKAAN");
    JLabel lWelcome = new JLabel("ABOUT US");


    JButton bHome = new JButton("Home");
    JButton bPinjam = new JButton("Pinjam");
    JButton bTampil = new JButton("Tampil");
    JButton bAbout = new JButton("About Us");
    JButton bLogout = new JButton("Logout");


    public viewjelas(){
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


        lTitle.setBounds(250,100,100,20);
        lTitle.setVisible(true);
        lWelcome.setBounds(300,200,200,20);
        lWelcome.setVisible(true);
        bHome.setBounds(100,150,100,40);
        bPinjam.setBounds(100,200,100,40);
        bTampil.setBounds(100,250,100,40);
        bAbout.setBounds(100,300,100,40);
        bLogout.setBounds(450, 20, 100, 40);
        bLogout.setBackground(Color.red);
        bHome.setVisible(true);
        bPinjam.setVisible(true);
        bTampil.setVisible(true);
        bAbout.setVisible(true);


        panel.add(lTitle);
        panel.add(lWelcome);
        panel.add(bHome);
        panel.add(bPinjam);
        panel.add(bTampil);
        panel.add(bAbout);
        panel.add(bLogout);
    }
}

