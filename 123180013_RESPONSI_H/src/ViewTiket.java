
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class ViewTiket extends JFrame {
    
   
    JLabel lNama = new JLabel("Nama  ");
    JTextField tfNama = new JTextField();
    
    JLabel lGender = new JLabel("Jenia Kelamin ");
    String[] nGender = {"--Pilih--","Laki-laki", "Perempuan"};
    JComboBox cmbGender= new JComboBox(nGender);
    
    JLabel lStasiun = new JLabel("Stasiun Tujuan ");
    String[] nStasiun = {"--Pilih--","Tugu Jogja", "Lempuyangan", "Maguwo"};
    JComboBox cmbStasiun= new JComboBox(nStasiun);
    
    JLabel lKereta = new JLabel("Kereta ");
    String[] nKereta = {"--Pilih--","Ketandan", "Mulia","Premekx","Surya jaya"};
    JComboBox cmbKereta= new JComboBox(nKereta);
    
    
    JButton btnTambahPanel = new JButton("Tambah");
    JButton btnBatalPanel = new JButton("Batal");
    
    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;  //buat scroll
    Object namaKolom[] = {"Nama","Jenis Kelamin","Stasiun","Kereta"}; //membuat kolom dalam array


    
    
    ViewTiket(){
        
        tableModel = new DefaultTableModel(namaKolom, 0); //0 baris
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("TUTUTUUTT");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(700, 600);
        
         //TABEL
        add(scrollPane);
        scrollPane.setBounds(30, 235, 580, 300);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        add(lNama);
        add(tfNama);
        add(lGender);
        add(cmbGender);
        add(lStasiun);
        add(cmbStasiun);
        add(lKereta);
        add(cmbKereta);
        
        
        lNama.setBounds(35,50,170,20);
        tfNama.setBounds(140, 50,170,20);
        lGender.setBounds(35, 80, 170, 20);
        cmbGender.setBounds(140, 80, 170, 20);
        lStasiun.setBounds(35, 120, 170, 20);
        cmbStasiun.setBounds(140, 120, 170, 20);
        lKereta.setBounds(35, 160, 160, 20);
        cmbKereta.setBounds(140, 160, 170, 20);
        
        add(btnTambahPanel);
        add(btnBatalPanel);
        
        btnTambahPanel.setBounds(350, 50, 90, 25);
        btnBatalPanel.setBounds(350, 90, 90, 25);
        
    }
    
    public String getNama() {
        return tfNama.getText();
    }
    
    public String getGender() {
        if (cmbGender.getSelectedItem().equals("--Pilih--")) {
            return "";
        } else {
            return (String) cmbGender.getSelectedItem();
        }
    }
    
     public String getStasiun() {
        if (cmbStasiun.getSelectedItem().equals("--Pilih--")) {
            return "";
        } else {
            return (String) cmbStasiun.getSelectedItem();
        }
    }
     
     public String getKereta() {
        if (cmbKereta.getSelectedItem().equals("--Pilih--")) {
            return "";
        } else {
            return (String) cmbKereta.getSelectedItem();
        }
    }
}
