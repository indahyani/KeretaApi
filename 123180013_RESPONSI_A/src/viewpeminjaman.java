import javax.swing.*;
import java.awt.*;


public class viewpeminjaman extends JFrame {


    JPanel panelKiri = new JPanel();
    JPanel panelKanan = new JPanel();


    JLabel lTitle = new JLabel("PERPUSTAKAAN");
    JLabel lIdAnggota = new JLabel("ID Anggota  : ");
    JLabel lNama = new JLabel("Nama  : ");
    JLabel lIdBuku = new JLabel("ID Buku  : ");
    JLabel lJudulBuku = new JLabel("Judul Buku  : ");


    JTextField tfIdAnggota = new JTextField();
    JTextField tfNama = new JTextField();
    JTextField tfIdBuku = new JTextField();
    JTextField tfJudulBuku = new JTextField();


    JButton bHome = new JButton("Home");
    JButton bPinjam = new JButton("Pinjam");
    JButton bTampil = new JButton("Tampil");
    JButton bAbout = new JButton("About Us");
    JButton bTambah = new JButton("Tambah");
    JButton bBatal = new JButton("Batal");
    JButton bLogout = new JButton("Logout");


    public viewpeminjaman (){
        setDefaultCloseOperation(3);
        setLocation(350, 100);
        setResizable(false);
        setVisible(false);
        setLayout(null);
        setSize(600, 500);
        setTitle("PERPUSTAKAAN");


        panelKiri.setBounds(0,0,400,500);
        panelKiri.setBackground(Color.yellow);
        panelKiri.setBorder(BorderFactory.createLineBorder(Color.white));
        panelKiri.setVisible(true);
        panelKiri.setLayout(null);
        add(panelKiri);


        panelKanan.setBounds(400,0,200,500);
        panelKanan.setBackground(Color.yellow);
        panelKanan.setBorder(BorderFactory.createLineBorder(Color.white));
        panelKanan.setVisible(true);
        panelKanan.setLayout(null);
        add(panelKanan);


        lTitle.setBounds(150,100,100,20);
        lIdAnggota.setBounds(80,150,100,20);
        lNama.setBounds(80,200,100,20);
        lIdBuku.setBounds(80,250,100,20);
        lJudulBuku.setBounds(80,300,100,20);


        tfIdAnggota.setBounds(180,150,150,20);
        tfNama.setBounds(180,200,150,20);
        tfIdBuku.setBounds(180,250,150,20);
        tfJudulBuku.setBounds(180,300,150,20);


        bTambah.setBounds(150,350,100,20);
        bBatal.setBounds(270,350,100,20);
        bHome.setBounds(50,150,100,40);
        bPinjam.setBounds(50,200,100,40);
        bTampil.setBounds(50,250,100,40);
        bAbout.setBounds(50,300,100,40);
        bLogout.setBounds(50, 20, 100, 40);
        bLogout.setBackground(Color.red);


        panelKiri.add(lTitle);
        panelKiri.add(lIdAnggota);
        panelKiri.add(lNama);
        panelKiri.add(lIdBuku);
        panelKiri.add(lJudulBuku);
        panelKiri.add(tfIdAnggota);
        panelKiri.add(tfNama);
        panelKiri.add(tfIdBuku);
        panelKiri.add(tfJudulBuku);
        panelKiri.add(bTambah);
        panelKiri.add(bBatal);


        panelKanan.add(bHome);
        panelKanan.add(bPinjam);
        panelKanan.add(bTampil);
        panelKanan.add(bAbout);
        panelKanan.add(bLogout);
    }


    public String getIdAnggota(){
        return tfIdAnggota.getText();
    }


    public String getNama(){
        return tfNama.getText();
    }


    public String getIdBuku(){
        return tfIdBuku.getText();
    }


    public String getJudulBuku(){
        return tfJudulBuku.getText();
    }
}

