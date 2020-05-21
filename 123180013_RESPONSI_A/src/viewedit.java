import javax.swing.*;
import java.awt.*;


public class viewedit extends JFrame {


    JPanel panel = new JPanel();


    JLabel lTitle = new JLabel("PERPUSTAKAAN");
    JLabel lId = new JLabel("");
    JLabel lIdAnggota = new JLabel("ID Anggota  :");
    JLabel lNama = new JLabel("Nama  :");
    JLabel lIdBuku = new JLabel("ID Buku  :");
    JLabel lJudulBuku = new JLabel("Judul Buku  :");


    JTextField tfIdAnggota = new JTextField();
    JTextField tfNama = new JTextField();
    JTextField tfIdBuku = new JTextField();
    JLabel tfJudulBuku = new JLabel();


    JButton bBatal = new JButton("Batal");
    JButton bEdit = new JButton("Edit");


    public viewedit(){
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


        lId.setVisible(false);
        lTitle.setBounds(250, 50, 100,20);
        lIdAnggota.setBounds(180, 150, 100,20);
        lNama.setBounds(180, 200, 100,20);
        lIdBuku.setBounds(180, 250, 100,20);
        lJudulBuku.setBounds(180, 300, 100,20);


        tfIdAnggota.setBounds(280, 150, 150, 20);
        tfNama.setBounds(280, 200, 150, 20);
        tfIdBuku.setBounds(280, 250, 150, 20);
        tfJudulBuku.setBounds(280, 300, 150, 20);


        bBatal.setBounds(200, 350, 100, 20);
        bEdit.setBounds(320, 350, 100, 20);


        panel.add(lTitle);
        panel.add(lId);
        panel.add(lIdAnggota);
        panel.add(lNama);
        panel.add(lIdBuku);
        panel.add(lJudulBuku);
        panel.add(tfIdAnggota);
        panel.add(tfNama);
        panel.add(tfIdBuku);
        panel.add(tfJudulBuku);
        panel.add(bEdit);
        panel.add(bBatal);
    }


    public String getId(){
        return lId.getText();
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

