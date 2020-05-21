
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;


public class ViewKereta extends JFrame {
    
    
    JLabel lId = new JLabel("ID kereta  ");
    JTextField tfId = new JTextField();
    
    JLabel lNama = new JLabel("Nama kereta  ");
    JTextField tfNama = new JTextField();
    
    JLabel lKelas = new JLabel("Kelas  ");
    JTextField tfKelas = new JTextField();
    
    
    
    JButton btnTambahPanel = new JButton("Tambah");
    JButton btnEditPanel = new JButton("Edit");
    JButton btnHapusPanel = new JButton("Hapus");
    JButton btnBatalPanel = new JButton("Batal");
    
    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;  //buat scroll
    Object namaKolom[] = {"Id Kereta", "Nama Kereta", "Kelas"}; //membuat kolom dalam array


    
    
    public ViewKereta(){
        
        tableModel = new DefaultTableModel(namaKolom, 0); //0 baris
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("TUTUTUTUUTTU");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(700, 600);
        
         //TABEL
        add(scrollPane);
        scrollPane.setBounds(30, 235, 580, 300);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        add(lId);
        add(tfId);
        add(lNama);
        add(tfNama);
        add(lKelas);
        add(tfKelas);
       
        
        lId.setBounds(35,50,170,20);
        tfId.setBounds(140, 50,170,20);
        lNama.setBounds(35,90,170,20);
        tfNama.setBounds(140, 90,170,20);
        lKelas.setBounds(35,130,170,20);
        tfKelas.setBounds(140, 130,170,20);
       
        
        add(btnTambahPanel);
        add(btnEditPanel);
        add(btnHapusPanel);
        add(btnBatalPanel);
        
        btnTambahPanel.setBounds(350, 50, 90, 25);
        btnEditPanel.setBounds(350, 90, 90, 25);
        btnHapusPanel.setBounds(350, 130, 90, 25);
        btnBatalPanel.setBounds(350, 170, 90, 25);
        
    }
    
     public String getId() {
        return tfId.getText();
    }
     
      public String getNama_kereta() {
        return tfNama.getText();
    }
      
      
       public String getKelas() {
        return tfKelas.getText();
    }
}
